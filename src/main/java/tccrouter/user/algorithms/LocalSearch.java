package tccrouter.user.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

import tccrouter.diamante.core.command.Algorithm;
import tccrouter.diamante.core.graph.Graph;
import tccrouter.diamante.core.util.OutputSender;
import tccrouter.gbl.common.entity.ExecutionTrace;
import tccrouter.gbl.common.entity.TSProblemModel;
import tccrouter.gbl.common.util.ColorUtil;
import tccrouter.gbl.vrp.common.entity.RoutePermutation;
import tccrouter.gbl.vrp.common.entity.StatisticsManager;
import tccrouter.gbl.vrp.common.entity.VRProblemModel;
import tccrouter.gbl.vrp.tw.entity.CostInsertionBetweenPath;
import tccrouter.gbl.vrp.tw.entity.TWClient;
import tccrouter.gbl.vrp.tw.entity.TWVehicleRoute;

/**
 * Local Search with Lambda Interchange for VRPTW.
 * Implementation based on the paper:
 * 
 * Heuristic Methods for Vehicle Routing Problem with Time Windows
 * Authors: K.C. Tan; L.H. Lee and K.Q. Zhu
 * 
 * @author Guilherme
 *
 */
public class LocalSearch extends Algorithm {
		
	/*
	 * The default window size for promising clients check
	 */
	private static int CLOSEST_CLIENTS_WINDOW = 5;
	
	VRProblemModel vrProblemRef;
	TSProblemModel tsProblemRef;
	StatisticsManager statManager;

	/**
	 * Reference to the ExecutionTrace object to measure execution performance
	 */
    ExecutionTrace executionTrace;
    boolean measureExecution;
	
	/*
	 * The source node
	 */
	int depotIndex;

	/*
	 * List to save the current S solution.
	 */
	LinkedList routesList;

	/*
	 * The neighborhood window size LAMBDA
	 */
	int lambda;

	/*
	 * The savings parameter to choose wich permutation to move.
	 */
	double totalSavings;
	
	/*
	 * If search for improvement on the end
	 */
	boolean globalBestSearch;

	/*
	 * If search for improvement on the end
	 */
	boolean acceptBadMoves;
	
	/*
	 * List to save the S neighborhood.
	 */
	LinkedList neighborList;
	
	/*
	 * List for the possible moves between 2 routes.
	 */
	LinkedList possibleMovesIJ;		
	
	/*
	 * Permutation iterator OMEGA.
	 */
	int indexI;
	int indexJ;

	/*
	 * The total number of iterations to be done
	 */
	int iterations;
	
	/*
	 * this heuristic technique may be used by other algorithms.
	 */	
	private boolean visualFeedBack;
	
	/**
	 * Creates an instance of this algorithm. 
	 * Following the GraphEditor standard for algorithm parameters,
	 *  the first parameter should always be a graph, followed by the 
	 *  nodes that the algorithm requires.
	 * 
	 * @param g the graph on which the algorithm will be run
	 * @param start the starting node of the depth search
	 */
	public LocalSearch(Graph g) {
		super(g, "Local Search with Lambda Interchange - VRPTW");
		routesList = new LinkedList();
		neighborList = new LinkedList();		
		vrProblemRef = VRProblemModel.getInstance();
		vrProblemRef.setNewVRP(g);
		tsProblemRef = TSProblemModel.getInstance();
		statManager = StatisticsManager.getInstance();
		visualFeedBack = tsProblemRef.isVisualFeedback();
		globalBestSearch = vrProblemRef.isGlobalBestLSD();
		acceptBadMoves = vrProblemRef.isBadMovesLSD();
		iterations = vrProblemRef.getNumIterationsLSD();
		
		if (visualFeedBack) {
		    tsProblemRef.resetAdvancedStructures(g);
		}

		measureExecution = vrProblemRef.isLsdExecutionMeasure();
		if (measureExecution) {
			executionTrace = ExecutionTrace.getInstance();
		}
		depotIndex = tsProblemRef.getSourceNodeIndex();
		lambda = vrProblemRef.getLambda();
	}

