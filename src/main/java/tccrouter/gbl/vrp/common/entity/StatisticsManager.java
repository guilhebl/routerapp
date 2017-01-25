package tccrouter.gbl.vrp.common.entity;

import java.util.ArrayList;
import java.util.LinkedList;

import tccrouter.gbl.common.entity.TSProblemModel;
import tccrouter.gbl.vrp.tw.entity.TWClient;
import tccrouter.gbl.vrp.tw.entity.TWVehicleRoute;
import tccrouter.gbl.vrp.tw.entity.TimeWindow;

/**
 * This class contains the whole code for comparing
 * stastically, Solutions, and with all the solution 
 * sub-components.
 * 
 * This class is a singleton.
 * 
 * @author Guilherme
 *
 */
public class StatisticsManager {

	/*
	 * The corresponding weghts for the heuristic
	 * formulas to be calculated. 
	 */
	public static final double V_WEIGHT = 0.7;
	public static final double V_DISTANCE_WEIGHT = 0.7;
	public static final double V_LOAD_WEIGHT = 0.3;
	public static final double TWV_WEIGHT = 0.3;
	public static final double TWV_TRAVEL_TIME_WEIGHT = 0.8;
	public static final double TWV_WAIT_TIME_WEIGHT = 0.2;
	public static final double SOL_ROUTE_WEIGHT = 0.7;
	public static final double SOL_NUM_CLIENTS_WEIGHT = 0.3;
	

	static StatisticsManager instance;
	private VRProblemModel vrProblemRef;
	
	/**
	 * 
	 * @return
	 */
	public static StatisticsManager getInstance() {
		if (instance == null)
			instance = new StatisticsManager();
		
		return instance;
	}

	private TWVehicleRoute meanTWVRoute;
	
	/**
	 * 
	 * 
	 */
	protected StatisticsManager() {
		vrProblemRef = VRProblemModel.getInstance();
	}
	
	/**
	 * Statistical Logic to compare how much one route is better than
	 * the other. An extension of VehicleRoute.compareTo()
	 * 
	 * @author Guilherme
	 * @arg arg0
 	 * @arg arg1
	 */
	public double heuristicDifferenceDegree(VehicleRoute arg0, VehicleRoute arg1) {				
		double max_distance = 0.0D;
		
		/*
		 * calculating the distance percentage; 
		 * The most distant route recieves 100%
		 * the other is the lesser percentage of the MAX_DISTANCE. 
		 */
		if (arg0.totalDistance > arg1.totalDistance) {
			max_distance = arg0.totalDistance;			
		} else {
			max_distance = arg1.totalDistance;
		}					

		double distance_value = ((arg0.totalDistance)/max_distance)*V_DISTANCE_WEIGHT;
		double arg1_distance_value = ((arg1.totalDistance)/max_distance)*V_DISTANCE_WEIGHT;						
		
		/*
		 * Same logic as above, now with weight
		 * calculating the weight percentage;
		 */
		double max_supply = 0.0D;
		
		if (arg0.suppliedDemand > arg1.suppliedDemand) {
			max_supply = arg0.suppliedDemand;			
		} else {
			max_supply = arg1.suppliedDemand;
		}					

		double weight_value = ((arg0.suppliedDemand)/max_supply)*V_LOAD_WEIGHT;
		double arg1_weight_value = ((arg1.suppliedDemand)/max_supply)*V_LOAD_WEIGHT;
		
		double heuristicValue = distance_value - weight_value; 
		double arg1HeuristicValue = arg1_distance_value - arg1_weight_value;
		
		/*
		 * if ARG0 has better heuristic value, return will be negative,
		 * otherwise return ARG1 better: is the positive difference.
		 */		
		return (heuristicValue - arg1HeuristicValue);
	}
	
