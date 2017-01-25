package tccrouter.gbl.common.util;

import tccrouter.gbl.common.entity.TSProblemModel;

public class TravelTimeUtil {
	
	static double meanVelocity;
	static double unitDistanceTime;
	
	
	public static double getMeanVelocity() {
		return meanVelocity;
	}


	public static void setMeanVelocity(double meanVelocity) {
		TravelTimeUtil.meanVelocity = meanVelocity;
		updateUnitDistanceTime();
	}


	public static double getUnitDistanceTime() {
		return unitDistanceTime;
	}


	private static void updateUnitDistanceTime() {
		unitDistanceTime = (1.0/meanVelocity);
	}


	/**
	 * Returns the travel time measured as:
	 * 
	 *  distance between each node (km)
	 *  /
	 *  mean vehicle velocity (km/h)
	 *  
	 * @param fromNodeIndex
	 * @param toNodeIndex
	 * @return hours of travel between two nodes.
	 */
	public static double travelTime(int fromNodeIndex, int toNodeIndex) {
		double distance = TSProblemModel.getInstance().getDistance(fromNodeIndex, toNodeIndex);		
		//return Math.round((distance) * VRProblemModel.UNIT_DISTANCE_TIME);
		return distance* unitDistanceTime;
	}

}
