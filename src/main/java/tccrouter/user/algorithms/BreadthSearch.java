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
import java.util.LinkedList;

import tccrouter.diamante.core.command.Algorithm;
import tccrouter.diamante.core.graph.Graph;
import tccrouter.gbl.common.entity.TSProblemModel;

/**
 * 
 */
public class BreadthSearch extends Algorithm {

	boolean[] visited;
	LinkedList queue;
	int initial;
	
	/**
	 * Creates an instance of this class.
	 * @param g
	 * @param name
	 */
	public BreadthSearch(Graph g) {
		super(g, "Breadth Search");
		this.initial = TSProblemModel.getInstance().getSourceNodeIndex();
		visited = new boolean[g.getN()];
		Arrays.fill(visited,false);
		queue = new LinkedList();
	}

	/**
	 * @see diamante.core.command.Command#execute()
	 */
	public void execute() {
		visited[initial] = true;
		queue.addFirst(new Integer(initial));
		
		while (!queue.isEmpty()) {
			int w = ((Integer) queue.removeLast()).intValue();
			
			g.setNodeProperty(w,"ComponentColor","0,255,0");
			
			for (int z = 0 ; z < g.getN() ; z++) {
				if (g.e(w,z) && !visited[z]) {
					g.setEdgeProperty(z,w,"ComponentColor","0,0,255");
					visited[z] = true;
					queue.addFirst(new Integer(z));
				}
			}
		}
	}

}
