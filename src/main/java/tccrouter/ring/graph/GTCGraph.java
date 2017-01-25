package tccrouter.ring.graph;

import java.awt.Color;
import java.util.ArrayList;

import tccrouter.diamante.core.graph.Edge;
import tccrouter.diamante.core.graph.Graph;
import tccrouter.diamante.core.graph.Node;
import tccrouter.diamante.core.graph.property.ComponentProperties;
import tccrouter.diamante.extension.graph.property.ComponentColor;
import tccrouter.diamante.extension.graph.property.EdgeWeight;
import tccrouter.diamante.extension.graph.property.ID;
import tccrouter.diamante.extension.graph.property.Label;
import tccrouter.diamante.extension.graph.property.Position;
import tccrouter.gbl.common.entity.ShortestPath;
import tccrouter.ring.controller.PreferencesController;

/**
 * A simple graph implementation that uses an adjacencies matrix to represent
 * edges.
 */
public class GTCGraph extends Graph {

	/**
	 * The maximum number of nodes that can be represented by this class.
	 */
	public static final int MAX_NODES = 200;
	/**
	 * The adjacencies matrix that represents the edges in a graph.
	 */
	private boolean [][] adjacencies;
	private Edge [][] edgesMatrix;
	
	/**
	 * The shortest Path matrix.
	 */	
	private ShortestPath [][] shortestPaths;

	/**
	 * Creates an instance of this class and sets all positions in the adjacencies
	 * matrix to 'false'.
	 */
	public GTCGraph() {
		super();
		
		adjacencies = new boolean [MAX_NODES][MAX_NODES];
		edgesMatrix = new Edge [MAX_NODES][MAX_NODES];
		shortestPaths = new ShortestPath [MAX_NODES][MAX_NODES];
		
		for (int i=0 ; i<MAX_NODES ; i++)
			for (int j=0 ; j<MAX_NODES ; j++)
				adjacencies[i][j] = false;
	}

	/**
	 * Checks whether or not there is an edge from n1 to n2
	 * @see diamante.core.graph.Graph#e(int, int)
	 */
	public boolean edgeExists (int n1, int n2) {
		return adjacencies[n1][n2];
	}

	/**
	 * Add a new edge to this graph.
	 * @see diamante.core.graph.Graph#addEdge(diamante.core.graph.Edge)
	 */
	public void addEdge(Edge newEdge) {
		trimEdgeProperties(newEdge);
		
		int v1 = newEdge.getV1();
		int v2 = newEdge.getV2();
		
		// adds the new edge to the adjacencies matrix
		adjacencies[v1][v2] = true;
		adjacencies[v2][v1] = true;

		// calculates the new distance between the two nodes:
		updateShortestPath(v1, v2,0, newEdge);		
		
		/* 
		 * adds the new edge to the edges list so that edges
		 * properties can be accessed
		 */
		//edges.addElement(newEdge);
		Edge mirrorEdge = new Edge(v2,v1,newEdge.getProperties());
		edgesMatrix[v1][v2] = newEdge;
		edgesMatrix[mirrorEdge.getV1()][mirrorEdge.getV2()] = mirrorEdge;
	}

	/**
	 * Method that updates a segment of the shortest path found until the moment for
	 * nodes v1, v2.
	 * 
	 * @param v1 source node of path
	 * @param v2 destiny node of path
	 * @param segment the number of the segment in the entire path
	 * @param newWeight distance of the measured segment
	 * 
	 */
	private void updateShortestPath(int v1, int v2,int segment, Edge newEdge) {
		
		ShortestPath path;
		
		/*
		 * to use only half the shortestPath Matrix.
		 */
		if (v1 > v2) {	
			path = shortestPaths[v2][v1];			 
		} else {
			 path = shortestPaths[v1][v2];
		}
		
		if (path != null) {
			double oldWeight = (path.getShortestConnection(segment)).getDistance();
			double newWeight = ((EdgeWeight)newEdge.getProperties().getPropertyByName("EdgeWeight")).getValue();
			
            /*
             * updates the shortest Edge between the two nodes.
             */ 
			if (oldWeight > newWeight) {
				path.updateShortestConnectionEdge(newEdge,segment);
			}
		} else {
			// new Shortest Path
			path = new ShortestPath();			
			path.addShortestConnection(newEdge,segment);
		}		
		
		if (v1 > v2) {	
  			path.setV1(v2);
			path.setV2(v1);
			shortestPaths[v2][v1] = path;			 
		} else {
  			path.setV1(v1);
			path.setV2(v2);
			shortestPaths[v1][v2] = path;			 
		}		
	}

