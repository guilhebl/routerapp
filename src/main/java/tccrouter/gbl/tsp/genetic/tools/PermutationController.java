
/*
** This code was written by Kent Paul Dolan.  See accompanying file
** TravellerDoc.html for status for your use.
*/

// The intention of this code is that it take over the
// task of creating a permutation generator whose
// permutation length lies within a range of
// permutation length values, and of returning values
// from that generator, to free client programs of
// that common logic.

package tccrouter.gbl.tsp.genetic.tools;

import tccrouter.gbl.common.entity.TSProblemModel;

// import com.well.www.user.xanthian.java.genetic.*;

public class PermutationController
{

/*
** Provide a local handle for the global pseudorandom number generator
** solitary instance.
*/

  private static MersenneTwister m_mt = null;

/*
** POLICY Limit allowable size of permutation sets to restrict the
** workload of a single permutation activity.
** 
** POLICY Limit permutation in early parts of run to few points, only
** increase as permutation fails to improve the genome many consecutive
** tries over time.  This prevents tedious waits for permutation
** heuristics that don't work well at large permutation limits until the
** tours begin to be fairly well organized, so that nearby points are
** fairly likely to be closely spaced in common substrings of the
** genome.
** 
** POLICY [See newProblem(), below.]  Make permutations hammer harder on
** bigger problems before giving up and raising the permutation limit;
** in some sense there are more places that need to be checked to be
** amenable to a permutation of the current size.
** 
** POLICY [See newProblem(), below.] Raise the permutation limit more
** easily if there is a heavy mutation rate, as the permutation rate can
** be artificially held down by the ease of fixing problems caused by
** mutations compared to the difficulty of fixing stuff useful to
** advancing the fitness of the population or of the best genome.
** 
** POLICY [See reportFailure(), below.]  Within the limits set by the
** mutation rate, make raising the limit harder for each limit.  Without
** this change, the limits rise inappropriately quickly once the first
** increase occurs.
*/

  private static final int STARTING_PERMUTE_LIMIT         =   4;
  private static final int GLOBAL_PERMUTE_LIMIT           =   8;
  private static final int BASE_PERMUTE_MISSES_LIMIT      = 100;
  private static       int m_permuteMissesLimit           =
    BASE_PERMUTE_MISSES_LIMIT;
  private static       int m_consecutivePermuteMisses     =   0;
  private static       int m_currentPermuteLimit          =
    STARTING_PERMUTE_LIMIT;
  private static   Object  LOCK                           =
    ( Object ) ( new Integer( 0 ) );

  public PermutationController()
  {
    if ( m_mt == null ) { m_mt = MersenneTwister.getTwister(); }
  }


/*
** Use this when the caller wants a new permutation generator sized to
** the current permutation limit as it adapts.
*/

  public PermutationGenerator getGenerator( int otherLimit )
  {
    int permuteLimit   = Math.min( m_currentPermuteLimit, ( otherLimit ) );
    int permuteSize    = m_mt.nextInt( permuteLimit - 1 ) + 2;
    PermutationGenerator pg = new PermutationGenerator(permuteSize,false);
    return pg;
  }


/*
** Use this when the caller just wants a number within the current
** permute limit as it adapts; the caller may for example be creating
** its own PermutationGenerator objects in a loop and want to assure
** that they are all the same size, but to use the size this call
** returns, or the caller may not be using a PermutationGenerator object
** at all, and just want a permute size as a surrogate for a measure of
** progress in the problem execution.
*/

  public int getAPermuteSize(int otherLimit )
  {
    int permuteLimit   = Math.min( m_currentPermuteLimit, ( otherLimit ) );
    int permuteSize    = m_mt.nextInt( permuteLimit - 1 ) + 2;
    return permuteSize;
  }

  public static void reportFailure()
  {
    synchronized (LOCK)
    {

      m_consecutivePermuteMisses++;

      if
      (
        m_consecutivePermuteMisses
        >=
        m_permuteMissesLimit
      )
      {
        if ( m_currentPermuteLimit < GLOBAL_PERMUTE_LIMIT )
        {
          m_currentPermuteLimit++;
          m_permuteMissesLimit *= 2; // POLICY, see above.

          if ( TSProblemModel.getInstance().getMutationRate() > 0.0D ) // POLICY, ditto.
          {
            m_permuteMissesLimit =
              Math.min
              (
                m_permuteMissesLimit,
                (int) Math.round
                (
                  0.5D / TSProblemModel.getInstance().getMutationRate()
                )
              );
          }
        }

/*
**  Do this always to cut down average effort in this critical section.
*/

        m_consecutivePermuteMisses= 0;
      }
    }
  }

  public static void reportSuccess()
  {
    synchronized (LOCK)
    {
      m_consecutivePermuteMisses = 0;
    }
  }

  public static void newProblem()
  {
    synchronized (LOCK)
    {
      m_currentPermuteLimit = STARTING_PERMUTE_LIMIT;
      m_consecutivePermuteMisses = 0;

/*
** POLICY [See notes at top.]
*/

      m_permuteMissesLimit =
        Math.max
        (
          BASE_PERMUTE_MISSES_LIMIT,
          2 * TSProblemModel.getInstance().getNumNodes()
        );

      if ( TSProblemModel.getInstance().getMutationRate() > 0.0D )
      {
        m_permuteMissesLimit =
          Math.min
          (
            m_permuteMissesLimit,
            (int) Math.round
            (
              0.5D / TSProblemModel.getInstance().getMutationRate()
            )
          );
      }
    }
  }

  public static int getStartingPermuteLimit()
  {
    return STARTING_PERMUTE_LIMIT;
  }

  public static int getGlobalPermuteLimit()
  {
    return GLOBAL_PERMUTE_LIMIT;
  }

  public static int getCurrentPermuteLimit()
  {
    synchronized (LOCK)
    {
      return m_currentPermuteLimit;
    }
  }

  public static String getPermutationRuntimeInfo()
  {
    synchronized (LOCK)
    {
      return new
        String
        (
          m_currentPermuteLimit
          + " / "
          + GLOBAL_PERMUTE_LIMIT
          + " :: "
          + m_consecutivePermuteMisses
          + " / "
          + m_permuteMissesLimit
        );
    }
  }
}
