package tccrouter.gbl.vrp.common.entity;

import java.util.ArrayList;
import java.util.Iterator;

import tccrouter.gbl.common.entity.Client;
import tccrouter.gbl.common.entity.ShortestPath;
import tccrouter.gbl.common.entity.TSProblemModel;

public class VehicleRoute implements Comparable {
			
	protected int clientCounter;
	protected int depotIndex;	
	protected ArrayList servicedClients;
	
	protected VRProblemModel vrProblemRef;
	protected TSProblemModel tsProblemRef;	

	/*
	 * public fields to obtain performance
	 */	
	public double totalDistance;
	public int capacity;		
	public int suppliedDemand;
	public int vehicleIndex;

	public VehicleRoute() {
		
		vrProblemRef = VRProblemModel.getInstance();
		tsProblemRef = TSProblemModel.getInstance();
	}
	
	public VehicleRoute(int vehicleIndex) {
		
		vrProblemRef = VRProblemModel.getInstance();
		tsProblemRef = TSProblemModel.getInstance();
		this.vehicleIndex = vehicleIndex;
		depotIndex = tsProblemRef.getSourceNodeIndex();
		capacity = vrProblemRef.getVehicleCapacity();		
		servicedClients = new ArrayList();
		clientCounter = 0;		
	}
	
	public VehicleRoute(int vehicleIndex, Client initialClient) {

		vrProblemRef = VRProblemModel.getInstance();
		tsProblemRef = TSProblemModel.getInstance();
		
		depotIndex = tsProblemRef.getSourceNodeIndex();
		this.vehicleIndex = vehicleIndex;
		capacity = vrProblemRef.getVehicleCapacity();
		servicedClients = new ArrayList();
		clientCounter = 0;
		servicedClients.add(initialClient);
		
		if (initialClient.nodeIndex == depotIndex) {
			suppliedDemand = 0;	
		} else {
			suppliedDemand = vrProblemRef.getClientDemand(initialClient.nodeIndex);
		}
		
		clientCounter++;
		totalDistance = tsProblemRef.getDistance(depotIndex,initialClient.nodeIndex);
	}

	public void addDepot(Client depot) {		
		servicedClients.add(depot);
		clientCounter++;
	}
	
	public boolean addClient(Client client) {
		
		/*
		 * Constraint Checking: Vehicle Capacity
		 */
		if (
			((suppliedDemand + client.demand) <= capacity)
			&& (client.nodeIndex != depotIndex) 
			)
		{
			if (clientCounter >= 1) {		    
				totalDistance += tsProblemRef.getDistance(
		    		((Client)servicedClients.get(clientCounter - 1)).nodeIndex, client.nodeIndex);
			} else {
				totalDistance += tsProblemRef.getDistance(depotIndex, client.nodeIndex);
			}
			
			servicedClients.add(client);
			suppliedDemand += client.demand;
			clientCounter++;
			return true;
		}
		return false;
	}

	public boolean addClient(Client client, int index) {
		
		/*
		 * Constraint Checking: Vehicle Capacity
		 */
		if (
			((suppliedDemand + client.demand) <= capacity)
			&& (client.nodeIndex != depotIndex) 
			)
		{			
			servicedClients.add(index, client);
			suppliedDemand += client.demand;
			updateDistance();			
			clientCounter++;
			return true;
		}
		return false;
	}

	public boolean relaxedClientInsertion(Client client, int index) {
		
		/*
		 * Constraint Checking: Vehicle Capacity
		 */
		if (client.nodeIndex != depotIndex)
		{			
			servicedClients.add(index, client);
			suppliedDemand += client.demand;
			updateDistance();			
			clientCounter++;
			return true;
		}
		return false;
	}

	/**
	 * Add the dummy built up client for calculus and simulation purposes
	 * 
	 * 
	 * @param client
	 */	
	public void addDummyClient(Client client) {
		
		if (client.nodeIndex != depotIndex)
		{			
			servicedClients.add(client);
		}
	}
	
