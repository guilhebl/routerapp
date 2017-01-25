
/*
** This code was written by Kent Paul Dolan, from knowledge of good
** programming practice.  See accompanying file TravellerDoc.html for
** status for your use.
*/

package tccrouter.gbl.common.util;


public interface ContentComparable
  extends Sortable
{
  public boolean contentIsTheSameAs( Object that );
}

