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
package tccrouter.ring.controller;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.HashMap;

import javax.swing.JOptionPane;

import tccrouter.diamante.core.graph.Graph;
import tccrouter.diamante.core.graph.factory.GraphFactory;
import tccrouter.diamante.core.graph.layout.GraphLayout;
import tccrouter.ring.gui.graphdrawing.GraphWorkspace;
import tccrouter.user.factories.BipartiteGraphFactory;
import tccrouter.user.factories.CompleteGraphFactory;
import tccrouter.user.factories.NullGraphFactory;
import tccrouter.user.layouts.CircleLayout;
import tccrouter.user.layouts.LineLayout;

/**
 * Handles plugins that have been added to the program. Currently supported
 * plugins are graph factories and layouts. Plugins are stored in the 'user'
 * folder and loaded by objects of this class via reflection.
 * 
 * There is no error-checking implemented in this version of the plugin controller,
 * so developers must verify the correctness of their implementations. 
 */
public class PluginController {
	
	/**
	 * The unique instance of this class.
	 */
    static PluginController instance;
    /**
     * The factories included in the program.
     */
    private HashMap<String, Class> factories;
    /**
     * The layouts included in the program.
     */
    private HashMap<String, Class> layouts;

	/**
	 * Creates the instance of the algorithm controller.
	 */
    protected PluginController () {
        factories = new HashMap<>();
        layouts   = new HashMap<>();
    }

	/**
	 * Retrieves the unique instance to this class.
	 * @return the instance to this class
	 */
    public static PluginController getInstance () {
        if (instance == null) instance = new PluginController();
        
        return instance;
    }
    
    /**
     * Loads all existing plugins from the file system.
     */
    public void loadPlugins () {
    	loadStaticFactories();
    	loadStaticLayouts();
    }

	private void loadStaticLayouts() {		
		layouts.put("CircleLayout" , CircleLayout.class);
		layouts.put("LineLayout" , LineLayout.class);
	}

	private void loadStaticFactories() {
		factories.put("BipartiteGraphFactory" , BipartiteGraphFactory.class);
		factories.put("CompleteGraphFactory" , CompleteGraphFactory.class);
		factories.put("NullGraphFactory" , NullGraphFactory.class);				
	}

	/**
	 * Loads graph factories from the file system folder '<Rin'G>/user/factories'.
	 */
	private void loadFactories() {		
    	try {
    		// Find the classes withing the 'user/factories' directory
    		File dir = new File("factories");
    		File [] files = dir.listFiles();
    		
    		if (files != null) {
	    		for (int i=0 ; i<files.length ; i++) {
	        		/*
	        		 * Load the new class into the Java Virtual Machine and
	        		 * this controller's algorithms table
	        		 */
	    			URL [] urls = {new URL("file:")};
	    	    	URLClassLoader loader = new URLClassLoader(urls);
	    	    	String className;
	    			
	    	    	if (files[i].getName().endsWith(".class")) {
	    				className = 
	    					files[i].getName().substring(0,files[i].getName().indexOf(".class"));
	    			
		    	    	Class alg = loader.loadClass("user.factories." + className);
		    	    	factories.put(files[i].getName(),alg);
	    	    	}
	    		}
    		}
    	}
    	catch (MalformedURLException exc) {
			JOptionPane.showMessageDialog(null,"Invalid path","Plugin loader",JOptionPane.ERROR_MESSAGE);
    	}
    	catch (ClassNotFoundException exc) {
    		JOptionPane.showMessageDialog(null,"Class not found","Plugin loader",JOptionPane.ERROR_MESSAGE);
    	}
	}

