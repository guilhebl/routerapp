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
package tccrouter.user.layouts;

import tccrouter.diamante.core.graph.Graph;
import tccrouter.diamante.core.graph.layout.GraphLayout;
import tccrouter.diamante.core.graph.property.ComponentProperties;
import tccrouter.diamante.extension.graph.property.Position;
import tccrouter.ring.gui.graphdrawing.GraphWorkspace;
/**
 * Implements a layout that will set the nodes in the border of a circle.
 * The width and height of the graph are defined as a percentage of the
 * graph panel's width and height, and those parameters are specified in
 * order to make this layout work.
 */
public class CircleLayout extends GraphLayout {

	/**
	 * The width of the area in which the graph is drawn.
	 */
	int width;
	/**
	 * The height of the area in which the graph is drawn.
	 */
	int height;
	
	/**
	 * Creates an instance of this class and sets the panel's
	 * width and height.
	 */
	public CircleLayout(Graph g) {
		super(g,"Circle Layout");
		
		this.width  = 0;
		this.height = 0;
	}

	/**
	 * Performs the circle layout. The graph radius is defined as 30%
	 * of the minimum between the panel width and height; the center of
	 * the graph is placed at the center of the screen. The distance
	 * in angles between the nodes is calculated by a division of the
	 * 360� of a circle by the number of nodes.
	 * @see diamante.core.graph.layout.GraphLayout#doLayout()
	 */
	public void doLayout(Object obj) {
		GraphWorkspace ws = (GraphWorkspace)obj;
		width = ws.getWidth();
		height = ws.getHeight();
		double distanceAngle = 360 / g.getN(),
			   centerX = width/2,
			   centerY = height/2;
		
		// radius is 30� of the least of width and height
		int radius = ((int)(Math.min(width,height)*0.3));
		
		for (int i=0 ; i<g.getN() ; i++) {
			ComponentProperties properties = g.getNode(i).getProperties();
			Position p = (Position) properties.getPropertyByName("Position");
			
			double theta = i * distanceAngle;
			
			p.setX(centerX + (radius * Math.cos(Math.toRadians(theta))));
			p.setY(centerY + (radius * Math.sin(Math.toRadians(theta))));
		}
	}
}