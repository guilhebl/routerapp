
/*
** This code was written by Kent Paul Dolan.  See accompanying file
** TravellerDoc.html for status for your use.
*/

package tccrouter.gbl.common.util;

public class IntDoublePairSortedOnDouble
  implements ContentComparable
{
  private int m_int;
  private double m_double;

  public IntDoublePairSortedOnDouble( int p_int, double p_double )
  {
    super();
    m_int  = p_int;
    m_double = p_double;
  }

  public IntDoublePairSortedOnDouble( IntDoublePairSortedOnDouble that )
  {
    this( that.m_int, that.m_double );
  }

  public int getInt()
  {
    return m_int;
  }

  public double getDouble()
  {
    return m_double;
  }

  public String toString()
  {
    return new String
    (
      "(" + this.m_int + "," + this.m_double + ")"
    );
  }

  public int compareTo( Object that )
  {

/*
** We cannot even afford the cost of an if (DB) in a loop this hot, so
** comment out the debugging stuff.
*/

    if ( this.m_double < ( ( IntDoublePairSortedOnDouble ) that).m_double )
    {
      return Sortable.THIS_LESS_THAN;
    }

    if ( this.m_double > ( ( IntDoublePairSortedOnDouble ) that).m_double )
    {
      return Sortable.THIS_GREATER_THAN;
    }

    return Sortable.THIS_EQUAL_TO;

  }

  public void swap ( Object l, Object r )
  {
    IntDoublePairSortedOnDouble left  = ( IntDoublePairSortedOnDouble ) l;
    IntDoublePairSortedOnDouble right = ( IntDoublePairSortedOnDouble ) r;
    int intTemp;
    double doubleTemp;
    intTemp = left.m_int;
    doubleTemp = left.m_double;
    left.m_int = right.m_int;
    left.m_double = right.m_double;
    right.m_int = intTemp;
    right.m_double = doubleTemp;

/*
** We cannot even afford the cost of an if (DB) in a loop this hot, so
** comment out the debugging stuff.
*/

//      System.out.println
//      (
//        "Swapped " + left.toString() + " with " + right.toString()
//      );

  }

  public boolean contentIsTheSameAs( Object that )
  {
    return
      (
        this.m_int    == ( (IntDoublePairSortedOnDouble) that ).getInt()
        &&
        this.m_double == ( (IntDoublePairSortedOnDouble) that ).getDouble()
      );
  }

}
