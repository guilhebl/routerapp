package tccrouter.gbl.tsp.genetic.seeders;

import tccrouter.gbl.common.entity.TSProblemModel;
import tccrouter.gbl.tsp.genetic.TravellerWorld;
import tccrouter.gbl.tsp.genetic.entity.TravellerChromosome;

public class MasterSeeder
{
  private static MinimalSpanningTree   m_mst         = null;
  private static int                   m_popMember   = 0;

  public static void seedGenomes
  (
    TravellerChromosome [] chromosomes,
    TravellerWorld world
  )
  {

    setupGenomeSeeders( world );

/*
** Figure out how may seeders are enabled, so we can split the
** population among them fairly, except that random seeding, as the
** default, gets any leftovers from seeders that can produce only a
** limited number of seed genomes.
*/

    int seeders = 1;
    
    if (TSProblemModel.getInstance().isMinimalSpanningTree()) {
    	seeders++;
    }

/*
** Fill in the population with seed genomes, in a round robin, until all
** the genomes have been assigned.
*/

    m_popMember = 0;

    while ( true )
    {
/*
** Always start with a random one if random seeds are enabled; we want
** member zero not to begin as a high fitness genome, so that we can
** notice while watching the interface when a high fitness genome does
** reach position zero and start accumulating clones, an indication of
** possible global or local optimum convergence.
*/

      if ( m_popMember >= world.getPopulationSize() ) { break; }


        chromosomes[m_popMember] =
          new TravellerChromosome( world, "Random seed genome" );
        m_popMember++;

/*
** Seeds derived from the minimal spanning tree have good fitness, but
** the current implementation of sampling from the MST is weak on
** variety, and a better one would be hard to do, hard on the garbage
** collector, and slow (though I've figured out how it would work);
** compensate a bit by mixing MST seeds with random ones.  The roulette
** wheel is going to kill us on getting to the random ones, though.
*/
        if (TSProblemModel.getInstance().isMinimalSpanningTree())
        {
        
        chromosomes[m_popMember] =
          ( m_popMember < seeders )
          ? new TravellerChromosome
            (
              world,
              "minimal spanning tree seed genome greedily derived",
              m_mst.getGreedilyDerivedNodeList( world )
            )
          : new TravellerChromosome
            (
              world,
              "minimal spanning tree seed genome usual derived",
              m_mst.getDerivedNodeList( world )
            )
          ;
        m_popMember++;    
        }
      
    } // end while
  }


  private static void setupGenomeSeeders( TravellerWorld world )
  {

/*
** FIXME Put minimal spanning tree construction here.  Counter good
** programming practice bummer!  All this calculation slop is _inside
** the constructor_, which means that the canvas is not yet ready to
** display a minimal spanning tree construction as it is happening,
** which has to happen before the minimal spanning tree can be used as
** an alternative way to fill the chromosome city/Codon arrays.
** Refactor this ugly mess to put all the math initialization outside
** this constructor.
*/

	  if (TSProblemModel.getInstance().isMinimalSpanningTree()) {

/*
** FIXME This is trashy, MinimalSpanningTree has no business knowing
** about something as complex as a TravellerWorld, but to fix it requires
** ripping the city location information out of TravellerWorld and into
** a public class; live with it for now.
*/
      
	  
	  
		  m_mst = new MinimalSpanningTree( world );
	  }
	  
	  
  }
  
  public static double getFloor()
  {
	  if (TSProblemModel.getInstance().isMinimalSpanningTree()) {      
		  return MinimalSpanningTree.getFloor();
	  
    }
    else
    {
      return 0.0D;
    }
  }
}
