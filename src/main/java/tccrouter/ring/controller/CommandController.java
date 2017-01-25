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

import tccrouter.diamante.core.command.Command;
import tccrouter.diamante.core.graph.Graph;
import tccrouter.diamante.core.graph.property.ComponentProperties;
import tccrouter.diamante.extension.command.graphcommand.CreateEdge;
import tccrouter.diamante.extension.command.graphcommand.CreateNode;
import tccrouter.diamante.extension.command.graphcommand.RemoveEdge;
import tccrouter.diamante.extension.command.graphcommand.RemoveNode;
import tccrouter.ring.gui.UIFacade;

/**
 * Implements the control of operations on commands, such as inclusion,
 * execution and unexecution.
 */
class CommandController {
	
	/**
	 * The unique instance to this class.
	 */
    static CommandController instance;
    private UIFacade uiFacade = UIFacade.getInstance();

	/**
	 * Creates an instance to this class.
	 */
    protected CommandController () {}

	/**
	 * Retrieves the unique instance to this class.
	 * @return the instance to this class
	 */
    public static CommandController getInstance () {
        if (instance == null) instance = new CommandController();
        
        return instance;
    }

	/**
	 * Creates a command to add a node to the active graph.
	 * @param properties the properties of the new node
	 */
    public void addNode (ComponentProperties properties) {
    	Graph g = uiFacade.getGraph();
        CreateNode newCmd = new CreateNode(g,properties);
        
        g.addCommand(newCmd);
    }
    
    /**
     * Creates a command to add an edge to the active graph.
     * @param v1 the starting node of the new edge
     * @param v2 the final node of the new edge
     * @param properties the properties of the new edge
     */
    public void addEdge (int v1, int v2, ComponentProperties properties) {
		Graph g = uiFacade.getGraph();
		CreateEdge newCmd = new CreateEdge(g,v1,v2,properties);
		
		g.addCommand(newCmd); // -AQUI- debugar cria��o de aresta
    }
    
    /**
     * Creates a command to remove a node from the active graph.
     * @param i the index of the node to be removed
     */
    public void removeNode (int i) {
		Graph g = uiFacade.getGraph();
		RemoveNode newCmd = new RemoveNode(g,i);
		
		g.addCommand(newCmd);
    }
    
    /**
     * Creates a command to remove an edge from the active graph.
     * @param v1 the starting node of the edge
     * @param v2 the final node of the edge
     */
    public void removeEdge (int v1, int v2) {
		Graph g = uiFacade.getGraph();
		RemoveEdge newCmd = new RemoveEdge(g,v1,v2);
		
		g.addCommand(newCmd);
    }
    
    /**
     * Executes the next command in the active graph's commands list.
     */
    public void execute () {
    	Graph g = uiFacade.getGraph();
		
    	// Retrieve the command pointer
    	int i = g.getCurrentCommand();
    	Command cmd = g.getCommand(i);
    	
    	// Execute the algorithm and update the commands list pointer and the GUI
		if (cmd != null) {
    		cmd.execute();
	    	
			g.setCurrentCommand(i+1);
			
	    	// TODO clear the commands list after the executed command's index
	    	
	    	uiFacade.refreshViews();
	    	uiFacade.setStatusMessage(" ");
		}
    }
    
    /**
     * Unexecutes the command last executed command in the active graph's commands
     * list.
     */
    public void undo () {
    	Graph g = uiFacade.getGraph();
    	
    	// Retrieve the command index
    	int i = g.getCurrentCommand();
		Command cmd = g.getCommand(i);
		
		/*
		 * Unexecute the command, re-set the commands list pointer and
		 * update the GUI
		 */
		if (i > 0) {
		    if (cmd != null) {
			   	cmd.unexecute();
			   	if (i != 0)
			   		g.setCurrentCommand(i-1);
				uiFacade.refreshViews();
				uiFacade.setStatusMessage(" ");
		    }
	    }
	    else {
	    	uiFacade.setStatusMessage("There are no more commands to be undone.");
	    }
    }
    
    /**
     * Re-executes the next command in the commands list. This is used if some
     * commands have been unexecuted an the user wishes to re-execute them.
     */
    public void redo () {
    	Graph g = uiFacade.getGraph();
    	
    	/*
    	 * Retrieve the commands list pointer, re-execute the command and
    	 * update the GUI
    	 */
    	int i = g.getCurrentCommand();
    	Command cmd = g.getCommand(i+1);
    	if (cmd != null) {
    		cmd.execute();
    		g.setCurrentCommand(i+1);
    		
    		uiFacade.refreshViews();
    		uiFacade.setStatusMessage(" ");
    	}
    	else {
    		uiFacade.setStatusMessage("There are no more commands to be redone.");
    	}
    }

	/**
	 * Add a new command to the active graph's commands list.
	 * @param command the new command to be added
	 */
	public void addCommand(Command command) {
		Graph g = uiFacade.getGraph();
		
		g.addCommand(command);
	}
}