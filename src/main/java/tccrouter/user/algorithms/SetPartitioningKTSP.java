package tccrouter.user.algorithms;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

import tccrouter.diamante.core.command.Algorithm;
import tccrouter.diamante.core.graph.Graph;
import tccrouter.diamante.core.util.OutputSender;
import tccrouter.gbl.common.entity.Client;
import tccrouter.gbl.common.entity.ExecutionTrace;
import tccrouter.gbl.common.entity.NodeEuclidianDistance;
import tccrouter.gbl.common.entity.TSProblemModel;
import tccrouter.gbl.common.util.ColorUtil;
import tccrouter.gbl.vrp.common.entity.VRProblemModel;
import tccrouter.gbl.vrp.common.entity.VehicleRoute;

public class SetPartitioningKTSP extends Algorithm {

	/**
	 * Reference to the ExecutionTrace object to measure execution performance
	 */
    ExecutionTrace executionTrace;
    boolean measureExecution;

	/*
	 * Total vehicles used in problem solution.
	 */
	int numVehicles;

	/*
	 * The source node
	 */
	int sourceNodeIndex;
	
	/*
	 * List to save the current valid routes.
	 */
	LinkedList routesList;
	/*
	 * List to save the set partitions.
	 */
	LinkedList setList;	
	
	VRProblemModel vrProblemRef;
	TSProblemModel tsProblemRef;
	
	/**
	 * Creates an instance of this algorithm. 
	 * Following the GraphEditor standard for algorithm parameters,
	 *  the first parameter should always be a graph, followed by the 
	 *  nodes that the algorithm requires.
	 * 
	 * @param g the graph on which the algorithm will be run
	 * @param start the starting node of the depth search
	 */
	public SetPartitioningKTSP(Graph g) {
		super(g, "Set Partitioning - KTSP");
		routesList = new LinkedList();
		setList = new LinkedList();
		
		TSProblemModel.getInstance().resetAdvancedStructures(g);
		VRProblemModel.getInstance().setNewVRP(g);
		vrProblemRef = VRProblemModel.getInstance();
		tsProblemRef = TSProblemModel.getInstance();
		
		measureExecution = tsProblemRef.isExecutionMeasure();
		if (measureExecution) {
			executionTrace = ExecutionTrace.getInstance();
		}
		sourceNodeIndex = tsProblemRef.getSourceNodeIndex();
		numVehicles = 0;				
	}

	/**
	 * @see diamante.core.command.Command#execute()
	 */
	public void execute() {	    	          		
		if (measureExecution) {
			executionTrace.initialTrace();
		}
		/*
		 * step 1: split client nodes by common euclidian distance into sets.
		 */
		splitPartitions();

		/*
		 * step 2: improve created sets.
		 */
		//improvePartitions();
		
		/*
		 * step 3: improve the K routes created using some well known heuristic for the TSP.
		 */
		improveKTSPbyGA();
		
			/*
			 * final time captured
			 */		
		if (measureExecution) {
			executionTrace.finalTrace();
		}
				
		String routesInfo = buildRoutesString();
		
		// Shows a reply message with the label and time of execution
		OutputSender.showMessageDialog(
			"Total execution Time: "+
				executionTrace.getFinalTime() + " ms\n" + routesInfo,
			"Measured Time",
			OutputSender.INFORMATION_MESSAGE
		);		
	}

