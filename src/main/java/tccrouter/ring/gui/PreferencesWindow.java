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
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Hashtable;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;

import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

import tccrouter.ring.controller.PreferencesController;
import tccrouter.ring.prefs.XMLPreferences;

/**
 * A container window for user preferences interaction.
 */
public class PreferencesWindow extends JDialog {
	
	private static PreferencesWindow instance;
	
	/**
	 * The user interface list to show the preferences categories.
	 */
	JList categoriesList;
	/**
	 * The root in the preferences tree.
	 */
	XMLPreferences rootPrefs;
	/**
	 * The input fields in the GUI to show the preferences values,
	 * identified by the value names.
	 */
	Hashtable valuePanels;
	/**
	 * The panels for each category, identified by the category names.
	 */
	Hashtable categoryPanels;
	/**
	 * The center panel of the window.
	 */
	JPanel centerPanel;
	
	/**
	 * Creates an instance of this window and populates the categories
	 * list with the preferences nodes in the PreferencesController's tree's
	 * root node.
	 */
	protected PreferencesWindow() {
		this.setBounds(200,150,400,300);
		this.setTitle("Preferences");
		
		valuePanels = new Hashtable();
		categoryPanels = new Hashtable();
		rootPrefs = PreferencesController.getInstance().getRoot();
		centerPanel = new JPanel();
		categoriesList = buildCategories();
		
		JButton okButton = new JButton(new AbstractAction("OK") {
			public void actionPerformed(ActionEvent evt) {
				try {
					String[] categories = rootPrefs.childrenNames();
					
					for (int i=0 ; i<categories.length ; i++) {
						Preferences categoryNode = rootPrefs.node(categories[i]);
						
						String[] children = categoryNode.childrenNames();
						for (int j=0 ; j<children.length ; j++) {
							XMLPreferences childNode = (XMLPreferences)categoryNode.node(children[j]);
							JPanel childPanel = (JPanel) valuePanels.get(children[j]);
							
							String type = childNode.get(
								PreferencesController.TYPE,
								PreferencesController.TYPE_STRING
							);
							
							if (type.equals(PreferencesController.TYPE_BOOLEAN)) {
								JCheckBox check = (JCheckBox) childPanel.getComponent(1);
								
								PreferencesController.getInstance().putBoolean(
									categoryNode.name(),
									childNode.name(),
									check.isSelected()
								);
							}
							else if (type.equals(PreferencesController.TYPE_STRING)) {
								JTextField field = (JTextField) childPanel.getComponent(1);
								
								PreferencesController.getInstance().put(
									categoryNode.name(),
									childNode.name(),
									field.getText()
								);
							}
							else if (type.equals(PreferencesController.TYPE_INT)) {
								JTextField field = (JTextField) childPanel.getComponent(1);
								
								PreferencesController.getInstance().putInt(
									categoryNode.name(),
									childNode.name(),
									Integer.parseInt(field.getText())
								);
							}
							else if (type.equals(PreferencesController.TYPE_DOUBLE)) {
								JTextField field = (JTextField) childPanel.getComponent(1);
								
								PreferencesController.getInstance().putDouble(
									categoryNode.name(),
									childNode.name(),
									Double.parseDouble(field.getText())
								);
							}
							else if (type.equals(PreferencesController.TYPE_COLOR)) {
								JPanel previewPanel = (JPanel)childPanel.getComponent(1);
								
								PreferencesController.getInstance().putColor(
									categoryNode.name(),
									childNode.name(),
									previewPanel.getBackground()
								);
							}
						}
					}
					
					setVisible(false);
				}
				catch(BackingStoreException exc) {
					exc.printStackTrace();
				}
				catch(NumberFormatException exc) {
					JOptionPane.showMessageDialog(
						null,
						"One or more integer or double values are incorrect - check the number formats",
						"Incorrect number format",
						JOptionPane.ERROR_MESSAGE
					);
				}
			}
		});
		
		JButton cancelButton = new JButton(new AbstractAction("Cancel") {
			public void actionPerformed(ActionEvent evt) {
				
				
				setVisible(false);
			}
		});
		
		JPanel listPanel = new JPanel();
		JScrollPane listScroll = new JScrollPane(categoriesList);
		listPanel.add(listScroll);
		listPanel.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
		
		JPanel okCancelPanel = new JPanel(new FlowLayout());
		okCancelPanel.add(okButton);
		okCancelPanel.add(cancelButton);
		
		JPanel southPanel = new JPanel(new BorderLayout());
		southPanel.add(okCancelPanel,BorderLayout.EAST);
		
		JPanel west = new JPanel(new FlowLayout());
		west.add(listPanel);
		
		JScrollPane centerScroll = new JScrollPane(centerPanel);
				
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(west,BorderLayout.WEST);
		getContentPane().add(centerScroll,BorderLayout.CENTER);
		getContentPane().add(southPanel,BorderLayout.SOUTH);
	}
	
