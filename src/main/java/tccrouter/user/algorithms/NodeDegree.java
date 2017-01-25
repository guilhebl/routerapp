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

import tccrouter.diamante.core.command.Algorithm;
import tccrouter.diamante.core.graph.Graph;
import tccrouter.diamante.core.util.OutputSender;
import tccrouter.diamante.extension.graph.property.Label;
import tccrouter.gbl.common.entity.TSProblemModel;

/**
 * A sample algorithm that calculates de degree of a given node
 */
public class NodeDegree  extends Algorithm {

	/**
	 * The node received as a parameter to calculate its degree.
	 */
	int node;
	
	/**
	 * Creates an instance of this algorithm and receives the graph and
	 * node on which the algorithm will be run
	 * @param g the graph on which the algorithm will be run
	 * @param node the node whose degree will be calculated
	 */
	public NodeDegree(Graph g) {
		super(g,"NodeDegree");
		this.node = TSProblemModel.getInstance().getSourceNodeIndex();
	}
	
	/**
	 * Runs the degree calculation, counting how many edges are linked to
	 * the given node.
	 */
	public void execute () {
		int countDegree = 0,
			n           = g.getN();

		// Counts the number of edges linked to the node
		for (int i=0 ; i<n ; i++) {
			if (g.e(node,i))
				countDegree++;
		}
		
		// Shows a reply message with the label and degree of the node
		OutputSender.showMessageDialog(
			"The degree of node "+
				((Label)g.getNodeProperty(node,"Label")).getValue() +
				" is: " +
				countDegree,
			"Node degree",
			OutputSender.INFORMATION_MESSAGE
		);
	}

}
