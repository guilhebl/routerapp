package tccrouter.gbl.ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

import tccrouter.ring.dao.AbstractDAOFactory;
import tccrouter.ring.dao.XMLGraphDAOFactory;
import tccrouter.ring.gui.UIFacade;

/**
 */
public class OpenGraphDialog extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3616928020822123910L;
		
	/**
	 * The unique instance of this class.
	 */
	private static OpenGraphDialog instance;	
	private JTextField graphName;
	private JList<String> graphsList;
	private String[][] graphs;
	
	
	/**
	 * The factory of the DAO object that will deal with secondary
	 * graph input and output.
	 */
	private AbstractDAOFactory daoFactory;
	

	/**
	 * Creates an instance of this window
	 */
	protected OpenGraphDialog() {				
	}
	
	/**
	 * Creates an instance of this window 
	 */
	public void buildSaveWindow() {
		this.dispose();

		this.setBounds(200,150,400,100);
		this.setTitle("Save Graph");
				
		JButton okButton = new JButton(new AbstractAction("OK") {
			/**
			 * 
			 */
			private static final long serialVersionUID = -7487765719798522920L;

			public void actionPerformed(ActionEvent evt) {
				try {

					daoFactory = AbstractDAOFactory.getDAOFactory(AbstractDAOFactory.XML_GRAPH,UIFacade.getInstance().getGraph());
					daoFactory.setObjectName(graphName.getText());
					daoFactory.saveObject();					
					setVisible(false);
				}
				catch(Exception exc) {
					JOptionPane.showMessageDialog(
						null,
						"Exception", 
						exc.getMessage(),
						JOptionPane.ERROR_MESSAGE
					);
				}
				
				JOptionPane.showMessageDialog(
						null,
						"Graph saved", 
						"Success",
						JOptionPane.INFORMATION_MESSAGE
					);
				
			}
		});
		JButton cancelButton = makeCancelButton();
		
		JPanel namePanel = new JPanel();
		JLabel labelGraphName = new JLabel("Graph Name: ");
		namePanel.add(labelGraphName, "North");
		graphName = new JTextField(32);
		namePanel.add(graphName, "North");		
		
		JPanel okCancelPanel = new JPanel(new FlowLayout());
		okCancelPanel.add(okButton);
		okCancelPanel.add(cancelButton);
		
		JPanel southPanel = new JPanel(new BorderLayout());
		southPanel.add(okCancelPanel,BorderLayout.EAST);
				
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(namePanel, BorderLayout.NORTH);
		getContentPane().add(southPanel,BorderLayout.SOUTH);				
	}

	private JButton makeCancelButton() {
		JButton cancelButton = new JButton(new AbstractAction("Cancel") {
			/**
			 * 
			 */
			private static final long serialVersionUID = 2053021883400837289L;

			public void actionPerformed(ActionEvent evt) {
				setVisible(false);
			}
		});
		return cancelButton;
	}
	
	/**
	 * Creates an instance of this window 
	 */
	public void buildLoadWindow() {
		this.dispose();
		
		this.setBounds(100,150,200,300);
		this.setTitle("Open Graph");
				
		JButton okButton = new JButton(new AbstractAction("OK") {
			/**
			 * 
			 */
			private static final long serialVersionUID = -6536105582815272307L;

			public void actionPerformed(ActionEvent evt) {
				try {

					daoFactory = AbstractDAOFactory.getDAOFactory(AbstractDAOFactory.XML_GRAPH,UIFacade.getInstance().getGraph());
					UIFacade.getInstance().openGraph(getListItem(graphsList,graphs), false);
					
					setVisible(false);
				}
				catch(Exception exc) {
					JOptionPane.showMessageDialog(
						null,
						"Exception", 
						exc.getMessage(),
						JOptionPane.ERROR_MESSAGE
					);
				}
			}
		});
		JButton cancelButton = makeCancelButton();
		
		JPanel namePanel = new JPanel();
		JLabel labelGraphName = new JLabel("Graph Name: ");
		namePanel.add(labelGraphName, "North");
		
		daoFactory = AbstractDAOFactory.getDAOFactory(AbstractDAOFactory.XML_GRAPH,UIFacade.getInstance().getGraph());
		graphs = ((XMLGraphDAOFactory)daoFactory).findAllGraphs();
		graphsList = makeList(graphs,6,namePanel);		
		
		JPanel okCancelPanel = new JPanel(new FlowLayout());
		okCancelPanel.add(okButton);
		okCancelPanel.add(cancelButton);
		
		JPanel southPanel = new JPanel(new BorderLayout());
		southPanel.add(okCancelPanel,BorderLayout.EAST);
				
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(namePanel, BorderLayout.NORTH);
		getContentPane().add(southPanel,BorderLayout.SOUTH);
				
	}
	
	private JList<String> makeList(final String[][] items, int visibleRows, Container parent) {
		JList<String> list = new JList<>(new AbstractListModel<String>()	{
			/**
			 * 
			 */
			private static final long serialVersionUID = 6510576197401709714L;

			public String getElementAt(int i) {
				return items[i][0];				
			}
			
			public int getSize() {
				return items.length;
			}
		});

		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setVisibleRowCount(visibleRows);
		parent.add(new JScrollPane(list));
		return list;
	}
	
	public String getListItem(JList<String> list, String[][] items) {
		return items[list.getSelectedIndex()][1];
	}
	
	/**
	 * Retrieves the unique instance to this class.
	 * @return the unique instance to this class
	 */
	public static OpenGraphDialog getInstance() {
		if (instance == null) {
			instance = new OpenGraphDialog();
		}
		
		return instance;
	}
}
