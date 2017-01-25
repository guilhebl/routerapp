package tccrouter.diamante.core.command;

import tccrouter.diamante.core.graph.Graph;

// Referenced classes of package tccrouter.diamante.core.command:
//            Command

public abstract class Algorithm extends Command
{

    String name;

    public Algorithm(Graph g, String name)
    {
        super(g);
        this.name = name;
    }

    public abstract void execute();

    public void unexecute()
    {
        for(int i = subcommands.size() - 1; i >= 0; i--)
        {
            Command cmd = (Command)subcommands.elementAt(i);
            cmd.unexecute();
        }

    }

    public String getName()
    {
        return name;
    }
}
