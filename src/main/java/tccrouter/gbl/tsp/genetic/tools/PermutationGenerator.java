
/*
** This code was complety re-written by Kent Paul Dolan, ported from
** publically available, uncredited source code from the Internet.  See
** accompanying file TravellerDoc.html for status for your use.
*/

package tccrouter.gbl.tsp.genetic.tools;

// This code was ported from code stolen boldly from
// my StarLogo program btsp2_03.slogo's routine "to nexper".
// That in turn was ported from some unbelievably unreadable
// Fortran 66 code I found somewhere on the Net.  To this
// day I don't understand how this code works, but I know
// that it is dependent on the data passed to be permuted.
// it works exactly to permute the numbers 1 to N; it fails
// if given 0 to N-1 instead.  This is undoubtedly in part
// due to use of lowest bit modulus of the data being used
// as part of the program's logic control.

public class PermutationGenerator
{

  private boolean m_debug                 = false;
  private boolean m_firstPass             = true;
  private boolean m_morePermutations      = true;
  private boolean m_evenPermutation       = false;
  private int     m_permuteSize           = -1;
  private Integer [] m_indexArray         = null;

  public PermutationGenerator( int numIndices )
  {
    m_indexArray = new Integer[numIndices];
    m_firstPass = true;
    m_morePermutations = true;
    m_evenPermutation = true;
    m_permuteSize = numIndices;
    for (int i = 0; i < numIndices; i++)
    {
      // original logic is set up for 1..N, not 0..(N-1)
      // and it is too brittle to make changing it
      // a worthwhile exercise.
      m_indexArray[i] = new Integer(i + 1);
    }
  }

  public PermutationGenerator( int numIndices , boolean debug )
  {
    this( numIndices );
    this.m_debug = debug;
  }

  public boolean morePermutations() { return m_morePermutations; }

  public int getSize()
  {
    if ( m_indexArray == null )
    { return -1; } else { return m_indexArray.length; }
  }

  private Integer [] cloneIndexArray()
  {
    Integer [] outputIndexArray = new Integer[this.m_indexArray.length];
    for (int i = 0; i < m_indexArray.length; i++)
    {
      outputIndexArray[i] = new Integer(this.m_indexArray[i].intValue());
    }
    return outputIndexArray;
  }

  private Integer [] cloneAndZeroBaseIndexArray()
  {
    Integer [] outputIndexArray = new Integer[this.m_indexArray.length];
    for (int i = 0; i < m_indexArray.length; i++)
    {
      outputIndexArray[i] = new Integer(this.m_indexArray[i].intValue() - 1);
    }
    return outputIndexArray;
  }

  public void printArray()
  {
      String s = new String("[");
      for ( int i = 0; i < this.m_indexArray.length; i++ )
      {
        if (i == 0)
        {
          s = new String( s + this.m_indexArray[i].intValue() );
        }
        else
        {
          s = new String( s  + " " + this.m_indexArray[i].intValue());
        }
      }
      s = new String(s + "]");
      System.out.println(s);
  }

  public void printArray( Integer [] printMe )
  {
      String s = new String("[");
      for ( int i = 0; i < printMe.length; i++ )
      {
        if (i == 0)
        {
          s = new String( s + printMe[i].intValue() );
        }
        else
        {
          s = new String( s  + " " + printMe[i].intValue());
        }
      }
      s = new String(s + "]");
      System.out.println(s);
  }

