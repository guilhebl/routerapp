/* Copyright (c) 2006, Guilherme Becker Lamounier
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  - Redistributions of source code must retain the above copyright notice,
 * 	  this list of conditions and the following disclaimer.
 *  - Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *  - Neither the name of the Rin'G Project nor the names of its contributors
 *    may be used to endorse or promote products derived from this software
 *    without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE 
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE 
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN
 * IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package tccrouter.gbl.common.entity;

import java.util.ArrayList;
import java.util.Iterator;

import tccrouter.diamante.core.graph.Graph;
import tccrouter.diamante.core.graph.property.ComponentProperties;
import tccrouter.diamante.extension.graph.property.Position;
import tccrouter.gbl.common.util.ColorUtil;
import tccrouter.ring.gui.UIFacade;
import tccrouter.user.algorithms.AStar;

/**
 * 
 */
public class TSProblemModel {

    /*
	 * GENERAL CONSTANTS
	 */
	public static final int MIN_TSP_SIZE = 4;
    public  static final int CITY_X     =  0;
	public  static final int CITY_Y     =  1;
	public  static final int EUCLIDIAN_PLANE =  2;
	public  static final boolean DEFAULT_MEASURE_EXECUTION = true;
	public static final boolean ASTAR_DEFAULT_MEASURE_EXECUTION = false;
	public  static final boolean DEFAULT_VISUAL_FEEDBACK = true;
	
	/*
	 * GA
	 */
	public static final boolean GA_DEFAULT_MEASURE_EXECUTION = false;
	public static final int DEFAULT_GA_POP_SIZE = 100;
	public static final int DEFAULT_GA_MAX_GENERATIONS = 1000;
	public static final double DEFAULT_MUTATION_RATE = 0.01D;
	public static final boolean DEFAULT_ORDERED_CROSSOVER = true;
	public static final boolean DEFAULT_CYCLIC_CROSSOVER = true;
	public static final boolean DEFAULT_INVER_OVER = true;
	public static final boolean DEFAULT_PMX_CROSSOVER = true;
	public static final boolean DEFAULT_ANNEAL = true;
	
	// working storage
	private double [][] nodeExactLocations;
	
	/*
	 * public access for performance purposes.
	 */
	public int [] nodeIndex;
			  
	CityDistancesVirtualArray cityDistancesVA = null;	
	
    /**
	 * The unique instance to this class.
	 */
	protected static TSProblemModel instance;
	
   /**
    * The max width of the graphWorkspace
    */
	double widthMax;

   /**
	* The max height of the graphWorkspace
	*/	
    double heightMax;
	
	/**
	 * The source Node
	 */
	int sourceNode;

	/**
	 * Total nodes in graph
	 */
	int totalGraphNodes;
	
	/**
	 * Collection of goal Nodes to visit
	 */	
	ArrayList clientNodes;

	
	/**
	 * if the algorithm has to return some visual feedback to the GUI
	 */
	boolean visualFeedback; 

	/**
	 * if the execution should be analysed in terms of execution speed, mem. usage...
	 */
	boolean executionMeasure;
	boolean aStarExecutionMeasure;
	boolean gaExecutionMeasure;	
	
	/*
	 * for the genetic algotihms only:
	 * 
	 * population Size 
	 * mutation Rate
	 */	
    int popSize;
	double mutationRate;
	boolean anneal;
	boolean minimalSpanningTree; // not used
	boolean orederedCrossover;
	boolean cyclicCrossover;
	boolean inverOver;	
	boolean pmxCrossover;
	boolean rollingCrossover;  // not used
	
	/*
	 * for the genetic algotihms and Neural Nets only:
	 */		
	int maxGenerations;
	
	
	/**
	 * 
	 * @return
	 */
	public static TSProblemModel getInstance() {
		if (instance == null)
			instance = new TSProblemModel();
		
		return instance;
	}
	
