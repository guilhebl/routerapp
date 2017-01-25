package tccrouter.gbl.vrp.tw.entity;

import java.util.ArrayList;
import java.util.Iterator;

import tccrouter.gbl.common.entity.Client;
import tccrouter.gbl.common.util.TravelTimeUtil;
import tccrouter.gbl.vrp.common.entity.VRProblemModel;
import tccrouter.gbl.vrp.common.entity.VehicleRoute;

public class TWVehicleRoute extends VehicleRoute {

	/*
	 * public fields to obtain performance
	 */		
	public double maxTimeTransit;
	public double initialWorkTime;
	public double endWorkTime;
	public double totalTravelTime;
	public double totalWaitTime;
	
	public TWVehicleRoute() {		
		super();
		maxTimeTransit = VRProblemModel.getInstance().getMaxTravelTime();
		initialWorkTime = VRProblemModel.getInstance().getInitialWorkTime();		
	}
	
	public TWVehicleRoute(int vehicleIndex) {
		super(vehicleIndex);
		totalTravelTime = 0.0D;
		endWorkTime = 0.0D;
		totalWaitTime = 0.0D;
		maxTimeTransit = VRProblemModel.getInstance().getMaxTravelTime();
		initialWorkTime = VRProblemModel.getInstance().getInitialWorkTime();				
	}
	
	public TWVehicleRoute(int vehicleIndex, TWClient initialClient) {
		super(vehicleIndex, initialClient);
		totalTravelTime = 0.0D;
		endWorkTime = 0.0D;
		maxTimeTransit = VRProblemModel.getInstance().getMaxTravelTime();
		initialWorkTime = VRProblemModel.getInstance().getInitialWorkTime();		
		
		/*
		 * Constraint Checking: Time window
		 */
		initialClient.serviceTime = initialWorkTime + 						
		TravelTimeUtil.travelTime(depotIndex, initialClient.nodeIndex);
		totalWaitTime = 0.0D;
		
		/*
		 * if early arrival, need to wait for client to open
		 */		
		if (initialClient.serviceTime < initialClient.timeWindow.begin) {
			totalWaitTime += initialClient.timeWindow.begin - initialClient.serviceTime;
			initialClient.serviceTime = initialClient.timeWindow.begin;
		}						
	}
	
	public boolean addClient(TWClient client) {
		
		/*
		 * Constraint Checking: Time window
		 */
		if (! servicedClients.isEmpty()) {
			
			if (servicedClients.contains( client )) {
				return false;
			}
			
			client.serviceTime = getLastClient().serviceTime + getLastClient().unloadTime + 						
			TravelTimeUtil.travelTime(getLastClientIndex(), client.nodeIndex);
			
			/*
			 * if early arrival, need to wait for client to open
			 */		
			double waitTime = 0.0D;
			if (client.serviceTime < client.timeWindow.begin) {
				waitTime = client.timeWindow.begin - client.serviceTime;
				client.serviceTime = client.timeWindow.begin;
			}				
			
			double roundTrip = client.serviceTime + client.unloadTime + 						
			TravelTimeUtil.travelTime(client.nodeIndex, depotIndex);
			
			/*
			 * is it inside client Time Window and inside global vehicle total travel time?
			 */
			if ( (client.serviceTime < client.timeWindow.end) &&
				 (roundTrip <= maxTimeTransit) ) 	
			{
				if (super.addClient(client)) {
					totalTravelTime = client.serviceTime + client.unloadTime;
					/*
					 * if early arrival, need to wait for client to open
					 */		
					if (client.serviceTime < client.timeWindow.begin) {
						totalWaitTime += waitTime;					
					}				
					
					return true;
				} else {
					return false;				
				}
			}
			
		} else {
			/*
			 * begin configuration
			 * at the depot, adjust the UNLOAD TIME VALUE, for next add.
			 */
			client.timeWindow.begin = initialWorkTime;
			client.serviceTime = initialWorkTime;			
			super.addDepot(client); 
		}
		
		
		return false;
	}

