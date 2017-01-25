
/*
** This code was written by Kent Paul Dolan from vague descriptions of
** existing algorithms.  See accompanying file TravellerDoc.html for
** status for your use.
*/

package tccrouter.gbl.tsp.genetic;

import tccrouter.gbl.common.entity.TSProblemModel;
import tccrouter.gbl.tsp.genetic.entity.Chromosome;
import tccrouter.gbl.tsp.genetic.entity.Population;
import tccrouter.gbl.tsp.genetic.entity.TravellerChromosome;
import tccrouter.gbl.tsp.genetic.tools.MersenneTwister;
import tccrouter.gbl.tsp.genetic.ui.TravellerStatus;

public class SimulatedAnnealing
{

/*
** Sigh.  There isn't any good way in the current design to set the
** annealing limit if Population instantiates this class, because
** Population doesn't know about TravellerWorld, and it is the world's
** dimensions that are needed to set the annealing limit.  That means
** Traveller has to pass Population its annealing limiter, which
** clutters up Population's constructor.  Bother.  FIXME Ah, but wait, I
** can grab the handle of the world from the chromosomes, which each
** carry a copy.  Clean up the mess someday.
*/

  private double              m_annealingLimit = 0.0D;
  private static final double m_annealingDecrementerBase =  0.1D;
  private double              m_annealingDecrementer =
                                1.0D - m_annealingDecrementerBase;

/*
** POLICY The setting here is fairly arbitrary, but also very important;
** it limits the portion of annealing that gets to enter the population,
** by metering how often a disimproving genome gets considered for entry
** to "the workforce".  The idea is to balance this entropy adding
** metaheuristic mechanism against the entropy reducing heuristic
** mechanisms, so that net gains in fitness occur through the problem
** run without locking the Traveller into a local optimum.  Smaller
** values here make annealing continue in force at an effective limit
** for a longer part of the run, since the annealing limit is only
** decremented when it is used.  FIXME  Ideally this and other annealing
** parameterization values should be under user control.  Maybe when I
** get popups figured out.
*/

  private static final double m_annealHowOften = 0.04D;
  MersenneTwister             m_mt = null;

  public SimulatedAnnealing()
  {

/*
** Grab a handle on the shared randomizer.
*/

    m_mt = MersenneTwister.getTwister();

    m_annealingLimit = getAnnealingInitialLimit();

/*
** Apply some Kentuckey windage to m_annealingDecrementer to adjust it
** for number of cities and for population size.  More cities make the
** problem harder, make the annealing slower in proportion to the square root of the number
** of cities.  Bigger populations eat the (shared) annealing limit
** faster, but also distribute the results around, partially
** compensating, so make the annealing slower in proportion to the
** square root of population size.  Nothing will keep annealing from
** being a slow pig, but this might help.
*/

    m_annealingDecrementer = 1.0D -
      (
        (
          m_annealingDecrementerBase
          /
          Math.sqrt
          (
            (double) TSProblemModel.getInstance().getNumNodes()
          )
        )
        /
        Math.sqrt
        (
          (double) TSProblemModel.getInstance().getNumNodes()
        )
      );

  }

/*
** Provide a sensible starting fitness disimprovement limit for
** simulated annealing.
*/

  private double getAnnealingInitialLimit()
  {
/*
** POLICY  Set our starting annealing limit to the worst possible one
** city move's edge addition, twice the diagonal of the working world.
** 
** FIXME This may not be big enough!
*/
    double height = TSProblemModel.getInstance().getHeightMax();
    double width  = TSProblemModel.getInstance().getWidthMax();
    double diagonal = Math.sqrt( ( height * height ) + ( width * width ) );
    return 2.0D * diagonal;
  }

  public Chromosome anneal ( Chromosome oldVersion, Chromosome newVersion )
  {

    TravellerStatus.bumpCandidatesConsidered();

    double ovf = oldVersion.testFitness();
    double nvf = newVersion.testFitness();

    if ( Population.areMinimizing() )
    {
      ovf = 0.0D - ovf;
      nvf = 0.0D - nvf;
    }

/*
** POLICY We let children replace their parents if they are at least as
** fit as the parents.  That way, random jitter can happen in problems
** on regular grids, that can perhaps promote progress toward a solution
** when the algorithm gets stuck on a local optimum and population
** diversity plummets.
*/

/*
** If the new version should replace anyway, without consideration of
** annealing, just do it.
*/

    if ( nvf >= ovf )  // POLICY, new equal kids win.
    {

      if ( nvf != ovf ) { TravellerStatus.bumpCandidatesImproved(); }

/*
** POLICY, continue to give credit for improvement to original improver,
** where a mere real cloning has occurred.
** 
** FIXME Should this improving-originator name be cloned for _any_
** identically fit replacement?
*/

      ( (TravellerChromosome) newVersion ).canonicalize();
      ( (TravellerChromosome) oldVersion ).canonicalize();

      if
      (
        ( (TravellerChromosome) newVersion )
          .looksLikeMe( (TravellerChromosome) oldVersion )
      )
      {
        ( (TravellerChromosome) newVersion )
        .setOriginator
        (
          new String( ( (TravellerChromosome) oldVersion ).getOriginator() )
        );
      }
      return newVersion;
    }
    
/*
** Act like we aren't here if annealing is turned off.  This way, it is
** our responsibility to consult our checkbox, not our caller's
** responsibility, which seems like cleaner packaging.
*/

    if(TSProblemModel.getInstance().isAnneal())
    {

/*
** Also return the new version if it is no more worse than the annealing
** limit, and if the roll of the dice comes up in its favor.  We don't
** return all new versions below the annealing limit, because we want to
** apply fitness pressure in the direction of population improvement,
** and annealing is worthless without some countervailing fitness
** pressure.  This makes how often we anneal an important tuning
** parameter.
*/

/*
** Change the annealing limit from a cliff to a distribution definer,
** the standard deviation of a gaussian-distributed sample which becomes
** the true limit.  This is closer in spirit to the physical process
** annealing is trying to emulate, which is probabilistic, not
** absolutist, with regard to the span of change possible at each
** decreasing temperature point.
*/

      // if ( ( ovf - nvf ) < m_annealingLimit )

      if
      (
        ( ovf - nvf )
        <
        ( m_annealingLimit * Math.abs( m_mt.nextGaussian() ) )
      )
      {
        if ( m_mt.nextDouble() < m_annealHowOften )
        {

          TravellerStatus.bumpCandidatesAnnealed();

/*
** This little line is the guts of the whole simulated annealing show.
** Whenever we pass the test and return a new version known to be worse
** than the old version, we cut down the limit for doing that for the
** whole population by a smidgeon, making it harder to sneak in a bad
** apple, but still not impossible.  Thus we reduce the size over time
** of entropy allowed back into the population, in effect "reducing the
** temperature."  Notice that this is independent of mutation, since
** this is a fitness based technique, and mutation is done independent
** of fitness.
*/
          m_annealingLimit *= m_annealingDecrementer;

          return newVersion;
        }
      }
    }


/*
** Fall-through does what is wanted, returning the old version.
*/

    return oldVersion;

  }

  public double getAnnealingDecrementer()
  {
    return m_annealingDecrementer;
  }

  public double getAnnealingLimit()
  {
    return m_annealingLimit;
  }
}
