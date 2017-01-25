package tccrouter.gbl.vrp.common.entity;

import tccrouter.diamante.core.graph.Graph;
import tccrouter.diamante.core.graph.Node;
import tccrouter.diamante.core.graph.property.ComponentProperties;
import tccrouter.diamante.extension.graph.property.ID;
import tccrouter.gbl.common.entity.TSProblemModel;
import tccrouter.gbl.common.util.TravelTimeUtil;
import tccrouter.gbl.vrp.tw.entity.TimeWindow;
import tccrouter.ring.gui.UIFacade;


/**
 * model for an instance of a VRP definition.
 *  
 * @author Guilherme
 *
 */
public class VRProblemModel {

	/*
	 * General CVRP Constants
	 */
	private static final int NUM_CONSTRAINTS = 1;
	private static final int DEMAND_INDEX = 0;
	public static final int DEFAULT_CLIENT_DEMAND = 10;
	public static final int DEFAULT_VEHICLE_CAPACITY = 100;
	public static final boolean LSD_DEFAULT_MEASURE_EXECUTION = true;
	public static final boolean SA_DEFAULT_MEASURE_EXECUTION = true;
	public static final boolean PFIH_DEFAULT_MEASURE_EXECUTION = true;
	
	/*
	 * VRP-TW: Time constants Measured in hours
	 */
	private static final int NUM_TW_CONSTRAINTS = 1;
	public static final double DFAULT_TRAVEL_TIME = 1;
	public static final double DEFAULT_TRAVEL_STEP = 50;	
	public static final double DEFAULT_CLIENT_TW_BEGIN = 8;
	public static final double DEFAULT_CLIENT_TW_END = 22;
	public static final double DEFAULT_CLIENT_TW_SERVICE = 0.5;
	private static final int TW_SERVICE_INDEX = 0;	
	public static final int DEFAULT_MEAN_VELOCITY = 50;
	public static final double DEFAULT_TWVEHICLE_INITIAL = 6;
	public static final double DEFAULT_TWVEHICLE_MAX_TRAVEL = 48;
	public static final double MAX_TRAVEL_TIME = 48;
	public static final double INITIAL_WORK_TIME = 6;		
	
	/*
	 * LSD
	 */
	public static final int DEFAULT_LAMBDA = 2;
	public static final boolean DEFAULT_GLOBAL_BEST = true;
	public static final boolean DEFAULT_ACCEPT_BAD_MOVES = false;
	public static final int DEFAULT_LSD_ITERATIONS = 1;
	
	/*
	 * SA
	 */
	public static final int DEFAULT_SA_LAMBDA = 2;
	public static final double DEFAULT_FINAL_TEMP = 0.001;
	public static final double DEFAULT_TIME_CONST = 0.5;
	public static final int DEFAULT_NUM_RESETS = 8;
	
	static VRProblemModel instance;
	
	/*
	 * GENERAL
	 */		
	int constraints[][];	
	private int vehicleCapacity;
	
	/**
	 * if the execution should be analysed in terms of execution speed, mem. usage...
	 */
	boolean saExecutionMeasure; 
	boolean lsdExecutionMeasure;
	boolean pfihExecutionMeasure;
	
	/*
	 * For the local Search Method:
	 */
	private int lambda;
	private int numIterationsLSD;
	private boolean badMovesLSD;
	private boolean globalBestLSD;

	/*
	 * Time Window VRP specific
	 */
	double twConstraints[][];
	private double maxTravelTime;
	private double initialWorkTime;
	private TimeWindow timeWindow[];
	
	/*
	 * For the SA Method:
	 */
	private int saLambda;
	double finalTemperature;
	double timeConstant;
	int numResets;
	
	/**
	 * 
	 * @return
	 */
	public static VRProblemModel getInstance() {
		if (instance == null)
			instance = new VRProblemModel();
		
		return instance;
	}

	/**
	 * 
	 * 
	 */
	protected VRProblemModel() {
		
		resetConstraints();		
		resetDataStructures();
		
	}

	public void setNewVRP(Graph g) {
		
		if (g != null) {
			if (constraints.length == 0) {
				resetDataStructures();
			}
		}
			
	}

