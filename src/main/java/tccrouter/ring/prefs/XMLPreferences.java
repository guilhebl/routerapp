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
package tccrouter.ring.prefs;

import java.util.Vector;
import java.util.prefs.AbstractPreferences;
import java.util.prefs.BackingStoreException;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import tccrouter.ring.controller.PreferencesController;

/**
 * This implementation of AbstractPreferences contains the SPI methods
 * as defined in java.util.prefs.AbstractPreferences. These SPI iplementations
 * make the preferences backing store an XML file. To avoid disk read-write
 * issues, the Document tree is only saved to a file when the 'flush' method
 * is called.
 * 
 * This class assumes that there is a PreferencesController singleton object, 
 * which will take care of creating or loading an XML file to a DOM Document.
 * 
 * Though the DTD provided for the preferences API has been followed in this
 * implementation, the current DOM API doesn't provide a method to set a 
 * Document's DOCTYPE, so no DOCTYPE will be seen on XML files generated
 * by this implementation.
 * 
 * @author Eduardo S. Cordeiro and Tays C. A. P. Soares
 */
public class XMLPreferences extends AbstractPreferences {

	/**
	 * Creates an instance of a preferences node, and sets the 'newNode'
	 * flag to null.
	 * @param parent the parent of this node
	 * @param name the name of this node
	 */
	public XMLPreferences(AbstractPreferences parent, String name) {
		super(parent, name);
		newNode = true;
	}

	/**
	 * Requests the PreferencesController to save the preferences tree
	 * to the backing store. Please note that, though the AbstractPreferences
	 * method signature defines that this method should throw a BackingStoreException,
	 * this implementation doesn't.
	 */
	protected void flushSpi() throws BackingStoreException {
		PreferencesController.getInstance().savePreferences();
	}

	/**
	 * Removes this node from the backing store. Please note that, though the 
	 * AbstractPreferences method signature defines that this method should 
	 * throw a BackingStoreException, this implementation doesn't.
	 */
	protected void removeNodeSpi() throws BackingStoreException {
		org.w3c.dom.Node root = PreferencesController.getInstance().getXMLDocument().getDocumentElement();
		Element myNode = myXMLNode();
		Element parentNode = (Element)myNode.getParentNode();
		
		if(root.getNodeType() == org.w3c.dom.Node.ELEMENT_NODE) {
			Element docRoot = (Element) root;
			
			parentNode.removeChild(myNode);
		}	
	}

	/**
	 * Not implemented, but a future TO-DO.
	 */
	protected void syncSpi() throws BackingStoreException {}

	/**
	 * Retrieves a String array with the names of this node's children from
	 * the backing store. Please note that, though the AbstractPreferences
	 * method signature defines that this method should throw a BackingStoreException,
	 * this implementation doesn't.
	 * @return a String array with the names of this node's children
	 */
	protected String[] childrenNamesSpi() throws BackingStoreException {
		Element node = myXMLNode();
		Vector nodeNames = null;
		
		if (node != null) {
			NodeList children = node.getChildNodes();
			nodeNames = new Vector();
			for (int i=0 ; i<children.getLength() ; i++) {
				Element child = (Element)children.item(i);
				if (child.getTagName().equals("node"))
					nodeNames.addElement(child.getAttribute("name"));
			}		
		}
		
		String[] names = new String[nodeNames.size()];
		for (int i=0 ; i<names.length ; i++)
			names[i] = (String)nodeNames.elementAt(i);
			
		return names;
	}

	/**
	 * Retrieves a String array with the keys assigned to this node from the
	 * backing store. Please note that, though the AbstractPreferences
	 * method signature defines that this method should throw a BackingStoreException,
	 * this implementation doesn't.
	 * @return a String array with the keys assigned to this node
	 */
	protected String[] keysSpi() throws BackingStoreException {
		Element node = myXMLNode();
		String[] keys = null;
		
		if (node != null) {
			NodeList entries = myEntries();
			keys = new String[entries.getLength()];
			for (int i=0 ; i<entries.getLength() ; i++) {
				Element entry = (Element)entries.item(i);
				keys[i] = entry.getAttribute("key");
			}		
		}			
		return keys;
	}

	/**
	 * Removes a given key from this node on the backing store.
	 * @param key the key to be removed
	 */
	protected void removeSpi(String key) {
		Element node = myXMLNode();
		
		if (node != null) {
			Element map = (Element)node.getElementsByTagName("map").item(0);
			NodeList entries = myEntries();
			for (int i=0 ; i<entries.getLength() ; i++) {
				Element entry = (Element)entries.item(i);
				String nodeKey = entry.getAttribute("key");
		
				if (nodeKey.equals(key)) {
					map.removeChild(entry);
				}
			}		
		}
	}

