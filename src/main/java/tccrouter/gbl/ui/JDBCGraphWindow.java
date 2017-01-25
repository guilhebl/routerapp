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

import tccrouter.gbl.dao.JDBCGraphDAOFactory;
import tccrouter.ring.dao.AbstractDAOFactory;
import tccrouter.ring.gui.UIFacade;

/**
 */
public class JDBCGraphWindow extends JDialog {

	/**
	 * The unique instance of this class.
	 */
	protected static JDBCGraphWindow instance;	
	private JTextField graphName;
	private JList graphsList;
	private String[][] graphs;
	
	
	/**
	 * The factory of the DAO object that will deal with secondary
	 * graph input and output.
	 */
	AbstractDAOFactory daoFactory;
	

	/**
	 * Creates an instance of this window
	 */
	protected JDBCGraphWindow() {				
	}
	
	/**
	 * Creates an instance of this window 
	 */
	public void buildSaveWindow() {
		this.dispose();

		this.setBounds(200,150,400,100);
		this.setTitle("Save Graph");
				
		JButton okButton = new JButton(new AbstractAction("OK") {
			public void actionPerformed(ActionEvent evt) {
				try {

					daoFactory = AbstractDAOFactory.getDAOFactory(AbstractDAOFactory.JDBC_GRAPH,UIFacade.getInstance().getGraph());
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
			public void actionPerformed(ActionEvent evt) {
				try {

					daoFactory = AbstractDAOFactory.getDAOFactory(AbstractDAOFactory.JDBC_GRAPH,UIFacade.getInstance().getGraph());
					UIFacade.getInstance().openJDBCGraph(getListItem(graphsList,graphs));
					
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
		
		daoFactory = AbstractDAOFactory.getDAOFactory(AbstractDAOFactory.JDBC_GRAPH,UIFacade.getInstance().getGraph());
		graphs = ((JDBCGraphDAOFactory)daoFactory).findAllGraphs();
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
	
	private JList makeList(final String[][] items, int visibleRows, Container parent) {
		JList list = new JList(new AbstractListModel()	{
			public Object getElementAt(int i) {
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
	
	public String getListItem(JList list, String[][] items) {
		return items[list.getSelectedIndex()][1];
	}
	
	/**
	 * Retrieves the unique instance to this class.
	 * @return the unique instance to this class
	 */
	public static JDBCGraphWindow getInstance() {
		if(instance == null) instance = new JDBCGraphWindow();
		
		return instance;
	}
}