	/**
	 * @see diamante.core.command.Command#execute()
	 */
	public void execute() {	    	          		
		if (measureExecution) {
			executionTrace.initialTrace();
		}

		/*
		 * LSD 1: Obtain a feasible solution S for the VRPTW
		 *        using PFIH 
		 */
		tsProblemRef.setVisualFeedback(false);			
		PFIH pfih = new PFIH(g);
		pfih.execute();
		routesList = pfih.getRoutesList();

		int i = 0;
		while (i < iterations) {
			
			if (measureExecution) {
				executionTrace.iterationTrace();
			}
			
			Object array[] = routesList.toArray();
			
			for (indexI = 0; indexI < array.length; indexI++) {
				for (indexJ = (indexI + 1); indexJ < array.length; indexJ++) {
					/*
					 * get a pair of routes R(i) & R(j)
					 */
					TWVehicleRoute routeI = (TWVehicleRoute)array[indexI];
					TWVehicleRoute routeJ = (TWVehicleRoute)array[indexJ];

					TWVehicleRoute routeICopy = (TWVehicleRoute)routeI.clone();
					TWVehicleRoute routeJCopy = (TWVehicleRoute)routeJ.clone();

					possibleMovesIJ = new LinkedList();
					/*
					 * STEP 1: 
					 * 
					 * get a pair of routes R(i) & R(j)
					 * 
					 * Realize LambdaInterchange 1 and 2.
					 * 
					 * if the permutation between clients resulted in a new 
					 * solution S, store it in the neighbor list
					 */
					totalSavings = searchClients(routeICopy, routeJCopy);
					
					if (totalSavings != 0 || !possibleMovesIJ.isEmpty()) {
						
						/*
						 * GLOBAL BEST STRATEGY:
						 * 
						 * Improve at the end
						 */
						if (globalBestSearch) {
						
							/*
							 * best possible move found between routeI and routeJ.
							 * 
							 * Obtains a 1 sized neighborList.
							 */
							neighborList.add(bestRouteIJMoves());
						
						} else if (totalSavings < 0){
							/*
							 * FIRST BEST STRATEGY:
							 * 
							 * Continuos improvement
							 */
							array[indexI] = routeICopy;
							array[indexJ] = routeJCopy;
						}
					} 
					
					/*
					 * STEP 3:
					 * 
					 * try to improve routes doing a local TSP in a single route.
					 */				
					if (! globalBestSearch) {				
						localTSP((TWVehicleRoute)array[indexI]);		    		
						localTSP((TWVehicleRoute)array[indexJ]);	    				
					}				
				}			
			}
			
			if (globalBestSearch) {
				routesList = mergeSolutions();
				Object arrayBest[] = routesList.toArray();
				
				/*
				 * Improve single routes by doing a GA TSP in their clients.
				 */
				for (indexI = 0; indexI < arrayBest.length; indexI++) {
					localTSP((TWVehicleRoute)arrayBest[indexI]);		    		
				}

				routesList = new LinkedList(Arrays.asList(arrayBest));
				
			} // end if GLOBAL BEST
			else { 
				routesList = new LinkedList(Arrays.asList(array));
			}

			i++;
		} // end while ()
		
		/*
		 * final time captured
		 */				
		if (measureExecution) {
			executionTrace.finalTrace();
		}
		
		eliminateNonRoutes();
		
		if (visualFeedBack) {
			
			// colors the resulting best path found
			ColorUtil.resetColorCounter();
			Object routes[] = routesList.toArray();
			
			for (int z = 0; z < routes.length; z++) {

				TWVehicleRoute vehicle = (TWVehicleRoute)routes[z];
				ColorUtil.colorPath(g, depotIndex, vehicle.getCanonicalClientList());
			}

			if (measureExecution) {
				String routesInfo = buildRoutesString();

				System.out.println
				("LSD Total execution Time: "+ executionTrace.getFinalTime() + " ms\n" + routesInfo);
				
				// Shows a reply message with the label and time of execution
				OutputSender.showMessageDialog (
					"Total execution Time: "+
					executionTrace.getFinalTime() + " ms\n" + routesInfo,
					"Measured Time",
					OutputSender.INFORMATION_MESSAGE
				);				
				
			}
		}
		
	}

	public void execute(LinkedList routes) {	    	          		
		
		routesList = routes;
		Object array[] = routesList.toArray();
		
		for (indexI = 0; indexI < array.length; indexI++) {
			for (indexJ = (indexI + 1); indexJ < array.length; indexJ++) {
				/*
				 * get a pair of routes R(i) & R(j)
				 */
				TWVehicleRoute routeI = (TWVehicleRoute)array[indexI];
				TWVehicleRoute routeJ = (TWVehicleRoute)array[indexJ];

				TWVehicleRoute routeICopy = (TWVehicleRoute)routeI.clone();
				TWVehicleRoute routeJCopy = (TWVehicleRoute)routeJ.clone();

				possibleMovesIJ = new LinkedList();
				/*
				 * STEP 1: 
				 * 
				 * get a pair of routes R(i) & R(j)
				 * 
				 * Realize LambdaInterchange 1 and 2.
				 * 
				 * if the permutation between clients resulted in a new 
				 * solution S, store it in the neighbor list
				 */
				totalSavings = searchClients(routeICopy, routeJCopy);
				
				if (totalSavings != 0 || !possibleMovesIJ.isEmpty()) {
					
					/*
					 * GLOBAL BEST STRATEGY:
					 * 
					 * Improve at the end
					 */
					if (globalBestSearch) {
					
						/*
						 * best possible move found between routeI and routeJ.
						 * 
						 * Obtains a 1 sized neighborList.
						 */
						neighborList.add(bestRouteIJMoves());
					
					} else if (totalSavings < 0){
						/*
						 * FIRST BEST STRATEGY:
						 * 
						 * Continuos improvement
						 */
						array[indexI] = routeICopy;
						array[indexJ] = routeJCopy;
					}
				} 
				/*
				 * STEP 3:
				 * 
				 * try to improve routes doing a local TSP in a single route.
				 */				
				if (! globalBestSearch) {				
					localTSP((TWVehicleRoute)array[indexI]);		    		
					localTSP((TWVehicleRoute)array[indexJ]);	    				
				}				
			}			
		}
		
		if (globalBestSearch) {
			routesList = mergeSolutions();
			Object arrayBest[] = routesList.toArray();
			
			/*
			 * Improve single routes by doing a GA TSP in their clients.
			 */
			for (indexI = 0; indexI < arrayBest.length; indexI++) {
					localTSP((TWVehicleRoute)arrayBest[indexI]);		    		
			}

			routesList = new LinkedList(Arrays.asList(arrayBest));
			
		} // end if GLOBAL BEST
		else { 
			routesList = new LinkedList(Arrays.asList(array));
		}
				
		eliminateNonRoutes();
	}
	
