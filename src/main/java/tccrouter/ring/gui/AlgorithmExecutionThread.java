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
package tccrouter.ring.gui;

import java.lang.reflect.Constructor;

import tccrouter.diamante.core.command.Algorithm;
import tccrouter.diamante.core.graph.Graph;
import tccrouter.diamante.core.util.AlgorithmStarter;
import tccrouter.gbl.common.entity.TSProblemModel;
import tccrouter.gbl.common.util.ColorUtil;
import tccrouter.ring.controller.AlgorithmController;
import tccrouter.ring.gui.event.AlgorithmObserver;
import tccrouter.ring.gui.event.WorkspaceObserver;
import tccrouter.ring.gui.graphdrawing.GraphWorkspace;


/**
 * The thread responsible for executing an algorithm, which makes it
 * possible for the input of parameters while the other parts of the
 * program remain functional.
 */
public class AlgorithmExecutionThread
	implements Runnable,WorkspaceObserver {
	
	/**
	 * Name of the algorithm to be run.
	 */
	String algName;
	/**
	 * The graph on which the algorithm will be run.
	 */
	Graph g;
	/**
	 * The workspace in which the execution is being shown.
	 */
	GraphWorkspace workspace;
	/**
	 * The index of a node selected in the workspace so that it can be used
	 * as a parameter for the algorithm.
	 */
	int selectedNode = -1;
	
	/**
	 * The flag that transmits the end of node selection in the workspace.
	 */
	boolean endNodeSelection;
	
	/**
	 * The listener that will be notified of events that happen in this
	 * algorithm execution thread.
	 */
	AlgorithmObserver algorithmListener;
	/**
	 * 
	 */
	Algorithm algorithmInstance;
	/**
	 * Creates the execution thread.
	 * @param algName name of the algorithm to be run
	 * @param g graph on which the algorithm will be run
	 */
	public AlgorithmExecutionThread (String algName,Graph g,GraphWorkspace workspace,AlgorithmObserver listener) {
		this.algName           = algName;
		this.g                  = g;
		this.workspace          = workspace;
		this.algorithmListener = listener;
		
		workspace.setMode(GraphWorkspace.NODE);
	}
	
	/**
	 * Analyses the algorithm via reflection and requests its parameters
	 * accordingly, executing the algorithm after all parameters have been
	 * entered by the user.
	 */
	public void run () {
		AlgorithmController controller = AlgorithmController.getInstance();
		Class algorithm = ((Class) controller.algorithms.get(algName));
		Constructor [] constructors = algorithm.getConstructors();
		Object[] parameters;
		int pCount = constructors[0].getParameterTypes().length;

		/*
		 * Request the algorithm constructor's parameters. The first
		 * parameters is always the graph; the following ones will be
		 * nodes entered via mouse click by the user.
		 */
		parameters = new Object [pCount];
		parameters[0] = g;
				
		endNodeSelection = false;
		/*
		 * data set model for input of the problem
		 */
		TSProblemModel tModel = TSProblemModel.getInstance();
		tModel.reset();
		
		workspace.setListener(this);
		workspace.setEditable(true);

		/*
		 * request the source node for the transportation problem.
		 */
		workspace.requestNode(true);
			
			// Wait for a node to be input by the user
			try {
				while(selectedNode == -1)
					Thread.sleep(500);
			}
			catch (InterruptedException exc) {}
			
		System.out.println("Algorithm execution thread running: " + Thread.currentThread().getName());
			
		// Add the latest input node to the algorithm parameters
		tModel.setSourceNodeIndex(selectedNode);

		// change color of source node
		ColorUtil.setSourceNodeColor(g, selectedNode);
		workspace.refresh();

		selectedNode = -1;

		/*
		 * request the destiny nodes for the transportation problem.
		 */		
		while (!endNodeSelection) {
			workspace.requestNode(false);
			
			// Wait for a node to be input by the user
			try {
				while(selectedNode == -1 && !endNodeSelection)
					Thread.sleep(500);
			}
			catch (InterruptedException exc) {
				System.out.println("Interrupted Algorithm execution thread running: " + Thread.currentThread().getName());
			}
			
			// Add the latest input node to the algorithm parameters			
			tModel.addClient(selectedNode);
			// change color of client node
			ColorUtil.setClientNodeColor(g, selectedNode);
			workspace.refresh();
			
			selectedNode = -1;
		}
		workspace.setEditable(false);
		
		try {
			// Create an instance of the algorithm class
			Object instance = constructors[0].newInstance(parameters);

			// Notifies the execution listener that the execution is started
			fireAlgorithmStarted((Algorithm) instance);
			
			// Request an AlgorithmStarter to execute the algorithm
			AlgorithmStarter starter = AlgorithmStarter.getInstance();
			starter.start((Algorithm)instance);
			
			// Notifies the execution listener that the execution is finished
			fireAlgorithmFinished((Algorithm) instance);
			
			workspace.refresh();
		}
		catch (final Exception exc) {
			/*OutputSender.showMessageDialog(
				"The execution of your algorithm has caused the following exception:\n" +
				exc.getMessage(),
				"Algorithm loader",
				JOptionPane.ERROR_MESSAGE
			);*/
			/*OutputSender.showMessageDialog(
					 message,
					 "Algorithm execution error",
					 OutputSender.ERROR_MESSAGE
			);*/
//			AlgorithmErrorDialog.getInstance().showErrorMessage(exc);
			exc.printStackTrace();
			algorithmListener.exceptionRaised(exc);
		}
	}

	/**
	 * 
	 */
	private void fireAlgorithmStarted(Algorithm alg) {
		if (algorithmListener != null)
			algorithmListener.algorithmStarted(alg);
	}

	/**
	 * 
	 */
	private void fireAlgorithmFinished(Algorithm alg) {
		if (algorithmListener != null)
			algorithmListener.algorithmFinished(alg);
	}

	/**
	 * @see ring.gui.event.WorkspaceObserver#nodeSelected(int)
	 */
	public void nodeSelected(int i) {
		selectedNode = i;
	}
	
	/**
	 * @see ring.gui.event.WorkspaceObserver#endNodeSelection()
	 */
	public void endNodeSelection() {
		endNodeSelection = true;
	}
	
	public Algorithm getAlgorithmInstance() {
		return algorithmInstance;
	}
}