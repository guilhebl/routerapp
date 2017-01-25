package tccrouter.gbl.dao;

import javax.swing.JOptionPane;

import tccrouter.diamante.core.graph.Graph;
import tccrouter.ring.dao.AbstractDAOFactory;

public class JDBCGraphDAOFactory extends AbstractDAOFactory {

	JDBCGraphDAO jdbcDAO;
	String graphName;

	public JDBCGraphDAOFactory(Object value) {
		
		if (JDBCProperties.JDBC_DRIVER_URL.indexOf("db2") > 0) {
			jdbcDAO = new DB2GraphDAO((Graph)value);
		} else if (JDBCProperties.JDBC_DRIVER_URL.indexOf("postgresql") > 0) {
			jdbcDAO = new PostgreGraphDAO((Graph)value);
		} else {			
			jdbcDAO = null;
		}
	}

	public void makeObject() {
	}

	public void saveObject() {
				try {
					jdbcDAO.storeGraph(graphName);
				} catch (Exception exc) {
					JOptionPane.showMessageDialog(
						null,
						"Error saving Graph in Database.",
						"Saving Graph",
						JOptionPane.ERROR_MESSAGE);
				}

	}

	public Object readObject(String graphName) {		
		return jdbcDAO.retrieveGraph(new Integer(graphName).intValue());
	}

	public String[][] findAllGraphs() {
		return jdbcDAO.retrieveGraphList();
	}
	
	public void setObjectName(String name) {
		graphName = name;
	}

}