	public int getClientDemand(int clientIndex) {
		return constraints[clientIndex][DEMAND_INDEX];
	}

	public void setClientDemand(int clientIndex, int demand) {
		constraints[clientIndex][DEMAND_INDEX] = demand;
	}
	
	public double getTWClientServiceTime(int clientIndex) {
		return twConstraints[clientIndex][TW_SERVICE_INDEX];
	}

	public int getVehicleCapacity() {
		return vehicleCapacity;
	}

	public void setVehicleCapacity(int vehicleCapacity) {
		this.vehicleCapacity = vehicleCapacity;
	}
	
	public int getNumIterationsLSD() {
		return numIterationsLSD;
	}

	public void setNumIterationsLSD(int numIterationsLSD) {
		this.numIterationsLSD = numIterationsLSD;
	}
	
	public boolean isBadMovesLSD() {
		return badMovesLSD;
	}

	public void setBadMovesLSD(boolean badMovesLSD) {
		this.badMovesLSD = badMovesLSD;
	}

	public boolean isGlobalBestLSD() {
		return globalBestLSD;
	}

	public void setGlobalBestLSD(boolean globalBestLSD) {
		this.globalBestLSD = globalBestLSD;
	}

	public TimeWindow getClientTimeWindow(int i) {
		return timeWindow[i];
	}

	public void setClientTimeWindowBegin(int i, double value) {
		 timeWindow[i].begin = value;
	}

	public void setClientTimeWindowEnd(int i, double value) {
		 timeWindow[i].end = value;
	}

	public double getClientTimeWindowService(int i) {
		 return twConstraints[i][TW_SERVICE_INDEX];
	}
	
	public void setClientTimeWindowService(int i, double value) {
		 twConstraints[i][TW_SERVICE_INDEX] = value;
	}
	
	public int getCapacity() {
		return vehicleCapacity;
	}

	public void setCapacity(int capacity) {
		this.vehicleCapacity = capacity;
	}
	
	
	public double getInitialWorkTime() {
		return initialWorkTime;
	}

	public void setInitialWorkTime(double initialWorkTime) {
		this.initialWorkTime = initialWorkTime;
	}

	public double getMaxTravelTime() {
		return maxTravelTime;
	}

	public void setMaxTravelTime(double maxTravelTime) {
		this.maxTravelTime = maxTravelTime;
	}
	
	public double getMeanVelocity() {
		return TravelTimeUtil.getMeanVelocity();
	}

	public void setMeanVelocity(double meanVelocity) {
		TravelTimeUtil.setMeanVelocity(meanVelocity);
	}
	
	public int getNumResets() {
		return numResets;
	}

	public void setNumResets(int numResets) {
		this.numResets = numResets;
	}
	
	public double getFinalTemperature() {
		return finalTemperature;
	}

	public void setFinalTemperature(double finalTemperature) {
		this.finalTemperature = finalTemperature;
	}

	public double getTimeConstant() {
		return timeConstant;
	}

	public void setTimeConstant(double timeConstant) {
		this.timeConstant = timeConstant;
	}	

	public int getLambda() {
		return lambda;
	}

	public void setLambda(int lambda) {
		this.lambda = lambda;
	}

	
	public int getSaLambda() {
		return saLambda;
	}

	public void setSaLambda(int saLambda) {
		this.saLambda = saLambda;
	}

	
	public boolean isSAExecutionMeasure() {
		return saExecutionMeasure;
	}

	public void setSAExecutionMeasure(boolean executionMeasure) {
		this.lsdExecutionMeasure = executionMeasure;
	}

	
	public boolean isLsdExecutionMeasure() {
		return lsdExecutionMeasure;
	}

	public void setLsdExecutionMeasure(boolean lsdExecutionMeasure) {
		this.lsdExecutionMeasure = lsdExecutionMeasure;
	}

	public boolean isPfihExecutionMeasure() {
		return pfihExecutionMeasure;
	}

	public void setPfihExecutionMeasure(boolean pfihExecutionMeasure) {
		this.pfihExecutionMeasure = pfihExecutionMeasure;
	}

