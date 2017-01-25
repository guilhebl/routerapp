
/*
** This code was written by Kent Paul Dolan, implementing a well known
** published algorithm.  See accompanying file TravellerDoc.html for
** further details, and for the status of the modifications for your
** use.
*/

package tccrouter.gbl.common.util;


public class QuickSortAlgorithm
{

  public static void quickSort
  (
    Sortable[] inputArray,
    int arrayBottomIndex,
    int arrayTopIndex
  )
  {

    int lowIndex  = arrayBottomIndex;
    int highIndex = arrayTopIndex;
    Sortable pivotValue;

    if ( arrayTopIndex > arrayBottomIndex)
    {

/*
** Set pivot index at the middle of the array.  This is an arbitrary
** choice, as it is the pivot value that matters, and it might as well
** be selected at random as at the middle.
*/

      int pivotIndex = ( arrayBottomIndex + arrayTopIndex ) / 2;
      pivotValue = inputArray[ pivotIndex ];

/*
** Grab a handle to the pivot value.  This handle may not stay valid,
** because the pivot value is not tied to one location.  Since swap
** works on references, swap may silently move the pivot element's
** contents to a new location!  That is why the maintenance of the
** handle occurs repeatedly below as the pivot element gets swapped.
*/

/*
** Loop until the low and high indices meet somewhere in the input array.
*/


      while( lowIndex < highIndex )
      {

/*
** Move the low index rightward until an element that belongs to the
** right of the pivot element is found, or else the pivot element itself
** is found.  We may already be there.
*/

         while
         (
           ( lowIndex < pivotIndex )
           &&
           (
             inputArray[lowIndex].compareTo( pivotValue )
             !=
             Sortable.THIS_GREATER_THAN
           )
         )
         {
           ++lowIndex;
         }

/*
** Move the high index leftward until an element that belongs to the
** left of the pivot element is found, or else the pivot element itself
** is found.  We may already be there.
*/

         while
         (
           ( highIndex > pivotIndex )
           &&
           (
             pivotValue.compareTo( inputArray[highIndex] )
             !=
             Sortable.THIS_GREATER_THAN
           )
         )
         {
           --highIndex;
         }

/*
**  If the low and high indices have not met, swap the contents of the
**  elements at which they point.  Otherwise they have met at the
**  element containing the pivotValue.
*/

        if( lowIndex < highIndex )
        {
          inputArray[lowIndex].swap
          (
            inputArray[lowIndex],
            inputArray[highIndex]
          );

/*
** Once we start swapping the pivot element, I think it will take part
** in every subsequent swap!
*/

/*
** Did we swap the pivot object's contents, sitting under lowIndex, with
** those of the object at highIndex?  If so, we need to reacquire the
** handle to the pivot value object's contents, they have moved, and our
** present pivot value handle is now pointing at something else.
*/

          if ( lowIndex == pivotIndex )
          {
            pivotIndex = highIndex;
            pivotValue = inputArray[highIndex];
          }
          else
          {

/*
** Same question the other way around.  Notice that we are in an else
** body, so that we don't trap ourselves with the above change!
*/

            if ( highIndex == pivotIndex )
            {
              pivotIndex = lowIndex;
              pivotValue    = inputArray[lowIndex];
            }
          }
        }

      }

/*
** There is no need to re-sort the element containing pivotValue, so we omit it from the left and right subarrays we pass to our recursive child.
*/

/*
** If the pivot index is not now the same as the array bottom index,
** there is something to the left of it needing sorting.
*/

      if( arrayBottomIndex < pivotIndex )
         quickSort( inputArray, arrayBottomIndex, pivotIndex - 1 );

/*
** If the pivot index is not now the same as the array top index, there
** is something to the right of it needing sorting.
*/

      if( pivotIndex < arrayTopIndex )
         quickSort( inputArray, pivotIndex + 1, arrayTopIndex );

    }
  }

/*
** Use this as the usual interface, just pass the array, let the
** algorithm figure out the upper and lower indices, since in Java, they
** are part of the array's definition.
*/

  public static void sort(Sortable[] inputArray)
  {
    quickSort(inputArray, 0, inputArray.length - 1);
  }
}
