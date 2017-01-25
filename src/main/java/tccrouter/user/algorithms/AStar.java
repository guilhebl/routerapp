package tccrouter.user.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

import tccrouter.diamante.core.command.Algorithm;
import tccrouter.diamante.core.graph.Edge;
import tccrouter.diamante.core.graph.Graph;
import tccrouter.diamante.core.graph.Node;
import tccrouter.diamante.core.graph.property.ComponentProperties;
import tccrouter.diamante.core.util.OutputSender;
import tccrouter.diamante.extension.graph.property.ID;
import tccrouter.diamante.extension.graph.property.Position;
import tccrouter.gbl.common.entity.ExecutionTrace;
import tccrouter.gbl.common.entity.TSProblemModel;

public class AStar extends Algorithm {

	
	public static int MAX_PATH_LENGTH = 99999999;
	public static int ESTIMATE_BALANCE_FACTOR = 100;
	
	/**
	 * Reference to the ExecutionTrace object to measure execution performance
	 */
    ExecutionTrace executionTrace;	
	
	/**
	 * Array to indicate whether or not a node has been visited.
	 */
	LinkedList openNodes;	
	LinkedList closedNodes;
	
	/**
	 * The node from which the search will start.
	 */
	int start;
	/**
	 * The active node Index for temporary evaluations.
	 */
	int activeNode;
	
	/**
	 * The active node Heuristic Information
	 */
	NodeHeuristicData expandedNode; 			
	
	/**
	 * The goal node from which the search will end.
	 */
	int goal;
	
	/**
	 * The goal node relative position on the workspace
	 */
	Position goalPosition;
	
	/**
	 * The acumulated path length.
	 */
	double acumulatedDistance;
	/**
	 * The shortest path to the goal found until the moment.
	 */
	double shortestPath;
	
	/**
	 * if the graph is an euclidian graph, then lower bound estimates will work
	 * otherwise the AStar algorithm turns a Branch and Bound.
	 * 
	 * Only use this algorithm in a Graph that has 100% Euclidian Edges.
	 * 
	 */
//	boolean euclidianGraph;
	
	/**
	 * if the algorithm has to return some visual feedback to the GUI
	 */
	boolean visualFeedback; 
	boolean measureExecution; 
	
