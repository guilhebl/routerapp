package tccrouter.diamante.extension.command.memento;

import tccrouter.diamante.core.command.memento.Memento;
import tccrouter.diamante.core.graph.property.ComponentProperties;

public class NodeMemento extends Memento
{

    int index;

    public NodeMemento(int index, ComponentProperties properties)
    {
        super(properties);
        this.index = index;
    }

    public int getIndex()
    {
        return index;
    }
}
