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
package tccrouter.ring.gui.context;

import javax.swing.ImageIcon;

/**
 *
 */
public abstract class UIOperation {
	
	/**
	 * 
	 */
	public final static int MODE_SELECTION_TYPE = 1;
	/**
	 * 
	 */
	public final static int ACTION_TYPE	= 2;
	/**
	 * 
	 */
	protected UIState state;
	/**
	 * 
	 */
	int type;
	/**
	 * 
	 */
	private boolean enabled;
	/**
	 * 
	 */
	private boolean selected;
	
	/**
	 * 
	 * @param state
	 */
	public UIOperation(UIState state, int type, boolean enabled, boolean selected) {
		this.state = state;
		this.type = type;
		this.enabled = enabled;
		this.selected = selected;
	}
	
	/**
	 * 
	 * @param state
	 */
	public void setState(UIState state) {
		this.state = state;
	}
	
	/**
	 * 
	 */
	public abstract void execute();
	
	/**
	 * 
	 * @return
	 */
	public abstract String getName();
	
	/**
	 * 
	 * @return
	 */
	public abstract ImageIcon getIcon();
	
	/**
	 * @return Returns the type.
	 */
	public int getType() {
		return type;
	}
	
	/**
	 * @return Returns the enabled.
	 */
	public boolean isEnabled() {
		return enabled;
	}
	
	/**
	 * @param enabled The enabled to set.
	 */
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	/**
	 * @return Returns the selected.
	 */
	public boolean isSelected() {
		return selected;
	}
	
	/**
	 * @param selected The selected to set.
	 */
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
}