	private void updateDistance() {
		
		totalDistance = 0;
		
		int array[]  = getClientListAsIntArray();
		for (int i = 0; i < (array.length - 1); i++) {
			totalDistance += tsProblemRef.getDistance(array[i], array[i + 1]);			
		}		
	}

	public boolean isNodeOnPath(int index) {
		
		int array[]  = getClientListAsIntArray();
		for (int i = 1; i < array.length; i++) {
			
			if ( (tsProblemRef.getShortestPath((i-1),i)).isNodeInPath(index) ) {
				return true;				
			}
		}
		
		return false;
	}

	public ShortestPath getShortestPath(int index1, int index2) {		
		return tsProblemRef.getShortestPath(index1,index2);
	}

	/**
	 * retrieves the Shortest Path that contains the node index
	 * @param nodeIndex
	 * @return the Shortest Path that contains, or pass trough the node index.
	 */
	public ShortestPath getShortestPath(int nodeIndex) {
		
		ShortestPath result = null;
		int array[]  = getClientListAsIntArray();
		for (int i = 1; i < array.length; i++) {
			
			ShortestPath sp = tsProblemRef.getShortestPath(array[i-1],array[i]);
			if ( sp != null ) {
				if ( sp.isNodeInPath(nodeIndex) ) {
					result = tsProblemRef.getShortestPath(array[i-1],array[i]);				
				}				
			}
		}
		
		return result;
	}

	/**
	 * retrieves all the nodes from client list of routeX 
	 * in shortest Path i to j.
	 * 
	 * @param i
	 * @param j
	 * @return the client nodes Id list.
	 */
	public ArrayList getClientsInShortestPath(int i, int j, ArrayList clients) {
		
		Client clientI = (Client)servicedClients.get(i);
		Client clientJ = (Client)servicedClients.get(j);
		ShortestPath sp = tsProblemRef.getShortestPath(clientI.nodeIndex, clientJ.nodeIndex);

		/*
		 * removes all the elements and let only the common nodes remain.
		 */
		ArrayList result = null;
		
		if ( sp != null ) {		
			
			result = new ArrayList();
			while (! clients.isEmpty()) {
				Client client = (Client)clients.remove(0);
				
				if (sp.isNodeInPath(client.nodeIndex)) {					
					result.add(client);
				} 
			}
			
		}		
		
		return result;
	}
	
	public Object removeClient(int clientIndex) {
		suppliedDemand -= ((Client)servicedClients.get(clientIndex)).demand;
		Object removed = servicedClients.remove(clientIndex);
		clientCounter--;
		updateDistance();
		return removed;
	}

	public boolean removeClient(Object client) {
		suppliedDemand -= ((Client)client).demand;
		boolean removed = servicedClients.remove(client);
		clientCounter--;
		updateDistance();
		return removed;
	}

	public boolean removeClients(Client clients[]) {		
		boolean removed = false;
		
		for (int i = 0; i < clients.length; i++) {
			suppliedDemand -= clients[i].demand;				
			servicedClients.remove(clients[i]);			
			clientCounter--;
		}		
		
		updateDistance();
		
		removed = true;
		return removed;
	}
	
	public int[] getClientListAsIntArray() {
		int array[] = new int[servicedClients.size()];
		int i = 0; 
		for (Iterator iter = servicedClients.iterator(); iter.hasNext();) {
			Client element = (Client) iter.next();
			array[i] = element.nodeIndex;
			i++;			
		}
		return array;
	}

	public int getClientIndex(int clientNode) {
		int i = 0;
		
		for (Iterator iter = servicedClients.iterator(); iter.hasNext();) {
			Client element = (Client) iter.next();
			if (element.nodeIndex == clientNode) {
				return i;
			}
			i++;			
		}
		return -1;
	}
	
	public int[] getCanonicalClientList() {
		int array[] = new int[servicedClients.size() - 1];
		int i = 0; 
		for (Iterator iter = servicedClients.iterator(); iter.hasNext();) {
			Client element = (Client) iter.next();
			
			if ( element.nodeIndex != depotIndex ) {
				array[i] = element.nodeIndex;
				i++;							
			}
		}
		return array;
	}
	
