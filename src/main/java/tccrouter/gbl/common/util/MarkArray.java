
/*
** This code was written by Kent Paul Dolan.  See accompanying file
** TravellerDoc.html for status for your use.
*/

package tccrouter.gbl.common.util;

public class MarkArray
{
  private boolean m_marks[] = null;
  private int     m_setCount = 0;

  public MarkArray( int size ) 
  {
    m_marks = new boolean[ size ];
    for ( int i=0; i<size; i++ ) { m_marks[i] = false; }
    m_setCount = 0;
  }

  public synchronized void setAllMarksTrue()
  {
    for ( int i=0; i<m_marks.length; i++ ) { m_marks[i] = true; }
    m_setCount = m_marks.length;
  }

  public synchronized void setAllMarksFalse()
  {
    for ( int i=0; i<m_marks.length; i++ ) { m_marks[i] = false; }
    m_setCount = 0;
  }

  public synchronized boolean setMarkAndCheckIfAllMarksAreSet( int index )
  {
    if ( m_marks[ index ] == false )
    {
      m_setCount++;
      m_marks[ index ] = true;
    }

    if ( m_setCount == m_marks.length )
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  public synchronized boolean clearMarkAndCheckIfAllMarksAreClear( int index )
  {
    if ( m_marks[ index ] == true )
    {
      m_setCount--;
      m_marks[ index ] = false;
    }

    if ( m_setCount == 0 )
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  public synchronized void clear( int index )
  {
    m_marks[ index ] = false;
  }

  public synchronized void set( int index )
  {
    m_marks[ index ] = true;
  }

  public synchronized int getCount()
  {
    return m_setCount;
  }

}
