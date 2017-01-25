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
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.util.Hashtable;
import java.util.Vector;

import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

import tccrouter.ring.controller.ProfileController;

/**
 * The window that allows the user to manage a menu while the program is
 * being executed.
 */
class MenuManagementWindow extends JDialog {
	
	/**
	 * String that represents a menu separator in the items list.
	 */
	static final String SEPARATOR_STRING = "___________________";

	/**
	 * A reference to the menu to be managed by this window.
	 */
	JMenu managedMenu;
	/**
	 * A look-up table to allow updating the menu accordingly to the user-made changes
	 * on the GUI.
	 */
	Hashtable menuItems;
	/**
	 * Indicates to the caller of this window that the editable area of the menu
	 * is empty.
	 */
	boolean emptyMenu;
	/**
	 * The starting point in the editable area of the menu.
	 */
	int offset;
	/**
	 * The ending point in the editable area of the menu.
	 */
	int limit;
	/**
	 * The list data that will be manipulated by the user.
	 */
	Vector listData;
	/**
	 * The list data composed of items removed from the original menu.
	 */
	Vector removedItems;
	/**
	 * Array to keep the elements before the user-editable offset.
	 */
	Component [] elementsBefore;
	/**
	 * Array to keep the elements after the user-editable limit.
	 */
	Component [] elementsAfter;
	
	/**
	 * A list to show the menu items in the editable area of the menu.
	 */
	JList itemsList;
	/**
	 * A list to show the menu items that have been removed from the original menu.
	 */
	JList removedItemsList;
	/**
	 * A button to confirm the changes made in the original menu.
	 */
	JButton okButton;
	/**
	 * A button to cancel the changes made in the original menu.
	 */
	JButton cancelButton;
	/**
	 * A button to remove an item from the original menu.
	 */
	JButton removeItemButton;
	/**
	 * A button to retrieve a removed item back to the original menu.
	 */
	JButton retrieveButton;
	/**
	 * A button to add a separator to the menu.
	 */
	JButton insertSeparatorButton;
	/**
	 * A button to remove a separator from the menu.
	 */
	JButton removeSeparatorButton;
	
	/**
	 * Creates an instance of this class.
	 * @param menu the menu that will be edited by the user
	 * @param indexOffset the offset of the editable area
	 * @param indexLimit the limit of the editable area
	 */
	public MenuManagementWindow(JMenu menu,int indexOffset,int indexLimit) {
		this.setBounds(250,200,400,300);
		this.setTitle("Menu management");
		this.setResizable(false);
		this.setModal(true);
		
		this.managedMenu = menu;
		this.emptyMenu   = false;
		this.offset = indexOffset;
		this.limit  = indexLimit;
		
		itemsList = buildListFromComponents(
			trimComponentsByOffsets(menu.getMenuComponents(),offset,limit)
		);
		removedItemsList = new JList();
		removedItemsList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		removedItemsList.setListData(removedItems = new Vector());
		removedItemsList.setSize(100,200);
		
		buildButtons();
		
		JPanel okCancelPanel = new JPanel(new FlowLayout());
		okCancelPanel.add(okButton);
		okCancelPanel.add(cancelButton);
		
		JPanel separatorButtonsPanel = new JPanel(new FlowLayout());
		separatorButtonsPanel.setBorder(BorderFactory.createTitledBorder("Separator"));
		separatorButtonsPanel.add(insertSeparatorButton);
		separatorButtonsPanel.add(removeSeparatorButton);

		JPanel itemsPanel = new JPanel();
		itemsPanel.setLayout(new BoxLayout(itemsPanel,BoxLayout.Y_AXIS));
		itemsPanel.setPreferredSize(new Dimension(175,200));
		itemsPanel.add(new JLabel("Menu items:"));
		
		JScrollPane listScroll = new JScrollPane(itemsList);
		itemsPanel.add(listScroll);
		itemsPanel.add(separatorButtonsPanel);
		
		JPanel removedItemsPanel = new JPanel();
		removedItemsPanel.setLayout(new BoxLayout(removedItemsPanel,BoxLayout.Y_AXIS));
		removedItemsPanel.setPreferredSize(new Dimension(175,200));
		removedItemsPanel.add(new JLabel("Removed items:"));
		
		JScrollPane removedListScroll = new JScrollPane(removedItemsList);
		removedItemsPanel.add(removedListScroll);
		
		JPanel itemsButtonsPanel = new JPanel();
		itemsButtonsPanel.setLayout(new BoxLayout(itemsButtonsPanel,BoxLayout.Y_AXIS));
		itemsButtonsPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		itemsButtonsPanel.add(removeItemButton);
		itemsButtonsPanel.add(retrieveButton);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new BoxLayout(centerPanel,BoxLayout.X_AXIS));
		centerPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		centerPanel.add(itemsPanel);
		centerPanel.add(itemsButtonsPanel);
		centerPanel.add(removedItemsPanel);
		
		JPanel southPanel = new JPanel(new BorderLayout());
		southPanel.add(okCancelPanel,BorderLayout.EAST);
		