	/**
	 * Loads graph layouts from the file system folder '<Rin'G>/user/layouts'.
	 */
	private void loadLayouts() {
    	try {
    		// Find the classes withing the 'user/layouts' directory
    		File dir = new File("layouts");
    		File [] files = dir.listFiles();
    		
    		if (files != null) {
	    		for (int i=0 ; i<files.length ; i++) {
	        		/*
	        		 * Load the new class into the Java Virtual Machine and
	        		 * this controller's algorithms table
	        		 */
	    			URL [] urls = {new URL("file:")};
	    	    	URLClassLoader loader = new URLClassLoader(urls);
	    	    	String className;
	    			
	    	    	if (files[i].getName().endsWith(".class")) {
	    				className = 
	    					files[i].getName().substring(0,files[i].getName().indexOf(".class"));
	    			
		    	    	Class alg = loader.loadClass("user.layouts." + className);
		    	    	layouts.put(files[i].getName(),alg);
	    	    	}
	    		}
    		}
    	}
    	catch (MalformedURLException exc) {
			JOptionPane.showMessageDialog(null,"Invalid path","Plugin loader",JOptionPane.ERROR_MESSAGE);
    	}
    	catch (ClassNotFoundException exc) {
    		JOptionPane.showMessageDialog(null,"Class not found","Plugin loader",JOptionPane.ERROR_MESSAGE);
    	}
	}
	
	public GraphFactory[] getFactories () {
		GraphFactory[] graphArray = new GraphFactory[factories.size()];
		try {
			int i = 0;
			for (Class gclass : factories.values()) {			
				graphArray[i++] = (GraphFactory) gclass.getConstructors()[0].newInstance(null);
			}						
		} catch (Exception e) {
			JOptionPane.showMessageDialog(
					null,
					"There was an error loading the plugin getFactories.\n" +
						"Make sure it matches the plugin specification.",
					"Plugin loader Factory",
					JOptionPane.ERROR_MESSAGE
				);
			}
		return graphArray;
	}

	/**
	 * Creates an instance for each of the graph factory classes that have been
	 * loaded from the file system, and returns a list of those instances.
	 * 
	 * The constructor of these classes cannot expect parameters, or a <code>NullPointerException</code>
	 * will be thrown.
	 * @return a list of loaded graph factories
	 */
	public GraphFactory [] getDynamicFactories () {
		Object [] classList = factories.values().toArray();
		GraphFactory [] factList = new GraphFactory[classList.length];
		int i = 0;
		
		try {
			for (i=0 ; i < classList.length ; i++) {
				Class factClass = (Class) classList[i];
				
				GraphFactory fact = (GraphFactory) factClass.getConstructors()[0].newInstance(null);
				
				factList[i] = fact;
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(
				null,
				"There was an error loading the plugin '" + ((Class)classList[i]).getName() + "'.\n" +
					"Make sure it matches the plugin specification.",
				"Plugin loader Factory",
				JOptionPane.ERROR_MESSAGE
			);
		}
		
		return factList;
	}
	
	/**
	 * Creates an instance for each of the graph layout classes that have been
	 * loaded from the file system, and returns a list of those instances.
	 * 
	 * The constructor of these classes cannot expect parameters, or a <code>NullPointerException</code>
	 * will be thrown.
	 * @return a list of loaded graph layouts
	 */
	public GraphLayout [] getLayouts (Graph g, GraphWorkspace ws) {
		Object [] classList = layouts.values().toArray();
		GraphLayout [] layoutsList = new GraphLayout[classList.length];
		Object [] params = new Object[1];
		params[0] = g;
		int pCount;
		int i = 0;
		
		try {
			for (i=0 ; i < classList.length ; i++) {
				Class layoutClass = (Class) classList[i];
				
				GraphLayout layout = (GraphLayout) layoutClass.getConstructors()[0].newInstance(params);
				
				layoutsList[i] = layout;
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(
				null,
				"There was an error loading the plugin '" + ((Class)classList[i]).getName() + "'.\n" +
					"Make sure it matches the plugin specification.",
				"Plugin loader Layout",
				JOptionPane.ERROR_MESSAGE
			);
		}
		
		return layoutsList;
	}
}
