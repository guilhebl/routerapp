package tccrouter.user.algorithms;

import tccrouter.diamante.core.command.Algorithm;
import tccrouter.diamante.core.graph.Graph;
import tccrouter.diamante.core.util.OutputSender;
import tccrouter.gbl.common.entity.ExecutionTrace;
import tccrouter.gbl.common.entity.TSProblemModel;
import tccrouter.gbl.common.util.ColorUtil;
import tccrouter.gbl.tsp.neural.ElasticNet;

public class TSPElasticNeuralNet extends Algorithm {

	/**
	 * Reference to the ExecutionTrace object to measure execution performance
	 */
    ExecutionTrace executionTrace;
    boolean measureExecution;
		
	// main class
	private static ElasticNet elasticNet;

		/**
		 * Creates an instance of this algorithm. Following the GraphEditor standard for algorithm parameters, the first parameter should always be a graph, followed by the nodes that the algorithm requires.
		 * 
		 * @param g
		 *            the graph on which the algorithm will be run
		 * @param start
		 *            the starting node of the depth search
		 */
		public TSPElasticNeuralNet(Graph g) {
			super(g,"TSP Elastic Neural Net");
			TSProblemModel.getInstance().resetAdvancedStructures(g);			
			elasticNet = new ElasticNet ();
			measureExecution = TSProblemModel.getInstance().isExecutionMeasure();
			if ( measureExecution) {
				executionTrace = ExecutionTrace.getInstance();
			}			
		}

		/**
		 * @see diamante.core.command.Command#execute()
		 */
		public void execute() {	    

			if ( measureExecution) {
				executionTrace.initialTrace();
			}
			
          int temp[] = elasticNet.iterate( 
        		  TSProblemModel.getInstance().getMaxGenerations() );	          
		      
				/*
				 * final time captured
				 */		
			if ( measureExecution) {
				executionTrace.finalTrace();
			}
			
			// colors the resulting best path found
			ColorUtil.colorPath(g,temp);
			
			// Shows a reply message with the label and time of execution
			OutputSender.showMessageDialog(
				"Total execution Time: "+
					executionTrace.getFinalTime() + " ms",
				"Measured Time",
				OutputSender.INFORMATION_MESSAGE
			);
			}					
	}
