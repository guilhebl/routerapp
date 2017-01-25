
/*
** This code was written from scratch by Kent Paul Dolan, the greedy MST
** creation part from memory of published algorithms, probably due to
** Preparata and Shamos's _Computational Geometry_.  See accompanying
** file TravellerDoc.html for status for your use.
*/

package tccrouter.gbl.tsp.genetic.seeders;

import tccrouter.gbl.common.entity.TSProblemModel;
import tccrouter.gbl.common.util.ContentComparable;
import tccrouter.gbl.common.util.HeapWithDelete;
import tccrouter.gbl.common.util.IntDoublePairSortedOnDouble;
import tccrouter.gbl.tsp.genetic.TravellerWorld;
import tccrouter.gbl.tsp.genetic.tools.MersenneTwister;

public class MinimalSpanningTree
{

  private int         []  m_minimalSpanningTree = null;
  private int             m_genomeLength;
  private int             m_treeSize;
  private static double   m_floor = Double.MAX_VALUE;
  private MersenneTwister m_mt = null;  

/*
** FIXME This is trashy, MinimalSpanningTree has no business knowing
** about something as complex as a TravellerWorld, but to fix it requires
** ripping the city location information out of TravellerWorld and into
** a public class; live with it for now.
*/

  public MinimalSpanningTree( TravellerWorld world )
  {
    m_mt = MersenneTwister.getTwister();

    m_genomeLength           = TSProblemModel.getInstance().getNumNodes();
    m_treeSize               = ( m_genomeLength * 2 ) - 2;
    m_minimalSpanningTree    = new int     [m_treeSize];
    boolean [] isIn          = new boolean [m_genomeLength];
    boolean [] attached      = new boolean [m_treeSize];
    int     [] nodeRepeats   = new int     [m_genomeLength];
    double  [] toNearest     = new double  [m_genomeLength];
    int     [] myNearest     = new int     [m_genomeLength];
    int       nodesFilled    = 0;
    double floor             = 0.0D;

    for (int i = 0; i < m_treeSize; i++)
    {
      m_minimalSpanningTree[i] = -1;
      attached[i]              = false;
    }

    for (int i = 0; i < m_genomeLength; i++)
    {
      isIn[i] = false;
      toNearest[i] = Double.MAX_VALUE;
      myNearest[i] = -1;
      nodeRepeats[i] = 0;
    }

/*
** Add the shortest possible edge, as the minimum which could possibly
** be added to an MST to make a circuit (in the circular layout case).
** Though, obviously this would not be the omitted edge, something at
** least the length of the Nth smallest would be.  [It's more
** complicated than _that_, too; lots of short edges could be crowded
** out by shorter ones that share a node.] FIXME LATER Hmmm.  Worth
** doing?  Maybe not.  A tighter floor would use this Nth smallest edge
** instead, I just don't want to sort a list of distances of length N*N,
** though maintaining a heap of length N shortest edges seen so far, and
** taking it would be doable.
*/

    m_floor = Double.MAX_VALUE;
    for (int i = 0; i < m_genomeLength; i++)
    {
      // Method world.getDistance() returns all off-diagonal lengths
      // twice, but we only need to look at them once, here, so
      // do a triangular walk to save effort.
      for (int j = 0; j <= i ; j++)
      {
        double temp = TSProblemModel.getInstance().getDistance(i, j);
        if ( temp < m_floor ) { m_floor = temp; }
      }
    }

/*
** Seed the minimal spanning tree with a single node. It doesn't matter
** where we start, so start with node 0.
*/

    m_minimalSpanningTree[0] = 0;
    attached[0] = true;
    isIn[0] = true;
    nodeRepeats[0]++;
    nodesFilled++;

/*
** Display start state.
*/

    while ( nodesFilled < m_treeSize )
    {
      int    bestInnie   = -1;
      int    bestOutie   = -1;
      int    addAfter    = nodesFilled;
      double bestDistance = Double.MAX_VALUE;
      for (int i = (nodesFilled - 1); i >= 0; i--)
      {
        int currentNode = m_minimalSpanningTree[i];
        int otherNode   = myNearest[currentNode];
        double otherDistance = toNearest[currentNode];
        // Do we need to create or refresh a nearest neighbor entry?
        // This better be a lazy disjunctive, or we access outside array!
        if ( ( otherNode == -1 ) || isIn[ otherNode ] )
        {
          otherDistance = Double.MAX_VALUE;
          otherNode     = -1;
          for ( int j = 0; j < m_genomeLength; j++ )
          {
            if ( ( j != currentNode ) && ( ! isIn[j] ) )
            {
              // if ( distances[currentNode][j] < otherDistance )
              double temp = TSProblemModel.getInstance().getDistance( currentNode, j );
              if ( temp < otherDistance )
              {
                otherDistance = temp;
                otherNode     = j;
              }
            }
          }
          // FIXME create an exception to throw so that we can
          // FIXME cater for algorithm failure here!
          if (otherNode == -1) { kablooie("otherNode == -1"); }
          myNearest[currentNode] = otherNode;
          toNearest[currentNode] = otherDistance;
        }
        if ( toNearest[currentNode] < bestDistance )
        {
          bestDistance = toNearest[currentNode];
          bestInnie = currentNode;
          bestOutie = otherNode;
          addAfter = i;
        }
      }

/*
** Roll data two slots toward end of MST array, to make room for two
** added nodes.
*/

      for ( int i = (nodesFilled - 1); i > addAfter; i-- )
      {

/*
** Special case the very last copy, so that we can avoid a redundant
** copy of node zero, and make the MST one element shorter.
*/

        if ( i + 2 < m_treeSize )
        {
          m_minimalSpanningTree[i + 2] = m_minimalSpanningTree[i];
          attached[i+2] = attached[i];
        }
      }
      // FIXME another place to check for failure!
      // bestInnie must equal m_minimalSpanningTree[addAfter];
      // The idea is to add an edge out to the new node
      // and then add an edge back to the connecting node,
      // to keep the graph tree-shaped, and so that the edge
      // to the former succeeding node is preserved.
      if (bestInnie != m_minimalSpanningTree[addAfter])
      { kablooie("bestInnie != m_minimalSpanningTree[addAfter]"); }
      m_minimalSpanningTree[addAfter + 1] = bestOutie;
      m_minimalSpanningTree[addAfter + 2] = bestInnie;
      isIn[ bestOutie ] = true;
      attached[addAfter + 1] = true;
      attached[addAfter + 2] = true;
      nodeRepeats[bestOutie]++;
      nodeRepeats[bestInnie]++;
      if ( nodesFilled + 2 < m_treeSize )
      {
        nodesFilled += 2;
      }
      else
      {
        nodesFilled += 1;
      }

/*
** Display progress.
*/

/*
** Add length of newly added edge to "mst length + shortest edge" floor
** value.
*/

      m_floor += bestDistance;
    }
  }

