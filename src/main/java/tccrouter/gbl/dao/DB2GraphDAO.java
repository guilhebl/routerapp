package tccrouter.gbl.dao;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

import tccrouter.diamante.core.graph.Edge;
import tccrouter.diamante.core.graph.Graph;
import tccrouter.diamante.core.graph.Node;
import tccrouter.diamante.core.graph.SimpleNode;
import tccrouter.diamante.core.graph.property.ComponentProperties;
import tccrouter.diamante.extension.graph.property.ComponentColor;
import tccrouter.diamante.extension.graph.property.EdgeWeight;
import tccrouter.diamante.extension.graph.property.ID;
import tccrouter.diamante.extension.graph.property.Label;
import tccrouter.diamante.extension.graph.property.Position;
import tccrouter.gbl.common.entity.ShortestPath;
import tccrouter.ring.controller.PreferencesController;
import tccrouter.ring.graph.GTCGraph;

/**
 * Concrete JDBC Graph Data Access Object.
 * Implements Graph persistence ina JDBC DB.
 **/
public class DB2GraphDAO extends JDBCDataAccessObject implements JDBCGraphDAO {

	private static final int MAX_STRINGS = 64;
	private static final int NODE_RADIUS = 10;	
	
	/** Graph to be stored in a JDBC file */
	private GTCGraph jdbcGraph;

	/** Constructors */
	public DB2GraphDAO() {
		super();
	}
	
	public DB2GraphDAO(Graph value) {
		super();
		this.jdbcGraph = (GTCGraph)value;
	}

	/**********************************************************************************
	 * Methods for saving data in DB 
	 ***********************************************************************************/	
	
