package tccrouter.gbl.common.entity;

public class Client {
	
	// public fields for performance gain
	public int nodeIndex;
	public int demand;

	public Client(int index, int demand) {
		this.demand = demand;
		nodeIndex = index;
	}
	
	public String toString() {
		
		return "Client: " + nodeIndex + " Demand: " + demand;
	}								
	
	public Object clone() {
		Client clone = new Client(this.nodeIndex, this.demand);
		return clone;
	}	
}
