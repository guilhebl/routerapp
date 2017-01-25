//-----------------------------------------------------------------------------
//  Traveller -- A Java Application and Applet
//
//  A Genetic Algorithm for Solving the Travelling Salesman Problem
//
//  TravellerWorld.java
//  version 1.1.0
//
//  Copyright 2000-2001 Scott Robert Ladd. All rights reserved.
//
//  For more information about this program, contact:
//
//      Scott Robert Ladd
//      scott@coyotegulch.com
//      http://www.coyotegulch.com
//
//-----------------------------------------------------------------------------
// This program is free software; you can redistribute it and/or
// modify it under the terms of the GNU General Public License
// as published by the Free Software Foundation; either version 2
// of the License, or (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program; if not, write to the
//
//      Free Software Foundation, Inc.
//      59 Temple Place - Suite 330
//      Boston, MA 02111-1307, USA.
//-----------------------------------------------------------------------------

/*
** This code was extensively modified by Kent Paul Dolan.  Parts of the
** original code are now in other classes in Traveller.  See
** accompanying file TravellerDoc.html for status of the modifications
** for your use.
*/

package tccrouter.gbl.tsp.genetic;

import java.util.Date;
import java.util.Vector;

import tccrouter.gbl.common.entity.ExecutionTrace;
import tccrouter.gbl.common.entity.TSProblemModel;
import tccrouter.gbl.tsp.genetic.entity.Codon;
import tccrouter.gbl.tsp.genetic.entity.Population;
import tccrouter.gbl.tsp.genetic.entity.TravellerChromosome;
import tccrouter.gbl.tsp.genetic.seeders.MasterSeeder;
import tccrouter.gbl.tsp.genetic.tools.MersenneTwister;
import tccrouter.gbl.tsp.genetic.tools.TaskListener;
import tccrouter.gbl.tsp.genetic.ui.TravellerStatus;

public class TravellerWorld
{
  //-------------------------
  // constants
  //-------------------------

  private static final double RADS = 180.0 / Math.PI;

  public  static final int CITY_SIZE  =  2;

  // multitasking
//  private static Task m_task = null;
  private boolean m_firstTaskingCall = true;
  private boolean measureExecution;
  private ExecutionTrace executionTrace;

  // tools
  private        MersenneTwister       m_mt          = null;

  // parameters
  private int         m_numCities;
  private int         m_popSize;
  private double      m_mutationRate        = 0.01D;

  private Codon []    m_minimalSpanningTree;

/*
** We cannot, in general, afford to create an array this big; being
** tossed off into virtual memory murders execution speeds.  Instead we
** virtualize the array with class cityDistancesVirtualArray, below. We
** are much better off to recompute the values every time, than to fetch
** them already computed from hard disk every time, even though the
** computation is an onerous one.
** 
**    private double [][] m_distances;
*/


  private static Population      m_population = null;
  private static TravellerWorld  m_singleton    = null;
  private static TSProblemModel  problem_model = TSProblemModel.getInstance();
  Vector listeners = new Vector();
  
  // time, useful everywhen
  // private static Date   m_tod = null;

  // flags and such for statistic reporting
  private TravellerChromosome  m_bestChromosome              = null;

  //-------------------------
  // initialization
  //-------------------------
  private TravellerWorld()
  {

	measureExecution = TSProblemModel.getInstance().isGaExecutionMeasure();
	if (measureExecution) {
		executionTrace = ExecutionTrace.getInstance();
	}		
		  
    // load parameters
    m_numCities    = problem_model.getNumNodes();
    m_popSize      = problem_model.getPopSize();
    m_mutationRate = problem_model.getMutationRate();
	  
/*
** Attach to the random number generator.
*/

    m_mt = MersenneTwister.getTwister();

/*
** Do a little setting up stuff.
*/

    m_bestChromosome      = null;
    
/*
** Time this frumious beast, so we can tell the world how slow we are!
*/
    TravellerStatus.setTimeAtConfigurationStart
    (
      (new Date()).getTime()/1000
    );

/*
** FIXME The constructor should end right here, and all the rest of this
** stuff be provided as separate services, so that the constructor isn't
** doing a lot of mathematically intense work, not the job of
** constructors (which is to allocate memory, not fill it), and so that
** the canvas is available to show the work progress during layout of
** cities and seeding of genomes, to keep the user amused when things get
** slow.
*/
    // create a set of chromosomes
    resetChromosomes();

    TravellerStatus.setTimeAtConfigurationFinished
    (
      (new Date()).getTime()/1000
    );

  }

  public static void reset()
  {
    m_singleton = null;
  }