	/**
	 *	Make Graph JDBC 
	 **/
	public void storeGraph(String graphName) {

		/*
		 * Step 1: Initialize DB session.
		 */
		openDataBase();
		
		try { // Prepare a statement to insert a record

			// Insert the row
			String sqlInsert = "INSERT INTO graph (id, label)" + "VALUES(" + nextval("Graph") + ",'" + graphName + "')";
			stmt.addBatch(sqlInsert);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		/*
		 * stores the nodes
		 */
		for (int i = 0; i < jdbcGraph.getN(); i++) {
			storeNode(i);
		}

		executeBatch();
		
		/*
		 * stores the edges
		 */
		for (int i = 0; i < jdbcGraph.getN(); i++) {
			for (int j = i; j < jdbcGraph.getN(); j++) {
				if (jdbcGraph.edgeExists(i, j)) {
					storeEdge(i, j);
				}
			}
		}

		executeBatch();
		
//		/*
//		 * stores the Shortest Paths Matrix
//		 */
//		for (int i = 0; i < jdbcGraph.getN(); i++) {
//			for (int j = i + 1; j < jdbcGraph.getN(); j++) {
//			      if (jdbcGraph.shortestPath(i,j) != null) {
//			    	  storeShortestPath(jdbcGraph.shortestPath(i,j));
//			      }
//			}
//		}

		/*
		 * Step 4: close DB session
		 */
		closeDataBase();
	}

	/**
	 * Store JDBC Node
	 */
	public void storeNode(int nodeIndex) {

		try { // Prepare a statement to insert a record

			ComponentProperties prop = (jdbcGraph.getNode(nodeIndex)).getProperties();

			// Position
			Position pos = (Position) prop.getPropertyByName("Position");

			// Label
			Label lbl = (Label) prop.getPropertyByName("Label");
			
			// Insert the row
			String sqlInsert = "INSERT INTO node (id, graph_id, label, index, x, y)" + "VALUES(" + nextval("Node") + "," + currval("Graph") + ",'" + lbl.getValue() + "'," 
			+ nodeIndex + "," + pos.getX() + "," + pos.getY() +")";
			stmt.addBatch(sqlInsert);						

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Store JDBC Edge
	 */
	public void storeEdge(int i, int j) {

		Statement stmt2;
		Statement stmt3;		
		
		try { // Prepare a statement to insert a record

			stmt2 = connection.createStatement();			
			stmt3 = connection.createStatement();
			
			String sqlSelect2 = "select (id) FROM node where index = " + i + " AND graph_id = " + currval("Graph");
			String sqlSelect3 = "select (id) FROM node where index = " + j + " AND graph_id = " + currval("Graph");
			
			// Set the value
			ResultSet rs2 = stmt2.executeQuery(sqlSelect2);
			ResultSet rs3 = stmt3.executeQuery(sqlSelect3);
				
			if (rs2.next() && rs3.next()) {

    		int v1DB = rs2.getInt("id");
			int v2DB = rs3.getInt("id");
				
			Edge e = jdbcGraph.getEdge(i, j);			
			
			// edge atrributes			
			ComponentProperties prop = e.getProperties();			
			EdgeWeight edgeweight = (EdgeWeight) prop.getPropertyByName("EdgeWeight");
			double weight = edgeweight.getValue();
			
			// Insert the row
			String sqlInsert = "INSERT INTO edge (id, graph_id, v1, v2, v1index, v2index, weight)" + "VALUES("+ nextval("Edge") +","+ currval("Graph") +"," +
			v1DB + " ," + v2DB + ", " + e.getV1() + " ," + e.getV2() + ", " + weight + ")";
			
			stmt.addBatch(sqlInsert);
			}

			stmt2.close();
			stmt3.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Store JDBC Shortest Path
	 */
	public void storeShortestPath(ShortestPath sp) {

		Statement stmt2;
		Statement stmt3;
		
		try { // Prepare a statement to insert a record						

			stmt2 = connection.createStatement();
			stmt3 = connection.createStatement();
			
			String sqlSelect2 = "select * FROM node where index = " + sp.getV1() + " AND graph_id = " + currval("Graph");
			String sqlSelect3 = "select * FROM node where index = " + sp.getV2() + " AND graph_id = " + currval("Graph");
			
			// Set the value
			ResultSet rs2 = stmt2.executeQuery(sqlSelect2);
			ResultSet rs3 = stmt3.executeQuery(sqlSelect3);
			
			if (rs2.next() && rs3.next()) {
				
				int v1DB = rs2.getInt("id");
				int v2DB = rs3.getInt("id");
				
				double distance = sp.getDistance();
				
				// Insert the row
				String sqlInsert = "INSERT INTO shortest_path (id, graph_id, distance, v1, v2)" + "VALUES("+ nextval("ShortestPath")+","+ currval("Graph")+"," 
				+ distance + ", " + v1DB + ", " + v2DB + ")";
								
				stmt.executeUpdate(sqlInsert);
				
				// ShortestPath atrributes
				ArrayList edgeSet = sp.getEdgeSet();
				
				for (Iterator iter = edgeSet.iterator(); iter.hasNext();) {
					Edge element = (Edge) iter.next();
					storeShortestConnection(element);
				}							
				
			} else {

				throw new SQLException("Nodes non-existant in Database");
			}						

			stmt2.close();
			stmt3.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	/**
	 * Store JDBC Edge
	 */
	public void storeShortestConnection(Edge sc) {

		Statement stmt2;
		
		try { // Prepare a statement to insert a record
							
			String v1v2 = "";
			
			if (sc.getV1() < sc.getV2()) {
				v1v2 = "WHERE v1index = " + sc.getV1() +
				" AND v2index = " + sc.getV2();
			} else {
				v1v2 = "WHERE v1index = " + sc.getV2() +
				" AND v2index = " + sc.getV1();				
			}
			
			String sqlSelect2 = "select (id) FROM edge WHERE weight = ("+ 
			"SELECT weight FROM edge " + v1v2 + " AND graph_id = " + currval("Graph") + ")";
			

			stmt2 = connection.createStatement();			

			// Set the value
			ResultSet rs2 = stmt2.executeQuery(sqlSelect2);
				
			if (rs2.next()) {

			// edge atrributes
			int edgeID = rs2.getInt("id");	
			
			// Insert the row
			String sqlInsert = "INSERT INTO tdgraph.shortest_path_edges (sp_id, se_id)" + 
			" VALUES("+currval("ShortestPath")+", " + edgeID +")";
			
			stmt.executeUpdate(sqlInsert);
			}

			stmt2.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**********************************************************************************
	 * Methods for retrieving data from DB 
	 ***********************************************************************************/		
	public String[][] retrieveGraphList() {

		String[][] result = new String[MAX_STRINGS][2];
		int i = 0;

		openDataBase();

		try { // Prepare a statement to insert a record

			// get the code of the graphs in database
			String sqlSelect = "select * FROM graph";

			// Set the value
			ResultSet rs = stmt.executeQuery(sqlSelect);

			while (rs.next() && i < MAX_STRINGS) {
				result[i][1] = new Integer(rs.getInt("id")).toString();
				result[i][0] = rs.getString("label");

				i++;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		closeDataBase();

		return result;
	}

	public Graph retrieveGraph(int graphId) {

		Graph result = new GTCGraph();
		
		openDataBase();

		/*
		 * using the graph Id, retrieve the nodes,edges and shortest Path Matrix.
		 */				
		retrieveNodes(graphId, result);				
		retrieveEdges(graphId, result);				
//		retrieveShortestPaths(graphId, result);
		
		closeDataBase();

		return result;
	}

	private void retrieveNodes(int graphId, Graph result) {
		try { 

			// get the data of the nodes in database
			String sqlSelect = "select * FROM node WHERE graph_id = " + graphId;

			// Set the value
			ResultSet rs = stmt.executeQuery(sqlSelect);

			while (rs.next()) {
				
				int nodeIndex;
				double x,y;
				String label;
				
				/*
				 * Retrieving the node values
				 */
				nodeIndex = rs.getInt("index");
				x = rs.getDouble("x");
				y = rs.getDouble("y");
				label = rs.getString("label");
				
				/*
				 * Inserting on new graph
				 */
				ComponentProperties properties;
				ComponentColor nodeColor = new ComponentColor();
				
					nodeColor.setValue(
						PreferencesController.getInstance().getColor(
							PreferencesController.PROPERTIES_CATEGORY,
							PreferencesController.NODE_COLOR_PROPERTY,
							Color.BLUE
						)
					);
					
				properties = new ComponentProperties();
				properties.addProperty(nodeColor);
				properties.addProperty(
					new Position(x - NODE_RADIUS, y - NODE_RADIUS));
				properties.addProperty(new Label(label));
				properties.addProperty(new ID(nodeIndex));
				
				Node node = new SimpleNode(properties);
				result.addNode(node);
			}
			
			rs.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}

	private void retrieveEdges(int graphId, Graph result) {
		try { 

			// get the data of the edges in database
			String sqlSelect = "select * FROM edge WHERE graph_id = " + graphId;

			// Set the value
			ResultSet rs = stmt.executeQuery(sqlSelect);

			while (rs.next()) {
				
				int v1index,v2index;
				double weight;
				
				/*
				 * Retrieving the edge values
				 */
				v1index = rs.getInt("v1index");
				v2index = rs.getInt("v2index");
				weight = rs.getFloat("weight");
				
				/*
				 * Inserting on new graph
				 */
				ComponentProperties properties;
				ComponentColor edgeColor = new ComponentColor();
				
					edgeColor.setValue(
						PreferencesController.getInstance().getColor(
							PreferencesController.PROPERTIES_CATEGORY,
							PreferencesController.EDGE_COLOR_PROPERTY,
							Color.BLACK
						)
					);
					
				properties = new ComponentProperties();
				properties.addProperty(edgeColor);
				properties.addProperty(new EdgeWeight(weight));
				Edge newEdge = new Edge(v1index,v2index, properties);
					
				result.addEdge(newEdge);
				
			} // end while

			rs.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
	
	private void retrieveShortestPaths(int graphId, Graph result) {
		try { 

			// get the data in database
			String sqlSelect = "select * FROM shortest_path WHERE graph_id = " + graphId;

			// Set the value
			ResultSet rs = stmt.executeQuery(sqlSelect);

			/*
			 * Building the ShortestPath object with relative data fields.
			 */
			ArrayList path = new ArrayList();			
			int v1Index,v2Index;
			v1Index = v2Index = -1;

			while (rs.next()) {
			
				int spId;
				int v1,v2;
				
				/*
				 * Retrieving the shortest Path values
				 */
				spId = rs.getInt("id");
				v1 = rs.getInt("v1");
				v2 = rs.getInt("v2");
				
				/*
				 * Retrieving the relative node index from v1 and v2 in the graph
				 */
				// get the data of the nodes in database
				String sqlSelectV1 = "select * FROM node WHERE id = " + v1;
				String sqlSelectV2 = "select * FROM node WHERE id = " + v2;

				// Set the new Statements
				Statement stmt1 = connection.createStatement();
				Statement stmt2 = connection.createStatement();
				
				ResultSet rsV1 = stmt1.executeQuery(sqlSelectV1);
				ResultSet rsV2 = stmt2.executeQuery(sqlSelectV2);
				
				if (rsV1.next() && rsV2.next()) {
					
					/*
					 * Retrieving the node relative index values
					 */
					v1Index = rsV1.getInt("index");
					v2Index = rsV2.getInt("index");

					/*
					 * Retrieving the shortest connections representing the path in the graph
					 */
					String sqlSelectSC = "select * FROM shortest_path_edges WHERE sp_id = " + spId;

					// Set the value
					Statement stmtSC = connection.createStatement();
					ResultSet rsSC = stmtSC.executeQuery(sqlSelectSC);
					
					while (rsSC.next()) {
						
						int edgeID;
						
						/*
						 * Retrieving the Edge ID
						 */
						edgeID = rsSC.getInt("se_id");
						
						// get the data of the edge in database
						String sqlSelectEDGE = "select * FROM edge WHERE id = " + edgeID;

						// Set the value
						Statement stmtEDGE = connection.createStatement();
						ResultSet rsEDGE = stmtEDGE.executeQuery(sqlSelectEDGE);

						/*
						 * retrieving the edge
						 */
						if (rsEDGE.next()) {
							
							int v1INDEX,v2INDEX;
							
							/*
							 * Retrieving the edge node values
							 */
							v1INDEX = rsEDGE.getInt("v1index");
							v2INDEX = rsEDGE.getInt("v2index");


								/*
								 * Retrieving the correspondent edge from the graph
								 */
								Edge shortestEdge = result.getEdge(v1INDEX, v2INDEX);
								
								/*
								 * Insert it into the shortest Path Edge Set
								 */
								path.add(shortestEdge);
							}
						} // end while
				 
				}
										
							/*
							 * Inserting the Shortest Path on new graph
							 */							
				result.setShortestPath(v1Index, v2Index, path);
				
			} // end while

		} catch (SQLException e) {
			e.printStackTrace();
		}				
	}
	
}