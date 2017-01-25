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
import java.util.Vector;

import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.Timer;

import tccrouter.diamante.core.command.Algorithm;
import tccrouter.diamante.core.command.Command;
import tccrouter.diamante.core.graph.Graph;
import tccrouter.diamante.core.graph.event.EdgeTestEvent;
import tccrouter.diamante.core.graph.event.GraphEvent;
import tccrouter.diamante.core.graph.event.GraphObserver;
import tccrouter.ring.dao.AbstractDAOFactory;
import tccrouter.ring.gui.event.AlgorithmObserver;
import tccrouter.ring.gui.graphdrawing.GraphWorkspace;

/**
 * A window to display the online execution of an algorithm. Thread controls
 * are implemented in this class in order to allow the user to see the algorithm
 * steps as they are executed. When an algorithm executes a property change command, 
 * the GraphObserver interface implementation ensures that this class's 
 * 'graphEventOccurred' method will be called; the algorithm thread will be then
 * paused until the user chooses to see the following steps.
 */
public class OnlineAlgorithmAnimationWindow extends JDialog
	implements GraphObserver,AlgorithmObserver {
	
	/**
	 * The algorithm that will be animated on this window.
	 */
	Algorithm algorithm;
	/**
	 * The graph on which the algorithm has been run.
	 */
	Graph g;
	/**
	 * The workspace on which the animation steps are shown.
	 */
	GraphWorkspace workspace;
	/**
	 * The timer that alows an automatic, time-based, stepping mechanism.
	 */
	Timer timer;
	/**
	 * The thread in which the algorithm will be executed.
	 */
	Thread execThread;
	/**
	 * The current frame of the animation (animation's current step).
	 */
	int frame;
	/**
	 * An array of flags to indicate which commands have already been executed.
	 */
	Vector executed;
	/**
	 * An index to the last command executed, to allow both online and offline
	 * animations.
	 */
	int lastCommand;
	/**
	 * The algorithm's commands list.
	 */
	Vector commands;
	/**
	 * A flag that indicates whether or not the algorithm has finished its
	 * online execution.
	 */
	boolean algorithmFinished;
	/**
	 * 
	 */
	JButton saveButton;
	/**
	 * 
	 */
    private UIFacade uiFacade = UIFacade.getInstance();
		
	/**
	 * Creates an instance of this class.
	 * @param algorithm the algorithm to be presented
	 * @param g the graph on which the algorithm has been run
	 */
	public OnlineAlgorithmAnimationWindow (String algName, Graph g) {
		this.setTitle("Executing [ " + algName + " ] algorithm");
		this.setSize(800,600);
		this.setResizable(false);
		//this.setModal(true);
		
		addWindowListener(new WindowAdapter(){
			public void windowClosing (WindowEvent e) {
				fastForward();
			}
		});
		
		//commands = g.getCommands();
		workspace = new GraphWorkspace(g,true);
		workspace.setMode(GraphWorkspace.NODE_SELECTION);
		
		frame = 0;
		executed = new Vector();
		executed.insertElementAt(new Boolean(true),frame);
		executed.insertElementAt(new Boolean(false),frame+1);
		frame++;
		lastCommand = frame;
		algorithmFinished = false;

		timer = new Timer(1000,new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				if (evt.getSource() == timer)
					stepForward();
					workspace.refresh();
			}
		});
		
		this.execThread = new Thread(new AlgorithmExecutionThread(algName,g,workspace,this));
		this.g           = g;
		g.addGraphObserver(this);
		
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
		
		saveButton = new JButton(
			new AbstractAction(
				"",
				new ImageIcon(Toolkit.getDefaultToolkit().createImage(getClass().getClassLoader().getResource("images/Save24.gif")))) {
				public void actionPerformed (ActionEvent evt) {
					rewind();
					AbstractDAOFactory factory = AbstractDAOFactory.getDAOFactory(
						AbstractDAOFactory.XML_ANIMATION,
						algorithm
					);
					
					factory.makeObject();
					factory.saveObject();
				}
			}
		);
		saveButton.setEnabled(false);
		
		JPanel buttonsPanel = new JPanel();
		buttonsPanel.setLayout(new BoxLayout(buttonsPanel,BoxLayout.X_AXIS));
		buttonsPanel.setBorder(BorderFactory.createEmptyBorder(10,225,10,225));
		buttonsPanel.add(rewButton);
		buttonsPanel.add(stepBackButton);
		buttonsPanel.add(pauseButton);
		buttonsPanel.add(playButton);
		buttonsPanel.add(stepForwardButton);
		buttonsPanel.add(ffButton);
		buttonsPanel.add(saveButton);
		
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(workspace,BorderLayout.CENTER);
		getContentPane().add(buttonsPanel,BorderLayout.SOUTH);
	}

	/**
	 * Runs a step forward in the algorithm animation. If the command
	 * has already been executed, an offline animation will be shown.
	 * Otherwise, the algorithm execution thread will be awaken for
	 * execution. A call to this method will notify the algorithm thread
	 *  to re-start running and stop the control (i.e. user interaction) thread.
	 */
	private synchronized void stepForward() {
		if (lastCommand >= frame) {
			//online animation
			if (frame >= commands.size() && !algorithmFinished) {
				executed.setElementAt(new Boolean(true),frame);
				frame++;
				lastCommand++;
				executed.insertElementAt(new Boolean(false),frame);
				notify();
				if (execThread.isAlive()) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			//offline animation
			else {
				if (!((Boolean)executed.get(frame)).booleanValue()) {
					Command cmd = (Command) commands.elementAt(frame);
					cmd.execute();
					executed.setElementAt(new Boolean(true),frame);
					frame++;
				
					if (frame > commands.size()) {
						frame = commands.size() - 1;
						executed.setElementAt(new Boolean(true),frame);
					}
				}
			}
		}
	}

	/**
	 * Unexecutes the current command in the algorithm animation. This
	 * operation is always offline, and will allow the user to see 
	 * previously executed animation steps.
	 */
	private void stepBackward() {
		if (frame >= 0) {
			int k = 0;
			
			if (((Boolean)executed.get(frame)).booleanValue())
				k = frame;
			else if (((Boolean)executed.get(frame-1)).booleanValue())
				k = frame - 1;
			
			frame--;	
			if (k >= commands.size())
				k--;
			else if (frame < 0)
				frame = 0;
				
			Command cmd = (Command) commands.elementAt(k);
			if (cmd !=null)	{		
				cmd.unexecute();
				executed.setElementAt(new Boolean(false),k);
			}
		}
	}
	
	/**
	 * Calls 'stepForward' until the algorithm is finished.
	 */
	private void fastForward() {
		while (!algorithmFinished || frame < commands.size()) {
			stepForward();
		}
	}
	
	/**
	 * Rewinds the animation to its beginning.
	 */
	private void rewind() {
		while (frame > 0) {
			if (((Boolean)executed.get(frame)).booleanValue() || ((Boolean)executed.get(frame-1)).booleanValue())
				stepBackward();
		}
		
		frame = 0;
	}
	
	/**
	 * Stops the 'play' timer thread to pause the animation.
	 */
	private void pause() {
		timer.stop();
	}

	/**
	 * This method is called by the running algorithm when an event occurs.
	 * It will stop the algorithm thread and set the control thread to run
	 * again, so that the user can take an action on the GUI.
	 * @see diamante.core.graph.event.GraphObserver#graphEventOccurred(diamante.core.graph.event.GraphEvent)
	 */
	public synchronized void graphEventOccurred(GraphEvent evt) {
		if (evt instanceof EdgeTestEvent) {
			EdgeTestEvent test = (EdgeTestEvent) evt;
			
			// highlight the edge
			
			// TODO remove the following command once edge tests work
			frame--;
		}

		workspace.refresh();
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Shows this window and starts the algorithm execution thread so that
	 * the algorithm can start running.
	 * @see java.awt.Component#show()
	 */
	public void show() {
		super.show();
		workspace.refresh();
		
		execThread.start();
	}

	/**
	 * This method is the last action that the algorithm execution thread
	 * will take; it will notify the user-interaction thread that it can
	 * resume its execution.
	 * @see ring.gui.event.AlgorithmObserver#algorithmFinished()
	 */
	public synchronized void algorithmFinished(Algorithm alg) {
		lastCommand = --frame;
		algorithmFinished = true;
		timer.stop();

		notify();
		workspace.refresh();
		
		uiFacade.refreshViews();
		saveButton.setEnabled(true);
	}

	/**
	 * This method is called by the algorithm execution thread when the
	 * algorithm is started (i. e. all constructor parameters have been
	 * input, the algorithm instance has been created and the 'execute'
	 * method is about to be called).
	 */
	public void algorithmStarted(Algorithm alg) {
		commands = alg.getSubCommands();
		algorithm = alg;
	}

	/**
	 * @see ring.gui.event.AlgorithmObserver#exceptionRaised(java.lang.Exception)
	 */
	public void exceptionRaised(Exception exc) {
	}
}
