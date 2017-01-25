package tccrouter.diamante.core.graph.property;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;

// Referenced classes of package tccrouter.diamante.core.graph.property:
//            Property

public class ComponentProperties
{

    Hashtable properties;

    public ComponentProperties()
    {
        properties = new Hashtable();
    }

    public Property getPropertyByName(String name)
    {
        return (Property)properties.get(name);
    }

    public void addProperty(Property prop)
    {
        properties.put(prop.getName(), prop);
    }

    public Vector getAllProperties()
    {
        Vector values = new Vector();
        for(Iterator i = properties.values().iterator(); i.hasNext(); values.addElement(i.next())) { }
        return values;
    }
}
