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
package tccrouter.gbl.controller;

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
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import tccrouter.ring.prefs.AIXMLPreferences;

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
public class AIPreferencesController {

	/**
	 * The genetics category's identifier.
	 */
	private final static String GENETICS_CATEGORY  = "Genetics";
	/**
	 * The neural nets category's identifier.
	 */
	private final static String NEURAL_NETS_CATEGORY = "Neural Nets";
	/**
	 * The general category's identifier.
	 */
	public final static String GENERAL_CATEGORY = "General";
	/**
	 * The VRP Default category's identifier.
	 */
	private final static String VRP_DEFAULT_CATEGORY  = "VRP Default";
	/**
	 * The Local Search Default category's identifier.
	 */
	public final static String LSD_DEFAULT_CATEGORY  = "Local Search";
	/**
	 * The Simulated Annealing Default category's identifier.
	 */
	public final static String SA_DEFAULT_CATEGORY  = "Simulated Annealing";		
	/**
	 */
	public final static String CLIENT_DEMAND_PROPERTY = "Client Demand";
	/**
	 */
	public final static String VEHICLE_CAPACITY_PROPERTY = "Vehicle Capacity";	
	/**
	 */
	public final static String EUCLIDIAN_GRAPH_PROPERTY = "Euclidian Edge Weight";
	/**
	 */
	public final static String POP_SIZE_PROPERTY = "Population Size";
	/**
	 */
	public final static String MUTATION_RATE_PROPERTY = "Mutation Rate";
	/**
	 */
	public final static String ANNEAL_PROPERTY = "Simulated Annealing";
	/**
	 */
	public final static String ORDERED_CROSSOVER_PROPERTY = "Ordered Crossover";
	/**
	 */
	public final static String CYCLIC_CROSSOVER_PROPERTY = "Cyclic Crossover";
	/**
	 */
	public final static String PMX_CROSSOVER_PROPERTY = "PMX Crossover";
	/**
	 */
	public final static String ROLLING_CROSSOVER_PROPERTY = "Rolling Crossover";	
	/**
	 */
	public final static String INVER_OVER_PROPERTY = "Inver Over";
	/**
	 */
	public final static String MINIMAL_SPANNING_TREE_PROPERTY = "Minimal Spanning Tree seed";
	/**
	 */
	public final static String FINAL_TEMP_PROPERTY = "Final Temperature";
	/**
	 */
	public final static String RESETS_PROPERTY = "Resets";
	/**
	 */
	public final static String TIME_CONST_PROPERTY = "Time constant";
	/**
	 */
	public final static String LSD_ITERATIONS_PROPERTY = "Iterations";		
	/**
	 */
	public final static String GLOBAL_BEST_PROPERTY = "Global Best Search";
	/**
	 */
	public final static String BAD_MOVES_PROPERTY = "Accept Bad Moves";				
	/**
	 */
	public final static String MAX_ITERATIONS_PROPERTY = "Max iterations";
	/**
	 * The path in the filesystem to the XMLPreferences file.
	 */
	private final static String PREFERENCES_PATH = "prefs/ai-preferences.xml";
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
	private static AIPreferencesController instance;
	/**
	 * The DOM document that will accesses the xml document
	 */
	protected static Document prefsDocument = null;
	/**
	 * The tree's root node for user XMLPreferences.
	 */
	protected static AIXMLPreferences rootPrefs;

	/**
	 * Creates an instance of this class and the root XMLPreferences node.
	 */
	protected AIPreferencesController() {
	}
	
