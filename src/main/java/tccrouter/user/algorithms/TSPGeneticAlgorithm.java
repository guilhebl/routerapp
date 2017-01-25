package tccrouter.user.algorithms;

import tccrouter.diamante.core.command.Algorithm;
import tccrouter.diamante.core.graph.Graph;
import tccrouter.gbl.common.entity.ExecutionTrace;
import tccrouter.gbl.common.entity.TSProblemModel;
import tccrouter.gbl.common.util.ColorUtil;
import tccrouter.gbl.tsp.genetic.TravellerWorld;
import tccrouter.gbl.tsp.genetic.tools.MersenneTwister;
import tccrouter.gbl.tsp.genetic.tools.PermutationController;
import tccrouter.gbl.tsp.genetic.tools.Randomizer;
import tccrouter.gbl.tsp.genetic.ui.TravellerStatus;

public class TSPGeneticAlgorithm extends Algorithm {
	
	/*
	 * The random initial seed
	 */
	private static final int MERSENNE_TWISTER_SEED_SIZE = 624;		

	/**
	 * Reference to the ExecutionTrace object to measure execution performance
	 */
    ExecutionTrace executionTrace;	
	
	/**
	 * this heuristic technique may be used by other algorithms.
	 */	
	private boolean visualFeedBack;
	private boolean measureExecution;
	
	// main classes
	private TSProblemModel tsProblemRef;
	private TravellerWorld m_world;
	private TravellerStatus m_travellerStatus;		

	/*
	 * * In an ideal world, the MersenneTwister class would contain this * method as its standard array seeding mechanism, but that would make * the Meresnne Twister class dependent on the scruffy Randomizer class, * so this is not that "ideal world".
	 */
	private static void seedTwister(MersenneTwister mt) {

		/*
		 * * Prepare seeds and initialize the Mersenne Twister using the original * Scott Robert Ladd randomizer, which in turn is seeded off the clock.
		 */
		Randomizer randNo = new Randomizer();

		int mt_seeds[] = new int[MERSENNE_TWISTER_SEED_SIZE];

		for (int i = 0; i < MERSENNE_TWISTER_SEED_SIZE; i++) {
			mt_seeds[i] = randNo.next();
		}
		mt.setSeed(mt_seeds);

	}

	/**
	 * Creates an instance of this algorithm. Following the GraphEditor standard for algorithm parameters, the first parameter should always be a graph, followed by the nodes that the algorithm requires.
	 * 
	 * @param g
	 *            the graph on which the algorithm will be run
	 * @param start
	 *            the starting node of the depth search
	 */
	public TSPGeneticAlgorithm(Graph g) {
		super(g, "TSP Genetic Algorithm");
		tsProblemRef = TSProblemModel.getInstance();		
		visualFeedBack = tsProblemRef.isVisualFeedback();
		
		if (visualFeedBack) {
		    tsProblemRef.resetAdvancedStructures(g);
		}

		/*
		 * Instantiate the random number generator once for all time for everyone. This go moved here from main() when a remark on the net in * comp.lang.java.programmer made me realize I wasn't ever doing this 
		 * for applet mode!! We don't need to keep the handle, since it is * available henceforth via a static
		 * call to any method that wants it * (the glory and most of the point of making it a Design Patterns * "Solitary"), but we do need to take this opportunity to seed the * twister the first time it is instantiated.
		 */
		seedTwister(MersenneTwister.getTwister());

		TravellerStatus.reset();
		TravellerWorld.reset();

		// create world image
		TravellerWorld.newWorld();

		m_world = TravellerWorld.getTravellerWorld();
		m_travellerStatus = TravellerStatus.getTravellerStatus(m_world);
		
		measureExecution = TSProblemModel.getInstance().isGaExecutionMeasure();
		if (measureExecution) {
			executionTrace = ExecutionTrace.getInstance();
		}		
	}

	/**
	 * @see diamante.core.command.Command#execute()
	 */
	public void execute() {	    

		if (measureExecution) {
			executionTrace.initialTrace();
		}
		
		if (visualFeedBack) {
		    TravellerStatus.signalStart();
		}	
	          
		PermutationController.newProblem();	    
		m_world.taskHandler();

		/*
		 * final time captured
		 */				
		if (measureExecution) {
			executionTrace.finalTrace();
		}
		
		if (visualFeedBack) {		
			if (measureExecution) {
				m_travellerStatus.showStatus(executionTrace.getFinalTime());
			}
			// colors the resulting best path found
			ColorUtil.colorPath(g, tsProblemRef.getSourceNodeIndex(), m_world.getBestChromosomeAsArray());			
		}
	}
	
	public int[] getBestChromosomeAsArray() {
		return m_world.getBestChromosomeAsArray();
	}
}
