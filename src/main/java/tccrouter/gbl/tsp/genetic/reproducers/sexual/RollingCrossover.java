
/*
** This code was written from scratch by Kent Paul Dolan, and may
** represent an algorithm which is a "new invention".  See accompanying
** file TravellerDoc.html for status for your use.
*/

/*
** Motivation: unlike the partial match, cyclic, or ordered crossovers,
** which are _blind_ to possible improvements until the overall genome
** fitness is computed, this rolling crossover attempts to do an
** intelligent crossover.  Wherever it can match subsequences of the
** parent genomes whose crossing over would preserve the "permutation
** genome" character of the traveling salesman tour, it choses for the
** child genome the subsequence of the two offered by parent genomes
** which would extend the partially built child genome with the better
** incremental fitness.  This will never produce a genome worse-fit than
** both parents, it may produce a genome with fitness intermediate
** between the fitnesses of the parents and therefore suitable to
** replace the worse-fit parent, or it may, and often does, produce a
** genome with fitness superior to both parents.
** 
** The impulse for this design was noticing how often new, more fit
** genomes reintroduced old, less fit subsequences, and a resulting goal
** to combine as far as possible superior subsequences of genomes into
** new genomes containing multiple simultaneous improvements, to hasten
** the spread of superior subsequences through the genome population.
** 
** Because this technique depends on there being matchable subsequences
** of genomes containing the same total set of codons, of length less
** than the total length of the genome, it is expected that this
** heuristic will exhibit superior improvement power in a population
** most of whose genomes are fairly well organized already.  Rolling
** crossover is thus a helper, not a wonderfully useful final solution
** run on its own, or with only mutation to assist it.
*/

package tccrouter.gbl.tsp.genetic.reproducers.sexual;

import tccrouter.gbl.common.entity.TSProblemModel;
import tccrouter.gbl.tsp.genetic.TravellerWorld;
import tccrouter.gbl.tsp.genetic.entity.Chromosome;
import tccrouter.gbl.tsp.genetic.entity.SexualReproducer;
import tccrouter.gbl.tsp.genetic.entity.TravellerChromosome;
import tccrouter.gbl.tsp.genetic.tools.MersenneTwister;

