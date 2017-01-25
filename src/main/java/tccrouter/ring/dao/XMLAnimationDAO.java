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

import java.io.File;
import java.io.IOException;
import java.util.Vector;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import tccrouter.diamante.core.command.Algorithm;
import tccrouter.diamante.core.command.Command;
import tccrouter.diamante.core.graph.Edge;
import tccrouter.diamante.core.graph.Graph;
import tccrouter.diamante.core.graph.GraphComponent;
import tccrouter.diamante.core.graph.Node;
import tccrouter.diamante.extension.command.InteractivePropertyChangeCommand;
import tccrouter.diamante.extension.graph.property.InteractiveProperty;
import tccrouter.ring.animation.AlgorithmAnimation;
import tccrouter.ring.gui.animationstate.EdgeTestCommand;

/**
 * Handles <code>AlgorithmAnimation</code> input and output in XML files.
 */
public class XMLAnimationDAO extends XMLDataAccessObject {
	
	/**
	 * Key to indicate that a command is a property change.
	 */
	private final static String PROPERTY_CHANGE_TYPE = "PropertyChange";
	/**
	 * Key to indicate that a command is an edge test.
	 */
	private final static String EDGE_TEST_TYPE = "EdgeTest";
	
	/**
	 * The algorithm that has been executed
	 */
	private Algorithm algorithm;
	/**
	 * The root element in the XML document.
	 */
	private Element root;
	/**
	 * The graph on which the algorithm has been executed
	 */
	private Graph g;
	
	/**
	 * Creates an instance of this class.
	 * @param value
	 * @param document
	 */
	public XMLAnimationDAO(Object value,Document document) {
		super(value,document);
	}
	
	/**
	 * Builds an XML document to represent the algorithm animation. This document
	 * consists of the graph on which the execution happened and the animation
	 * steps.
	 * @see ring.dao.XMLDataAccessObject#makeXML()
	 * @return a String representing an XML document
	 */
	public String makeXML() {
		XMLGraphDAO graphDao;
		Element animationElement = getDocument().createElement("animation");
		
		algorithm = (Algorithm) getValue();
		graphDao =  new XMLGraphDAO(algorithm.getGraph(),getDocument());
		root = getDocument().createElement("algorithmAnimation");
		
		graphDao.makeXML();
		root.appendChild(graphDao.getRootElement());
		root.appendChild(animationElement);
		getDocument().appendChild(root);
		
		buildAnimationSteps(animationElement);
		
		return root.toString();
	}
	
	/**
	 * Builds XML elements for the animation steps.
	 * @param animationElement the XML element that represents the algorithm animation
	 */
	private void buildAnimationSteps(Element animationElement) {
		for (int i=0 ; i<algorithm.getSubCommands().size() ; i++) {
			Command cmd = (Command) algorithm.getSubCommands().elementAt(i);
			Element step = getDocument().createElement("step");
			step.setAttribute("id","" + i);
			
			if (cmd instanceof InteractivePropertyChangeCommand) {
				step.appendChild(
					buildPropertyChangeElement((InteractivePropertyChangeCommand) cmd,i)
				);
			}
			else if (cmd instanceof EdgeTestCommand) {
				step.appendChild(
					buildEdgeTestElement((EdgeTestCommand) cmd,i)
				);
			}
			
			animationElement.appendChild(step);
		}
	}

	/**
	 * Builds an XML element for a property change command.
	 * @return the element that has been built
	 */
	private Element buildPropertyChangeElement(InteractivePropertyChangeCommand cmd, int i) {
		Element propChangeElement = getDocument().createElement("command");
		Element component = getDocument().createElement("component");
		
		propChangeElement.setAttribute("type",PROPERTY_CHANGE_TYPE);
		propChangeElement.setAttribute("name",cmd.getProperty().getName());
		propChangeElement.setAttribute("old",cmd.getOldValue());
		propChangeElement.setAttribute("val",cmd.getNewValue());
		
		if (cmd.getComponent() instanceof Node) {
			Element id = getDocument().createElement("id");
			
			id.setAttribute(
				"value",
				cmd.getComponent().getProperties().getPropertyByName("ID").toString()
			);
			component.setAttribute("type","Node");
			component.appendChild(id);
		}
		else {
			Element endpoints = getDocument().createElement("endpoints");
			
			endpoints.setAttribute(
				"n1",
				"" + ((Edge)cmd.getComponent()).getV1()
			);
			endpoints.setAttribute(
				"n2",
				"" + ((Edge)cmd.getComponent()).getV2()
			);
			component.setAttribute("type","Edge");
			component.appendChild(endpoints);
		}
		
		propChangeElement.appendChild(component);
		return propChangeElement;
	}
	