	/**
	 * 
	 * 
	 */
	protected TSProblemModel() {
		clientNodes = new ArrayList();
		visualFeedback = DEFAULT_VISUAL_FEEDBACK;
		executionMeasure = DEFAULT_MEASURE_EXECUTION;
		aStarExecutionMeasure = ASTAR_DEFAULT_MEASURE_EXECUTION;
		gaExecutionMeasure = GA_DEFAULT_MEASURE_EXECUTION;
		gaExecutionMeasure = false;
		maxGenerations = DEFAULT_GA_MAX_GENERATIONS;
		
		setupGeneticOperators();
		
		sourceNode = -1;
	}

	public void resetAdvancedStructures(Graph g) {
		widthMax = UIFacade.getInstance().getWorkspace().getWorkspaceDimension().getWidth();
		heightMax = UIFacade.getInstance().getWorkspace().getWorkspaceDimension().getHeight();

	   validateModel();
	   
	   // filling a circular array with the problem nodes.
	   nodeIndex = getAllProblemNodes();
	   
	   totalGraphNodes = g.getN();
	   
	   // allocate new city arrays for exact locations
	   nodeExactLocations  = new double [totalGraphNodes][EUCLIDIAN_PLANE];
       		
	   fillNodeExactLocationArray(g);
	   prepareDistancesMatrix(g);
	   
		/*
		** Allocate a virtual-distances-array manager.
		*/
	   cityDistancesVA = new CityDistancesVirtualArray( totalGraphNodes );
	   
	   fillCityDistancesArray(g);		
	}

	private void setupGeneticOperators() {
		
		popSize = DEFAULT_GA_POP_SIZE;
		mutationRate = DEFAULT_MUTATION_RATE;
		anneal = DEFAULT_ANNEAL;
		orederedCrossover = DEFAULT_ORDERED_CROSSOVER;
		cyclicCrossover = DEFAULT_CYCLIC_CROSSOVER;
		pmxCrossover = DEFAULT_PMX_CROSSOVER;
		inverOver = DEFAULT_INVER_OVER;
		
	}
	/**
	 * 
	 * @return
	 */
	public int getSourceNodeIndex() {
		return sourceNode;
	}

	/**
	 * 
	 * @param index
	 */
	public void setSourceNodeIndex(int index) {
		sourceNode = index;
	}

	/**
	 * 
	 * @param nodeIndex
	 */
	public void addClient(int nodeIndex) {

		if (nodeIndex >= 0) {
			Integer clientNodeIndex = new Integer(nodeIndex);
			if (!clientNodes.contains(clientNodeIndex)) {
				clientNodes.add(clientNodeIndex);
			}
		}
	}

	/**
	 * 
	 * @param i
	 * @return
	 */	
	public int getClient(int i) {	
		return ((Integer)clientNodes.get(i)).intValue();
	}

	public boolean hasClients() {	
		return !(clientNodes.isEmpty());
	}
	
	/**
	 * 
	 * @return
	 */
	public int numClientNodes() {
		return clientNodes.size();
	}
	
	
	public boolean isExecutionMeasure() {
		return executionMeasure;
	}

	public void setExecutionMeasure(boolean executionMeasure) {
		this.executionMeasure = executionMeasure;
	}

	
	public boolean isGaExecutionMeasure() {
		return gaExecutionMeasure;
	}

	public void setGaExecutionMeasure(boolean gaExecutionMeasure) {
		this.gaExecutionMeasure = gaExecutionMeasure;
	}

	/**
	 * 
	 * @return
	 */
	public int[] getClientNodes() {
		
		int array[] = new int[clientNodes.size()];
		int i = 0; 
		for (Iterator iter = clientNodes.iterator(); iter.hasNext();) {
			Integer element = (Integer) iter.next();
			array[i] = element.intValue();
			i++;			
		}
		return array;
	}

	/**
	 * 
	 * @return
	 */
	public int[] getAllProblemNodes() {
		
//		int array[] = new int[clientNodes.size()+1];
//		int i = 0;
//		array[i] = sourceNode;
//		i++;
//		
//		for (Iterator iter = clientNodes.iterator(); iter.hasNext();) {
//			Integer element = (Integer) iter.next();
//			array[i] = element.intValue();
//			i++;			
//		}
		int array[] = new int[clientNodes.size()];
		int i = 0;
		for (Iterator iter = clientNodes.iterator(); iter.hasNext();) {
			Integer element = (Integer) iter.next();
			array[i] = element.intValue();
			i++;			
		}
		
		return array;
	}
	
