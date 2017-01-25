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

import java.awt.Color;
import java.awt.Point;
import java.io.File;

import tccrouter.diamante.core.command.Algorithm;
import tccrouter.diamante.core.graph.Edge;
import tccrouter.diamante.core.graph.Graph;
import tccrouter.diamante.core.graph.GraphComponent;
import tccrouter.diamante.core.graph.Node;
import tccrouter.diamante.core.graph.layout.GraphLayout;
import tccrouter.diamante.extension.graph.property.ComponentColor;
import tccrouter.ring.animation.AlgorithmAnimation;
import tccrouter.ring.controller.PluginController;
import tccrouter.ring.controller.PreferencesController;
import tccrouter.ring.controller.ProfileController;
import tccrouter.ring.dao.AbstractDAOFactory;
import tccrouter.ring.graph.GTCGraph;
import tccrouter.ring.gui.animationstate.AnimationUIState;
import tccrouter.ring.gui.animationstate.OfflineAnimationUIState;
import tccrouter.ring.gui.context.UIContext;
import tccrouter.ring.gui.context.UIState;
import tccrouter.ring.gui.context.UIView;
import tccrouter.ring.gui.graphdrawing.GraphWorkspace;
import tccrouter.ring.gui.grapheditionstate.GraphEditionUIState;

/**
 * 
 */
public class UIFacade implements NavigationObserver {

    /**
     * 
     */
    private static final String GRAPHS_PATH = "graphs";
    /**
     * 
     */
    private static final String ANIMATIONS_PATH = "animations";
    /**
	 * The unique instance to this class.
	 */
	protected static UIFacade instance;
	/**
	 * The active graph.
	 */
	Graph graph;
	/**
	 * 
	 */
	UIContext context;
	/**
	 * 
	 */
    private MainWindow mainWindow;
	/**
	 *
	 */
    private GraphWorkspace currentWorkspace;
	
	/**
	 * 
	 */
	protected UIFacade() {
		graph = new GTCGraph();
		context = new UIContext();
	}
	
	/**
	 * 
	 * @return
	 */
	public static UIFacade getInstance() {
		if (instance == null)
			instance = new UIFacade();
		
		return instance;
	}

	/**
	 * @return
	 */
	public Graph getGraph() {
		return graph;
	}
	
	/**
	 * Clears all changes made in the current graph's properties,
	 * such as color changes and other property changes.
	 */
	public void setActiveGraphToUserPreferences() {
		setGraphToUserPreferences(this.graph);
	}
	
	/**
	 * 
	 * @param g
	 */
	public void setGraphToUserPreferences(Graph g) {
		int n = g.getN();
		
		for (int i=0 ; i<n ; i++) {
			Node node = g.getNode(i);
			
			if (node != null) {
				ComponentColor color = (ComponentColor) node.getProperties().getPropertyByName("ComponentColor");
				color.setValue(
					PreferencesController.getInstance().getColor(
						PreferencesController.PROPERTIES_CATEGORY,
						PreferencesController.NODE_COLOR_PROPERTY,
						Color.BLUE
					)
				);
			}
			
			for (int j=0 ; j<n ; j++) {
				if (g.edgeExists(i,j)) {
					Edge edge = g.getEdge(i,j);
					
					ComponentColor eColor = (ComponentColor) edge.getProperties().getPropertyByName("ComponentColor");
					eColor.setValue(
						PreferencesController.getInstance().getColor(
							PreferencesController.PROPERTIES_CATEGORY,
							PreferencesController.EDGE_COLOR_PROPERTY,
							Color.BLACK
						)
					);
				}
			}
		}
	}

    /**
     * @return
     */
    public GraphWorkspace getWorkspace() {
        return currentWorkspace;
    }

    /**
     * 
     */
    public void refreshViews() {
        mainWindow.refreshViews();
    }

    /**
     * @param string
     */
    public void setStatusMessage(String msg) {
        mainWindow.setStatusMessage(msg);
    }

    /**
     * @return
     */
    public void requestNode() {
        mainWindow.requestNode();
    }

	/**
	 * Informs the GUI that an algorithm has stoped requesting nodes.
	 */
	public void stopRequestNodes() {
		currentWorkspace.stopRequestNodes();
	}
    
    /**
     * @param string
     * @return
     */
    public void addAlgorithm(String algorithmName) {
        mainWindow.addAlgorithm(algorithmName);
    }

    /**
     * 
     */
    public void appendSeparatorToUserMenu() {
        mainWindow.appendSeparatorToUserMenu();
    }