	private void eliminateNonRoutes() {
		LinkedList newList = new LinkedList();
		for (Iterator iter = routesList.iterator(); iter.hasNext();) {
			TWVehicleRoute element = (TWVehicleRoute) iter.next();
			if (element.suppliedDemand > 0) {
				newList.add(element);
			}
		}
		routesList = newList;
	}
	
	public boolean isGlobalBestSearch() {
		return globalBestSearch;
	}

	public void setGlobalBestSearch(boolean globalBestSearch) {
		this.globalBestSearch = globalBestSearch;
	}

	public LinkedList getRoutesList() {
		return routesList;
	}	

	private String buildRoutesString() {
		StringBuffer result = new StringBuffer();
		
		for (Iterator iter = routesList.iterator(); iter.hasNext();) {
			TWVehicleRoute element = (TWVehicleRoute) iter.next();
			result.append(element.toString() + '\n');
		}
		
		return result.toString();
	}
		
	private void localTSP(TWVehicleRoute element) {			

		TWVehicleRoute elementClone = (TWVehicleRoute)element.clone();
		
		if (elementClone.getNumServicedClients() > TSProblemModel.MIN_TSP_SIZE) {
			double saving = elementClone.totalDistance;
			
			tsProblemRef.setClientStructures(elementClone.getCanonicalClientList());		
			tsProblemRef.setVisualFeedback(false);			
			TSPGeneticAlgorithm tspGA = new TSPGeneticAlgorithm(g);
			tspGA.execute();
			
			/*
			 * Test insertion inside clone first, the new found sequence may not
			 * be feasible inside client time windows.
			 */
			if (elementClone.setClientListAsArray(tspGA.getBestChromosomeAsArray())) {
				element.setClientListAsArray(tspGA.getBestChromosomeAsArray());
				saving = saving - element.totalDistance;
				if (saving > 0) {			
					System.out.println
					(" Saving of " + saving + " distance from local TSP of vehicle: " + element.vehicleIndex);
				}							
			}
		}
		
	}

	private RoutePermutation bestRouteIJMoves() {		
				
		if (! possibleMovesIJ.isEmpty()) {			
			Collections.sort(possibleMovesIJ);			
			
			/*
			 * Get the best move between routeI and routeJ.
			 */
			RoutePermutation rp = (RoutePermutation)possibleMovesIJ.removeFirst();
			
			return rp;			
		}
		
		return null;
	}
	
	/**
	 * Mark the possible sequence moves that can be realized between
	 * diferent pairs of routes.
	 *  
	 * @return
	 */
	private LinkedList mergeSolutions() {		
		
		/*
		 * Finding the best possible merges
		 */
		LinkedList bestMoves = new LinkedList();
		
		if (! neighborList.isEmpty()) {
			Collections.sort(neighborList);			
			
			for (Iterator iter = neighborList.iterator(); iter.hasNext();) {
				RoutePermutation element = (RoutePermutation) iter.next();
				
				if (!bestMoves.contains(element))
				{		
					/*
					 * Checking the possibility of accepting worst states
					 * to overcome local optima.
					 */
					if (element.savings < 0) {
						bestMoves.add(element);	
					}
					else if ( element.savings > 0 && acceptBadMoves) {
						bestMoves.add(element);
					}									
				}				
			}			
		}

		/*
		 * Realize the moves inside routesList:
		 */
		LinkedList routesMirror = new LinkedList(routesList);
		
		if (! bestMoves.isEmpty()) {
			
			for (Iterator iter = bestMoves.iterator(); iter.hasNext();) {
				RoutePermutation element = (RoutePermutation) iter.next();

				/*
				 * Updating the mirror of the real route List.
				 */
				routesMirror.set(element.i, element.routeI);
				routesMirror.set(element.j, element.routeJ);
			}			
		}
				
		return routesMirror;
	}

