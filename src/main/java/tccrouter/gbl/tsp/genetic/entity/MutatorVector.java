//-----------------------------------------------------------------------------
//  com.coyotegulch.genetic
//
//  A Package of Generic Tools used in Genetic Algorithms
//
//  MutatorVector.java
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

package tccrouter.gbl.tsp.genetic.entity;

import java.util.Vector;

import tccrouter.gbl.tsp.genetic.RouletteWheel;

public class MutatorVector
{
    // list of mutator objects
    protected Vector m_mutators;

    // roulette wheel for choosing mutators
    protected RouletteWheel m_chooser;

    // exceptions
    private static final RuntimeException m_err1 = new RuntimeException("empty MutatorVector");

    // constructor
    public MutatorVector()
    {
        m_mutators = new Vector();
        m_chooser  = new RouletteWheel();
    }

    // install a new mutator
    public void addMutator(Mutator m, float w)
    {
        m_mutators.addElement(m);
        m_chooser.addWeight(w);
    }

    // select a mutator by roulette wheel
    public Mutator select()
    {
        if (m_mutators.size() == 0)
            throw m_err1;

        return (Mutator)m_mutators.elementAt(m_chooser.getIndex());
    }
}
