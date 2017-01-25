//-----------------------------------------------------------------------------
//  Traveller -- A Java Application and Applet
//
//  A Genetic Algorithm for Solving the Travelling Salesman Problem
//
//  CyclicCrossover.java
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

public class CyclicCrossover
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

        child.setOriginator( "CyclicCrossover" );
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
        "CyclicCrossover.reproduce() threw!"
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
    MersenneTwister mt    = MersenneTwister.getTwister();

    f.canonicalize();
    m.canonicalize();

    TravellerChromosome fatherSprog = new TravellerChromosome(f);
    TravellerChromosome motherSprog = new TravellerChromosome(m);

    // cycle crossover
    int j = mt.nextInt(f.getNumCities());
    int t = f.getCity(j);

/*
** POLICY We include an offset and direction reversal for the mother to
** put one genome in general position, removing artifacts caused by
** using arrays instead of rings to hold permutation genomes, and by
** keeping genomes in canonical form for other reasons.
*/

    int motherOffset = mt.nextInt(f.getNumCities());
    boolean reverseMother = mt.nextBoolean();

    while (true)
    {

      fatherSprog.setCity(j, m.getCity(j, motherOffset, reverseMother));
      motherSprog.setCity(j, f.getCity(j), motherOffset, reverseMother);

      if (fatherSprog.getCity(j) == t) break;

      j = f.findCity(fatherSprog.getCity(j));
    }

/*
** POLICY We include competition for survival in the nest, so that
** matings produce only one viable offspring.  This lets us give each
** genome a chance to compete in every generation, where overwriting
** some of their chances with the offspring of multiple-child births in
** the original implementation did not, arguably discarding fitness
** thereby.
*/
    TravellerChromosome child = null;

    motherSprog.canonicalize();
    fatherSprog.canonicalize();

    if
    (
      (
        Population.areMinimizing()
        &&
        (motherSprog.testFitness() < fatherSprog.testFitness())
      )
      ||
      (
        (!Population.areMinimizing())
        &&
        (motherSprog.testFitness() > fatherSprog.testFitness())
      )
    )
    {
      child = motherSprog;
    }
    else
    {
      child = fatherSprog;
    }

/*
** [Very successful change added in Traveller release "epsilon".]
** Prevent catastrophic population diversity collapse.  If the offspring
** is identical to the genome selected biased on fitness (the secondary
** parent genome) which happens for cyclic crossover when the cycle is
** the whole genome resulting in the genomes simply being swapped rather
** than crossed over, return instead the genome selected sequentially
** from the population (the primary parent genome).  While the secondary
** parent genome in this case is the more fit one, it contributes no new
** partial solutions to the population, and letting it replace the
** primary parent genome removes from the population any partial
** solutions the primary parent genome might have that didn't get
** captured by this heuristic into a child genome, a negative result
** overall despite the ephemeral improvement in average population
** fitness.
*/

    if ( m.looksLikeMe( child ) )
    {
      child = new TravellerChromosome( f );
    }
    
    return child;
  }
}

