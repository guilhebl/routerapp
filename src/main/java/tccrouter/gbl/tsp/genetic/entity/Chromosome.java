//-----------------------------------------------------------------------------
//  com.coyotegulch.genetic
//
//  A Package of Generic Tools used in Genetic Algorithms
//
//  Chromosome.java
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

public abstract class Chromosome
{
    // fitness value
    protected double m_fitness;

    // static members
    protected static Randomizer m_randNo = new Randomizer();

    // predefined exception objects
    static private final RuntimeException m_err1 = new RuntimeException("Chromosome: incompatible types");

    // constructor
    public Chromosome()
    {
        m_fitness = 0.0D;
    }

    public Chromosome(Chromosome c)
    {
        m_fitness = c.m_fitness;
    }

    // interrogator
    public double getFitness()
    {
        return m_fitness;
    }

    public void flipFitness(double max)
    {
        m_fitness = max - m_fitness + 1.0D;
    }

    // verify compatible chromosomes
    protected void verify(Chromosome c)
    {
        if (this.getClass() != c.getClass())
            throw m_err1;
    }

/*
** ---------------------------------------------------------------------
** Here are a list of services that any class extending Chromosome
** should be able to provide, so they are made _abstract_ in this
** (abstract, unimplementable) parent class.  This allows their
** implementing methods in concrete classes which extend Chromosome to
** be used with dynamic dispatching (without casting, that is) in the
** routines which exercise them.
** ---------------------------------------------------------------------
*/

/*
** Any chromosome should be able to assure that its genome is valid;
** rather than returning a value, just have the checkValidity method
** complain to System.err if not.
*/

    abstract public void checkValidity();

/*
** Any chromosome should respect the general contract for an Object that
** it respond to a request to present itself as a String in some
** sensible manner, since this is very helpful for debugging, logging
** and other presentation purposes.  Note that by building up the String
** in a StringBuffer, using "\r\n" to separate lines, and then using the
** StringBuffer's own toString() method to return this Object's String
** value, "toString()" presentations of arbitrary complexity are
** possible here (and in general).  Since the returned String may be
** embedded in other text, it is probably a good idea that a "\r\n" not
** occur at its beginning or end, though this is up to the developer;
** for very complex Chromosomes, putting the toString() value out in a
** fashion that creates a stand-alone block may be the correct design
** choice.
*/

    abstract public String toString();

/*
** Provide a way to compute fitness.
*/

    abstract public double testFitness();



/*
** Provide a way to provide a clean separate copy of self; so far as
** possible, this should retain any information that is still valid for
** an unchanged genome (such as last calculated fitness).
*/

    abstract public Chromosome cloneThis();


/*
**  Provide ways to set and get the name of the routine that created (or
**  last modified) the chromosome; this is crucial for debugging and
**  logging when many heuristics and seed mechanisms are implemented for
**  a chromosome.
*/

    abstract public void setOriginator( String originatorName );
    abstract public String getOriginator();
}

