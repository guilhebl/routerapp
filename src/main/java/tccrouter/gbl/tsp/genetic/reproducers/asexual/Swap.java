
/*
** This code was written by Kent Paul Dolan, based on source code in
** Scott Robert Ladd's TravellerMutator.java.  See that file for his
** copyright notice.  See accompanying file TravellerDoc.html for status
** of the new modifications here for your use.
*/

package tccrouter.gbl.tsp.genetic.reproducers.asexual;

import tccrouter.gbl.tsp.genetic.TravellerWorld;
import tccrouter.gbl.tsp.genetic.entity.Chromosome;
import tccrouter.gbl.tsp.genetic.entity.Mutator;
import tccrouter.gbl.tsp.genetic.entity.TravellerChromosome;
import tccrouter.gbl.tsp.genetic.tools.MersenneTwister;

public class Swap
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
** Rename the input to a less burdensome type.
*/

      TravellerChromosome p = (TravellerChromosome) parent;

      TravellerChromosome child = algorithm( p );

      child.setOriginator( "Swap" );
      child.checkValidity();
      return (Chromosome) child;

    }
    catch (Exception e)
    {
      System.err.println
      (
        "Swap.reproduce() threw!"
      );
    }

/*
** This code should never be reached, it is just here to pacify javac.
*/

    return parent; 
  }

  private TravellerChromosome algorithm( TravellerChromosome parent )
  {
    MersenneTwister mt = MersenneTwister.getTwister();

/*
** Pick two indices differing from one another between which to swap
** codons.
*/

    int k, j;

    TravellerChromosome offspring = new TravellerChromosome( parent );
    offspring.canonicalize();

    j = mt.nextInt( TravellerWorld.getTravellerWorld().getNumberOfCities() );

    do
    {
      k = mt.nextInt( TravellerWorld.getTravellerWorld().getNumberOfCities() );
    }
    while ( k == j );

    // swap city indexes
    int t = offspring.getCity( k );
    offspring.setCity( k, offspring.getCity( j ) );
    offspring.setCity( j, t );

    offspring.canonicalize();
    return offspring;
  }

  public boolean isSuitableForMultipleMutationRuns() { return true; }

}
