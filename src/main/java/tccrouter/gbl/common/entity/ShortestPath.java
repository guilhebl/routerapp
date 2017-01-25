package tccrouter.gbl.common.entity;

import java.util.ArrayList;
import java.util.Iterator;

import tccrouter.diamante.core.graph.Edge;

public class ShortestPath {

	private int v1;
	private int v2;	
	private double distance;
	private ArrayList path;
	
	public ShortestPath() {
		v1 = -1;
		v2 = -1;
		distance = 0.0D;
		path = new ArrayList();
	}

	public ShortestPath(int v1,int v2, double distance) {
		this.v1 = v1;
		this.v2 = v2;
		this.distance = distance;
		path = new ArrayList();
	}
	
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public int getV1() {
		return v1;
	}
	public void setV1(int node) {
		this.v1 = node;
	}
	public int getV2() {
		return v2;
	}
	public void setV2(int v2) {
		this.v2 = v2;
	}
	
	/**
	 * 
	 * @param newEdge 
	 * @param segment the order in wich the segment corresponds in the path
	 *                of edges from the source to final node.
	 */
	public void addShortestConnection(Edge newEdge, int segment) {
		ShortestConnection sc = new ShortestConnection(newEdge);
		path.add(segment,sc);
		updateDistance();
	}
	
	public void removeShortestConnection(int segment) {		
		path.remove(segment);
	}
	
	public ShortestConnection getShortestConnection(int segment) {		
		return (ShortestConnection)path.get(segment);
	}

	public void updateShortestConnectionEdge(Edge newEdge, int segment) {
		((ShortestConnection)path.get(segment)).setEdge(newEdge);
		updateDistance();
	}

	public void updateShortestPath(ArrayList edgeSet) {
		
		path = new ArrayList();
		
		for (Iterator iter = edgeSet.iterator(); iter.hasNext();) {
			Edge element = (Edge) iter.next();
			ShortestConnection sc = new ShortestConnection(element);
			path.add(sc);	
		}
		
		updateDistance();
	}

	/**
	 * retrieves all the nodes from routeX 
	 * that are inside the Shortest Path
	 * 
	 * @return all common nodes inside Path.
	 */	
	public ArrayList getNodeSet(ArrayList nodeIDs) {

		ArrayList nodeList = new ArrayList();
		boolean modified = false;
		
		for (Iterator iter = nodeIDs.iterator(); iter.hasNext();) {
			Integer element = (Integer) iter.next();
			if (isNodeInPath(element.intValue())) {
				    modified = true;
					nodeList.add(element);
			}
		}
		
		if (! modified) {
			return null;
		}
		return nodeList;
	}

	public ArrayList getEdgeSet() {

		ArrayList edgeSet = new ArrayList();
		for (Iterator iter = path.iterator(); iter.hasNext();) {
			ShortestConnection element = (ShortestConnection) iter.next();
			Edge edge = element.getEdge();
			edgeSet.add(edge);	
		}
		
		return edgeSet;
	}	
	public boolean isNodeInPath(int index) {

		for (Iterator iter = path.iterator(); iter.hasNext();) {
			ShortestConnection element = (ShortestConnection) iter.next();
			
			if ( (element.getV1() == index) || (element.getV2() == index) ) 
			{
				return true;
			}
		}
		
		return false;
	}
	
	public void updateDistance() {
		
		distance = 0;
		
		for (Iterator iter = path.iterator(); iter.hasNext();) {
			ShortestConnection element = (ShortestConnection) iter.next();
			distance += element.getDistance();			
		}
	}
	
}
