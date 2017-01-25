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
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import tccrouter.diamante.core.graph.Graph;
import tccrouter.diamante.core.graph.factory.DefaultValueTypeProperty;
import tccrouter.diamante.core.graph.factory.GraphFactory;
import tccrouter.diamante.core.graph.layout.GraphLayout;
import tccrouter.ring.controller.PluginController;
import tccrouter.ring.graph.GTCGraph;
import tccrouter.ring.gui.graphdrawing.GraphWorkspace;

/**
 * A window to create special graphs, given their properties.
 */
class SpecialGraphWindow extends JDialog {

	/**
	 * The unique instance of this class.
	 */
	protected static SpecialGraphWindow instance;
	/**
	 * Properties panel. Where the properties will be asked for.
	 */
	JPanel propertiesPanel;
	/** 
	 * The Worspace to show a Graph exemple.
	 */
	GraphWorkspace wkPreview;
	/** 
	 * The combobox for the selection of the special graph type. 
	 */
	JComboBox bType;
	/** 
	 * The combobox for the selection of the graph layout. 
	 */
	JComboBox bLayout;
	/** 
	 * The number of nodes of the graph to be created. 
	 */
	JTextField fNNodes;
	/** 
	 * The types of special graphs available. 
	 */
	GraphFactory [] typeOptions;
	/** 
	 * The types of graphs layouts available. 
	 */
	GraphLayout [] layoutOptions;
	/**
	 * 
	 */
	private UIFacade uiFacade = UIFacade.getInstance();
		
	final Action OK_ACTION = new AbstractAction("OK") {
		public void actionPerformed (ActionEvent evt) {
			Graph g = createGraphFromInterfaceProperties(bType);
			GraphLayout gl = getLayoutFromCombo(bLayout);
			gl.setGraph(g);

			// put graph in main window and run CircleLayout
			uiFacade.loadGraphEditionState(g);
			/*uiFacade.getWorkspace().setLayout(gl);
			uiFacade.getWorkspace().doGraphLayout();*/
			uiFacade.doGraphLayout(gl);
			
			setVisible(false);
		}
	};
	
	final Action PREVIEW_ACTION = new AbstractAction("Preview") {
		public void actionPerformed (ActionEvent evt) {
			previewActionMethod();
		}
	};
	
	/**
	 * A previewAction method
	 */
	 public void previewActionMethod (){
		Graph g = createGraphFromInterfaceProperties(bType);
		//getSuportedLayouts(bType,bLayout);
		GraphLayout gl = (GraphLayout)getLayoutFromCombo(bLayout);
		gl.setGraph(g);
		wkPreview.setLayout(gl);
		// put graph in main window and run CircleLayout
		wkPreview.setGraph(g);
		wkPreview.doGraphLayout();
	 }
	
	final Action RESTORE_DEFAULT_ACTION = new AbstractAction("Default Values") {
		public void actionPerformed (ActionEvent evt) {
			propertiesPanel.removeAll();
			GraphFactory gf = (GraphFactory) bType.getSelectedItem();
			HashMap hp = gf.getNeededProperties();
			Iterator hpIterator = (hp.values()).iterator();
			DefaultValueTypeProperty dvtp;
			while (hpIterator.hasNext()){
				dvtp = (DefaultValueTypeProperty)hpIterator.next();
				dvtp.restoreDefaultValue();
				createPropertieINput(dvtp);
			}
			SpecialGraphWindow.getInstance().setVisible(true);
			previewActionMethod();
		}
	};
	
	final Action CANCEL_ACTION = new AbstractAction("Cancel") {
		public void actionPerformed (ActionEvent evt) {
			setVisible(false);
		}
	};
	

	/** Listens to the graph type combo box. */
	final Action COMBO_GRAPH_TYPE_ACTION = new AbstractAction("COMBO_GRAPH_TYPE_ACTION") {
		public void actionPerformed(ActionEvent e) {
			propertiesPanel.removeAll();
	    	JComboBox cb = (JComboBox)e.getSource();
	        buildPropertiesMembersInterface(cb);
			SpecialGraphWindow.getInstance().setVisible(true);
			previewActionMethod();
		}
	};