	/**
	 * Checks if an edge has all the required edge properties for this
	 * graph. If it doesn't, the unexistent properties will be added.
	 * @param edge the edge to be trimmed
	 */
	protected void trimEdgeProperties(Edge edge) {
		ComponentProperties properties = edge.getProperties();
		
		if (properties.getPropertyByName("ComponentColor") == null) {
			ComponentColor color = new ComponentColor();
			
			color.setValue(
				PreferencesController.getInstance().getColor(
					PreferencesController.PROPERTIES_CATEGORY,
					PreferencesController.EDGE_COLOR_PROPERTY,
					Color.BLACK
				)
			);
			
			properties.addProperty(color);
		}

		if (properties.getPropertyByName("EdgeWeight") == null) {
			EdgeWeight weight = new EdgeWeight(generateWeight());
			properties.addProperty(weight);
		}
	}
	
	/**
	 * Removes a node from the graph
	 * @see diamante.core.graph.Graph#removeNode(int)
	 */
	public void removeNode(int v) {
		int oldSize = getN(), newI = 0, newJ = 0;
		boolean [][] newAdjacencies = new boolean[MAX_NODES][MAX_NODES];
		Edge [][] newEdgesMatrix = new Edge[MAX_NODES][MAX_NODES];
		//nodes.setElementAt(null,v);

		for (int i = v+1 ; i < oldSize ; i++) {
			Node node = getNode(i); 
			ID id = (ID) node.getProperties().getPropertyByName("ID");
			id.setValue(i-1);
			nodes.setElementAt(node,i-1);
		}
		nodes.remove(oldSize-1);
		
		for (int i = 0 ; i < oldSize ; i++) {
			if (i != v) {
				for (int j = 0 ; j < oldSize ; j++) {
					if (j != v) {
						newAdjacencies[newI][newJ] = adjacencies[i][j];
						
						Edge e = edgesMatrix[i][j];
						newEdgesMatrix[newI][newJ] = e;
						if (e != null) {
							e.setV1(newI);
							e.setV2(newJ);
						}
						newJ++; 
					}
				}
				
				newI++;
				newJ = 0;
			}
		}
		
		adjacencies = newAdjacencies;
		edgesMatrix = newEdgesMatrix;
		/*for (int i = v+1 ; i < oldSize ; i++) {
			for (int j = 0 ; j < oldSize ; j++) {
				adjacencies[i-1][j] = adjacencies[i][j];
				
				Edge e = edgesMatrix[i][j];
				edgesMatrix[i-1][j] = e;
				if (e != null)
					edgesMatrix[i-1][j].setV1(i-1);
			}
		}
		
		for (int i = 0 ; i < oldSize ; i++) {
			for (int j = v+1 ; j < oldSize ; j++) {
				adjacencies[i][j-1] = adjacencies[i][j];
				
				Edge e = edgesMatrix[i][j];
				edgesMatrix[i][j-1] = e;
				if (e != null)
					edgesMatrix[i][j-1].setV2(j-1);
			}
		}*/
	}

	/**
	 * Sets the node in the given position to a new one.
	 * @see diamante.core.graph.Graph#setNodeAt(diamante.core.graph.Node, int)
	 */
	public void setNodeAt(Node node, int i) {
		/*trimNodeProperties(node,i);
		
		nodes.setElementAt(node,i);*/
		insertNodeAt(node,i);
	}

	/**
	 * Checks if an node has all the required node properties for this
	 * graph. If it doesn't, the unexistent properties will be added.
	 * The node's position will be set to (0,0).
	 * @param node the node to be trimmed
	 * @param i the index that will be used on the node's label
	 */
	protected void trimNodeProperties(Node node, int i) {
		ComponentProperties properties = node.getProperties();
		
		if (properties.getPropertyByName("ComponentColor") == null) {
			ComponentColor color = new ComponentColor();
			
			color.setValue(
				PreferencesController.getInstance().getColor(
					PreferencesController.PROPERTIES_CATEGORY,
					PreferencesController.NODE_COLOR_PROPERTY,
					Color.BLACK
				)
			);
			
			properties.addProperty(color);
		}
		
		if (properties.getPropertyByName("Label") == null) {
			Label lbl = new Label("v" + i);
			
			properties.addProperty(lbl);
		}
		
		if (properties.getPropertyByName("Position") == null) {
			Position pos = new Position(0,0);
			
			properties.addProperty(pos);
		}
	}

