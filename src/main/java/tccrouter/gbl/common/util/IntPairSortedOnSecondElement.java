
/*
** This code was written by Kent Paul Dolan.  See accompanying file
** TravellerDoc.html for status for your use.
*/

package tccrouter.gbl.common.util;

public class IntPairSortedOnSecondElement
  implements ContentComparable
{
  private int m_first;
  private int m_second;

  public IntPairSortedOnSecondElement( int first, int second )
  {
    super();
    m_first  = first;
    m_second = second;
  }

  public IntPairSortedOnSecondElement( IntPairSortedOnSecondElement that )
  {
    this( that.m_first, that.m_second );
  }

  public int getFirst()
  {
    return m_first;
  }

  public int getSecond()
  {
    return m_second;
  }

  public String toString()
  {
    return new String
    (
      "(" + this.m_first + "," + this.m_second + ")"
    );
  }

  public int compareTo( Object that )
  {

//        System.out.println
//        (
//          this.toString()
//          + " < "
//          +  ( ( IntPairSortedOnSecondElement ) that).toString()
//          + " = "
//          + (
//              this.m_second
//              <
//              ( ( IntPairSortedOnSecondElement ) that).m_second
//            )
//        );

    if ( this.m_second < ( ( IntPairSortedOnSecondElement ) that).m_second )
    {
      return Sortable.THIS_LESS_THAN;
    }

    if ( this.m_second > ( ( IntPairSortedOnSecondElement ) that).m_second )
    {
      return Sortable.THIS_GREATER_THAN;
    }

    return Sortable.THIS_EQUAL_TO;

  }

  public void swap ( Object l, Object r )
  {
    IntPairSortedOnSecondElement left  = ( IntPairSortedOnSecondElement ) l;
    IntPairSortedOnSecondElement right = ( IntPairSortedOnSecondElement ) r;
    int firstTemp;
    int secondTemp;
    firstTemp = left.m_first;
    secondTemp = left.m_second;
    left.m_first = right.m_first;
    left.m_second = right.m_second;
    right.m_first = firstTemp;
    right.m_second = secondTemp;

//      System.out.println
//      (
//        "Swapped " + left.toString() + " with " + right.toString()
//      );

  }

  public boolean contentIsTheSameAs( Object that )
  {
    return
      (
        this.m_first  == ( (IntPairSortedOnSecondElement) that ).getFirst()
        &&
        this.m_second == ( (IntPairSortedOnSecondElement) that ).getSecond()
      );
  }

}
