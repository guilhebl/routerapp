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
package tccrouter.ring.controller;

import java.awt.Color;
import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import tccrouter.ring.prefs.XMLPreferences;

/**
 * This class is responsible for controlling the user XMLPreferences, which
 * will be used throughout the program to allow persistence of these
 * settings.
 * The tree is composed in the following way: there is a root node that
 * will cluster several property categories. Each category is a different
 * node and will contain several children, each of which represents a 
 * preferences value to the program.
 * Each preference value is a node, child
 * of a category, and will contain two items: a value and a type. This is
 * used to indicate to the program the type of the preference, in case it
 * needs to be known in run-time.
 */
public class PreferencesController {

	/**
	 * The properties category's identifier.
	 */
	public final static String PROPERTIES_CATEGORY  = "Properties";
	/**
	 * The performance category's identifier.
	 */
	public final static String PERFORMANCE_CATEGORY = "Performance";
	/**
	 * The algorithms category's identifier.
	 */
	public final static String ALGORITHMS_CATEGORY = "Algorithms";
	/**
	 * The edge color property's identifier.
	 */
	public final static String EDGE_COLOR_PROPERTY = "Edge color";
	/**
	 * The node color property's identifier.
	 */
	public final static String NODE_COLOR_PROPERTY = "Node color";
	/**
	 * The anti-aliasing property's identifier.
	 */
	public final static String ANTIALIASING_PROPERTY = "Anti-aliasing";
	/**
	 * The 'show animation' flag's identifier.
	 */
	public final static String SHOW_ANIMATION_PROPERTY = "Show animation";
	/**
	 * The 'set default properties before algorithm' flag's identifier.
	 */
	public final static String SET_DEFAULTS_BEFORE_ALGORITHM_PROPERTY = "Set default properties before algorithm";
	/**
	 * The path in the filesystem to the XMLPreferences file.
	 */
	private final static String PREFERENCES_PATH = "default-config.xml";
	/**
	 * A String that will represent an integer type.
	 */
	public final static String TYPE_INT = "int";
	/**
	 * A String that will represent a double type.
	 */
	public final static String TYPE_DOUBLE = "double";
	/**
	 * A String that will represent a boolean type.
	 */
	public final static String TYPE_BOOLEAN = "boolean";
	/**
	 * A String that will represent a color type.
	 */
	public final static String TYPE_COLOR = "color";
	/**
	 * A String that will represent a string type.
	 */
	public final static String TYPE_STRING = "string";
	/**
	 * A String that will represent a type node.
	 */
	public final static String TYPE = "type";
	/**
	 * A String that will represent a value node.
	 */
	public final static String VALUE = "value";
	/**
	 * The unique instance to this class.
	 */
	private static PreferencesController instance;
	/**
	 * The DOM document that will accesses the xml document
	 */
	protected static Document prefsDocument = null;
	/**
	 * The tree's root node for user XMLPreferences.
	 */
	protected static XMLPreferences rootPrefs;

	/**
	 * Creates an instance of this class and the root XMLPreferences node.
	 */
	protected PreferencesController() {
	}
	
	/**
	 * Retrieves the unique instance to this class.
	 * @return the unique instance to this class
	 */
	public static PreferencesController getInstance() {
		if (instance == null) {
			instance = new PreferencesController();
			loadPreferences();
		}
		
		return instance;
	}
	
	/**
	 * Adds a new XMLPreferences category to the XMLPreferences tree; each
	 * category will be a leaf in the XMLPreferences tree.
	 * @param name the new XMLPreferences category
	 */
	public void addCategory(String name) {
		XMLPreferences newNode = (XMLPreferences)rootPrefs.node(name);
	}
	
	/**
	 * Puts an int value into a XMLPreferences category.
	 * @param categoryName the name of the category
	 * @param key the key of the new value
	 * @param value the default value
	 */
	public void putInt(String categoryName, String key, int value) {
		XMLPreferences node = (XMLPreferences) rootPrefs.node(categoryName).node(key);
		
		node.put(TYPE,TYPE_INT);
		node.putInt(VALUE,value);
	}
	
	/**
	 * Puts a double value into a XMLPreferences category.
	 * @param categoryName the name of the category
	 * @param key the key of the new value
	 * @param value the default value
	 */
	public void putDouble(String categoryName, String key, double value) {
		XMLPreferences node = (XMLPreferences) rootPrefs.node(categoryName).node(key);
		
		node.put(TYPE,TYPE_DOUBLE);
		node.putDouble(VALUE,value);
	}
	
