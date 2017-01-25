package tccrouter.user.algorithms;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

import tccrouter.diamante.core.command.Algorithm;
import tccrouter.diamante.core.graph.Graph;
import tccrouter.diamante.core.util.OutputSender;
import tccrouter.gbl.common.entity.ExecutionTrace;
import tccrouter.gbl.common.entity.TSProblemModel;
import tccrouter.gbl.common.util.ColorUtil;
import tccrouter.gbl.common.util.TravelTimeUtil;
import tccrouter.gbl.vrp.common.entity.VRProblemModel;
import tccrouter.gbl.vrp.tw.entity.CostInsertionBetweenPath;
import tccrouter.gbl.vrp.tw.entity.TWClient;
import tccrouter.gbl.vrp.tw.entity.TWVehicleRoute;
import tccrouter.gbl.vrp.tw.entity.TimeWindow;

/**
 * Pushed Forward Insertion Heuristic(PFIH) for VRPTW.
 * Implementation based on the paper:
 * 
 * Heuristic Methods for Vehicle Routing Problem with Time Windows
 * Authors: K.C. Tan; L.H. Lee and K.Q. Zhu
 * 
 * @author Guilherme
 *
 */
public class PFIH extends Algorithm {

	/*
	 * Used as constants for the PFIH formulas:
	 */	
	private static final double ALPHA = 0.7;
	private static final double BETA = 0.2;
	private static final double EPSILON = 0.1;
	
	/*
	 * For the polar coordinate angle calculation
	 */
	private double source_x;
	private double source_y;
	
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
	int depotIndex;

	/*
	 * The client array
	 */
	int clientIndex[];

	TWVehicleRoute currentRoute;
	/*
	 * List to save the current valid routes.
	 */
	LinkedList routesList;
	LinkedList unroutedClientsList;	
	LinkedList firstCostInsertionList;	
	
	VRProblemModel vrProblemRef;
	TSProblemModel tsProblemRef;
	
	/*
	 * this heuristic technique may be used by other algorithms.
	 */	
	private boolean visualFeedBack;
	
	/**
	 * Creates an instance of this algorithm. 
	 * Following the GraphEditor standard for algorithm parameters,
	 *  the first parameter should always be a graph, followed by the 
	 *  nodes that the algorithm requires.
	 * 
	 * @param g the graph on which the algorithm will be run
	 * @param start the starting node of the depth search
	 */
	public PFIH(Graph g) {
		super(g, "Pushed Forward Insertion Heuristic - VRPTW");
		routesList = new LinkedList();
		unroutedClientsList = new LinkedList();
		VRProblemModel.getInstance().setNewVRP(g);
		vrProblemRef = VRProblemModel.getInstance();
		tsProblemRef = TSProblemModel.getInstance();
		visualFeedBack = tsProblemRef.isVisualFeedback();
		
		if (visualFeedBack) {
		    tsProblemRef.resetAdvancedStructures(g);
		}

		measureExecution = vrProblemRef.isPfihExecutionMeasure();
		if (measureExecution) {
			executionTrace = ExecutionTrace.getInstance();
		}
		clientIndex = tsProblemRef.nodeIndex;
		
		/*
		 * filling the unrouted client list.
		 */
		for (int i = 0; i < clientIndex.length; i++) {
			TimeWindow timeWindow = new TimeWindow();
			TWClient element = new TWClient
			(clientIndex[i], vrProblemRef.getClientDemand(clientIndex[i]), timeWindow);
			unroutedClientsList.add(element);
		}

		/*
		 * PFIH 1: Begin with an empty route starting at the depot.
		 *         set r = 1
		 */
		routesList = new LinkedList();
		depotIndex = tsProblemRef.getSourceNodeIndex();
		source_x = tsProblemRef.getCityXCoordinate(depotIndex);
		source_y = tsProblemRef.getCityYCoordinate(depotIndex);
		numVehicles = 0;		
		TimeWindow tw = new TimeWindow(0,23);
		TWClient twClient = new TWClient(depotIndex, 0, 0,  0, tw); 
		TWVehicleRoute route = new TWVehicleRoute(numVehicles, twClient);
		currentRoute = route;		
		numVehicles++;		
		routesList.add(route);		
	}

