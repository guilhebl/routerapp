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

import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import tccrouter.ring.gui.vis2.ViselPane;

/**
 * 
 */
public class LineHighlightEffect implements ActionListener {

	/**
	 * 
	 */
	private Shape shape;
	/**
	 * 
	 */
	private int length;
	/**
	 * 
	 */
	private int duration;
	/**
	 * 
	 */
	private float initialLineWidth;
	/**
	 * 
	 */
	private float currentLineWidth;
	/**
	 * 
	 */
	private BasicStroke stroke;
	/**
	 * 
	 */
	private Graphics2D graphics;
	/**
	 * 
	 */
	private Timer timer;
	/**
	 * 
	 */
	private ViselPane viselPane;
	/**
	 * 
	 */
	private boolean continuous;
	
	/**
	 * 
	 */
	public LineHighlightEffect(Shape shape, Graphics2D graphics,
			int length, ViselPane viselPane, boolean continuous) {
		this.shape = shape;
		this.length = length;
		this.graphics = graphics;
		this.viselPane = viselPane;
		this.continuous = continuous;
		
		timer = new Timer(length/10, this);
		duration = 0;
		stroke = (BasicStroke) graphics.getStroke();
		currentLineWidth =
			initialLineWidth = stroke.getLineWidth();
		
	}
	
	/**
	 * 
	 */
	public void startEffect() {
		timer.start();
	}
	
	/**
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == timer) {
			if (duration < length) {
				currentLineWidth++;

				if (continuous) {
					stroke = new BasicStroke(currentLineWidth);
					Shape strokeShape = stroke.createStrokedShape(shape);
					graphics.draw(strokeShape);
					graphics.fill(strokeShape);
				}
				else {
					float[] dashPattern = { 10, 10, 10, 10 };
				    graphics.setStroke(new BasicStroke(1, BasicStroke.CAP_BUTT,
				                                  BasicStroke.JOIN_MITER, 10,
				                                  dashPattern, 0));
				    viselPane.repaint();
				    stroke = new BasicStroke(currentLineWidth);
					Shape strokeShape = stroke.createStrokedShape(shape);
					graphics.draw(strokeShape);
				}
				
				duration += length / 10;
			}
			else {
				endEffect();
			}
		}
	}

	/**
	 * 
	 */
	private void endEffect() {
		timer.stop();
		viselPane.refresh();
	}
}