  public static void setup()
  {
    TravellerWorld tw = getTravellerWorld();
  }

  public static synchronized TravellerWorld getTravellerWorld()
  {
    if ( m_singleton == null )
    {
      m_singleton = new TravellerWorld();
    }
    return m_singleton;
  }

  public static void newWorld()
  {
    m_singleton = null;

    getTravellerWorld();

    TravellerStatus m_travellerStatus =
      TravellerStatus.getTravellerStatus( m_singleton );
    m_travellerStatus.setup();

  }

  public double getAnnealingDecrementer()
  {
    return m_population.getAnnealingDecrementer();
  }

  public double getAnnealingLimit()
  {
    if ( m_population == null )
    {
      return 0.0D;
    }
    else
    {
      return m_population.getAnnealingLimit();
    }
  }

  public int getNumberOfCities()
  {
    return m_numCities;
  }

  public int getPopulationSize()
  {
    return m_popSize;
  }

  public double getShortestPath()
  {
      if (m_population != null)
          return m_population.getBestFit();
      else
          return -1.0;
  }

  public double getAveragePath()
  {
      if (m_population != null)
          return m_population.getAverageFit();
      else
          return -1.0;
  }

  public double getLongestPath()
  {
      if (m_population != null)
          return m_population.getWorstFit();
      else
          return -1.0;
  }

  public int getBestGenomeName()
  {
      if (m_population != null)
        return m_population.getBestName();
      else
          return -1;
  }

  public String getBestGenomeOriginator()
  {
    if (m_bestChromosome == null)
    {
      return new String( "" );
    }
    else
    {
      return new String( m_bestChromosome.getOriginator() );
    }
  }

  public int getSameFitnessCount()
  {
    if (m_population != null)
    {
      return m_population.getSameFitnessCount();
    }
    else
    {
      return -1;
    }
  }

  public int getBestGenomeCloneCount()
  {
    if (m_population != null)
    {
      return m_population.getBestCloneCount();
    }
    else
    {
      return -1;
    }
  }

  public String dumpBestChromosome()
  {
    if ( m_bestChromosome == null )
    {
      return new String("not built yet");
    }
    else
    {
      return m_bestChromosome.toString();
    }
  }

  public double getMutationRate()
  {
    return m_mutationRate;
  }

  public void resetChromosomes()
  {

/*
** Create an initial population of chromosomes.
*/

    TravellerChromosome [] chromosomes
      = new TravellerChromosome [m_popSize];

/*
** Seed the genomes (Scott's chromosomes) according to the user's
** selection.
*/

    MasterSeeder.seedGenomes( chromosomes, this );

    for (int n = 0; n < m_popSize; ++n)
    {
      chromosomes[n].canonicalize();
    }

/*
** Create a new population from the parts we've constructed.
*/

    m_population
      = new
        Population
        (
          chromosomes,
          MasterReproducer.hookMutators(),
          MasterReproducer.hookReproducers(),
          m_mutationRate,
          true  // minimizing fitnesses
        );

/*
** Cater for splitting calls to Population to do just an
** evaluateGenomes() method call the first time we get tasked after
** creating a new population, so we can display statistics for the
** unmodified genome seeding.
*/

    m_firstTaskingCall = true;

  }

  public void taskHandler()
  {

    // update the population
	int iterations = 0;
	int numIterations = problem_model.getMaxGenerations();
	  
	while (iterations < numIterations) {

		if (measureExecution) {
			executionTrace.iterationTrace();			
		}
		
    try
    {
      if ( m_firstTaskingCall )
      {
        m_firstTaskingCall = false;
        m_bestChromosome =
          (TravellerChromosome) m_population.evaluateGenomes();
      }
      else
      {
        m_bestChromosome =
          (TravellerChromosome)m_population.nextGeneration();
        iterations++;
      }
    }
    catch (Exception ex)
    {
    	ex.printStackTrace();
    }
	}
/*
** Put the cities on the bottom, so they show when nothing else is drawn.
*/      
    // now plot best chromosome's path
  }

  public void addTaskListener(TaskListener al)
  {
	  listeners.addElement(al);
  }
  
	public int getTotalGraphNodes() {
		return problem_model.getTotalGraphNodes();
	}
	
	public int[] getBestChromosomeAsArray() {
		
		/*
		 * change to canonical form first
		 */
		//m_bestChromosome.canonicalize();
		
		return m_bestChromosome.getGenomeAsArray();
	}

	public double getDistance(int motherPreviousCity, int motherCurrentCity) {
		return problem_model.getDistance(motherPreviousCity, motherCurrentCity);
	}

}
