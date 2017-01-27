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

import java.awt.Component;
import java.util.Hashtable;

import javax.swing.Action;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * Extends the JMenuBar class to add enhanced functionalities, necessary to improve
 * its usage in this program.
 */
public class Menu extends JMenuBar {
    
    /**
     * The parent menus in this menu bar.
     */
    Hashtable parentMenus;
    
    /**
     * Creates an instance of this class.
     */
    public Menu () {
        parentMenus = new Hashtable();
    }
    
    /**
     * Adds a menu item to this menu bar, under the given parent menu. The only action
     * that will be set to this item is showing a message that the chosen functionality
     * has not been implemented; this method should be used to add to a program menu
     * items of future implementations.
     * @param name the name of the new menu item
     * @param parentName the name of the parent menu in which to add the new item
     * @param tooltip the tooltip text that will be shown when the mouse is over this item
     * @param enabled indicates whether or not the item will be enabled
     */
    public void addMenuItem (String name, String parentName, String tooltip,
    		boolean enabled) {
         JMenu parentMenu = (JMenu) parentMenus.get(parentName);
         
         if (parentMenu != null) {
             JMenuItem newItem = new JMenuItem(name);
						 newItem.setToolTipText(tooltip);
             EventHandler.getInstance().add(name,newItem);
             
             parentMenu.add(newItem);
         }
    }
    
    /**
     * Adds an action to this menu bar, under the given parent menu.
     * @param act the action that is being added to the menu
     * @param parentName the name of the menu under which the new item will be added
     * @param tooltip the description text that will be shown when the mouse is over this item 
     * @param enabled indicates whether or not the item will be enabled
     */
	public void addMenuItem (Action act, String parentName, String tooltip,
			boolean enabled) {
			JMenu parentMenu = (JMenu) parentMenus.get(parentName);
         
			if (parentMenu != null) {
				JMenuItem newItem = new JMenuItem(act);
				newItem.setToolTipText(tooltip);
             
				parentMenu.add(newItem);
			}
	  }
    
    /**
     * Adds a parent menu to this menu bar.
     * @param name the name of the parent menu
     * @param tooltip the description text that will be shown when the mouse is over this item
     * @param enabled indicates whehter or not the item will be enabled
     */
    public void addParentMenu(String name, String tooltip, boolean enabled) {
        JMenu menu = new JMenu (name,enabled);
        menu.setToolTipText(tooltip);
        
        parentMenus.put(name,menu);
        add(menu);
    }

	/**
	 * Adds an item with no action under the given parent menu.
	 * @param item the new item to be added
	 * @param parentName the name of the menu under which the new item will be added
	 * @param tooltip the description text that will be shown when the mouse is over this item
	 * @param enabled indicates whether or not the item will be enabled
	 */
	public void addMenuItem(JMenuItem item, String parentName, String tooltip,
			boolean enabled) {
		JMenu parentMenu = (JMenu) parentMenus.get(parentName);
		
		if (parentMenu != null)
			parentMenu.add(item);
			
		item.setEnabled(enabled);
	}
	
	/**
	 * 
	 * @param subMenu
	 * @param parentName
	 * @param tooltip
	 * @param enabled
	 */
	public void addSubMenu(JMenu subMenu, String parentName, String tooltip,
			boolean enabled) {
		JMenu parentMenu = (JMenu) parentMenus.get(parentName);
		
		if (parentMenu != null)
			parentMenu.add(subMenu);
	}
	
	/**
	 * 
	 * @param topLevelName
	 * @param subMenuName
	 * @param tooltip
	 * @param enabled
	 */
	public void addItemToSubMenu(JMenuItem item, String topLevelName,
			String subMenuName, String tooltip, boolean enabled) {
		JMenu topLevel = (JMenu) parentMenus.get(topLevelName);
		
		if (topLevel != null) {
			Component[] components = topLevel.getMenuComponents();
			
			for (int i=0 ; i<components.length ; i++) {
				if (components[i] instanceof JMenu) {
					JMenu subMenu = (JMenu) components[i];
				
					if (subMenu.getText().equals(subMenuName)) {
						item.setToolTipText(tooltip);
						subMenu.add(item);
					}
				}
			}
		}
	}
	
	/**
	 * 
	 * @param act
	 * @param topLevelName
	 * @param subMenuName
	 * @param tooltip
	 * @param enabled
	 */
	public void addItemToSubMenu(Action act, String topLevelName,
			String subMenuName, String tooltip, boolean enabled) {
		JMenu topLevel = (JMenu) parentMenus.get(topLevelName);
		
		if (topLevel != null) {
			Component[] components = topLevel.getMenuComponents();
			
			for (int i=0 ; i<components.length ; i++) {
				if (components[i] instanceof JMenu) {
					JMenu subMenu = (JMenu) components[i];
				
					if (subMenu.getText().equals(subMenuName)) {
						JMenuItem newItem = new JMenuItem(act);
						newItem.setToolTipText(tooltip);
						subMenu.add(newItem);
					}
				}
			}
		}
	}
	
	/**
	 * Appends a separator to the given parent menu.
	 * @param menuName the name of the parent menu
	 */
	public void addSeparator(String menuName) {
		JMenu menu = (JMenu) parentMenus.get(menuName);
		
		if (menu != null)
			menu.addSeparator();
	}
}
