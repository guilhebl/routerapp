
/*
** This code was written by Kent Paul Dolan.  See accompanying file
** TravellerDoc.html for status for your use.
*/

package tccrouter.gbl.tsp.genetic.tools;


public class PermutationExhaustedException
  extends Exception
{
  public PermutationExhaustedException()
  {
    super
    (
      "Call for next permutation was received after all N! " +
      "permutations were exhausted."
    );
  }

  public PermutationExhaustedException( String s )
  {
    super(s);
  }

}