	/**
	 * Inserts a node in the given position and re-locates the other nodes.
	 * @see diamante.core.graph.Graph#insertNodeAt(diamante.core.graph.Node, int)
	 */
	public void insertNodeAt(Node node, int i) {
		boolean [][] newAdj = new boolean [MAX_NODES][MAX_NODES];
		Edge [][] newEdgesMatrix = new Edge [MAX_NODES][MAX_NODES];
		int newI = 0, newJ = 0;
		
		trimNodeProperties(node,i);
		
		// updates the adjacencies matrix
		for (int k=0 ; k<this.getN() ; k++) {
			for (int l = 0 ; l<this.getN() ; l++) {
				if (i == l) {
					newAdj[newI][newJ] = false;
					newEdgesMatrix[newI][newJ] = null;
					newJ++;
				}
				newAdj[newI][newJ] = adjacencies[k][l];
				
				Edge e = edgesMatrix[k][l];
				newEdgesMatrix[newI][newJ] = e;
				if (e != null) {
					e.setV1(k);
					e.setV2(l);
				}
				newJ++;
			}
			if (i == k) {
				newAdj[newI][newJ] = false;
				newEdgesMatrix[newI][newJ] = null;
				newI++;
			}
			newI++;
			newJ = 0;
		}
				
		// updates the nodes list
		nodes.insertElementAt(node, i);
		
		for (int k = i+1 ; k < nodes.size() ; k++) {
			Node current = getNode(k);
			ID id = (ID) current.getProperties().getPropertyByName("ID");
			id.setValue(k);
		}
		
		// switches matrix reference to the new matrix 
		adjacencies = newAdj;
		edgesMatrix = newEdgesMatrix;
		for (int k=0 ; k<this.getN() ; k++) {
			adjacencies[i][k] = false;
			adjacencies[k][i] = false;
			edgesMatrix[i][k] = null;
			edgesMatrix[k][i] = null;
		}
	}

	/**
	 * Retrieves the edge between n1 and n2.
	 * @see diamante.core.graph.Graph#getEdge(int, int)
	 */
	public Edge getEdge(int n1, int n2) {
		/*Edge e;
		
		if (this.edgeExists(n1,n2)) {
			for (int i=0 ; i<edges.size() ; i++) {
				e = (Edge) edges.elementAt(i);
				if ((n1==e.getV1() && n2==e.getV2()) ||
					(n1==e.getV2() && n2==e.getV1()))
					return e;
			}
		}
		return null;*/
		return edgesMatrix[n1][n2];
	}

	/**
	 * Removes the edge between n1 and n2 from this graph.
	 * @see diamante.core.graph.Graph#removeEdge(int, int)
	 */
	public void removeEdge(int n1, int n2) {
		//Edge e;
		
		// remove the edge from the adjacencies matrix
		adjacencies[n1][n2] = false;
		adjacencies[n2][n1] = false;
		
		// remove the edge from the edges list
		edgesMatrix[n1][n2] = null;
		edgesMatrix[n2][n1] = null;
		/*for (int i=0 ; i<edges.size() ; i++) {
			e = (Edge) edges.elementAt(i);
			if ((n1==e.getV1() && n2==e.getV2()) ||
				(n1==e.getV2() && n2==e.getV1()))
				edges.remove(e);
		}*/
	}
	
	/**
	 * Randomly generates weight for an edge.
	 * @return the generated weight
	 */
	int generateWeight() {
		int weight = (int)(10*Math.random());
		if (weight == 0) weight = 1;
		
		return weight;
	}
	
	
	/**
	 * @see diamante.core.graph.Graph#getN()
	 */
	public int getN() {
		int n = 0;
		
		for (int i=0 ; i<nodes.size() ; i++)
			if (nodes.elementAt(i) != null)
				n++;
			
		return n;
	}

    /*
     * methods added by Guilherme Becker L. for the AI algorithms
     * implementation
     */    	
    /**
     * @param i
     * @param j 
     * @return shortest known path distance between the two selected nodes.
     */    	
	public double shortestPathDistance(int i, int j) {
		
		if (i > j) {
			return shortestPaths[j][i].getDistance();
		} else if (i < j) {
    		return shortestPaths[i][j].getDistance();
		}
		
		return 0;
	}

    /**
     * @param i
     * @param j
     * @param edgeSet the new Optimal path between the two nodes 
     */    	
	public void setShortestPath(int i, int j, ArrayList edgeSet) {
		if (i > j) {
			ShortestPath sp = shortestPaths[j][i];
			
			if (sp == null) {
				sp = new ShortestPath();
				sp.setV1(j);
				sp.setV2(i);				
			}
			
			sp.updateShortestPath(edgeSet);
			shortestPaths[j][i] = sp;
		} else { 
			ShortestPath sp = shortestPaths[i][j];
			
			if (sp == null) {
				sp = new ShortestPath();
				sp.setV1(i);
				sp.setV2(j);				
			}
			
			sp.updateShortestPath(edgeSet);
			shortestPaths[i][j] = sp;
		}		
	}
	
    /**
     * @param i
     * @param j 
     * @return exists a path between the two selected nodes.
     */        	
	public boolean existsPath(int i, int j) {
		
		if (i > j) {
			return (shortestPaths[j][i] != null);
		} 
		
		return (shortestPaths[i][j] != null);
	}

    /**
     * @param i
     * @param j 
     * @return shortest known path between the two selected nodes.
     */    	
	public ShortestPath getShortestPath(int i, int j) {
		if (i > j) {
			return (shortestPaths[j][i]);
		} 
		
		return (shortestPaths[i][j]);
	}

	public void updateShortestPathDistance(int i, int j) {
		if (i > j) {
			shortestPaths[j][i].updateDistance();
		} else {
			shortestPaths[i][j].updateDistance();
		}				
	}
	
}