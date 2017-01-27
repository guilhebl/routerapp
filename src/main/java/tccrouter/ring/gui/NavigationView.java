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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeSelectionModel;
import javax.swing.tree.TreeSelectionModel;

/**
 * 
 */
public class NavigationView extends JPanel {
    
	/**
	 * 
	 */
	private static final long serialVersionUID = -249664510169416487L;

	private static final String GRAPH_FOLDER = "graphs";
	
    /**
     * 
     */
    JTree tree;
    /**
     * 
     */
    ArrayList<NavigationObserver> observers;
    /**
     * 
     */
    DefaultMutableTreeNode algorithmsCategory;
    /**
     * 
     */
    DefaultMutableTreeNode graphsCategory;
    /**
     * 
     */
    DefaultMutableTreeNode animationsCategory;
    /**
     * 
     */
    MouseAdapter mouseAdapter;
    
    /**
     * 
     */
    public NavigationView() {
        observers = new ArrayList<>();
        
        buildTree();
        
        setLayout(new BorderLayout());
        add(tree,BorderLayout.CENTER);
        /*JScrollPane scroll = new JScrollPane(tree);
        add(scroll);
        
        scroll.setPreferredSize(new Dimension(150,200));*/
    }
    
    /**
     * 
     * @param observer
     */
    public void addObserver(NavigationObserver observer) {
        observers.add(observer);
    }
    
    /**
     * 
     */
    private void buildTree() {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("user");
        tree = new JTree(root);
        tree.putClientProperty("JTree.lineStyle", "Angled");
        tree.setCellRenderer(new NavigationTreeCellRenderer());
        tree.setShowsRootHandles(true);
        
        DefaultTreeSelectionModel model = new DefaultTreeSelectionModel();
        model.setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
        
        graphsCategory = new DefaultMutableTreeNode("graphs");
        //algorithmsCategory = new DefaultMutableTreeNode("algorithms");
        //animationsCategory = new DefaultMutableTreeNode("animations");
        
        mouseAdapter = new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                itemSelected(e);
            }
        };
        tree.addMouseListener(mouseAdapter);
        
        root.add(graphsCategory);
        //root.add(algorithmsCategory);
        //root.add(animationsCategory);
        
        loadGraphs();
        //loadAlgorithms();
        //loadAnimations();
    }

    /**
     * @param e
     */
    protected void itemSelected(MouseEvent e) {
	    if (e.getClickCount() == 2) {
        	DefaultMutableTreeNode node = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
	        
	        if (node != null) {
	            if (node.isLeaf())
	            	if (node.getParent() != null) {
		            	if (node.getParent().toString().equals("graphs")) {
		                    for (int i=0 ; i<observers.size() ; i++)
		                        ((NavigationObserver) observers.get(i)).graphSelected(node.toString());
		                }
		                else if (node.getParent().toString().equals("animations")) {
		                    for (int i=0 ; i<observers.size() ; i++)
		                        ((NavigationObserver) observers.get(i)).animationSelected(node.toString());
		                }
		                else if (node.getParent().toString().equals("algorithms")) {
		                    for (int i=0 ; i<observers.size() ; i++)
		                        ((NavigationObserver) observers.get(i)).algorithmSelected(node.toString());
		                }
		            }
		    }
    	}
    }

    /**
     * 
     */
    private void loadAlgorithms() {
        File algorithmsDirectory = 
        	new File("." + File.separator + "user" + File.separator + "algorithms" + File.separator);
        
        File[] files = algorithmsDirectory.listFiles(new FileFilter() {

            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".java");
            }
        });
        algorithmsCategory.removeAllChildren();
        
        if (files != null) {
	        for (int i=0 ; i<files.length ; i++) {
	            algorithmsCategory.add(new DefaultMutableTreeNode(files[i].getName()));
	        }
        }
    }

    /**
     * 
     */
    private void loadAnimations() {
        File animationsDirectory = 
        	new File("." + File.separator + "user" + File.separator + "animations" + File.separator);
        
        File[] files = animationsDirectory.listFiles();
        animationsCategory.removeAllChildren();
        
        if (files != null) {
	        for (int i=0 ; i<files.length ; i++) {
	            animationsCategory.add(new DefaultMutableTreeNode(files[i].getName()));
	        }
        }
    }

    /**
     * 
     */
    private void loadGraphs() {
    	ClassLoader classloader = Thread.currentThread().getContextClassLoader();    	
        File graphsDirectory = new File(classloader.getResource(GRAPH_FOLDER).getFile());								                        
        File[] files = graphsDirectory.listFiles();
        graphsCategory.removeAllChildren();
        
        if (files != null) {
	        for (int i=0 ; i<files.length ; i++) {
	            graphsCategory.add(new DefaultMutableTreeNode(files[i].getName()));
	        }
        }
    }
    
    /**
     *
     */
    public void refresh() {
    	loadGraphs();
        //loadAlgorithms();
        //loadAnimations();
        
        tree.updateUI();
    }
}
