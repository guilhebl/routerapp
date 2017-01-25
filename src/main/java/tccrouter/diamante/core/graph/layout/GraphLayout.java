package tccrouter.diamante.core.graph.layout;

import java.util.Hashtable;

import tccrouter.diamante.core.graph.Graph;
import tccrouter.diamante.core.graph.GraphComponent;
import tccrouter.diamante.extension.graph.property.Position;

public abstract class GraphLayout
{

    protected Graph g;
    protected Hashtable componentToPosition;
    protected Hashtable positionToComponent;
    protected String name;

    public GraphLayout(Graph g, String name)
    {
        this.g = g;
        this.name = name;
        componentToPosition = new Hashtable();
        positionToComponent = new Hashtable();
    }

    public GraphComponent getComponentByPosition(Position p)
    {
        return (GraphComponent)positionToComponent.get(p);
    }

    public Position getPositionByComponent(GraphComponent c)
    {
        return (Position)componentToPosition.get(c);
    }

    public abstract void doLayout(Object obj);

    public String toString()
    {
        return name;
    }

    public void setGraph(Graph g)
    {
        this.g = g;
    }
}