	private void splitPartitions() {
		/*
		 * Step1. Set Computation: divide the set of neigbor nodes that are closest to one
		 * another and wich total amount does not overflow vehicle capacity:
		 */
		int[] clientNodesIndex = tsProblemRef.getClientNodes();		
		
		/*
		 * populates the list in descending order, the most distant client from the depot
		 * on the front.
		 */
		for (int i = 0; i < clientNodesIndex.length; i++) {
			NodeEuclidianDistance cIndex = new NodeEuclidianDistance(clientNodesIndex[i], sourceNodeIndex);
			setList.add(cIndex);
		}		
		Collections.sort(setList);
		
		/*
		 * grouping of the nearest nodes by vehicle capacity:
		 * 
		 *  minimizes the number of vehicles used. 
		 */				
		while (! setList.isEmpty()) {
					
			if (measureExecution) {
				executionTrace.iterationTrace();
			}
			
			NodeEuclidianDistance cIndex = (NodeEuclidianDistance)setList.removeFirst();
			Client client = new Client(cIndex.clientIndex,vrProblemRef.getClientDemand(cIndex.clientIndex));
			VehicleRoute route = new VehicleRoute(numVehicles, client);
			numVehicles++;
				
			Object iterationList[] = setList.toArray();

			/*
			 * creating the list with closest clients to the first removed client:
			 */
			LinkedList setListClient = new LinkedList();
			
			for (int i = 0; i < iterationList.length; i++) {
				NodeEuclidianDistance element = (NodeEuclidianDistance)iterationList[i];
				NodeEuclidianDistance cIndexB = new NodeEuclidianDistance
				(element.clientIndex, cIndex.clientIndex);
				setListClient.add(cIndexB);
			}		
			Collections.sort(setListClient);
			
			iterationList = setListClient.toArray();
			for (int i = 0; i < iterationList.length; i++) {
				NodeEuclidianDistance element = (NodeEuclidianDistance)iterationList[i];
				
				/*
				 * capacity cheking inside the method.
				 * 
				 * if the client was succesfully added then remove it from the 
				 * setList of non serviced clients.
				 */
				client = new Client(element.clientIndex, vrProblemRef.getClientDemand(element.clientIndex));
				if (route.addClient(client)) {
					setList.remove(element);
				}
			}
			
			routesList.add(route);
		}
	}

	private void improvePartitions() {
		
		/*
		 * Try to trade nodes between the partition borders
		 * and calculate total partition area saving.
		 */				
		while (! setList.isEmpty()) {
			
			NodeEuclidianDistance cIndex = (NodeEuclidianDistance)setList.removeFirst();
			Client client = new Client(cIndex.clientIndex,vrProblemRef.getClientDemand(cIndex.clientIndex));
			VehicleRoute route = new VehicleRoute(numVehicles, client);
			numVehicles++;
				
			Object iterationList[] = setList.toArray();

			/*
			 * creating the list with closest clients to the first removed client:
			 */
			LinkedList setListClient = new LinkedList();
			
			for (int i = 0; i < iterationList.length; i++) {
				NodeEuclidianDistance element = (NodeEuclidianDistance)iterationList[i];
				NodeEuclidianDistance cIndexB = new NodeEuclidianDistance
				(element.clientIndex, cIndex.clientIndex);
				setListClient.add(cIndexB);
			}		
			Collections.sort(setListClient);
			
			iterationList = setListClient.toArray();
			for (int i = 0; i < iterationList.length; i++) {
				NodeEuclidianDistance element = (NodeEuclidianDistance)iterationList[i];
				
				/*
				 * capacity cheking inside the method.
				 * 
				 * if the client was succesfully added then remove it from the 
				 * setList of non serviced clients.
				 */
				client = new Client(element.clientIndex, vrProblemRef.getClientDemand(element.clientIndex));
				if (route.addClient(client)) {
					setList.remove(element);
				}
			}
			
			routesList.add(route);
		}
	}
	
	private void improveKTSPbyGA() {

		ColorUtil.resetColorCounter();
		
		for (Iterator iter = routesList.iterator(); iter.hasNext();) {

			if (measureExecution) {
				executionTrace.iterationTrace();
			}
			
			VehicleRoute element = (VehicleRoute) iter.next();
			tsProblemRef.setClientStructures(element.getClientListAsIntArray());
			tsProblemRef.setVisualFeedback(false);			
			TSPGeneticAlgorithm tspGA = new TSPGeneticAlgorithm(g);
			tspGA.execute();			
			element.setClientListAsArray(tspGA.getBestChromosomeAsArray());
		}		
	}
	
	private String buildRoutesString() {
		StringBuffer result = new StringBuffer();
		
		for (Iterator iter = routesList.iterator(); iter.hasNext();) {
			VehicleRoute element = (VehicleRoute) iter.next();
			result.append(element.toString() + '\n');
		}
		
		return result.toString();
	}	
}