  public static double getFloor() { return m_floor; }

/*
** Implement a greedy deriver of a genome from the MST; greedy in the
** sense that it removes replicated codon names in order of the one
** currently providing the greatest improvement in fitness, until only a
** permutation genome's worth are left.  Maintaining the current
** removable-node fitness increments would be easy, if they were just
** kept in an array, but that would imply at least N*N performance,
** hopeless for the eventual problem size goals of Traveller.  At the
** cost of great code complexity and debugging time, instead I have
** implemented a Heap With Deletion, into which fitness improvement
** values and associated tag information can be pushed and from which
** the next node to remove can be popped.  The killer is that when a
** node is removed, the two nodes to which it was connected need their
** fitness increments revised, which means finding them wherever they
** may be in the heap, removing them from the heap, then pushing them
** back on the heap with revised fitness increment values.  Keeping all
** the pointers, counters, flags, and other foofooraw needed to do this,
** correct, is mind-bogglingly complex. Beelz, my brane hurts!
** 
** Since this algorithm has no randomness, it makes no particular sense
** to put more than one of these genomes in the Traveller population, so
** TravellerWorld caters by calling this routine for the only first
** MST-derived genome, and the non-greedy, partially random-driven,
** MST-derived genome generator twin to this function for the rest.
*/

  public int [] getGreedilyDerivedNodeList( TravellerWorld world )
  {
    int nodeRepeats[] = new int[m_genomeLength];

    for ( int i = 0; i < m_genomeLength; i++ )
    {
      nodeRepeats[i] = 0;
    }

    boolean attached[] = new boolean[m_treeSize];

    for (int i = 0; i < m_treeSize; i++)
    {
      attached[i] = true;
      nodeRepeats[ m_minimalSpanningTree[i] ]++;
    }

/*
** Compute for each repeated node the gain if that repetition were
** removed.  Our intention always, of course, is to remove all but one
** of the MSTs repeated nodes to make a valid genome; here we try to
** remove all but the least useful-to-remove one.
*/

    HeapWithDelete fitnessGains =
      new HeapWithDelete( HeapWithDelete.POPS_LARGEST );

    IntDoublePairSortedOnDouble fitnessChange[] =
      new IntDoublePairSortedOnDouble[m_treeSize];

    for ( int i = 0; i < m_treeSize; i++ )
    {
      if ( nodeRepeats[m_minimalSpanningTree[i]] > 1 )
      {
        double fitnessToBeGained =
          fitnessGained
          (
            ( i - 1 + m_treeSize ) % m_treeSize,
            i,
            ( i + 1 ) % m_treeSize,
            world
          );
        fitnessChange[i] =
          new IntDoublePairSortedOnDouble( i, fitnessToBeGained );
        fitnessGains.push( (ContentComparable) new IntDoublePairSortedOnDouble( fitnessChange[i] ) );
      }
      else
      {
        fitnessChange[i] =
          new IntDoublePairSortedOnDouble( i, Double.MIN_VALUE );
        // and do _not_ push it on the heap.
      }
    }

    int nodesLeft = m_treeSize;

    while ( nodesLeft > m_genomeLength && ( ! fitnessGains.isEmpty() ) )
    {
      IntDoublePairSortedOnDouble pair =
        (IntDoublePairSortedOnDouble) fitnessGains.pop();

      int currentTreeNode = pair.getInt();
      int currentCodonName = m_minimalSpanningTree[currentTreeNode];

      if ( nodeRepeats[currentCodonName] > 1 )
      {

/*
** We have a _lot_ of work to do here; mark the node unattached, do
** bookkeeping on the repeat and nodesLeft counts, and find this node's
** predecessor and successor nodes and redo their fitness gains and
** reinsert them in the fitness heap.
*/
        attached[currentTreeNode] = false;
        nodeRepeats[currentCodonName]--;
        nodesLeft--;

/*
** Find four MST nodes we need to recompute and re-heapify fitness gains.
*/

        int predecessorTreeNode = currentTreeNode;

        while ( !attached[predecessorTreeNode] )
        {
          predecessorTreeNode =
            ( predecessorTreeNode - 1 + m_treeSize ) % m_treeSize ;
        }

        int predecessorsPredecessorTreeNode =
          ( predecessorTreeNode - 1 + m_treeSize ) % m_treeSize ;

        while ( !attached[predecessorsPredecessorTreeNode] )
        {
          predecessorsPredecessorTreeNode =
            ( predecessorsPredecessorTreeNode - 1 + m_treeSize ) % m_treeSize ;
        }

        int successorTreeNode = currentTreeNode;

        while ( !attached[successorTreeNode] )
        {
          successorTreeNode =
            ( successorTreeNode + 1 + m_treeSize ) % m_treeSize ;
        }

        int successorsSuccessorTreeNode =
          ( successorTreeNode + 1 ) % m_treeSize ;

        while ( !attached[successorsSuccessorTreeNode] )
        {
          successorsSuccessorTreeNode =
            ( successorsSuccessorTreeNode + 1 ) % m_treeSize ;
        }

/*
** Remove the superseded fitness gain indicators from the fitness gains
** heap, for the still attached points just before and behind the node
** we unattached, which had been using it to determine their fitness
** gains.
*/

        if ( nodeRepeats[ m_minimalSpanningTree[predecessorTreeNode] ] > 1 )
        {
          int scapegoat =
            fitnessGains.findByValue
            (
              (ContentComparable) fitnessChange[ predecessorTreeNode ]
            );

          fitnessGains.delete( scapegoat );

          fitnessChange[predecessorTreeNode] =
            new IntDoublePairSortedOnDouble
            (
              predecessorTreeNode,
              fitnessGained
              (
                predecessorsPredecessorTreeNode,
                predecessorTreeNode,
                successorTreeNode,
                world
              )
            );

          fitnessGains.push( (ContentComparable) new IntDoublePairSortedOnDouble( fitnessChange[predecessorTreeNode] ) );

        }

        if ( nodeRepeats[ m_minimalSpanningTree[successorTreeNode] ] > 1 )
        {
          int scapegoat =
            fitnessGains.findByValue
            (
              (ContentComparable) fitnessChange[ successorTreeNode ]
            );
          fitnessGains.delete( scapegoat );

          fitnessChange[successorTreeNode] =
            new IntDoublePairSortedOnDouble
            (
              successorTreeNode,
              fitnessGained
              (
                predecessorTreeNode,
                successorTreeNode,
                successorsSuccessorTreeNode,
                world
              )
            );

          fitnessGains.push( (ContentComparable) new IntDoublePairSortedOnDouble( fitnessChange[successorTreeNode] ) );

        }

      }

    }

    boolean isIn[] = new boolean[m_genomeLength];
    int dnl[]  = new int[m_genomeLength];
    for ( int i = 0; i < m_genomeLength; i++ )
    {
      isIn[i] = false;
      dnl[i] = -1;
    }

    int nodeCount = 0;

    for ( int i = 0; i < m_treeSize; i++ )
    {
      int codonName = m_minimalSpanningTree[i];
      if
      (
        ( attached[i] == true )
        &&
        ( isIn[ codonName ] == false )
      )
      {
        if ( nodeCount > m_genomeLength - 1 )
        {
          kablooie( "nodeCount too big in getBestDerivedNodeList()" );
        }
        else
        {
          isIn[ codonName ] = true;
          dnl[ nodeCount ] = codonName;
          nodeCount++;
        }
      }
    }

    if ( nodeCount != m_genomeLength )
    {
      kablooie( "wrong nodeCount in getBestDerivedNodeList()" );
    }

    return dnl;

  }

