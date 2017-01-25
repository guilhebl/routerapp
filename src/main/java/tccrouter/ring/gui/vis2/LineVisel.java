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
import java.awt.geom.Line2D;

/**
 * 
 */
public class LineVisel extends Visel {

    /**
     * 
     */
    protected double x2;
    /**
     * 
     */
    protected double y2;
    
    /**
     * @param x
     * @param y
     * @param color
     * @param location
     */
    public LineVisel(double x1, double y1, double x2, double y2,
            Color color, int location) {
        super(x1, y1, color, location);
        this.x2 = x2;
        this.y2 = y2;
    }

    /**
     * @see ring.gui.vis2.Visel#buildShape()
     */
    public void buildShape() {
        shape = new Line2D.Double(x,y,x2,y2);
    }

    /**
     * @see ring.gui.vis2.Visel#paintVisel(java.awt.Graphics2D)
     */
    public void paintVisel(Graphics2D g2) {
    	g2.setColor(color);
        g2.draw(shape);
    }

    /**
     * @return Returns the x2.
     */
    public double getX2() {
        return x2;
    }
    
    /**
     * @param x2 The x2 to set.
     */
    public void setX2(double x2) {
        this.x2 = x2;
    }
    
    /**
     * @return Returns the y2.
     */
    public double getY2() {
        return y2;
    }
    
    /**
     * @param y2 The y2 to set.
     */
    public void setY2(double y2) {
        this.y2 = y2;
    }
    
	public boolean contains(double x, double y) {
		return Line2D.ptLineDist(getX(),getY(),getX2(),getY2(),x,y) < 2;
	}
	
}
