package tccrouter.diamante.extension.command.graphcommand;

import tccrouter.diamante.core.command.GraphCommand;
import tccrouter.diamante.core.graph.Graph;
import tccrouter.diamante.core.graph.Node;
import tccrouter.diamante.core.graph.SimpleNode;
import tccrouter.diamante.core.graph.property.ComponentProperties;
import tccrouter.diamante.extension.command.memento.NodeMemento;
import tccrouter.diamante.extension.graph.property.ID;

public class CreateNode extends GraphCommand
{

    public CreateNode(Graph g, ComponentProperties properties)
    {
        super(g);
        int index = ((ID)properties.getPropertyByName("ID")).getValue();
        memento = new NodeMemento(index, properties);
    }

    public void execute()
    {
        Node n = new SimpleNode(memento.getProperties());
        g.insertNodeAt(n, ((NodeMemento)memento).getIndex());
    }

    public void unexecute()
    {
        g.removeNode(((NodeMemento)memento).getIndex());
    }
}
