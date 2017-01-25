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
package tccrouter.ring.gui;

import java.awt.event.ActionEvent;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;

import tccrouter.ring.gui.context.UIOperation;

/**
 *
 */
public class OperationsToolBar extends JToolBar {
	
	/**
	 * 
	 */
	UIOperation[] operations;
	/**
	 * 
	 */
	HashMap toggleButtons;
	/**
	 * 
	 */
	HashMap actionButtons;
	
	/**
	 * 
	 * @param operations
	 */
	public OperationsToolBar(UIOperation[] operations) {
		this.operations = operations;
		
		createButtons();
	}

	/**
	 * 
	 */
	private void createButtons() {
		toggleButtons = new HashMap();
		actionButtons = new HashMap();
		
		for (int i=0 ; i<operations.length ; i++) {
			if (operations[i].getType() == UIOperation.MODE_SELECTION_TYPE) {
				final UIOperation op = operations[i];
				
				JToggleButton button = new JToggleButton(
						new AbstractAction(operations[i].getName(),operations[i].getIcon()) {

							public void actionPerformed(ActionEvent e) {
								toggleSelection(op);
								
								op.execute();
								
								refreshToolbar();
							}
							
						}
				);
				
				button.setSelected(op.isSelected());
				button.setEnabled(op.isEnabled());
				toggleButtons.put(op,button);
				add(button);
			}
			else if (operations[i].getType() == UIOperation.ACTION_TYPE) {
				final UIOperation op = operations[i];
				
				JButton button = new JButton(
						new AbstractAction(operations[i].getName(),operations[i].getIcon()) {

							public void actionPerformed(ActionEvent e) {
								op.execute();
								
								refreshToolbar();
							}
							
						}
				);
				
				button.setEnabled(op.isEnabled());
				actionButtons.put(op,button);
			}
		}
		
		addSeparator();
		for (int i=0 ; i<operations.length ; i++) {
			JButton button = (JButton) actionButtons.get(operations[i]);
			
			if (button != null)
				add(button);
		}
	}

	/**
	 * 
	 */
	protected void refreshToolbar() {
		for (int i=0 ; i<operations.length ; i++) {
			if (operations[i].getType() == UIOperation.ACTION_TYPE) {
				JButton button = (JButton) actionButtons.get(operations[i]);
				button.setEnabled(operations[i].isEnabled());
			}
			/*else if (operations[i].getType() == UIOperation.MODE_SELECTION_TYPE) {
				JToggleButton button = (JToggleButton) toggleButtons.get(operations[i]);
				button.setEnabled(operations[i].isEnabled());
				button.setSelected(operations[i].isSelected());
			}*/
		}
	}

	/**
	 * @param action
	 */
	protected void toggleSelection(UIOperation op) {
		Iterator i = toggleButtons.values().iterator();
		
		while (i.hasNext()) {
			JToggleButton button = (JToggleButton) i.next();
			
			button.setSelected(false);
			op.setSelected(false);
		}
		
		JToggleButton opButton = (JToggleButton) toggleButtons.get(op);
		opButton.setSelected(true);
		op.setSelected(true);
	}
}
