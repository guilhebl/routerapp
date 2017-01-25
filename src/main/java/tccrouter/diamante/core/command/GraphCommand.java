package tccrouter.diamante.core.command;

import tccrouter.diamante.core.graph.Graph;

// Referenced classes of package tccrouter.diamante.core.command:
//            Command

public abstract class GraphCommand extends Command
{

    public GraphCommand(Graph g)
    {
        super(g);
    }

    public abstract void execute();

    public abstract void unexecute();
}
