
/*
** This code was written by Kent Paul Dolan.  See accompanying file
** TravellerDoc.html for status for your use.
*/

package tccrouter.gbl.tsp.genetic.entity;

import tccrouter.gbl.common.util.Sortable;

public class Codon extends Object implements Sortable, Cloneable
{
  private Integer m_datum = null;

/*
  public Object clone()
  {
    return ( (Object) ((Codon)this).clone() );
  }
*/

  public String toString()
  {
    if ( this.m_datum == null )
    {
      return new String( "(null Codon)" );
    }
    else
    {
      return this.m_datum.toString();
    }
  }

  public int compareTo( Object that )
  {

    if ( this.get() < ((Codon)that).get() )
    {
      return Sortable.THIS_LESS_THAN;
    }

    if ( this.get() > ((Codon)that).get() )
    {
      return Sortable.THIS_GREATER_THAN;
    }

    return Sortable.THIS_EQUAL_TO;

  }

  public void swap( Object object_1 , Object object_2 )
  {

    Object temp = null;

    try
    {
      temp     = (Object) ((Codon)object_1).clone();
      object_1 = (Object) ((Codon)object_2).clone();
      object_2 = (Object) ((Codon)temp    ).clone();
    }
    catch (Exception e) {}
  }

  public  Codon( int initialValue )
  {
    this.m_datum = new java.lang.Integer( initialValue );
  }
  
  public  Codon( Codon that )
  {
    this.m_datum = new Integer( that.get() );
  }

  public  int get()
  {
    return m_datum.intValue();
  }

  public void set( int value )
  {
    try
    {
      this.m_datum = new Integer( value );
    }
    catch (Exception CodonSet)
    {

    }
  }
  
  public void set( Codon that )
  {
    this.m_datum = new Integer( that.get() );
  }
}

