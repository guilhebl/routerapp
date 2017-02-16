package tccrouter.gbl.common.util;

import java.awt.Color;
import java.util.Iterator;
import java.util.List;

import tccrouter.diamante.core.graph.Edge;
import tccrouter.diamante.core.graph.Graph;
import tccrouter.gbl.common.entity.ShortestPath;

public class ColorUtil {

    public static final Color COLOR_WAYPOINT     = new Color(255,64,255);
    public static int colorCounter = 0;
	
	/**
	 * The variety of colors to paint different components.
	 */
	public static String colors [] = {"0,255,0","255,255,0","255,0,0","255,100,0","0,0,0",
						"0,255,255","150,150,150","255,0,255","255,255,255"};

	/**
	 * The variety of colors to paint different paths.
	 */
//	public static String pathColors [] = {"0,0,255","0,51,204","0,102,153","0,153,102",
//		"0,204,51","0,255,0","51,204,0","102,153,0","153,102,0","204,51,0","255,0,0"};

	//	public static String pathColors [] = {Color.BLUE.toString(), Color.ORANGE.toString(),
//		Color.BLACK.toString(),Color.CYAN.toString(), Color.MAGENTA.toString(), 
//		Color.RED.toString(), Color.PINK.toString(), Color.YELLOW.toString(), 
//		Color.DARK_GRAY.toString()};
	public static String pathColors [] = {"0,0,255","240,52,53","0,204,21","151,154,18",
		"153,222,0","255,0,222", "20,190,190", "205,205,102"};
	

	// reset the current color counter
	public static void resetColorCounter() {
		colorCounter = 0;
	}
	
	// Set the current color to node j
	public static void setSourceNodeColor(Graph g, int j) { 	
		if (j >= 0) {
	        g.setNodeProperty(j,"ComponentColor",colors[2]);
		}
	}
	
	// Set the current color to node j
	public static void setClientNodeColor(Graph g, int j) {
		if (j >= 0) {
			g.setNodeProperty(j,"ComponentColor",colors[1]);
		}
	}
	
	// Colors a specific path for the Graph
	public static void colorPath(Graph g, int sourceNode, int clientNodes[]) {
				
        // calculate round-trip distance
		ShortestPath path = g.getShortestPath(sourceNode ,clientNodes[clientNodes.length -1]);		
		List<Edge> edgeSet = path.getEdgeSet();
		
		for (Iterator<Edge> iter = edgeSet.iterator(); iter.hasNext();) {
			Edge element = iter.next();
			g.setEdgeProperty(element.getV1(),element.getV2(),"ComponentColor",pathColors[colorCounter]);
		}

        // calculate round-trip distance
		path = g.getShortestPath(sourceNode ,clientNodes[0]);		
		edgeSet = path.getEdgeSet();
		
		for (Iterator<Edge> iter = edgeSet.iterator(); iter.hasNext();) {
			Edge element = iter.next();
			g.setEdgeProperty(element.getV1(),element.getV2(),"ComponentColor",pathColors[colorCounter]);
		}
		
		for (int i = 1; i < clientNodes.length; i++) {
						
			path = g.getShortestPath(clientNodes[i-1], clientNodes[i]);		
			edgeSet = path.getEdgeSet();
			
			for (Iterator<Edge> iter = edgeSet.iterator(); iter.hasNext();) {
				Edge element = iter.next();
				g.setEdgeProperty(element.getV1(),element.getV2(),"ComponentColor",pathColors[colorCounter]);
			}			
			
		}

		colorCounter++;
		
		if ( colorCounter == pathColors.length ) {
			colorCounter = 0;
		}
	}

	// Colors a specific path for the Graph
	public static void colorPath(Graph g, int clientNodes[]) {
		
        //		 calculate round-trip distance
		ShortestPath path = g.getShortestPath(clientNodes[0], clientNodes[clientNodes.length -1]);		
		List<Edge> edgeSet = path.getEdgeSet();
		
		for (Iterator<Edge> iter = edgeSet.iterator(); iter.hasNext();) {
			Edge element = iter.next();
			g.setEdgeProperty(element.getV1(),element.getV2(),"ComponentColor","0,0,255");
		}
		
		for (int i = 1; i < clientNodes.length; i++) {
						
			path = g.getShortestPath(clientNodes[i-1], clientNodes[i]);	
			
			if (path != null) {
				edgeSet = path.getEdgeSet();
				
				for (Iterator<Edge> iter = edgeSet.iterator(); iter.hasNext();) {
					Edge element = iter.next();
					g.setEdgeProperty(element.getV1(),element.getV2(),"ComponentColor","0,0,255");
				}			
				
			}
		}

	}	
}