	public Object[] getClientListAsObjArray() {
		return servicedClients.toArray();
	}
	
	public boolean setClientListAsArray(int[] clients) {
		boolean feasible = true;
		servicedClients.clear();		
		clientCounter = 0;
		suppliedDemand = 0;
		totalDistance = 0.0D;
		
		for (int i = 0; i < clients.length; i++) {
			Client element = new Client(clients[i], vrProblemRef.getClientDemand(clients[i]));
			feasible = addClient(element);
		}		
		return feasible;
	}
	
	public void addRoute(VehicleRoute route) {

		for (Iterator iter = route.servicedClients.iterator(); iter.hasNext();) {
			Client element = (Client) iter.next();
			
			addClient(element);			
		}
	}

	public int getNumServicedClients() {		
		return (servicedClients.size());
	}
	
	public int getFirstClientIndex() {		
		return ((Client)servicedClients.get(0)).nodeIndex;
	}

	public int getLastClientIndex() {
		if (clientCounter > 0) {
			return ((Client)servicedClients.get(clientCounter - 1)).nodeIndex;	
		}
		return ((Client)servicedClients.get(clientCounter)).nodeIndex;		
	}

	public int getClientCounter() {
		return clientCounter;
	}

	public void setClientCounter(int clientCounter) {
		this.clientCounter = clientCounter;
	}
	
	public int getDepotIndex() {
		return depotIndex;
	}

	public void setDepotIndex(int depotIndex) {
		this.depotIndex = depotIndex;
	}

	/**
	 * Statistical Logic to compare two Routes.
	 * 
	 * @author Guilherme
	 */
	public int compareTo(Object arg0) {				
		VehicleRoute arg = (VehicleRoute) arg0;

		double max_distance = 0.0D;
		
		/*
		 * calculating the distance percentage; 
		 * The most distant route recieves 100%
		 * the other is the lesser percentage of the MAX_DISTANCE. 
		 */
		if (this.totalDistance > arg.totalDistance) {
			max_distance = this.totalDistance;			
		} else {
			max_distance = arg.totalDistance;
		}					

		double distance_value = ((this.totalDistance)/max_distance)*StatisticsManager.V_DISTANCE_WEIGHT;
		double arg_distance_value = ((arg.totalDistance)/max_distance)*StatisticsManager.V_DISTANCE_WEIGHT;						
		
		/*
		 * Same logic as above, now with weight
		 * calculating the weight percentage;
		 */
		double max_supply = 0.0D;
		
		if (this.suppliedDemand > arg.suppliedDemand) {
			max_supply = this.suppliedDemand;			
		} else {
			max_supply = arg.suppliedDemand;
		}					

		double weight_value = ((this.suppliedDemand)/max_supply)*StatisticsManager.V_LOAD_WEIGHT;
		double arg_weight_value = ((arg.suppliedDemand)/max_supply)*StatisticsManager.V_LOAD_WEIGHT;
		
		double heuristicValue = distance_value - weight_value; 
		double argHeuristicValue = arg_distance_value - arg_weight_value;
		
		if (heuristicValue < argHeuristicValue) {
			return -1;
		} else if (heuristicValue > argHeuristicValue) {
			return 1;
		} 
		return 0; 			
	}

	public boolean equals(Object obj) {
		VehicleRoute arg = (VehicleRoute) obj;
		return (vehicleIndex == arg.vehicleIndex);
	}
	
	public String toString() {
					
		/*
		 * calculating the depot distance from last node in client List
		 */
		double roundTrip = totalDistance + tsProblemRef.getDistance(
		    	((Client)servicedClients.get(clientCounter - 1)).nodeIndex, depotIndex);
		
		return "Vehicle " + vehicleIndex + ", total Distance = " + 
		        roundTrip + ", supplied Demand " + suppliedDemand + "\n serviced Clients = " + servicedClients;
	}						
	
}