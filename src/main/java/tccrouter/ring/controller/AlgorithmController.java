
package tccrouter.ring.controller;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Hashtable;

import javax.swing.JOptionPane;

import tccrouter.diamante.core.command.Algorithm;
import tccrouter.diamante.core.graph.Graph;
import tccrouter.ring.gui.AlgorithmErrorDialog;
import tccrouter.ring.gui.AlgorithmExecutionThread;
import tccrouter.ring.gui.UIFacade;
import tccrouter.ring.gui.event.AlgorithmObserver;

/**
 * Implements the control of algorithm-related operations, such as inclusion and
 * execution.
 */
public class AlgorithmController implements AlgorithmObserver {
	
	/**
	 * The unique instance of this class.
	 */
    static AlgorithmController instance;
    /**
     * The algorithms included in the program.
     */
    public Hashtable algorithms;
    private UIFacade uiFacade = UIFacade.getInstance();

	/**
	 * Creates the instance of the algorithm controller.
	 */
    protected AlgorithmController () {
        algorithms = new Hashtable();
        
        PreferencesController.getInstance().addCategory(
        	PreferencesController.ALGORITHMS_CATEGORY
        );
    }

	/**
	 * Retrieves the unique instance to this class.
	 * @return the instance to this class
	 */
    public static AlgorithmController getInstance () {
        if (instance == null) instance = new AlgorithmController();
        
        return instance;
    }
    
    /**
     * Add a new algorithm to the program so that it can be executed.
     * @param path the path
     * @param className the name of the algorithm
     */
    public void addAlgorithm (String className) {
    	try {
    		/*
    		 * Load the new class into the Java Virtual Machine and
    		 * this controller's algorithms table
    		 */
	    	Class c = Class.forName(className);
	    	algorithms.put(className, c);
    	} catch (ClassNotFoundException exc) {
    		JOptionPane.showMessageDialog(null,"Class not found","Algorithm loader",JOptionPane.ERROR_MESSAGE);
    	}
    }

    /**
     * Add a new algorithm to the program so that it can be executed.
     * @param url the path in the file system to the algorithm's '.class' file
     * @param fileName the name of the algorithm's '.class' file
     */
    public void addAlgorithmFromURL(String url, String fileName) {
    	try {
    		/*
    		 * Load the new class into the Java Virtual Machine and
    		 * this controller's algorithms table
    		 */
			URL [] urls = {new URL("file:" + url)};
	    	URLClassLoader loader = new URLClassLoader(urls);
	    	String className;
			
	    	if (fileName.endsWith(".class"))
				className = fileName.substring(0,fileName.indexOf(".class"));
			else className = fileName;
	    	
	    	Class alg = loader.loadClass(className);
	    	algorithms.put(fileName,alg);
    	}
    	catch (MalformedURLException exc) {
			JOptionPane.showMessageDialog(null,"Invalid path","Algorithm loader",JOptionPane.ERROR_MESSAGE);
    	}
    	catch (ClassNotFoundException exc) {
    		JOptionPane.showMessageDialog(null,"Class not found","Algorithm loader",JOptionPane.ERROR_MESSAGE);
    	}
    }

    /**
     * Opens a new thread to execute the selected algorithm on a graph.
     * @param algName the algorithm to be executed
     * @param g the graph on which the algorithm will be executed
     */
    public void execute (String algName, Graph g) {
    	boolean showAnimation = PreferencesController.getInstance().getBoolean(
    		PreferencesController.ALGORITHMS_CATEGORY,
			PreferencesController.SHOW_ANIMATION_PROPERTY,
			false
    	);
    	
    	boolean setDefaults = PreferencesController.getInstance().getBoolean(
    		PreferencesController.ALGORITHMS_CATEGORY,
			PreferencesController.SET_DEFAULTS_BEFORE_ALGORITHM_PROPERTY,
			true
    	);
    	
    	if (setDefaults) {
    		uiFacade.setActiveGraphToUserPreferences();
    	}

    	if (showAnimation) {
			uiFacade.loadAnimationState(algName,g);
 		}
		else {
			Thread execThread = new Thread(new AlgorithmExecutionThread(
				algName,
				g,
				uiFacade.getWorkspace(),
				this)
			);
			execThread.setName("Algorithm thread");
			
			execThread.start();
		}
    }

	/**
	 * @see ring.gui.event.AlgorithmObserver#algorithmFinished(diamante.core.command.Algorithm)
	 */
	public void algorithmFinished(Algorithm alg) {
		uiFacade.loadGraphEditionState(uiFacade.getGraph());
	}

	/**
	 * @see ring.gui.event.AlgorithmObserver#algorithmStarted(diamante.core.command.Algorithm)
	 */
	public void algorithmStarted(Algorithm alg) {
	}

	/**
	 * @see ring.gui.event.AlgorithmObserver#exceptionRaised(java.lang.Exception)
	 */
	public void exceptionRaised(Exception exc) {
		AlgorithmErrorDialog.getInstance().showErrorMessage(exc);
	}
}
