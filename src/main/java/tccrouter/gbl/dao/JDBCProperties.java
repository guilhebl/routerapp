package tccrouter.gbl.dao;

/**
 * TO DO
 * The intent is to make a .properties file to read the DB properties dynamically,
 * but for the meanwhile edit Application Connection for your specific connection
 * 
 * @author guilherme becker
 *
 */
public interface JDBCProperties {

	public static final String DB_PASSWORD = "gblprod1";
	public static final String DB_USER = "Administrador";

	// DB2
	public static final String DB2_DRIVER = "com.ibm.db2.jcc.DB2Driver";
	public static final String JDBC_DB2_DRIVER_URL = "jdbc:db2://localhost:50000/routerai";

	// POSTGRE SQL
	public static final String POSTGRESQL_DRIVER = "org.postgresql.Driver";
	public static final String JDBC_POSTGRESQL_DRIVER_URL = "jdbc:postgresql://localhost:5432/graphdb:tdgraph";

	// Application Connection
	public static final String JDBC_DRIVER = DB2_DRIVER;
	public static final String JDBC_DRIVER_URL = JDBC_DB2_DRIVER_URL;
}