	/**
	 * Puts a boolean value into a XMLPreferences category.
	 * @param categoryName the name of the category
	 * @param key the key of the new value
	 * @param value the default value
	 */
	public void putBoolean(String categoryName, String key, boolean value) {
		XMLPreferences node = (XMLPreferences) rootPrefs.node(categoryName).node(key);
		
		node.put(TYPE,TYPE_BOOLEAN);
		node.putBoolean(VALUE,value);
	}
	
	/**
	 * Puts a String value into a XMLPreferences category.
	 * @param categoryName the name of the category
	 * @param key the key of the new value
	 * @param value the default value
	 */
	public void put(String categoryName, String key, String value) {
		XMLPreferences node = (XMLPreferences) rootPrefs.node(categoryName).node(key);
		
		node.put(TYPE,TYPE_STRING);
		node.put(VALUE,value);
	}
	
	/**
	 * Puts a Color value into a XMLPreferences category.
	 * @param categoryName the name of the category
	 * @param key the key of the new value
	 * @param value the default value
	 */
	public void putColor(String categoryName, String key, Color value) {
		XMLPreferences node = (XMLPreferences) rootPrefs.node(categoryName).node(key);
		
		node.put(TYPE,TYPE_COLOR);
		node.putInt(VALUE,value.getRGB());
	}
	
	/**
	 * Retrieves the int value in the specified category; the default value
	 * will be set if the category isn't found.
	 * @param categoryName the name of the category
	 * @param key the key of the value
	 * @param def the default value
	 * @return the desired value, if it is found, or the default otherwise
	 */
	public int getInt(String categoryName, String key, int def) {
		XMLPreferences node = (XMLPreferences) rootPrefs.node(categoryName + "/" + key);
		
		if (node.newNode()) {
			this.putInt(categoryName,key,def);
			node.setNotNewNode();
		}
		
		return node.getInt(VALUE,def);
	}
	
	/**
	 * Retrieves the double value in the specified category; the default value
	 * will be set if the category isn't found.
	 * @param categoryName the name of the category
	 * @param key the key of the value
	 * @param def the default value
	 * @return the desired value, if it is found, or the default otherwise
	 */
	public double getDouble(String categoryName, String key, double def) {
		XMLPreferences node = (XMLPreferences) rootPrefs.node(categoryName + "/" + key);
		
		if (node.newNode()) {
			this.putDouble(categoryName,key,def);
			node.setNotNewNode();
		}
		
		return node.getDouble(VALUE,def);
	}
	
	/**
	 * Retrieves the boolean value in the specified category; the default value
	 * will be set if the category isn't found.
	 * @param categoryName the name of the category
	 * @param key the key of the value
	 * @param def the default value
	 * @return the desired value, if it is found, or the default otherwise
	 */
	public boolean getBoolean(String categoryName, String key, boolean def) {
		XMLPreferences node = (XMLPreferences) rootPrefs.node(categoryName + "/" + key);
		
		if (node.newNode()) {
			this.putBoolean(categoryName,key,def);
			node.setNotNewNode();
		}
		
		return node.getBoolean(VALUE,def);
	}
	
	/**
	 * Retrieves the String value in the specified category; the default value
	 * will be set if the category isn't found.
	 * @param categoryName the name of the category
	 * @param key the key of the value
	 * @param def the default value
	 * @return the desired value, if it is found, or the default otherwise
	 */
	public String get(String categoryName, String key, String def) {
		XMLPreferences node = (XMLPreferences) rootPrefs.node(categoryName + "/" + key);
		
		if (node.newNode()) {
			this.put(categoryName,key,def);
			node.setNotNewNode();
		}
		
		return node.get(VALUE,def);
	}
	
	/**
	 * Retrieves the Color value in the specified category; the default value
	 * will be set if the category isn't found.
	 * @param categoryName the name of the category
	 * @param key the key of the value
	 * @param def the default value
	 * @return the desired value, if it is found, or the default otherwise
	 */
	public Color getColor(String categoryName, String key, Color def) {
		XMLPreferences node = (XMLPreferences) rootPrefs.node(categoryName + "/" + key);

		if (node.newNode()) {
			this.putColor(categoryName,key,def);
			node.setNotNewNode();
		}
			
		return new Color(node.getInt(VALUE,def.getRGB()));
	}
	
