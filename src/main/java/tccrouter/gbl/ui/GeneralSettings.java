package tccrouter.gbl.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JPanel;

import tccrouter.gbl.common.entity.TSProblemModel;
import tccrouter.gbl.vrp.common.entity.VRProblemModel;

public class GeneralSettings extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2282379280079695660L;
	/**
	 * The unique instance of this class.
	 */
	private static GeneralSettings instance;
	/**
	 * The requested clients from UI.
	 */
	private TSProblemModel tModel = TSProblemModel.getInstance();

	/**
	 * The requested clients from UI.
	 */
	private VRProblemModel vrpModel = VRProblemModel.getInstance();
	
	/**
	 * Properties panel. Where the properties will be asked for.
	 */
	private JPanel centerPanel;
	/** 
	 *  
	 */	
	private JCheckBox saExecutionMeasureBox;
	private JCheckBox lsdExecutionMeasureBox;
	private JCheckBox pfihExecutionMeasureBox;
	private JCheckBox gaExecutionMeasureBox;
	private JCheckBox aStarExecutionMeasureBox;
	
	private final Action OK_ACTION = new AbstractAction("OK") {
		/**
		 * 
		 */
		private static final long serialVersionUID = -7403020518639998876L;

		public void actionPerformed (ActionEvent evt) {

			/*
			 * Update the changes done in UI
			 */												
			if (aStarExecutionMeasureBox.isSelected()) {
			    tModel.setAStarExecutionMeasure(true);				
			} else {
				tModel.setAStarExecutionMeasure(false);
			}

			if (gaExecutionMeasureBox.isSelected()) {
			    tModel.setGaExecutionMeasure(true);				
			} else {
				tModel.setGaExecutionMeasure(false);
			}
			
			if (pfihExecutionMeasureBox.isSelected()) {
			    vrpModel.setPfihExecutionMeasure(true);				
			} else {
				vrpModel.setPfihExecutionMeasure(false);
			}
			
			if (lsdExecutionMeasureBox.isSelected()) {
			    vrpModel.setLsdExecutionMeasure(true);				
			} else {
				vrpModel.setLsdExecutionMeasure(false);
			}
			
			if (saExecutionMeasureBox.isSelected()) {
				vrpModel.setSAExecutionMeasure(true);				
			} else {
				vrpModel.setGlobalBestLSD(false);
			}
			
			setVisible(false);    
		}
	};
		
	private final Action RESTORE_DEFAULT_ACTION = new AbstractAction("Default Values") {
		/**
		 * 
		 */
		private static final long serialVersionUID = -4748827697565258758L;

		public void actionPerformed (ActionEvent evt) {
			centerPanel = new JPanel(new FlowLayout());
			
			aStarExecutionMeasureBox = new JCheckBox("AStar Execution Measure", TSProblemModel.ASTAR_DEFAULT_MEASURE_EXECUTION);
			gaExecutionMeasureBox = new JCheckBox("GA Execution Measure", TSProblemModel.GA_DEFAULT_MEASURE_EXECUTION);
			pfihExecutionMeasureBox = new JCheckBox("PFIH Execution Measure", VRProblemModel.PFIH_DEFAULT_MEASURE_EXECUTION);
			lsdExecutionMeasureBox = new JCheckBox("Local Search Execution Measure", VRProblemModel.LSD_DEFAULT_MEASURE_EXECUTION);
			saExecutionMeasureBox = new JCheckBox("SA Execution Measure", VRProblemModel.SA_DEFAULT_MEASURE_EXECUTION);
			
			centerPanel.add(aStarExecutionMeasureBox);
			centerPanel.add(gaExecutionMeasureBox);
			centerPanel.add(pfihExecutionMeasureBox);
			centerPanel.add(lsdExecutionMeasureBox);
			centerPanel.add(saExecutionMeasureBox);
					
			// Add demands table in Center Panel		
			centerPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			centerPanel.setBackground(Color.getColor("202,198,202"));
		
			// Add panels in Main Panel
			getContentPane().add(centerPanel,BorderLayout.CENTER);					
		}
	};
	
	private final Action CANCEL_ACTION = new AbstractAction("Cancel") {
		/**
		 * 
		 */
		private static final long serialVersionUID = -3500227632944208756L;

		public void actionPerformed (ActionEvent evt) {
			setVisible(false);
		}
	};

	/**
	 * Creates an instance of this class.
	 */
	private GeneralSettings () {
		setTitle("General Configuration");
		setBounds(50,50,320,320);

		centerPanel = new JPanel(new FlowLayout());
		JPanel southPanel  = new JPanel(new FlowLayout());
		
		aStarExecutionMeasureBox = new JCheckBox("AStar Execution Measure", TSProblemModel.ASTAR_DEFAULT_MEASURE_EXECUTION);
		gaExecutionMeasureBox = new JCheckBox("GA Execution Measure", TSProblemModel.GA_DEFAULT_MEASURE_EXECUTION);
		pfihExecutionMeasureBox = new JCheckBox("PFIH Execution Measure", VRProblemModel.PFIH_DEFAULT_MEASURE_EXECUTION);
		lsdExecutionMeasureBox = new JCheckBox("Local Search  Execution Measure", VRProblemModel.LSD_DEFAULT_MEASURE_EXECUTION);
		saExecutionMeasureBox = new JCheckBox("SA Execution Measure", VRProblemModel.SA_DEFAULT_MEASURE_EXECUTION);
		
		centerPanel.add(aStarExecutionMeasureBox);
		centerPanel.add(gaExecutionMeasureBox);
		centerPanel.add(pfihExecutionMeasureBox);
		centerPanel.add(lsdExecutionMeasureBox);
		centerPanel.add(saExecutionMeasureBox);
				
		// Add demands table in Center Panel		
		centerPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		centerPanel.setBackground(Color.getColor("202,198,202"));
		
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
	public static GeneralSettings getInstance () {
		if (instance == null) instance = new GeneralSettings();
		
		return instance;
	}		
}		