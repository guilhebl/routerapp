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
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;

import javax.swing.AbstractAction;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import tccrouter.diamante.core.graph.GraphComponent;
import tccrouter.diamante.extension.command.InteractivePropertyChangeCommand;
import tccrouter.diamante.extension.command.PropertyChangeSetCommand;
import tccrouter.ring.controller.DiamanteFacade;

/**
 * A window that allows viewing and editing the properties of a graph component.
 */
class PropertyInteractionWindow extends JDialog {
	
	/**
	 * The graph component whose properties are being shown.
	 */
	GraphComponent component;
	
	/**
	 * The table that will show the component's properties.
	 */
	JTable propertiesTable;
	/**
	 * The table model used by the properties table.
	 */
	PropertyTableModel tableModel;
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

	private JTextField editableField;
	
	/**
	 * Creates an instance of this instance.
	 * @param posX the x coordinate of the position where the window will be shown
	 * @param posY the y coordinate of the position where the window will be shown
	 * @param component the component whose properties are shown by this window
	 */
	public PropertyInteractionWindow(int posX,int posY,GraphComponent component) {
		this.setBounds(posX,posY,200,200);
		this.setTitle("Property interaction");
		this.setResizable(false);
		this.setModal(true);
		
		tableModel = new PropertyTableModel(component.getProperties());
		propertiesTable = new JTable(tableModel);
		prepareTableEdition(propertiesTable);
		this.component = component;
		
		okButton = new JButton(new AbstractAction("OK") {
            public void actionPerformed(ActionEvent evt) {
				PropertyChangeSetCommand changeCommand = new PropertyChangeSetCommand(uiFacade.getGraph());
				
				tableModel.fireTableCellUpdated(
					propertiesTable.getSelectedColumn(),
					propertiesTable.getSelectedRow()
				);
				
				for (int i=0 ; i<tableModel.getRowCount() ; i++) {
					changeCommand.addChangeCommand(
						new InteractivePropertyChangeCommand(
							uiFacade.getGraph(),
							tableModel.getPropertyAtRow(i),
							getComponent(),
							tableModel.getValueAt(i,1).toString()
						)
					);
				}
				
				DiamanteFacade.getInstance().executeCommand(changeCommand);
				setVisible(false);
				uiFacade.refreshViews();
			}
		});
		
		cancelButton = new JButton(new AbstractAction("Cancel") {
			public void actionPerformed(ActionEvent evt) {
				setVisible(false);
			}
		});
		
		// center panel
		JPanel centerPanel = new JPanel(new BorderLayout());
		JScrollPane tablePanel = new JScrollPane(propertiesTable);
		centerPanel.add(tablePanel,BorderLayout.CENTER);
		
		// south panel
		JPanel southPanel = new JPanel(new BorderLayout());
		JPanel okCancelPanel = new JPanel(new FlowLayout());
		okCancelPanel.add(okButton);
		okCancelPanel.add(cancelButton);
		southPanel.add(okCancelPanel,BorderLayout.EAST);
		
		// add panels to the dialog window
		this.getContentPane().setLayout(new BorderLayout());
		this.getContentPane().add(centerPanel,BorderLayout.CENTER);
		this.getContentPane().add(southPanel,BorderLayout.SOUTH);
	}
	
	/**
	 * 
	 */
	private void prepareTableEdition(JTable table) {
		editableField = new JTextField();
		DefaultCellEditor cellEditor = new DefaultCellEditor(editableField);
		cellEditor.setClickCountToStart(1);
		table.setCellEditor(cellEditor);
		table.setEnabled(true);
	}

	/**
	 * @return Returns the component.
	 */
	protected GraphComponent getComponent() {
		return component;
	}
	
	/**
	 * @see java.awt.event.FocusListener#focusGained(java.awt.event.FocusEvent)
	 */
	public void focusGained(FocusEvent e) {
		if (e.getSource() == editableField) {
			String text = editableField.getText();
			
			editableField.setSelectionStart(0);
			editableField.setSelectionEnd(text.length());
		}
	}

	/**
	 * @see java.awt.event.FocusListener#focusLost(java.awt.event.FocusEvent)
	 */
	public void focusLost(FocusEvent e) {
	}
}
