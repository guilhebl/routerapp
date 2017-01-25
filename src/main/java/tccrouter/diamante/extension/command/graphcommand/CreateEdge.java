package tccrouter.diamante.extension.command.graphcommand;

import tccrouter.diamante.core.command.GraphCommand;
import tccrouter.diamante.core.graph.Edge;
import tccrouter.diamante.core.graph.Graph;
import tccrouter.diamante.core.graph.property.ComponentProperties;
import tccrouter.diamante.extension.command.memento.EdgeMemento;

public class CreateEdge extends GraphCommand
{

    public CreateEdge(Graph g, int v1, int v2, ComponentProperties properties)
    {
        super(g);
        memento = new EdgeMemento(v1, v2, properties);
    }

    public void execute()
    {
    	Edge e = new Edge(((EdgeMemento)memento).getV1(), ((EdgeMemento)memento).getV2(), memento.getProperties());
    	g.addEdge(e);
    }

    public void unexecute()
    {
        g.removeEdge(((EdgeMemento)memento).getV1(), ((EdgeMemento)memento).getV2());
    }
}
