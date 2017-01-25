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
package tccrouter.ring.dao;

// W3C definition for a DOM and DOM exceptions:
// DOMExceptions are only thrown when traversing or manipulating a DOM. 
// Errors that occur during parsing are reporting using a different mechanism 
// that is covered below.
import java.io.File;
import java.io.FileNotFoundException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import tccrouter.diamante.core.graph.Edge;
import tccrouter.diamante.core.graph.Graph;
import tccrouter.diamante.core.graph.Node;
import tccrouter.diamante.core.graph.SimpleNode;
import tccrouter.diamante.core.graph.property.ComponentProperties;
import tccrouter.diamante.core.graph.property.Property;
import tccrouter.diamante.extension.graph.property.ComponentColor;
import tccrouter.diamante.extension.graph.property.EdgeWeight;
import tccrouter.diamante.extension.graph.property.ID;
import tccrouter.diamante.extension.graph.property.Label;
import tccrouter.diamante.extension.graph.property.Position;
import tccrouter.ring.graph.GTCGraph;

/**
 * Concrete XML Graph Data Access Object.
 * Implements Graph persistence ina XML file.
 **/
public class XMLGraphDAO extends XMLDataAccessObject {

	/** Graph to be stored ina XML file */
	private Graph xmlGraph;
	/**
	 * The root XML element.
	 */
	private Element root;

	/** Constructor */
	public XMLGraphDAO(Object value,Document document) {
		super(value,document);
	}

	/**
	 *	Make Graph XML 
	 **/
	public String makeXML() {
		xmlGraph = (Graph) getValue();
		root = getDocument().createElement("graph");
		getDocument().appendChild(root);

		// Make GraphNodo XML
		int size = xmlGraph.getN();
		for (int i = 0; i < size; i++) {
			if (xmlGraph.getNode(i) != null) {
				org.w3c.dom.Node node = createNodeNode(i);
				root.appendChild(node);
			}
		}

		// Make GraphEdge XML
		for (int i = 0; i < size; i++) {
			for (int j = i; j < size; j++) {
				if (xmlGraph.edgeExists(i, j)) {
					org.w3c.dom.Node node = createNodeEdge(i, j);
					root.appendChild(node);
				}
			}
		}
		return root.toString();
	}

	/**
	 * Create a property XML Node
	 */
	private Element createNodeProperty(Property p){
		Element el = getDocument().createElement("property");
		Attr name = getDocument().createAttribute("name");
		name.setValue(p.getName());
		el.setAttributeNode(name);
		
		Attr value = getDocument().createAttribute("value");
		value.setValue(p.toString());
		el.setAttributeNode(value);
		
		return el;
	}


	/**
	* Create Node to XML from Node Graph
	*/
	private org.w3c.dom.Node createNodeNode(int i) {
		Element graphNode = getDocument().createElement("node");

		Element xmlProperties = getDocument().createElement("properties");

		ComponentProperties prop = (xmlGraph.getNode(i)).getProperties();

		// Position
		Position pos = (Position) prop.getPropertyByName("Position");
		xmlProperties.appendChild(createNodeProperty(pos));

		// Label
		Label lbl = (Label) prop.getPropertyByName("Label");
		xmlProperties.appendChild(createNodeProperty(lbl));

		// ID
		ID id =(ID) prop.getPropertyByName("ID");
		xmlProperties.appendChild(createNodeProperty(id));

		// Component Color
		ComponentColor cc = (ComponentColor) prop.getPropertyByName("ComponentColor");
		xmlProperties.appendChild(createNodeProperty(cc));

		graphNode.appendChild(xmlProperties);
		return (graphNode);
	} // end createNodeNode