	/**
	 * Flushes the XMLPreferences to the output file for persistence.
	 */
	public void savePreferences() {
		try {
			File prefFile = new File(PREFERENCES_PATH);
			
			if(!prefFile.exists())
				prefFile.createNewFile();
				
			// save the XML tree to the XMLPreferences file
			DOMSource source = new DOMSource(prefsDocument); 
			StreamResult sr = new StreamResult(prefFile); 
			Transformer transformer = TransformerFactory.newInstance().newTransformer(); 
			transformer.transform(source, sr);
		}
		catch(IOException exc) {
			exc.printStackTrace();
		} catch (TransformerConfigurationException exc) {
			exc.printStackTrace();
		} catch (TransformerFactoryConfigurationError exc) {
			exc.printStackTrace();
		} catch (TransformerException exc) {
			exc.printStackTrace();
		}
	}
	
	/**
	 * Loads the existing XMLPreferences file into the program's XMLPreferences
	 * tree; if the file does not exist, an IOException will be caught and
	 * no settings will be imported.
	 * @return the DOM Document to be used by all the preferences nodes
	 */
	public static Document loadPreferences() {
		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		File xmlPrefs = new File(classloader.getResource(PREFERENCES_PATH).getFile());								
		
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			factory.setValidating(false);
			DocumentBuilder builder = factory.newDocumentBuilder();
			
			if (xmlPrefs != null && xmlPrefs.exists()){
				prefsDocument = builder.parse(xmlPrefs);
				buildPreferencesFromDocument();
			}	
			else {
				prefsDocument = builder.newDocument();
				
				// TODO set DOCTYPE
				
				// create root node and its map
				Element prefs = prefsDocument.createElement("preferences");
				prefs.setAttribute("EXTERNAL_XML_VERSION","1.0");
				prefsDocument.appendChild(prefs);
				
				Element root = prefsDocument.createElement("root");
				root.setAttribute("type","user");
				Element rootMap = prefsDocument.createElement("map");
				root.appendChild(rootMap);
				
				prefs.appendChild(root);
				
				rootPrefs = new XMLPreferences(null,"");
			}
		}catch (ParserConfigurationException e){
			  e.printStackTrace();
		}catch (SAXException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		return prefsDocument;
	}
	
	/**
	 * Starts the creation of the preferences tree from the DOM/XML Document.
	 * This method will retrieve the 'root' Element from the DOM Document and
	 * call the recursive 'buildPreferences' method upon it to start the
	 * creation of the preferences tree.
	 */
	protected static void buildPreferencesFromDocument() {
		Element docRoot = (Element)(prefsDocument.getElementsByTagName("root").item(0));
		buildPreferences(docRoot,null);
	}

	/**
	 * Recursively builds the preferences tree from the DOM Element nodes. This method
	 * should be called initially for the 'root' Element, since it will build
	 * an XMLPreferences instance for the given node and call itself upon its
	 * children.
	 * @param node the DOM Element node for which an XMLPreferences instance
	 * will be created
	 * @param parent the parent of the node
	 */
	protected static void buildPreferences(Element node,XMLPreferences parent) {
		NodeList children = node.getChildNodes();
		XMLPreferences prefs = null;
		
		if (parent != null)
			prefs = (XMLPreferences)parent.node(node.getAttribute("name"));
		else
			prefs = new XMLPreferences(null,"");
		
		if (children.getLength() != 0) {
			if (children.item(0).getNodeType() == Node.ELEMENT_NODE) {
				Element map = (Element)children.item(0);
				NodeList entries = map.getElementsByTagName("entry");
				
				for (int i=0 ; i<entries.getLength() ; i++) {
					Element entry = (Element)entries.item(0);
					prefs.put(entry.getAttribute("key"),entry.getAttribute("value"));
				}
				
				for (int i=1 ; i<children.getLength() ; i++)
					buildPreferences((Element)children.item(i),prefs);				
			}
		}
		
		prefs.setNotNewNode();
		if (parent == null)
			rootPrefs = prefs;
	}

	/**
	 * Retrieves the root node in the XMLPreferences tree.
	 * @return the root node in the XMLPreferences tree
	 */
	public XMLPreferences getRoot() {
		return rootPrefs;
	}
	
	/**
	 * Retrieves the DOM document for the Preferences XML tree.
	 * @return the DOM document for the Preferences XML tree
	 */
	public Document getXMLDocument() {
		return prefsDocument;
	}

	/**
	 * Sets the XML document that is being built.
	 * @param doc the new document to be used
	 */
	public void setXMLDocument(Document doc) {
		prefsDocument = doc;
	}
}