	/**
	 * Retrieves the value associated to a given key from this node from the
	 * backing store.
	 * @param key the key whose value will be retrieved
	 * @return the value associated to the given key, if this node contains such
	 * a pair, or null otherwise
	 */
	protected String getSpi(String key) {
		Element node = myXMLNode();

		if (node != null) {
			NodeList entries = myEntries();
			boolean keyExists = false;					
	
			// test whether or not the node already contains the given key
			for (int j=0 ; j<entries.getLength() ; j++) {
				Element entry = (Element)entries.item(j);
				String nodeKey = entry.getAttribute("key");
		
				if (nodeKey.equals(key)) {
					return entry.getAttribute("value");
				}
			}
		}
		return null;
	}

	/**
	 * Sets a key-value pair on this node, on the backing store. If this node
	 * doesn't contain the given key, this pair will be created on the backing
	 * store.
	 * @param key the key to be set
	 * @param the value to be set on the given key
	 */
	protected void putSpi(String key, String value) {
		Element node = myXMLNode();
		
		if (node != null) {
			Element map = (Element)node.getElementsByTagName("map").item(0);
			NodeList entries = myEntries();
			boolean keyExists = false;					
			
			// test whether or not the node already contains the given key
			for (int j=0 ; j<entries.getLength() ; j++) {
				Element entry = (Element)entries.item(j);
				String nodeKey = entry.getAttribute("key");
				
				if (nodeKey.equals(key)) {
					entry.setAttribute("value",value);
					keyExists = true;
				}
			}
			
			// if the entry doesn't already exist, create it and append it to this node
			if (!keyExists) {
				Element entry = PreferencesController.getInstance().getXMLDocument().createElement("entry");
				entry.setAttribute("key",key);
				entry.setAttribute("value",value);
				
				map.appendChild(entry);
			}
		}
	}

	/**
	 * Retrieves this node's child with the given name from the backing store. If
	 * such a child doesn't exist, one will be created.
	 * @param name the name of the desired child
	 * @return the desired node, which will have the 'newNode' flag set if it didn't
	 * exist before this method
	 */
	protected AbstractPreferences childSpi(String name) {
		Element node = myXMLNode();
		
		if (node != null) {
			NodeList children = node.getElementsByTagName("node");
			
			for (int i=0 ; i<children.getLength() ; i++) {
				Element child = (Element)children.item(i);
				String childName = child.getAttribute("name");
				
				if (childName.equals(name)) 
					return createPreferencesFromElement(child,childName);
			}
			
			// the child doesn't exist, so one will be created
			AbstractPreferences prefs = new XMLPreferences(this,name);
			Element newNode = PreferencesController.getInstance().getXMLDocument().createElement("node");
			Element map = PreferencesController.getInstance().getXMLDocument().createElement("map");
			
			newNode.appendChild(map);
			newNode.setAttribute("name",name);
			node.appendChild(newNode);

			return prefs;
		}
		return null;
	}
	
	/**
	 * Creates a preferences node from an XML element.
	 * @param child the XML element whose node will be created
	 * @return the newly created preferences node
	 */
	private AbstractPreferences createPreferencesFromElement(Element child, String name) {
		AbstractPreferences prefs = new XMLPreferences(this,name);
		
		NodeList map = child.getElementsByTagName("map");
		NodeList entries = ((Element)map.item(0)).getElementsByTagName("entry");
		
		for (int i=0 ; i<entries.getLength() ; i++) {
			Element entry = (Element)entries.item(i);
			
			prefs.put(entry.getAttribute("key"),entry.getAttribute("value"));
		}
		
		return prefs;
	}

	/**
	 * Retrieves a DOM/XML Element that represents this node on the backing store.
	 * @return
	 */
	private Element myXMLNode() {
		org.w3c.dom.Node root = PreferencesController.getInstance().getXMLDocument().getDocumentElement();
		
		if(root.getNodeType() == org.w3c.dom.Node.ELEMENT_NODE) {
			Element docRoot = (Element)root;
			Element prefsRoot = (Element)docRoot.getElementsByTagName("root").item(0);
	
			// checks whether this node is the root
			if (this.name().equals(""))
				return prefsRoot;
				
			// fetch the node with the name of this preferences node
			Element myNode = findNode(prefsRoot,this.name());
			return myNode;
		}
		
		return null;
	}
	
