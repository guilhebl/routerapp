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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.Timer;

import tccrouter.diamante.core.command.Algorithm;
import tccrouter.diamante.core.command.Command;
import tccrouter.diamante.core.graph.Graph;
import tccrouter.diamante.core.graph.event.EdgeTestEvent;
import tccrouter.diamante.core.graph.event.GraphEvent;
import tccrouter.diamante.core.graph.event.GraphObserver;
import tccrouter.ring.gui.AlgorithmErrorDialog;
import tccrouter.ring.gui.AlgorithmExecutionThread;
import tccrouter.ring.gui.UIFacade;
import tccrouter.ring.gui.context.UIOperation;
import tccrouter.ring.gui.context.UIState;
import tccrouter.ring.gui.context.UIView;
import tccrouter.ring.gui.event.AlgorithmObserver;
import tccrouter.ring.gui.graphdrawing.GraphWorkspace;
import tccrouter.ring.gui.view.WorkspaceUIView;

/**
 *
 */
public class AnimationUIState extends UIState implements GraphObserver, AlgorithmObserver {

	/**
	 * The algorithm that will be animated on this window.
	 */
	Algorithm algorithm;
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
	String algName;
	/**
	 * 
	 */
	Graph graph;
	/**
	 * 
	 */
	WorkspaceUIView animationView;
	/**
	 * 
	 */
	SaveAnimationUIOperation saveOperation;
	/**
	 * 
	 */
	UIFacade uiFacade = UIFacade.getInstance();
	/**
	 * 
	 */
	private boolean showEdgeTests;
	/**
	 * 
	 */
	AnimationUIState animationState;
	
	/**
	 * 
	 *
	 */
	public AnimationUIState(Graph graph) {
		this.graph = graph;
		animationView = 
			new WorkspaceUIView(
					graph,
					true,
					GraphWorkspace.NODE_SELECTION
			);

	}
	
	/**
	 * 
	 */
	public AnimationUIState(String algName, Graph g) {
		this.algName       = algName;
		this.graph   	   = g;
		this.showEdgeTests = true;
		animationView = 
			new WorkspaceUIView(
					graph,
					true,
					GraphWorkspace.NODE_SELECTION
			);
	

	}
	
	/**
	 * 
	 * @return
	 */
	protected UIOperation[] loadOperations() {
		return new UIOperation[] {
				new RewindUIOperation(this,true),
				new StepBackwardUIOperation(this,true),
				new PauseUIOperation(this,true),
				new PlayUIOperation(this,true),
				new StepForwardUIOperation(this,true),
				new FastForwardUIOperation(this,true),
				new TurnOffUIOperation(this,true),
				saveOperation = new SaveAnimationUIOperation(this,false)
		};	   
	}
	
	/**
	 * 
	 * @return
	 */
	protected UIView[] loadViews() {
		return new UIView[] {
			animationView
		};
	}
	
	/**
	 * @see ring.gui.context.UIState#loadState()
	 */
	public void loadState() {
		init();
		executed = new Vector();
		executed.insertElementAt(new Boolean(true),frame);
		executed.insertElementAt(new Boolean(false),frame+1);
		frame++;
		lastCommand = frame;
		algorithmFinished = false;

		this.execThread = new Thread(new AlgorithmExecutionThread(algName,graph,animationView.getWorkspace(),this));
		graph.addGraphObserver(this);
		
		animationView.refresh();
		execThread.start();
	}
	
