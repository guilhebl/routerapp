package tccrouter.diamante.extension.graph.property;

import java.awt.Color;

import tccrouter.diamante.core.graph.property.Property;

// Referenced classes of package tccrouter.diamante.extension.graph.property:
//            InteractiveProperty

public class ComponentColor extends Property
    implements InteractiveProperty
{

    Color color;

    public ComponentColor()
    {
        super("ComponentColor");
        color = Color.BLUE;
    }

    public boolean equals(Property prop2)
    {
        return false;
    }

    public Color getValue()
    {
        return color;
    }

    public void setValue(Color color)
    {
        this.color = color;
    }

    public void fromString(String value)
        throws IllegalArgumentException
    {
        String components[] = value.split(",");
        try
        {
            color = new Color(Integer.parseInt(components[0]), Integer.parseInt(components[1]), Integer.parseInt(components[2]));
        }
        catch(NumberFormatException e)
        {
            throw new IllegalArgumentException("The color string must be in the format 'R,G,B', where R, G and B are integer val" +
"ues"
);
        }
    }

    public String toString()
    {
        return new String(color.getRed() + "," + color.getGreen() + "," + color.getBlue());
    }
}
