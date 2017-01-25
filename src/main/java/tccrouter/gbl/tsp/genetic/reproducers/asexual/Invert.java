//-----------------------------------------------------------------------------
//  Traveller -- A Java Application and Applet
//
//  A Genetic Algorithm for Solving the Travelling Salesman Problem
//
//  Invert.java
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
** This code was modified by Kent Paul Dolan.  See accompanying file
** TravellerDoc.html for status of the modifications for your use.
*/

package tccrouter.gbl.tsp.genetic.reproducers.asexual;

import tccrouter.gbl.tsp.genetic.entity.Chromosome;
import tccrouter.gbl.tsp.genetic.entity.Mutator;
import tccrouter.gbl.tsp.genetic.entity.TravellerChromosome;
import tccrouter.gbl.tsp.genetic.tools.MersenneTwister;

public class Invert
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

      child.setOriginator( "Invert" );
      child.checkValidity();
      return (Chromosome) child;

    }
    catch (Exception e)
    {
      System.err.println
      (
        "Invert.reproduce() threw!"
      );
    }

/*
** This code should never be reached, it is just here to pacify javac.
*/

    return parent; 
  }

  private TravellerChromosome algorithm( TravellerChromosome parent )
  {

    MersenneTwister mt    = MersenneTwister.getTwister();

    TravellerChromosome offspring = new TravellerChromosome( parent );
    offspring.canonicalize();

    int j, k;

    j = mt.nextInt(parent.getNumCities() - 1);

/*
** Allow the sublist which is to be inverted to lap around the end of
** the genome, to remove end effect biases.
** 
** Avoid inverting the whole list; we must allow the whole list except
** one city, though, to allow our minimum circuit to be a triangle.
** Consider min=4???
*/

    k = j + 1 + mt.nextInt(parent.getNumCities() - 2);


/*
** Calculate the length of the region to be swapped; we walk from both
** ends at once , so our counter only needs to account for half the
** length, and we don't have to do anything for an odd length for the
** codon in the middle, so this is indeed what we want.
*/

    int s = (k - j + 1) / 2;

/*
** Notice that this works without generating array out of bounds
** exceptions only because we have cleverly made getCity() and setCity()
** employ their indices with modular arithmetic with respect to the
** genome length.
*/

    for ( int i = 0; i < s; i++ )
    {

/*
** Swap codon names for the segment being inverted.
*/

      int t = offspring.getCity(k);
      offspring.setCity(k,offspring.getCity(j));
      offspring.setCity(j,t);

      ++j;
      --k;
    } 

    offspring.canonicalize();
    return offspring;

  }

  public boolean isSuitableForMultipleMutationRuns() { return true; }

}
