package tccrouter.diamante.core.graph.factory;


// Referenced classes of package tccrouter.diamante.core.graph.factory:
//            GraphFactory

public class DefaultValueTypeProperty
{

    private String name;
    private String defaultValue;
    private String value;
    GraphFactory gf;
    private String type;

    public DefaultValueTypeProperty(GraphFactory gf, String name, String type, String defaultValue)
    {
        this.gf = gf;
        this.name = name;
        this.type = type;
        this.defaultValue = defaultValue;
        value = defaultValue;
        gf.getNeededProperties().put(getName(), this);
    }

    public String getName()
    {
        return name;
    }

    public String getType()
    {
        return type;
    }

    private String getDefaultValue()
    {
        return defaultValue;
    }

    public String getValue()
    {
        return value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }

    public void restoreDefaultValue()
    {
        value = getDefaultValue();
    }
}
