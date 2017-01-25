package tccrouter.diamante.extension.command.graphcommand;

import java.util.Iterator;

import tccrouter.diamante.core.command.Command;
import tccrouter.diamante.core.command.GraphCommand;
import tccrouter.diamante.core.graph.Graph;
import tccrouter.diamante.core.graph.Node;
import tccrouter.diamante.core.graph.SimpleNode;
import tccrouter.diamante.extension.command.memento.NodeMemento;

// Referenced classes of package tccrouter.diamante.extension.command.graphcommand:
//            RemoveEdge

public class RemoveNode extends GraphCommand
{

    public RemoveNode(Graph g, int v)
    {
        super(g);
        memento = new NodeMemento(v, g.getNode(v).getProperties());
        int n = g.getN();
        for(int i = 0; i < n; i++)
        {
            if(g.edgeExists(v, i))
            {
                addSubcommand(new RemoveEdge(g, v, i));
            }
        }

    }

    public void execute()
    {
        for(int i = 0; i < subcommands.size(); i++)
        {
            ((Command)subcommands.elementAt(i)).execute();
        }

        g.removeNode(((NodeMemento)memento).getIndex());
    }

    public void unexecute()
    {
        Node v = new SimpleNode(memento.getProperties());
        g.setNodeAt(v, ((NodeMemento)memento).getIndex());
        for(Iterator i = subcommands.iterator(); i.hasNext(); ((Command)i.next()).unexecute()) { }
    }
}