    /**
     * Open the main window, load the user profile and load the installed plugins.
     */
    public void loadUI() {
		mainWindow = MainWindow.getInstance();
		
		loadGraphEditionState(graph);
		mainWindow.setVisible(true);

        ProfileController.getInstance().loadAlgorithms();
		PluginController.getInstance().loadPlugins();
    }

    /**
     * @see ring.gui.NavigationObserver#graphSelected(java.lang.String)
     */
    public void graphSelected(String name) {
        openGraph(name);
    }

    /**
     * @param name
     */
    public void openGraph(String name) {
        AbstractDAOFactory daoFactory = AbstractDAOFactory.getDAOFactory(AbstractDAOFactory.XML_GRAPH,null);
		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		Graph newGraph = (Graph) daoFactory.readObject(classloader.getResource(name).getFile());
		
		if (newGraph != null) {
			loadGraphEditionState(newGraph);
			refreshViews();
		}
    }

    /**
     * @param id
     */
    public void openJDBCGraph(String id) {
        AbstractDAOFactory daoFactory = AbstractDAOFactory.getDAOFactory(AbstractDAOFactory.JDBC_GRAPH,null);
		
		Graph newGraph = (Graph) daoFactory.readObject(id);
		
		if (newGraph != null) {
			loadGraphEditionState(newGraph);
			refreshViews();
		}
    }
    
    public void loadAnimation(String name) {
        AbstractDAOFactory daoFactory = AbstractDAOFactory.getDAOFactory(AbstractDAOFactory.XML_ANIMATION,null);
        
        AlgorithmAnimation animation = (AlgorithmAnimation) daoFactory.readObject(ANIMATIONS_PATH + name);
		
		if (animation != null) {
			loadOfflineAnimationState(animation);
		}
    }

    /**
     * 
     * @param animation
     */
    public void loadOfflineAnimationState(AlgorithmAnimation animation) {
		OfflineAnimationUIState state = new OfflineAnimationUIState(animation);
		setState(state);
		currentWorkspace = state.getWorkspace();
	}
    
    /**
     * @see ring.gui.NavigationObserver#animationSelected(java.lang.String)
     */
    public void animationSelected(String name) {
        loadAnimation(name);
    }

    /**
     * @see ring.gui.NavigationObserver#algorithmSelected(java.lang.String)
     */
    public void algorithmSelected(String name) {
    }
    
    /**
     * 
     */
    public void loadGraphEditionState(Graph graph) {
    	GraphEditionUIState newState = new GraphEditionUIState(graph);
    	setState(newState);
    	
    	this.graph = graph;
    	currentWorkspace = newState.getWorkspace();
    }

	/**
	 * 
	 * @param state
	 */
	private void setState(UIState state) {
		context.setCurrentState(state);
		
		state.loadState();
		
		// create toolbar
		OperationsToolBar toolbar = new OperationsToolBar(state.getOperations());
		mainWindow.setToolbar(toolbar);
		
		// add views
		for (int i=0 ; i<state.getViews().length ; i++) {
			UIView view = state.getViews()[i];
			
			if (view.getType() == UIView.CENTERED) {
				mainWindow.setCenter(view);
			}
		}
		
		refreshViews();
	}

	/**
	 * @param algName
	 * @param g
	 */
	public void loadAnimationState(String algName, Graph g) {
    	AnimationUIState newState = new AnimationUIState(algName,g);
    	mainWindow.setCenter(newState.getAnimationView());
    	refreshViews();

    	setState(newState);
    	currentWorkspace = newState.getWorkspace();
	}
	

	/**
	 * Shows a property interaction window for the given component.
	 * @param component the component whose properties will be shown
	 * @param pos the position in which the window will be shown
	 */
	public void showPropertyInteractionWindow(GraphComponent component,Point pos) {
		if (component != null) {
			PropertyInteractionDialog window = new PropertyInteractionDialog((int)pos.getX(),(int)pos.getY(),graph,component);
			window.setVisible(true);
		}
	}
	
	/**
	 * 
	 */
	public void doGraphLayout(GraphLayout layout) {
		layout.doLayout(currentWorkspace);
		currentWorkspace.refresh();
	}
	
	/**
	 *
	 */
	public void saveAnimation(Algorithm algorithm) {
		AbstractDAOFactory factory = AbstractDAOFactory.getDAOFactory(
			AbstractDAOFactory.XML_ANIMATION,
			algorithm
		);
		
		factory.makeObject();
		factory.saveObject();
		
		refreshViews();
	}
	
	/**
	 * 
	 * @return
	 */
	public double generateWeight() {
		int weight = (int)(10*Math.random());
		if (weight == 0) weight = 1;
		
		return weight;
	}
}