	/**
	* Create Node to XML from Edge Graph
	*/
	private org.w3c.dom.Node createNodeEdge(int i, int j) {
		Edge e = xmlGraph.getEdge(i, j);

		// edge
		Element graphEdge = getDocument().createElement("edge");

		Attr v1 = getDocument().createAttribute("v1");
		v1.setValue((new Integer(i)).toString());
		graphEdge.setAttributeNode(v1);
		Attr v2 = getDocument().createAttribute("v2");
		v2.setValue((new Integer(j)).toString());
		graphEdge.setAttributeNode(v2);

		// properties
		Element xmlProperties = getDocument().createElement("properties");
		ComponentProperties prop = e.getProperties();

		EdgeWeight edgeweight = (EdgeWeight) prop.getPropertyByName("EdgeWeight");
		xmlProperties.appendChild(createNodeProperty(edgeweight));

		ComponentColor cc = (ComponentColor) prop.getPropertyByName("ComponentColor");
		xmlProperties.appendChild(createNodeProperty(cc));

		graphEdge.appendChild(xmlProperties);
		return graphEdge;
	}

	
	/**
	 * Build a Graph Properties from a Node Element
	 * @return a ComponentProperties object of the element (node or edge)
	 */
	protected ComponentProperties buildGraphProperties(Element graphNode){
		ComponentProperties prop = new ComponentProperties();
		NodeList nodeListProperties = graphNode.getElementsByTagName("properties");
		Element nodeProperties = (Element)nodeListProperties.item(0);
	
		// Gets all node`s property node
		NodeList listProperty = nodeProperties.getElementsByTagName("property");
		
		Element ep;
		for (int j = 0; j < listProperty.getLength(); j++) {
			ep = (Element)listProperty.item(j);
			String attName  = ep.getAttribute("name");
			String attValue = ep.getAttribute("value");
			
			if(attName.equals("Position")){
				Position p = new Position(0,0);
				p.fromString(attValue);
				prop.addProperty(p);
			}else if(attName.equals("Label")){
				Label l = new Label("");
				l.fromString(attValue);
				prop.addProperty(l);
			}else if(attName.equals("ID")){
				ID i = new ID(0);
				i.fromString(attValue);
				prop.addProperty(i);
			}else if(attName.equals("ComponentColor")){
				ComponentColor c = new ComponentColor();
				c.fromString(attValue);
				prop.addProperty(c);
			}else if(attName.equals("EdgeWeight")){
				EdgeWeight e = new EdgeWeight(0);
				e.fromString(attValue);
				prop.addProperty(e);
			}
		}
		return prop;
	}


	/** Create a Graph from a stored XML file */
	public Object readXML(String xmlFileName) {
		Graph g = null;
		
		try {
			// get standart sintatic anliser
			DocumentBuilderFactory factory =
				DocumentBuilderFactory.newInstance();

			// configure aliser to validate
			factory.setValidating(false);

			DocumentBuilder builder = factory.newDocumentBuilder();

			// get XML object document
			setDocument(builder.parse(new File(xmlFileName)));

			// search root nodo
			org.w3c.dom.Node root = getDocument().getDocumentElement();

			if (root.getNodeType() == org.w3c.dom.Node.ELEMENT_NODE) {
				Element nodeGraph = (Element) root;

				g = buildGraphFromXMLElement(nodeGraph);
			}

		} catch (SAXParseException spe) {
			System.err.println("Parser error: " + spe.getMessage());
			System.exit(1);
		} catch (SAXException se) {
			se.printStackTrace();
		} catch (FileNotFoundException fne) {
			System.err.println("File \'" + xmlFileName + "\' not found.");
			System.exit(1);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return g;

	}

	/**
	 * @param xmlGraph
	 * @return 
	 */
	public Graph buildGraphFromXMLElement(Element xmlGraph) {
		// Create a Graph
		Graph graph = new GTCGraph();

		// Gets all graph nodes
		NodeList nodeNode = xmlGraph.getElementsByTagName("node");
		ComponentProperties nodeProp = new ComponentProperties();

		for (int i = 0; i < nodeNode.getLength(); i++) {
			Element graphNode = (Element) nodeNode.item(i);
			nodeProp = buildGraphProperties(graphNode);
			Node node = new SimpleNode(nodeProp);
			graph.addNode(node);
		}

		// Gets all graph edges
		NodeList nodeEdge = xmlGraph.getElementsByTagName("edge");
		ComponentProperties edgeProp = new ComponentProperties();

		for (int i = 0; i < nodeEdge.getLength(); i++) {
			Element graphEdge = (Element) nodeEdge.item(i);

			// Nodes attributes v1 and v2
			String nodeV1 = graphEdge.getAttribute("v1");
			String nodeV2 = graphEdge.getAttribute("v2");

			// Create Edge properties and add it to Graph
			edgeProp = buildGraphProperties(graphEdge);
			graph.addEdge(
				new Edge(
					(new Integer(nodeV1)).intValue(),
					(new Integer(nodeV2)).intValue(),
					edgeProp));
		}
		
		return graph;
	}

	/**
	 * Retrieves the root XML element for this DAO. This method should
	 * only be called after 'makeXML' has been executed.
	 * @see ring.dao.XMLDataAccessObject#getRootElement()
	 */
	public Element getRootElement() {
		return root;
	}

}