	/**
	 * Builds an XML element for an edge test command.
	 * @return the element that has been built
	 */
	private Element buildEdgeTestElement(EdgeTestCommand cmd, int i) {
		Element edgeTestElement = getDocument().createElement("command");
		
		edgeTestElement.setAttribute("type",EDGE_TEST_TYPE);
		edgeTestElement.setAttribute("n1",new Integer(cmd.getN1()).toString());
		edgeTestElement.setAttribute("n2",new Integer(cmd.getN2()).toString());
		
		return edgeTestElement;
	}
	
	/**
	 * @see ring.dao.XMLDataAccessObject#readXML(java.lang.String)
	 */
	public Object readXML(String xml) {
		Document doc = null;
		XMLGraphDAO graphDao;
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		Vector commands = new Vector();

		try {
			// get DocumentBuilder
			DocumentBuilder builder = factory.newDocumentBuilder();
			
			// make XML root node
			doc = (Document) builder.parse(new File(xml));
			
			graphDao = new XMLGraphDAO(null,doc);
			
			// search root nodo
			org.w3c.dom.Node root = doc.getDocumentElement();

			if (root.getNodeType() == org.w3c.dom.Node.ELEMENT_NODE) {
				Element xmlGraph = (Element) doc.getElementsByTagName("graph").item(0);
				g = graphDao.buildGraphFromXMLElement(xmlGraph);
				Element animation = (Element) doc.getElementsByTagName("animation").item(0);
				NodeList steps = animation.getChildNodes();
				
				for (int i=0 ; i<steps.getLength() ; i++) {
					Element step = (Element) steps.item(i);
					Element xmlCmd = (Element) step.getChildNodes().item(0);
					
					Command cmd = buildCommandFromXMLElement(xmlCmd);
					
					commands.addElement(cmd);
				}
			}
		} catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		setDocument(doc);
		return new AlgorithmAnimation(g,commands);
	}
	
	/**
	 * Builds a command from an XML command element.
	 * @param xmlCmd the XML element that represents an algorithm command
	 * @return the command that has been built
	 */
	private Command buildCommandFromXMLElement(Element xmlCmd) {
		Command cmd = null;
		
		if (xmlCmd.getAttribute("type").equals(PROPERTY_CHANGE_TYPE)) {
			Element xmlComponent = (Element) xmlCmd.getChildNodes().item(0);
			
			GraphComponent component = buildComponentFromXMLElement(xmlComponent);
			
			cmd = new InteractivePropertyChangeCommand(
				getGraph(),
				(InteractiveProperty) component.getProperties().getPropertyByName(xmlCmd.getAttribute("name")),
				component,
				xmlCmd.getAttribute("val")
			);
		}
		else if (xmlCmd.getAttribute("type").equals(EDGE_TEST_TYPE)) {
			cmd = new EdgeTestCommand(
				getGraph(),
				null,
				Integer.parseInt(xmlCmd.getAttribute("n1")),
				Integer.parseInt(xmlCmd.getAttribute("n2"))
			);
		}
		
		return cmd;
	}

	/**
	 * Builds a graph component from an XML component element.
	 * @param xmlComponent the XML element that represents a graph component
	 * @return the graph component that has been built
	 */
	private GraphComponent buildComponentFromXMLElement(Element xmlComponent) {
		GraphComponent component = null;
		
		if (xmlComponent.getAttribute("type").equals("Edge")) {
			Element endpoints = (Element) xmlComponent.getChildNodes().item(0);
			
			component = getGraph().getEdge(
				Integer.parseInt(endpoints.getAttribute("n1")),
				Integer.parseInt(endpoints.getAttribute("n2"))
			);
		}
		else if (xmlComponent.getAttribute("type").equals("Node")) {
			Element id = (Element) xmlComponent.getChildNodes().item(0);
			
			component = getGraph().getNode(
				Integer.parseInt(id.getAttribute("value"))
			);
		}
		
		return component;
	}

	/**
	 * @see ring.dao.XMLDataAccessObject#getRootElement()
	 */
	public Element getRootElement() {
		return null;
	}
	
	/**
	 * @return Returns the graph.
	 */
	protected Graph getGraph() {
		return g;
	}
}