	/**
	 * @see diamante.core.command.Command#execute()
	 */
	public void execute() {	    	          		
		if (measureExecution) {
			executionTrace.initialTrace();
		}
		
		/*
		 * PFIH 2: If all customers have been routed then go to step 8;
		 *         else 
		 *             for all unrouted customer j: Compute the cost of insertion as the 
		 *             first node as in Equation (11), and sort them in ascending order.
		 */
		while (!unroutedClientsList.isEmpty()) {

			if (measureExecution) {
				executionTrace.iterationTrace();
			}
			
			firstCostInsertionList = new LinkedList();

			for (Iterator iter = unroutedClientsList.iterator(); iter.hasNext();) {
				TWClient element = (TWClient) iter.next();				
				/*
				 * last visited customer in the last formed route:
				 */
				TWVehicleRoute lastRoute = (TWVehicleRoute)routesList.getLast();
				TWClient lastClient = lastRoute.getLastClient();
				
				FirstCostInsertion cost = new FirstCostInsertion(element, lastClient);
				firstCostInsertionList.add(cost);		
			}
			Collections.sort(firstCostInsertionList);

			/*
			 * PFIH 3: Select the first customer j* from the ordered list with the least
			 *         cost and feasible in terms of time and capacity constraints. 
			 */			
			TWClient clientJ = ((FirstCostInsertion)firstCostInsertionList.getFirst()).client;
			
			/*
			 * PFIH 4: Append j* to the current route and update the load of the route 
			 */			
			int next = 1;
			while (! (currentRoute.addClient(clientJ))) {
				clientJ = ((FirstCostInsertion)firstCostInsertionList.get(next)).client;
				next++;
			}
			unroutedClientsList.remove(clientJ);

			/*
			 * PFIH 5: For all unrouted customers j: 
			 *           for all edge {k,l} in the current route, compute the cost inserting
			 *           each of the unrouted customers between k and l. As in eq.(12).
			 */
			boolean feasible;
			
			do {				
				
			feasible = false;
			LinkedList costInsertionList = new LinkedList();
			for (Iterator iter = unroutedClientsList.iterator(); iter.hasNext();) {
				TWClient element = (TWClient) iter.next();				
				
				LinkedList auxList = new LinkedList();
				Object clientArray[] = currentRoute.getClientListAsObjArray();
				
				for (int k = 1; k < clientArray.length; k++) {
						
						CostInsertionBetweenPath cibp = new CostInsertionBetweenPath
						(currentRoute, k, element, element.nodeIndex);
						
						auxList.add(cibp);
				}
				Collections.sort(auxList);								
				CostInsertionBetweenPath clientLeast = (CostInsertionBetweenPath)auxList.removeFirst();

				// put the least cost found from client into the other list: 
				costInsertionList.add(clientLeast);				
			}
			Collections.sort(costInsertionList);								

			/*
			 * PFIH 6: Select customer with least cost.
			 * 
			 * if insertion of client j* between k* and l* is feasible in terms of
			 *    time and capacity then insert client, update the route and go to
			 *    step 5.
			 * else go to step 7
			 */		
			if (! costInsertionList.isEmpty()) {
				CostInsertionBetweenPath leastJ = (CostInsertionBetweenPath)costInsertionList.getFirst();			
				feasible = currentRoute.addClient(leastJ.client, leastJ.l);

				if (feasible) {
					unroutedClientsList.remove(leastJ.client);
				}				
			}
			
			if (unroutedClientsList.isEmpty()) {
				feasible = false;
			}			
			
			} while (feasible); 

			/*
			 * PFIH 7: Begin a new route from the depot. Set r = r + 1.
			 *         Go to step 2.
			 */
			if (!unroutedClientsList.isEmpty()) {
				TimeWindow tw = new TimeWindow(0,23);
				TWClient twClient = new TWClient(depotIndex, 0, 0, 0, tw); 
				TWVehicleRoute route = new TWVehicleRoute(numVehicles, twClient);
				currentRoute = route;		
				numVehicles++;		
				routesList.add(route);						
			}
		}
		/*
		 * PFIH 8: All clients have been routed, output results.
		 *         Stop PFIH.
		 */
		
		/*
		 * final time captured
		 */				
		if (measureExecution) {
			executionTrace.finalTrace();
		}
		
		if (visualFeedBack) {
			
			// colors the resulting best path found
			ColorUtil.resetColorCounter();
			Object routes[] = routesList.toArray();
			
			for (int i = 0; i < routes.length; i++) {

				TWVehicleRoute vehicle = (TWVehicleRoute)routes[i];
				ColorUtil.colorPath(g, depotIndex, vehicle.getCanonicalClientList());
			}

			if (measureExecution) {
				String routesInfo = buildRoutesString();

				System.out.println
				("PFIH Total execution Time: "+ executionTrace.getFinalTime() + " ms\n" + routesInfo);
				
				// Shows a reply message with the label and time of execution
				OutputSender.showMessageDialog(
					"Total execution Time: "+
						executionTrace.getFinalTime() + " ms\n" + routesInfo,
					"Measured Time",
					OutputSender.INFORMATION_MESSAGE
				);				
				
			}
		}
		
	}