	/**
	 * Statistical Logic to compare how much one route is better than
	 * the other. An extension of TWVehicleRoute.compareTo()
	 * If arg0 is better, the value is negative
	 * otherwise if arg1 is better, the value shall be positive. 
	 * 
	 * @author Guilherme
	 * @arg arg0
 	 * @arg arg1
	 */
	public double twHeuristicDifferenceDegree(TWVehicleRoute arg0, TWVehicleRoute arg1) {
				
		double heuristicDifference = heuristicDifferenceDegree(arg0, arg1); 
		
		double max_travel_time = 0.0D;		
		/*
		 * calculating the time Window openess percentage; 
		 * The latest route recieves 100%
		 * the other is the lesser percentage of the MAX_TRAVEL_TIME. 
		 */
		if (arg0.getLastClient().serviceTime > arg1.getLastClient().serviceTime) {
			max_travel_time = arg0.getLastClient().serviceTime;			
		} else {
			max_travel_time = arg1.getLastClient().serviceTime;
		}					

		double max_wait_time = 0.0D;		
		/*
		 * calculating the wait Time percentage; 
		 * The route that waits more recieves 100%
		 * the other is the lesser percentage of the MAX_WAIT_TIME. 
		 */
		if (arg0.totalWaitTime > 0 || arg1.totalWaitTime > 0) {
			if (arg0.totalWaitTime > arg1.totalWaitTime) {
				max_wait_time = arg0.totalWaitTime;			
			} else {
				max_wait_time = arg1.totalWaitTime;
			}
		}
				
		double travel_time_value = 
			((arg0.getLastClient().serviceTime)/max_travel_time)*TWV_TRAVEL_TIME_WEIGHT;
		double arg1_travel_time_value = 
			((arg1.getLastClient().serviceTime)/max_travel_time)*TWV_TRAVEL_TIME_WEIGHT;

		double wait_time_value = (arg0.totalWaitTime > 0 ? 
			((arg0.totalWaitTime)/max_wait_time)*TWV_WAIT_TIME_WEIGHT : 0);
		
		double arg1_wait_time_value = (arg1.totalWaitTime > 0 ?
				((arg1.totalWaitTime)/max_wait_time)*TWV_WAIT_TIME_WEIGHT : 0);
		
		double heuristicValue = (travel_time_value - wait_time_value); 
		double arg1HeuristicValue = (arg1_travel_time_value - arg1_wait_time_value);

		/*
		 * if ARG0 has better heuristic value, return will be negative,
		 * otherwise return ARG1 better: is the positive difference.
		 */				
		double twHeuristicValue = (heuristicValue - arg1HeuristicValue);
		
		/*
		 * if heuristicDifference value is negative, the new value shall be reinforced
		 */		
		double twHeuristicDifference = 
			(twHeuristicValue*TWV_WEIGHT) + (heuristicDifference*V_WEIGHT);
		
		/*
		 * If arg0 is better, the value is negative
		 * otherwise if arg1 is better, the value shall be positive.
		 */
		return twHeuristicDifference;
	}
	
	/**
	 * Statistical Logic to compare with the mean solution 
	 * how much one solution is better than the mean.
	 * 
	 * @author Guilherme
	 * @arg arg0
 	 * @arg arg1
	 */
	public double solutionHeuristicValue(LinkedList solution) {
				
		double value = 0.0D;
		Object array[] = solution.toArray();		
		int indexI;
		
		/*
		 * calculating the heuristic difference from mean route
		 * for each route of the given solution.  
		 */
		for (indexI = 0; indexI < array.length; indexI++) {				
			TWVehicleRoute routeI = (TWVehicleRoute)array[indexI];
			value += twHeuristicDifferenceDegree(meanTWVRoute,routeI);	
		}

		/*
		 * if negative value, the solution is better than the mean solution.
		 */
		return value;
	}
	
