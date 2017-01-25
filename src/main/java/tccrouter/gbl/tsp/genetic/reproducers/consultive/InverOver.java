
/*
** This code was written by Kent Paul Dolan, from a published algorithm.
** See accompanying file TravellerDoc.html for credits, details and
** status for your use.
*/

package tccrouter.gbl.tsp.genetic.reproducers.consultive;

import tccrouter.gbl.tsp.genetic.RouletteWheel;
import tccrouter.gbl.tsp.genetic.TravellerWorld;
import tccrouter.gbl.tsp.genetic.entity.Chromosome;
import tccrouter.gbl.tsp.genetic.entity.ConsultiveReproducer;
import tccrouter.gbl.tsp.genetic.entity.TravellerChromosome;
import tccrouter.gbl.tsp.genetic.tools.MersenneTwister;

public class InverOver
    implements ConsultiveReproducer
{


  private static MersenneTwister m_mt = null;

  public Chromosome reproduce
  (
    Chromosome parent,
    Chromosome [] consultants,
    RouletteWheel biaser
  )
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

      if
      (
        ( parent != null )
        &&
        ( parent instanceof TravellerChromosome )
        &&
        ( consultants != null )
        &&
        ( consultants[0] instanceof TravellerChromosome )
      )
      {

        Chromosome child = (Chromosome) algorithm( (TravellerChromosome) parent, consultants, biaser );

        child.setOriginator( "InverOver" );
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
        "InverOver.reproduce() threw!"
      );
    }

/*
** This code should never be reached, it is just here to pacify javac
** about the return statement being stuck in a try context above.
*/

    return parent; 
  }

  private TravellerChromosome algorithm
  (
    TravellerChromosome parent,
    Chromosome consultants[],
    RouletteWheel biaser
  )
  {

    if (m_mt == null) { m_mt = MersenneTwister.getTwister(); }

    if ( ( parent == null ) || ( consultants == null ) )
    {
      System.out.println
      (
        "in InverOver.algorithm() caught e_nullParameter"
      );
    }

    int offspringCityPrime         = -1;
    int offspringCityPrimeIndex    = -1;
    int offspringCurrentCity       = -1;
    int offspringCurrentCityIndex  = -1;
    int consultantCurrentCityIndex = -1;
    int consultantNextCityIndex    = -1;
    int numCities           = -1;

    TravellerChromosome    consultant       = null;

/*
** Do an inver-over mutation.
*/

/*
** Fission off a new genome to batter and abuse.
*/

    TravellerChromosome offspring = new TravellerChromosome( parent );

    numCities = TravellerWorld.getTravellerWorld().getNumberOfCities();

    offspringCurrentCityIndex = m_mt.nextInt(numCities);
    offspringCurrentCity      = offspring.getCity(offspringCurrentCityIndex);
    offspringCityPrime      = -1;
    offspringCityPrimeIndex = -1;

    while (true)  // We don't "break" this loop, we return from it!
    {

/*
** To help maintain diversity, there is a small chance that inver-over
** does a self mutation, the true alternative part of this next
** conditional.
*/

      if ( inverOverChoosesRandomLocalCity() )
      {

        offspringCityPrimeIndex =
          ( offspringCurrentCityIndex + 1 + m_mt.nextInt( numCities - 1) )
          % numCities;
        offspringCityPrime = offspring.getCity( offspringCityPrimeIndex );

      }
      else
      {

/*
** Pick a consultant, let him tell us which city is next to our current
** city in _his_ genome, then change our genome to make that also true
** for us.
*/

        consultant = (randomChromosomeNotCurrent( parent , consultants, biaser ));
        consultantCurrentCityIndex = consultant.findCity( offspringCurrentCity );
        consultantNextCityIndex    = ( 1 + consultantCurrentCityIndex ) % numCities;
        offspringCityPrime = consultant.getCity(consultantNextCityIndex);
        offspringCityPrimeIndex = offspring.findCity(offspringCityPrime);

      }

/*
** Check for termination condition, which is that the next city which I
** have, after consultation, decided to move next to my current city of
** interest is already there.
*/

      if
      (
        ( ( offspringCurrentCityIndex + 1 )             == offspringCityPrimeIndex )
        ||
        ( ( offspringCurrentCityIndex + 1 - numCities ) == offspringCityPrimeIndex )
        ||
        ( ( offspringCurrentCityIndex - 1 )             == offspringCityPrimeIndex )
        ||
        ( ( offspringCurrentCityIndex - 1 + numCities ) == offspringCityPrimeIndex )
      )
      {

        return offspring;
      }

/*
** No, we are not done, so invert the segment of my genome from beside
** my current city of interest to the one I want next to it, which will
** accomplish that goal.
*/

      int invertFrom = offspringCurrentCityIndex + 1;
      int invertFor  = offspringCityPrimeIndex - invertFrom + 1;
      if ( invertFor < 0 ) { invertFor = invertFor + numCities; }
      int invertTo   = invertFrom + invertFor - 1;

/*
**  Invert a stretch of the genome which will be treated as a wrapping
**  ring if the segment we chose to invert goes off the end.
*/

      for ( int i = 0; i < ( invertFor / 2 ) ; i++ )
      {

/*
**  This arithmetic works because the parameters to getCity and setCity
**  are used modulo numCities.
*/

        int temp = offspring.getCity( invertFrom + i );
        offspring.setCity( ( invertFrom + i ) , offspring.getCity( invertTo - i ) );
        offspring.setCity( ( invertTo   - i ) , temp ); 
      }

/*
** March along; make the city I just moved next to my city of interest,
** my new gocal point, and try again.
*/

      offspringCurrentCity = offspringCityPrime;
      offspringCurrentCityIndex = offspring.findCity(offspringCityPrime);
    }
  }

  private TravellerChromosome randomChromosomeNotCurrent
  (
    TravellerChromosome current,
    Chromosome [] candidates,
    RouletteWheel rw
  )
  {
    TravellerChromosome candidate = null;

      while (true)
      {
        candidate = ( TravellerChromosome) ( candidates[rw.getIndex()]) ;
        if ( candidate != current )
        {
          return candidate;
        }
      }

  }

/*
** To maintain population diversity, we include a small chance that
** inver-over will choose the next city at random from its own genome
** instead of via consultation with another genome.
*/

  private boolean inverOverChoosesRandomLocalCity()
  {
    return ( m_mt.nextInt(100) < 1 );
  }

}

