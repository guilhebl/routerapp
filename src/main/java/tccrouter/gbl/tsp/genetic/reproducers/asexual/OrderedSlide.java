
/*
** This code was written from scratch by Kent Paul Dolan.  See
** accompanying file TravellerDoc.html for status of the code here for
** your use.
*/

package tccrouter.gbl.tsp.genetic.reproducers.asexual;

import tccrouter.gbl.tsp.genetic.TravellerWorld;
import tccrouter.gbl.tsp.genetic.entity.Chromosome;
import tccrouter.gbl.tsp.genetic.entity.Mutator;
import tccrouter.gbl.tsp.genetic.entity.TravellerChromosome;
import tccrouter.gbl.tsp.genetic.tools.MersenneTwister;
import tccrouter.gbl.tsp.genetic.tools.PermutationController;
import tccrouter.gbl.tsp.genetic.ui.TravellerStatus;

public class OrderedSlide
  implements Mutator
{

  private static boolean adaptPermutation = false;

  public Chromosome mutate(Chromosome parent)
  {
    adaptPermutation = false;
    return this.guts( parent );
  }

  public Chromosome reproduce(Chromosome parent)
  {
    adaptPermutation = true;
    return this.guts( parent );
  }

  private Chromosome guts(Chromosome parent)
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

      child.setOriginator( "OrderedSlide" );
      child.checkValidity();
      return (Chromosome) child;

    }
    catch (Exception e)
    {
      System.err.println
      (
        "OrderedSlide.reproduce() threw!"
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

    TravellerChromosome tcc    = (TravellerChromosome) parent;
    TravellerChromosome offspring = new TravellerChromosome( tcc );

    offspring.canonicalize();
    double startingFitness = offspring.testFitness();

/*
** Develop a selection probability from fairly pure superstition.
** 
** FIXME The selection seems to be the key to making this work; the set
** selected should be more compact the further into the run we get; use
** the current permutation limit compared to the global ("high")
** permutation limit as a gauge of how far into the run we are, and
** build a selection chance from their relationship.
*/

    int genomeLength = TravellerWorld.getTravellerWorld().getNumberOfCities();
    int permuteGlobalLimit =
      PermutationController.getGlobalPermuteLimit();
    int permuteStartingLimit =
      PermutationController.getStartingPermuteLimit();
    int permuteCurrentLimit =
      PermutationController.getCurrentPermuteLimit();
    double selectionChance = 0.0D;

    if ( genomeLength > permuteGlobalLimit )
    {
      selectionChance =
        ( (double) permuteCurrentLimit ) /
        ( (double) ( permuteStartingLimit + permuteGlobalLimit ) );
    }
    else
    {
      selectionChance = ( (double) permuteGlobalLimit ) / 100.0D;
    }

    int selectees[] = new int[ genomeLength ];
    boolean selected[] = new boolean[ genomeLength ];

    for ( int i = 0; i < genomeLength; i++ )
    {
      selectees[i] = -1;
      selected[i]  = false;
    }

/*
** Start at some offset into the genome, so that a compact subset will
** be in some general location.
*/

    int offset = mt.nextInt(genomeLength);

    int selectionCount = 0;

/*
** Here again we depend on the design choice that getCity() does modular
** arithmetic on the genome index, so we can pass in an index beyond the
** end of the genome with no dire consequences.
*/

    for ( int i = 0; i < genomeLength; i++ )
    {
      if ( mt.nextDouble() < selectionChance )
      {
        selectees[selectionCount] = tcc.getCity(i + offset);
        selected[( i + offset ) % genomeLength] = true;
        selectionCount++;
      }

/*
** Limit ourselves to a fairly small selected set, to limit how much
** entropy we introduce.
*/

      if ( selectionCount >= permuteCurrentLimit) { break; }
    }

    if ( selectionCount != 0 )
    { 
      int unselectedIndex = 0;
      int copiedCount = 0;

/*
** Copy a leftmost random fraction of the unselected codons in order to
** the left end of the output genome.
*/

      int lefties = mt.nextInt( genomeLength - selectionCount );

      while ( copiedCount < lefties )
      {
        while ( selected[ unselectedIndex ] )
        {
          unselectedIndex++;
        }
        offspring.setCity( copiedCount, tcc.getCity( unselectedIndex ) );
        unselectedIndex++;
        copiedCount++;
      }

/*
** Copy the selected codons in order to the middle of the output genome.
*/

      for ( int i = 0; i < selectionCount; i++ )
      {
        offspring.setCity( copiedCount, selectees[i] );
        copiedCount++;
      }

/*
** Copy the remaining unselected codons in order to the right end of the
** output genome.
*/

      while ( copiedCount < genomeLength )
      {
        while ( selected[ unselectedIndex ] )
        {
          unselectedIndex++;
        }
        offspring.setCity( copiedCount, tcc.getCity( unselectedIndex ) );
        unselectedIndex++;
        copiedCount++;
      }

    }

/*
** Who knows what order the result has?  Better fix it.
*/

    offspring.canonicalize();
    double finalFitness = offspring.testFitness();

/*
** We change for the better or worse, mostly for the worse.  Report back
** so that adaptive permutation high limit can eventually be updated,
** but only do that if we are being called as a reproducer, not as a
** mutator.
*/

    if ( adaptPermutation )
    {
      if
      (
        (
          finalFitness > startingFitness
        )
        ||
        (
          Math.abs( finalFitness - startingFitness )
          <
          TravellerStatus.LITTLE_FUZZ
        )
      )
      {
        PermutationController.reportFailure();
      }
      else
      {
        PermutationController.reportSuccess();
      }
    }

    return offspring; 
  }

  public boolean isSuitableForMultipleMutationRuns() { return false; }

}
