package tccrouter.gbl.vrp.tw.entity;

import tccrouter.gbl.common.entity.Client;
import tccrouter.gbl.vrp.common.entity.VRProblemModel;


public class TWClient extends Client {
	
	// public fields for performance gain
	public TimeWindow timeWindow;
	public double serviceTime;
	public double unloadTime;    // time to unload

	public TWClient(int index, int demand, TimeWindow window) {
		super(index, demand);
		timeWindow = window;
		serviceTime = 0.0D;
		unloadTime = VRProblemModel.getInstance().getClientTimeWindowService(index);
	}
	
	public TWClient(int index, int demand, double unloadTime, double serviceAt, TimeWindow window) {
		super(index, demand);
		timeWindow = window;
		serviceTime = serviceAt;
		this.unloadTime = unloadTime;
	}
	
	public String toString() {
		
		return super.toString() + " TW begin: " + timeWindow.begin 
		+ " TW end: " + timeWindow.end + " serviced at " + serviceTime;
	}
	
	public Object clone() {
		TimeWindow tw = new TimeWindow(this.timeWindow.begin, this.timeWindow.end);
		TWClient clone = new TWClient(this.nodeIndex, this.demand, this.unloadTime, this.serviceTime, tw);
		return clone;
	}
	
}
