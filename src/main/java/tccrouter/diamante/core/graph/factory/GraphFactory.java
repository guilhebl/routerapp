package tccrouter.diamante.core.graph.factory;

import java.util.HashMap;
import java.util.Vector;

import tccrouter.diamante.core.graph.Graph;

public abstract class GraphFactory
{

    protected HashMap neededProperties;
    protected Vector supportedLayouts;

    public GraphFactory()
    {
        neededProperties = new HashMap();
        supportedLayouts = new Vector();
    }

    public abstract Graph createGraph(HashMap hashmap);

    public abstract String toString();

    public HashMap getNeededProperties()
    {
        return neededProperties;
    }

    public Vector getSupportedLayouts()
    {
        return supportedLayouts;
    }

    public void setSupportedLayouts(Vector supported)
    {
        supportedLayouts = supported;
    }
}