	/**
	 */
	public void setClientNodes(int[] clients) {
		
		clientNodes.clear();
		
		for (int i = 0; i < clients.length; i++) {
			Integer element = new Integer (clients[i]);
			clientNodes.add(element);
		}
	}

	public void setClientStructures(int[] clients) {

		setClientNodes(clients);		

		// filling a circular array with the source node in front.
		nodeIndex = getAllProblemNodes();
		   
		prepareDistancesMatrix(UIFacade.getInstance().getGraph());		  		
	}
	
	/**
	 * 
	 */
	public void clearClientNodes() {
		clientNodes.clear();
	}
	
	/**
	 * Sets the visualFeedback flag 
	 */
	public void setVisualFeedback(boolean value) {
		visualFeedback = value;
	}

	public boolean isVisualFeedback() {
		return visualFeedback;
	}

	public int getNumNodes() {
		
		if (nodeIndex == null) {
			return 0;
		} 
		
		return nodeIndex.length;
	}

	public int getNodeIndex(int i) {
		return nodeIndex[i];
	}
	
	public double getHeightMax() {
		return heightMax;
	}

	public void setHeightMax(double heightMax) {
		this.heightMax = heightMax;
	}

	public double getWidthMax() {
		return widthMax;
	}

	public void setWidthMax(double widthMax) {
		this.widthMax = widthMax;
	}
	
	public double getMutationRate()
	{
	   //return ( (double) mutationRate ) / 10000.0D; // units of 1/100ths of a %
		return mutationRate;
	}	

	

	
	public void setAnneal(boolean anneal) {
		this.anneal = anneal;
	}

	public void setCyclicCrossover(boolean cyclicCrossover) {
		this.cyclicCrossover = cyclicCrossover;
	}

	public void setInverOver(boolean inverOver) {
		this.inverOver = inverOver;
	}

	public void setOrederedCrossover(boolean orederedCrossover) {
		this.orederedCrossover = orederedCrossover;
	}

	public void setPmxCrossover(boolean pmxCrossover) {
		this.pmxCrossover = pmxCrossover;
	}
		

	public boolean isAStarExecutionMeasure() {
		return aStarExecutionMeasure;
	}

	public void setAStarExecutionMeasure(boolean starExecutionMeasure) {
		aStarExecutionMeasure = starExecutionMeasure;
	}

	public void reset() {
		clientNodes = new ArrayList();
		visualFeedback = true;
	}

	/**
	 * 
	 * @return
	 */
	public void validateModel() {

		if (sourceNode == -1 || clientNodes.isEmpty())
		{
			Graph g = UIFacade.getInstance().getGraph();
			int numNodes = g.getN();
			
			/*
			 * Source has not been chosed
			 */
			if (sourceNode == -1) {
				sourceNode = 0; 
			}

			/*
			 * clients not been chosed
			 */		
			if (clientNodes.isEmpty()) {
				/*
				 * fill clientList with all graph nodes
				 */
				for (int i = 0; i < numNodes; i++) {
					if (i != sourceNode) {
						addClient(i);
						// change color of client node
						ColorUtil.setClientNodeColor(g, i);						
					}
				}	
			}

		}
	}
	
	private void fillCityDistancesArray(Graph g)
	{
	/*
	** FIXME This badly needs to become a virtual array.  It is killing
	** performance for large numbers of cities, by spilling to virtual
	** memory.
	*/
    // m_distances = new double [m_numCities][m_numCities];

	    if ( cityDistancesVA.storingIsUseful() )
	    {
	      for (int city1 = 0; city1 < totalGraphNodes; ++city1)
	      {
	        for (int city2 = 0; city2 < totalGraphNodes; ++city2)
	        {	
	        	ShortestPath sp = g.getShortestPath(city1,city2);
	        	
	        	if (sp != null) {		        
	        		cityDistancesVA.putValue(sp.getDistance(),city1,city2);
	        	} else {
	        		cityDistancesVA.putValue(0.0D,city1,city2);
	        	}
	        }
	      }
	    }
	}	