  private double fitnessGained
  (
    int previousNode,
    int currentNode,
    int nextNode,
    TravellerWorld world
  )
  {
    return
    TSProblemModel.getInstance().getDistance
      (
        m_minimalSpanningTree[previousNode],
        m_minimalSpanningTree[currentNode]
      )
      +
      TSProblemModel.getInstance().getDistance
      (
        m_minimalSpanningTree[currentNode],
        m_minimalSpanningTree[nextNode]
      )
      -
      TSProblemModel.getInstance().getDistance
      (
        m_minimalSpanningTree[previousNode],
        m_minimalSpanningTree[nextNode]
      )
      ;
  }

  public int [] getDerivedNodeList( TravellerWorld world )
  {
    int dnl[] = new int[m_genomeLength];
    boolean attached[] = new boolean[m_treeSize];

    for (int i = 0; i < m_treeSize; i++) { attached[i] = false; }

    // Start at some random spot; that's how we get differing chromosomes.
    // int index = m_mt.nextInt(m_treeSize);

    for ( int i = 0; i < m_genomeLength; i++ )
    {
      int index = m_mt.nextInt(m_treeSize);
      for ( int j = 0; j < m_treeSize; j++ )
      {
        int thisIndex = ( j + index ) % m_treeSize;
        if ( m_minimalSpanningTree[ thisIndex ] == i )
        {
          attached[ thisIndex ] = true;
          break;
        }
      }
    }
    int nodesFilled = 0;
    for ( int j = 0; j < m_treeSize; j++ )
    {
      if ( attached[ j ] )
      {
        if ( nodesFilled >= m_genomeLength )
        {
          kablooie( "nodesFilled >= m_genomeLength" );
          break;
        }
        dnl[nodesFilled] = m_minimalSpanningTree[j];
        nodesFilled++;

      }
    }
    return dnl;
  }

  private void kablooie(String why)
  {
    System.out.println
    (
     "MinimalSpanningTree evoked kablooie()"
     + "\r\n"
     + "because "
     + why
    );
  }

}