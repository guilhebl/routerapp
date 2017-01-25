package tccrouter.diamante.core.graph;

import java.util.Vector;

import tccrouter.diamante.core.graph.property.ComponentProperties;

// Referenced classes of package tccrouter.diamante.core.graph:
//            Node

public class Cluster extends Node
{

    Vector clusteredNodes;

    public Cluster(ComponentProperties properties)
    {
        super(properties);
    }
}
