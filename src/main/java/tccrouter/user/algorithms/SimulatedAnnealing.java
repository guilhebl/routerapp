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
import tccrouter.gbl.tsp.genetic.tools.MersenneTwister;
import tccrouter.gbl.vrp.common.entity.RoutePermutation;
import tccrouter.gbl.vrp.common.entity.StatisticsManager;
import tccrouter.gbl.vrp.common.entity.VRProblemModel;
import tccrouter.gbl.vrp.tw.entity.TWClient;
import tccrouter.gbl.vrp.tw.entity.TWVehicleRoute;

/**
 * Simulated Annealing for VRPTW.
 * Implementation based on the paper:
 * 
 * Heuristic Methods for Vehicle Routing Problem with Time Windows
 * Authors: K.C. Tan; L.H. Lee and K.Q. Zhu
 * 
 * @author Guilherme Becker Lamounier
 *
 */
public class SimulatedAnnealing extends Algorithm {
		
	/**
	 * Reference to the ExecutionTrace object to measure execution performance
	 */
    ExecutionTrace executionTrace;
    boolean measureExecution;
	
	VRProblemModel vrProblemRef;
	TSProblemModel tsProblemRef;
	StatisticsManager statManager;	
	
	/*
	 * The source node
	 */
	int depotIndex;

	/*
	 * List to save the current S solution.
	 */
	LinkedList currentSolution;	

	/*
	 * Current Best S solution.
	 */
	LinkedList bestSolution;	
	
	/*
	 * Starting temperature of the SA.
	 */
	double temperatureS;

	/*
	 * Final temperature of the SA.
	 */
	double temperatureF;

	/*
	 * Temperature at wich the current best solution was found.
	 */
	double temperatureB;

	/*
	 * Reset Temperature originally equal to the starting temperature.
	 */
	double temperatureR;

	/*
	 * Temperature of the current step.
	 */
	double temperatureK;

	/*
	 * Temperature of the last step.
	 */
	double temperatureLastK;
	
	/*
	 * The current step.
	 */
	int k;
	
	/*
	 * The number of resets to be done.
	 */
	int resets;
	/*
	 * The number of resets done at the moment.
	 */
	int numResets;

	/*
	 * Time constant in the range of (0,1).
	 */
	double tConst;

	/*
	 * The delta heuristic difference between the value of 2 solutions.
	 */
	double delta;

	/*
	 * The heuristic value of the best found route.
	 */
	double bestCost;
	
	/*
	 * The neighborhood window size LAMBDA
	 */
	int lambda;

	/*
	 * The savings parameter to choose wich permutation to move.
	 */
	double totalSavings;
	
	/*
	 * If search for improvement of global states
	 */
	boolean globalBestSearch;
	
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
	public SimulatedAnnealing(Graph g) {
		super(g, "Simulated Annealing - VRPTW");
		currentSolution = new LinkedList();
		neighborList = new LinkedList();		
		VRProblemModel.getInstance().setNewVRP(g);
		vrProblemRef = VRProblemModel.getInstance();
		tsProblemRef = TSProblemModel.getInstance();
		statManager = StatisticsManager.getInstance();
		visualFeedBack = tsProblemRef.isVisualFeedback();
		globalBestSearch = vrProblemRef.isGlobalBestLSD();
		
		if (visualFeedBack) {
		    tsProblemRef.resetAdvancedStructures(g);
		}
		
		//measureExecution = vrProblemRef.isSAExecutionMeasure();
		measureExecution = tsProblemRef.isExecutionMeasure();
		if (measureExecution) {
			executionTrace = ExecutionTrace.getInstance();
		}
		
		depotIndex = tsProblemRef.getSourceNodeIndex();
		lambda = vrProblemRef.getSaLambda();
		numResets = k = 0;
		resets = 8;
				
		temperatureF = 0.001;
	}

