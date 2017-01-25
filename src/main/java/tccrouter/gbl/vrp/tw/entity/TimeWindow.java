package tccrouter.gbl.vrp.tw.entity;

import tccrouter.gbl.vrp.common.entity.VRProblemModel;

public class TimeWindow {
	
	public double begin;
	public double end;
	
	public TimeWindow() {
		super();
		this.begin = VRProblemModel.DEFAULT_CLIENT_TW_BEGIN;
		this.end = VRProblemModel.DEFAULT_CLIENT_TW_END;
	}
	
	public TimeWindow(double begin, double end) {
		super();
		this.begin = begin;
		this.end = end;
	}	
}