	/**
	 * For use in UI settings.
	 * 
	 * @return
	 */
	public Object[][] buildProblemDataModel() {
		
		int clientNodes[] = TSProblemModel.getInstance().getAllProblemNodes();
		
		Object[][] result = new Object[clientNodes.length][clientNodes.length];
		
		for (int i = 0; i < clientNodes.length; i++) {
			int index = clientNodes[i];
			
			result[i][0] = new Integer(index);     // ID
			result[i][1] = new Integer(getClientDemand(index)); // Demand
			
			TimeWindow tw = getClientTimeWindow(index); // TW
			result[i][2] = new Double(tw.begin);
			result[i][3] = new Double(tw.end);
			result[i][4] = new Double(getTWClientServiceTime(index));
			
			i++;			
		}
		
		return result;
	}	

	/**
	 * For use in UI settings.
	 * 
	 * @return
	 */
	public Object[][] buildNewGraphDataModel() {
		
		resetDataStructures();
		Graph g = UIFacade.getInstance().getGraph();
		
		Object[][] result = new Object[g.getN()][5];
		
		for (int i = 0; i < g.getN(); i++) {
			Node node = g.getNode(i);
			ComponentProperties cp = node.getProperties();
             //			 ID
			result[i][0] = new Integer(
					((ID)cp.getPropertyByName("ID")).getValue());     			
			result[i][1] = new Integer(DEFAULT_CLIENT_DEMAND); // Demand			
			result[i][2] = new Double(DEFAULT_CLIENT_TW_BEGIN);
			result[i][3] = new Double(DEFAULT_CLIENT_TW_END);
			result[i][4] = new Double(DEFAULT_CLIENT_TW_SERVICE);
		}
		
		return result;
	}	

	public Object[][] getGraphDataModel() {
		
		Graph g = UIFacade.getInstance().getGraph();
		
		Object[][] result = new Object[g.getN()][5];
		
		for (int i = 0; i < g.getN(); i++) {
			Node node = g.getNode(i);
			ComponentProperties cp = node.getProperties();
             //			 ID
			int id = ((ID)cp.getPropertyByName("ID")).getValue();
			
			result[i][0] = new Integer(id);     			
			result[i][1] = new Integer(getClientDemand(id)); // Demand
			TimeWindow tw = getClientTimeWindow(id);			
			result[i][2] = new Double(tw.begin);
			result[i][3] = new Double(tw.end);
			result[i][4] = new Double(getClientTimeWindowService(id));
		}
		
		return result;
	}	
	
	public void resetConstraints() {
		
		setCapacity(DEFAULT_VEHICLE_CAPACITY);
		setMeanVelocity(DEFAULT_MEAN_VELOCITY);
		setMaxTravelTime(DEFAULT_TWVEHICLE_MAX_TRAVEL);
		setInitialWorkTime(DEFAULT_TWVEHICLE_INITIAL);
		setNumIterationsLSD(DEFAULT_LSD_ITERATIONS);
		setNumResets(DEFAULT_NUM_RESETS);
		setFinalTemperature(DEFAULT_FINAL_TEMP);
		setTimeConstant(DEFAULT_TIME_CONST);
		setPfihExecutionMeasure(PFIH_DEFAULT_MEASURE_EXECUTION);
		setLsdExecutionMeasure(LSD_DEFAULT_MEASURE_EXECUTION);
		setSAExecutionMeasure(SA_DEFAULT_MEASURE_EXECUTION);		
		setLambda(DEFAULT_LAMBDA);
		setSaLambda(DEFAULT_SA_LAMBDA);
	}
	
	public void resetDataStructures() {
	    int numNodes = UIFacade.getInstance().getGraph().getN();	    
		constraints = new int[numNodes][NUM_CONSTRAINTS];
		twConstraints = new double[numNodes][NUM_TW_CONSTRAINTS];
				
		for (int i = 0; i < numNodes; i++) {
			    
			    // setting the client DEMAND values
				constraints[i][DEMAND_INDEX] = DEFAULT_CLIENT_DEMAND;

			    // setting the TW CONSTRAINTS:
				twConstraints[i][TW_SERVICE_INDEX] = DEFAULT_CLIENT_TW_SERVICE;				
		}
				
		timeWindow = new TimeWindow[numNodes];
		
		for (int i = 0; i < timeWindow.length; i++) {
			timeWindow[i] = new TimeWindow();
		}		
	}
}