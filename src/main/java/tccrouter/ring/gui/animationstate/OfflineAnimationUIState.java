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

import java.util.Arrays;

import tccrouter.diamante.core.command.Command;
import tccrouter.ring.animation.AlgorithmAnimation;

/**
 *
 */
public class OfflineAnimationUIState extends AnimationUIState {

	/**
	 * An array of flags to indicate which commands have already been executed.
	 */
	boolean[] executed;
	/**
	 * 
	 */
	private AlgorithmAnimation animation;
	/**
	 * 
	 */
	boolean showEdgeTests;
	
	/**
	 * @param algName
	 * @param g
	 */
	public OfflineAnimationUIState(AlgorithmAnimation animation) {
		super(animation.getGraph());
		
		this.animation = animation;
		this.commands  = animation.getCommands();
		
		frame = 0;
		showEdgeTests = true;
		executed = new boolean[commands.size()];
		Arrays.fill(executed,false);
	}
	
		/**
	 * @see ring.gui.context.UIState#loadState()
	 */
	public void loadState() {
		init();
	}
	
	/**
	 * 
	 */
	protected void stepForward() {
		if (!executed[frame]) {
			if (frame < commands.size()) {
				Command cmd = (Command) commands.elementAt(frame);
				
				if (cmd instanceof EdgeTestCommand) {
					if (showEdgeTests)
						cmd.execute();
				}
				else
					cmd.execute();
				executed[frame++] = true;
			}
			
			if (frame >= commands.size()) {
				frame = commands.size() - 1;
				executed[frame] = true;
			}
		}
		
		animationView.refresh();
	}
	
	/**
	 * 
	 */
	protected void stepBackward() {
		if (frame > 0) {
			int k = 0;
			if (executed[frame])
				k = frame;
			else if (executed[frame-1])
				k = --frame;
				
			Command cmd = (Command) commands.elementAt(k);
			cmd.unexecute();
			executed[k] = false;
		}
		else if (frame == 0 && executed[frame]) {
			Command cmd = (Command) commands.elementAt(frame);
			cmd.unexecute();
			executed[frame] = false;
		}
		
		animationView.refresh();
	}
	
	/**
	 * 
	 */
	protected void fastForward() {
		boolean show = showEdgeTests;
		showEdgeTests = false;
		
		while (frame < commands.size() && !executed[executed.length-1]) {
			stepForward();
		}
		
		frame = commands.size() - 1;
		showEdgeTests = show;
	}
	
	/**
	 * 
	 */
	protected void rewind() {
		while (frame > 0 && executed[0]) {
			stepBackward();
		}
		
		frame = 0;
	}

}
