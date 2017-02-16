package tccrouter.diamante.core.command;

import java.util.Vector;

import tccrouter.diamante.core.command.memento.Memento;
import tccrouter.diamante.core.graph.Graph;

public abstract class Command
{

    protected Graph g;
    protected Memento memento;
    protected Vector<Command> subcommands;

    public Command(Graph g)
    {
        this.g = g;
        subcommands = new Vector<>();
    }

    public abstract void execute();

    public abstract void unexecute();

    public void addSubcommand(Command command)
    {
        subcommands.addElement(command);
    }

    public Vector<Command> getSubCommands()
    {
        return subcommands;
    }

    public Graph getGraph()
    {
        return g;
    }
}
