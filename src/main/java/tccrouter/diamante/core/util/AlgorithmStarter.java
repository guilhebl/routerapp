package tccrouter.diamante.core.util;

import tccrouter.diamante.core.command.Algorithm;
import tccrouter.diamante.core.graph.Graph;

public class AlgorithmStarter
{

    private static AlgorithmStarter instance;

    protected AlgorithmStarter()
    {
    }

    public static AlgorithmStarter getInstance()
    {
        if(instance == null)
        {
            instance = new AlgorithmStarter();
        }
        return instance;
    }

    public void start(Algorithm alg)
    {
        Graph g = alg.getGraph();
        g.contextSwitch(alg);
        alg.execute();
        g.contextReturn(alg);
    }
}
