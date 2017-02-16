package tccrouter.diamante.extension.graph;

import java.util.List;

import tccrouter.diamante.core.graph.Edge;
import tccrouter.diamante.core.graph.Graph;
import tccrouter.diamante.core.graph.Node;
import tccrouter.diamante.core.util.Matrix;
import tccrouter.gbl.common.entity.ShortestPath;

public class SimpleGraph extends Graph
{

    protected Matrix adjacencies;

    public SimpleGraph()
    {
        adjacencies = new Matrix();
    }

    public boolean edgeExists(int v1, int v2)
    {
        return adjacencies.elementAt(v1, v2) != null;
    }

    public void addEdge(Edge newEdge)
    {
        Edge inverseEdge = new Edge(newEdge.getV2(), newEdge.getV1(), newEdge.getProperties());
        adjacencies.add(newEdge.getV1(), newEdge.getV2(), newEdge);
        adjacencies.add(inverseEdge.getV1(), inverseEdge.getV2(), inverseEdge);
        edges.addElement(newEdge);
    }

    public Edge getEdge(int v1, int v2)
    {
        return (Edge)adjacencies.elementAt(v1, v2);
    }

    public void removeNode(int v)
    {
        nodes.setElementAt(null, v);
        for(int i = 0; i < getN(); i++)
        {
            adjacencies.setElementAt(null, i, v);
            adjacencies.setElementAt(null, v, i);
        }

    }

    public void setNodeAt(Node newNode, int v)
    {
        nodes.setElementAt(newNode, v);
        for(int i = 0; i < getN(); i++)
        {
            adjacencies.setElementAt(null, i, v);
            adjacencies.setElementAt(null, v, i);
        }

    }

    public void insertNodeAt(Node newNode, int v)
    {
        Matrix newAdj = new Matrix();
        int newI = 0;
        int newJ = 0;
        int i = adjacencies.getColumnCount();
        for(i = 0; i < adjacencies.getRowCount(); i++)
        {
            for(int j = 0; j < adjacencies.getColumnCount(); j++)
            {
                if(v == j)
                {
                    newAdj.add(newI, newJ, null);
                    newJ++;
                }
                newAdj.add(newI, newJ, adjacencies.elementAt(i, j));
                newJ++;
            }

            if(v == i)
            {
                newAdj.add(newI, newJ, null);
                newI++;
            }
            newI++;
            newJ = 0;
        }

        nodes.insertElementAt(newNode, v);
        adjacencies = newAdj;
        for(int k = 0; k < adjacencies.getColumnCount(); k++)
        {
            adjacencies.add(i, k, null);
            adjacencies.add(k, i, null);
        }

    }

    public void removeEdge(int v1, int v2)
    {
        edges.removeElement(adjacencies.elementAt(v1, v2));
        adjacencies.removeElementAt(v1, v2);
        adjacencies.removeElementAt(v2, v1);
    }

	public double shortestPathDistance(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean existsPath(int i, int j) {
		// TODO Auto-generated method stub
		return false;
	}

	public ShortestPath getShortestPath(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateShortestPathDistance(int i, int j) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setShortestPath(int i, int j, List<Edge> edgeSet) {
		// TODO Auto-generated method stub
		
	}
}
