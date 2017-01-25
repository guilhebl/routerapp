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
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.QuadCurve2D;

/**
 * 
 */
public class CurvedLineVisel extends Visel {

    /**
     * 
     * Creates an instance of this class.
     * @param s
     */
    public CurvedLineVisel(Shape shape, Color color,int location) {
    	super(0,0,color,location);
    	
    	this.shape = shape;
    }

    /**
     * @see ring.gui.vis2.Visel#buildShape()
     */
    public void buildShape() {
        /*shape = new QuadCurve2D.Double(
                getX(),getY(),ctrlX,ctrlY,getX2(),getY2()
        );*/
    }

    /**
     * @see ring.gui.vis2.Visel#paintVisel(java.awt.Graphics2D)
     */
    public void paintVisel(Graphics2D g2) {
    	g2.setColor(color);
        g2.draw(shape);
    }
    
    /**
     * @see ring.gui.vis2.Visel#contains(double, double)
     */
	public boolean contains(double x, double y) {
		if (shape instanceof QuadCurve2D) {
			QuadCurve2D curve = (QuadCurve2D) shape;
			
			return (
				Line2D.ptLineDist(
					curve.getX1(),
					curve.getY1(),
					curve.getCtrlX(),
					curve.getCtrlY(),
					x,
					y
				) < 5 || Line2D.ptLineDist(
					curve.getX2(),
					curve.getY2(),
					curve.getCtrlX(),
					curve.getCtrlY(),
					x,
					y
				) < 5
			);
		}
		return shape.contains(new Point2D.Double(x,y));
	}
}