public class RollingCrossover
    implements SexualReproducer
{
  public Chromosome reproduce(Chromosome father, Chromosome mother)
  {
    try
    {
      if
      (
        (father instanceof TravellerChromosome)
        &&
        (mother instanceof TravellerChromosome)
      )
      {

/*
** Give local names with extended types to the two parent genome handles
** passed in as parameters of unextended types.
*/

        TravellerChromosome f = (TravellerChromosome)father;
        TravellerChromosome m = (TravellerChromosome)mother;

        Chromosome child = (Chromosome) algorithm( f, m );

        child.setOriginator( "RollingCrossover" );
        child.checkValidity();
        return child;
      }
      else
      {
        throw m_errIncompatible;
      }

    }
    catch (Exception e)
    {
      System.err.println
      (
        "RollingCrossover.reproduce() threw!"
      );
    }

/*
** This code should never be reached, it is just here to pacify javac
** about the return statement being stuck in a try context above.
*/

    return father; 
  }

  private TravellerChromosome algorithm
  (
    TravellerChromosome f,
    TravellerChromosome m
  )
  {
/*
** I thought at first that this technique would always produce a genome
** superior to both the parents, but that is not the case.  It very
** frequently does, but sometimes the genome produced is of a fitness
** intermediate between that of the parents.  The problem is where the
** copied segments join, that one parent may have to carry on from the
** end of a segment copied from the other parent, at a cost of reduced
** fitness at the juncture.  Nevertheless, the fitness produced is never
** larger than both parents, is most of the time a big win, and the
** genome produced always contains segments of superior fitness from the
** parents when possible, even when the overall fitness may not be the
** best of the three, so it does its job of blending better ideas from
** parent genomes.
*/

/*
** Hook a handle to the soliton randomizer instance.
*/

    MersenneTwister mt    = MersenneTwister.getTwister();

/*
** POLICY Walk the genomes matched in general orientation, with just the
** limitation that we start at a matched codon.
*/

    f.canonicalize();
    m.canonicalize();

    int genomeLength = TSProblemModel.getInstance().getNumNodes();

/*
** Pick a random starting place in one parent, a starting place at the
** matching city in the other parent.
*/

    int fatherOffset = mt.nextInt(genomeLength);    
    int motherOffset = m.getCity(fatherOffset); 
    
    if ( motherOffset >= genomeLength ) {
    	motherOffset = mt.nextInt(genomeLength);
    }    

/*
** We want to walk in the direction of the "smaller in numerical value"
** city adjacent to each parent's starting city, to somewhat improve the
** odds that we are proceeding in a compatible direction between the two
** parents.
*/

    int fatherStep   = 1;
    int motherStep   = 1;

    if
    (
      f.getCity(fatherOffset - 1) < f.getCity(fatherOffset + 1)
    )
    {
      fatherStep = -1;
    }

    if
    (
      m.getCity(motherOffset - 1) < m.getCity(motherOffset + 1)
    )
    {
      motherStep = -1;
    }

/*
** Okay, we are ready to do this crossover in general position, now to
** fix all the calculations that follow to reflect that desire.
*/

/*
** Arbitrarily copy one parent just to make the skeleton of a genome, we
** will completely replace the contents of the copy.
*/

    TravellerChromosome blendedSprog = ( TravellerChromosome) m.cloneThis();

/*
** Copy the parent from the starting offset point and in the chosen
** travel direction so that visual debugger display will make sense
** (what a shame, it was prettier with the Blind Stupid Johnson thinko
** bug in place, it actually "rolled" on the screen).
*/

    for ( int i = 0; i < genomeLength; i++ )
    {
    //  blendedSprog.setCity( i, m.getCity( motherOffset + ( i * motherStep ) ) );
      // OK, do it wrong, it's more fun.
      blendedSprog.setCity( i, f.getCity( fatherOffset ) );
    }

    TravellerWorld world = blendedSprog.getWorld();

/*
** Do a rolling crossover.
*/

    boolean fatherEncounters[] = new boolean[ genomeLength ];
    boolean motherEncounters[] = new boolean[ genomeLength ];

    for ( int i = 0; i < genomeLength; i++ )
    {
      fatherEncounters[i] = false;
      motherEncounters[i] = false;
    }

    double fatherFitnessIncrement = 0.0D;
    double motherFitnessIncrement = 0.0D;

    int mismatchCount = 0;
    int lastMatchPoint = 0;
    int genomeIndex = 0;

/*
** Start by seeding in the first city.
*/

    int copiedUpto = 0;

    int fatherCurrentCity =
      f.getCityIndex( fatherOffset + ( fatherStep * genomeIndex ) );
    int motherCurrentCity =
      m.getCityIndex( motherOffset + ( motherStep * genomeIndex ) );

    blendedSprog.setCity( 0, fatherCurrentCity );
    fatherEncounters[ fatherCurrentCity ] = true;
    motherEncounters[ motherCurrentCity ] = true;

    genomeIndex++;

    while ( genomeIndex < genomeLength )
    {

      int fatherPreviousCity = fatherCurrentCity;
      int motherPreviousCity = motherCurrentCity;

      fatherCurrentCity =
        f.getCityIndex( fatherOffset + ( fatherStep * genomeIndex ) );
      motherCurrentCity =
        m.getCityIndex( motherOffset + ( motherStep * genomeIndex ) );

      if ( fatherCurrentCity != motherCurrentCity )
      {
        if ( motherEncounters[ fatherCurrentCity ] )
        {
          mismatchCount--;
        }
        else
        {
          mismatchCount++;
        }

        if ( fatherEncounters[ motherCurrentCity ] )
        {
          mismatchCount--;
        }
        else
        {
          mismatchCount++;
        }
      }

      fatherEncounters[ fatherCurrentCity ] = true;
      motherEncounters[ motherCurrentCity ] = true;

      fatherFitnessIncrement +=
        world.getDistance( fatherPreviousCity, fatherCurrentCity );

      motherFitnessIncrement +=
        world.getDistance( motherPreviousCity, motherCurrentCity );

      if ( ( genomeIndex + 1 ) == genomeLength )
      {

/*
** The "getCity( 0 )" is redundant here, we know this is city zero, but
** doing it this way allows for a new city naming scheme to be slid into
** place without breaking this code, or at least quite as severely so.
** FIXME A better, less fragile design would have getDistance() take a
** Codon pair instead of an int pair, and similarly for many, many other
** cases where city names are used in Traveller.
*/

        fatherFitnessIncrement +=
          world.getDistance( fatherCurrentCity, f.getCity( fatherOffset ) );

        motherFitnessIncrement +=
          world.getDistance( motherCurrentCity, m.getCity( motherOffset ) );

      }

      if ( mismatchCount == 0 )
      {
        TravellerChromosome currentSourceGenome = null;
        int currentSourceOffset = 0;
        int currentSourceStep   = 0;

        if ( fatherFitnessIncrement < motherFitnessIncrement )
        {
          currentSourceGenome = f;
          currentSourceOffset = fatherOffset;
          currentSourceStep   = fatherStep;

/*
** Whomever wins, the other must carry on as if that were his or her
** last city!
*/

          motherCurrentCity = fatherCurrentCity;

        }
        else
        {
          currentSourceGenome = m;
          currentSourceOffset = motherOffset;
          currentSourceStep   = motherStep;

/*
** Whomever wins, the other must carry on as if that were his or her
** last city!
*/

          fatherCurrentCity = motherCurrentCity;

        }

/*
** Copy the more fit Codon substring from the winning parent to the
** offspring.  We already copied the Codon at the last match point,
** either initially or as the last Codon of the previous substring copy,
** so copy on from the next Codon.
*/

        for ( int j = ( lastMatchPoint + 1 ); j <= genomeIndex; j++ )
        {
          blendedSprog.setCity
          (
            j,
            currentSourceGenome.getCity
            (
              currentSourceOffset + ( currentSourceStep * j )
            )
          );
          copiedUpto = j;
        }

/*
** Reset the gates and race again.
*/

        lastMatchPoint = genomeIndex;
        fatherFitnessIncrement = 0.0D;
        motherFitnessIncrement = 0.0D;

      }

      genomeIndex++;
    }

/*
** Check our work.
*/

    if ( mismatchCount != 0 )
    {
      System.out.println
      (
        "mismatch counting failed in Rolling Crossover: "
        + mismatchCount
      );
    }

    if ( copiedUpto !=  ( genomeLength - 1 ) )
    {
      System.out.println
      (
        "copying whole genome failed in Rolling Crossover: "
        + copiedUpto
        + "; "
        + blendedSprog.toString()
      );
    }

    blendedSprog.canonicalize();

/*
** [Very successful change added in Traveller release "epsilon".]
** Prevent catastrophic population diversity collapse.  If the offspring
** is identical to the genome selected biased on fitness (the secondary
** parent genome), return instead the genome selected sequentially from
** the population (the primary parent genome).  While the secondary
** parent genome in this case is the more fit one, it contributes no new
** partial solutions to the population, and letting it replace the
** primary parent genome removes from the population any partial
** solutions the primary parent genome might have that didn't get
** captured by this heuristic into a child genome, a negative result
** overall despite the ephemeral improvement in average population
** fitness.
*/

    if ( m.looksLikeMe( blendedSprog ) )
    {
      blendedSprog = new TravellerChromosome( f );
    }

/*
** Feed the new kid back into the population in the standard manner.
*/
    return blendedSprog;
  }

}

/*
** The original design for this heuristic, from my "to do" list.
** 
** Create a "rolling join" crossover.  Put two genomes in canonical
** form, and associate a boolean "encountered" array with each, marking
** cities in the genome which have been encountered in each in the
** process of marching along the genome.  Starting at the beginning,
** mark cities encountered in each, incrementing a mismatch counter for
** each city encounterd that matches a city not marked encountered in
** the other encountered array, and decrementing the mismatch counter
** each time a city is encountered that matches one already encountered
** in the other genome.  Keep a rolling fitness increment while
** progressing, for each genome.  Whenever the mismatches count falls to
** zero, benchmark the fitness increments to that point.  Check which
** genome since the last benchmark point has been more fit, and copy the
** intervening sublist to a child genome.  At the end of the march, of
** necessity the mismatch counter will have fallen to zero, and the
** child genome will be comprised of the superior parts between
** benchmark points of either parent genome.  In the case that one
** parent is superior at all benchmark points, or the mismatch counters
** never fall to zero until the end, the child will just be a clone of
** one parent, which is fine.  This should be simple to implement, with
** time complexity of order N, which is very nice, and behave like
** inver-over in consolidating gains made across the population into
** compromise genomes.
*/
