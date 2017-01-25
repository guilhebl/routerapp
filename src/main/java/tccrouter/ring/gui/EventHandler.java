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
import java.awt.event.ActionListener;
import java.util.Hashtable;
import java.util.Vector;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 * Responsible for showing a single message to all functionalities that appear
 * in the GUI but are not yet implemented.
 */
class EventHandler implements ActionListener {

	/**
	 * The unique instance to this class.
	 */
    static EventHandler instance;
    /**
     * The items that have been added to this handler.
     */
    Hashtable menuItems;
    /**
     * The names of the items.
     */
    Vector    menuNames;

	/**
	 * Creates an instance of this class.
	 */
    private EventHandler () {
        menuItems = new Hashtable();
        menuNames = new Vector();
    }

	/**
	 * Retrieves the unique instance to this class.
	 * @return the instance to this class
	 */
    public static EventHandler getInstance () {
        if (instance == null) instance = new EventHandler();
        
        return instance;
    }

    /**
     * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
    public void actionPerformed(ActionEvent evt) {
		JOptionPane.showMessageDialog(
			null,
			"This functionally has yet to be implemented.",
			"Not implemented",
			JOptionPane.INFORMATION_MESSAGE
		);
    }

    /**
     * Adds a new item to this handler so that clicking on it will show a message.
     * @param newItem
     */
    public void add(String name, JMenuItem newItem) {
        menuItems.put(name,newItem);
        menuNames.addElement(name);
        
        newItem.addActionListener(this);
    }
}