	public boolean addClient(TWClient client, int index) {

		/*
		 * Constraint Checking: 
		 * This method can�t be used to insert the depot index.
		 */
		if (client.nodeIndex != depotIndex && index > 0) 
		{
			if (servicedClients.contains( client )) 
			{
				return false;
			}

			/*
			 * Constraint Checking: Time window
			 * propagate the arrival time for all the clients after the inserted one. 
			 */		
			double waitTime = 0;
			
			/*
			 * pushed forward service Time:
			 * first iteration to check time window feasibility, 
			 * work in a copy of the real client list
			 */		
			ArrayList mirror = (ArrayList)servicedClients.clone();
			mirror.add(index, client);
			Object copyArray[] = cloneClientListAsObjArray(mirror);
			
			int lastClient = 0;
			
			if (index > 0) {
				lastClient = index - 1;
			} 
			
			for (int i = index; i < copyArray.length; i++) {
				
				double newServiceTime = ((TWClient)copyArray[lastClient]).serviceTime + ((TWClient)copyArray[lastClient]).unloadTime + 						
				TravelTimeUtil.travelTime(((TWClient)copyArray[lastClient]).nodeIndex, ((TWClient)copyArray[i]).nodeIndex);

				/*
				 * if early arrival, need to wait for client to open
				 */		
				if (newServiceTime < ((TWClient)copyArray[i]).timeWindow.begin) {
					waitTime += ((TWClient)copyArray[i]).timeWindow.begin - newServiceTime;
					newServiceTime = ((TWClient)copyArray[i]).timeWindow.begin;
				}
				
				// checking pushed forward time window feasibility
				if (newServiceTime < ((TWClient)copyArray[i]).timeWindow.end)
					{		
					((TWClient)copyArray[i]).serviceTime = newServiceTime;
					 lastClient = i;				 
					}
				else {
					return false;
				}			
			}		
			
			double lastUnload = ((TWClient)copyArray[lastClient]).serviceTime + ((TWClient)copyArray[lastClient]).unloadTime;
			double roundTrip = lastUnload + TravelTimeUtil.travelTime(((TWClient)copyArray[lastClient]).nodeIndex,depotIndex);
					
			/*
			 * is it inside client Time Window and inside global vehicle total travel time?
			 */		
			if ( (((TWClient)copyArray[index]).serviceTime <= client.timeWindow.end) &&			 
				 (roundTrip <= maxTimeTransit) ) 	
			{
				if (super.addClient(client, index)) {
					
					/*
					 * now the real data can be updated
					 */
					totalTravelTime = lastUnload;
					totalWaitTime += waitTime;
					/*
					 * pushed forward service Time:
					 * second iteration to update service time for the (> index) clients
					 */
					Object array[] = getClientListAsObjArray();
					int lastCli = 0;
					
					if (index > 0) {
						lastCli = index - 1;
					} 
					for (int i = index; i < array.length; i++) {
						double newServiceTime = ((TWClient)copyArray[lastCli]).serviceTime + ((TWClient)copyArray[lastClient]).unloadTime + 						
						TravelTimeUtil.travelTime(((TWClient)copyArray[lastCli]).nodeIndex, ((TWClient)copyArray[i]).nodeIndex);

						/*
						 * if early arrival, need to wait for client to open
						 */		
						if (newServiceTime < ((TWClient)copyArray[i]).timeWindow.begin) {
							newServiceTime = ((TWClient)copyArray[i]).timeWindow.begin;
						}
						
						// pushed forward time window feasibility already checked
					    ((TWClient)array[i]).serviceTime = newServiceTime;
						lastCli = i;
					}
					
					return true;
				} else {
					return false;				
				}
			}			
		} // end
		
		
		return false;
	}

	/**
	 * Add the client with the constraints relaxed.
	 * Returns the relaxed route configuration by the effect of this client
	 * addition.
	 * 
	 * 
	 * @param client
	 * @return relaxed route configuration by the effect of this client addition.
	 */
	public TWVehicleRoute relaxedTWClientInsertion(TWClient client, int index) {

		TWVehicleRoute clone = (TWVehicleRoute)this.clone();					
		
		/*
		 * Constraint Checking: 
		 * This method can�t be used to insert the depot index.
		 */
		if (client.nodeIndex != depotIndex && index > 0) 
		{
			if (servicedClients.contains( client )) {
				return clone;
			}

			/*
			 * Constraint Checking: Time window
			 * propagate the arrival time for all the clients after the inserted one. 
			 */		
			double waitTime = 0;
			
			clone.relaxedClientInsertion(client, index);
			Object copyArray[] = clone.getClientListAsObjArray();
			
			int lastClient = index - 1;
			
			/*
			 * propagate Time constraint relaxation:
			 */
			for (int i = index; i < copyArray.length; i++) {
				
				double newServiceTime = ((TWClient)copyArray[lastClient]).serviceTime + ((TWClient)copyArray[lastClient]).unloadTime + 						
				TravelTimeUtil.travelTime(((TWClient)copyArray[lastClient]).nodeIndex, ((TWClient)copyArray[i]).nodeIndex);

				/*
				 * if early arrival, need to wait for client to open
				 */		
				if (newServiceTime < ((TWClient)copyArray[i]).timeWindow.begin) {
					waitTime += ((TWClient)copyArray[i]).timeWindow.begin - newServiceTime;
					newServiceTime = ((TWClient)copyArray[i]).timeWindow.begin;
				}
				
				((TWClient)copyArray[i]).serviceTime = newServiceTime;
				 lastClient = i;				 
			}		
		} // end
		
		
		return clone;
	}

