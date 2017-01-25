package tccrouter.user.algorithms;

import tccrouter.diamante.core.command.Algorithm;
import tccrouter.diamante.core.graph.Graph;
import tccrouter.diamante.core.util.OutputSender;
import tccrouter.gbl.common.entity.TSProblemModel;
import tccrouter.gbl.common.util.ColorUtil;
import tccrouter.gbl.tsp.neural.BoltzmannMachine;

public class TSPBoltzmannMachine extends Algorithm {

	/*
	 * Total time in miliseconds for measure.
	 */
	long totalTime;
	
	// main class
	private static BoltzmannMachine boltzmannMachine;

	/**
	 * Creates an instance of this algorithm. Following the GraphEditor standard for algorithm parameters, the first parameter should always be a graph, followed by the nodes that the algorithm requires.
	 * 
	 * @param g
	 *            the graph on which the algorithm will be run
	 * @param start
	 *            the starting node of the depth search
	 */
	public TSPBoltzmannMachine(Graph g) {
		super(g,"TSP Boltzmann Machine with Simulated Annealing");
		TSProblemModel.getInstance().resetAdvancedStructures(g);			
		boltzmannMachine = new BoltzmannMachine();
	}

	/**
	 * @see diamante.core.command.Command#execute()
	 */
	public void execute() {	    
		totalTime = System.currentTimeMillis();	      		    
  
		int temp[] = boltzmannMachine.execute();	          
	      
			/*
			 * final time captured
			 */		
		totalTime = (System.currentTimeMillis() - totalTime);	      
		
		// colors the resulting best path found
		ColorUtil.colorPath(g,temp);
		
		// Shows a reply message with the label and time of execution
		OutputSender.showMessageDialog(
			"Total execution Time: "+
				totalTime + " ms",
			"Measured Time",
			OutputSender.INFORMATION_MESSAGE
		);
		}					
}
