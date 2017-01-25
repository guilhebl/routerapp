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
package tccrouter.ring.gui.graphdrawing;

import java.awt.geom.Arc2D;
import java.awt.geom.QuadCurve2D;
import java.util.ArrayList;

/**
 * 
 */
public class SimpleEdgePainter extends EdgePainter {

	/**
	 * Creates an instance of this class.
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 */
	public SimpleEdgePainter(double x1, double y1, double x2, double y2) {
		super(x1, y1, x2, y2);
	}

	/**
	 * @see ring.gui.graphdrawing.EdgePainter#drawEdge(java.awt.Graphics2D, double)
	 */
	public ArrayList drawEdge(double curvature) {
		double d   = Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2)),
		   sin = (y2 - y1) / d,
		   cos = (x2 - x1) / d,
		   xc  = ((x2 + x1) / 2) - curvature * d * sin,
		   yc  = ((y2 + y1) / 2) - curvature * d * cos;
			
		
		if (x1 == x2 && y1 == y2) {
			curvature = 0.9;
			xc = x1 + 100;
			yc = y1 + 100;
			
			ArrayList curves = new ArrayList();
			Arc2D curve = new Arc2D.Double(
					x1 - 10,
					y1 - 35,
					20,
					40,
					-30,
					270,
					Arc2D.OPEN
			);
			
			curves.add(curve);
			return curves;
		}
		
		ArrayList curves = new ArrayList();
		QuadCurve2D curve = new QuadCurve2D.Double(
				x1,
				y1,
				xc,
				yc,
				x2,
				y2
		);
		
		curves.add(curve);
		return curves;
	}

}
