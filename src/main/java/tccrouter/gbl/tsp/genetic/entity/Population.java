//-----------------------------------------------------------------------------
//  com.coyotegulch.genetic
//
//  A Package of Generic Tools used in Genetic Algorithms
//
//  Population.java
//  version 2.1.0
//
//  Copyright 1996-2001 Scott Robert Ladd. All rights reserved.
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
** This code was extensively modified by Kent Paul Dolan.  See
** accompanying file TravellerDoc.html for status of the modifications
** for your use.
*/

package tccrouter.gbl.tsp.genetic.entity;

import tccrouter.gbl.tsp.genetic.RouletteWheel;
import tccrouter.gbl.tsp.genetic.SimulatedAnnealing;
import tccrouter.gbl.tsp.genetic.tools.MersenneTwister;
import tccrouter.gbl.tsp.genetic.ui.TravellerStatus;

public class Population
{
  private final static String m_progressDisplayName =
    "Genetic Algorithm Statistics";

  // vector of chromosomes
  protected Chromosome [] m_population;

  protected double m_bestFit    = 0.0F;
  protected double m_worstFit   = 0.0F;
  protected double m_averageFit = 0.0F;
  protected RouletteWheel m_rw  = null;

  // vectors of operators
  private MutatorVector    m_mutators;
  private ReproducerVector m_reproducers;

  // probabilities
  private double  m_mutationRate;

/*
** FIXME Assume we are not going to be simultaneously running multiple
** GAs in opposite directions, so that others can ask Population which
** direction good fitnesses are supposed to lie.  If this is a bad
** assumption, do more work to make other choices possible.
*/

  private static boolean m_minimize = false;

  // private static Randomizer m_randNo   = new Randomizer();
  private MersenneTwister      m_mt       = null;
  private SimulatedAnnealing   m_annealer = null;
  private int                  m_bestGenomeIndex   = 0;

  // constructors
  public Population
  (
    Chromosome cv[],
    MutatorVector mv,
    ReproducerVector rv,
    double muteRate,
    boolean minimize
  )
  {

    m_population   = cv;
    m_mutators     = mv;
    m_reproducers  = rv;
    m_minimize     = minimize;
    m_mutationRate = muteRate;
    m_mt           = MersenneTwister.getTwister();
    m_annealer     = new SimulatedAnnealing();
    m_bestGenomeIndex       = 0;

  }

  public Population(Population p)
  {
    m_population   = p.m_population;
    m_mutators     = p.m_mutators;
    m_reproducers  = p.m_reproducers;
    m_minimize     = p.m_minimize;
    m_mutationRate = p.m_mutationRate;
    m_mt           = p.m_mt;
    m_annealer     = p.m_annealer;
    m_bestGenomeIndex       = p.m_bestGenomeIndex;

  }

  // interrogator
  public double getBestFit()
  {
    return m_bestFit;
  }

  public double getAverageFit()
  {
    return m_averageFit;
  }

  public double getAnnealingDecrementer()
  {
    return m_annealer.getAnnealingDecrementer();
  }

  public double getAnnealingLimit()
  {
    return m_annealer.getAnnealingLimit();
  }

  public Chromosome getMember( int memberIndex )
  {
    return m_population[memberIndex];
  }

  public static boolean areMinimizing()
  {
    return m_minimize;
  }

  public double getWorstFit()
  {
    return m_worstFit;
  }

  public int getBestName()
  {
    return m_bestGenomeIndex;
  }

  public int getSameFitnessCount()
  {
    int sameFitnessCount = 0;
    double bestFitness =
      ((TravellerChromosome) (m_population[m_bestGenomeIndex])).testFitness();
    for (int i = 0; i < m_population.length; i++)
    {
      if
      (
        Math.abs
        (
          ((TravellerChromosome)(m_population[i])).testFitness()
          -
          bestFitness
        )
        <
        TravellerStatus.LITTLE_FUZZ
      )
      {
        sameFitnessCount++;
      }
    }
    return sameFitnessCount;
  }

  public int getBestCloneCount()
  {
    int cloneCount = 0;
    for (int i = 0; i < m_population.length; i++)
    {
      if
      (
        ((TravellerChromosome)(m_population[i])).
          looksLikeMe(((TravellerChromosome)(m_population[m_bestGenomeIndex])))
      )
      {
        cloneCount++;
      }
    }
    return cloneCount;
  }

/*
** Evaluate the population fitnesses, find the best member, und so
** weiter.  This has been separated from the nextGeneration processing
** so that this part can be done once, first, after initial genome
** seeding into the population, but before any attempts at improving
** genome fitnesses have interfered with the initial population
** statistics.  We want to do this task separately so that we can get a
** truer measure of how hard our heuristics have worked on our behalf.
*/