	/**
	 * Searching for permutation possibilities between all clients from route I and J.
	 * for a permutation to be concluded, a cost function is calculated to see if 
	 * the change will generate benefit for the new solution, if a permutation happens,
	 * then the method returns a true, otherwise return false, unchanged data.
	 * 
	 * @author Guilherme  
	 */
	private double searchClients(TWVehicleRoute routeICopy, TWVehicleRoute routeJCopy) {

		double saving = 0.0D;
		
		int numClientsI = routeICopy.getNumServicedClients();
		int numClientsJ = routeJCopy.getNumServicedClients();
		
		for (int i = 1; i < numClientsI; i++) {
			
//			TimeWindowClient clientI = routeICopy.getClient(i);
			LinkedList bestInsertI = new LinkedList();
			//LinkedList bestInsertJ = new LinkedList();
			
			for (int j = 1; j < numClientsJ; j++) {


				/*
				 * Only check the most favored clients
				 */			
				TWClient clientJ = routeJCopy.getClient(j);
								
				/*
				 * Calculating the most promised clients to insert in route I. 
				 */
				CostInsertionBetweenPath cipbI = new CostInsertionBetweenPath
				(routeICopy, i, clientJ, j);
				bestInsertI.add(cipbI);				
//				System.out.println(" CIPB(0,1) I = " + cipbI.totalCost);
				
				/*
				 * Calculating the most promised clients to insert in route J. 
				 */
//				CostInsertionBetweenPath cipbJ = new CostInsertionBetweenPath
//				(routeJCopy, j, clientI, i);
//				bestInsertJ.add(cipbJ);
//				System.out.println(" CIPB(1,0) J = " + cipbJ.totalCost);
								
			}			

			/*
			 * Only consider the most promised clients to exchange:
			 */
			Collections.sort(bestInsertI);
//			Collections.sort(bestInsertJ);
						
			int counter = 0;
			while (!bestInsertI.isEmpty() && counter < (CLOSEST_CLIENTS_WINDOW)) {
				
				CostInsertionBetweenPath cipbI = 
					(CostInsertionBetweenPath)bestInsertI.removeFirst();
								
				/*
				 * Search in the order given by LAMBDA interchange:
				 * (0,1), (1,0), (1,1) ...
				 */				
				double localSaving = lambdaInterchange
				(routeICopy, i, routeJCopy, cipbI.clientIndex, lambda); 				 
				
				if (localSaving != 0) 
				{
					saving += localSaving;
					numClientsI = routeICopy.getNumServicedClients();
					numClientsJ = routeJCopy.getNumServicedClients();													
				}
				
				counter++;
			}			
			
		}

		return saving;
	}