	/**
	 * @see diamante.core.command.Command#execute()
	 */
	public void execute() {
		if (measureExecution) {
			executionTrace.initialTrace();
		}		

		/*
		 * SA 1: Obtain a feasible solution S for the VRPTW
		 *        using PFIH. (Local Search already does this.)
		 *         
		 * SA 2: Improve S using the 2-interchange LSD Global Best strategy
		 */
		tsProblemRef.setVisualFeedback(false);			
		LocalSearch localSearch = new LocalSearch(g);
		localSearch.setGlobalBestSearch(true);
		localSearch.execute();
		
		/*
		 * For the algorithm SA we need the hability to accept worse moves to overcome
		 * local optimal, and the permutations (N,0) uses the firstBestSearch strategy 
		 */
		vrProblemRef.setGlobalBestLSD(false);		
		vrProblemRef.setBadMovesLSD(true);
		currentSolution = localSearch.getRoutesList();
		bestSolution = currentSolution;		
		
		globalBestSearch = false;
		bestCost = 0.0D;
		
		/*
		 * SA 3: Set cooling parameters: T(s) = T(b) = T(r) = T(k) = 100, t = 0.5
		 */
		temperatureS = temperatureB = temperatureR = temperatureK = temperatureLastK = 100;
		tConst = 0.5;

		/*
		 * SA-7: If {R resets have been made since the last S(b) was found}
		 *       then go to step SA-8
		 *       else go to step SA-4
		 */					
		while (numResets < resets && temperatureK > temperatureF) 
		{
		
			if (measureExecution) {
				executionTrace.iterationTrace();
			}
			
			/*
			 * List to save the new S� solution.
			 */
			LinkedList newSolution = (LinkedList)currentSolution.clone();				
			Object array[] = newSolution.toArray();
			boolean moved = false;

			/*
			 * SA-4: Generate systematically an S� from N(S) by (2,0) and (1,0) operations.
			 *       and compute DELTA = Cost(S�) - Cost(S). 
			 */						
			for (indexI = 0; indexI < array.length; indexI++) {
				for (indexJ = 0; indexJ < array.length; indexJ++) {
					/*
					 * get a pair of routes R(i) & R(j)
					 */
					if (indexI != indexJ) {
						TWVehicleRoute routeI = (TWVehicleRoute)array[indexI];
						TWVehicleRoute routeJ = (TWVehicleRoute)array[indexJ];

						TWVehicleRoute routeICopy = (TWVehicleRoute)routeI.clone();
						TWVehicleRoute routeJCopy = (TWVehicleRoute)routeJ.clone();

						possibleMovesIJ = new LinkedList();
						totalSavings = searchClients(routeICopy, routeJCopy);
						
						if (totalSavings != 0 || !possibleMovesIJ.isEmpty()) {
						
							moved = true;
							/*
							 * GLOBAL BEST STRATEGY:
							 * 
							 * Select the best move at the end
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
					} // end if
									
				} // end for
			} // end for
			
			if (globalBestSearch) {
				currentSolution = mergeSolutions();				
			} // end if GLOBAL BEST
			else { 
				newSolution = new LinkedList(Arrays.asList(array));
			}
			
			newSolution = eliminateNonRoutes(newSolution);
			
			/*
			 * compute DELTA = Cost(S�) - Cost(S):
			 */
			if (moved) {
				delta = statManager.solutionHeuristicDifference(newSolution, currentSolution);	
			} else {
				delta = 0.0D;
			}			 
			
			/*
			 * TETA is a random number between 0,1.
			 */
			double teta = MersenneTwister.getTwister().nextDouble(); 
				
			if (
					(delta <= 0) || 
					(delta > 0 && (Math.exp(-delta)/temperatureK) >= teta )
				)		
			{
				/*
				 * SA-5: set S = S�
				 */
				currentSolution = newSolution;

				/*
				 * if C(S) < C(S(best))
				 */
				if (statManager.solutionHeuristicDifference(currentSolution, bestSolution) < 0) 
				{
					/*
					 * improve S using 2-interchange LSD(GB).
					 */
					tsProblemRef.setVisualFeedback(false);			
					localSearch = new LocalSearch(g);
					localSearch.setGlobalBestSearch(true);
					localSearch.execute(currentSolution);					
					currentSolution = localSearch.getRoutesList();
					localSearch.setGlobalBestSearch(false);					
					
					/*
					 * Update S(best) = S and T(b) = T(k).
					 */
					bestSolution = currentSolution;
					temperatureB = temperatureK;
				} 
						
			} // end SA-5

			/*
			 * SA-6: Set k = k + 1. Update the temperature using Eq(16).
			 */			
			k++;
			temperatureK = temperatureLastK/(1 + tConst*Math.sqrt(temperatureLastK));
			
			/*
			 * If {N(S) is searched without any accepted move} then
			 * reset T(r) = max(T(r)/2, T(b)), and set T(k) = T(r).
			 */			
			if (!moved) {
				numResets++;
				temperatureR = Math.max((temperatureR/2), temperatureB);
				temperatureK = temperatureR;
				/*
				 * improve S using 2-interchange LSD(GB).
				 */
				tsProblemRef.setVisualFeedback(false);			
				localSearch = new LocalSearch(g);
				localSearch.setGlobalBestSearch(true);
				localSearch.execute(currentSolution);					
				currentSolution = localSearch.getRoutesList();
				localSearch.setGlobalBestSearch(false);
				
				globalBestSearch = false;				
			}
			
			
			temperatureLastK = temperatureK;
						
		} // end while
				
		/*
		 * SA-8: Terminate SA and print the results.
		 * 
		 * final time captured:
		 */				
		if (measureExecution) {
			executionTrace.finalTrace();
		}
		
		if (visualFeedBack) {
			
			// colors the resulting best path found
			ColorUtil.resetColorCounter();
			Object routes[] = bestSolution.toArray();
			
			for (int i = 0; i < routes.length; i++) {

				TWVehicleRoute vehicle = (TWVehicleRoute)routes[i];
				ColorUtil.colorPath(g, depotIndex, vehicle.getCanonicalClientList());
			}

			if (measureExecution) {
				String routesInfo = buildRoutesString();
				
				System.out.println
				("SA Total execution Time: "+ executionTrace.getFinalTime() + " ms\n" + routesInfo);
				
				// Shows a reply message with the label and time of execution
				OutputSender.showMessageDialog (
					"Total execution Time: "+
					executionTrace.getFinalTime() + " ms\nFinal Temperature: " + temperatureK + 
						"\n" + routesInfo,
					"Measured Time",
					OutputSender.INFORMATION_MESSAGE
				);			
			} // end if
		}
		
	}

	private LinkedList eliminateNonRoutes(LinkedList solution) {
		LinkedList newList = new LinkedList();
		for (Iterator iter = solution.iterator(); iter.hasNext();) {
			TWVehicleRoute element = (TWVehicleRoute) iter.next();
			if (element.suppliedDemand > 0) {
				newList.add(element);
			}
		}

		return newList;
	}

	private String buildRoutesString() {
		StringBuffer result = new StringBuffer();
		
		for (Iterator iter = bestSolution.iterator(); iter.hasNext();) {
			TWVehicleRoute element = (TWVehicleRoute) iter.next();
			result.append(element.toString() + '\n');
		}
		
		return result.toString();
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
			for (int j = 1; j < numClientsJ; j++) {

				/*
				 * Search in the order given by LAMBDA interchange:
				 */				
				double localSaving = lambdaInterchange
				(routeICopy, i, routeJCopy, j, lambda); 				 
				
				if (localSaving != 0) 
				{
					saving += localSaving;
					numClientsI = routeICopy.getNumServicedClients();
					numClientsJ = routeJCopy.getNumServicedClients();													
				}
			}												
		}

		return saving;
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
					 * Checking the possibility of accepting worse states
					 * to overcome local optima.
					 */
					if (element.savings < 0) {
						bestMoves.add(element);	
					}
					else if ( element.savings > 0 && vrProblemRef.isBadMovesLSD()) {
						bestMoves.add(element);
					}									
				}				
			}			
		}

		/*
		 * Realize the moves inside routesList:
		 */
		LinkedList routesMirror = new LinkedList(currentSolution);
		
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
	 * Realizes the permutation (N,0).
	 * As described in paper specifically to the SA.
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
		 * Move (N, 0):
		 */
		boolean validMove = true;
		ArrayList removedI = new ArrayList(lambdaValue);
		
		int counter = 0;
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
				(routeIClone, currentSolution.indexOf(routeI), routeJClone, 
						currentSolution.indexOf(routeJ), localSaving);
				
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
			}
		} 
		
		return saving;
	}
	
		
}