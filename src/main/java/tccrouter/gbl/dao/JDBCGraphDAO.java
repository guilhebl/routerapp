package tccrouter.gbl.dao;

import tccrouter.diamante.core.graph.Edge;
import tccrouter.diamante.core.graph.Graph;
import tccrouter.gbl.common.entity.ShortestPath;

/**
 * 
 * @author guilherme becker
 *
 */
public interface JDBCGraphDAO {

	public void storeGraph(String graphName);
	public void storeNode(int nodeIndex);
	public void storeEdge(int i, int j);
	public void storeShortestPath(ShortestPath sp);
	public void storeShortestConnection(Edge sc);
	public String[][] retrieveGraphList();
	public Graph retrieveGraph(int graphId);
}