	/**
	 * Builds the GUI list for showing categories.
	 * @param categoriesList the categories in the preferences tree
	 */
	private JList buildCategories() {
		final JList list = new JList();
		
		list.setPreferredSize(new Dimension(100,100));
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent evt) {
				showPanelForCategory((String)list.getSelectedValue());
			}

			public void mouseEntered(MouseEvent evt) {}
			public void mouseExited(MouseEvent evt) {}
			public void mousePressed(MouseEvent evt) {}
			public void mouseReleased(MouseEvent evt) {}
			
		});
		
		try {
			String[] categories = rootPrefs.childrenNames();
			
			// build the categories list
			list.setListData(categories);
			
			// build the panels for each category
			buildPanels(categories);
		}
		catch(BackingStoreException exc) {
			exc.printStackTrace();
		}
		
		return list;
	}

	/**
	 * Shows in the GUI the panel for the category selected on the
	 * categories list.
	 * @param categoryName the name of the category whose panel's will be shown
	 */
	protected void showPanelForCategory(String categoryName) {
		// remove the previous category panel from the GUI
		if (centerPanel.getComponentCount() > 0) 
			centerPanel.removeAll();
		
		centerPanel.add((JPanel)categoryPanels.get(categoryName));
		
		getContentPane().paintComponents(getContentPane().getGraphics());
		getContentPane().repaint();
	}

	/**
	 * Builds the input panels for each category.
	 * @param categories the list of categories to build panels from
	 */
	private void buildPanels(String[] categories) {
		try {
			for (int i=0 ; i<categories.length ; i++) {
				String[] children = rootPrefs.node(categories[i]).childrenNames();
				JPanel categoryPanel = new JPanel(
					new GridLayout(
						children.length,
						1,
						20,
						20
					)
				);
				
				for (int j=0 ; j<children.length ; j++) {
					XMLPreferences node = (XMLPreferences) rootPrefs.node(
						categories[i] + "/" + children[j]
					);
					
					JPanel fieldPanel = buildPanelForType(node);
					valuePanels.put(children[j],fieldPanel);
					
					categoryPanel.add(fieldPanel);
				}
				
				// puts the panel into the panels hashtable
				categoryPanels.put(categories[i],categoryPanel);
			}
		}
		catch (BackingStoreException exc) {
			exc.printStackTrace();
		}
	}

	/**
	 * Builds a panel that will allow input of a preferences value.
	 * String, int, color and double values are shown as a text field, and
	 * boolean values are shown as a checkbox.
	 * @param node the node whose value will be represented
	 * @return the panel created for the given node
	 */
	private JPanel buildPanelForType(final XMLPreferences node) {
		String type = node.get(
			PreferencesController.TYPE,
			PreferencesController.TYPE_STRING
		);
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
		panel.add(new JLabel(node.name()));
		
		if (type.equals(PreferencesController.TYPE_BOOLEAN)) {
			JCheckBox check = new JCheckBox();
			check.setSelected(
				PreferencesController.getInstance().getBoolean(
					node.parent().name(),
					node.name(),
					true
				)
			);
			
			panel.add(check);
		}
		else if (type.equals(PreferencesController.TYPE_STRING)) {
			JTextField field = new JTextField();
			field.setText(
				PreferencesController.getInstance().get(
					node.parent().name(),
					node.name(),
					""
				)
			);

			panel.add(field);			
		}
		else if (type.equals(PreferencesController.TYPE_INT)) {
			JTextField field = new JTextField();
			field.setText(
				"" +
				PreferencesController.getInstance().getInt(
					node.parent().name(),
					node.name(),
					0
				)
			);

			panel.add(field);
		}
		else if (type.equals(PreferencesController.TYPE_DOUBLE)) {
			JTextField field = new JTextField();
			field.setText(
				"" +
				PreferencesController.getInstance().getDouble(
					node.parent().name(),
					node.name(),
					0
				)
			);

			panel.add(field);
		}
		else if (type.equals(PreferencesController.TYPE_COLOR)) {
			final JPanel previewPanel = new JPanel();
			previewPanel.setMaximumSize(new Dimension(100,40));
			//previewPanel.setPreferredSize(new Dimension(40,40));
			//previewPanel.setBorder(BorderFactory.createTitledBorder("Preview"));
			previewPanel.setBackground(
				PreferencesController.getInstance().getColor(
					node.parent().name(),
					node.name(),
					Color.BLUE
				)
			);
			
			JButton colorButton = new JButton(new AbstractAction("Choose...") {
				public void actionPerformed(ActionEvent evt) {
					Color c = JColorChooser.showDialog(
						null,
						"Choose a color",
						PreferencesController.getInstance().getColor(
							node.parent().name(),
							node.name(),
							Color.BLUE
						)
					);
					
					if (c != null)
						previewPanel.setBackground(c);
				}
			});
			
			panel.add(previewPanel);
			panel.add(colorButton);
		}
		
		return panel;
	}

	/**
	 * Retrieves the unique instance to this class.
	 * @return the unique instance to this class
	 */
	public static PreferencesWindow getInstance() {
		if(instance == null) instance = new PreferencesWindow();
		
		return instance;
	}
}
