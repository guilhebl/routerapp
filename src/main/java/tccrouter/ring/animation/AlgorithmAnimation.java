
package tccrouter.ring.animation;

import java.util.Vector;

import tccrouter.diamante.core.graph.Graph;

/**
 * Represents an executed algorithm, storing the graph on which the
 * execution was taken and the commands executed during the algorithm. 
 */
public class AlgorithmAnimation {
	
	/**
	 * The graph on which the algorithm has been executed.
	 */
	Graph graph;
	/**
	 * A list of commands executed over the graph.
	 */
	Vector commands;
	
	/**
	 * Creates an instance of this class.
	 * @param graph
	 * @param commands
	 */
	public AlgorithmAnimation(Graph graph, Vector commands) {
		this.graph = graph;
		this.commands = commands;
	}
	
	/**
	 * @return Returns the commands.
	 */
	public Vector getCommands() {
		return commands;
	}
	
	/**
	 * @return Returns the graph.
	 */
	public Graph getGraph() {
		return graph;
	}
}