	/** Listens to the graph type combo box. */
	final Action COMBO_GRAPH_LAYOUT_ACTION = new AbstractAction("COMBO_GRAPH_LAYOUT_ACTION") {
		public void actionPerformed(ActionEvent e) {
			JComboBox cb = (JComboBox)e.getSource();
			GraphLayout gl = (GraphLayout)cb.getSelectedItem();
			gl.setGraph(wkPreview.getGraph());
			wkPreview.setLayout(gl);
			wkPreview.doGraphLayout();
		}
	};

	private GraphLayout getLayoutFromCombo(JComboBox cb){
		return (GraphLayout)cb.getSelectedItem();
	}
	
	/** 
	 *	Create a property in PropertiesPanel
	 **/
	 protected void createPropertieINput(DefaultValueTypeProperty prop){
		JTextField jtf = new JTextField(3);
		// property default value
		jtf.setText(prop.getValue());
		jtf.setPreferredSize(new Dimension(200,20));	 	
		jtf.setMaximumSize(new Dimension(200,20));	 	
		// proprpety name
		JLabel jl = new JLabel(prop.getName());
		propertiesPanel.add(jl); 
		propertiesPanel.add(jtf);
	 }
	 
	 /**
	  * Create a properties members inteface from ComboBox
	  */
	  protected void buildPropertiesMembersInterface(JComboBox cb){
        GraphFactory gf = (GraphFactory)cb.getSelectedItem();
		HashMap hp = gf.getNeededProperties();
		if(hp.isEmpty()){
			JLabel noNeededProperties = new JLabel("No needed properties");
			propertiesPanel.add(noNeededProperties);
		}else{
			Iterator hpIterator = (hp.values()).iterator();
			while (hpIterator.hasNext()){
				DefaultValueTypeProperty dvtp = (DefaultValueTypeProperty)hpIterator.next();
				createPropertieINput(dvtp);
			}
		}
	  }
	  
	  /**
	   * Create a graph from interface properties
	   * @return a created graph from interface properties
	   */
	  protected Graph createGraphFromInterfaceProperties(JComboBox cb){
		GraphFactory factory = (GraphFactory) cb.getSelectedItem();
		if(!factory.getNeededProperties().isEmpty()){
			int np = propertiesPanel.getComponentCount();
			int i=0;
			while (i<np){
				JLabel label = (JLabel)propertiesPanel.getComponent(i);
				i++;
				JTextField value = (JTextField)propertiesPanel.getComponent(i);
				i++;
				
				DefaultValueTypeProperty newDvt = (DefaultValueTypeProperty)(factory.getNeededProperties()).get(label.getText());
				newDvt.setValue(value.getText());
			}
		}
		Graph g = factory.createGraph(factory.getNeededProperties());
		return g;
	  }

	  /**
	   * Returns the suported Layouts from selected factory 
	   */
	  public void getSuportedLayouts(JComboBox cb, JComboBox r){
	  	Vector layoutOptionsVector = ((GraphFactory)bType.getSelectedItem()).getSupportedLayouts();
	  	r.removeAllItems();
		/*if(layoutOptionsVector.size()==0)
			layoutOptionsVector.add(new CircleLayout(null));*/
		Iterator iterator = layoutOptionsVector.iterator();
		Object obj;
		while (iterator.hasNext()){
			obj = iterator.next();
			r.addItem(obj);
		}
		SpecialGraphWindow.getInstance().setVisible(true);
	  }

	/**
	 * Creates an instance of this class.
	 */
	public SpecialGraphWindow () {
		setTitle("Create special graph");
		setBounds(50,50,700,500);
		wkPreview = new GraphWorkspace(new GTCGraph(),false);
		
		typeOptions = PluginController.getInstance().getFactories();
		layoutOptions = PluginController.getInstance().getLayouts(null,wkPreview);
		 // Create Center, South, and West and South
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new BoxLayout(centerPanel,BoxLayout.X_AXIS));
		JPanel southPanel  = new JPanel(new BorderLayout());
		JPanel westPanel   = new JPanel(new BorderLayout());
		
