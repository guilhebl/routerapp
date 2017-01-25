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
package tccrouter.ring.gui;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;
import java.util.Vector;

import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.Timer;

import tccrouter.diamante.core.command.Command;
import tccrouter.ring.animation.AlgorithmAnimation;
import tccrouter.ring.gui.graphdrawing.GraphWorkspace;

/**
 * 
 */
public class OfflineAlgorithmAnimationWindow extends JDialog implements ActionListener {
	
	/**
	 * 
	 */
	AlgorithmAnimation animation;
	/**
	 * The algorithm's commands list.
	 */
	Vector commands;
	/**
	 * The current frame of the animation (animation's current step).
	 */
	int frame;
	/**
	 * The workspace on which the animation steps are shown.
	 */
	GraphWorkspace workspace;
	/**
	 * The timer that alows an automatic, time-based, stepping mechanism.
	 */
	Timer timer;
	/**
	 * An array of flags to indicate which commands have already been executed.
	 */
	boolean[] executed;
	
	/**
	 * Creates an instance of this class.
	 * @param algorithm the algorithm to be presented
	 * @param g the graph on which the algorithm has been run
	 */
	public OfflineAlgorithmAnimationWindow (AlgorithmAnimation animation) {
		this.setTitle("Algorithm animation");
		this.setSize(800,600);
		this.setResizable(false);
		this.setModal(true);
		
		addWindowListener(new WindowAdapter(){
			public void windowClosing (WindowEvent e) {
				fastForward();
			}
		});
		
		this.animation = animation;
		this.commands  = animation.getCommands();
		
		frame = 0;
		workspace = new GraphWorkspace(animation.getGraph(),false);
		timer = new Timer(1000,this);
		executed = new boolean[commands.size()];
		Arrays.fill(executed,false);
		
		JButton playButton = new JButton(
			new AbstractAction(
				"",
				new ImageIcon(Toolkit.getDefaultToolkit().createImage(getClass().getClassLoader().getResource("images/Play.gif")))) {
				public void actionPerformed (ActionEvent evt) {
					timer.start();
				}
			}
		);
		
		JButton pauseButton = new JButton(
			new AbstractAction(
				"",
				new ImageIcon(Toolkit.getDefaultToolkit().createImage(getClass().getClassLoader().getResource("images/Pause.gif")))) {
				public void actionPerformed (ActionEvent evt) {
					pause();
				}
			}
		);

		JButton ffButton = new JButton(
			new AbstractAction(
				"",
				new ImageIcon(Toolkit.getDefaultToolkit().createImage(getClass().getClassLoader().getResource("images/FastForward.gif")))) {
				public void actionPerformed (ActionEvent evt) {
					fastForward();
					workspace.refresh();
				}
			}
		);

		JButton rewButton = new JButton(
			new AbstractAction(
				"",
				new ImageIcon(Toolkit.getDefaultToolkit().createImage(getClass().getClassLoader().getResource("images/Rewind.gif")))) {
				public void actionPerformed (ActionEvent evt) {
					rewind();
					workspace.refresh();
				}
			}
		);

		JButton stepForwardButton = new JButton(
			new AbstractAction(
				"",
				new ImageIcon(Toolkit.getDefaultToolkit().createImage(getClass().getClassLoader().getResource("images/StepForward.gif")))) {
				public void actionPerformed (ActionEvent evt) {
					stepForward();
					workspace.refresh();
				}
			}
		);

		JButton stepBackButton = new JButton(
			new AbstractAction(
				"",
				new ImageIcon(Toolkit.getDefaultToolkit().createImage(getClass().getClassLoader().getResource("images/StepBack.gif")))) {
				public void actionPerformed (ActionEvent evt) {
					stepBackward();
					workspace.refresh();
				}
			}
		);

		JPanel buttonsPanel = new JPanel();
		buttonsPanel.setLayout(new BoxLayout(buttonsPanel,BoxLayout.X_AXIS));
		buttonsPanel.setBorder(BorderFactory.createEmptyBorder(10,115,10,115));
		buttonsPanel.add(rewButton);
		buttonsPanel.add(stepBackButton);
		buttonsPanel.add(pauseButton);
		buttonsPanel.add(playButton);
		buttonsPanel.add(stepForwardButton);
		buttonsPanel.add(ffButton);
		
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(workspace,BorderLayout.CENTER);
		getContentPane().add(buttonsPanel,BorderLayout.SOUTH);
		
		workspace.refresh();
	}

	/**
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	public void actionPerformed(ActionEvent evt) {
		if (evt.getSource() == timer)
			stepForward();
			workspace.refresh();
			
			int size = executed.length - 1;
			if (frame == size && executed[size])
				pause();
	}

	/**
	 * 
	 */
	private void stepForward() {
		if (!executed[frame]) {
			if (frame < commands.size()) {
				Command cmd = (Command) commands.elementAt(frame);
				cmd.execute();
				executed[frame++] = true;
			}
			
			if (frame >= commands.size()) {
				frame = commands.size() - 1;
				executed[frame] = true;
			}
		}
	}
	
	/**
	 * 
	 */
	private void stepBackward() {
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
	}
	
	/**
	 * 
	 */
	private void fastForward() {
		while (frame < commands.size() && !executed[executed.length-1]) {
			stepForward();
		}
		
		frame = commands.size() - 1;
	}
	
	/**
	 * 
	 */
	private void rewind() {
		while (frame > 0 && executed[0]) {
			stepBackward();
		}
		
		frame = 0;
	}
	
	/**
	 * 
	 */
	private void pause() {
		timer.stop();
	}
}