	/**
	 * 
	 */
	protected void init() {
		super.loadState();

		frame = 0;
		timer = new Timer(1000,new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				if (evt.getSource() == timer)
					stepForward();
					animationView.refresh();
			}
		});
	}

	/**
	 * Runs a step forward in the algorithm animation. If the command
	 * has already been executed, an offline animation will be shown.
	 * Otherwise, the algorithm execution thread will be awaken for
	 * execution. A call to this method will notify the algorithm thread
	 *  to re-start running and stop the control (i.e. user interaction) thread.
	 */
	protected synchronized void stepForward() {
		if (lastCommand >= frame) {
			//online animation
			if (frame >= commands.size() && !algorithmFinished) {
				executed.setElementAt(new Boolean(true),frame);
				frame++;
				lastCommand++;
				executed.insertElementAt(new Boolean(false),frame);
				
				// wake-up the algorithm thread
				notify();
				if (execThread.isAlive()) {
					try {
						// stop the user interface thread
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
					
					if (cmd instanceof EdgeTestCommand) {
						if (showEdgeTests)
							cmd.execute();
					}
					else
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
		
		animationView.refresh();
	}

	/**
	 * Unexecutes the current command in the algorithm animation. This
	 * operation is always offline, and will allow the user to see 
	 * previously executed animation steps.
	 */
	protected void stepBackward() {
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
				while ((cmd instanceof EdgeTestCommand) && (k > 0)) {
					executed.setElementAt(new Boolean(false),k--);
					cmd = (Command) commands.elementAt(k);
					frame--;
				}
				cmd.unexecute();
				executed.setElementAt(new Boolean(false),k);
			}
		}
		
		animationView.refresh();
	}
	
	/**
	 * Calls 'stepForward' until the algorithm is finished.
	 */
	protected void fastForward() {
		boolean show = showEdgeTests;
		showEdgeTests = false;
		while (!algorithmFinished || frame < commands.size()) {
			stepForward();
		}
		
		showEdgeTests = show;
	}
	
	/**
	 * Rewinds the animation to its beginning.
	 */
	protected void rewind() {
		while (frame > 0) {
			if (((Boolean)executed.get(frame)).booleanValue() || ((Boolean)executed.get(frame-1)).booleanValue())
				stepBackward();
		}
		
		frame = 0;
	}
	
	/**
	 * Stops the 'play' timer thread to pause the animation.
	 */
	protected void pause() {
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
			//animationView.getWorkspace().highlightEdge(test.getN1(),test.getN2());
			EdgeTestCommand command = 
				new EdgeTestCommand(
					graph,
					animationView.getWorkspace(),
					test.getN1(),
					test.getN2()
				);
			
			if (showEdgeTests) {
				command.execute();
				
				uiFacade.setStatusMessage(
					"Testing edge (" +
					graph.getNodeProperty(test.getN1(),"Label") + "," +
					graph.getNodeProperty(test.getN2(),"Label") + ")"
				);
			}
			
			commands.addElement(command);
			
			// TODO remove the following command once edge tests work
			//frame--;
		}

		animationView.refresh();
		
		System.out.println("Calling NOTIFY ALL - animation graphEvent" + Thread.currentThread().getName());
		
//		// wake-up the user interface thread
//		notifyAll();
//		try {
//			// stop the algorithm thread
//			wait();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		System.out.println("end of animation graphEvent" + Thread.currentThread().getName());
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
		animationView.refresh();
		
		saveOperation.setEnabled(true);
		graph.removeGraphObserver(this);
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
	 * 
	 */
	public void start() {
		timer.start();
	}

	/**
	 * @return
	 */
	public Graph getGraph() {
		return graph;
	}

	/**
	 * 
	 */
	public void saveAnimation() {
		rewind();
		/*AbstractDAOFactory factory = AbstractDAOFactory.getDAOFactory(
			AbstractDAOFactory.XML_ANIMATION,
			algorithm
		);
		
		factory.makeObject();
		factory.saveObject();*/
		uiFacade.saveAnimation(algorithm);
	}
	
	/**
	 *
	 */
	public GraphWorkspace getWorkspace() {
		return animationView.getWorkspace();
	}
	
	/**
	 *
	 */
	public WorkspaceUIView getAnimationView() {
		return animationView;
	}

	/**
	 * @see ring.gui.event.AlgorithmObserver#exceptionRaised(java.lang.Exception)
	 */
	public synchronized void exceptionRaised(Exception exc) {
		// wake up the user-interface thread
		notify();
		
		AlgorithmErrorDialog.getInstance().showErrorMessage(exc);
		if (execThread.isAlive()) {
			try {
				// stop the algorithm thread
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