		// Create and set properties panel
		propertiesPanel = new JPanel();
		propertiesPanel.setLayout(new BoxLayout(propertiesPanel,BoxLayout.Y_AXIS));
		propertiesPanel.setBorder(BorderFactory.createTitledBorder("Properties"));

		// Create ComboBox wirh Graph Factory options
		bType        = new JComboBox(typeOptions);
		bType.setAction(COMBO_GRAPH_TYPE_ACTION);
        buildPropertiesMembersInterface(bType);
		
		// Create and set a Graph Type panel and add a ComboBox type
		JPanel graphTypePanel = new JPanel();
		graphTypePanel.setLayout(new BoxLayout(graphTypePanel,BoxLayout.Y_AXIS));
		graphTypePanel.setBorder(BorderFactory.createTitledBorder("Graph Type"));
		graphTypePanel.add(bType);
		
		// Create ComboBox wirh Graph Factory options
		bLayout        = new JComboBox(layoutOptions);
		bLayout.setAction(COMBO_GRAPH_LAYOUT_ACTION);
		
		// Create and set a Graph Layout panel and add a ComboBox layout
		JPanel graphLayoutPanel = new JPanel();
		graphLayoutPanel.setLayout(new BoxLayout(graphLayoutPanel,BoxLayout.Y_AXIS));
		graphLayoutPanel.setBorder(BorderFactory.createTitledBorder("Graph Layout"));
		graphLayoutPanel.add(bLayout);
		
		// Create a combos` panel
		JPanel comboPanel = new JPanel(new BorderLayout());
		comboPanel.add(graphTypePanel,"North");
		comboPanel.add(graphLayoutPanel,"South");
		
		// Add graph type panel and properties panel in West Panel
		westPanel.add(comboPanel,"North");
		westPanel.add(propertiesPanel,"Center");
		
		// Add preview workspace in Center Panel
		centerPanel.add(wkPreview);
		centerPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		// Create buttons and buttons panel
		JPanel buttonsPanel = new JPanel(new FlowLayout());
		buttonsPanel.add(new JButton(PREVIEW_ACTION));
		buttonsPanel.add(new JButton(RESTORE_DEFAULT_ACTION));
		buttonsPanel.add(new JButton(OK_ACTION));
		buttonsPanel.add(new JButton(CANCEL_ACTION));

		// Add buttons panel in South Panel
		southPanel.add(buttonsPanel,BorderLayout.EAST);
		
		// Add panels in Main Panel (SpecialGraphWindow Content Panel)
		this.getContentPane().setLayout(new BorderLayout());
		this.getContentPane().add(southPanel,BorderLayout.SOUTH);
		this.getContentPane().add(westPanel,BorderLayout.WEST);
		this.getContentPane().add(centerPanel,BorderLayout.CENTER);
		
	}
	
	/**
	 * Retrieves the unique instance to this class.
	 * @return the instance to this class
	 */
	public static SpecialGraphWindow getInstance () {
		if (instance == null) instance = new SpecialGraphWindow();
		
		return instance;
	}
	
	/**
	 * Creates the constraints for the GridBagLayout to add components to
	 * the window.
	 * @param x the x coordinate of the component
	 * @param y the y coordinate of the component
	 * @param width the width of the component
	 * @param height the height of the component
	 * @return the GridBagConstraints created with the given parameters
	 */
	GridBagConstraints constraints (int x, int y, int width, int height) {
		GridBagConstraints constraints = new GridBagConstraints();
		
		constraints.gridx      = x;
		constraints.gridy      = y;
		constraints.gridwidth  = width;
		constraints.gridheight = height;
		constraints.weightx    = 100;
		constraints.weighty    = 100;
		
		return constraints;
	}
}