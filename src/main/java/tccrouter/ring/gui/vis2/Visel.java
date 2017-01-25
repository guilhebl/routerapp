/* 
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  - Redistributions of source code must retain the above copyright notice,
 * 	  this list of conditions and the following disclaimer.
 *  - Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *  - Neither the name of the Rin'G Project nor the names of its contributors
 *    may be used to endorse or promote products derived from this software
 *    without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE 
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE 
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN
 * IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package tccrouter.ring.gui.vis2;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.GeneralPath;

/**
 *
 */
public abstract class Visel {

	/**
	 * 
	 */
	public static final int LOCATION_BACK = 1;
	/**
	 * 
	 */
	public static final int LOCATION_FRONT = 2;
	/**
	 * 
	 */
	protected Shape shape;
	/**
	 * 
	 */
	protected double x;
	/**
	 * 
	 */
	protected double y;
	/**
	 * 
	 */
	protected Color color;
	/**
	 * 
	 */
	protected int location;
	
	/**
	 * @param color
	 * 
	 */
	public Visel(double x, double y, Color color, int location) {
		shape = new GeneralPath();
		this.x = x;
		this.y = y;
		this.color = color;
		this.location = location;
	}

	/**
	 * 
	 *
	 */
	public abstract void buildShape();
	
	/**
	 * 
	 * @return
	 */
	public Shape getShape() {
		return shape;
	}
	
	/**
	 * @return Returns the location.
	 */
	public int getLocation() {
		return location;
	}
	
	/**
	 * @param location The location to set.
	 */
	public void setLocation(int location) {
		this.location = location;
	}
	
	/**
	 * 
	 * @param g2
	 */
	public abstract void paintVisel(Graphics2D g2);
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public boolean contains(double x, double y) {
		return shape.contains(x,y);
	}
	
	/**
	 * 
	 * @return
	 */
    public double getX() {
        return x;
    }
    
    /**
     * 
     * @param x
     */
    public void setX(double x) {
        this.x = x;
    }
    
    /**
     * 
     * @return
     */
    public double getY() {
        return y;
    }
    
    /**
     * 
     * @param y
     */
    public void setY(double y) {
        this.y = y;
    }
}
