
package tccrouter.ring.graph;

import tccrouter.diamante.core.graph.Edge;
import tccrouter.diamante.core.util.Matrix;

/**
 * 
 */
public class Multigraph extends GTCGraph {

    /**
     * 
     */
    Matrix adjacencies;      
    /**
     * 
     */
    public Multigraph() {
        super();

        adjacencies = new Matrix();
    }

    /**
     * @see diamante.core.graph.Graph#edgeExists(int, int)
     */
    public boolean edgeExists(int n1, int n2) {
    	EdgeSet edges = (EdgeSet) adjacencies.elementAt(n1,n2);
    	
    	if (edges == null)
    		return false;
    	else
    		return edges.size() > 0;
    }

    /**
     * @see diamante.core.graph.Graph#addEdge(diamante.core.graph.Edge)
     */
    public void addEdge(Edge e) {
        EdgeSet edges = (EdgeSet) adjacencies.elementAt(e.getV1(),e.getV2());
        
        if (edges == null) {
            edges = new EdgeSet();
            adjacencies.setElementAt(edges,e.getV1(),e.getV2());
        }
        
        edges.addEdge(e);
    }

    /**
     * @see diamante.core.graph.Graph#removeNode(int)
     */
    public void removeNode(int n) {
        super.removeNode(n);
        
        for (int i=0 ; i<getN() ; i++) {
            EdgeSet startingEdges = (EdgeSet) adjacencies.elementAt(n,i);
            EdgeSet endingEdges = (EdgeSet) adjacencies.elementAt(i,n);
            
            startingEdges.clear();
            endingEdges.clear();
        }
    }

    /**
     * @see diamante.core.graph.Graph#getEdge(int, int)
     */
    public Edge getEdge(int n1, int n2) throws UnsupportedOperationException {
    	throw new UnsupportedOperationException("Use 'getEdgeSet(int,int)' for pseudographs instead");
    }
    
    /**
     * 
     * @param n1
     * @param n2
     * @return
     */
    public EdgeSet getEdgeSet(int n1, int n2) {
    	return (EdgeSet) adjacencies.elementAt(n1,n2);
    }

    /**
     * @see diamante.core.graph.Graph#removeEdge(int, int)
     */
    public void removeEdge(int n1, int n2) throws UnsupportedOperationException {
    	throw new UnsupportedOperationException("Use 'removeEdge(Edge)' for pseudographs instead");
    }
    
    /**
     * 
     * @param e
     */
    public void removeEdge(Edge e) {
    	((EdgeSet) adjacencies.elementAt(e.getV1(),e.getV2())).removeEdge(e);
    }

}