	/**
	 * Add the dummy built up client for calculus and simulation purposes
	 * 
	 * 
	 * @param client
	 */	
	public void addDummyClient(TWClient client) {
		
		/*
		 * Constraint Checking: Time window
		 */
		if (! servicedClients.isEmpty()) {			
			super.addDummyClient(client);
		}				
	}
	
	/**
	 * Method to insert a client between client A, and client B,
	 * knowing only their node ID values.
	 * 
	 * @param client
	 * @param clientIndexA
	 * @param clientIndexB
	 * @return
	 */
	public boolean addClientByNodeID(TWClient client, int clientA, int clientB) {

		int indexA = getClientIndex(clientA);
		int indexB = getClientIndex(clientB);
		
		/*
		 * between A -> B, if index of A is lower than index of B
		 * otherwise between B -> A.
		 */
		if (indexA < indexB) {
			return addClient(client,indexB);
		}
			
		return addClient(client,indexA);
	}

	/**
	 * Method to insert a client between client A, and client B 
	 * by their index.
	 * 
	 * @param client
	 * @param clientIndexA
	 * @param clientIndexB
	 * @return
	 */
	public boolean addClientByNodeIndex(TWClient client, int indexA, int indexB) {

		/*
		 * between A -> B, if index of A is lower than index of B
		 * otherwise between B -> A.
		 */
		if (indexA < indexB) {
			return addClient(client,indexB);
		}
			
		return addClient(client,indexA);
	}

	public boolean addClients(TWClient clients[], int index) {

		TWVehicleRoute clone = (TWVehicleRoute)this.clone();

		/*
		 * Try it first on clone to check feasibility
		 */
		int listIndex = index;
		
		for (int i = 0; i < clients.length; i++) {
			
			if (! clone.addClient(clients[i], listIndex)) {
				return false;
			} 
			listIndex++;
		}

		/*
		 * feasibility OK, now update
		 */
		listIndex = index;
		for (int i = 0; i < clients.length; i++) {			
			addClient(clients[i], listIndex);
			listIndex++;
		}
		
		updateTimeMetrics();		
		return true;
	}
	
	public Object removeClient(int index) {

		Object removed = super.removeClient(index);
		updateTimeMetrics();		
		return removed;
	}

	public boolean removeClient(Object target) {

		boolean removed = super.removeClient(target);
		updateTimeMetrics();		
		return removed;
	}

	public boolean removeClients(TWClient clients[]) {

		boolean removed = super.removeClients(clients);
		updateTimeMetrics();		
		return removed;
	}
	
	public void updateTimeMetrics() {
		
		totalWaitTime = 0;
		
		/*
		 * pushed forward service Time:
		 * second iteration to update service time for the (> index) clients
		 */		
		TWClient array[] = getClientListAsTWClientArray();
		int lastCli = 0;
		for (int i = 1; i < array.length; i++) {
			double newServiceTime = (array[lastCli]).serviceTime + (array[lastCli]).unloadTime + 						
			TravelTimeUtil.travelTime( array[lastCli].nodeIndex, array[i].nodeIndex);

			/*
			 * if early arrival, need to wait for client to open
			 */		
			if (newServiceTime < (array[i].timeWindow.begin) ) {
				totalWaitTime += (array[i].timeWindow.begin) - newServiceTime;
				newServiceTime = (array[i].timeWindow.begin);
			}
			
			// pushed forward time window feasibility already checked
		    array[i].serviceTime = newServiceTime;
			lastCli = i;
		}

		totalTravelTime = array[lastCli].serviceTime + (array[lastCli]).unloadTime;

		/*
		 * calculating end of duty time:
		 */
		endWorkTime = totalTravelTime + TravelTimeUtil.travelTime(
		    	((Client)servicedClients.get(clientCounter - 1)).nodeIndex, depotIndex);
		
	}
	
	public TWClient getClient(int index) {
		return ((TWClient)servicedClients.get(index));		
	}

	public TWClient getFirstClient() {		
		if (clientCounter > 1) {		
			return ((TWClient)servicedClients.get(1));
		}
		return null;
	}
	
	public TWClient getLastClient() {		
		if (clientCounter > 0) {		
			return ((TWClient)servicedClients.get(clientCounter - 1));
		}
		return null;
	}

	/**
	 * tardiness = time(vehicle delivery time greater than client late arrival time).
	 * 
	 * This method calculated the acumulated sum of the tardiness for every 
	 * customer at each index acumulated after index k, 
	 * those are: k+1, k+2... n(final client index).
	 *
	 * It may be used to simulate the effect of a insertion of a client in a route.
	 * 
	 * @return total tardiness of acumulated clients in hours. 
	 */
	public double sumTotalTardiness(int k) {
		double sumTardiness = 0;

		TWClient array[] = getClientListAsTWClientArray();
		for (int i = k; i < array.length; i++) {
			TWClient element = array[i];
			
			if (element.serviceTime > element.timeWindow.end) {			
				sumTardiness += element.serviceTime - element.timeWindow.end;
			}						
		}
		
		return sumTardiness;		
	}
	
