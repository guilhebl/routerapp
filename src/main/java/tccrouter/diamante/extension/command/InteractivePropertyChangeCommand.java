package tccrouter.diamante.extension.command;

import tccrouter.diamante.core.command.Command;
import tccrouter.diamante.core.graph.Edge;
import tccrouter.diamante.core.graph.Graph;
import tccrouter.diamante.core.graph.GraphComponent;
import tccrouter.diamante.extension.graph.property.InteractiveProperty;

public class InteractivePropertyChangeCommand extends Command
{

    InteractiveProperty property;
    String value;
    GraphComponent component;

    public InteractivePropertyChangeCommand(Graph g, InteractiveProperty property, GraphComponent component, String value)
    {
        super(g);
        this.property = property;
        this.value = value;
        this.component = component;
    }

    public void execute()
        throws IllegalArgumentException
    {
        try
        {
            String oldValue = property.toString();
            property.fromString(value);
            value = oldValue;
            
            if (component instanceof Edge) {
            	Edge e = (Edge) component;
            	g.updateShortestPathDistance(e.getV1(), e.getV2());
            }
        }
        catch(IllegalArgumentException exc)
        {
            throw exc;
        }
    }

    public void unexecute()
        throws IllegalArgumentException
    {
        execute();
    }

    public InteractiveProperty getProperty()
    {
        return property;
    }

    public String getOldValue()
    {
        return property.toString();
    }

    public String getNewValue()
    {
        return value;
    }

    public GraphComponent getComponent()
    {
        return component;
    }
}
