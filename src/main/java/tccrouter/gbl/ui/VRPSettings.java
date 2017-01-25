package tccrouter.gbl.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

import tccrouter.diamante.core.graph.Graph;
import tccrouter.gbl.common.entity.TSProblemModel;
import tccrouter.gbl.vrp.common.entity.VRProblemModel;
import tccrouter.ring.gui.UIFacade;

public class VRPSettings extends JDialog {

	private static final int DEMAND_INDEX = 1;
	private static final int TW_BEGIN_INDEX = 2;
	private static final int TW_END_INDEX = 3;
	private static final int TW_SERVICE_INDEX = 4;
	
	private static final String STRING_CLIENT = "Client";
	private static final String STRING_DEMAND = "Demand";
	private static final String STRING_INITIAL = "Initial";
	private static final String STRING_END = "End";
	private static final String STRING_SERVICE = "Service";
    
	/**
	 * The unique instance of this class.
	 */
	protected static VRPSettings instance;
	/**
	 * The requested clients from UI.
	 */
	TSProblemModel tModel = TSProblemModel.getInstance();

	/**
	 * The requested clients from UI.
	 */
	VRProblemModel vrpModel = VRProblemModel.getInstance();
	
	/**
	 * Properties panel. Where the properties will be asked for.
	 */
	JPanel centerPanel;
		
	JTable constraintsTable;
	
	/** 
	 * The vehicle capacity setting 
	 */
	JTextField capacityField;
	JLabel capacityLabel;

	/** 
	 *  
	 */
	JTextField initialWorkTime;
	JLabel initialWorkTimeLabel;

	/** 
	 *  
	 */
	JTextField maxTravelTime;
	JLabel maxTravelTimeLabel;
	
	/** 
	 * The vehicle mean Velocity setting 
	 */
	JTextField meanVelocity;
	JLabel meanVelocityLabel;


	
	final Action OK_ACTION = new AbstractAction("OK") {
		public void actionPerformed (ActionEvent evt) {
			
			/*
			 * Update the changes done in UI
			 */						
			TableModel model = constraintsTable.getModel();
			int numRows = constraintsTable.getRowCount();
			//int numCols = constraintsTable.getColumnCount();			
			
			/*
			 * Seting capacity
			 */
			vrpModel.setCapacity(new Integer(capacityField.getText()).intValue());
			
			/*
			 * Seting initial Time
			 */			
			vrpModel.setInitialWorkTime(new Double(initialWorkTime.getText()).doubleValue());

			/*
			 * Seting max travel Time
			 */			
			vrpModel.setMaxTravelTime(new Double(maxTravelTime.getText()).doubleValue());

			/*
			 * Seting mean Velocity
			 */			
			vrpModel.setMeanVelocity(new Double(meanVelocity.getText()).doubleValue());
						
			/*
			 * Seting client constraints
			 */
			for (int i = 0; i < numRows; i++) {

                //	 Do something with the data for client
		        Object demand = model.getValueAt(i, DEMAND_INDEX);						        		        
		        vrpModel.setClientDemand(i, ((Integer)demand).intValue() );
		        
		        Object twBegin = model.getValueAt(i, TW_BEGIN_INDEX);		        
	        	vrpModel.setClientTimeWindowBegin(i, ((Double)twBegin).doubleValue());

		        Object twEnd = model.getValueAt(i, TW_END_INDEX);		        	        	
	        	vrpModel.setClientTimeWindowEnd(i, ((Double)twEnd).doubleValue());

		        Object twService = model.getValueAt(i, TW_SERVICE_INDEX);		        	        		        	
	        	vrpModel.setClientTimeWindowService(i, ((Double)twService).doubleValue());				
			}
			setVisible(false);    
		}
	};
		
	final Action RESTORE_DEFAULT_ACTION = new AbstractAction("Default Values") {
		public void actionPerformed (ActionEvent evt) {
			//constraintsPanel.removeAll();
		}
	};
	
