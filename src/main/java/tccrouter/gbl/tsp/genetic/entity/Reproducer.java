//-----------------------------------------------------------------------------
//  com.coyotegulch.genetic
//
//  A Package of Generic Tools used in Genetic Algorithms
//
//  Reproducer.java
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

package tccrouter.gbl.tsp.genetic.entity;

import tccrouter.gbl.tsp.genetic.tools.Randomizer;

public interface Reproducer
{
    Randomizer m_randNo = new Randomizer();

    RuntimeException m_errUnknownReproducerType =
      new RuntimeException("unknown reproducer type in polymorphic dispatch");
}

