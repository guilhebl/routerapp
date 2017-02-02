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
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

import tccrouter.diamante.core.graph.Graph;
import tccrouter.diamante.core.graph.layout.GraphLayout;
import tccrouter.gbl.ui.AIPreferencesWindow;
import tccrouter.gbl.ui.GASettings;
import tccrouter.gbl.ui.GeneralSettings;
import tccrouter.gbl.ui.OpenGraphDialog;
import tccrouter.gbl.ui.LocalSearchSettings;
import tccrouter.gbl.ui.SimulatedAnnealingSettings;
import tccrouter.gbl.ui.VRPSettings;
import tccrouter.ring.controller.DiamanteFacade;
import tccrouter.ring.controller.PluginController;
import tccrouter.ring.controller.PreferencesController;
import tccrouter.ring.dao.AbstractDAOFactory;
import tccrouter.ring.graph.GTCGraph;
import tccrouter.ring.gui.context.UIView;
import tccrouter.ring.gui.graphdrawing.GraphWorkspace;
	

/**
 * The main window of the program, where all the GUI components are kept. This is
 * also the main controller of the program, where the user actions and system
 * responses are mostly managed.
 */
public class MainWindow extends JFrame {
    
    /**
     * The unique instance to this class.
     */
    static MainWindow instance;
    
    /**
     * Description text of the nodes mode.
     */
    final static String NODE_TOOLTIP   = "Operate on nodes";
    /**
     * Description text of the edge mode.
     */
    final static String EDGE_TOOLTIP   = "Operate on edges";
    /**
     * Description text of the eraser mode.
     */
    final static String ERASER_TOOLTIP = "Remove components from the graph";
    /**
     * Description text of the undo action.
     */
    final static String UNDO_TOOLTIP   = "Unexecutes the latest command";
    /**
     * Description text of the redo action.
     */
    final static String REDO_TOOLTIP   = "Re-executes the latest undone command";

    /**
     * Description text of the clear properties action.
     */
    final static String CLEAR_PROPERTIES_TIP = "Clear properties";
    /**
     * The toolbar where the buttons used by the user are shown.
     */
    JToolBar toolbar;
    /**
     * The menu used by the main window.
     */
    Menu menu;
    /**
     * The workspace where graphs are shown.
     */
    GraphWorkspace workspace;
    /**
     * The status bar text where messages are placed.
     */
    JLabel status;
    /**
     * The button that changes the active mode to 'node'.
     */
	JToggleButton nodeButton;
	/**
	 * The button that changes the active mode to 'edge'.
	 */
	JToggleButton edgeButton;
	/**
	 * The button that changes the active mode to 'eraser'.
	 */
	JToggleButton eraserButton;
	/**
	 * The button that will undo the latest command.
	 */
	JButton undoButton;
	/**
	 * The button that will redo the next command.
	 */
	JButton redoButton;
	/**
	 * The button that clears changes made to the active graph's properties.
	 */
	JButton clearPropertiesButton;
	
	
	/**
	 * The button that will appear when user has to point the end at node selection
	 * process in some actions.
	 */
	JButton endButton;
	
	/**
	 * The factory of the DAO object that will deal with secondary
	 * graph input and output.
	 */
	AbstractDAOFactory daoFactory;
	/**
	 * 
	 */
	UIFacade uiFacade = UIFacade.getInstance();
	/**
	 * 
	 */
	NavigationView navigationView;
	/**
	 * 
	 */
	UIView centerView;
	/**
	 * 
	 */
	private JSplitPane leftCenterSplit;
	   
    /**
     * The actions
     */
	Action NODE_ACTION;
	Action EDGE_ACTION;
	Action ERASER_ACTION;	
	Action UNDO_ACTION;
	Action REDO_ACTION;
	Action END_ACTION;
	Action SPECIAL_GRAPH_ACTION;
	Action ADD_ALGORITHM_ACTION;	
	Action MANAGE_MENU_ACTION;
	Action CLEAR_PROPERTIES_ACTION;
	Action ABOUT_ACTION;
	Action PREFERENCES_ACTION;
	Action AI_PREFERENCES_ACTION;
	Action VRP_SETTINGS_ACTION;
	Action GA_SETTINGS_ACTION;
	Action LSD_SETTINGS_ACTION;
	Action SA_SETTINGS_ACTION;
	Action GENERAL_AI_SETTINGS_ACTION;
	Action EXIT_ACTION;
	Action SAVE_JDBC_GRAPH_ACTION;
	Action OPEN_JDBC_GRAPH_ACTION;
	Action SAVE_XML_GRAPH_ACTION;
	Action OPEN_XML_GRAPH_ACTION;
	Action LOAD_ALGORITHM_ANIMATION_ACTION;
	Action EMPTY_GRAPH_ACTION;
	