  public Integer [] getNext() throws PermutationExhaustedException
  {
    if ( ! this.morePermutations() )
    {
      throw new PermutationExhaustedException();
    }

    if (m_debug) System.out.println("getNext: enter");

    int s = 0;
    int d = 0;
    int l = 0;
    int m = 0;
    int ia = 0;
    int il = 0;
    boolean missed = false;
    final int N = m_indexArray.length;  // permutation size N

    if (m_debug) System.out.println("getNext: N = " + N);
    if (m_debug) System.out.println("getNext: starting permutation");
    if (m_debug) this.printArray();
    if (m_debug) System.out.println("getNext: m_morePermutations = " + this.m_morePermutations);
    if (m_debug) System.out.println("getNext: m_evenPermutation = " + this.m_evenPermutation);

    if ( m_firstPass )
    {

      if (m_debug) System.out.println("getNext: first pass");

      m_firstPass = false;
      if ( N == 1 ) { m_morePermutations = false; }

      if (m_debug) System.out.println("getNext: returning");

      return this.cloneAndZeroBaseIndexArray();
    }

    if (m_debug) System.out.println("getNext: subsequent pass");

    if ( m_evenPermutation )
    {

      if (m_debug) System.out.println("getNext: even permutation logic");

      ia = m_indexArray[0].intValue();
      m_indexArray[0] = new Integer(m_indexArray[1].intValue());
      m_indexArray[1] = new Integer(ia);
      m_evenPermutation = false;

      if (m_debug) System.out.println("getNext: even permutation logic, first if, a(N-1) = " + m_indexArray[N - 1].intValue());

      if ( m_indexArray[N - 1].intValue() != 1 )
      {

        if (m_debug) System.out.println("getNext: returning at even logic first if");

        return this.cloneAndZeroBaseIndexArray();
      }

      if (m_debug) System.out.println("getNext: even permutation logic, second if, a(0) = " + m_indexArray[0].intValue());

      if ( m_indexArray[0].intValue() != ( 2 + ( N % 2 ) ) )
      {

        if (m_debug) System.out.println("getNext: returning at even logic second if");

        return this.cloneAndZeroBaseIndexArray();
      }

      if (m_debug) System.out.println("getNext: even permutation logic, third if");

      if ( N <= 3 )
      {
        m_morePermutations = false;

        if (m_debug) System.out.println("getNext: returning at even logic third if");

        return this.cloneAndZeroBaseIndexArray();
      }

      for (int i = 0; i < (N - 3); i++ )
      {
        if (m_debug) System.out.println("getNext: even permutation logic, third if, a(i+1) = " + m_indexArray[i + 1].intValue() + ", a(0) + 1 = " + ( 1 + m_indexArray[i].intValue() ) );

        if
        (
          m_indexArray[i + 1].intValue()
          !=
          ( 1 + m_indexArray[i].intValue() )
        )
        {

          if (m_debug) System.out.println("getNext: returning at even logic fourth if");

          return this.cloneAndZeroBaseIndexArray();
        }
      }

      m_morePermutations = false;

      if (m_debug) System.out.println("getNext: returning at even logic drop through");

      return this.cloneAndZeroBaseIndexArray();

    }

    if (m_debug) System.out.println("getNext: odd logic");

    int i = 0;
    s = 0;
    missed = false;
    il = 1;

    for (int loopIndex = 0; loopIndex < (N - 1); loopIndex++)
    {

      if (m_debug) System.out.println("getNext: odd logic first if, missed = " + missed);

      if ( ! missed )
      {
        il += 1;
        ia = m_indexArray[ il - 1 ].intValue();
        i = il - 1;
        d = 0;

        for (int j = 0; j < i; j++)
        {

          if (m_debug) System.out.println("getNext: odd logic second if, ia = " + ia + " a(" + j + ") = " + m_indexArray[j].intValue() );

          if ( ia < m_indexArray[j].intValue() )
          {
            d++;
            if (m_debug) System.out.println("getNext: odd logic second if taken, d now " +d );
          }
        }

        s += d;

        if (m_debug) System.out.println("getNext: odd logic third if, d = " + d + ", s = " + s + ", i = " + i + ", i * s%2 = " + (i * ( s % 2 ) ) );

        if ( d != (i * ( s % 2 ) ) ) { missed = true; }

      }
    }

    if ( ! missed )
    {
      m_morePermutations = false;

      if (m_debug) System.out.println("getNext: returning at odd logic first output");

      return this.cloneAndZeroBaseIndexArray();
    }

    m = ( ( N + 1 ) * ( ( s + 1 ) % 2 ) );
    l = -1;

    for ( int j = 0; j < i; j++ )
    {

      if (m_debug) System.out.println("getNext: odd logic fifth if, j / m / ia = "
      + j + " / " + m + " / " + ia + ", first factor ="
      + ( m_indexArray[j].intValue() - ia )
      + ", second factor = "
      + ( m_indexArray[j].intValue() - m )
      );

      if
      (
        0
        >
        (
          ( m_indexArray[j].intValue() - ia )
          *
          ( m_indexArray[j].intValue() - m )
        )
      )
      {
        m = m_indexArray[j].intValue();
        l = j;
        if (m_debug) System.out.println("getNext: odd logic fifth if taken, j / m / l = "
        + j + " / " + m + " / " + l );
      }
    }

    if ( l == -1 )
    {
      if (m_debug) System.out.println
      (
        "logic error in PermutationGenerator.getNext()"
      );
    }

    m_indexArray[l] = new Integer(ia);
    m_indexArray[il - 1] = new Integer(m);
    m_evenPermutation = true;

    if (m_debug) System.out.println("getNext: returning at odd logic second output");

    return this.cloneAndZeroBaseIndexArray();
  }

  public int getPermutationSize()
  {
    return m_permuteSize;
  }

}
