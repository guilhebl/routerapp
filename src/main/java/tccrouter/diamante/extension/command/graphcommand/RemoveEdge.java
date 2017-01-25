package tccrouter.diamante.extension.command.graphcommand;

import tccrouter.diamante.core.command.GraphCommand;
import tccrouter.diamante.core.graph.Edge;
import tccrouter.diamante.core.graph.Graph;
import tccrouter.diamante.extension.command.memento.EdgeMemento;

public class RemoveEdge extends GraphCommand
{

    public RemoveEdge(Graph g, int v1, int v2)
    {
        super(g);
        memento = new EdgeMemento(v1, v2, g.getEdge(v1, v2).getProperties());
    }

    public void execute()
    {
        g.removeEdge(((EdgeMemento)memento).getV1(), ((EdgeMemento)memento).getV2());
    }

    public void unexecute()
    {
        Edge e = new Edge(((EdgeMemento)memento).getV1(), ((EdgeMemento)memento).getV2(), memento.getProperties());
        g.addEdge(e);
    }
}