	/**
	 * Recursively finds a node on the DOM/XML tree.
	 * @param parent the parent of nodes to be searched in a recursive
	 * call of this method
	 * @param name the name of the desired Element
	 * @return the desired Element if it is found, or null otherwise
	 */
	private Element findNode(Element parent, String name) {
		NodeList children = parent.getElementsByTagName("node");
		
		for (int i=0 ; i<children.getLength() ; i++) {
			Element child = (Element)children.item(i);
			String childName = child.getAttribute("name");
			
			if (childName.equals(name))
				return child;
			else {
				Element searched = findNode(child,name);
				if (searched != null)
					return searched;
			}
		}
		
		return null;
	}

	/**
	 * Retrieves the DOM nodes that represent this preference's entries from
	 * the backing store.
	 * @return a NodeList with the entries in this preferences node
	 */
	private NodeList myEntries() {
		Element node = myXMLNode();
		
		if (node != null) {
			NodeList map = node.getElementsByTagName("map");
			return ((Element)map.item(0)).getElementsByTagName("entry");
		}
		
		return null;
	}

	/**
	 * Retrieves the String value associated with the given key from this preferences
	 * node, from the backing store.
	 * @param key the key of the desired entry
	 * @param def the default value to be set if the desired pair doesn't yet exist
	 * on the backing store
	 * @return the desired value
	 */
	public String get(String key, String def) {
		String value = getSpi(key);
		
		if (value == null)
			this.put(key,def);
		else
			return value;
			
		return getSpi(key);
	}

	/**
	 * Retrieves the boolean value associated with the given key from this preferences
	 * node, from the backing store.
	 * @param key the key of the desired entry
	 * @param def the default value to be set if the desired pair doesn't yet exist
	 * on the backing store
	 * @return the desired value
	 */
	public boolean getBoolean(String key, boolean def) {
		String value = getSpi(key);
		
		if (value == null) {
			this.putBoolean(key,def);
			return Boolean.getBoolean(getSpi(key));
		}
		else if (value.equals("true"))
			return true;
		else
			return false;
	}

	/**
	 * Retrieves the double value associated with the given key from this preferences
	 * node, from the backing store.
	 * @param key the key of the desired entry
	 * @param def the default value to be set if the desired pair doesn't yet exist
	 * on the backing store
	 * @return the desired value
	 */
	public double getDouble(String key, double def) {
		String value = getSpi(key);
		
		if (value == null) {
			this.putDouble(key,def);
			return Double.parseDouble(getSpi(key));
		}
		else
			return Double.parseDouble(value);
	}

	/**
	 * Retrieves the float value associated with the given key from this preferences
	 * node, from the backing store.
	 * @param key the key of the desired entry
	 * @param def the default value to be set if the desired pair doesn't yet exist
	 * on the backing store
	 * @return the desired value
	 */
	public float getFloat(String key, float def) {
		String value = getSpi(key);
		
		if (value == null) {
			this.putFloat(key,def);
			return Float.parseFloat(getSpi(key));
		}
		else
			return Float.parseFloat(value);
	}

	/**
	 * Retrieves the String value associated with the given key from this preferences
	 * node, from the backing store.
	 * @param key the key of the desired entry
	 * @param def the default value to be set if the desired pair doesn't yet exist
	 * on the backing store
	 * @return the desired value
	 */
	public int getInt(String key, int def) {
		String value = getSpi(key);
		
		if (value == null) {
			this.putInt(key,def);
			return Integer.parseInt(getSpi(key));
		}
		else
			return Integer.parseInt(value);
	}

	/**
	 * Retrieves the long value associated with the given key from this preferences
	 * node, from the backing store.
	 * @param key the key of the desired entry
	 * @param def the default value to be set if the desired pair doesn't yet exist
	 * on the backing store
	 * @return the desired value
	 */
	public long getLong(String key, long def) {
		String value = getSpi(key);
		
		if (value == null) {
			this.putLong(key,def);
			return Long.parseLong(getSpi(key));
		}
		else
			return Long.parseLong(value);
	}

	/**
	 * Retrieves the 'newNode' flag for this node, which indicates whether or not
	 * it has been recently created.
	 * @return true if this node is new, false otherwise
	 */
	public boolean newNode() {
		return newNode;
	}
	
	/**
	 * Sets this node's 'newNode' flag to false, to indicate that it has already
	 * been recognized as a new node and this value is no longer needed, or 
	 *  that this node should no longer be used as a new node
	 */
	public void setNotNewNode() {
		newNode = false;
	}
}
