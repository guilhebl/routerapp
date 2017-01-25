package tccrouter.diamante.extension.command;

import java.util.Iterator;
import java.util.Vector;

import tccrouter.diamante.core.command.Command;
import tccrouter.diamante.core.graph.Graph;

// Referenced classes of package tccrouter.diamante.extension.command:
//            InteractivePropertyChangeCommand

public class PropertyChangeSetCommand extends Command
{

    Vector changeCommands;

    public PropertyChangeSetCommand(Graph g)
    {
        super(g);
        changeCommands = new Vector();
    }

    public PropertyChangeSetCommand(Graph g, Vector changeCommands)
    {
        super(g);
        this.changeCommands = changeCommands;
    }

    public void addChangeCommand(InteractivePropertyChangeCommand command)
    {
        if(changeCommands != null)
        {
            changeCommands.add(command);
        }
    }

    public void execute()
    {
        for(Iterator i = changeCommands.iterator(); i.hasNext(); ((InteractivePropertyChangeCommand)i.next()).execute()) { }
    }

    public void unexecute()
    {
        for(Iterator i = changeCommands.iterator(); i.hasNext(); ((InteractivePropertyChangeCommand)i.next()).unexecute()) { }
    }
}
