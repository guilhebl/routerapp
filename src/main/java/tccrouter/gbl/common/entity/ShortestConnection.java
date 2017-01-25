package tccrouter.gbl.common.entity;

import tccrouter.diamante.core.graph.Edge;
import tccrouter.diamante.extension.graph.property.EdgeWeight;

/**
 * 
 * @author Guilherme
 *
 * Represents the shortest edge between two nodes
 */
public class ShortestConnection {

	private Edge edge;
	
	/*
	 * the condition state 
	 */
	private int conditions;
		
	public ShortestConnection(Edge edge) {
		this.edge = edge;
		this.conditions = 5;  // default conditions
	}

	public Edge getEdge() {
		return edge;
	}

	public void setEdge(Edge edge) {
		this.edge = edge;
	}
	
	public double getDistance() {
		return ((EdgeWeight)edge.getProperties().getPropertyByName("EdgeWeight")).getValue();
	}

	public int getV1() {
		return edge.getV1();
	}

	public int getV2() {
		return edge.getV2();
	}

	public int getConditions() {
		return conditions;
	}

	public void setConditions(int conditions) {
		this.conditions = conditions;
	}	
	
	
}