		this.getContentPane().setLayout(new BorderLayout());
		this.getContentPane().add(centerPanel,BorderLayout.CENTER);
		this.getContentPane().add(southPanel,BorderLayout.SOUTH);
	}
	
	/**
	 * 
	 */
	private void buildButtons() {
		okButton = new JButton(new AbstractAction("OK") {
			public void actionPerformed(ActionEvent evt) {
				if (listData != null) {
					managedMenu.removeAll();

					for (int i=0 ; i<elementsBefore.length ; i++)
						managedMenu.add(elementsBefore[i]);
					
					for (int i=0 ; i<listData.size() ; i++) {
						if (!((String)listData.elementAt(i)).equals(SEPARATOR_STRING)) {
							managedMenu.add((JMenuItem)menuItems.get(listData.elementAt(i)));
						}
						else managedMenu.addSeparator();
					}
					
					for (int i=0 ; i<elementsAfter.length ; i++)
						managedMenu.add(elementsAfter[i]);
				}
				
				ProfileController.getInstance().updateProfile(listData);
				setVisible(false);
			}
		});

		cancelButton = new JButton(new AbstractAction("Cancel") {
			public void actionPerformed(ActionEvent evt) {
				setVisible(false);
			}
		});
		
		removeItemButton = new JButton(new AbstractAction(">>") {
			public void actionPerformed(ActionEvent evt) {
				int removeIndex = itemsList.getSelectedIndex();
				
				if (!listData.elementAt(removeIndex).equals(SEPARATOR_STRING)) {
					if (removeIndex >= 0) {
						Vector newList = new Vector();
						for (int i=0 ; i<listData.size() ; i++) {
							if (i != removeIndex) {
								newList.addElement(listData.elementAt(i));
							}
							else {
								removedItems.addElement(listData.elementAt(i));
								removedItemsList.setListData(removedItems);
							}
						}
						
						itemsList.setListData(newList);
						listData = newList;
					}
				}
			}	
		});
		
		retrieveButton = new JButton(new AbstractAction("<<") {
			public void actionPerformed(ActionEvent evt) {
				int retrieveIndex = removedItemsList.getSelectedIndex();
				
				if (retrieveIndex >= 0) {
					listData.addElement(removedItems.elementAt(retrieveIndex));
					removedItems.removeElementAt(retrieveIndex);
					
					itemsList.setListData(listData);
					removedItemsList.setListData(removedItems);
				}
			}
		});
		
		insertSeparatorButton = new JButton(new AbstractAction("Insert") {
			public void actionPerformed(ActionEvent evt) {
				int separatorIndex = itemsList.getSelectedIndex();
				
				if (separatorIndex >= 0) {
					Vector newList = new Vector();
					for (int i=0 ; i<listData.size() ; i++) {
						if (i == separatorIndex) {
							newList.addElement(SEPARATOR_STRING);
						}
							
						newList.addElement(listData.elementAt(i));
					}
					
					itemsList.setListData(newList);
					listData = newList;
				}
			}
		});
		
		removeSeparatorButton = new JButton(new AbstractAction("Remove") {
			public void actionPerformed(ActionEvent evt) {
				int separatorIndex = itemsList.getSelectedIndex();
				
				if (separatorIndex >= 0) {
					if (listData.elementAt(separatorIndex).equals(SEPARATOR_STRING)) {
						Vector newList = new Vector();
						for (int i=0 ; i<listData.size() ; i++) {
							if (i != separatorIndex)
								newList.addElement(listData.elementAt(i));
						}
						
						itemsList.setListData(newList);
						listData = newList;
					}
				}
			}
		});
	}

	/**
	 * Filters the menu items to allow editing only inside the offset-limit area.
	 * @param components the full components array
	 * @param indexOffset the starting offset of the editable area
	 * @param indexLimit the ending limit of the editable area
	 * @return the trimmed components array
	 */
	Component [] trimComponentsByOffsets (Component [] components,int indexOffset,int indexLimit) {
		int newSize = indexLimit - indexOffset;
		int j = 0;
		Component [] trimmedComponents = null;
		
		if (newSize > 0) {
			// initializes the arrays that keep the non-editable menu components
			elementsBefore = new Component [indexOffset];
			elementsAfter  = new Component [components.length - indexLimit];
			
			trimmedComponents = new Component[newSize];
			
			for (int i=0 ; i<offset ; i++)
				elementsBefore[i] = components[i];
			
			for (int i=indexOffset ; i<indexLimit ; i++)
				trimmedComponents[j++] = components[i];
			
			j = 0; 
			for (int i=indexLimit ; i<components.length ; i++)
				elementsAfter[j++] = components[i];
		}
		else {
			JOptionPane.showMessageDialog(
				null,
				"The editable area of this menu is empty.",
				"Menu management",
				JOptionPane.ERROR_MESSAGE
			);
			
			emptyMenu = true;
		}
		
		return trimmedComponents;
	}
	
	/**
	 * Builds a list from the components array.
	 * @param components the components array
	 * @return a list to be placed on the GUI
	 */
	JList buildListFromComponents (Component [] components) {
		JList list = new JList();
		
		if (components != null) {
			list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			list.setSize(100,200);
			
			listData = new Vector();
			menuItems = new Hashtable();
			
			// build a hash look-up table and fill list with components's text
			for (int i=0 ; i<components.length ; i++) {
				if (components[i] instanceof JMenuItem) {
					listData.addElement(((JMenuItem)components[i]).getText());
					menuItems.put(((JMenuItem)components[i]).getText(),components[i]);
				}
				else {
					listData.addElement(SEPARATOR_STRING);
					menuItems.put(SEPARATOR_STRING,components[i]);
				}
			}
			
			list.setListData(listData);
		}
			
		return list;
	}
	
	/**
	 * Checks whether or not the editable area of the menu is empty.
	 * @return true if the editable area is empty and false otherwise
	 */
	boolean emptyMenu () {
		return emptyMenu;
	}
}