	public Object[] cloneClientListAsObjArray(ArrayList clients) {
		Object list[] = clients.toArray();
		Object list2[] = new Object[list.length];
		
		for (int i = 0; i < list.length; i++) {
			list2[i] = ((TWClient)list[i]).clone();
		}
		
		return list2;
	}

	public TWClient[] getClientListAsTWClientArray() {
		Object list[] = servicedClients.toArray();
		TWClient list2[] = new TWClient[list.length];
		
		for (int i = 0; i < list.length; i++) {
			list2[i] = (TWClient)list[i];
		}
		
		return list2;
	}
	
	public TWClient[] cloneClientListAsTWClientArray() {
		Object list[] = servicedClients.toArray();
		TWClient list2[] = new TWClient[list.length];
		
		for (int i = 0; i < list.length; i++) {
			list2[i] = (TWClient)((TWClient)list[i]).clone();
		}
		
		return list2;
	}

	public ArrayList cloneClientList() {
		Object list[] = servicedClients.toArray();
		ArrayList list2 = new ArrayList();
		
		for (int i = 0; i < list.length; i++) {			
			list2.add( ((TWClient)list[i]).clone() );
		}
		
		return list2;
	}

	public ArrayList getClientListAsNodeIDList() {
		Object list[] = servicedClients.toArray();
		ArrayList list2 = new ArrayList();
		
		for (int i = 0; i < list.length; i++) {			
			list2.add( new Integer(((TWClient)list[i]).nodeIndex));
		}
		
		return list2;
	}
		
	public boolean setClientListAsArray(int[] clients) {
		boolean feasible = true;
		servicedClients.clear();		
		clientCounter = 0;
		suppliedDemand = 0;
		totalDistance = 0.0D;
		totalWaitTime = 0.0D;
		totalTravelTime = 0.0D;
		endWorkTime = 0.0D;
				
		// add the depot: (initialWorkTime - (array[lastCli]).unloadTime)
		TimeWindow twD = vrProblemRef.getClientTimeWindow(depotIndex);
		TWClient depot = new TWClient
		(depotIndex, 0, 0, initialWorkTime, twD);
		addDepot(depot);		
		
		for (int i = 0; i < clients.length; i++) {
			TimeWindow tw = vrProblemRef.getClientTimeWindow(clients[i]);
			TWClient element = new TWClient
			(clients[i], vrProblemRef.getClientDemand(clients[i]), tw);
			feasible = addClient(element);
		}
		
		if (feasible) {
			updateTimeMetrics();
			return true;
		}
		return false;
	}
	
	public String toString() {
		
		StringBuffer result = new StringBuffer();
		
		/*
		 * calculating the depot distance from last node in client List
		 */
		for (Iterator iter = servicedClients.iterator(); iter.hasNext();) {
			TWClient element = (TWClient) iter.next();
			result.append(element.toString());
			result.append("\n");
		}
		
		/*
		 * calculating the depot distance from last node in client List
		 */
		double roundTrip = totalDistance + tsProblemRef.getDistance(
		    	((Client)servicedClients.get(clientCounter - 1)).nodeIndex, depotIndex);
		
		/*
		 * calculating end of duty time:
		 */
		endWorkTime = totalTravelTime + TravelTimeUtil.travelTime(
		    	((Client)servicedClients.get(clientCounter - 1)).nodeIndex, depotIndex);

		totalTravelTime = endWorkTime - initialWorkTime;
		
		return ("Vehicle " + vehicleIndex + ", total Distance = " + 
		        roundTrip + ", supplied Demand " + suppliedDemand + "\n Begin work at: " + initialWorkTime +
		        " End work at: " + endWorkTime +
				" Total travel time: " + totalTravelTime +
				" Total Wait time: " + totalWaitTime + "\n" + result.toString());
	}						

	public Object clone() {
		TWVehicleRoute clone = new TWVehicleRoute();
		clone.capacity = this.capacity;
		clone.vehicleIndex = this.vehicleIndex;
		clone.suppliedDemand = this.suppliedDemand;
		clone.depotIndex = this.depotIndex;
		clone.endWorkTime = this.endWorkTime;
		clone.initialWorkTime = this.initialWorkTime;
		clone.maxTimeTransit = this.maxTimeTransit;
		clone.totalDistance = this.totalDistance;
		clone.totalTravelTime = this.totalTravelTime;
		clone.totalWaitTime = this.totalWaitTime;
		clone.clientCounter = this.clientCounter;
		clone.servicedClients = this.cloneClientList();
		
		return clone;
	}
}
