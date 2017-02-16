package tccrouter.user.algorithms;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import tccrouter.diamante.core.command.Algorithm;
import tccrouter.diamante.core.graph.Edge;
import tccrouter.diamante.core.graph.Graph;
import tccrouter.diamante.core.graph.Node;
import tccrouter.diamante.core.graph.property.ComponentProperties;
import tccrouter.diamante.core.util.OutputSender;
import tccrouter.diamante.extension.graph.property.ID;
import tccrouter.gbl.common.entity.ExecutionTrace;
import tccrouter.gbl.common.entity.TSProblemModel;

public class NearestNeighbor extends Algorithm {

	
	public static int MAX_PATH_LENGTH = 9999999;
	/**
	 * Array to indicate whether or not a node has been visited.
	 */
	private LinkedList<NodeHeuristicData> openNodes;	
	private LinkedList<NodeHeuristicData> closedNodes;
	
	/**
	 * Reference to the ExecutionTrace object to measure execution performance
	 */
	private ExecutionTrace executionTrace;	
	
	/**
	 * The node from which the search will start.
	 */
	private int start;
	/**
	 * The active node Index for temporary evaluations.
	 */
	private int activeNode;
	
	/**
	 * The active node Heuristic Information
	 */
	private NodeHeuristicData expandedNode; 			
	
	/**
	 * The goal nodes from which the search will end.
	 */
	private int goals[];

	private boolean measureExecution; 
	
	/**
	 * Creates an instance of this algorithm. Following the GraphEditor standard
	 * for algorithm parameters, the first parameter should always be a graph, 
	 * followed by the nodes that the algorithm requires.
	 * @param g the graph on which the algorithm will be run
	 * @param start the starting node of the depth search
	 */
	public NearestNeighbor (Graph g) {
		super(g,"NearestNeighbor");
		TSProblemModel.getInstance().validateModel();
		start = TSProblemModel.getInstance().getSourceNodeIndex();		
		goals = TSProblemModel.getInstance().getClientNodes();
		
		openNodes = new LinkedList<>();
		closedNodes = new LinkedList<>();
		
		/*
		 * update the shortest Path Matrix
		 */
		TSProblemModel.getInstance().prepareDistancesMatrix(g);
		measureExecution = TSProblemModel.getInstance().isExecutionMeasure();
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
		activeNode = start;
		
		for (int i = 0; i < goals.length; i++) {			
			expandedNode = new NodeHeuristicData(g.getNode(goals[i]),start,g.shortestPathDistance(start, goals[i]));
			openNodes.add(expandedNode);
		}
		
		expandedNode = new NodeHeuristicData(g.getNode(start),0,0);
		closedNodes.add(expandedNode);		
		
		/*
		 * process of finding the shortestDistance, "nearest neighbor" for all the
		 * active nodes and the start node involved in the algorithm
		 * is obtained by sorting the ArrayList.
		 */		
		Collections.sort(openNodes);
		
		/* 
		 * Until the queue is empty:
		 */
		while (!openNodes.isEmpty()) {

			if (measureExecution) {
				executionTrace.iterationTrace();
			}

			/*
			 * Remove the first path from the queue; 
			 */
			expandedNode = openNodes.removeFirst(); 			
			activeNode = expandedNode.nodeIndex;
			
			setNewFather(activeNode);
			closedNodes.add(expandedNode);
								
			/*
			 *  Sort the entire queue by path length added by remaining distance estimates
			 *  with least-cost paths in front.
			 */
			Collections.sort(openNodes);			
		}

		/*
		 * final time captured
		 */
		if (measureExecution) {
			executionTrace.finalTrace();
		}
		colorPath();
				
		// Shows a reply message with the label and time of execution
		OutputSender.showMessageDialog(
			"Total execution Time: "+
				executionTrace.getFinalTime() + " ms",
			"Measured Time",
			OutputSender.INFORMATION_MESSAGE
		);		
	}

	private void setNewFather(int activeNode2) {
		for (Iterator<NodeHeuristicData> iter = openNodes.iterator(); iter.hasNext();) {
			NodeHeuristicData element = (NodeHeuristicData) iter.next();
			element.fatherIndex = activeNode2;
			element.fatherDistance = g.shortestPathDistance(element.nodeIndex, activeNode2);
		}				
	}

	/**
	 * Colors all the nodes that represents the result path
	 */
	void colorPath () {
		
		while (!closedNodes.isEmpty()) {
			NodeHeuristicData element = (NodeHeuristicData) closedNodes.removeFirst();
			// Color the edges between the actual node and his father in the path							
			
			if(g.existsPath(element.nodeIndex,element.fatherIndex)) {
		    	 // Highlight the edge that has been used in the search path
		    	List<Edge> edges = (g.getShortestPath
		    	(element.nodeIndex,element.fatherIndex)).getEdgeSet();
		    	
		    	for (Iterator<Edge> iter = edges.iterator(); iter.hasNext();) {
		    		Edge e = iter.next();
		    		
			    	 if (e != null) {
			    		 g.setEdgeProperty(e.getV1(),e.getV2(),"ComponentColor","0,0,255");
			    	 }					
				}		    	
			}
			
			if(closedNodes.isEmpty()) {
		    	List<Edge> edges = (g.getShortestPath(element.nodeIndex,start)).getEdgeSet();
		    	
		    	for (Iterator<Edge> iter = edges.iterator(); iter.hasNext();) {
		    		Edge e = iter.next();
		    		
			    	 if (e != null) {
			    		 g.setEdgeProperty(e.getV1(),e.getV2(),"ComponentColor","0,0,255");
			    	 }					
				}		    	
			}
			
		}
	}
	
	/**
	 * Internal Class NodeHeuristicData
	 * 
	 * DataObjectWrapper, represents the heuristic knowledge needed to guide the search
	 * algorithm.
	 */
	class NodeHeuristicData implements Comparable<NodeHeuristicData> {
		
		/*
		 * public fields for obtaining performance
		 */
		public int nodeIndex;
		public int fatherIndex;
		public double fatherDistance;		
				
		public NodeHeuristicData(Node node, int father,double fatherDistance) {
			
			this.fatherDistance = fatherDistance;
			ComponentProperties cp = node.getProperties();
			nodeIndex = ((ID)cp.getPropertyByName("ID")).getValue();
			
			if (nodeIndex == start) {
			    fatherIndex = start;
			}
			else {
				fatherIndex = father;
			}			
		}

		/**
		 * Compares the distance of the current node and the arg node to it�s
		 * common father
		 * 
		 * @param arg0
		 * @return
		 */
		@Override
		public int compareTo(NodeHeuristicData o) {
			if (this.fatherIndex == o.fatherIndex) {
			if (fatherDistance < o.fatherDistance) {
				return -1;
			} else if (fatherDistance > o.fatherDistance) {
				return 1;
			} 
			}
			return 0; 						
		}						

		public boolean equals(Object obj) {
			NodeHeuristicData arg = (NodeHeuristicData) obj;
			return (nodeIndex == arg.nodeIndex);
		}
	}
}
