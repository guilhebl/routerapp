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

import java.util.HashMap;

import tccrouter.diamante.core.graph.Graph;
import tccrouter.diamante.core.graph.Node;
import tccrouter.diamante.core.graph.SimpleNode;
import tccrouter.diamante.core.graph.factory.DefaultValueTypeProperty;
import tccrouter.diamante.core.graph.factory.GraphFactory;
import tccrouter.diamante.core.graph.property.ComponentProperties;
import tccrouter.diamante.extension.graph.property.ComponentColor;
import tccrouter.diamante.extension.graph.property.ID;
import tccrouter.diamante.extension.graph.property.Label;
import tccrouter.diamante.extension.graph.property.Position;
import tccrouter.ring.graph.GTCGraph;

/**
 * Responsible for creating null graphs (graphs without edges).
 */
public class NullGraphFactory extends GraphFactory {
	
	DefaultValueTypeProperty numberNodes;
	
	/**
	 * Creates an instance of this class.
	 */
	public NullGraphFactory() {
		super();
		numberNodes = new DefaultValueTypeProperty(this,"Number of Nodes","int","5");
	}
	
	/**
	 * Creates a new null graph.
	 * @return a null graph
	 */
	public Graph createGraph(HashMap neededProperties) {
		this.neededProperties = neededProperties;
		Graph g = new GTCGraph();
		int gn = (new Integer(numberNodes.getValue()).intValue());

		for (int i=0 ; i<gn ; i++) {
			ComponentProperties properties = new ComponentProperties();
			properties.addProperty(new Position(0,0));
			properties.addProperty(new Label("v"+i));
			properties.addProperty(new ComponentColor());
			properties.addProperty(new ID(i));
			Node node = new SimpleNode(properties);
			
			g.addNode(node);
		}
		
		return g;
	}
	
	/**
	 * Retrieves a description of the graphs created by this class.
	 */
	public String toString() {
		return "Null graph";
	}

}
