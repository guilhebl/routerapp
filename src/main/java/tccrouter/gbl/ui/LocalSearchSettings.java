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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import tccrouter.gbl.common.entity.TSProblemModel;
import tccrouter.gbl.vrp.common.entity.VRProblemModel;

public class LocalSearchSettings extends JDialog {

	/**
	 * The unique instance of this class.
	 */
	protected static LocalSearchSettings instance;
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
		
	/** 
	 */
	JTextField iterationsField;
	JLabel iterationsLabel;

	/** 
	 */
	JTextField lambdaField;
	JLabel lambdaLabel;
	
	/** 
	 *  
	 */
	JCheckBox globalBestSearchBox;

	/** 
	 *  
	 */
	JCheckBox badMovesBox;
	
	final Action OK_ACTION = new AbstractAction("OK") {
		public void actionPerformed (ActionEvent evt) {
			
			/*
			 * Update the changes done in UI
			 */									
			/*
			 * Seting iterations
			 */
			vrpModel.setNumIterationsLSD(new Integer(iterationsField.getText()).intValue());
			vrpModel.setLambda(new Integer(lambdaField.getText()).intValue());
			
			/*
			 * Seting global best
			 */			
			if (globalBestSearchBox.isSelected()) {
				vrpModel.setGlobalBestLSD(true);				
			} else {
				vrpModel.setGlobalBestLSD(false);
			}

			/*
			 * Seting accept bad moves
			 */			
			if (badMovesBox.isSelected()) {
				vrpModel.setBadMovesLSD(true);				
			} else {
				vrpModel.setBadMovesLSD(false);
			}
			
			setVisible(false);    
		}
	};
		
	final Action RESTORE_DEFAULT_ACTION = new AbstractAction("Default Values") {
		public void actionPerformed (ActionEvent evt) {
			centerPanel = new JPanel(new FlowLayout());
							
			iterationsLabel = new JLabel("Iterations");		
			iterationsField = new JTextField((new Integer(VRProblemModel.DEFAULT_LSD_ITERATIONS)).toString(), 4);

			lambdaLabel = new JLabel("Lambda size");		
			lambdaField = new JTextField((new Integer(VRProblemModel.DEFAULT_LAMBDA)).toString(), 4);
			
			globalBestSearchBox = new JCheckBox("Global Best Search");
			badMovesBox = new JCheckBox("Accept Bad Moves");

			centerPanel.add(iterationsLabel);
			centerPanel.add(iterationsField);
			centerPanel.add(lambdaLabel);
			centerPanel.add(lambdaField);			
			centerPanel.add(globalBestSearchBox);
			centerPanel.add(badMovesBox);	
					
			// Add demands table in Center Panel		
			centerPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			centerPanel.setBackground(Color.getColor("202,198,202"));
		
			// Add panels in Main Panel
			getContentPane().add(centerPanel,BorderLayout.CENTER);					
		}
	};
	
	final Action CANCEL_ACTION = new AbstractAction("Cancel") {
		public void actionPerformed (ActionEvent evt) {
			setVisible(false);
		}
	};

	/**
	 * Creates an instance of this class.
	 */
	protected LocalSearchSettings () {
		setTitle("VRP Problem Constraints");
		setBounds(50,50,320,320);

		centerPanel = new JPanel(new FlowLayout());
		JPanel southPanel  = new JPanel(new FlowLayout());
						
		iterationsLabel = new JLabel("Iterations");		
		iterationsField = new JTextField((new Integer(VRProblemModel.DEFAULT_LSD_ITERATIONS)).toString(), 4);

		lambdaLabel = new JLabel("Lambda size");		
		lambdaField = new JTextField((new Integer(VRProblemModel.DEFAULT_LAMBDA)).toString(), 4);
		
		globalBestSearchBox = new JCheckBox("Global Best Search");
		badMovesBox = new JCheckBox("Accept Bad Moves");

		centerPanel.add(iterationsLabel);
		centerPanel.add(iterationsField);
		centerPanel.add(lambdaLabel);
		centerPanel.add(lambdaField);			
		centerPanel.add(globalBestSearchBox);
		centerPanel.add(badMovesBox);	
				
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
	public static LocalSearchSettings getInstance () {
		if (instance == null) instance = new LocalSearchSettings();
		
		return instance;
	}		
}