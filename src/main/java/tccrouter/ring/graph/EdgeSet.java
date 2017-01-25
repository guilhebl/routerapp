package tccrouter.ring.graph;

import java.util.ArrayList;

import tccrouter.diamante.core.graph.Edge;

/**
 * 
 */
public class EdgeSet {
    
    ArrayList edges;
    
    /**
     * 
     *
     */
    public EdgeSet() {
       edges = new ArrayList(); 
    }
    
    /**
     * 
     * @param e
     */
    public void addEdge(Edge e) {
        edges.add(e);
    }
    
    /**
     * 
     * @param i
     * @return
     */
    public Edge getEdge(int i) {
    	return (Edge) edges.get(i);
    }
    
    /**
     * 
     * @param e
     */
    public void removeEdge(Edge e) {
        edges.remove(e);
    }
    
    /**
     * 
     * @return
     */
    public boolean isEmpty() {
        return (edges.size() == 0);
    }
    
    /**
     * 
     * @return
     */
    public int size() {
        return edges.size();
    }
    
    /**
     * 
     */
    public void clear() {
        edges.clear();
    }
}