	/**
	 * Realizes the permutation (0,N), (N,0), [(N-1)*,N], [N,(N-1)*] and (N,N).
	 * 
	 * (N-1)* = N-1, N-2, N-3 ... N - ( N - 1 )
	 * 
	 * @author Guilherme
	 * @param routeJ 
	 * @param routeI 
	 */	
	private double lambdaInterchange
	(TWVehicleRoute routeI, int i, TWVehicleRoute routeJ, int j, int lambdaValue)
	{
		double saving = 0.0D;
				
		if (lambdaValue > 1) {
			saving = lambdaInterchange(routeI, i, routeJ, j, (lambdaValue - 1));
		}
		
		/*
		 * checking window limit to avoid index out of bounds Error.
		 */		
		if ( (i >= routeI.getNumServicedClients()) ||
			 (j >= routeJ.getNumServicedClients()) )
		{
			return saving;			
		}		
		
		TWVehicleRoute routeIClone = (TWVehicleRoute)routeI.clone();
		TWVehicleRoute routeJClone = (TWVehicleRoute)routeJ.clone();
		/*
		 * Auxiliar array to remove clients from a route to another.
		 */
		ArrayList removedJ = new ArrayList(lambdaValue);							
		
		/*
		 * Move (0,N):
		 */
		boolean validMove = true;
		/*
		 * flag to restore condition of original copy.
		 */		
		boolean modified = true;	
		
		int counter = 0;
		while (counter < lambdaValue) {
			
			if (j >= routeJClone.getNumServicedClients()) {
				validMove = false;
				break;
			}
			
			removedJ.add(routeJClone.removeClient(j));	
			counter++;
		}		
						
		counter = 0;
		int indexI = i; // for correct index ordered insertion values.
		
		if (validMove) {
			while (counter < lambdaValue) {

				TWClient clientJ = (TWClient)removedJ.remove(0);
				
				/*
				 * Only check insertion when a route has espace, for performance
				 * gain. It is already checked inside VehicleRoute.addClient();
				 */			
				if	(! routeIClone.addClient(clientJ, indexI)) 
				    {
						validMove = false;
						break;
					}
					
				indexI++;				
				counter++;
				
			} // end while					
		}

		/*
		 * Move OK! Now commit the changes to real routes.
		 */
		if (validMove) {
			/*
			 * GLOBAL BEST SEARCH may accept neighbors with higher values
			 */
			double localSaving = statManager.calculateSavings(routeIClone, routeI, routeJClone, routeJ);
			
			if (globalBestSearch) {
				RoutePermutation rp = new RoutePermutation
				(routeIClone, routesList.indexOf(routeI), routeJClone, 
						routesList.indexOf(routeJ), localSaving);
				
				possibleMovesIJ.add(rp);				
			}
			else if (localSaving < 0)
			{
				saving += localSaving;
				/*
				 * Realiza the moves in real route data structures.
				 */
				removedJ = new ArrayList(lambdaValue);									
				
				counter = 0;
				while (counter < lambdaValue) {					
					removedJ.add(routeJ.removeClient(j));	
					counter++;
				}		
				
				counter = 0;
				indexI = i; // for correct index ordered insertion values.
				while (counter < lambdaValue) {
				
					TWClient clientJ = (TWClient)removedJ.remove(0);
					
					routeI.addClient(clientJ, indexI);
					counter++;
					indexI++;
				} // end while
				
				modified = false;
			}
		} 
		
		if (modified) {
			routeIClone = (TWVehicleRoute)routeI.clone();
			routeJClone = (TWVehicleRoute)routeJ.clone();			
		}

		/*
		 * Move (N, 0):
		 */
		validMove = true;
		modified = true;
		ArrayList removedI = new ArrayList(lambdaValue);
		
		counter = 0;
		while (counter < lambdaValue) {
			
			if (i >= routeIClone.getNumServicedClients()) {
				validMove = false;
				break;
			}
			
			removedI.add(routeIClone.removeClient(i));	
			counter++;
		}				

		counter = 0;
		int indexJ = j; // for correct index ordered insertion values.
		
		if (validMove) {
			while (counter < lambdaValue) {
				
				TWClient clientI = (TWClient)removedI.remove(0);
				
				/*
				 * Only check insertion when a route has espace, for performance
				 * gain. It is already checked inside VehicleRoute.addClient();
				 */			
				if (! routeJClone.addClient(clientI, indexJ)) 
				    {
						validMove = false;
						break;
					} 
												
				indexJ++;				
				counter++;				
			} // end while					
		}
		
		/*
		 * Move OK! Now commit the changes to real routes.
		 */
		if (validMove) {
			/*
			 * GLOBAL BEST SEARCH may accept neighbors with higher values
			 */
			double localSaving = statManager.calculateSavings(routeIClone, routeI, routeJClone, routeJ);			
			if (globalBestSearch) {
				RoutePermutation rp = new RoutePermutation
				(routeIClone, routesList.indexOf(routeI), routeJClone, 
						routesList.indexOf(routeJ), localSaving);
				
				possibleMovesIJ.add(rp);				
			}
			else if (localSaving < 0)
			{
				saving += localSaving;
				removedI = new ArrayList(lambdaValue);
				
				/*
				 * Realiza the moves in real route data structures.
				 */				
				counter = 0;
				while (counter < lambdaValue) {					
					removedI.add(routeI.removeClient(i));	
					counter++;
				}		
				
				counter = 0;
				indexJ = j; // for correct index ordered insertion values.
				while (counter < lambdaValue) {
					
					TWClient clientI = (TWClient)removedI.remove(0);
					
					routeJ.addClient(clientI, indexJ);
					counter++;
					indexJ++;
				} // end while
						
				modified = false;				
			}
		} 

		if (modified) {
			routeIClone = (TWVehicleRoute)routeI.clone();
			routeJClone = (TWVehicleRoute)routeJ.clone();			
		}

		/*
		 * Move [(N-1)*, N]: Only for Interchanges upper than 1
		 * 
		 * for (1 to N-1), realize the interchange (k,N):
		 */
		for (int k = 1; k < lambdaValue; k++) {
			
			validMove = true;
			modified = true;

			removedI = new ArrayList(lambdaValue);
			removedJ = new ArrayList(lambdaValue);			
			
			/*
			 * Remove first N clients from route J:
			 */
			counter = 0;
			while (counter < lambdaValue) {
				
				if (j >= routeJClone.getNumServicedClients()) {
					validMove = false;
					break;
				}
				
				removedJ.add(routeJClone.removeClient(j));	
				counter++;
			}				

			/*
			 * Remove k clients from route I:
			 */
			counter = 0;
			while (counter < k) {
				
				if (i >= routeIClone.getNumServicedClients()) {
					validMove = false;
					break;
				}
				
				removedI.add(routeIClone.removeClient(i));	
				counter++;
			}				

			/*
			 * Test insertion of N clients from route J in route I
			 */
			counter = 0;
			indexI = i; // for correct index ordered insertion values.
			
			if (validMove) {
				while (counter < lambdaValue) {

					TWClient clientJ = (TWClient)removedJ.remove(0);
					
					/*
					 * Only check insertion when a route has space, for performance
					 * gain. It is already checked inside VehicleRoute.addClient();
					 */			
					if (! routeIClone.addClient(clientJ, indexI)) 
					    {
							validMove = false;
							break;
						} 
													
					indexI++;				
					counter++;				
				} // end while					
			}
			
			/*
			 * Test insertion of k clients from route I in route J
			 */
			counter = 0;
			indexJ = j; // for correct index ordered insertion values.
			
			if (validMove) {
				while (counter < k) {

					TWClient clientI = (TWClient)removedI.remove(0);
					
					/*
					 * Only check insertion when a route has space, for performance
					 * gain. It is already checked inside VehicleRoute.addClient();
					 */			
					if (! routeJClone.addClient(clientI, indexJ)) 
					    {
							validMove = false;
							break;
						} 
													
					indexJ++;				
					counter++;				
				} // end while					
			}
			
			/*
			 * Move OK! Now commit the changes to real routes.
			 */
			if (validMove) {
				/*
				 * GLOBAL BEST SEARCH may accept neighbors with higher values
				 */
				double localSaving = statManager.calculateSavings(routeIClone, routeI, routeJClone, routeJ);			
				if (globalBestSearch) {
					RoutePermutation rp = new RoutePermutation
					(routeIClone, routesList.indexOf(routeI), routeJClone, 
							routesList.indexOf(routeJ), localSaving);
					
					possibleMovesIJ.add(rp);				
				}
				else if (localSaving < 0)
				{
					saving += localSaving;
					removedI = new ArrayList(lambdaValue);
					removedJ = new ArrayList(lambdaValue);
					
					/*
					 * Realize the moves in real route data structures.
					 */				
					counter = 0;
					while (counter < lambdaValue) {					
						removedJ.add(routeJ.removeClient(j));	
						counter++;
					}		

					counter = 0;
					while (counter < k) {					
						removedI.add(routeI.removeClient(i));	
						counter++;
					}		
					
					counter = 0;
					indexI = i; // for correct index ordered insertion values.
					while (counter < lambdaValue) {
						
						TWClient clientJ = (TWClient)removedJ.remove(0);
						
						routeI.addClient(clientJ, indexI);
						counter++;
						indexI++;
					} // end while

					counter = 0;
					indexJ = j; // for correct index ordered insertion values.
					while (counter < k) {
						
						TWClient clientI = (TWClient)removedI.remove(0);
						
						routeJ.addClient(clientI, indexJ);
						counter++;
						indexJ++;
					} // end while
					
					modified = false;				
				}
			} 

			if (modified) {
				routeIClone = (TWVehicleRoute)routeI.clone();
				routeJClone = (TWVehicleRoute)routeJ.clone();			
			}
			
		} // end for
			

		/*
		 * Move [N, (N-1)*]: Only for Interchanges upper than 1
		 * 
		 * for (1 to N-1), realize the interchange (N,k):
		 */
		for (int k = 1; k < lambdaValue; k++) {
			validMove = true;
			modified = true;
			
			removedI = new ArrayList(lambdaValue);
			removedJ = new ArrayList(lambdaValue);

			/*
			 * Remove first k clients from route J:
			 */
			counter = 0;
			while (counter < k) {
				
				if (j >= routeJClone.getNumServicedClients()) {
					validMove = false;
					break;
				}
				
				removedJ.add(routeJClone.removeClient(j));	
				counter++;
			}				

			/*
			 * Remove N clients from route I:
			 */
			counter = 0;
			while (counter < lambdaValue) {
				
				if (i >= routeIClone.getNumServicedClients()) {
					validMove = false;
					break;
				}
				
				removedI.add(routeIClone.removeClient(i));	
				counter++;
			}				

			/*
			 * Test insertion of k clients from route J in route I
			 */
			counter = 0;
			indexI = i; // for correct index ordered insertion values.
			
			if (validMove) {
				while (counter < k) {

					TWClient clientJ = (TWClient)removedJ.remove(0);
					
					/*
					 * Only check insertion when a route has space, for performance
					 * gain. It is already checked inside VehicleRoute.addClient();
					 */			
					if (! routeIClone.addClient(clientJ, indexI)) 
					    {
							validMove = false;
							break;
						} 
													
					indexI++;				
					counter++;				
				} // end while					
			}
			
			/*
			 * Test insertion of N clients from route I in route J
			 */
			counter = 0;
			indexJ = j; // for correct index ordered insertion values.
			
			if (validMove) {
				while (counter < lambdaValue) {

					TWClient clientI = (TWClient)removedI.remove(0);
					
					/*
					 * Only check insertion when a route has space, for performance
					 * gain. It is already checked inside VehicleRoute.addClient();
					 */			
					if (! routeJClone.addClient(clientI, indexJ)) 
					    {
							validMove = false;
							break;
						} 
													
					indexJ++;				
					counter++;				
				} // end while					
			}
			
			/*
			 * Move OK! Now commit the changes to real routes.
			 */
			if (validMove) {
				/*
				 * GLOBAL BEST SEARCH may accept neighbors with higher values
				 */
				double localSaving = statManager.calculateSavings(routeIClone, routeI, routeJClone, routeJ);			
				if (globalBestSearch) {
					RoutePermutation rp = new RoutePermutation
					(routeIClone, routesList.indexOf(routeI), routeJClone, 
							routesList.indexOf(routeJ), localSaving);
					
					possibleMovesIJ.add(rp);				
				}
				else if (localSaving < 0)
				{
					saving += localSaving;
					removedI = new ArrayList(lambdaValue);
					removedJ = new ArrayList(lambdaValue);
					
					/*
					 * Realize the moves in real route data structures.
					 */				
					counter = 0;
					while (counter < k) {					
						removedJ.add(routeJ.removeClient(j));	
						counter++;
					}		

					counter = 0;
					while (counter < lambdaValue) {					
						removedI.add(routeI.removeClient(i));	
						counter++;
					}		
					
					counter = 0;
					indexI = i; // for correct index ordered insertion values.
					while (counter < k) {
						
						TWClient clientJ = (TWClient)removedJ.remove(0);
						
						routeI.addClient(clientJ, indexI);
						counter++;
						indexI++;
					} // end while

					counter = 0;
					indexJ = j; // for correct index ordered insertion values.
					while (counter < lambdaValue) {
						
						TWClient clientI = (TWClient)removedI.remove(0);
						
						routeJ.addClient(clientI, indexJ);
						counter++;
						indexJ++;
					} // end while
					
					modified = false;				
				}
			} 

			if (modified) {
				routeIClone = (TWVehicleRoute)routeI.clone();
				routeJClone = (TWVehicleRoute)routeJ.clone();			
			}
			
		} // end for
		
		/*
		 * Move (N,N):
		 */
		validMove = true;
		removedI = new ArrayList(lambdaValue);
		removedJ = new ArrayList(lambdaValue);

		counter = 0;
		while (counter < lambdaValue) {
			
			if (i >= routeIClone.getNumServicedClients() ||
				j >= routeJClone.getNumServicedClients())
			{
				validMove = false;
				break;
			}
			
			removedI.add(routeIClone.removeClient(i));
			removedJ.add(routeJClone.removeClient(j));
			counter++;
		}		

		counter = 0;
		indexI = i; // for correct index ordered insertion values.
		indexJ = j; // for correct index ordered insertion values.
		
		if (validMove) {
			while (counter < lambdaValue) {

				TWClient clientI = (TWClient)removedI.remove(0);
				TWClient clientJ = (TWClient)removedJ.remove(0);
				
				/*
				 * Only check insertion when a route has espace, for performance
				 * gain. It is already checked inside VehicleRoute.addClient();
				 */			
				if ((! routeIClone.addClient(clientJ, indexI)) ||
					(! routeJClone.addClient(clientI, indexJ))) 
				    {
						validMove = false;
						break;
					} 

				counter++;
				indexI++;
				indexJ++;
				
			} // end while					
		}
		
		/*
		 * Move OK! Now commit the changes to real routes.
		 */
		if (validMove) {
			/*
			 * GLOBAL BEST SEARCH may accept neighbors with higher values
			 */
			double localSaving = statManager.calculateSavings(routeIClone, routeI, routeJClone, routeJ);			
			if (globalBestSearch) {
				RoutePermutation rp = new RoutePermutation
				(routeIClone, routesList.indexOf(routeI), routeJClone, 
						routesList.indexOf(routeJ), localSaving);
				
				possibleMovesIJ.add(rp);				
			}
			else if (localSaving < 0)
			{
				saving += localSaving;
				removedI = new ArrayList(lambdaValue);
				removedJ = new ArrayList(lambdaValue);
				
				/*
				 * Realize the moves in real route data structures.
				 */				
				counter = 0;
				while (counter < lambdaValue) {					
					removedI.add(routeI.removeClient(i));
					removedJ.add(routeJ.removeClient(j));
					counter++;
				}		
				
				counter = 0;
				indexI = i; // for correct index ordered insertion values.
				indexJ = j; // for correct index ordered insertion values.
				while (counter < lambdaValue) {
					
					TWClient clientI = (TWClient)removedI.remove(0);
					TWClient clientJ = (TWClient)removedJ.remove(0);					
					
					routeI.addClient(clientJ, indexI);				
					routeJ.addClient(clientI, indexJ);
					counter++;
					indexI++;
					indexJ++;
				} // end while							
			}
		} 
		
		return saving;
	}
	
	
	/**
	 * Remove k clients from route I that are inside routeJ path  
	 * Remove k clients from route J that are inside routeI path
	 * 
	 * Insert k clients from routeI into routeJ
	 * Insert k clients from routeJ into routeI
	 * 
	 * @param routeI
	 * @param routeJ
	 * @return the total amount of heuristic value saved.
	 */
	private double uncrossRoutes(TWVehicleRoute routeI, TWVehicleRoute routeJ) {
		double saving = 0;		
		
		/*
		 * Try RouteI and RouteJ Clients:
		 */
		TWVehicleRoute routeIClone = (TWVehicleRoute)routeI.clone();
		TWVehicleRoute routeJClone = (TWVehicleRoute)routeJ.clone();
		
		/*
		 * for each client of routeI
		 */
		ArrayList removeI = new ArrayList();
		ArrayList removeJ = new ArrayList();

		/*
		 * find all clients of route I inside any ShortestPath from RouteJ.
		 * 
		 * begin at index 1, because index 0 is the depot
		 */
		int clientsJArray[] = routeJ.getClientListAsIntArray();
		ArrayList clientsI = routeI.cloneClientList();
		for (int i = 1; i < clientsJArray.length; i++) {

			ArrayList commonSet = routeJ.getClientsInShortestPath((i-1),i,clientsI);
			
			/*
			 * If exist a set of nodes common to route I and route J in this 
			 * shortestPath
			 */
			if (! commonSet.isEmpty()) {
				UncrossRouteHeuristicData urhd = new 
					UncrossRouteHeuristicData(commonSet, (i-1),i);
				
				removeI.add(urhd);
			}				
		}

		/*
		 * check for the round trip, the Shortest Path from
		 * the last client to the depot:
		 */
		ArrayList common = routeJ.getClientsInShortestPath
		((clientsJArray.length - 1),0,clientsI);
		
		if (common != null) {
			if (! common.isEmpty()) {
				UncrossRouteHeuristicData urhd = new 
					UncrossRouteHeuristicData(common, (clientsJArray.length - 1),0);
				
				removeI.add(urhd);
			}							
		}
		
		/*
		 * find all clients of route J inside any ShortestPath from RouteI.
		 * 
		 * begin at index 1, because index 0 is the depot
		 */	
		int clientsIArray[] = routeI.getClientListAsIntArray();
		ArrayList clientsJ = routeJ.cloneClientList();
		for (int i = 1; i < clientsIArray.length; i++) {

			ArrayList commonSet = routeI.getClientsInShortestPath((i-1),i,clientsJ);
			
			/*
			 * If exist a set of nodes common to route I and route J in this 
			 * shortestPath
			 */
			if (! commonSet.isEmpty()) {
				UncrossRouteHeuristicData urhd = new 
					UncrossRouteHeuristicData(commonSet, (i-1),i);
				
				removeJ.add(urhd);
			}				
		}

		/*
		 * check for the round trip, the Shortest Path from
		 * the last client to the depot:
		 */
		common = routeI.getClientsInShortestPath
		((clientsIArray.length - 1),0,clientsJ);

		if (common != null) {
			if (! common.isEmpty()) {
				UncrossRouteHeuristicData urhd = new 
					UncrossRouteHeuristicData(common, (clientsIArray.length - 1),0);
				
				removeI.add(urhd);
			}			
		}
		
		/*
		 * Free some space inside both routes, reducing the common set nodes
		 */
		boolean feasible = true; // for now, we assume move is feasible.
		
		Object objArray[] = removeI.toArray();		
		for (int i = 0; i < objArray.length; i++) {			
			UncrossRouteHeuristicData urhd = 
				(UncrossRouteHeuristicData)objArray[i];
			
			if (! routeIClone.removeClients(urhd.clients)) {
				feasible = false;
				break;
			}
		}

		if (feasible) {
			objArray = removeJ.toArray();		
			for (int i = 0; i < objArray.length; i++) {
				UncrossRouteHeuristicData urhd = 
					(UncrossRouteHeuristicData)objArray[i];
				
				if (! routeJClone.removeClients(urhd.clients)) {
					feasible = false;
					break;
				}
			}			
		}
		
		if (feasible) {
			/*
			 * try to make all clients removed from i, a member of RouteJ.
			 */	
			objArray = removeI.toArray();		
			for (int i = 0; i < objArray.length; i++) {
				UncrossRouteHeuristicData urhd = 
					(UncrossRouteHeuristicData)objArray[i];
				
				/*
				 * check feasible insertion for all clients common
				 * inside one shortest path.
				 */			
				if (! routeJClone.addClients(urhd.clients, urhd.j)) {
					 feasible = false;
					 break;
				}
			}

			/*
			 * try to make all clients removed from J, a member of RouteI.
			 */				
			objArray = removeJ.toArray();		
			for (int i = 0; i < objArray.length; i++) {
				UncrossRouteHeuristicData urhd = 
					(UncrossRouteHeuristicData)objArray[i];
				
				/*
				 * check feasible insertion for all clients common
				 * inside one shortest path.
				 */			
				if (! routeIClone.addClients(urhd.clients, urhd.j)) {
					 feasible = false;
					 break;
				}
			}
			
		} // end if feasible

		/*
		 * Check to see if adition of client improved the route quality:
		 * if negative value, the addition tends to be better by the new 
		 * cloned routes, otherwise the old routes are better.
		 */
		if (feasible) {
		
			/*
			 * GLOBAL BEST SEARCH may accept neighbors with higher values
			 */
			double localSaving = statManager.calculateSavings(routeIClone, routeI, routeJClone, routeJ);			
			if (localSaving < 0 || globalBestSearch)
			{
				saving += localSaving;
				/*
				 * if all is feasible, commit changes:
				 * 
				 * make all clients removed from i, a member of RouteJ.
				 */	
				objArray = removeI.toArray();		
				for (int i = 0; i < objArray.length; i++) {
					UncrossRouteHeuristicData urhd = 
						(UncrossRouteHeuristicData)objArray[i];
					
					if (! routeJ.addClients(urhd.clients, urhd.j)) {
						 System.out.println(" EXCEPTION at uncrossing Routes");
						 break;
					}
				}

				/*
				 * make all clients removed from J, a member of RouteI.
				 */				
				objArray = removeJ.toArray();		
				for (int i = 0; i < objArray.length; i++) {
					UncrossRouteHeuristicData urhd = 
						(UncrossRouteHeuristicData)objArray[i];
					
					if (! routeI.addClients(urhd.clients, urhd.j)) {
						System.out.println(" EXCEPTION at uncrossing Routes");
						 break;
					}
				}
			}
			
		} // end if feasible
					
		return saving;
	}
	