	private String buildRoutesString() {
		StringBuffer result = new StringBuffer();
		
		for (Iterator iter = routesList.iterator(); iter.hasNext();) {
			TWVehicleRoute element = (TWVehicleRoute) iter.next();
			result.append(element.toString() + '\n');
		}
		
		return result.toString();
	}

	public LinkedList getRoutesList() {
		return routesList;
	}
	
	/**
	 * Internal Class NodeHeuristicData
	 * Used as in Eq. (11).
	 * 
	 * DataObjectWrapper, represents the heuristic knowledge needed to guide the
	 * algorithm.
	 */
	class FirstCostInsertion implements Comparable {
		
		/*
		 * public fields for obtaining performance
		 */
		public TWClient client;
		public TWClient lastVisitedClient;
		public double depotTravelTime;		
		public double polarAngle;		
		public double totalCost;
				
		public FirstCostInsertion(TWClient client, TWClient lastVisitedClient) {
			this.client = client;
			this.lastVisitedClient = lastVisitedClient;
			depotTravelTime = TravelTimeUtil.travelTime(depotIndex, client.nodeIndex);
			
			double y_client = source_y - tsProblemRef.getCityYCoordinate(client.nodeIndex);
			double x_client = source_x - tsProblemRef.getCityXCoordinate(client.nodeIndex);
			double y_lastClient = source_y - tsProblemRef.getCityYCoordinate(lastVisitedClient.nodeIndex);
			double x_lastClient = source_x - tsProblemRef.getCityXCoordinate(lastVisitedClient.nodeIndex);
			
			/*
			 * arctan (y/x): normalized in the cartesian coordinates of the depot(origin)
			 */
			double aux = 0.0D;
			
			/*
			 * checking divide by zero! generates -> NaN values
			 */
			if ( x_client > 0 ) {			
				aux = ( y_client / x_client ); 			
				polarAngle = Math.toDegrees(Math.atan(aux));
			} else {
				polarAngle = 0.0D;
			}
				
			double polarAngleLastClient;
			if ( x_lastClient > 0 ) {																
				aux = ( y_lastClient / x_lastClient );			
				polarAngleLastClient = Math.toDegrees(Math.atan(aux));
			} else {
				polarAngleLastClient = 0.0D;
			}

			/*
			 * Equation 11:
			 */			
			totalCost = -ALPHA*depotTravelTime + BETA*client.timeWindow.end +
			            EPSILON*( (Math.abs(polarAngle - polarAngleLastClient)/360) * depotTravelTime);
			
		}

		public int compareTo(Object arg0) {

			// type cast checking ? no.
			FirstCostInsertion arg = (FirstCostInsertion) arg0;

			if (totalCost < arg.totalCost) {
				return -1;
			} else if (totalCost > arg.totalCost) {
				return 1;
			} 
			return 0; 			
		}

		public boolean equals(Object obj) {
			FirstCostInsertion arg = (FirstCostInsertion) obj;
			return (this.client.nodeIndex == arg.client.nodeIndex);
		}						
	}	
}