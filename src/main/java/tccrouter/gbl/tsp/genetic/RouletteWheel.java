//-----------------------------------------------------------------------------
//  com.coyotegulch.genetic
//
//  A Package of Generic Tools used in Genetic Algorithms
//
//  RouletteWheel.java
//  version 3.1.0
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

package tccrouter.gbl.tsp.genetic;

import tccrouter.gbl.common.util.FloatVector;
import tccrouter.gbl.tsp.genetic.tools.MersenneTwister;
import tccrouter.gbl.tsp.genetic.tools.Randomizer;

public final class RouletteWheel
{
    // table of weights
    private FloatVector m_weights;

    // total "weight" of all indexes
    private float m_totalWt;

    // predefine exceptions
    static private final IllegalArgumentException m_err1 = new IllegalArgumentException("RouletteWheel: negative or zero weight");
    static private final IllegalArgumentException m_err2 = new IllegalArgumentException("RouletteWheel: non-positive total weight");

    private static Randomizer randGen = new Randomizer();
    private        MersenneTwister m_mt = null;

    // constructors
    public RouletteWheel()
    {
      m_weights = new FloatVector();
      m_mt = MersenneTwister.getTwister();
    }

    public RouletteWheel(float [] wtList)
    {
      m_weights = new FloatVector();
      m_mt = MersenneTwister.getTwister();

      for (int i = 0; i < wtList.length; ++i)
          addWeight(wtList[i]);
    }

    // copy constructor
    public RouletteWheel(RouletteWheel rw)
    {
        m_weights = new FloatVector(rw.m_weights);
        m_totalWt = rw.m_totalWt;
        m_mt = rw.m_mt;
    }

    // interrogation methods
    public float getWeight(int n)
    {
        return m_weights.floatAt(n);
    }

    public float getTotalWeight()
    {
        return m_totalWt;
    }

    public FloatVector getWeightTable()
    {
        return m_weights;
    }

    // change a specific weight, return old weight value
    public float setWeight(int n, float w)
    {
        if (w < 0.0F)
            throw m_err1;

        float result = m_weights.floatAt(n);

        m_weights.setFloatAt(n,w);

/*
** KPD This routine seems never to be called in Traveller, perhaps why
** this bug was missed.
** 
** BUG! m_totalWt -= result + w;
*/

        m_totalWt += (w - result);

        if (m_totalWt <= 0.0F)
            throw m_err2;

        return result;
    }

    // add a new weight to the table
    public void addWeight(float w)
    {
        if (w <= 0.0F)
            throw m_err1;

        m_weights.addFloat(w);
        m_totalWt += w;
    }

    // get a randomly-selected index
    public int getIndex()
    {
        if (m_totalWt <= 0.0F)
            throw m_err2;

        float s = m_mt.nextFloat() * m_totalWt;

        int i = 0;

        while (true)
        {
            if (i >= m_weights.size())
                break;

            s -= m_weights.floatAt(i);


/*
** KPD This needed to be changed in case the randomizer can return
** exactly 1.0D.
** 
** Minor BUG!  if (s < 0.0)
*/

            if (s <= 0.0)
                break;

            ++i;
        }

        return i;
    }

}

