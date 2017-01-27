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
package tccrouter.ring.gui.view;

import java.awt.BorderLayout;

import tccrouter.diamante.core.graph.Graph;
import tccrouter.ring.gui.context.UIView;
import tccrouter.ring.gui.graphdrawing.GraphWorkspace;

/**
 *
 */
public class WorkspaceUIView extends UIView {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6403374871836836299L;
	/**
	 * 
	 */
	GraphWorkspace workspace;
	
	/**
	 * 
	 */
	public WorkspaceUIView(Graph g, boolean editable, int mode) {
		super(UIView.CENTERED);
		setLayout(new BorderLayout());
		
		workspace = new GraphWorkspace(g,editable);
		workspace.setMode(mode);
		
		add(workspace,BorderLayout.CENTER);
	}

	/**
	 * 
	 */
	public void refresh() {
		workspace.refresh();
	}

	/**
	 * @return
	 */
	public GraphWorkspace getWorkspace() {
		return workspace;
	}
	
	/**
	 * 
	 * @param mode
	 */
	public void setWorkspaceMode(int mode) {
		workspace.setMode(mode);
	}
}
