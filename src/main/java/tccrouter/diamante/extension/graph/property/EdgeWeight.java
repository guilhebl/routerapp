package tccrouter.diamante.extension.graph.property;

import tccrouter.diamante.core.graph.property.Property;

// Referenced classes of package tccrouter.diamante.extension.graph.property:
//            InteractiveProperty

public class EdgeWeight extends Property
    implements InteractiveProperty
{

    double weight;

    public EdgeWeight(double weight)
    {
        super("EdgeWeight");
        this.weight = weight;
    }

    public double getValue()
    {
        return weight;
    }

    public void setValue(double value)
    {
        weight = value;
    }

    public boolean equals(Property prop2)
    {
        return weight == ((EdgeWeight)prop2).getValue();
    }

    public void fromString(String value)
        throws IllegalArgumentException
    {
        try
        {
            weight = Integer.parseInt(value);
        }
        catch(NumberFormatException e)
        {
            throw new IllegalArgumentException("The edge weight must be an integer number");
        }
    }

    public String toString()
    {    	
        return new Double(weight).toString();
    }
}