	final Action CANCEL_ACTION = new AbstractAction("Cancel") {
		public void actionPerformed (ActionEvent evt) {
			setVisible(false);
		}
	};

	public JTable createConstraintsTable(boolean rebuild) {		
	    JTable table = new JTable(new VRPTableModel(rebuild));	      
	    
	    table.setPreferredScrollableViewportSize(new Dimension(60, 60));
	    table.setAutoscrolls(true);
	    table.setAutoCreateColumnsFromModel(true);
	    table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
	    table.setMaximumSize(new Dimension(60, 60));
	    table.setBackground(Color.LIGHT_GRAY);
	    table.setBorder(BorderFactory.createCompoundBorder());
	    table.setForeground(Color.BLACK);
	    table.setShowGrid(true);
	    
	      return table;
	}

	/**
	 * Creates an instance of this class.
	 */
	protected VRPSettings () {
		setTitle("VRP Problem Constraints");
		setBounds(50,50,700,500);

		centerPanel = new JPanel(new FlowLayout());
		JPanel southPanel  = new JPanel(new FlowLayout());
						
		constraintsTable = createConstraintsTable(true);
				
		capacityLabel = new JLabel("Vehicle Capacity(u)");
		capacityField = new JTextField((new Integer(VRProblemModel.DEFAULT_VEHICLE_CAPACITY)).toString(), 4);
		initialWorkTimeLabel = new JLabel("Initial Work Time(h)");
		initialWorkTime = new JTextField((new Double(VRProblemModel.DEFAULT_TWVEHICLE_INITIAL)).toString(), 4);		
		maxTravelTimeLabel = new JLabel("Max Travel Time(h)");
		maxTravelTime = new JTextField((new Double(VRProblemModel.DEFAULT_TWVEHICLE_MAX_TRAVEL)).toString(), 4);
		meanVelocityLabel = new JLabel("Mean Velocity(km/h)");
		meanVelocity = new JTextField((new Double(VRProblemModel.DEFAULT_TRAVEL_STEP)).toString(), 4);

		centerPanel.add(capacityLabel, BorderLayout.WEST);
		centerPanel.add(capacityField, BorderLayout.WEST);	
		centerPanel.add(initialWorkTimeLabel, BorderLayout.WEST);
		centerPanel.add(initialWorkTime, BorderLayout.WEST);	
		centerPanel.add(maxTravelTimeLabel, BorderLayout.WEST);
		centerPanel.add(maxTravelTime, BorderLayout.WEST);	
		centerPanel.add(meanVelocityLabel, BorderLayout.WEST);
		centerPanel.add(meanVelocity, BorderLayout.WEST);	
		
		centerPanel.add(constraintsTable,BorderLayout.CENTER);
		
		// Add demands table in Center Panel		
		centerPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		// Create buttons and buttons panel
		JPanel buttonsPanel = new JPanel(new FlowLayout());
		buttonsPanel.add(new JButton(RESTORE_DEFAULT_ACTION));
		buttonsPanel.add(new JButton(OK_ACTION));
		buttonsPanel.add(new JButton(CANCEL_ACTION));

		// Add buttons panel in South Panel
		southPanel.add(buttonsPanel,BorderLayout.EAST);
		
		// Add panels in Main Panel
		this.getContentPane().setLayout(new BorderLayout());
		this.getContentPane().add(southPanel,BorderLayout.SOUTH);
		this.getContentPane().add(centerPanel,BorderLayout.CENTER);		
	}
	
	/**
	 * Retrieves the unique instance to this class.
	 * @return the instance to this class
	 */
	public static VRPSettings getInstance () {
		if (instance == null) instance = new VRPSettings();
		
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
		constraints.weightx    = 80;
		constraints.weighty    = 80;
		
		return constraints;
	}

