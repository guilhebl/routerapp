package tccrouter.diamante.core.command.memento;

import tccrouter.diamante.core.graph.property.ComponentProperties;

public abstract class Memento
{

    ComponentProperties properties;

    public Memento(ComponentProperties properties)
    {
        this.properties = properties;
    }

    public ComponentProperties getProperties()
    {
        return properties;
    }
}
