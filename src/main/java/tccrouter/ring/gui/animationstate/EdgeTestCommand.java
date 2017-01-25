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
package tccrouter.ring.gui.animationstate;

import tccrouter.diamante.core.command.Command;
import tccrouter.diamante.core.graph.Graph;
import tccrouter.ring.gui.UIFacade;
import tccrouter.ring.gui.graphdrawing.GraphWorkspace;

public class EdgeTestCommand extends Command {
	
	/**
	 *
	 */
	GraphWorkspace workspace;
	/**
	 *
	 */
	int n1;
	/**
	 *
	 */
	int n2;
	
	/**
	 *
	 */
	public EdgeTestCommand(Graph g, GraphWorkspace workspace, int n1, int n2) {
		super(g);
		this.workspace = workspace;
		this.n1 = n1;
		this.n2 = n2;
	}
	
	/**
	 * 
	 */
	public void execute() {
		//workspace.highlightEdge(n1,n2);
		UIFacade.getInstance().getWorkspace().highlightEdge(n1,n2);
	}

	/**
	 * 
	 */
	public void unexecute() {
		
	}
	
	/**
	 *
	 */
	public int getN1() {
		return n1;
	}
	
	/**
	 *
	 */
	public int getN2() {
		return n2;
	}
	
}
