package tccrouter.diamante.core.graph.property;


public abstract class Property
{

    String name;

    public Property(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String string)
    {
        name = string;
    }

    public abstract boolean equals(Property property);

    public abstract void fromString(String s)
        throws IllegalArgumentException;

    public abstract String toString();
}
