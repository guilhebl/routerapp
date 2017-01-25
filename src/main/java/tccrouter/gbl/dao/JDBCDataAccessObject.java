package tccrouter.gbl.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * 
 */
abstract class JDBCDataAccessObject {

	protected Connection connection;
	protected Statement stmt;
	
	public JDBCDataAccessObject() {
		
	}

	protected void openDataBase() {

		try {

			// Step 1: Load the JDBC driver.
			Class.forName(JDBCProperties.JDBC_DRIVER);

			// Step 2: Establish the connection to the database.
			connection = DriverManager.getConnection(JDBCProperties.JDBC_DRIVER_URL, JDBCProperties.DB_USER, JDBCProperties.DB_PASSWORD);
			stmt = connection.createStatement();

		} catch (ClassNotFoundException cfe) {
			cfe.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	protected void closeDataBase() {

		try {

			stmt.close();
			connection.close();

		} catch (SQLException sqe) {
			sqe.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	protected void openStatement() {

		try {

			stmt = connection.createStatement();

		} catch (SQLException sqe) {
			sqe.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	protected void closeStatement() {

		try {

			stmt.close();

		} catch (SQLException sqe) {
			sqe.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	protected void executeBatch() {

		try {

			boolean autoCommit = connection.getAutoCommit();
			connection.setAutoCommit(false);
			stmt.executeBatch();
			connection.commit();
			connection.setAutoCommit(autoCommit);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	protected String currval(String simpleName) {

		try { // Prepare a statement
			
			Statement stmt = connection.createStatement();
			
			String sqlSelect = "select gen_value FROM generic_sequence_generator WHERE gen_key = '" + simpleName + "'";
			
			// Set the value
			ResultSet rs = stmt.executeQuery(sqlSelect);
				
			if (rs.next()) {

				// get id			
				return new Integer(rs.getInt("gen_value")).toString();	
			}

			stmt.close();			

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	// Retrieves the next Id value for this class and updates Table
	protected String nextval(String string) {
		try { // Prepare a statement
			
			Statement stmt = connection.createStatement();
			
			String sqlSelect = "select gen_value FROM generic_sequence_generator WHERE gen_key = '" + string + "'";
			
			// Set the value
			ResultSet rs = stmt.executeQuery(sqlSelect);
				
			if (rs.next()) {

				// increment value
				Integer next = (rs.getInt("gen_value") + 1);
				
				String sqlUpdate = "UPDATE generic_sequence_generator SET gen_value = " + next.toString() + " WHERE gen_key = '" + string + "'";				
				Statement stmt2 = connection.createStatement();
				
				int rowsAffected = stmt2.executeUpdate(sqlUpdate);
				
				if (rowsAffected <= 0) {
					throw new SQLException("NO ROWS AFFECTED ON UPDATE");
				}

				stmt2.close();			
				stmt.close();			

				// get id			
				return next.toString();	
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

}
