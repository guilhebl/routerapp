/* 
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  - Redistributions of source code must retain the above copyright notice,
 * 	  this list of conditions and the following disclaimer.
 *  - Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *  - Neither the name of the Rin'G Project nor the names of its contributors
 *    may be used to endorse or promote products derived from this software
 *    without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE 
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE 
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN
 * IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package tccrouter.ring.controller;

import javax.swing.JOptionPane;

import tccrouter.diamante.core.command.Command;
import tccrouter.diamante.core.graph.Edge;
import tccrouter.diamante.core.graph.Graph;
import tccrouter.diamante.core.graph.GraphComponent;
import tccrouter.diamante.core.graph.Node;
import tccrouter.diamante.core.graph.SimpleNode;
import tccrouter.diamante.core.graph.property.ComponentProperties;
import tccrouter.diamante.extension.graph.property.ID;
import tccrouter.ring.gui.UIFacade;

/**
 * Responsible for coordinating the work of specific controllers in order
 * to give the graph editor a communication point to the diamante framework.
 */
public class DiamanteFacade {
	
	/**
	 * The unique instance to this class.
	 */
    static DiamanteFacade instance;
    /**
     * The latest node selected by the user in the workspace. Used by
     * the algorithm execution threads to get user input.
     */
    int selectedNode;
    /**
     * 
     */
    private UIFacade uiFacade = UIFacade.getInstance();

	/**
	 * Creates an instance to this class.
	 */
    protected DiamanteFacade () {
        selectedNode = -1;
    }

	/**
	 * Retrieves the unique instance to this class.
	 * @return the instance to this class
	 */
    public static DiamanteFacade getInstance () {
        if (instance == null) instance = new DiamanteFacade();
        
        return instance;
    }

	/**
	 * Requests to the command controller to create an add node command
	 * and execute it.
	 * @param properties the properties of the new node
	 */
    public void addNode (ComponentProperties properties){
        CommandController controller = CommandController.getInstance();
        
        controller.addNode(properties);
        controller.execute();
    }

	/**
	 * Requests to the command controller to create an add edge command
	 * and execute it.
	 * @param v1 the starting node of the new edge
	 * @param v2 the final node of the new edge
	 * @param properties the properties of the new edge
	 */    
    public void addEdge (int v1, int v2, ComponentProperties properties){
		CommandController controller = CommandController.getInstance();
        
		controller.addEdge(v1,v2,properties);
		controller.execute();
    }
    
    /**
     * Requests to the command controller to add a new command and execute it.
     * @param command the new command to be executed
     */
    public void executeCommand (Command command) {
    	try {
			CommandController controller = CommandController.getInstance();
			
			controller.addCommand(command);
			controller.execute();
		} catch (IllegalArgumentException exc) {
			JOptionPane.showMessageDialog(
				null,
				exc.getMessage(),
				"Command error",
				JOptionPane.ERROR_MESSAGE
			);
		}
    }
    
	/**
	 * Requests to the command controller to create a remove node command
	 * and execute it.
	 * @param i the index of the node to be removed
	 */    
    public void removeNode (int i){
		CommandController controller = CommandController.getInstance();
        
		controller.removeNode(i);
		controller.execute();
    }
    
    /**
     * Requests to the command controller to create an remove edge command
	 * and execute it.
     * @param v1
     * @param v2
     */
    public void removeEdge (int v1, int v2){
		CommandController controller = CommandController.getInstance();
        
		controller.removeEdge(v1,v2);
		controller.execute();
    }
    
    /**
     * Requests to the command controller to unexecute the latest command.
     */
    public void undo () {
    	CommandController.getInstance().undo();
    }

	/**
	 * Requests to the command controller to re-execute the next command.
	 */    
    public void redo () {
    	CommandController.getInstance().redo();
    }
    
    /**
     * Executes the next command.
     */
    public void execute () {
    	CommandController.getInstance().execute();
    }

	/**
	 * Executes an algorithm.
	 * @param algName the name of the algorithm to be executed
	 * @param g the graph on which the algorithm will be executed
	 */
	public void executeAlgorithm(String algName, Graph g) {
		AlgorithmController.getInstance().execute(algName,g);
	}

	/**
	 * Adds an algorithm to the algorithm controller.
	 * @param fileName the name of the algorithm's '.class' file
	 */
	public void addAlgorithm(String fileName) {
		AlgorithmController.getInstance().addAlgorithm(fileName);
	}

	/**
	 * Informs the GUI that an algorithm has requested a node.
	 */
	public void requestNode() {
		selectedNode = -1;
		
		UIFacade.getInstance().requestNode();
	}

	/**
	 * Informs the GUI that an algorithm has stoped requesting nodes.
	 */
	public void stopRequestNodes() {
		selectedNode = -1;
		
		UIFacade.getInstance().stopRequestNodes();
	}
	
	/**
	 * Saves the node index selected by the user on a local variable so
	 * that the algorithm execution thread can retrieve it.
	 * @param n the index of the selected node
	 */
	public void fireNodeSelected(int n) {
		selectedNode = n;
	}
	
	/**
	 * Used to check whether or not a node has already been selected by the user.
	 * @return the node index if one has been selected, -1 otherwise.
	 */
	public int checkSelectedNode() {
		return selectedNode;
	}
	
	/**
	 * Retrieves the node in the active graph with the given id.
	 * @param id the node id
	 * @return the requested Node if it is found, null otherwise
	 */
	public Node getNode(int id) {
		return uiFacade.getGraph().getNode(id);
	}

	/**
	 * Retrieves and edge in the active graph with the given starting and final
	 * nodes
	 * @param n1 the starting node of the edge
	 * @param n2 the final node of the edge
	 * @return the Edge if it is found, null otherwise
	 */
	public GraphComponent getEdge(int n1, int n2) {
		return uiFacade.getGraph().getEdge(n1,n2);
	}

	/**
	 * @param node
	 */
	public void removeNode(SimpleNode node) {
		this.removeNode(
				((ID) node.getProperties().getPropertyByName("ID")).getValue()
		);
	}

	/**
	 * @param edge
	 */
	public void removeEdge(Edge edge) {
		this.removeEdge(
				edge.getV1(),
				edge.getV2()
		);
	}
}