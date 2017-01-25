package tccrouter.gbl.vrp.tw.entity;


/**
 * Class
 * Used as in Eq. (12). Represent the cost to insert a client between 2 existing
 * clients in the Route.
 * 
 * DataObjectWrapper, represents the heuristic knowledge needed to guide the
 * algorithm.
 */
public class CostInsertionBetweenPath implements Comparable {
	
	/*
	 * public fields for obtaining performance
	 */
	public TWClient client;
	public TWClient clientK;
	public TWClient clientL;
	
	/*
	 * Index of relative elements
	 */
	public int clientIndex;  // in his respective route.
	public int k;
	public int l;
	
	public double totalCost;

//	VRProblemModel vrProblemRef = VRProblemModel.getInstance();
//	TSProblemModel tsProblemRef = TSProblemModel.getInstance();
	
//	public CostInsertionBetweenPath
//	(TWVehicleRoute route, TWClient clientK, int k, TWClient clientL, int l, TWClient client)
//	{
//		this.client = client;
//		this.clientK = clientK;
//		this.clientL = clientL;
//		this.l = l;
//		this.k = k;
//		
//		/*
//		 * variable: D(k), total distance traveled by vehicle k
//		 */			
//		double leastTotalDistance = route.totalDistance - tsProblemRef.getDistance(clientK.nodeIndex, clientL.nodeIndex);
//		leastTotalDistance += tsProblemRef.getDistance(clientK.nodeIndex, client.nodeIndex)
//					+ tsProblemRef.getDistance(client.nodeIndex, clientL.nodeIndex);
//
//		/*
//		 * variable: W(k), total travel time consumed by route
//		 */			
//		double leastTravelTime = route.totalTravelTime - TravelTimeUtil.travelTime(clientK.nodeIndex, clientL.nodeIndex);
//		leastTravelTime += TravelTimeUtil.travelTime(clientK.nodeIndex, client.nodeIndex)
//		                + TravelTimeUtil.travelTime(client.nodeIndex, clientL.nodeIndex);
//		
//		/*
//		 * variable: O(k), overload of vehicle k
//		 */
//		int vehicleOverLoad = 0;
//		if (route.capacity < route.suppliedDemand + client.demand) {
//			vehicleOverLoad = (route.suppliedDemand + client.demand) - route.capacity;  
//		}
//		
//		/*
//		 * variable: T(k), sum of the tardiness at every customer visited
//		 */
//		//double tardinessSum = route.sumTotalTardiness();
//		double sigma = leastTotalDistance / 100;
//		double zeta = leastTotalDistance / 10;
//		/*
//		 * Equation 12, relative to the shortest Path gathered until the moment:
//		 * 
//		 * Cost(Client) = D(k) + SIGMA*W(k) + ZETA*O(k) + KA*T(k)
//		 * 
//		 * SIGMA = 1% of D(k), ZETA = 10% of D(k), KA = 1% of D(k)
//		 */			
//		  
//		totalCost =  leastTotalDistance + sigma*(leastTravelTime) + 
//		             zeta*vehicleOverLoad; // + sigma*tardinessSum;			
//	}

	/**
	 * This constructor represents the cost to insert one client between two consecutive
	 * nodes, those are: k and k+1. The index of the client in his respective route
	 * is also stored for future indexing.
	 */
	public CostInsertionBetweenPath
	(TWVehicleRoute route, int k, TWClient client, int index)
	{
		this.client = client;
		this.clientIndex = index;
		this.k = k;
		this.clientK = route.getClient(k);
		this.l = k+1;

		if (l < route.getNumServicedClients()) 
		{
			this.clientL = route.getClient(l);
		}
		
		TWVehicleRoute clone = route.relaxedTWClientInsertion(client, l);
		
		/*
		 * variable: D(k), total distance traveled by vehicle k
		 */			
		double leastTotalDistance = clone.totalDistance;
		
		/*
		 * variable: W(k), total travel time consumed by route
		 */			
		double leastTravelTime = clone.totalTravelTime;		

		/*
		 * variable: O(k), overload of vehicle k, the positive difference.
		 */
		double vehicleOverLoad = 0;
		if (clone.capacity < clone.suppliedDemand) {
			vehicleOverLoad = clone.suppliedDemand - clone.capacity;  
		}
		
		/*
		 * variable: T(k), sum of the tardiness for every customer at each index
		 * acumulated after index k, those are: k+1, k+2... n(final client index).
		 */
		double tardinessSum = clone.sumTotalTardiness(l);
				
		double sigma = leastTotalDistance / 100;
		double zeta = leastTotalDistance / 10;
		
		/*
		 * Equation 12, relative to the shortest Path gathered until the moment:
		 * 
		 * Cost(Client) = D(k) + SIGMA*W(k) + ZETA*O(k) + KA*T(k)
		 * 
		 * SIGMA = 1% of D(k), ZETA = 10% of D(k), KA = 1% of D(k)
		 */					  
		totalCost =  leastTotalDistance + sigma*(leastTravelTime) + 
		             zeta*vehicleOverLoad + sigma*tardinessSum;
	}