    /**
     * Creates an instance to this class, placing all the components and creating
     * all menu items
     */
    protected MainWindow () {
    	
    	initActions();

        addWindowListener(new WindowAdapter(){
            public void windowClosing (WindowEvent e) {
				// Flushes the user preferences to a file
				PreferencesController.getInstance().savePreferences();

                System.exit(0);
            }
        });
        
        toolbar           = new JToolBar("Tools");
        menu              = new Menu();
        workspace         = new GraphWorkspace(uiFacade.getGraph(),true);
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        setTitle("TCC Router - Routing Heuristics");
        
        // creates the main menu
        menu.addParentMenu("File","File and system operations",true);
        menu.addSubMenu(new JMenu("New..."),"File","Create a new graph",true);
        menu.addItemToSubMenu(EMPTY_GRAPH_ACTION,"File","New...","Create an empty graph",true);
        menu.addItemToSubMenu(SPECIAL_GRAPH_ACTION,"File","New...","Create a special graph",false);
        menu.addMenuItem(OPEN_JDBC_GRAPH_ACTION,"File","Open a graph from DataBase",false);
        menu.addMenuItem(SAVE_JDBC_GRAPH_ACTION,"File","Save a graph to DataBase",false);
        menu.addMenuItem(OPEN_XML_GRAPH_ACTION,"File","Open a graph from file",false);
        menu.addMenuItem(SAVE_XML_GRAPH_ACTION,"File","Save a graph to file",false);        
        menu.addMenuItem(LOAD_ALGORITHM_ANIMATION_ACTION,"File","Load an algorithm animation from file",true);
        menu.addMenuItem(EXIT_ACTION,"File","Leave this program",true); 
        
		JMenuItem undoItem = new JMenuItem(UNDO_ACTION);
		JMenuItem redoItem = new JMenuItem(REDO_ACTION);

		undoItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z,ActionEvent.CTRL_MASK));
		redoItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y,ActionEvent.CTRL_MASK));
        
        menu.addParentMenu("Edit","Edition and command operations",true);
        menu.addMenuItem("Copy","Edit","Copy the selected area to clipboard",true);
        menu.addMenuItem("Cut","Edit","Cut the selected area to clipboard",true);
        menu.addMenuItem("Paste","Edit","Paste the clipboard to a new area",true);
        menu.addMenuItem(undoItem,"Edit",UNDO_TOOLTIP,true);
        menu.addMenuItem(redoItem,"Edit",REDO_TOOLTIP,true);
        
        menu.addParentMenu("Algorithms","Graph algorithms",true);
        menu.addMenuItem(ADD_ALGORITHM_ACTION,"Algorithms","",true);
        menu.addMenuItem(MANAGE_MENU_ACTION,"Algorithms","Add, remove and re-locate items from the Algorithms menu",true);
        menu.addSeparator("Algorithms");

        menu.addParentMenu("Layouts","Graph layouts",true);
        PluginController.getInstance().loadPlugins();
        GraphLayout[] glList = PluginController.getInstance().getLayouts(uiFacade.getGraph(),workspace);
        for(int i = 0; i<glList.length;i++){
            addLayout(glList[i]);
        }
		
        menu.addParentMenu("Settings","Change the program settings",true);
        menu.addMenuItem(PREFERENCES_ACTION,"Settings","Change user preferences",true);
        menu.addMenuItem(AI_PREFERENCES_ACTION,"Settings","Set Artificial Intelligence parameters",true);
        
        menu.addParentMenu("AI-Settings","Set the AI specific configuration",true);
        menu.addMenuItem(GENERAL_AI_SETTINGS_ACTION,"AI-Settings","General Configuration",true);
        menu.addMenuItem(VRP_SETTINGS_ACTION,"AI-Settings","General VRP parameters",true);
        menu.addMenuItem(LSD_SETTINGS_ACTION,"AI-Settings","Local Search parameters",true);
        menu.addMenuItem(GA_SETTINGS_ACTION,"AI-Settings","GA parameters",true);
        menu.addMenuItem(SA_SETTINGS_ACTION,"AI-Settings","SA parameters",true);
        
        menu.addParentMenu("Help","Help files and system information",true);
        menu.addMenuItem(ABOUT_ACTION,"Help","System information",true);       
        
        setJMenuBar(menu);
        
        // creates the toolbar
		nodeButton   			= new JToggleButton(NODE_ACTION);
		edgeButton   			= new JToggleButton(EDGE_ACTION);
		eraserButton 			= new JToggleButton(ERASER_ACTION);
		undoButton   			= new JButton(UNDO_ACTION);
		redoButton   			= new JButton(REDO_ACTION);
		clearPropertiesButton = new JButton(CLEAR_PROPERTIES_ACTION);
		navigationView 		= new NavigationView();
		
		navigationView.addObserver(uiFacade);
		
		nodeButton.setMnemonic(KeyEvent.VK_N);
		edgeButton.setMnemonic(KeyEvent.VK_E);
		eraserButton.setMnemonic(KeyEvent.VK_X);
		clearPropertiesButton.setMnemonic(KeyEvent.VK_C);
        
		// sets the default mode
		nodeButton.setSelected(true);
        
        nodeButton.setText("");
        edgeButton.setText("");
        eraserButton.setText("");
        undoButton.setText("");
        redoButton.setText("");
        clearPropertiesButton.setText("");
        
        nodeButton.setToolTipText(NODE_TOOLTIP);
		edgeButton.setToolTipText(EDGE_TOOLTIP);
		eraserButton.setToolTipText(ERASER_TOOLTIP);
		undoButton.setToolTipText(UNDO_TOOLTIP);
		redoButton.setToolTipText(REDO_TOOLTIP);
		clearPropertiesButton.setToolTipText(CLEAR_PROPERTIES_TIP);
				
        toolbar.add(nodeButton);
		toolbar.add(edgeButton);
		toolbar.add(eraserButton);
		toolbar.add(undoButton);
		toolbar.add(redoButton);
		toolbar.add(clearPropertiesButton);
		
		// creates the status bar
		status = new JLabel(" ");
		status.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		
		leftCenterSplit = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		leftCenterSplit.setOneTouchExpandable(true);
		
		JScrollPane scroll = new JScrollPane(navigationView);
		scroll.setMinimumSize(new Dimension(200,200));
		leftCenterSplit.add(scroll);
		
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(toolbar,BorderLayout.PAGE_START);
		getContentPane().add(status,BorderLayout.SOUTH);
    }
    
	private void initActions() {
		
    	NODE_ACTION = new AbstractAction("Node",new ImageIcon(Toolkit.getDefaultToolkit().createImage(getClass().getClassLoader().getResource("images/Node.gif")))) {
			public void actionPerformed (ActionEvent evt) {
				workspace.setMode(GraphWorkspace.NODE);
				nodeButton.setSelected(true);
				edgeButton.setSelected(false);
				eraserButton.setSelected(false);
			}
	    };

		/**
		 * The action taken when the user clicks on the "Edge" button or menu item.
		 */
		EDGE_ACTION = new AbstractAction("Edge",new ImageIcon(Toolkit.getDefaultToolkit().createImage(getClass().getClassLoader().getResource("images/Edge.gif")))) {
			public void actionPerformed (ActionEvent evt) {
				workspace.setMode(GraphWorkspace.EDGE);
				nodeButton.setSelected(false);
				edgeButton.setSelected(true);
				eraserButton.setSelected(false);
			}
		};
		
		/**
		 * The action taken when the user clicks on the "Eraser" button or menu item.
		 */
		ERASER_ACTION = new AbstractAction("Eraser",new ImageIcon(Toolkit.getDefaultToolkit().createImage(getClass().getClassLoader().getResource("images/Delete.gif")))) {
			public void actionPerformed (ActionEvent evt) {
				workspace.setMode(GraphWorkspace.ERASER);
				nodeButton.setSelected(false);
				edgeButton.setSelected(false);
				eraserButton.setSelected(true);
			}
		};
		
		/**
		 * The action taken when the user clicks on the "Undo" button or menu item.
		 */
		UNDO_ACTION = new AbstractAction("Undo",new ImageIcon(Toolkit.getDefaultToolkit().createImage(getClass().getClassLoader().getResource("images/Undo.gif")))) {
			public void actionPerformed (ActionEvent evt) {
				DiamanteFacade.getInstance().undo();
				workspace.repaint();
			}
		};
		
		/**
		 * The action taken when the user clicks on the "Redo" button or menu item.
		 */
		REDO_ACTION = new AbstractAction("Redo",new ImageIcon(Toolkit.getDefaultToolkit().createImage(getClass().getClassLoader().getResource("images/Redo.gif")))) {
			public void actionPerformed (ActionEvent evt) {
				DiamanteFacade.getInstance().redo();
				workspace.repaint();
			}
		};

		/**
		 * The action taken when the user clicks on the "End" button or menu item.
		 */
		END_ACTION = new AbstractAction("  End  ") {
			public void actionPerformed (ActionEvent evt) {
				DiamanteFacade.getInstance().stopRequestNodes();
			}
		};
		
		/**
		 * The action taken when the user clicks on the "Create special graph" menu item.
		 */
		SPECIAL_GRAPH_ACTION = new AbstractAction("Create special graph") {
			public void actionPerformed (ActionEvent evt) {
				SpecialGraphWindow.getInstance().setVisible(true);
				// Show the preview Graph in preview workspace
				SpecialGraphWindow.getInstance().previewActionMethod();
			}
		};
		
		/**
		 * The action taken when the user clicks on the "Add algorithm" menu item.
		 */
		ADD_ALGORITHM_ACTION = new AbstractAction("Add algorithm") {
			public void actionPerformed (ActionEvent evt) {
//				final AlgorithmFileChooser chooser = AlgorithmFileChooser.getInstance();
//				int option = chooser.chooseFile();
//
//				if (option == JFileChooser.APPROVE_OPTION) {
//					if (chooser.getLastSelectedFileName() != null ||
//						chooser.getLastSelectedFileURL()  != null) {
//						addAlgorithm(chooser.getLastSelectedFileURL(),chooser.getLastSelectedFileName());
//		
//						ProfileController.getInstance().addAlgorithm(chooser.getLastSelectedFileName(),true);
//					}
//				}
			}
		};
		
		/**
		 * The action taken when the user clicks on the "Manage menu" menu item.
		 */
		MANAGE_MENU_ACTION = new AbstractAction("Manage menu") {
			public void actionPerformed(ActionEvent evt) {
				MenuManagementWindow menuWindow = new MenuManagementWindow(menu.getMenu(2),3,menu.getMenu(2).getItemCount());
				if (!menuWindow.emptyMenu()) {
					menuWindow.setVisible(true);
				}
			}
		};
		
		CLEAR_PROPERTIES_ACTION = new AbstractAction("Clear",new ImageIcon(Toolkit.getDefaultToolkit().createImage(getClass().getClassLoader().getResource("images/Clear.gif")))) {
			public void actionPerformed(ActionEvent evt) {
				uiFacade.setActiveGraphToUserPreferences();
				//repaintWorkspace();
			}
		};
		
		/**
		 * The action taken when the user clicks on the "About" menu item.
		 */
		ABOUT_ACTION = new AbstractAction("About") {
			public void actionPerformed(ActionEvent evt) {
				JOptionPane.showMessageDialog(
					null,
					"\t\t\tThis project is the result of an academic\n" +
					"\t\t\tresearch project of\n" +
					"\t\t\tGuilherme Becker Lamounier\n" +
					"\t\t\tguilhebl.github.io\n",
					"About TCC Router",
					JOptionPane.INFORMATION_MESSAGE);
			}
		};
		
		/**
		 * The action taken when the user clicks on the "Preferences" menu item.
		 */
		PREFERENCES_ACTION = new AbstractAction("Preferences") {
			public void actionPerformed (ActionEvent evt) {
				PreferencesWindow.getInstance().setVisible(true);
			}
		};

		/**
		 * The action taken when the user clicks on the "AIPreferences" menu item.
		 */
		AI_PREFERENCES_ACTION = new AbstractAction("AI Preferences") {
			public void actionPerformed (ActionEvent evt) {
				AIPreferencesWindow.getInstance().setVisible(true);
			}
		};

		/**
		 * The action taken when the user clicks on the "VRP Settings" menu item.
		 */
		VRP_SETTINGS_ACTION = new AbstractAction("VRP Constraints") {
			public void actionPerformed (ActionEvent evt) {
				VRPSettings.getInstance().rebuild();
				VRPSettings.getInstance().setVisible(true);
			}
		};

		/**
		 */
		GA_SETTINGS_ACTION = new AbstractAction("GA Settings") {
			public void actionPerformed (ActionEvent evt) {
				GASettings.getInstance().setVisible(true);
			}
		};

		/**
		 */
		LSD_SETTINGS_ACTION = new AbstractAction("Local Search Settings") {
			public void actionPerformed (ActionEvent evt) {
				LocalSearchSettings.getInstance().setVisible(true);
			}
		};

		/**
		 */
		SA_SETTINGS_ACTION = new AbstractAction("SA Settings") {
			public void actionPerformed (ActionEvent evt) {
				SimulatedAnnealingSettings.getInstance().setVisible(true);
			}
		};

		/**
		 */
		GENERAL_AI_SETTINGS_ACTION = new AbstractAction("General AI Settings") {
			public void actionPerformed (ActionEvent evt) {
				GeneralSettings.getInstance().setVisible(true);
			}
		};
		
		/**
		 * The action taken when the user clicks on the "Exit" button or menu item.
		 */
		EXIT_ACTION = new AbstractAction("Exit") {
			public void actionPerformed (ActionEvent evt) {
				System.exit(0);
			}
		};
		/**
		 * The action taken when the user clicks on the "Save" menu item.
		 */
		SAVE_JDBC_GRAPH_ACTION = new AbstractAction("Save") {
			public void actionPerformed (ActionEvent evt) {
				OpenGraphDialog.getInstance().buildSaveWindow();
				OpenGraphDialog.getInstance().setVisible(true);			
			}
		};
		/**
		 * 
		 */
		OPEN_JDBC_GRAPH_ACTION = new AbstractAction("Open") {
			public void actionPerformed (ActionEvent evt) {
				OpenGraphDialog.getInstance().buildLoadWindow();
				OpenGraphDialog.getInstance().setVisible(true);			
			}
		};
		
		/**
		 * The action taken when the user clicks on the "Save" menu item.
		 */
		SAVE_XML_GRAPH_ACTION = new AbstractAction("Save Graph-XML") {
			public void actionPerformed (ActionEvent evt) {
				daoFactory = AbstractDAOFactory.getDAOFactory(AbstractDAOFactory.XML_GRAPH,uiFacade.getGraph());
				daoFactory.makeObject();
				daoFactory.saveObject();
			}
		};

		OPEN_XML_GRAPH_ACTION = new AbstractAction("Open Graph-XML") {
			public void actionPerformed (ActionEvent evt) {
				daoFactory = AbstractDAOFactory.getDAOFactory(AbstractDAOFactory.XML_GRAPH,null);
				
				XMLFileChooser fc = XMLFileChooser.getInstance();
				fc.chooseOpenFile("." + File.separator + "user" + File.separator + "graphs");
				String xmlFileName = null;

				if (fc.getLastSelectedFileName() != null
					&& fc.getLastSelectedFileURL() != null) {
					xmlFileName = fc.getLastSelectedFileName();
					
					uiFacade.openGraph(xmlFileName);
				}
			}
		};

//		LOAD_ALGORITHM_ANIMATION_ACTION = new AbstractAction("Load algorithm animation") {
//			public void actionPerformed (ActionEvent evt) {
//				daoFactory = AbstractDAOFactory.getDAOFactory(AbstractDAOFactory.XML_ANIMATION,null);
//				
//				XMLFileChooser fc = XMLFileChooser.getInstance();
//				fc.chooseOpenFile("." + File.separator + "user" + File.separator + "animations");
//				String xmlFileName = null;
//
//				if (fc.getLastSelectedFileName() != null
//					&& fc.getLastSelectedFileURL() != null) {
//					xmlFileName = fc.getLastSelectedFileName();
//					
//					uiFacade.loadAnimation(xmlFileName);
//				}
//			}
//		};

		EMPTY_GRAPH_ACTION = new AbstractAction("Empty graph") {
			public void actionPerformed (ActionEvent evt) {
				uiFacade.loadGraphEditionState(new GTCGraph());
			}
		};				
	}

	/**
	 * Retrieves the unique instance to this class.
	 * @return the instance to this class
	 */
    public static MainWindow getInstance () {
    	if (instance == null)
    	    instance = new MainWindow();
    	
    	return instance;
    }

	/**
	 * Changes the active graph.
	 * @param g the new graph that will be placed on the GUI
	 */
	public void setGraph(Graph graph) {
		workspace.setGraph(graph);
	}
	
	/**
	 * Repaints the workspace so that changes to the graph components's
	 * properties can be seen.
	 */
	public void refreshViews() {
		centerView.refresh();
		navigationView.refresh();
	}

	/**
	 * Sets the error message on the status bar.
	 * @param msg the new message that will be seen
	 */
	public void setStatusMessage (String msg) {
		status.setText(msg);
	}

	/**
	 * Informs the workspace that an algorithm has requested a node as
	 * a parameter.
	 */
	public void requestNode() {
		workspace.requestNode(true);
	}
	
	/**
	 * Informs the GUI that an algorithm has stoped requesting nodes.
	 */
	public void stopRequestNodes() {
		workspace.stopRequestNodes();
	}	
	
	/**
	 * Adds a new algorithm to the GUI and creates an action that will
	 * execute this algorithm uppon clicking on its name on the 'Algorithms' menu.
	 * @param algorithmUrl the URL in the file system in which the algorithm's '.class'
	 * file is placed
	 * @param algorithmName the name of the algorithm's '.class' file
	 */
	public void addAlgorithm(String algorithmName) {
		final String algName = algorithmName;
		
		DiamanteFacade.getInstance().addAlgorithm(
			algorithmName
		);

		menu.addMenuItem(
			new AbstractAction(algorithmName) {
				public void actionPerformed (ActionEvent evt) {
			        
					endButton = new JButton(END_ACTION);
					endButton.setText("End");
					toolbar.add(endButton);
					
					DiamanteFacade.getInstance().executeAlgorithm(algName,uiFacade.getGraph());
				}
			},
			"Algorithms",
			"",
			true
		);
	}
	
	public void addLayout(GraphLayout lo) {
		try{
			final String name = lo.toString();
			final GraphLayout finalLo = lo;

			menu.addMenuItem(
					new AbstractAction(name) {
						public void actionPerformed (ActionEvent evt) {
							finalLo.setGraph(uiFacade.getGraph());
							uiFacade.doGraphLayout(finalLo);
						}
					},
					"Layouts",
					"",
					true
				);
		}
    	catch (Exception e) {
    		e.printStackTrace();
		}
	}
	
	/**
	 * Appends a separator to the 'Algorithms' menu.
	 */
	public void appendSeparatorToUserMenu() {
		menu.addSeparator("Algorithms");
	}

	/**
	 * @return Returns the workspace.
	 */
	public GraphWorkspace getWorkspace() {
		return workspace;
	}

	/**
	 * @param toolbar
	 */
	public void setToolbar(OperationsToolBar newToolbar) {
		getContentPane().remove(this.toolbar);

		this.toolbar = newToolbar;
		getContentPane().add(newToolbar,BorderLayout.PAGE_START);
		getContentPane().validate();
	}

	/**
	 * @param view
	 */
	public void setCenter(UIView view) {
		if (centerView != null)
			leftCenterSplit.remove(centerView);
		
		leftCenterSplit.add(view);

		if (centerView == null) {
			getContentPane().add(leftCenterSplit,BorderLayout.CENTER);
			leftCenterSplit.revalidate();
			getContentPane().validate();
		}
		
		centerView = view;
		getContentPane().validate();
	}

}