	/**
	 * Fills Position for all nodes in Graph
	 * 
	 */
	private void fillNodeExactLocationArray(Graph g)
	{
		ComponentProperties cp;
		Position pos;
             
	      for (int city1 = 0; city1 < g.getN(); ++city1)
	      {
	    	 cp = g.getNode(city1).getProperties();
	    	 pos = (Position)cp.getPropertyByName("Position");
	    	 	    	 
             nodeExactLocations[city1][CITY_X] = pos.getX(); 
             nodeExactLocations[city1][CITY_Y] = pos.getY();
	      }	    
	}	
	
	  public double getDistance(int city1, int city2)
	  {
	      return cityDistancesVA.getValue(city1, city2);
	  }

	  /**
	   * This method calculates the shortest Path between two nodes, if
	   * it does not exist.
	   * @param city1
	   * @param city2
	   * @return
	   */
	  public ShortestPath getShortestPath(int city1, int city2)
	  {		
		  if (city1 != city2) {
			  ShortestPath result = 
				  UIFacade.getInstance().getGraph().getShortestPath(city1, city2);
			  
			  /*
			   * If not existant, calculate it.
			   */
			  if (result == null) {
		      
	    		  // need to save the old values for the reseting process.
				  int nodes[] = getClientNodes();		
				  int oldSource = sourceNode;
				  
				  reset();
				  setSourceNodeIndex(city1);
				  addClient(city2);
				  setVisualFeedback(false);
				  AStar astar = new AStar(UIFacade.getInstance().getWorkspace().getGraph());
				  astar.execute();			  			  

				  setSourceNodeIndex(oldSource);
				  setClientNodes(nodes);	   
				  visualFeedback = true;			  
			  }
			  
			  return result;
		  } 
	      
		  return null;
	  }
	  
	  public double getEuclidianDistance(int city1, int city2)
	  {
	      return UIFacade.getInstance().getWorkspace().euclidianDistance(city1,city2);
	  }
	  
	  public double[] getCityExactLocation(int cityIndex)
	  {
	    double value[] = new double[EUCLIDIAN_PLANE];
	    value[CITY_X] = nodeExactLocations[cityIndex][CITY_X];
	    value[CITY_Y] = nodeExactLocations[cityIndex][CITY_Y];
	    return value;
	  }

	  public double getCityXCoordinate(int cityIndex)
	  {
	    return nodeExactLocations[cityIndex][CITY_X];
	  }

	  public double getCityYCoordinate(int cityIndex)
	  {
	    return nodeExactLocations[cityIndex][CITY_Y];
	  }
	  
	  public double[][] getNodeExactLocations()
	  {
	    return nodeExactLocations;
	  }

	  public double[][] getCityDistanceMatrix()
	  {
	    return cityDistancesVA.cityDistancesArray;
	  }
	  
	public int getMaxGenerations() {
		return maxGenerations;
	}

	public void setMaxGenerations(int maxIterations) {
		this.maxGenerations = maxIterations;
	}

	public int getPopSize() {
		return popSize;
	}

	public void setPopSize(int popSize) {
		this.popSize = popSize;
	}

	public void setMutationRate(double mutationRate) {
		this.mutationRate = mutationRate;
	}

