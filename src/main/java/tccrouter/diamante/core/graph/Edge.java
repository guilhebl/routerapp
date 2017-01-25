package tccrouter.diamante.core.graph;

import tccrouter.diamante.core.graph.property.ComponentProperties;

// Referenced classes of package tccrouter.diamante.core.graph:
//            GraphComponent

public class Edge extends GraphComponent
{

    int v1;
    int v2;

    public Edge(int v1, int v2, ComponentProperties properties)
    {
        super(properties);
        this.v1 = v1;
        this.v2 = v2;
    }

    public int getV1()
    {
        return v1;
    }

    public void setV1(int v1)
    {
        this.v1 = v1;
    }

    public int getV2()
    {
        return v2;
    }

    public void setV2(int v2)
    {
        this.v2 = v2;
    }
}
