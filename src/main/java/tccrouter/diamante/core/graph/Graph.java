package tccrouter.diamante.core.graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

import tccrouter.diamante.core.command.Algorithm;
import tccrouter.diamante.core.command.Command;
import tccrouter.diamante.core.graph.event.EdgeTestEvent;
import tccrouter.diamante.core.graph.event.GraphEvent;
import tccrouter.diamante.core.graph.event.GraphObserver;
import tccrouter.diamante.core.graph.property.Property;
import tccrouter.diamante.extension.command.InteractivePropertyChangeCommand;
import tccrouter.diamante.extension.graph.property.InteractiveProperty;
import tccrouter.gbl.common.entity.ShortestPath;

// Referenced classes of package tccrouter.diamante.core.graph:
//            Node, Edge

public abstract class Graph
{

    protected int currentCommand;
    protected Vector commands;
    protected Vector nodes;
    protected Vector edges;
    Vector observers;
    Stack commandsStack;

    public Graph()
    {
        currentCommand = 0;
        commands = new Vector();
        nodes = new Vector();
        edges = new Vector();
        observers = new Vector();
        commandsStack = new Stack();
    }

    public boolean e(int v1, int v2)
    {
        fireEvent(new EdgeTestEvent(this, v1, v2));
        return edgeExists(v1, v2);
    }

    public abstract boolean edgeExists(int i, int j);

    public void addNode(Node newNode)
    {
        nodes.addElement(newNode);
    }

    public abstract void addEdge(Edge edge);

    public void addCommand(Command newCommand)
    {
        if(currentCommand != commands.size() - 1)
        {
            for(int i = commands.size() - 1 - currentCommand; i >= 0; i--)
            {
                commands.removeElementAt(commands.size() - 1);
            }

        }
        currentCommand = commands.size();
        commands.addElement(newCommand);
    }

    public Node getNode(int v)
    {
        return (Node)nodes.elementAt(v);
    }

    public abstract void removeNode(int i);

    public abstract void setNodeAt(Node node, int i);

    public abstract void insertNodeAt(Node node, int i);

    public abstract Edge getEdge(int i, int j);

    public abstract void removeEdge(int i, int j);

    public int getN()
    {
        return nodes.size();
    }

    public Command getCommand(int i)
    {
        if(i >= commands.size())
        {
            return null;
        } else
        {
            return (Command)commands.elementAt(i);
        }
    }

    public int getCurrentCommand()
    {
        return currentCommand;
    }

    public void setCurrentCommand(int i)
    {
        if(i < commands.size())
        {
            if(i < 0)
            {
                currentCommand = 0;
            } else
            {
                currentCommand = i;
            }
        } else
        {
            currentCommand = commands.size() - 1;
        }
    }

    public void clearCommandsList()
    {
        commands.clear();
    }

    public Property getNodeProperty(int n, String propertyName)
    {
        if(getNode(n) != null)
        {
            return getNode(n).getProperties().getPropertyByName(propertyName);
        } else
        {
            return null;
        }
    }

    public Property getEdgeProperty(int n1, int n2, String propertyName)
    {
        if(getEdge(n1, n2) != null)
        {
            return getEdge(n1, n2).getProperties().getPropertyByName(propertyName);
        } else
        {
            return null;
        }
    }

    public void addGraphObserver(GraphObserver obs)
    {
        observers.addElement(obs);
    }

    public void removeGraphObserver(GraphObserver obs)
    {
        observers.removeElement(obs);
    }

    private void fireEvent(GraphEvent evt)
    {
		GraphObserver obs;
		Iterator i = observers.iterator(); 
		
		while (i.hasNext()) {
			obs = (GraphObserver) i.next();
			obs.graphEventOccurred(evt);
		}
    }

    public void contextSwitch(Algorithm alg)
    {
        commandsStack.push(commands);
        commands = alg.getSubCommands();
        currentCommand = 0;
    }

    public void contextReturn(Algorithm alg)
    {
        Vector oldCommands = (Vector)commandsStack.pop();
        oldCommands.addElement(alg);
        commands = oldCommands;
        currentCommand = commands.size() - 1;
    }

    public void setNodeProperty(int index, String propName, String value)
        throws NullPointerException, ClassCastException, IllegalArgumentException
    {
        Node n = getNode(index);
        if(n != null)
        {
            InteractiveProperty prop = (InteractiveProperty)n.getProperties().getPropertyByName(propName);
            InteractivePropertyChangeCommand cmd = new InteractivePropertyChangeCommand(this, prop, n, value);
            commands.addElement(cmd);
            cmd.execute();
            fireEvent(new GraphEvent(this));
        } else
        {
            throw new NullPointerException("The node doesn't exist or it has been removed");
        }
    }

    public void setEdgeProperty(int n1, int n2, String propName, String value)
        throws NullPointerException, ClassCastException, IllegalArgumentException
    {
        Edge e = getEdge(n1, n2);
        if(e != null)
        {
            InteractiveProperty prop = (InteractiveProperty)e.getProperties().getPropertyByName(propName);
            InteractivePropertyChangeCommand cmd = new InteractivePropertyChangeCommand(this, prop, e, value);
            commands.addElement(cmd);
            cmd.execute();
            fireEvent(new GraphEvent(this));
        } else
        {
            throw new NullPointerException("The edge doesn't exist or it has been removed");
        }
    }

    public int getCommandsSize()
    {
        return commands.size();
    }

    public Vector getCommands()
    {
        return commands;
    }
    
    /*
     * methods added by Guilherme Becker L. for the AI algorithms
     * implementation
     */
    /**
     * @param i
     * @param j 
     * @return shortest known path between the two selected nodes.
     */    
    public abstract ShortestPath getShortestPath(int i, int j);
    
    /**
     * @param i
     * @param j 
     * @return shortest known path distance between the two selected nodes.
     */    
    public abstract double shortestPathDistance(int i, int j);
    
    /**
     * @param i
     * @param j
     * @param edgeSet the new Optimal path between the two nodes 
     */    	
    public abstract void setShortestPath(int i, int j, ArrayList edgeSet);    

    /**
     * @param i
     * @param j 
     * @return rather exists a path between the two selected nodes.
     */        
    public abstract boolean existsPath(int i, int j);
    
    /**
     * @param i
     * @param j 
     */        
    public abstract void updateShortestPathDistance(int i, int j);
    
}