	public void prepareDistancesMatrix(Graph g) {
		/*
		 * process of updating the shortestDistance matrix for all the
		 * active nodes and the start node involved in the algorithm
		 */
	   // need to save the old values for the reseting process.
	   int nodes[] = getClientNodes();		
		
		/*
		 * Filling the distance matrix for the source node.
		 */
		for (int i = 0; i < nodes.length; i++) {
			if (!g.existsPath(sourceNode,nodes[i])) {				
				reset();				
				addClient(nodes[i]);
				setVisualFeedback(false);
				AStar astar = new AStar(g);
				astar.execute();
			}
		}
		
		int oldSource = sourceNode;

		/*
		 * process of updating the shortestDistance matrix for all the
		 * paths between the client nodes involved in the algorithm
		 */		
		for (int i = 0; i < nodes.length; i++) {
			for (int j = i+1; j < nodes.length; j++) {
			if (!g.existsPath(nodes[i],nodes[j])) {
				reset();
				setSourceNodeIndex(nodes[i]);
				addClient(nodes[j]);
				setVisualFeedback(false);
				AStar astar = new AStar(g);
				astar.execute();
			}
			}
		}
		
	   setSourceNodeIndex(oldSource);
	   setClientNodes(nodes);	   
	   visualFeedback = true;
	}

	public int getTotalGraphNodes() {
		return totalGraphNodes;
	}

	public boolean isAnneal() {
		return anneal;
	}

	public boolean isCyclicCrossover() {
		if (clientNodes.size() > MIN_TSP_SIZE) {		
			return cyclicCrossover;
		}
		return false;
	}

	public boolean isInverOver() {
		if (clientNodes.size() > MIN_TSP_SIZE) {		
			return inverOver;
		}
		return false;
	}

	public boolean isOrederedCrossover() {
		if (clientNodes.size() > MIN_TSP_SIZE) {
			return orederedCrossover;	
		}
		return false;
	}

	public boolean isMinimalSpanningTree() {
		return minimalSpanningTree;
	}

	public boolean isPmxCrossover() {
	
		if (clientNodes.size() > MIN_TSP_SIZE) {
			return pmxCrossover;	
		}		
		return false;
	}

	public boolean isRollingCrossover() {
		return rollingCrossover;
	}

	private class CityDistancesVirtualArray
	{
	    private double cityDistancesArray[][] = null;
	    private boolean valuesAreStored = false;

	/*
	** POLICY Limit real stored distance array sizes to the case for 200 or
	** fewer cities to attempt to limit spilling into virtual memory.
	*/

	    private static final int ARRAY_SIZE_LIMIT = 40000;

	    public CityDistancesVirtualArray( int cityCount )
	    {
	      if ( ( cityCount * cityCount ) <= ARRAY_SIZE_LIMIT )
	      {
	        valuesAreStored = true;
	        cityDistancesArray = new double[cityCount][cityCount];
	      }
	      else
	      {
	        valuesAreStored = false;
	      }
	    }

	    public void putValue
	    (
	      double cityDistancesValue,
	      int firstCity,
	      int secondCity
	    )
	    {
	      if ( valuesAreStored && ( cityDistancesArray != null ) )
	      {
	        cityDistancesArray[firstCity][secondCity] = cityDistancesValue;
	      }
	      else {}
	    }

	    public double getValue( int firstCity, int secondCity )
	    {
	      if ( valuesAreStored && ( cityDistancesArray != null ) )
	      {

	/*
	** Trust the customer to keep track of whether these are useful values
	** previously stored in the array.  That isn't the container's
	** responsibility.
	*/

	        return cityDistancesArray[firstCity][secondCity];
	      }
	      else // calculate virtual array contents over again
	      {
	         return cityDistances( firstCity, secondCity );
	      }
	    }

	    public boolean storingIsUseful()
	    {
	      return valuesAreStored;
	    }

	/*
	** FIXME This may not be the best packaging; a "cityDistances"
	** calculation method isn't really part of a "cityDistances array"
	** container object, but passing the function in via the constructor is
	** beyond my skills just now.
	*/

	    public double cityDistances( int firstCity, int secondCity )
	    {

	      double dX
	        = Math.abs
	          (
	            nodeExactLocations[firstCity][CITY_X] -
	            nodeExactLocations[secondCity][CITY_X]
	          );

	      double dY
	        = Math.abs
	          (
	            nodeExactLocations[firstCity][CITY_Y] -
	            nodeExactLocations[secondCity][CITY_Y]
	          );

	      return Math.sqrt( ( dX * dX ) + ( dY * dY ) );

	    }
	}
	
}