	/**
	 * Internal Class UncrossRouteHeuristicData
	 * 
	 * Represents the data need to perform an uncross operation.
	 * 
	 * The algortihm goes like this:
	 * 
	 * "insert client between index i --- index j".
	 *  These index values need to be the closest values.
	 * 
	 * DataObjectWrapper, represents the heuristic knowledge needed to guide the
	 * algorithm.
	 */
	class UncrossRouteHeuristicData {
		
		/*
		 * public fields for obtaining performance
		 */
		private int i;
		private TWClient clients[];		
		private int j;
				
		public UncrossRouteHeuristicData
		(ArrayList clientList, int i, int j)
		{
			/*
			 * between i -> j, if index of i is lower than index of j
			 * otherwise between j -> i.
			 */
			if (j < i) {
			    this.i = j;
			    this.j = i;
			}
			
			clients = new TWClient[clientList.size()];
			int counter = 0;
			for (Iterator iter = clientList.iterator(); iter.hasNext();) {
				TWClient element = (TWClient)iter.next();
				clients[counter] = element;
				counter++;
			}
		}

		public boolean equals(Object obj) {
			UncrossRouteHeuristicData arg = (UncrossRouteHeuristicData) obj;
			return (this.i == arg.i && this.j == arg.j);
		}						
	}			
	
}