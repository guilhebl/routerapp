package tccrouter.diamante.core.graph;

import tccrouter.diamante.core.graph.property.ComponentProperties;

public class GraphComponent
{

    ComponentProperties properties;

    public GraphComponent(ComponentProperties properties)
    {
        this.properties = properties;
    }

    public ComponentProperties getProperties()
    {
        return properties;
    }

    public void setProperties(ComponentProperties properties)
    {
        this.properties = properties;
    }
}
