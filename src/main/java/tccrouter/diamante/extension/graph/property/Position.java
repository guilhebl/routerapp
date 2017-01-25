package tccrouter.diamante.extension.graph.property;

import tccrouter.diamante.core.graph.property.Property;

// Referenced classes of package tccrouter.diamante.extension.graph.property:
//            InteractiveProperty

public class Position extends Property
    implements InteractiveProperty
{

    double x;
    double y;

    public Position(double x, double y)
    {
        super("Position");
        this.x = x;
        this.y = y;
    }

    public boolean equals(Property prop2)
    {
        if(prop2 instanceof Position)
        {
            Position pos = (Position)prop2;
            return x == pos.getX() && y == pos.getY();
        } else
        {
            return false;
        }
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public void setX(double i)
    {
        x = i;
    }

    public void setY(double i)
    {
        y = i;
    }

    public void fromString(String value)
        throws IllegalArgumentException
    {
        String coord[] = value.split(",");
        try
        {
            x = Double.parseDouble(coord[0]);
            y = Double.parseDouble(coord[1]);
        }
        catch(NumberFormatException e)
        {
            throw new IllegalArgumentException("Position must be in the format 'X,Y', where X and Y are integer numbers");
        }
    }

    public String toString()
    {
        return x + "," + y;
    }
}