  public Chromosome evaluateGenomes() throws Exception
  {

/*
** Create a roulette wheel for this population.
*/

    m_rw = new RouletteWheel();

/*
** This design was so wrong there was no hope for it.  First, ideal
** fitness could be some huge value and the fitness variations some tiny
** fraction, making the original design ineffectual, so  we want the
** roulette wheel slot widths biased corresponding to the fitness
** variations, not the absolute fitnesses.  Second, it makes no sense to
** build the roulette wheel, be done with it, and _then_ notice that we
** are minimizing instead of maximizing fitness; the bias in the wheel
** as Scott built it is exactly in the wrong direction for Traveller!
*/

    int hi_i = 0;
    int lo_i = 0;
    m_bestGenomeIndex = 0;

    double hi_f = Double.MIN_VALUE;
    double lo_f = Double.MAX_VALUE;
    double tot_f = 0.0F;

    double f;

/*
** Test fitness for each chromosome, first.  Fitness testing is sticky
** until the genome is changed, so we can afford to do it repeatedly.
*/

    for (int i = 0; i < m_population.length; ++i)
    {
      // compute new fitness
      f = m_population[i].testFitness();

      tot_f += f;

      if (f < lo_f)
      {
          lo_f = f;
          lo_i = i;
      }

      if (f > hi_f)
      {
          hi_f = f;
          hi_i = i;
      }
    }

    m_averageFit = (double)tot_f / (double)m_population.length;

    double fitnessSpan = Math.abs(hi_f - lo_f);

/*
** POLICY What bias fraction we make to assure that the least fit member
** has at least some chance to win the turn of the roulette wheel makes
** a huge difference in how fast the heuristics converge, and also in
** how quickly population diversity vanishes.  Here we give the least
** fit member one eleventh the chance of the most fit member to be
** selected.  We have to add some constant length too, or things go bad
** when all the genomes are clones and fitness span drops to zero, so
** add a pixel width.
*/

    double unfitnessBias = 1.0D + fitnessSpan / 10.0D;

    for ( int i = 0; i < m_population.length; i++ )
    {

      f = m_population[i].getFitness();

/*
** Add fitness variation to the roulette wheel, using the bias developed
** in the previous loop.
*/

      if ( m_minimize )
      {

        m_rw.addWeight( (float) ( hi_f - f + unfitnessBias ) );

      }
      else
      {

        m_rw.addWeight( (float) ( f - lo_f + unfitnessBias ) );
      }

    }

    if (m_minimize)
    {
      m_bestGenomeIndex = lo_i;
      m_bestFit   = lo_f;
      m_worstFit  = hi_f;

    }
    else
    {
      m_bestGenomeIndex = hi_i;
      m_bestFit   = hi_f;
      m_worstFit  = lo_f;
    }

  //  updateProgressDisplay( "generation complete" );

/*
** KPD It isn't really necessary explicitly to retain the elite member,
** a genome at least that good would survive to the next generation,
** though mutation might nail it, but this doesn't cost a whole lot, and
** later changes might invalidate that lack of necessity, so do it
** anyway.  We kept track above of the location of the elite genome, and
** copied it to the new population's first slot, now do messy index
** calculations to avoid clobbering it, since its position is frozen in
** the roulette wheel already.
*/

    return m_population[m_bestGenomeIndex].cloneThis();

  }

/*
** Compute next generation.
*/

