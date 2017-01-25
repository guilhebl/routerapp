
/*
** This code was written by Kent Paul Dolan.  See accompanying file
** TravellerDoc.html for status for your use.
*/

package tccrouter.gbl.tsp.genetic.reproducers.asexual;

import tccrouter.gbl.tsp.genetic.entity.Chromosome;
import tccrouter.gbl.tsp.genetic.entity.Mutator;
import tccrouter.gbl.tsp.genetic.entity.TravellerChromosome;
import tccrouter.gbl.tsp.genetic.tools.MersenneTwister;

public class Move
  implements Mutator
{

/*
** We provide separate interfaces for mutate and reproduce for the three
** cases where it doesn't matter and they just do the same thing, so
** that that two cases where it does matter can operate differently to
** avoid polluting the permutation adaptation with mutation results when
** they are not wanted and drive Traveller to very slow operation.
*/

  public Chromosome mutate(Chromosome parent)
  {
    return this.reproduce( parent );
  }

  public Chromosome reproduce(Chromosome parent)
  {
    try
    {

/*
** Debugging hook abbreviation.  During development, turn on debugging
** just for this class by setting this variable to true, here.  When the
** code is stable, set it to false here, and control debugging from the
** checkbox controls panel, instead.  This variable is global to this
** class, so it controls debugging thoughout the class when set here at
** the top of the entry method for the class.
*/

/*
** Pass the input as a less burdensome type.
*/

      TravellerChromosome child = algorithm( (TravellerChromosome) parent );

      child.setOriginator( "Move" );
      child.checkValidity();
      return (Chromosome) child;

    }
    catch (Exception e)
    {
      System.err.println
      (
        "Move.reproduce() threw!"
      );
    }

/*
** This code should never be reached, it is just here to pacify javac.
*/

    return parent; 
  }

  private TravellerChromosome algorithm( TravellerChromosome parent )
  {

    TravellerChromosome offspring = new TravellerChromosome( parent );
    offspring.canonicalize();

    MersenneTwister mt = MersenneTwister.getTwister();

/*
** Pick two indicies that differ from one another, one the slot _from_
** which to move the city, one the slot _to_ which to move the city.
*/

    int from, to;

    from = mt.nextInt(offspring.getNumCities());

    do { to = mt.nextInt(offspring.getNumCities()); } while (to == from);

/*
** Move the selected city to the new location, rolling the intervening
** cities to fill in the gap.
*/

    int temp = offspring.getCity(from);

    if ( from < to)
    {
      for ( int i = from + 1 ; i <= to ; i++ )
      {
        int roll = offspring.getCity(i);
        offspring.setCity(i-1,roll);
      }
    }
    else
    {
      for ( int i = from - 1 ; i >= to ; i-- )
      {
        int roll = offspring.getCity(i);
        offspring.setCity(i+1,roll);
      }
    }

    offspring.setCity(to,temp);

    offspring.canonicalize();
    return offspring;
  }

  public boolean isSuitableForMultipleMutationRuns() { return true; }

}
