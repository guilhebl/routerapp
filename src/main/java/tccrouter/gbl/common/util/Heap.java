package tccrouter.gbl.common.util;

import java.util.Vector;

public class Heap
{

  public static int POPS_SMALLEST = 0;
  public static int POPS_LARGEST  = 1;

  protected Vector m_heap = null;

  protected int m_gender = POPS_LARGEST;
  protected int m_sortTest = Sortable.THIS_LESS_THAN;

  public Heap()
  {
    this( POPS_LARGEST );
  }

  public Heap( int gender )
  {
    super();

    if ( ( gender == POPS_SMALLEST ) || ( gender == POPS_LARGEST ) )
    {
      m_gender = gender;
    }
    else
    {
      m_gender = POPS_LARGEST;
    }

    if ( m_gender == POPS_LARGEST )
    {
      m_sortTest = Sortable.THIS_LESS_THAN;
    }
    else
    {
      m_sortTest = Sortable.THIS_GREATER_THAN;
    }

    m_heap = new Vector();
  }

  public String toString()
  {
    StringBuffer b = new StringBuffer();
    b.append( "\r\nStart of Heap" );
    for ( int i = 0; i < m_heap.size(); i++ )
    {
      b.append( "\r\n" + i + ", " + m_heap.elementAt(i).toString() );
    }
    b.append( "\r\n End of Heap" );
    return b.toString();
  }

  public void push( Sortable element )
  {
    m_heap.addElement( element );
    int toWhere = upheap( m_heap, m_heap.size() - 1 );
    downheap( m_heap, toWhere, m_heap.size() );
  }

  public Sortable pop()
  {
    ( (Sortable) m_heap.firstElement() ).swap
    (
      m_heap.firstElement(),
      m_heap.lastElement()
    );
    Sortable temp = (Sortable) m_heap.lastElement();
    downheap( m_heap, 0, m_heap.size() - 1 );
    m_heap.removeElementAt( m_heap.size() - 1 );
    return temp;
  }

  public boolean isEmpty()
  {
    return m_heap.isEmpty();
  }

  protected Sortable leftChild
  (
    Vector slots,
    int parentSlot,
    int arrayWorkingLength
  )
  {
    if ( ( ( 2 * parentSlot ) + 1 ) < arrayWorkingLength )
    {
      return ( Sortable ) slots.elementAt( ( 2 * parentSlot ) + 1 );
    }
    else
    {
      return null;
    }
  }

  protected Sortable rightChild
  (
    Vector slots,
    int parentSlot,
    int arrayWorkingLength
  )
  {
    if ( ( ( 2 * parentSlot ) + 2 ) < arrayWorkingLength )
    {
      return (Sortable) slots.elementAt( ( 2 * parentSlot ) + 2 );
    }
    else
    {
      return null;
    }
  }

  boolean leftChildExists( int parentSlot, int arrayWorkingLength )
  {
    return ( ( ( 2 * parentSlot ) + 1 ) < arrayWorkingLength );
  }

  boolean rightChildExists( int parentSlot, int arrayWorkingLength )
  {
    return ( ( ( 2 * parentSlot ) + 2 ) < arrayWorkingLength );
  }

  boolean parentExists( int childSlot )
  {
    return ( childSlot != 0 );
  };

  Sortable parent( Vector slots, int childSlot )
  {
    return (Sortable) slots.elementAt( ( childSlot - 1 ) / 2 );
  }

  protected int upheap( Vector slots, int childSlot )
  {
    while ( parentExists( childSlot ) )
    {
      if
      (
        parent( slots, childSlot ).compareTo( slots.elementAt( childSlot ) )
        ==
        m_sortTest
      )
      {
        parent( slots, childSlot ).swap
        (
          parent( slots, childSlot ),
          slots.elementAt( childSlot )
        );
        childSlot = ( childSlot - 1 ) / 2;
      }
      else
      {
        break;
      }
    }
    return childSlot;
  }

  protected void downheap
  (
    Vector slots,
    int parentSlot,
    int arrayWorkingLength
  )
  {
    while ( parentSlot < arrayWorkingLength/2 )
    {
      if ( rightChildExists( parentSlot, arrayWorkingLength ) )
      {
        if
        (
          leftChild( slots, parentSlot, arrayWorkingLength ).compareTo
          (
            rightChild( slots, parentSlot, arrayWorkingLength )
          )
          ==
          m_sortTest
        )
        {
          if
          (
            ( (Sortable) slots.elementAt(parentSlot) ).compareTo
            (
              rightChild( slots, parentSlot, arrayWorkingLength )
            )
            ==
            m_sortTest
          )
          {
            ( (Sortable) slots.elementAt(parentSlot) ).swap
            (
              (Sortable) slots.elementAt(parentSlot),
              rightChild( slots, parentSlot, arrayWorkingLength )
            );
            parentSlot = ( 2 * parentSlot ) + 2;
          }
          else
          {
            break;
          }
        }
        else
        {
          if
          (
            ( (Sortable) slots.elementAt(parentSlot) ).compareTo
            (
              leftChild( slots, parentSlot, arrayWorkingLength )
            )
            ==
            m_sortTest
          )
          {
            ( (Sortable) slots.elementAt(parentSlot) ).swap
            (
              (Sortable) slots.elementAt(parentSlot),
              leftChild( slots, parentSlot, arrayWorkingLength )
            );
            parentSlot = ( 2 * parentSlot ) + 1;
          }
          else
          {
            break;
          }
        }
      }
      else
      {
        if ( leftChildExists( parentSlot, arrayWorkingLength ) )
        {
          if
          (
            ( (Sortable) slots.elementAt(parentSlot) ).compareTo
            (
              leftChild( slots, parentSlot, arrayWorkingLength )
            )
            ==
            m_sortTest
          )
          {
            ( (Sortable) slots.elementAt(parentSlot) ).swap
            (
              (Sortable) slots.elementAt(parentSlot),
              leftChild( slots, parentSlot, arrayWorkingLength )
            );
            parentSlot = ( 2 * parentSlot ) + 1;
          }
          else
          {
            break;
          }
        }
        else
        {
          break;
        }
      }
    }
  } 
}
