package tccrouter.diamante.extension.command.memento;

import tccrouter.diamante.core.command.memento.Memento;
import tccrouter.diamante.core.graph.property.ComponentProperties;

public class EdgeMemento extends Memento
{

    int v1;
    int v2;

    public EdgeMemento(int v1, int v2, ComponentProperties properties)
    {
        super(properties);
        this.v1 = v1;
        this.v2 = v2;
    }

    public int getV1()
    {
        return v1;
    }

    public int getV2()
    {
        return v2;
    }
}
