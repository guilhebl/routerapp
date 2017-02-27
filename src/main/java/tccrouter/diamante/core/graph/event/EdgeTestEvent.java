package tccrouter.diamante.core.graph.event;


// Referenced classes of package tccrouter.diamante.core.graph.event:
//            GraphEvent

public class EdgeTestEvent extends GraphEvent
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 924547057294168450L;
	
	private int n1;
    private int n2;

    public EdgeTestEvent(Object obj, int n1, int n2)
    {
        super(obj);
        this.n1 = n1;
        this.n2 = n2;
    }

    public int getN1()
    {
        return n1;
    }

    public int getN2()
    {
        return n2;
    }
}
