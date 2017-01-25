package tccrouter.gbl.common.util;

import java.util.Vector;

public class HeapWithDelete
  extends Heap
{

  Vector m_findStack = null;

  public HeapWithDelete()
  {
    this( POPS_LARGEST );
  }

  public HeapWithDelete( int gender )
  {
    super( gender );
  }

  public void delete( int elementSlot )
  {
    int lastSlot = m_heap.size() - 1;

    if ( elementSlot == lastSlot )
    {

/*
** Seize the chance to grab some low lying fruit, make the easy case
** easy, and avoid possible ContentComparable object miscoding problems when
** swapping an object with itself.
*/

      m_heap.removeElementAt( lastSlot );
    }
    else
    {

/*
** Swap the element to be deleted into the last slot, where deleting it
** won't leave a "hole" that might require linear-in-problem-size time
** to re-fill.
*/

      ( (ContentComparable) m_heap.elementAt(elementSlot) ).swap
      (
        (ContentComparable) m_heap.elementAt(elementSlot),
        (ContentComparable) m_heap.elementAt(lastSlot)
      );

/*
** Now we can safely remove the element.
*/

      m_heap.removeElementAt( lastSlot );

/*
** However, now we are probably in violation of our heap invariant from
** having moved the last element into a slot where it doesn't belong.
** Put Humpty Dumpty back together again. Bubble the element up until it
** finds a parent with whom it is in the correct relationship (or
** becomes the root node), then bubble it back down the other side of
** the branch below it if it is in the wrong relationship with the
** sibling node of the root of the branch from which it bubbled up.
*/

      int toWhere = upheap( m_heap, elementSlot );
      downheap( m_heap, toWhere, m_heap.size() );
    }
  }


/*
** The nasty part, finding the beast we want to remove, given only a
** reference to it, which doesn't help much, because we need to know
** where in the heap that reference lives.  We _could_ do this by a
** linear search, but possibly we can get some better average case
** performance by using the modest intelligence we have of knowing that
** wherever the instance is, it is obeying the heap invariant by being
** there.  This doesn't help as much as if the heap were instead sorted,
** which would let us do a binary search; here our search_can_ go
** astray, but in some parts it can be cut short by the heap invariant,
** and in other parts we can make a best guess about which of two
** eligible branches to search first.  I doubt I'll get log(N) behavior
** here, but I can dream better than I can analyze.  It's times like
** these I wish being homeless didn't cut me off from my copy of
** Sedgewick's _Algorithms_, where I could _look_ _up_ the answer
** instead of reinventing it.
*/

  private void pushFindStack( int node )
  {
    m_findStack.addElement( new Integer( node ) );
  }

  private int popFindStack()
  {
    int temp = ( (Integer) m_findStack.lastElement() ).intValue();
    m_findStack.removeElementAt( m_findStack.size() - 1);
    return temp;
  }

  private boolean isEmptyFindStack()
  {
    return ( ( m_findStack == null ) || ( m_findStack.size() == 0 ) );
  }

  private boolean bothKidsIneligible
  (
    Vector slots,
    int currentNode,
    int heapSize,
    ContentComparable value
  )
  {
    return
    (
      ( !leftChildExists( currentNode, heapSize ) )
      ||
      (
        (
          ( (ContentComparable) leftChild( slots, currentNode, heapSize ) )
          .compareTo ( (ContentComparable) value )
          ==
          m_sortTest
        )
        &&
        (
          ( ! rightChildExists( currentNode, heapSize ) )
          ||
          (
            ( (ContentComparable) rightChild( slots, currentNode, heapSize ) )
            .compareTo ( (ContentComparable) value )
            ==
            m_sortTest
          )
        )
      )
    );
  }

  private int findTheHardWay( ContentComparable value )
  {
    for ( int i = 0; i < m_heap.size(); i++ )
    {
      if ( value.contentIsTheSameAs( m_heap.elementAt(i) ) )
      {
        return i;
      }
    }
    return -1;
  }

  public int findByValue( ContentComparable value )
  {

    m_findStack = new Vector(); // discard previously used find stack
    int heapSize = m_heap.size();

    int currentNode = 0; // Start at the root, of course.

    while
    (
      (! ( (ContentComparable) m_heap.elementAt( currentNode ) ).contentIsTheSameAs( (ContentComparable) value ) )
      &&
      (
        ( ! isEmptyFindStack() )
        ||
        (
          leftChildExists( currentNode, heapSize )
        )
      )
    )
    {

/*
** Oh, my, is this going to be messy.  Take our best shots in order:
** travel down branches that sort equal to the target value, then travel
** down the more extremely heap invariant obeying (larger, in the
** default case) sort-valued branch, then travel down the less extreme
** branch, in that order.  Branches that aren't immediately to be
** followed go first on the find stack, so that we can persue them
** later, doing a depth first search.  There are a lot of possible cases
** here, including the case where our find stack is empty but both
** branches are impossible containers of the sort value sought due to
** heap invariant restrictions.  Take that failing case first of all.
*/

      if
      (
        ( isEmptyFindStack() )
        &&
        bothKidsIneligible( m_heap, currentNode, heapSize, value )
      )
      {

        kablooie
        (
          "while loop in findByValue ran out of ways to find the target node."
        );

        m_findStack = null;
        return findTheHardWay( value );
      }

/*
** Handle non-failure cases one by one.
** 
** If both children are ineligible, go back to stack.
*/

      if ( bothKidsIneligible( m_heap, currentNode, heapSize, value ) )
      {
        currentNode = popFindStack();
        continue;
      }

/*
** If only the left child exists, follow it, we have no choice, and from
** the above, it is eligible.
*/

      if (! rightChildExists( currentNode, heapSize ) )
      {
        currentNode = ( 2 * currentNode ) + 1;
        continue;
      }

/*
** If both exist and compare sortably equal to the target, it doesn't
** seem to matter much which one we follow first. Stack the left, pick
** the right, because the right branch potentially contains fewer nodes,
** can be eliminated faster.
*/

      if
      (
        (
          ( (ContentComparable) leftChild( m_heap, currentNode, heapSize ) )
          .compareTo ( (ContentComparable) value )
          ==
          ContentComparable.THIS_EQUAL_TO
        )
        &&
        (
          (
            ( (ContentComparable) rightChild( m_heap, currentNode, heapSize ) )
            .compareTo ( (ContentComparable) value )
            ==
            ContentComparable.THIS_EQUAL_TO
          )
        )
      )
      {
        pushFindStack( ( 2 * currentNode ) + 1 );
        currentNode = ( 2 * currentNode ) + 2;

        continue;
      }

/*
** If the right child is sortably equal, but the left child is
** ineligible, follow the equal one, the only
** choice.
*/

      if
      (
        (
          ( (ContentComparable) rightChild( m_heap, currentNode, heapSize ) )
          .compareTo ( (ContentComparable) value )
          ==
          ContentComparable.THIS_EQUAL_TO
        )
        &&
        (
          ( (ContentComparable) leftChild( m_heap, currentNode, heapSize ) )
          .compareTo ( (ContentComparable) value )
          ==
          m_sortTest  // i.e. ineligible
        )
      )
      {
        currentNode = ( 2 * currentNode ) + 2;
        continue;
      }

/*
** If the right child is sortably equal, but the left child is eligible,
** stack the eligible one, follow the equal one, it _might_ be the
** target, giving an instant win.
*/

      if
      (
        (
          ( (ContentComparable) rightChild( m_heap, currentNode, heapSize ) )
          .compareTo ( (ContentComparable) value )
          ==
          ContentComparable.THIS_EQUAL_TO
        )
        &&
        (
          ( (ContentComparable) value )
          .compareTo
          (
            (ContentComparable ) leftChild( m_heap, currentNode, heapSize )
          )
          ==
          m_sortTest  // i.e. eligible
        )
      )
      {
        pushFindStack( ( 2 * currentNode ) + 1 );
        currentNode = ( 2 * currentNode ) + 2;
        continue;
      }

/*
** If the left child is sortably equal, but the right child is
** ineligible, follow the equal one, the only choice.
*/

      if
      (
        (
          ( (ContentComparable) leftChild( m_heap, currentNode, heapSize ) )
          .compareTo ( (ContentComparable) value )
          ==
          ContentComparable.THIS_EQUAL_TO
        )
        &&
        (
          ( (ContentComparable) rightChild( m_heap, currentNode, heapSize ) )
          .compareTo ( (ContentComparable) value )
          ==
          m_sortTest  // i.e. ineligible
        )
      )
      {
        currentNode = ( 2 * currentNode ) + 1;
        continue;
      }

/*
** If the left child is sortably equal, but the right child is eligible,
** stack the eligible one, follow the equal one, it _might_ be the
** target, giving an instant win.
*/

      if
      (
        (
          ( (ContentComparable) leftChild( m_heap, currentNode, heapSize ) )
          .compareTo ( (ContentComparable) value )
          ==
          ContentComparable.THIS_EQUAL_TO
        )
        &&
        (
          ( (ContentComparable) value )
          .compareTo
          (
            (ContentComparable) rightChild( m_heap, currentNode, heapSize )
          )
          ==
          m_sortTest  // i.e. eligible
        )
      )
      {
        pushFindStack( ( 2 * currentNode ) + 2 );
        currentNode = ( 2 * currentNode ) + 1;
        continue;
      }


      if
      (
        (
          ( (ContentComparable) leftChild( m_heap, currentNode, heapSize ) )
          .compareTo ( (ContentComparable) value )
          ==
          ContentComparable.THIS_EQUAL_TO
        )
      )
      {
        pushFindStack( ( 2 * currentNode ) + 2 );
        currentNode = ( 2 * currentNode ) + 1;
        continue;
      }

/*
** If the right child is eligible, but the left child is not, follow the
** right branch.
*/

      if
      (
        (
          ( (ContentComparable) leftChild( m_heap, currentNode, heapSize ) )
          .compareTo ( (ContentComparable) value )
          ==
          m_sortTest
        )
        &&
        (
          ( (ContentComparable) value ).compareTo
          (
            (ContentComparable) rightChild( m_heap, currentNode, heapSize )
          )
          ==
          m_sortTest
        )
      )
      {
        currentNode = ( 2 * currentNode ) + 2;
        continue;
      }

/*
** If both children are eligible, the only remaining possible case,
** stack the left, follow the right first, on the slim evidences that 1)
** there's "more room" under the right one where the target can hide,
** and 2) that's the branch down which the target would have gone during
** downheap if left and right children both had their current values
** when the target was added to the heap.
*/

      pushFindStack( ( 2 * currentNode ) + 1 );
      currentNode = ( 2 * currentNode ) + 2;
      continue;
    }

    if ( ( (ContentComparable) m_heap.elementAt( currentNode ) ).contentIsTheSameAs( value ) )
    {
      m_findStack = null;
      return currentNode;
    }
    else
    {

/*
** Cause a deliberate array-out-of-bounds exception to force a crash
** leading to code debugging. In correct code, this case should never
** occur, so don't pretend to cater for it by throwing and catching
** exceptions, which are intended for _expected_ failures only.
*/

      kablooie
      (
        "while loop in findByValue dropped through without "
        + "finding the target node."
      );

      m_findStack = null;
      return findTheHardWay( value );
    }
  }

  private void kablooie(String why)
  {
    System.out.println
    (
     "HeapWithDelete evoked kablooie()"
     + "\r\n"
     + "because "
     + why
    );
  }

}
