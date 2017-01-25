package tccrouter.user.algorithms;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

import tccrouter.diamante.core.command.Algorithm;
import tccrouter.diamante.core.graph.Graph;
import tccrouter.diamante.core.util.OutputSender;
import tccrouter.gbl.common.entity.Client;
import tccrouter.gbl.common.entity.ExecutionTrace;
import tccrouter.gbl.common.entity.TSProblemModel;
import tccrouter.gbl.common.util.ColorUtil;
import tccrouter.gbl.vrp.common.entity.VRProblemModel;
import tccrouter.gbl.vrp.common.entity.VehicleRoute;

/**
 * The Clarke and Wright savings algorithm is one of the most known heuristic for VRP.
 * It was developed on [Clarke and Wright 1964] and it applies to problems for which 
 * the number of vehicles is not fixed (it is a decision variable), and it works equally
 * well for both directed and undirected problems. When two routes (0,...,i,0) and
 * (0,j,...,0) can feasibly be merged into a single route (0,...,i,j,...,0), 
 * a distance saving  is generated.
 * 
 * @author Guilherme
 *
 */
public class ClarkeWright extends Algorithm {

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
	 * List to save the highest savings.
	 */
	LinkedList savingsList;		
	
	VRProblemModel vrProblemRef;
	TSProblemModel tsProblemRef;

	private boolean isMergePossible;
	
	/**
	 * Creates an instance of this algorithm. 
	 * Following the GraphEditor standard for algorithm parameters,
	 *  the first parameter should always be a graph, followed by the 
	 *  nodes that the algorithm requires.
	 * 
	 * @param g the graph on which the algorithm will be run
	 * @param start the starting node of the depth search
	 */
	public ClarkeWright(Graph g) {
		super(g, "Clark & Wright - Savings Algorithm");
		isMergePossible = true;
		routesList = new LinkedList();
		
		TSProblemModel.getInstance().resetAdvancedStructures(g);
		VRProblemModel.getInstance().setNewVRP(g);
		vrProblemRef = VRProblemModel.getInstance();
		tsProblemRef = TSProblemModel.getInstance();
		
		sourceNodeIndex = tsProblemRef.getSourceNodeIndex();
		measureExecution = tsProblemRef.isExecutionMeasure();
		if (measureExecution) {
			executionTrace = ExecutionTrace.getInstance();
		}

		/*
		 * Initially the savings method assume that each client will be
		 * serviced by a single vehicle. Therefore we have N clients with N vehicles:
		 */		
		numVehicles = 0;
				
		int[] clientNodesIndex = tsProblemRef.getClientNodes();
		
		for (int i = 0; i < clientNodesIndex.length; i++) {
			/*
			 * create 1 route for each vehicle containing 1 client
			 */
			Client client = new Client(clientNodesIndex[i],vrProblemRef.getClientDemand(clientNodesIndex[i]));
			VehicleRoute route = new VehicleRoute(numVehicles,client);
			numVehicles++;
			
			routesList.add(route);
		}		
	}