	/**
	 * Retrieves the unique instance to this class.
	 * @return the unique instance to this class
	 */
	public static AIPreferencesController getInstance() {
		if (instance == null) {
			instance = new AIPreferencesController();
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
		AIXMLPreferences newNode = (AIXMLPreferences)rootPrefs.node(name);
	}
	
	/**
	 * Puts an int value into a AIXMLPreferences category.
	 * @param categoryName the name of the category
	 * @param key the key of the new value
	 * @param value the default value
	 */
	public void putInt(String categoryName, String key, int value) {
		AIXMLPreferences node = (AIXMLPreferences) rootPrefs.node(categoryName).node(key);
		
		node.put(TYPE,TYPE_INT);
		node.putInt(VALUE,value);
	}
	
	/**
	 * Puts a double value into a AIXMLPreferences category.
	 * @param categoryName the name of the category
	 * @param key the key of the new value
	 * @param value the default value
	 */
	public void putDouble(String categoryName, String key, double value) {
		AIXMLPreferences node = (AIXMLPreferences) rootPrefs.node(categoryName).node(key);
		
		node.put(TYPE,TYPE_DOUBLE);
		node.putDouble(VALUE,value);
	}
	
	/**
	 * Puts a boolean value into a AIXMLPreferences category.
	 * @param categoryName the name of the category
	 * @param key the key of the new value
	 * @param value the default value
	 */
	public void putBoolean(String categoryName, String key, boolean value) {
		AIXMLPreferences node = (AIXMLPreferences) rootPrefs.node(categoryName).node(key);
		
		node.put(TYPE,TYPE_BOOLEAN);
		node.putBoolean(VALUE,value);
	}
	
	/**
	 * Puts a String value into a AIXMLPreferences category.
	 * @param categoryName the name of the category
	 * @param key the key of the new value
	 * @param value the default value
	 */
	public void put(String categoryName, String key, String value) {
		AIXMLPreferences node = (AIXMLPreferences) rootPrefs.node(categoryName).node(key);
		
		node.put(TYPE,TYPE_STRING);
		node.put(VALUE,value);
	}
	
	/**
	 * Puts a Color value into a AIXMLPreferences category.
	 * @param categoryName the name of the category
	 * @param key the key of the new value
	 * @param value the default value
	 */
	public void putColor(String categoryName, String key, Color value) {
		AIXMLPreferences node = (AIXMLPreferences) rootPrefs.node(categoryName).node(key);
		
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
		AIXMLPreferences node = (AIXMLPreferences) rootPrefs.node(categoryName + "/" + key);
		
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
		AIXMLPreferences node = (AIXMLPreferences) rootPrefs.node(categoryName + "/" + key);
		
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
		AIXMLPreferences node = (AIXMLPreferences) rootPrefs.node(categoryName + "/" + key);
		
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
		AIXMLPreferences node = (AIXMLPreferences) rootPrefs.node(categoryName + "/" + key);
		
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
		AIXMLPreferences node = (AIXMLPreferences) rootPrefs.node(categoryName + "/" + key);

		if (node.newNode()) {
			this.putColor(categoryName,key,def);
			node.setNotNewNode();
		}
			
		return new Color(node.getInt(VALUE,def.getRGB()));
	}
	
	/**
	 * Flushes the AIXMLPreferences to the output file for persistence.
	 */
	public void savePreferences() {
		try {
			File prefFile = new File(PREFERENCES_PATH);
			
			if(!prefFile.exists())
				prefFile.createNewFile();
				
			// save the XML tree to the AIXMLPreferences file
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
	 * Loads the existing AIXMLPreferences file into the program's AIXMLPreferences
	 * tree; if the file does not exist, an IOException will be caught and
	 * no settings will be imported.
	 * @return the DOM Document to be used by all the preferences nodes
	 */
	public static Document loadPreferences() {
		File xmlPrefs = new File(PREFERENCES_PATH);

		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			factory.setValidating(false);
			DocumentBuilder builder = factory.newDocumentBuilder();
			
			if (xmlPrefs.exists()){
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
				
				rootPrefs = new AIXMLPreferences(null,"");
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
	 * an AIXMLPreferences instance for the given node and call itself upon its
	 * children.
	 * @param node the DOM Element node for which an AIXMLPreferences instance
	 * will be created
	 * @param parent the parent of the node
	 */
	protected static void buildPreferences(Element node,AIXMLPreferences parent) {
		NodeList children = node.getChildNodes();
		AIXMLPreferences prefs = null;
		
		if (parent != null)
			prefs = (AIXMLPreferences)parent.node(node.getAttribute("name"));
		else
			prefs = new AIXMLPreferences(null,"");
		
		if (children.getLength() != 0) {
			Element map = (Element)children.item(0);
			NodeList entries = map.getElementsByTagName("entry");
			
			for (int i=0 ; i<entries.getLength() ; i++) {
				Element entry = (Element)entries.item(0);
				prefs.put(entry.getAttribute("key"),entry.getAttribute("value"));
			}
			
			for (int i=1 ; i<children.getLength() ; i++)
				buildPreferences((Element)children.item(i),prefs);
		}
		
		prefs.setNotNewNode();
		if (parent == null)
			rootPrefs = prefs;
	}

	/**
	 * Retrieves the root node in the AIXMLPreferences tree.
	 * @return the root node in the AIXMLPreferences tree
	 */
	public AIXMLPreferences getRoot() {
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