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

public class LineLayout extends GraphLayout {

	int width;
	int height;
	
	public LineLayout(Graph g) {
		super(g,"Line Layout");
		
		this.width  = 0;
		this.height = 0;
	}

	public void doLayout(Object obj) {
		GraphWorkspace ws = (GraphWorkspace)obj;
		width = ws.getWidth();
		height = ws.getHeight();
		double ini = 25;
		
		// radius is 30� of the least of width and height
		int radius = ((int)(Math.min(width,height)*0.3));
		
		for (int i=0 ; i<g.getN() ; i++) {
			ComponentProperties properties = g.getNode(i).getProperties();
			Position p = (Position) properties.getPropertyByName("Position");
			
			double theta = ini * (i+1);
			
			p.setX(theta);
			p.setY(theta);
		}
	}
}