	/**
	 * Computes the cost of inserting 2 clients in given index i.
	 * 
	 * 
	 * 
	 * ATENTION: Deprecated!
	 * 
	 * 
	 * @param route
	 * @param client1
	 * @param client2
	 * @param k
	 */
//	public CostInsertionBetweenPath
//	(TWVehicleRoute route, TWClient client1, TWClient client2, int k)
//	{
//		this.client = client1;
//		this.k = k;
//		this.clientK = route.getClient(k);
//		this.l = k+1;
//		this.clientL = route.getClient(l);
//
//		if (l < route.getNumServicedClients()) {
//		
//		/*
//		 * variable: D(k), total distance traveled by vehicle k
//		 */			
//		double leastTotalDistance = route.totalDistance - tsProblemRef.getDistance(clientK.nodeIndex, clientL.nodeIndex);
//		leastTotalDistance += tsProblemRef.getDistance(clientK.nodeIndex, client1.nodeIndex) +
//		            + tsProblemRef.getDistance(client1.nodeIndex, client2.nodeIndex) +
//					+ tsProblemRef.getDistance(client2.nodeIndex, clientL.nodeIndex);
//
//		/*
//		 * variable: W(k), total travel time consumed by route
//		 */			
//		double leastTravelTime = route.totalTravelTime - TravelTimeUtil.travelTime(clientK.nodeIndex, clientL.nodeIndex);
//		leastTravelTime += TravelTimeUtil.travelTime(clientK.nodeIndex, client1.nodeIndex)
//		                + TravelTimeUtil.travelTime(client1.nodeIndex, client2.nodeIndex)
//		                + TravelTimeUtil.travelTime(client2.nodeIndex, clientL.nodeIndex);		
//
//		/*
//		 * variable: O(k), overload of vehicle k
//		 */
//		int vehicleOverLoad = 0;
//		if (route.capacity < (route.suppliedDemand + client1.demand + client2.demand) ) {
//			vehicleOverLoad = (route.suppliedDemand + client1.demand + client2.demand)
//			- route.capacity;  
//		}
//		
//		/*
//		 * variable: T(k), sum of the tardiness at every customer visited
//		 */
//		//double tardinessSum = route.sumTotalTardiness();
//		double sigma = leastTotalDistance / 100;
//		double zeta = leastTotalDistance / 10;
//		
//		/*
//		 * Equation 12, relative to the shortest Path gathered until the moment:
//		 * 
//		 * Cost(Client) = D(k) + SIGMA*W(k) + ZETA*O(k) + KA*T(k)
//		 * 
//		 * SIGMA = 1% of D(k), ZETA = 10% of D(k), KA = 1% of D(k)
//		 */					  
//		totalCost =  leastTotalDistance + sigma*(leastTravelTime) + 
//		             zeta*vehicleOverLoad; // + sigma*tardinessSum;
//		} else {		
//			totalCost = Double.MAX_VALUE;	
//		}		
//	}
	
	public int compareTo(Object arg0) {

		// type cast checking ? no.
		CostInsertionBetweenPath arg = (CostInsertionBetweenPath) arg0;

		if (totalCost < arg.totalCost) {
			return -1;
		} else if (totalCost > arg.totalCost) {
			return 1;
		} 
		return 0; 			
	}

	public boolean equals(Object obj) {
		CostInsertionBetweenPath arg = (CostInsertionBetweenPath) obj;
		return (this.client.nodeIndex == arg.client.nodeIndex &&
				this.totalCost == arg.totalCost);
	}						
}	