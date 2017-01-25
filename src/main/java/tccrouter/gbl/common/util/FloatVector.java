//-----------------------------------------------------------------------------
//  com.coyotegulch.math
//
//  A Package of Generic Tools used in Numerical Algorithms
//  
//  FloatVector.java
//  version 1.1.0
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

package tccrouter.gbl.common.util;

import java.util.Vector;

public final class FloatVector 
{
    // fields
    private Vector m_floats = null;

    // constructor
    public FloatVector()
    {
        m_floats = new Vector();
    }

    // copy constructor
    public FloatVector(FloatVector fv)
    {
        m_floats = fv.m_floats;
    }

    // get the float at a given index
    public float floatAt(int n)
    {
        return ((Float)m_floats.elementAt(n)).floatValue();
    }

    // set a float at a specific index
    public void setFloatAt(int n, float f)
    {
        m_floats.setElementAt(new Float(f), n);
    }

    // add a new float to the end of the vector
    public void addFloat(float f)
    {
        m_floats.addElement(new Float(f));
    }

    // return number of elements
    public int size()
    {
        return m_floats.size();
    }
}

