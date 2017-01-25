package tccrouter.gbl.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import tccrouter.gbl.common.entity.TSProblemModel;
import tccrouter.gbl.vrp.common.entity.VRProblemModel;

public class SimulatedAnnealingSettings extends JDialog {

	/**
	 * The unique instance of this class.
	 */
	protected static SimulatedAnnealingSettings instance;
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
	JTextField resetsField;
	JLabel resetsLabel;

	/** 
	 */
	JTextField lambdaField;
	JLabel lambdaLabel;
	
	/** 
	 */
	JTextField finalTempField;
	JLabel finalTempLabel;

	/** 
	 */
	JTextField timeConstantField;
	JLabel timeConstantLabel;
	
	final Action OK_ACTION = new AbstractAction("OK") {
		public void actionPerformed (ActionEvent evt) {
			
			vrpModel.setNumResets(new Integer(resetsField.getText()).intValue());
			vrpModel.setFinalTemperature(new Double(finalTempField.getText()).doubleValue());
			vrpModel.setTimeConstant(new Double(timeConstantField.getText()).doubleValue());
			vrpModel.setSaLambda(new Integer(lambdaField.getText()).intValue());
			
			setVisible(false);    
		}
	};
		
	final Action RESTORE_DEFAULT_ACTION = new AbstractAction("Default Values") {
		public void actionPerformed (ActionEvent evt) {
			centerPanel = new JPanel(new FlowLayout());
							
			resetsLabel = new JLabel("Resets");		
			resetsField = new JTextField((new Integer(VRProblemModel.DEFAULT_NUM_RESETS)).toString(), 6);

			lambdaLabel = new JLabel("SA Lambda size");		
			lambdaField = new JTextField((new Integer(VRProblemModel.DEFAULT_LAMBDA)).toString(), 4);
			
			finalTempLabel = new JLabel("Final Temperature");		
			finalTempField = new JTextField((new Double(VRProblemModel.DEFAULT_FINAL_TEMP)).toString(), 6);

			timeConstantLabel = new JLabel("Time Constant");		
			timeConstantField = new JTextField((new Double(VRProblemModel.DEFAULT_TIME_CONST)).toString(), 6);
			
			centerPanel.add(resetsLabel);
			centerPanel.add(resetsField);
			centerPanel.add(lambdaLabel);
			centerPanel.add(lambdaField);					
			centerPanel.add(finalTempLabel);
			centerPanel.add(finalTempField);			
			centerPanel.add(timeConstantLabel);
			centerPanel.add(timeConstantField);	
					
			// Add demands table in Center Panel		
			centerPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			centerPanel.setBackground(Color.getColor("202,198,202"));
			
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
	protected SimulatedAnnealingSettings () {
		setTitle("Simulated Annealing Settings");
		setBounds(50,50,320,320);

		centerPanel = new JPanel(new FlowLayout());
		JPanel southPanel  = new JPanel(new FlowLayout());
						
		resetsLabel = new JLabel("Resets");		
		resetsField = new JTextField((new Integer(VRProblemModel.DEFAULT_NUM_RESETS)).toString(), 6);

		lambdaLabel = new JLabel("SA Lambda size");		
		lambdaField = new JTextField((new Integer(VRProblemModel.DEFAULT_LAMBDA)).toString(), 4);
		
		finalTempLabel = new JLabel("Final Temperature");		
		finalTempField = new JTextField((new Double(VRProblemModel.DEFAULT_FINAL_TEMP)).toString(), 6);

		timeConstantLabel = new JLabel("Time Constant");		
		timeConstantField = new JTextField((new Double(VRProblemModel.DEFAULT_TIME_CONST)).toString(), 6);
		
		centerPanel.add(resetsLabel);
		centerPanel.add(resetsField);
		centerPanel.add(lambdaLabel);
		centerPanel.add(lambdaField);					
		centerPanel.add(finalTempLabel);
		centerPanel.add(finalTempField);			
		centerPanel.add(timeConstantLabel);
		centerPanel.add(timeConstantField);	
				
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
	public static SimulatedAnnealingSettings getInstance () {
		if (instance == null) instance = new SimulatedAnnealingSettings();
		
		return instance;
	}		
}