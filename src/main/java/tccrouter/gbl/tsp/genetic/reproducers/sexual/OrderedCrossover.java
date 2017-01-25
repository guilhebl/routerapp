//-----------------------------------------------------------------------------
//  Traveller -- A Java Application and Applet
//
//  A Genetic Algorithm for Solving the Travelling Salesman Problem
//
//  OrderedCrosover.java
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
** This code was extensively modified by Kent Paul Dolan.  See
** accompanying file TravellerDoc.html for status of the modifications
** for your use.
*/

package tccrouter.gbl.tsp.genetic.reproducers.sexual;

import tccrouter.gbl.tsp.genetic.entity.Chromosome;
import tccrouter.gbl.tsp.genetic.entity.Population;
import tccrouter.gbl.tsp.genetic.entity.SexualReproducer;
import tccrouter.gbl.tsp.genetic.entity.TravellerChromosome;
import tccrouter.gbl.tsp.genetic.tools.MersenneTwister;

public class OrderedCrossover
  implements SexualReproducer
{
	
  public Chromosome reproduce(Chromosome father, Chromosome mother)
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

        child.setOriginator( "OrderedCrossover" );
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
        "OrderedCrossover.reproduce() threw!"
      );
    }

/*
** This code should never be reached, it is just here to pacify javac
** about the return statement being stuck in a try context above.
*/

    return father; 
  }

  private TravellerChromosome algorithm( TravellerChromosome f, TravellerChromosome m )
  {
    MersenneTwister mt = MersenneTwister.getTwister();

    int genomeLength = f.getNumCities();

    f.canonicalize();
    m.canonicalize();

    TravellerChromosome fatherOffspring = new TravellerChromosome(f);
    TravellerChromosome motherOffspring = new TravellerChromosome(m);

    fatherOffspring.invalidateCities(); 
    motherOffspring.invalidateCities();

/*
** It works much better for subsequent calculations to work with
** starting point and segment length, rather than starting point and
** ending point, so I replaced Scott's logic here.  It was rife with
** artifacts from ignoring the ring essense of the Traveller permutation
** chromosome, and doing so actually made his code more complicated in
** some parts.
*/

/*
** Randomly pick a crossover segment length.  At least two cities should
** escape this segment, or doing the crossover is pointless.  At least
** two cities should be in it, because swapping less than an edge
** doesn't do any more than the Move heuristic can already do.  Of
** course, if the genome length is three, we are probably wasting time
** in all cases.
*/

    int segmentLength = 2 + mt.nextInt(genomeLength - 3);

/*
** Randomly pick the beginning of the crossover segment in the father.
*/

    int fatherStart = mt.nextInt(genomeLength);

/*
** Randomly pick an offset from there for the start of the crossover
** segment in the mother.
*/

    int motherOffset = mt.nextInt(genomeLength);

/*
** Choose whether to traverse the mother genome in a reversed or
** forward direction.
*/

    boolean reverseMother = mt.nextBoolean();

/*
** OK, we know how far we want to go, and in which direction, for both
** mother and father genomes, and we want to copy stuff from parent to
** child to the front if it is in the opposite parent's crossover
** segment, and after the front stuff, if it is not.  Choose some
** walking shoes.
*/

/*
** WARNING This isn't exactly the same as Scott's documentation shows
** for ordered crossover, which would take three pointers and more
** findCity() calls to do correctly, but it adheres to the spirit.
** Scott's method copies all the cities occurring in the opposite
** parent's genome to the left, then all the cities not yet copied from
** the current parent's genome to the right, then fills in the middle
** with those that remain, though that's not at all how he explained it,
** since he forgot to discuss that the cities that could occur in
** _both_ parent's crossover segments might mean copying less than all
** of ones own crossover segment to the end, and also he failed to take
** advantage of the genome's invariance under ring rotation to slide the
** crossover segments to the left to start.  This version of the routine
** just copies the first set to the left and the other two sets to the
** right without trying to keep them distinguished.  I think, in doing
** so, that it preserves more of the original order than Scott's
** approach, though I'd hate to have to defend that supposition without
** a lot of preparation time.
*/

/*
** Where the crossover city copying starts, both "from" and "to", in
** relation to the starting points.
*/

    int mcx_to = 0;
    int fcx_to = 0;
    int mcx_from = 0;
    int fcx_from = 0;
/*
** Where the non-crossover city copying starts, leaving room for the
** crossover cities, exactly segmentLength worth of room, in fact.
*/

    int mcnx = segmentLength;
    int fcnx = segmentLength;
/*
** Take a walk.
*/

    for (int i = 0; i < genomeLength; i++)
    {

      int fatherCity = f.getCity(i + fatherStart);
      int motherCity = m.getCity(i, motherOffset + fatherStart, reverseMother);

      int fatherCityIndexInMother =
        m.findCity( fatherCity , motherOffset, reverseMother );
      int motherCityIndexInFather = f.findCity( motherCity );

/*
** FIXME THIS IS MADDENINGLY WRONG!  I'm copying the correct codons to
** the swap region, but I'm copying them in the recipient parent order
** instead of in the donor parent order!
*/

      if
      (
        m.indexIsInSegment
        (
          fatherCityIndexInMother,
          fatherStart,
          segmentLength,
          motherOffset,
          reverseMother
        )
      )
      {

/*
** To get the correct crossover order (that of the mother) in the
** fatherOffspring, we don't treat the crossover-incoming city
** encountered in the father as a literal city to copy (they will be
** encountered in arbitrary order in the father relative to their order
** in the mother), but only as a notification that it is time to copy
** the next crossover city from the mother to the fatherOffspring
** crossover area.
*/

        fatherOffspring.setCity
        (
           fcx_to,
           m.getCity( mcx_from, motherOffset + fatherStart, reverseMother )
        );
        fcx_to++;
        mcx_from++;
      }
      else
      {
        fatherOffspring.setCity(fcnx, fatherCity);
        fcnx++;
      }

      if
      (
        f.indexIsInSegment
        (
          motherCityIndexInFather,
          fatherStart,
          segmentLength,
          0,
          false
        )
      )
      {

/*
** Same considerations as above for the fatherOffspring, but with the
** genders of all the players reversed.
*/

        motherOffspring.setCity(mcx_to, f.getCity( fcx_from + fatherStart ) );
        mcx_to++;
        fcx_from++;
      }
      else
      {
        motherOffspring.setCity(mcnx, motherCity);
        mcnx++;
      }
    }

/*
** POLICY We choose to murder weaklings in the nest in the interests of
** having each genome compete for only its own slot in the population,
** in the simplest case.  The previous implementation let some genomes
** get removed from the population with no chance to breed or compete,
** by overwriting their slots (and thus opportunities) with multiple
** offspring of crossovers, and arguably discarded fitness from the
** population that way.
*/

    TravellerChromosome child = null;

    if
    (
      (
        Population.areMinimizing()
        &&
        (motherOffspring.testFitness() < fatherOffspring.testFitness())
      )
      ||
      (
        (!Population.areMinimizing())
        &&
        (motherOffspring.testFitness() > fatherOffspring.testFitness())
      )
    )
    {
      child = motherOffspring;
    }
    else
    {
      child = fatherOffspring;
    }

    return child;

  }

}
