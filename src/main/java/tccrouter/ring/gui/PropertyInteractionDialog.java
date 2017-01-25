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

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import tccrouter.diamante.core.graph.Graph;
import tccrouter.diamante.core.graph.GraphComponent;
import tccrouter.diamante.extension.command.InteractivePropertyChangeCommand;
import tccrouter.diamante.extension.command.PropertyChangeSetCommand;
import tccrouter.diamante.extension.graph.property.InteractiveProperty;
import tccrouter.ring.controller.DiamanteFacade;

/**
 * A window that allows viewing and editing the properties of a graph component.
 */
class PropertyInteractionDialog extends JDialog {
	
	/**
	 * 
	 */
	private static final int CELL_HEIGHT = 70;
	
	/**
	 * 
	 */
	Graph graph;
	/**
	 * 
	 */
	HashMap fields;
	/**
	 * The graph component whose properties are being shown.
	 */
	GraphComponent component;
	/**
	 * A button that will confirm the user-made changes.
	 */
	JButton okButton;
	/**
	 * A button that will cancel the user-made changes.
	 */
	JButton cancelButton;
	/**
	 * 
	 */
	private UIFacade uiFacade = UIFacade.getInstance();
	/**
	 * 
	 */
	private DiamanteFacade diamanteFacade = DiamanteFacade.getInstance();
	/**
	 * 
	 */
	private Action OK_ACTION = new AbstractAction("OK") {
        public void actionPerformed(ActionEvent evt) {
			applyChanges();
		}
	};
	/**
	 * 
	 */
	private Action CANCEL_ACTION = new AbstractAction("Cancel") {
		public void actionPerformed(ActionEvent evt) {
			cancelChanges();
		}
	};
	/**
	 * 
	 */
	
	/**
	 * Creates an instance of this instance.
	 * @param posX the x coordinate of the position where the window will be shown
	 * @param posY the y coordinate of the position where the window will be shown
	 * @param component the component whose properties are shown by this window
	 */
	public PropertyInteractionDialog(int posX,int posY, Graph graph, GraphComponent component) {
		this.setBounds(posX,posY,200,200);
		this.setTitle("Property interaction");
		this.setResizable(false);
		this.setModal(true);
		
		fields = new HashMap();
		this.graph = graph;
		this.component = component;
		
		
		okButton = new JButton(OK_ACTION);
		cancelButton = new JButton(CANCEL_ACTION);
		
		// center panel
		JPanel centerPanel = new JPanel(new BorderLayout());
		//JScrollPane tablePanel = new JScrollPane(propertiesTable);
		//centerPanel.add(tablePanel,BorderLayout.CENTER);
		
		// south panel
		JPanel southPanel = new JPanel(new BorderLayout());
		JPanel okCancelPanel = new JPanel(new FlowLayout());
		okCancelPanel.add(okButton);
		okCancelPanel.add(cancelButton);
		southPanel.add(okCancelPanel,BorderLayout.EAST);
		
		// add panels to the dialog window
		getContentPane().setLayout(new BorderLayout());
		//this.getContentPane().add(centerPanel,BorderLayout.CENTER);
		getContentPane().add(southPanel,BorderLayout.SOUTH);
		buildFields();
	}
	
	/**
	 * 
	 */
	private void buildFields() {
		Vector properties = component.getProperties().getAllProperties();
		GridLayout layout = new GridLayout(properties.size(),2,10,10);
		int cells = 0;
		
		Iterator i = properties.iterator();
		JPanel fieldsPane = new JPanel(layout);
		fieldsPane.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		
		while (i.hasNext()) {
			try {
				InteractiveProperty property = (InteractiveProperty) i.next();
				
				final JTextField field = new JTextField(property.toString());
				field.addKeyListener(new KeyAdapter() {
					public void keyReleased(KeyEvent e) {
						if (e.getKeyCode() == KeyEvent.VK_ENTER) {
							applyChanges();
						}
						else if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
							cancelChanges();
						}
					}
				});
				field.addFocusListener(new FocusAdapter() {
					
					public void focusGained(FocusEvent evt) {
						String text = field.getText();
						field.setSelectionStart(0);
						field.setSelectionEnd(text.length());
					}
				});
				field.setMaximumSize(new Dimension(150,30));
				fields.put(property,field);
				
				fieldsPane.add(new JLabel(property.getName()));
				fieldsPane.add(field);
				
				cells++;
			} catch (ClassCastException exc) {
				/* 
				 * caught to be ignored, so that non-interactive properties
				 * won't be shown in the GUI
				 */
			}
		}
		this.setSize(200,cells * CELL_HEIGHT);
		getContentPane().add(fieldsPane,BorderLayout.CENTER);
	}

	/**
	 * @return Returns the component.
	 */
	protected GraphComponent getComponent() {
		return component;
	}

	/**
	 * 
	 */
	private void applyChanges() {
		PropertyChangeSetCommand changeCommand = new PropertyChangeSetCommand(uiFacade.getGraph());
		Vector properties = component.getProperties().getAllProperties();
		
		Iterator i = properties.iterator();
		while (i.hasNext()) {
			try {
				InteractiveProperty prop = (InteractiveProperty) i.next();
				
				changeCommand.addChangeCommand(
					new InteractivePropertyChangeCommand(
						graph,
						prop,
						getComponent(),
						((JTextField) fields.get(prop)).getText()
					)
				);
			} catch (ClassCastException exc) {
				/* 
				 * caught to be ignored, so that non-interactive properties
				 * won't be shown in the GUI
				 */
			}
		}
		
		diamanteFacade.executeCommand(changeCommand);
		setVisible(false);
		uiFacade.refreshViews();
	}

	/**
	 * 
	 */
	private void cancelChanges() {
		setVisible(false);
	}

}
