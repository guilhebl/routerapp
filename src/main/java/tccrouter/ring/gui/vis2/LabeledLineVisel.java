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

/**
 * 
 */
public class LabeledLineVisel extends LineVisel {

	/**
	 * 
	 */
	String label;
	
	/**
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @param color
	 * @param location
	 */
	public LabeledLineVisel(double x1, double y1, double x2, double y2,
			Color color, int location, String label) {
		super(x1, y1, x2, y2, color, location);
		
		this.label = label;
	}

	public void paintVisel(Graphics2D g2) {
		super.paintVisel(g2);
		double labelX = (x+x2)/2,
			   labelY = (y+y2)/2;
	
		g2.drawChars(label.toCharArray(),0,label.length(),(int)labelX,(int)(labelY+20));
	}
}
