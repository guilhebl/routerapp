package tccrouter.gbl.common.entity;

/**
 * Internal Class NodeHeuristicData
 * 
 * DataObjectWrapper, represents the euclidian distance between 2 nodes
 * in the graph in a cartesian plane.
 */
public class NodeEuclidianDistance implements Comparable {
	
	/*
	 * public fields for obtaining performance
	 */
	public int clientIndex;
	public double euclidianDistance;
			
	public NodeEuclidianDistance(int clientI, int fromJ) {
		clientIndex = clientI;
		euclidianDistance = TSProblemModel.getInstance().getEuclidianDistance(clientI, fromJ);
	}

	public int compareTo(Object arg0) {				
		NodeEuclidianDistance arg = (NodeEuclidianDistance) arg0;
		
		if (euclidianDistance < arg.euclidianDistance) {
			return -1;
		} else if (euclidianDistance > arg.euclidianDistance) {
			return 1;
		} 
		return 0; 			
	}

	public boolean equals(Object obj) {
		NodeEuclidianDistance arg = (NodeEuclidianDistance) obj;
		return (clientIndex == arg.clientIndex);
	}						
}	
