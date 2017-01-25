//-----------------------------------------------------------------------------
//  Traveller -- A Java Application and Applet
//
//  A Genetic Algorithm for Solving the Travelling Salesman Problem
//
//  PartialMatchCrossover.java
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

public class PartialMatchCrossover
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

        child.setOriginator( "PartialMatchCrossover" );
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
        "PartialMatchCrossover.reproduce() threw!"
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

/*
** It works much better for subsequent calculations to work with
** starting point and segment length, rather than starting point and
** ending point, so I replaced Scott's logic here.  It was rife with
** artifacts from ignoring the ring essense of the Traveller permutation
** chromosome, and doing so actually made his code more complicated in
** some parts.
*/

    int genomeLength = f.getNumCities();
/*
** Randomly pick a crossover segment length.  At least two cities
** should escape this segment, or doing the crossover is pointless.
*/

    int segmentLength = mt.nextInt(genomeLength - 1);

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

    f.canonicalize();
    m.canonicalize();

    TravellerChromosome fatherSprout = new TravellerChromosome(f);
    TravellerChromosome motherSprout = new TravellerChromosome(m);

    // swap cities
    for ( int n = fatherStart; n < ( fatherStart + segmentLength ); n++ )
    {
      if ( f.getCity( n ) != m.getCity( n, motherOffset, reverseMother ) )
      {
        int s =
          motherSprout.findCity
          (
            f.getCity( n ),
            motherOffset,
            reverseMother
          );
        int t = motherSprout.getCity( n, motherOffset, reverseMother );

        motherSprout.setCity
        (
          n,
          motherSprout.getCity
          (
            s,
            motherOffset,
            reverseMother
          ),
          motherOffset,
          reverseMother
        );
        motherSprout.setCity( s, t, motherOffset, reverseMother );

        s =
          fatherSprout.findCity
          (
            m.getCity( n, motherOffset, reverseMother )
          );
        t = fatherSprout.getCity( n );

        fatherSprout.setCity( n, fatherSprout.getCity( s ) );
        fatherSprout.setCity( s, t );
      }
    }

/*
** POLICY We choose to let weaklings die in the nest in the interests of
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
        (motherSprout.testFitness() < fatherSprout.testFitness())
      )
      ||
      (
        (!Population.areMinimizing())
        &&
        (motherSprout.testFitness() > fatherSprout.testFitness())
      )
    )
    {

      child =  motherSprout;
    }
    else
    {
      child =  fatherSprout;
    }

    return child;

  }

}

