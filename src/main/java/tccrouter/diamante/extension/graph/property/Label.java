package tccrouter.diamante.extension.graph.property;

import tccrouter.diamante.core.graph.property.Property;

// Referenced classes of package tccrouter.diamante.extension.graph.property:
//            InteractiveProperty

public class Label extends Property
    implements InteractiveProperty
{

    String label;

    public Label(String label)
    {
        super("Label");
        this.label = label;
    }

    public boolean equals(Property prop2)
    {
        Label lbl = (Label)prop2;
        return label.equals(lbl);
    }

    public String getValue()
    {
        return label;
    }

    public void setValue(String string)
    {
        label = string;
    }

    public void fromString(String value)
        throws IllegalArgumentException
    {
        label = value;
    }

    public String toString()
    {
        return label;
    }
}
