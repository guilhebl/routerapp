//-----------------------------------------------------------------------------
//  com.coyotegulch.genetic
//
//  A Package of Generic Tools used in Genetic Algorithms
//
//  Mutator.java
//  version 2.1.0
//

//  Copyright 1996-2001 Scott Robert Ladd. All rights reserved.
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

/*
** KPD a "Mutator" is just another asexual reproducer; we distinguish it
** by its usage, not by its behavior.  An asexual reproducer is used
** _before_ any fitness filtering to see whether it succeeds to the next
** generation; it is expected to _improve_ on a genome.  A mutator,
** contrarywise, is used _after_ any fitness filtering, and survives to
** the next generation will-the-nil-thee, its job is to maintain variety
** in the population genome collection, not, particularly, to improve on
** its parent genome's fitness.  In fact, usually the offspring will be
** less fit than the parent.  Thus, asexual reproducers that only
** improve the genome are not really suitable to be Mutators.
*/

package tccrouter.gbl.tsp.genetic.entity;


public interface Mutator
  extends AsexualReproducer
{
  public boolean isSuitableForMultipleMutationRuns();
  public Chromosome mutate( Chromosome parent );
}

