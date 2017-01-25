
/*
** This code was written by Kent Paul Dolan, from knowledge of good
** programming practice.  See accompanying file TravellerDoc.html for
** status for your use.
*/

package tccrouter.gbl.tsp.genetic.tools;


public interface Sortable
{

  public static final int THIS_LESS_THAN    = -1;
  public static final int THIS_EQUAL_TO     =  0;
  public static final int THIS_GREATER_THAN =  1;

  public int compareTo( Object that );
  public void swap( Object object_1 , Object object_2 );
}

