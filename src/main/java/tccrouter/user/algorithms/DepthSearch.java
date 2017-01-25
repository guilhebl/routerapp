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
package tccrouter.user.algorithms;

import java.util.Arrays;

import tccrouter.diamante.core.command.Algorithm;
import tccrouter.diamante.core.graph.Edge;
import tccrouter.diamante.core.graph.Graph;
import tccrouter.diamante.core.graph.Node;
import tccrouter.gbl.common.entity.TSProblemModel;

/**
 * A sample algorithm that will visit the components of a graph and
 * paints each component in a different color. A component is a connected
 * set of nodes.
 */
public class DepthSearch extends Algorithm {

	/**
	 * Array to indicate whether or not a node has been visited.
	 */
	boolean visited [];
	/**
	 * Array to indicate whether or not a node has been colored.
	 */
	boolean colored [];
	/**
	 * The variety of colors to paint different components.
	 */
	String colors [] = {"0,255,0","255,255,0","255,0,0","255,100,0","0,0,0",
						"0,255,255","150,150,150","255,0,255","255,255,255"};
	/**
	 * The node from which the depth search will start.
	 */
	int start;
	/**
	 * The number of colors used.
	 */
	int colorCount;

	/**
	 * Creates an instance of this algorithm. Following the GraphEditor standard
	 * for algorithm parameters, the first parameter should always be a graph, 
	 * followed by the nodes that the algorithm requires.
	 * @param g the graph on which the algorithm will be run
	 * @param start the starting node of the depth search
	 */
	public DepthSearch (Graph g) {
		super(g,"DepthSearch");
		this.start = TSProblemModel.getInstance().getSourceNodeIndex();
		this.colorCount = 0;
	}

	/**
	 * Runs the algorithm once for each component in the graph and colors that
	 * component's nodes with a different color.
	 * @see diamante.core.command.Command#execute()
	 */
	public void execute() {
		// Create the arrays and fills them with no values
		visited = new boolean[g.getN()];
		colored = new boolean[g.getN()];
		Arrays.fill(visited,false);
		Arrays.fill(colored,false);

		// Start the depth search by the node received as a parameter
		visit(start);

		/*
		 * For each non-visited node, visit it - this will visit all components,
		 * since the depth search visits all reachable nodes from the starting one
		 */ 
		for (int i=0 ; i<g.getN() ; i++) {
			if (!visited[i]) {
				for (int j=0 ; j<g.getN() ; j++) {
					if (visited[j] && !colored[j]) {
						/*
						 * Retrieves the node and its property and colors it in a 
						 * different color. Sets this color so that nodes in its
						 * component are colored in the same color.
						 */
						Node n = g.getNode(j);
						
						if (n != null) {
							// Set the current color to node j
							// g.setNodeProperty(j,"ComponentColor",colors[colorCount]);
							
							// Indicate that node 'j' has been colored
							colored[j] = true;
						}
					}
				}

				if (g.getNode(i) != null) {
					// Set the color for the next component
					colorCount = (colorCount + 1) % colors.length;
				
					// Visit the next component
					visit(i);
				}
			}
		}
	}
	
	/**
	 * Visits all the nodes that are reachable from node v
	 * @param v the starting node of the search
	 */
	void visit (int v) {
		// Indicate that node 'v' has been visited
		visited[v] = true;

		// Set the current color to node j
		g.setNodeProperty(v,"ComponentColor",colors[colorCount]);

		// Visit all nodes adjacent to 'v'
		for (int w=0 ; w<g.getN() ; w++) {
			if(g.e(v,w) && !visited[w]) {
				// Highlight the edge that has been used in the search path
				Edge e = g.getEdge(v,w);
				
				if (e != null) {
					//ComponentColor color = (ComponentColor) e.getProperties().getPropertyByName("ComponentColor");
					//color.setColor(Color.BLUE);
					g.setEdgeProperty(v,w,"ComponentColor","0,0,255");
				}
				
				// Visit the next node in this path
				visit(w);
			}
		}
	}
}
