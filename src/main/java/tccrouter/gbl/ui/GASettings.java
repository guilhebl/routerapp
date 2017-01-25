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

public class GASettings extends JDialog {

	/**
	 * The unique instance of this class.
	 */
	protected static GASettings instance;
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
	JTextField popSizeField;
	JLabel popSizeLabel;

	/** 
	 */
	JTextField maxGenerationsField;
	JLabel maxGenerationsLabel;
	
	/** 
	 */
	JTextField mutationRateField;
	JLabel mutationRateLabel;
	
	/** 
	 *  
	 */
	JCheckBox orderedCrossoverBox;

	/** 
	 *  
	 */
	JCheckBox cyclicCrossoverBox;

	/** 
	 *  
	 */
	JCheckBox pmxCrossoverBox;
	
	/** 
	 *  
	 */
	JCheckBox simulatedAnnealingBox;

	/** 
	 *  
	 */
	JCheckBox inverOverBox;

	final Action OK_ACTION = new AbstractAction("OK") {
		public void actionPerformed (ActionEvent evt) {
			
			/*
			 * Update the changes done in UI
			 */									
			/*
			 * Seting pop. Size
			 */
			tModel.setPopSize(new Integer(popSizeField.getText()).intValue());

			/*
			 * Seting mutation Rate
			 */
			tModel.setMutationRate(new Double(mutationRateField.getText()).doubleValue());

			/*
			 * Seting max Generations
			 */
			tModel.setMaxGenerations(new Integer(maxGenerationsField.getText()).intValue());
			
			if (orderedCrossoverBox.isSelected()) {
				tModel.setOrederedCrossover(true);				
			} else {
				tModel.setOrederedCrossover(false);
			}

			if (cyclicCrossoverBox.isSelected()) {
				tModel.setCyclicCrossover(true);				
			} else {
				tModel.setCyclicCrossover(false);
			}

			if (pmxCrossoverBox.isSelected()) {
				tModel.setPmxCrossover(true);				
			} else {
				tModel.setPmxCrossover(false);
			}

			if (inverOverBox.isSelected()) {
				tModel.setInverOver(true);				
			} else {
				tModel.setInverOver(false);
			}

			if (simulatedAnnealingBox.isSelected()) {
				tModel.setAnneal(true);				
			} else {
				tModel.setAnneal(false);
			}
			
			setVisible(false);    
		}
	};
		
	final Action RESTORE_DEFAULT_ACTION = new AbstractAction("Default Values") {
		public void actionPerformed (ActionEvent evt) {
			centerPanel = new JPanel(new FlowLayout());

			maxGenerationsLabel = new JLabel("Max Generations");		
			maxGenerationsField = new JTextField((new Integer(TSProblemModel.DEFAULT_GA_MAX_GENERATIONS)).toString(), 5);
			
			popSizeLabel = new JLabel("Population Size");		
			popSizeField = new JTextField((new Integer(TSProblemModel.DEFAULT_GA_POP_SIZE)).toString(), 5);

			mutationRateLabel = new JLabel("Mutation Rate");		
			mutationRateField = new JTextField((new Double(TSProblemModel.DEFAULT_MUTATION_RATE)).toString(), 5);
			
			orderedCrossoverBox = new JCheckBox("Ordered Crossover", TSProblemModel.DEFAULT_ORDERED_CROSSOVER);
			cyclicCrossoverBox = new JCheckBox("Cyclic Crossover", TSProblemModel.DEFAULT_CYCLIC_CROSSOVER);
			pmxCrossoverBox = new JCheckBox("PMX Crossover", TSProblemModel.DEFAULT_PMX_CROSSOVER);
			simulatedAnnealingBox = new JCheckBox("Simulated Annealing", TSProblemModel.DEFAULT_ANNEAL);
			inverOverBox = new JCheckBox("Inver Over", TSProblemModel.DEFAULT_INVER_OVER);

			centerPanel.add(maxGenerationsLabel);
			centerPanel.add(maxGenerationsField);		
			centerPanel.add(popSizeLabel);
			centerPanel.add(popSizeField);
			centerPanel.add(mutationRateLabel);
			centerPanel.add(mutationRateField);			
			centerPanel.add(orderedCrossoverBox);
			centerPanel.add(cyclicCrossoverBox);	
			centerPanel.add(pmxCrossoverBox);
			centerPanel.add(inverOverBox);
			centerPanel.add(simulatedAnnealingBox);
			
			centerPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			centerPanel.setForeground(Color.getColor("202,198,202"));
			
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
	protected GASettings () {
		setTitle("Genetic Algorithm Settings");
		setBounds(50,50,520,520);

		centerPanel = new JPanel(new FlowLayout());
		JPanel southPanel  = new JPanel(new FlowLayout());

		maxGenerationsLabel = new JLabel("Max Generations");		
		maxGenerationsField = new JTextField((new Integer(TSProblemModel.DEFAULT_GA_MAX_GENERATIONS)).toString(), 5);
		
		popSizeLabel = new JLabel("Population Size");		
		popSizeField = new JTextField((new Integer(TSProblemModel.DEFAULT_GA_POP_SIZE)).toString(), 5);

		mutationRateLabel = new JLabel("Mutation Rate");		
		mutationRateField = new JTextField((new Double(TSProblemModel.DEFAULT_MUTATION_RATE)).toString(), 5);
		
		orderedCrossoverBox = new JCheckBox("Ordered Crossover", TSProblemModel.DEFAULT_ORDERED_CROSSOVER);
		cyclicCrossoverBox = new JCheckBox("Cyclic Crossover", TSProblemModel.DEFAULT_CYCLIC_CROSSOVER);
		pmxCrossoverBox = new JCheckBox("PMX Crossover", TSProblemModel.DEFAULT_PMX_CROSSOVER);
		simulatedAnnealingBox = new JCheckBox("Simulated Annealing", TSProblemModel.DEFAULT_ANNEAL);
		inverOverBox = new JCheckBox("Inver Over", TSProblemModel.DEFAULT_INVER_OVER);

		centerPanel.add(maxGenerationsLabel);
		centerPanel.add(maxGenerationsField);		
		centerPanel.add(popSizeLabel);
		centerPanel.add(popSizeField);
		centerPanel.add(mutationRateLabel);
		centerPanel.add(mutationRateField);			
		centerPanel.add(orderedCrossoverBox);
		centerPanel.add(cyclicCrossoverBox);	
		centerPanel.add(pmxCrossoverBox);
		centerPanel.add(inverOverBox);
		centerPanel.add(simulatedAnnealingBox);
		
		centerPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		centerPanel.setForeground(Color.getColor("202,198,202"));
		
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
	public static GASettings getInstance () {
		if (instance == null) instance = new GASettings();
		
		return instance;
	}		
}