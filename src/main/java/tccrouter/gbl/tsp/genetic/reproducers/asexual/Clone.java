//-----------------------------------------------------------------------------
//  Traveller -- A Java Application and Applet
//
//  A Genetic Algorithm for Solving the Travelling Salesman Problem
//
//  TravellerClone.java
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

import tccrouter.gbl.tsp.genetic.entity.AsexualReproducer;
import tccrouter.gbl.tsp.genetic.entity.Chromosome;
import tccrouter.gbl.tsp.genetic.entity.TravellerChromosome;

public class Clone
  implements AsexualReproducer
{

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

      child.setOriginator( "Clone" );
      child.checkValidity();
      return (Chromosome) child;

    }
    catch (Exception e)
    {
      System.err.println
      (
        "Clone.reproduce() threw!"
      );
    }

/*
** This code should never be reached, it is just here to pacify javac.
*/

    return parent; 
  }

  private TravellerChromosome algorithm( TravellerChromosome p )
  {
    return new TravellerChromosome(p);
  }

}