	/**
	 * Creates an instance of this algorithm. Following the GraphEditor standard
	 * for algorithm parameters, the first parameter should always be a graph, 
	 * followed by the nodes that the algorithm requires.
	 * @param g the graph on which the algorithm will be run
	 * @param start the starting node of the depth search
	 */
	public AStar (Graph g) {
		super(g,"A*");
		start = TSProblemModel.getInstance().getSourceNodeIndex();
		goal = TSProblemModel.getInstance().getClient(0);
		openNodes = new LinkedList();
		closedNodes = new LinkedList();
		shortestPath = MAX_PATH_LENGTH;

		/*
		 * the goal node position for later estimates:
		 */
		ComponentProperties cp = g.getNode(goal).getProperties();
		goalPosition = (Position)cp.getPropertyByName("Position");
		visualFeedback = TSProblemModel.getInstance().isVisualFeedback();
		measureExecution = TSProblemModel.getInstance().isAStarExecutionMeasure();
		
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

		/* 
		 * From a one-element queue consisting of a zero-length path that contains
		 * only the root node.
		 */		
		activeNode = start;
		acumulatedDistance = 0;
		expandedNode = new NodeHeuristicData(g.getNode(start),0,0);
		openNodes.add(expandedNode);
		
		/* 
		 * Until the first path in the queue terminates at the goal node or the queue
		 * is empty:
		 */
		while (!openNodes.isEmpty()) {		
			/*
			 * Remove the first path from the queue; 
			 */
//			showOpenNodes();
//			showClosedNodes();
			if (measureExecution) {
				executionTrace.iterationTrace();
			}			
			
			expandedNode = (NodeHeuristicData)openNodes.removeFirst(); 			
			activeNode = expandedNode.nodeIndex;
			acumulatedDistance = expandedNode.sourceDistance;
			
			/*
			 * If the goal state has been reached, set the shortestPath
			 */		
			if (activeNode == goal) {
				shortestPath = acumulatedDistance;
				
				closedNodes.add(expandedNode);							
				break;		
			}
			
//			if (activeNode == goal) {
//				if (acumulatedDistance < shortestPath) {
//					shortestPath = acumulatedDistance;
//				}
//			}
			
			closedNodes.add(expandedNode);			
			
			/*
			 * only expands the paths shorter than the actual shortest path
			 */
			if (shortestPath > acumulatedDistance) {
			/*
			 * create new paths by extending
			 * the first path to all the neighbors of the terminal node. 
			 */
			for (int j=0; j<g.getN(); j++) {
				if (g.edgeExists(activeNode,j)) {
					
					NodeHeuristicData childNode = new NodeHeuristicData(g.getNode(j), activeNode,acumulatedDistance);
					
					/* 
					 * Dynamic Programming principle:
					 * 
					 * if the child is already on open
					 */
					if (openNodes.contains(childNode)) {
						/* 
						 * if the child was reached by a shorter path
						 * then give the state on open the shorter path
						 */
						int oldNodeIndex = openNodes.indexOf(childNode);
						NodeHeuristicData oldNode = (NodeHeuristicData)openNodes.get(oldNodeIndex);
						
						if (childNode.sourceDistance < oldNode.sourceDistance) {
							openNodes.set(oldNodeIndex,childNode);
						}
						
					} else if (closedNodes.contains(childNode)) {
						/* 
						 * if the child is already on close:
						 * if the child was reached by a shorter path then
						 * remove the state from closed, add the child to open
						 */
						int oldNodeIndex = closedNodes.indexOf(childNode);
						NodeHeuristicData oldNode = (NodeHeuristicData)closedNodes.get(oldNodeIndex);
						
						if (childNode.sourceDistance < oldNode.sourceDistance) {
							closedNodes.remove(oldNodeIndex);
							openNodes.add(childNode);
						}
						
						
					} else {
						// add the remaining new paths to the queue.
						openNodes.add(childNode);
					}				
				}								
			}							
					
			/*
			 *  Sort the entire queue by path length added by remaining distance estimates
			 *  with least-cost paths in front.
			 */
			Collections.sort(openNodes);			
			}
			
		}

		/*
		 * final time captured
		 */
		if (measureExecution) {
			executionTrace.finalTrace();
		}
				
//		showOpenNodes();
//		showClosedNodes();
		
		buildPath();
		
		if (visualFeedback && measureExecution) {
		// Shows a reply message with the label and time of execution
		OutputSender.showMessageDialog(
			"Total execution Time: "+
				executionTrace.getFinalTime() + " ms",
			"Measured Time",
			OutputSender.INFORMATION_MESSAGE
		);
		}
		
	}
	/**
	 * Stores the new found shortest path in the shortest path Matrix 
	 * at the Graph class.
	 * Colors all the nodes that represents the result path
	 */
	void buildPath () {

		NodeHeuristicData element = (NodeHeuristicData) closedNodes.removeLast();
		ArrayList resultingPath = new ArrayList();

		/*
		 * the goal node remains in the closedNodes list
		 */		
		while (element.nodeIndex != goal ) {
			element = (NodeHeuristicData) closedNodes.removeLast();
		}
		
		int fatherIndex = element.fatherIndex;
		
		while (element.nodeIndex != start && !closedNodes.isEmpty()) {
			// Set the current color to node iter
			if (element.nodeIndex != start && element.nodeIndex != goal) {
				
				if (visualFeedback) {			        
					g.setNodeProperty(element.nodeIndex,"ComponentColor","45,255,45");
				}
			}			    
				
			// Color the edges between the actual node and his father in the path							
			if(g.e(element.nodeIndex,fatherIndex)) {
			    	 // Highlight the edge that has been used in the search path
			    	 Edge e = g.getEdge(element.nodeIndex,fatherIndex);
												
			    	 if (e != null) {							
			    		 resultingPath.add(e);
			    		 
		    			if (visualFeedback) {
		    				g.setEdgeProperty(element.nodeIndex,fatherIndex,"ComponentColor","0,0,255");
		    			}
			    	 }
			}
			
			element = (NodeHeuristicData) closedNodes.removeLast();
			
			/*
			 * need to search for the father of the active node.
			 */
			for (Iterator iter = closedNodes.iterator(); iter.hasNext() && element.nodeIndex != fatherIndex;) {
				element = (NodeHeuristicData)iter.next();				
			}
			
			fatherIndex = element.fatherIndex;
			
			// Color the last edge between from the start node							
			if(fatherIndex == start) {

				// Highlight the edge that has been used in the search path			    
				Edge e = g.getEdge(element.nodeIndex,start);												
			    	 
				if (e != null) {
					
					if (visualFeedback) {
						g.setEdgeProperty(element.nodeIndex,start,"ComponentColor","0,0,255");
					}
				}
			}			
		}
		
		g.setShortestPath(start, goal, resultingPath);
	}
	
	/**
	 * Internal Class NodeHeuristicData
	 * 
	 * DataObjectWrapper, represents the heuristic knowledge needed to guide the search
	 * algorithm.
	 */
	class NodeHeuristicData implements Comparable {
		
		/*
		 * public fields for obtaining performance
		 */
		public int nodeIndex;
		public int fatherIndex;
		public double sourceDistance;
		public double goalDistanceEstimate;		
		public double fatherSourceDistance;		
				
		public NodeHeuristicData(Node node, int father,double fatherDistanceFromSource) {
			
			fatherSourceDistance = fatherDistanceFromSource;
			ComponentProperties cp = node.getProperties();
			nodeIndex = ((ID)cp.getPropertyByName("ID")).getValue();
			
			if (nodeIndex == start) {
			    sourceDistance = 0;
			    fatherIndex = start;
			}
			else {
				sourceDistance = fatherDistanceFromSource + g.shortestPathDistance(father,nodeIndex);
				fatherIndex = father;
			}
			
			/*
			 * goal distance estimate is based on the X,Y coordenates of the workspace.
			 */
			Position nodePosition = (Position)cp.getPropertyByName("Position");
			goalDistanceEstimate = Math.sqrt( 
					Math.pow(Math.abs(goalPosition.getX() - nodePosition.getX()), 2) +
					Math.pow(Math.abs(goalPosition.getY() - nodePosition.getY()), 2) );
			
			if ( goalDistanceEstimate > 0 )
			     goalDistanceEstimate = (goalDistanceEstimate / ESTIMATE_BALANCE_FACTOR); 
		}

		public int compareTo(Object arg0) {
				
			NodeHeuristicData arg = (NodeHeuristicData) arg0;
			double heuristicValue = goalDistanceEstimate + sourceDistance;
			double argHeuristicValue = arg.goalDistanceEstimate + arg.sourceDistance;
			
			if (heuristicValue < argHeuristicValue) {
				return -1;
			} else if (heuristicValue > argHeuristicValue) {
				return 1;
			} 
			return 0; 			
		}

		public boolean equals(Object obj) {
			NodeHeuristicData arg = (NodeHeuristicData) obj;
			return (nodeIndex == arg.nodeIndex);
		}						
	}
}
