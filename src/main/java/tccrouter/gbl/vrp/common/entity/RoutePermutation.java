package tccrouter.gbl.vrp.common.entity;

import tccrouter.gbl.vrp.tw.entity.TWVehicleRoute;

/**
 * Class NodeHeuristicData
 * 
 * DataObjectWrapper, represents the heuristic knowledge needed to guide the
 * algorithm.
 */
public class RoutePermutation implements Comparable {
	
	/*
	 * public fields for obtaining performance
	 */
	public TWVehicleRoute routeI;
	public TWVehicleRoute routeJ;
	/*
	 * The index of respective routes.
	 */
	public int i;
	public int j;
	/*
	 * Saving expressed between the difference from their original forms.
	 */		
	public double savings;
			
	public RoutePermutation
	(TWVehicleRoute routeI, int i, TWVehicleRoute routeJ, int j, double savings)
	{
		this.routeI = routeI;
		this.routeJ = routeJ;
		this.i = i;
		this.j = j;
		this.savings = savings;
	}

	public int compareTo(Object arg0) {

		// type cast checking ? no.
		RoutePermutation arg = (RoutePermutation) arg0;

		if (savings < arg.savings) {
			return -1;
		} else if (savings > arg.savings) {
			return 1;
		} 
		return 0; 			
	}

	public boolean equals(Object obj) {
		RoutePermutation arg = (RoutePermutation) obj;
		
		return ((this.i == arg.i || this.i == arg.j) 
				|| ((this.j == arg.j) ||(this.j == arg.i)));
	}						
}
