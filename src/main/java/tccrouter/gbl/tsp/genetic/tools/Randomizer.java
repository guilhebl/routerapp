//-----------------------------------------------------------------------------
//  com.coyotegulch.tools
//
//  A Package of Generic Tools
//  
//  Randomizer.java
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

package tccrouter.gbl.tsp.genetic.tools;

public class Randomizer 
{
    // the current seed value
    protected int seed = 0;

    // constants used in conversion from int to float
    final protected static float  FLT_EPS = 1.192092896e-07F;
    final protected static float  FLT_MAX = 1.0F - FLT_EPS;
    final protected static float  FLT_AM  = 1.0F / 2147483563.0F;

    final protected static double DBL_EPS = 2.2204460492503131e-016D;
    final protected static double DBL_MAX = 1.0D - DBL_EPS;
    final protected static double DBL_AM  = 1.0D / 2147483563.0D;

    // constants used in algorithm
    final private static int IA   = 16807;
    final private static int IM   = 2147483647;
    final private static int IQ   = 127773;
    final private static int IR   = 2836;
    final private static int MASK = 123459876;

    // default constructor
    public Randomizer()
    {
        // set seed to current time in milliseconds
        seed = (int)System.currentTimeMillis();
    }

    // constructor with seed value
    public Randomizer(int s)
    {
        seed = s;
    }
    
    // obtain the current seed
    public int getSeed()
    {
        return seed;
    }

    // get next value in sequence
    public int next()
    {
        seed ^= MASK; // prevent zero seed

        int k = seed / IQ;
        seed = IA * (seed - k * IQ) - IR * k;

        if (seed < 0)
            seed += IM;

        return seed;
    }
    
    // get next value between zero and hi extrema
    public int next(int hi)
    {
        // return ranged value
        return (int)((float)hi * nextFloat());
    }

    // get next value between hi and low extrema
    public int next(int lo, int hi)
    {
        // return ranged value
        return (int)((long)lo + ((long)hi - (long)lo) * nextFloat());
    }

    // get next uniform deviate as a float
    public float nextFloat()
    {
        // get next value
        next();

        // convert 
        float temp = FLT_AM * seed;

        if (temp > FLT_MAX)
            return FLT_MAX;
        else
            return temp;
    }
    
    // get next uniform deviate as an float within a range
    public float nextFloat(float lo, float hi)
    {
        // return ranged value
        return lo + (hi - lo) * nextFloat();
    }

    // get next uniform deviate as a double
    public double nextDouble()
    {
        // get next value
        next();

        // convert 
        double temp = DBL_AM * seed;

        if (temp > DBL_MAX)
            return DBL_MAX;
        else
            return temp;
    }

    // get next uniform deviate as an double within a range
    final public double nextDouble(double lo, double hi)
    {
        // return ranged value
        return lo + (hi - lo) * nextDouble();
    }
}