	/**
	 * This method calculates the medium route Value of a solution of k routes
	 * 
	 * For TWVehicleRoutes
	 * 
	 * @param routesList
	 */
	public void updateMeanTWVRoute(LinkedList routesList)
	{		
		Object array[] = routesList.toArray();
		int indexI;

		// VRoute attributes
		double totalDistance = 0;
		int totalClients = 0;
		int totalSuppliedDemand = 0;

		// TWVRoute attributes
		double totalTravelTime = 0;
		double totalWaitTime = 0;

		/*
		 * STEP 1: Colect total values for the mean number 
		 *         of clients in the solution and
		 *         all the other attributes mean values to be
		 *         calculated later. 
		 */				
		for (indexI = 0; indexI < array.length; indexI++) {
				TWVehicleRoute routeI = (TWVehicleRoute)array[indexI];
				
				// for the VRoute
				totalDistance += routeI.totalDistance;
				totalClients += routeI.getNumServicedClients();
				totalSuppliedDemand += routeI.suppliedDemand;
				
				// for the TWVRoute
				totalTravelTime += routeI.getLastClient().serviceTime;
				totalWaitTime += routeI.totalWaitTime;
		}
		

		/*
		 * STEP 2: Build the mean TWVehicle Route 
		 *         calculating the mean values. 
		 */						
		TWVehicleRoute result = new TWVehicleRoute(999);		
		int numRoutes = array.length;
		
		result.totalDistance = (totalDistance/numRoutes); 
		result.setClientCounter((totalClients/numRoutes));
		result.suppliedDemand = (totalSuppliedDemand/numRoutes);		
		
		result.totalTravelTime = (totalTravelTime/numRoutes);
		
		if (totalWaitTime > 0) {		
			result.totalWaitTime = (totalWaitTime/numRoutes);
		}
		
		// add the depot:
		TimeWindow twD = vrProblemRef.getClientTimeWindow(result.depotIndex);
		TWClient depot = new TWClient(result.depotIndex, 0, twD);
		result.addDepot(depot);		

		/*
		 * The only value who really matters is setting the service Time.
		 */
		TWClient twc = new TWClient(999,100,0, result.totalTravelTime,new TimeWindow());
		for (int i = 0; i < result.clientCounter; i++) {
			result.addDummyClient(twc);
		}
				
		meanTWVRoute = result;	
	}

	public TWVehicleRoute getMeanTWVRoute()
	{		
		return meanTWVRoute;
	}
	
	/**
	 * This method calculates the medium solution 
	 * based in a k medium routes.
	 * 
	 * By definition, the mean solution is a K(number of routes)
	 * of each copy of a mean_route example that fills the client demands.
	 * 
	 * @param routesList
	 */
	public ArrayList meanSolution(ArrayList routesList)
	{		
		int attendedClients = 0;
		int totalClients = TSProblemModel.getInstance().numClientNodes();
		
		ArrayList solution = new ArrayList();
				
		/*
		 * STEP 1: Fill the client area. By creating the k routes. 
		 */	
		while (attendedClients < totalClients) {
			
			attendedClients += meanTWVRoute.getClientCounter();			
			solution.add(meanTWVRoute.clone());			
		}
		
		return solution;
	}	

	/**
	 * Statistical Logic to compare two different solutions.
	 * if return value is a negative value, the solution A is better 
	 * else the solution B is better.
	 * 
	 * @author Guilherme
	 * @arg arg0
 	 * @arg arg1
	 */
	public double solutionHeuristicDifference(LinkedList solutionA, LinkedList solutionB) {
				
		double routesValue = 0.0D;
		Object arrayA[] = solutionA.toArray();
		Object arrayB[] = solutionB.toArray();
				
		/*
		 * calculating the heuristic difference of routes by making a combination
		 * of every route of solution A with every route of solution B.  
		 */
		for (int indexA = 0; indexA < arrayA.length; indexA++) {
			for (int indexB = 0; indexB < arrayA.length; indexB++) {				
				TWVehicleRoute routeA = (TWVehicleRoute)arrayA[indexA];
				TWVehicleRoute routeB = (TWVehicleRoute)arrayB[indexB];
				routesValue += twHeuristicDifferenceDegree(routeA,routeB);				
			}			
		}
		
		int max_vehicles = 0;
		
		if (solutionA.size() > solutionB.size()) {
			max_vehicles = solutionA.size();			
		} else {
			max_vehicles = solutionB.size();
		}					

		double aSizeValue = (solutionA.size()/max_vehicles);
		double bSizeValue = (solutionB.size()/max_vehicles);
		double sizeValue = aSizeValue - bSizeValue;
		
		/*
		 * Considerations for the route that use the lesser
		 * number of vehicles, the new value shall be reinforced
		 */		
		routesValue = routesValue/(arrayA.length*arrayB.length);
		double value = 
			(routesValue*SOL_ROUTE_WEIGHT) + (sizeValue*SOL_NUM_CLIENTS_WEIGHT);

		/*
		 * if negative value, the solution A is better 
		 * else the solution B is better.
		 */
		return value;
	}
	
	public double calculateSavings
	(TWVehicleRoute routeA,TWVehicleRoute routeOA,TWVehicleRoute routeB,TWVehicleRoute routeOB)
	{

		double saving = (twHeuristicDifferenceDegree(routeA,routeOA) + 
				  twHeuristicDifferenceDegree(routeB,routeOB));
		
		return saving;
	}
	
}