  public Chromosome nextGeneration() throws Exception
  {

/*
** KPD Modified Scott's single elitism to improve the entire population,
** instead of focusing only on a single elite member.  This is a pretty
** ugly and simple minded improvement, but I'd only read about 1% of the
** applet code when I did it, since the poor performance due to throwing
** away almost all improved genomes each generation was the single most
** annoying misfeature of the original applet.  Now, instead of just
** carrying forward the best genome of the prior generation, slots in
** the population vector are all competitive, and a new genome must beat
** out the previous genome at the same index/slot to be part of the new
** population, otherwise the old genome at the index/slot is copied
** forward instead.
** 
** A better implementation of the same idea would hold a tournament to
** select the member to be replaced, worst of some "m" samples, and
** implement continuous evolution instead of generations, perhaps still
** counting generations each time a population size of replacement
** attempts occurred.
** 
** It is yet to be decided whether mutation should occur before or after
** the replacement/copy-forward decision is made.  Right now it occurs
** before, but that may crush population diversity too thoroughly; the
** last half of a run seems to be being made with a very homogeneous
** population based on the limited amount of visible change per improved
** new elite genome.
** 
** With these changes, the applet is now easily capable of solving
** cities=100, pop=250, mutation=1% in a handful of minutes, and
** cities=250, pop=500, mutation=1% took less than 30 minutes, in both
** cases using the circular layout so that visual feedback and the known
** final length of the path made convergence on a perfect solution
** obvious.
*/

/*
**  Create a place to duplicate the best chromosome, so we can return a
**  copy to the caller which is unattached to the population.
*/

    Chromosome result = null;

    // create a new population
    Chromosome [] new_pop = new Chromosome [m_population.length];


/*
** Copy the best genome found in the evaluateGenomes() method, into the
** new population [at the same slot, for simplicity], if we are doing
** single elitism.
*/

//    if
//    (
//      CheckBoxControls.getState
//      (
//        CheckBoxControls.CBC_METAHEURISTIC_SINGLE_ELITISM
//      )
//    )
//    {
//       new_pop[m_bestGenomeIndex] = m_population[m_bestGenomeIndex].cloneThis();
//    }

/*
** Fill remainder of new population by reproduction & mutation
*/


    Chromosome c = null;

    for (int i = 0; i < m_population.length;)
    {

//      updateProgressDisplay
//      (
//        "genome "
//        + i
//        + " of 0 to "
//        + ( m_population.length - 1 )
//        + " being created"
//      );

/*
** KPD It isn't really necessary explicitly to retain the elite member,
** a genome at least that good would survive to the next generation,
** though mutation might nail it, but this doesn't cost a whole lot, and
** later changes might invalidate that lack of necessity, so do it
** anyway.  We kept track above of the location of the elite genome, and
** copied it to the new population's first slot, now do messy index
** calculations to avoid clobbering it, since its position is frozen in
** the roulette wheel already.
*/

//      if
//      (
//        i == m_bestGenomeIndex
//        &&
//        CheckBoxControls.getState
//        (
//          CheckBoxControls.CBC_METAHEURISTIC_SINGLE_ELITISM
//        )
//      )  // leave elite one alone if requested.
//      {
//        i++;
//      }
//      else
//      {
        if (m_reproducers == null)
        {
          c = m_population[m_rw.getIndex()].cloneThis();
        }
        else
        {

/*
**  KPD This could be producing more than one vector entry, since some
**  reproduction operators in some designs create two child genomes,
**  thus the array treatment, in the for loop just below.
*/

          Reproducer polymorphicReproducer = m_reproducers.select();

          if ( polymorphicReproducer instanceof AsexualReproducer )
          {
            c =
              ((AsexualReproducer)polymorphicReproducer).reproduce
              (

/*
** FIXME only for sexual reproduces, for now; depend on replacement
** policy for improvement, not parent quality.  A horrible parent will
** eventually be overwritten by a prior sexual reproducer's second
** child, anyway.  FIXME That last is no longer true!  A horrible parent
** will just have to find a way to improve, or it will be horrible, and
** thus receive few mating approaches, forever.
** 
**              m_population[m_rw.getIndex()]
*/

                m_population[i]
              );
          }
          else
          {
            if ( polymorphicReproducer instanceof SexualReproducer )
            {

/*
** Oops!  Another nasty bug.  Avoid mating sexually reproducing things
** with themselves!
*/

              int other = m_rw.getIndex();
              while (other == i) { other = m_rw.getIndex(); }

              c =
                ((SexualReproducer)polymorphicReproducer).reproduce
                (
                  // FIXME only bias one parent, for now
                  // m_population[m_rw.getIndex()],
                  m_population[i],
                  m_population[other]
                  // m_population[m_rw.getIndex()]
                );
            }
            else
            {
              if
              (
                polymorphicReproducer instanceof ConsultiveReproducer
              )
              {
                c =
                  ((ConsultiveReproducer)polymorphicReproducer).reproduce
                  (
                    // FIXME only for crossovers, for now
                    // m_population[m_rw.getIndex()],
                    m_population[i],  // self
                    m_population,     // consultants
                    m_rw
                  );
              }
              else
              {
                throw
                  polymorphicReproducer.m_errUnknownReproducerType;
              }
            }
          }
        }

/*
**  OK, one way or another we have a child genome c from the above
**  efforts.
*/

        if
        (

/*
** We may have more new kids than we have places to put them!  We
** callously discard surplus offspring.
*/
          ( i < m_population.length )
          &&
          (

/*
**  We have to defend against m_bestGenomeIndex again, because we may advance to it
**  while iterating on j.
*/
            ( 
              i != m_bestGenomeIndex
            )
//              ||
//            ( 
//              CheckBoxControls.getState
//              (
//                CheckBoxControls.CBC_METAHEURISTIC_SINGLE_ELITISM
//              ) == false
//            )
          )
        )
        {

/*
** POLICY Here's the beef.  Instead of accepting whatever nearly random
** garbage reproduction gives us, make each child genome compete based
** on fitness for the next slot against the genome in that slot from the
** old population.  This forces a steadily improving population.  There
** are much smarter ways to do this, but this was easy to code just to
** prove how incredibly much difference it makes.
** 
** Here also is where the simulated annealer implementation's
** application is hidden, and the fitness check is now buried inside it.
*/

            new_pop[i] =
              ( m_annealer.anneal( m_population[i], c ) )
              .cloneThis();

/*
**  KPD Mutate _after_ competing for slot!!!  Otherwise, fitness can
**  squeeze out all change for thousands of generations.
** 
*/

            if (m_mutators != null)
            {

/*
** The original design here had the "mutate at all" rate and the "mutate
** how hard" rate coupled, which led to failures at high mutation rates;
** user choice of a 100% "mutate at all" rate created an infinite
** "mutate how hard" loop, yet might be a user-desired setting!
** 
** POLICY Decouple the "mutate at all" rate from the "how much mutation
** to do" rate.
** 
** Let the user choose the former rate, and the designer choose the
** latter rate by setting a depth of the mutation at some fixed
** probability.
*/

/*
** FIXME: A gaussian instead of a uniform probability might work better
** here for this latter part; I have something else on my mind just now,
** so do an easy one.  In any case, this needs tuning.
*/

              if (m_mt.nextDouble() < m_mutationRate)
              {

/*
** POLICY Pick _one_ mutator per entry here, don't mix and match.
*/

                Mutator someMutator = m_mutators.select();

/*
** Some mutators make sense to use multiple times, some would hash
** things too badly; check which we have, here, and do the Right Thing.
** Notice that the ability to perform this check is all that usefully
** distinguishes a Mutator from an AsexualReproducer.
*/

                boolean letLoop =
                  someMutator.isSuitableForMultipleMutationRuns();

/*
** Count mutation instances for the status displayer.
*/

//                TravellerStatus.bumpCandidatesMutated();
                do
                {

/*
** We do a cloneThis rather than a mutate in place, because we don't
** want to get messed up using the wrong parent if we do in fact loop
** here, something that has burned me multiple times already.
*/

                  new_pop[i] = (someMutator.mutate(new_pop[i])).cloneThis();

/*
** Better do this here, just in case we find ourselves with a mutator
** that thinks canonical form is important, since we are messing it up
** with each mutation pass, and have no way to enforce a contract on
** subsequent programmers that any mutator must canonicalize before
** returning a genome.
*/

                  ((TravellerChromosome)(new_pop[i])).canonicalize();

/*
** We only loop the mutators who tell us they groove on that kind of
** thing.
*/

                } while ( letLoop && m_mt.nextBoolean() );
              }
            }
        } else {
        	new_pop[i] = m_population[i].cloneThis();
        }

/*
** Put in standard form as last hurrah of reproduction/mutation pass.
*/

        ((TravellerChromosome)(new_pop[i])).canonicalize();
        ++i;
      
    }

    // replace old population with new one
    m_population = new_pop;

/*
**  return best fitness
** 
** KPD BUG!  This is the best fitness of the _prior_ generation.
** 
** FIXED Refactored so that things could be computed in the correct
** order, which means that the population's genomes are evaluated once
** _before_ any GA heuristics are run, as the zeroth generation, then
** once _after_ any GA heuristics are run, for all subsequent
** generations.  That way our statistics displays are running on the
** results of the just completed generation consistently, rather than
** with a mix of current and prior generation statistics.
*/

    return evaluateGenomes();

  }

}