	class VRPTableModel extends AbstractTableModel {
	    private String[] columnNames = {
	    		STRING_CLIENT,
                STRING_DEMAND,
                STRING_INITIAL,
                STRING_END,
                STRING_SERVICE
                };
 	    
	    private Object[][] data; 
	    
	    public VRPTableModel(boolean newModel) {
			super();
			if (newModel) {
				data = VRProblemModel.getInstance().buildNewGraphDataModel();
			} else {
				data = VRProblemModel.getInstance().getGraphDataModel();
			}
		}
	    
		public int getColumnCount() {
	        return columnNames.length;
	    }

	    public int getRowCount() {
	    	if (data == null) {
	    		return 0;
	    	}
	        return data.length;
	    }

	    public String getColumnName(int col) {
	        return columnNames[col];
	    }

	    public Object getValueAt(int row, int col) {
	        return data[row][col];
	    }

	    public Class getColumnClass(int c) {
	        return getValueAt(0, c).getClass();
	    }

	    
	    public String[] getColumnNames() {
			return columnNames;
		}

		public void setColumnNames(String[] columnNames) {
			this.columnNames = columnNames;
		}

		public Object[][] getData() {
			return data;
		}

		public void setData(Object[][] data) {
			this.data = data;
		}

		/*
	     * Don't need to implement this method unless your table's
	     * editable.
	     */
	    public boolean isCellEditable(int row, int col) {
	        //Note that the data/cell address is constant,
	        //no matter where the cell appears onscreen.
	        if (col < 1) {
	            return false;
	        } else {
	            return true;
	        }
	    }

	    /*
	     * Don't need to implement this method unless your table's
	     * data can change.
	     */
	    public void setValueAt(Object value, int row, int col) {
	        data[row][col] = value;
	        fireTableCellUpdated(row, col);
	    }
	    
	}

	public void rebuild() {
		//instance = new VRPSettings();
		
		/*
		 * Update the changes done in UI
		 */						
		//TableModel model = constraintsTable.getModel();
		Graph g = UIFacade.getInstance().getGraph();
		
		if (g != null) {
				
				centerPanel.remove(constraintsTable);				
				constraintsTable = createConstraintsTable(false);
				//constraintsTable = rebuildConstraintsTable();
				//constraintsTable.getModel().addTableModelListener(this);
				centerPanel.add(constraintsTable,BorderLayout.CENTER);
				
				/*
				 * Seting capacity
				 */
				capacityField.setText(new Integer(vrpModel.getCapacity()).toString());
				
				/*
				 * Seting initial Time
				 */			
				initialWorkTime.setText(new Double(vrpModel.getInitialWorkTime()).toString());

				/*
				 * Seting max travel Time
				 */			
				maxTravelTime.setText(new Double(vrpModel.getMaxTravelTime()).toString());

				/*
				 * Seting max travel Time
				 */			
				meanVelocity.setText(new Double(vrpModel.getMeanVelocity()).toString());
				
				/*
				 * Seting client constraints
				 */
//				int nodes[] = tModel.getAllProblemNodes();
//				int numNodes = nodes.length;
//								
//				for (int i = 0; i < numNodes; i++) {
//
//		            //	 Get the data for client
//					int row = (i + 1);
//					model.setValueAt(new Integer(nodes[i]), row, 0);					
//			        model.setValueAt(new Integer(vrpModel.getClientDemand(nodes[i])), row, DEMAND_INDEX);
//			        TimeWindow tw = vrpModel.getClientTimeWindow(nodes[i]);
//			        model.setValueAt(new Double(tw.begin), row, TW_BEGIN_INDEX);
//			        model.setValueAt(new Double(tw.end), row, TW_END_INDEX);
//			        model.setValueAt(new Double(vrpModel.getClientTimeWindowService(nodes[i])), row, TW_SERVICE_INDEX);
//				}
				
			this.repaint();			
		} // end if != null
		
	}
}		
	
	
