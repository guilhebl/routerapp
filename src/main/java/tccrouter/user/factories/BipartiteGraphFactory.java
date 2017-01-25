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
package tccrouter.user.factories;

import java.awt.Color;
import java.util.HashMap;

import tccrouter.diamante.core.graph.Edge;
import tccrouter.diamante.core.graph.Graph;
import tccrouter.diamante.core.graph.Node;
import tccrouter.diamante.core.graph.SimpleNode;
import tccrouter.diamante.core.graph.factory.DefaultValueTypeProperty;
import tccrouter.diamante.core.graph.factory.GraphFactory;
import tccrouter.diamante.core.graph.property.ComponentProperties;
import tccrouter.diamante.extension.graph.property.ComponentColor;
import tccrouter.diamante.extension.graph.property.EdgeWeight;
import tccrouter.diamante.extension.graph.property.ID;
import tccrouter.diamante.extension.graph.property.Label;
import tccrouter.diamante.extension.graph.property.Position;
import tccrouter.ring.graph.GTCGraph;

/**
 * Responsible for creating bipartite graphs.
 */
public class BipartiteGraphFactory extends GraphFactory {
	
	
	DefaultValueTypeProperty numberNodesK, numberNodesM;
	
	/**
	 * Creates an instance of this class.
	 */
	public BipartiteGraphFactory() {
		super();

		numberNodesK = new DefaultValueTypeProperty(this,"Number of Nodes in K","int","3");
		numberNodesM = new DefaultValueTypeProperty(this,"Number of Nodes in M","int","2");
		
	}
	
	/**
	 * Creates a new bipartite graph.
	 * @return a bipartite graph
	 */
	public Graph createGraph(HashMap neededProperties) {
		this.neededProperties = neededProperties;
		Graph g = new GTCGraph();
		
		// Create the K nodes and their properties
		for (int i=0 ; i<this.getK() ; i++) {
			ComponentProperties properties = new ComponentProperties();
			properties.addProperty(new Position(0,0));
			properties.addProperty(new Label("v"+i));
			properties.addProperty(new ComponentColor());
			properties.addProperty(new ID(i));
			Node node = new SimpleNode(properties);
			
			g.addNode(node);
		}
		
		// Create the M nodes and their properties
		int gn = getK()+getM();
		for (int i=getK() ; i<gn ; i++) {
			ComponentProperties properties = new ComponentProperties();
			properties.addProperty(new Position(0,0));
			properties.addProperty(new Label("v"+i));
			ComponentColor colorProp = new ComponentColor();
			colorProp.setValue(Color.GREEN);
			properties.addProperty(colorProp);
			properties.addProperty(new ID(i));
			Node node = new SimpleNode(properties);
			
			g.addNode(node);
			
			// Create the edges and their properties with another set
			for(int j=0; j<getK();j++){
				ComponentProperties edgeProperties = new ComponentProperties();
				ComponentColor edgeColorProp = new ComponentColor();
				edgeColorProp.setValue(Color.BLACK);
				edgeProperties.addProperty(edgeColorProp);
				edgeProperties.addProperty(new EdgeWeight(generateWeight()));
				g.addEdge(new Edge(i,j,edgeProperties));
			}
		}
		
		return g;
	}
	
	/**
	 * Retrieves a description of the graphs created by this class.
	 */
	public String toString() {
		return "Bipartite graph";
	}
	
	/**
	 * Randomly generates the weight for edges.
	 * @return the generated weight
	 */
	int generateWeight() {
		int weight = (int)(10*Math.random());
		if (weight == 0) weight = 1;
		
		return weight;
	}
	
	/**
	 * Sets the number of nodes constraint on the factory in part K.
	 * @param k the new number of nodes in part K
	 */
	public void setK (int k){
		numberNodesK.setValue(""+k);
	}

	/**
	 * Sets the number of nodes constraint on the factory in part M.
	 * @param k the new number of nodes in part M
	 */
	public void setM (int m){
		numberNodesK.setValue(""+m);
	}
	
	/**
	 * Retrieves the number of nodes constraint on the factory in part K.
	 * @return the number of nodes in part K
	 */
	public int getK (){
		return (new Integer(numberNodesK.getValue()).intValue());
	}

	/**
	 * Retrieves the number of nodes constraint on the factory in part M.
	 * @return the number of nodes in part M
	 */
	public int getM (){
		return (new Integer(numberNodesM.getValue()).intValue());
	}

}