	/**
	 * @see diamante.core.command.Command#execute()
	 */
	public void execute() {	    	          		
		if (measureExecution) {
			executionTrace.initialTrace();
		}

		while (isMergePossible) {
		/*
		 * Step1. Savings Computation: order the possible saving after the
		 * merge of 2 routes (i,j) in decrescent order.
		 */			
		savingsList = new LinkedList();
		Object[] routeArray = routesList.toArray();
		
		if (measureExecution) {
			executionTrace.iterationTrace();
		}		
		
		for (int i = 0; i < routeArray.length; i++) {
			for (int j = i+1; j < routeArray.length; j++) {
								
				VehicleRoute routeI = (VehicleRoute)routeArray[i];
				VehicleRoute routeJ = (VehicleRoute)routeArray[j];
				                                    
					/* 
					 * When two routes (0,...,i,0) and (0,j,...,0) can feasibly be merged
					 * into a single route (0,...,i,j,...,0), a distance saving
					 * is generated
					 * 
					 * Formula:
					 * saving (i,j) = distance(i,source) + distance(source,j) - distance(i,j)
					 */ 					
					double savingIJ = 
						(tsProblemRef.getDistance(routeI.getLastClientIndex() , sourceNodeIndex) +
					tsProblemRef.getDistance(sourceNodeIndex,routeJ.getFirstClientIndex()) -
					tsProblemRef.getDistance(routeI.getLastClientIndex(),routeJ.getFirstClientIndex()));
					
					/*
					 * Add the resulting saving to the savings List
					 * if the capacity constraint is not violated:
					 */
					if (vrProblemRef.getVehicleCapacity() >= 
						(routeI.suppliedDemand + routeJ.suppliedDemand)) 
					{															
						/*
						 * new single route (0,...,i,j,...,0)
						 */
						Saving newSaving = new Saving(routeI,routeJ, savingIJ);
						savingsList.add(newSaving);
					}
					
			}
		}
		
		
		/*
		 * Check to see the possibility of merges
		 */
		if (! savingsList.isEmpty()) {
		/*
		 * the savings List is sorted in decreasing order:
		 */
		Collections.sort(savingsList);
		Collections.reverse(savingsList);
		
		/*
		 * The customer i & j that have the highest saving are merged together as long 
		 * as the merge do not violates the capacity constraint of the vehicle. 
		 */
		Saving highestSaving = (Saving)savingsList.removeFirst();
		
		/*
		 * merge of the 2 routes inside of the highest saving:
		 */				
		VehicleRoute routeMerged = highestSaving.routeI;
		routeMerged.addRoute(highestSaving.routeJ);
		
		/*
		 * updating route List
		 */
		routesList.remove(highestSaving.routeI);
		routesList.remove(highestSaving.routeJ);
		routesList.add(routeMerged);
		
		} else {
			isMergePossible = false;		
		}
		
		} // end while
		
			/*
			 * final time captured
			 */		
		if (measureExecution) {
			executionTrace.finalTrace();
		}
				
		// colors the resulting best path found
		ColorUtil.resetColorCounter();
		Object routes[] = routesList.toArray();
		
		for (int i = 0; i < routes.length; i++) {

			VehicleRoute vehicle = (VehicleRoute)routes[i];
			ColorUtil.colorPath(g, tsProblemRef.getSourceNodeIndex(), vehicle.getClientListAsIntArray());
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
	
	
	private String buildRoutesString() {
		StringBuffer result = new StringBuffer();
		
		for (Iterator iter = routesList.iterator(); iter.hasNext();) {
			VehicleRoute element = (VehicleRoute) iter.next();
			result.append(element.toString() + '\n');
		}
		
		return result.toString();
	}


	/**
	 * Internal Class NodeHeuristicData
	 * 
	 * DataObjectWrapper, represents the heuristic knowledge needed to guide the search
	 * algorithm.
	 */
	class Saving implements Comparable {
		
		/*
		 * public fields for obtaining performance
		 */
		public VehicleRoute routeI;
		public VehicleRoute routeJ;
		public double totalSavings;
				
		public Saving(VehicleRoute routeI,VehicleRoute routeJ, double totalDistanceSaved) {
			this.totalSavings = totalDistanceSaved;
			this.routeI = routeI;
			this.routeJ = routeJ;
		}

		public int compareTo(Object arg0) {				
			Saving arg = (Saving) arg0;
			
			if (totalSavings < arg.totalSavings) {
				return -1;
			} else if (totalSavings > arg.totalSavings) {
				return 1;
			} 
			return 0; 			
		}

		public boolean equals(Object obj) {
			Saving arg = (Saving) obj;
			return (
					(totalSavings == arg.totalSavings) &&
					(routeI.vehicleIndex == routeI.vehicleIndex) &&
					(routeJ.vehicleIndex == routeJ.vehicleIndex));
		}						
	}
	
}