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
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JPanel;

/**
 *
 */
public abstract class ViselPane extends JPanel {

	/**
	 * 
	 */
	private HashMap viselMap;
	/**
	 * 
	 */
	private ArrayList backVisels;
	/**
	 * 
	 */
	private ArrayList frontVisels;
	/**
	 * 
	 */
	private boolean antialiased;
	
	/**
	 * 
	 */
	public ViselPane(boolean antialiased) {
		viselMap    = new HashMap();
		backVisels  = new ArrayList();
		frontVisels = new ArrayList();
		
		this.antialiased = antialiased;
	}
	
	/**
	 * 
	 * @param visel
	 * @param obj
	 */
	public void addVisel(Visel visel, Object obj) {
		viselMap.put(visel,obj);
		
		if (visel.getLocation() == Visel.LOCATION_BACK)
			backVisels.add(visel);
		else if (visel.getLocation() == Visel.LOCATION_FRONT)
			frontVisels.add(visel);
	}
	
	/**
	 * 
	 */
	public void clear() {
		viselMap.clear();
		backVisels.clear();
		frontVisels.clear();
	}
	
	/**
	 * 
	 * @param visel
	 */
	public void removeVisel(Visel visel) {
		viselMap.remove(visel);
		
		if (visel.getLocation() == Visel.LOCATION_BACK)
			backVisels.remove(visel);
		else
			frontVisels.remove(visel);
	}
	
	/**
	 * 
	 * @param visel
	 * @return
	 */
	public Object getObjectByVisel(Visel visel) {
		return viselMap.get(visel);
	}
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public Visel getViselAt(double x, double y) {
		for(int i=0 ; i<frontVisels.size() ; i++) {
			Visel visel = (Visel) frontVisels.get(i);
			
			if (visel.contains(x,y))
				return visel;
		}
		
		for (int i=0 ; i<backVisels.size() ; i++) {
			Visel visel = (Visel) backVisels.get(i);
			
			if (visel.contains(x,y))
				return visel;
		}
		return null;
	}

	/**
	 * @return Returns the antialiased.
	 */
	public boolean isAntialiased() {
		return antialiased;
	}
	
	/**
	 * @param antialiased The antialiased to set.
	 */
	public void setAntialiased(boolean antialiased) {
		this.antialiased = antialiased;
	}

	/**
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		paintBackground(g);
		Graphics2D g2 = (Graphics2D) g;
		
		if (antialiased) {
			g2.setRenderingHint(
					RenderingHints.KEY_ANTIALIASING,
					RenderingHints.VALUE_ANTIALIAS_ON
			);
		}
		
		// draw back visels
		for (int i=0 ; i<backVisels.size() ; i++) {
			((Visel) backVisels.get(i)).paintVisel(g2);
		}
		
		// draw front visels
		for (int i=0 ; i<frontVisels.size() ; i++) {
			((Visel) frontVisels.get(i)).paintVisel(g2);
		}
	}
	
	/**
	 * @param g
	 */
	private void paintBackground(Graphics g) {
		int line = 5;
		
		g.setColor(Color.WHITE);
		g.fillRect(0,0,getWidth(),getHeight());
		
		g.setColor(new Color(245,245,245));
		for (int i=0 ; i<getHeight() ; i+=2) {
			g.fillRect(0,i*line,getWidth(),line);
		}
	}

	/**
	 * 
	 *
	 */
	public abstract void refresh();
}
