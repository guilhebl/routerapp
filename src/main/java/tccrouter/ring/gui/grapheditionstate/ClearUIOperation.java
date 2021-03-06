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
package tccrouter.ring.gui.grapheditionstate;

import java.awt.Toolkit;

import javax.swing.ImageIcon;

import tccrouter.ring.gui.UIFacade;
import tccrouter.ring.gui.context.UIOperation;
import tccrouter.ring.gui.context.UIState;

/**
 *
 */
public class ClearUIOperation extends UIOperation {

	/**
	 * @param state
	 * @param type
	 */
	public ClearUIOperation(UIState state, boolean enabled) {
		super(state, UIOperation.ACTION_TYPE,enabled,false);
	}

	/**
	 * @see ring.gui.context.UIOperation#execute()
	 */
	public void execute() {
		GraphEditionUIState editionState = (GraphEditionUIState) state;
		
		UIFacade.getInstance().setActiveGraphToUserPreferences();
		editionState.repaintWorkspace();
	}

	/**
	 * @see ring.gui.context.UIOperation#getName()
	 */
	public String getName() {
		return null;
	}

	/**
	 * @see ring.gui.context.UIOperation#getIcon()
	 */
	public ImageIcon getIcon() {
		return new ImageIcon(Toolkit.getDefaultToolkit().createImage(getClass().getClassLoader().getResource("images/Clear.gif")));
	}

}
