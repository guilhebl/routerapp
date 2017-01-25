//-----------------------------------------------------------------------------
//  Traveller -- A Java Application and Applet
//
//  A Genetic Algorithm for Solving the Travelling Salesman Problem
//
//  TravellerChromosome.java
//  version 1.1.0
//
//  Copyright 2000-2001 Scott Robert Ladd. All rights reserved.
//
//  For more information about this program, contact:
//
//      Scott Robert Ladd
//      scott@coyotegulch.com
//      http://www.coyotegulch.com
//
//-----------------------------------------------------------------------------
// This program is free software; you can redistribute it and/or
// modify it under the terms of the GNU General Public License
// as published by the Free Software Foundation; either version 2
// of the License, or (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program; if not, write to the
//
//      Free Software Foundation, Inc.
//      59 Temple Place - Suite 330
//      Boston, MA 02111-1307, USA.
//-----------------------------------------------------------------------------

/*
** This code was extensively modified by Kent Paul Dolan.  See
** accompanying file TravellerDoc.html for status of the modifications
** for your use.
*/

package tccrouter.gbl.tsp.genetic.entity;

import tccrouter.gbl.common.entity.TSProblemModel;
import tccrouter.gbl.tsp.genetic.TravellerWorld;
import tccrouter.gbl.tsp.genetic.tools.MersenneTwister;


/*
** [The easily lost word you want, Kent, is "canonical", for the order
** of cities in a Chromosome.]
*/

public class TravellerChromosome
    extends Chromosome
{

    // class data
    protected static MersenneTwister m_mt           = null;
    private static int               hometown = TSProblemModel.getInstance().getSourceNodeIndex();

    // per member data
    private TravellerWorld           m_world        = null;
    private TSProblemModel      t_model        = TSProblemModel.getInstance();
    private Codon []                 m_cityList     = null;    
    private boolean                  m_fitnessValid = false;
    private String                   m_originator   =
      new String( "never initialized" );

    // constructors
    public TravellerChromosome(TravellerWorld world, String originatorName)
    {

        super();
        m_world = world;
        m_originator = new String( originatorName );

        if ( m_mt == null ) { m_mt = MersenneTwister.getTwister(); }

/*
** Our fitness runs the other direction, so we override super's setting.
*/

        m_fitness = Double.MAX_VALUE;
        m_fitnessValid = false;
        m_cityList       = new Codon   [m_world.getNumberOfCities()];

        // Fill with unpermuted integers 0 - N-1.
        for (int i = 0; i < m_cityList.length; i++)
        {        	
          m_cityList[i] = new Codon(t_model.nodeIndex[i]);
        }

        // Permute in usual way.

        for
        (
          int currentSlot = m_cityList.length - 1;
          currentSlot > 0; // no need to swap only remaining slot with itself
          currentSlot--
        )
        {

          // Pick some location from self to beginning of array,
          // swap current slot's occupant with the bloke in that
          // location.

          // Picking self leaves occupant in current slot, though
          // occupant may have been moved by some previous swap.

          int swapSlot   = m_mt.nextInt(currentSlot + 1); // include own slot
          int temp = m_cityList[swapSlot].get();
          m_cityList[swapSlot].set( m_cityList[currentSlot].get());
          m_cityList[currentSlot].set( temp );

        }

/*
** KPD FIXED Not just "no" but "hell no"; replace with random genome
** creation; biasing the process with a semi-regular pattern from genome
** to genome is contrary to good sense.  Below really broke bigtime when
** regular layouts were implemented, because this routine frequently
** produces the identity permutation!
** 
**  KPD Fix is above.
*/

/*
        // use Josephus permutation to produce initial genes
        m_cityList       = new Codon   [m_world.getNumberOfCities()];
        boolean [] plist = new boolean [m_world.getNumberOfCities()];

        int m = m_world.getNumberOfCities() - 1;
        int s = m_mt.nextInt(1,m - 1);
        int j = m_mt.nextInt(m_world.getNumberOfCities());
        int k = 0;

        while (true)
        {
            Codon c = new Codon( j );
            m_cityList[k] = c;
            plist[j]      = true;

            if (k == m)
                break;

            for (int l = 0; l < s; ++l)
            {
                do
                {
                    ++j;
                    if (j > m) j = 0;
                }
                while (plist[j] == true);
            }

            ++k;
        }
*/

    }

    public TravellerChromosome(TravellerChromosome c)
    {

        super(c);
        m_world = c.m_world;
        m_fitness = c.m_fitness;
        m_fitnessValid = c.m_fitnessValid;
        m_originator = new String( c.m_originator );

        // copy cities
        m_cityList = new Codon [m_world.getNumberOfCities()];

        for (int n = 0; n < m_world.getNumberOfCities(); ++n)
        {
            int got = -1;
            try
            {
                got = c.m_cityList[n].get();
            }
            catch (Exception TCcopyloopGet)
            {

            }

            try
            {
              m_cityList[n] = new Codon( got );
            }
            catch (Exception TCcopyloopSet)
            {

            }
        }
    }

    public TravellerChromosome
    (
      TravellerWorld world,
      String originatorName,
      int [] nodeList
    )
    {

        super();
        m_world = world;
        m_originator = new String( originatorName );
        m_fitness = Double.MAX_VALUE;
        m_fitnessValid = false;

        // copy cities
        m_cityList = new Codon [m_world.getNumberOfCities()];

        for (int n = 0; n < m_world.getNumberOfCities(); ++n)
        {
            int got = nodeList[n];

            try
            {
              m_cityList[n] = new Codon( got );
            }
            catch (Exception TCcopyloopSet)
            {

            }
        }
    }

/*
** Debugging aid, stringifies a copy of the chromosome data into a
** pretty format to use in a debugging dump.
*/

    public String toString()
    {
      StringBuffer b = new StringBuffer("");
      b.append("[");
      if (this.m_cityList == null)
      {
        b.append( "(null city list in genome)" );
      }
      else
      {
        if (this.m_cityList.length > 0 )
        {
          for ( int i = 0; i < this.m_cityList.length; i++ )
          {
            b.append
            (
              ( (i == 0) ? "" : "," )
              + (this.m_cityList[i]).toString()
            );
          }
        }
        else
        {
          b.append( "(empty, non-null city list in genome)" );
        }
      }
      b.append("]");
      return b.toString();
    }

    public String toString( int offset )
    {
      StringBuffer b = new StringBuffer("");
      b.append("[");
      if (this.m_cityList == null)
      {
        b.append( "(null city list in genome)" );
      }
      else
      {
        int gl = this.m_cityList.length; // genomeLength, spelled shorter
        if ( gl > 0 )
        {
          for ( int i = 0; i < gl; i++ )
          {

            int realIndex = i + offset;
            while ( realIndex < 0 ) { realIndex += gl; }
            realIndex = realIndex % gl;

            b.append
            (
              ( (i == 0) ? "" : "," )
              + (this.m_cityList[realIndex]).toString()
            );
          }
        }
        else
        {
          b.append( "(empty, non-null city list in genome)" );
        }
      }
      b.append("]");
      return b.toString();
    }

    public String toString( int offset, boolean reversed )
    {
      StringBuffer b = new StringBuffer("");
      b.append("[");
      if (this.m_cityList == null)
      {
        b.append( "(null city list in genome)" );
      }
      else
      {
        int gl = this.m_cityList.length; // genomeLength, spelled shorter
        if ( gl > 0 )
        {
          for ( int i = 0; i < gl; i++ )
          {

            int realIndex = offset + ( (reversed) ? (-i) : i );
            while ( realIndex < 0 ) { realIndex += gl; }
            realIndex = realIndex % gl;

            b.append
            (
              ( (i == 0) ? "" : "," )
              + ( this.m_cityList[realIndex] ).toString()
            );
          }
        }
        else
        {
          b.append( "(empty, non-null city list in genome)" );
        }
      }
      b.append("]");
      return b.toString();
    }

/*
** Debugging aid, replaces all cities with an invalid city name marker
** value of "-1".  Use in conjunction with the dump() routine when
** building a chromosome from one or more other chromosomes, to find
** problems where not all the slots are being filled correctly.  This is
** much easier than trying to work around the trash that cloneThis()
** leaves in the child genome before it is overwritten
*/

    public void invalidateCities()
    {
      for ( int i = 0; i < this.m_cityList.length; i++ )
      {
        m_cityList[i].set(-1);
      }
      m_fitnessValid = false;
    }

    public boolean looksLikeMe(TravellerChromosome her)
    {
      this.canonicalize();
      her.canonicalize();
      for (int i = 0; i < this.m_cityList.length; i++)
      {
        if (her.getCity(i) != this.getCity(i)) return false;
      }
      return true;
    }

    public int [] getGenomeAsArray()
    {
      int numCities = m_world.getNumberOfCities();
      int value[] = new int[numCities];
      for ( int i = 0; i < numCities; i++ )
      {
        value[i] = this.getCity(i);
      }
      return value;
    }

    // for someone outside who wants to work with the city list
    // (a reproducer, for example)
    public Codon getCodon(int n)
    {

        // KPD Make chromosomes rings instead of vectors to simplify
        // KPD many reproduction algorithms.
        // KPD return m_cityList[n];
        // return m_cityList[n % m_cityList.length].get();
        // KPD Unbelievable; the java2sdk "%" function is broken, it
        // KPD returns (-1) from ((-1) % 10).

        int j = n;

        while ( j < 0 )
        {
          j += this.getNumCities();
        }

        j = j % this.getNumCities();

        return m_cityList[j];
    }

    // enable arithmetic for matching genomes in general position before
    // doing crossovers.

    public Codon getCodon(int n, int offset, boolean reversed)
    {
      int targetSlot = offset + ((reversed) ? ( 0 - n ) : n);
      while ( targetSlot < 0 )
      {
        targetSlot += m_world.getNumberOfCities();
      }
      targetSlot = targetSlot % m_world.getNumberOfCities();
      return this.getCodon( targetSlot );
    }

    public int getCityIndex(int n)
    {
        int j = n;

        while ( j < 0 )
        {
          j += this.getNumCities();
        }

        j = j % this.getNumCities();

        return j;
    }
    
    // for someone outside who wants to work with the city list
    // (a reproducer, for example)
    public int getCity(int n)
    {

        // KPD Make chromosomes rings instead of vectors to simplify
        // KPD many reproduction algorithms.
        // KPD return m_cityList[n];
        // return m_cityList[n % m_cityList.length].get();
        // KPD Unbelievable; the java2sdk "%" function is broken, it
        // KPD returns (-1) from ((-1) % 10).

        int j = n;

        while ( j < 0 )
        {
          j += this.getNumCities();
        }

        j = j % this.getNumCities();

        return m_cityList[j].get();
    }

    // enable arithmetic for matching genomes in general position before
    // doing crossovers.

    public int getCity(int n, int offset, boolean reversed)
    {
      int targetSlot = offset + ((reversed) ? ( 0 - n ) : n);
      while ( targetSlot < 0 )
      {
        targetSlot += m_world.getNumberOfCities();
      }
      targetSlot = targetSlot % m_world.getNumberOfCities();
      return this.getCity( targetSlot );
    }

    public void setCity( int n, int city, int offset, boolean reversed)
    {
      int targetSlot = offset + ((reversed) ? ( 0 - n ) : n);
      while ( targetSlot < 0 )
      {
        targetSlot += m_world.getNumberOfCities();
      }
      targetSlot = targetSlot % m_world.getNumberOfCities();
      this.setCity(targetSlot, city);
      m_fitnessValid = false;
    }

    public void setCity(int n, int city)
    {

        // *** This method is dangerous!
        //     It does not ensure that the change results in a valid
        //     permutation!
        //     I did this for speed; only reproducive operators should
        //     use this method.
        // KPD Make chromosomes rings instead of vectors to simplify
        // KPD many reproduction algorithms.
        // KPD m_cityList[n] = city;
        // KPD Unbelievable; the java2sdk "%" function is broken, it
        // KPD returns (-1) from ((-1) % 10).

        int j = n;

        while ( j < 0 )
        {
          j += this.getNumCities();
        }

        j = j % this.getNumCities();

        m_cityList[j].set( city );

        m_fitnessValid = false;
    }

    public int findCity(int city)
    {
        int i = 0;

        while (true)
        {
            if (city == m_cityList[i].get())
                return i;

            ++i;

            if (i == m_world.getNumberOfCities())
                return -1;
        }
    }

    // Be careful with this!  The index returned only works
    // in the longer parameter list versions of getCity and setCity.
    public int findCity(int city, int offset, boolean reverse)
    {

        int i = 0;

        while (true)
        {
            if ( city == this.getCity(i, offset, reverse) )
                return i;

            ++i;

            if (i == m_world.getNumberOfCities())
                return -1;
        }
    }

    // Utility arithmetic done once here to put the quite complicated
    // logic in just one place; seems natural to keep it with other stuff
    // about having the ring in general position for crossovers.
    // This became needed as soon as segments were allowed to wrap the
    // ends of arrays to implement the "ring essense" of Traveller
    // permutation chromosomes properly to avoid artifacts that lock out
    // possible paths to solutions.

    public boolean indexIsInSegment
    (
      int     index,                         // 8
      int     segStart,                      // 10
      int     segLength,                     // 13
      int     offset,                        // false
      boolean reverse
    )
    {
      int ringLength = this.getNumCities();  // 16
      int virtualIndex = ((reverse) ? (offset - index) : (offset + index));
      int indexStart = segStart + offset;    // 18
      int indexEnd =                         // 30
        indexStart + ((reverse) ? (1 - segLength) : (segLength - 1));

      // Move all indices back to the 0 to ringLength - 1 indexing range.

      // Compensate for Sun's buggy Java 1.4 modulus function by doing
      // everything twice to avoid its incorrect negative results when
      // taking the positive modulus of a negative number.
      // FIXME when Sun's bug is fixed.

      virtualIndex =
        ((( virtualIndex % ringLength) + ringLength ) % ringLength);
      // 0
      indexStart = ((( indexStart % ringLength ) + ringLength ) % ringLength);
      // 2
      indexEnd = ((( indexEnd % ringLength ) + ringLength ) % ringLength);
      // 14

      return
      (
        (
          (           // case (nnnSyyyEnnn)
            (!reverse)
            &&
            (indexEnd > indexStart)
            &&
            (virtualIndex >= indexStart)
            &&
            (virtualIndex <= indexEnd)
          )
          ||
          (           // case (nnnEyyySnnn)
            reverse
            &&
            (indexEnd < indexStart)
            &&
            (virtualIndex <= indexStart)
            &&
            (virtualIndex >= indexEnd)
          )
          ||
          (           // case (yyyEnnnSyyy)
            (!reverse)
            &&
            (indexEnd < indexStart)
            &&
            (
              (virtualIndex <= indexEnd)
              ||
              (virtualIndex >= indexStart)
            )
          )
          ||
          (           // case (yyySnnnEyyy)
            (reverse)
            &&
            (indexStart < indexEnd)
            &&
            (
              (virtualIndex <= indexStart)
              ||
              (virtualIndex >= indexEnd)
            )
          )

        )
      );

    }

    public int getNumCities()
    {
        return m_world.getNumberOfCities();
    }

    // duplicate a chromosome
    public Chromosome cloneThis()
    {
        return new TravellerChromosome(this);
    }

    public String getOriginator()
    {
      return m_originator;
    }

    public void setOriginator( String originatorName )
    {
      m_originator = new String( originatorName );
    }

    public TravellerWorld getWorld()
    {
      return m_world;
    }

    // test and report genome validity
    public void checkValidity()
    {
      try
      {
        int genomeLength = m_world.getNumberOfCities();
        int tgraphNodes = m_world.getTotalGraphNodes();
        boolean isIn[] = new boolean[genomeLength];

        for ( int i =0; i < genomeLength; i++ )
        {
          isIn[i] = false;
        }

        for ( int i =0; i < genomeLength; i++ )
        {
          int codonName = m_cityList[i].get();
          if ( ( codonName < 0 ) || ( codonName > ( tgraphNodes - 1 ) ) )
          {
            System.out.println
            (
              "\r\n"
              + "TravellerChromosome.isValid(); invalid Codon in genome: "
              + m_cityList[i].toString()
            );
            complain();
            return;
          }
          else
          {
            isIn[i] = true;
          }
        }
        for ( int i =0; i < genomeLength; i++ )
        {
          if ( isIn[i] == false )
          {
            System.out.println
            (
              "\r\n"
              + "TravellerChromosome.isValid(); city "
              + i
              + " missing in genome."
            );
            complain();
            return;
          }
        }
      }
      catch (Exception e)
      {
        System.out.println
        (
          "TravellerChromosome.isValid() threw!"
        );
        System.out.println
        (
          "And did it for a chromosome created by "
          + m_originator
        );
      }
    }

    private void complain()
    {
      try
      {
        System.out.println
        (
          "\r\n"
          + "isValid() failed for genome created by "
          + this.getOriginator()
        );
      }
      catch (Exception e)
      {
        System.out.println
        (
          "TravellerChromosome.complain() threw!"
        );
        System.out.println
        (
          "And did it for a chromosome created by "
          + m_originator
        );
      }
    }

    // compute fitness
    public double testFitness()
    {

        if ( m_fitnessValid ) { return m_fitness; }

        // calculate round-trip distance
//        if (m_closedPath)
            m_fitness =
              t_model.getDistance
              (
                hometown,
                m_cityList[m_world.getNumberOfCities() - 1].get()
              );
//        else
//            m_fitness = 0;

        for (int n = 1; n < m_world.getNumberOfCities(); ++n)
            m_fitness +=
              t_model.getDistance(m_cityList[n-1].get(),m_cityList[n].get());

        // has to visit the first city to build the round trip
        m_fitness +=        
        t_model.getDistance
        (
          hometown,
          m_cityList[0].get()
        );
        
        m_fitnessValid = true;

        return m_fitness;
    }

    public void canonicalize()
    {
//      // For safety, check that we _have_ a city list.
//      if ( m_cityList == null ) { return; }
//
//      // Distinguish a starting city.  Canonical form has this city in slot
//      // zero, and the city in slot one lexicographically less than the city
//      // in slot minus one (since we are working in a ring, this makes sense).
//
//      int hometown = 0;
//
//      // For efficiency, check whether we are already _in_ canonical form,
//      // and so need do nothing.
//      if
//      (
//        ( m_cityList[0].get() == hometown )
//        &&
//        ( m_cityList[1].get() < m_cityList[getNumCities() - 1].get() )
//      )
//      { return; }
//
//      // No joy, we must work for a living.
//
//      int [] tempCityList = null;
//      tempCityList        = new int [this.getNumCities()];
//      int startAt = findCity( hometown );
//      int stepBy = 1;
//      if (getCity( startAt + 1 ) > getCity( startAt - 1 ) )
//      {
//        stepBy = ( -1 );
//      }
//
//      for
//      (
//        int i = 0, j = startAt ;
//        i < this.getNumCities() ;
//        i++ , j += stepBy
//      )
//      {
//        tempCityList[i] = this.getCity(j);
//      }
//
//      for ( int i = 0 ; i < this.getNumCities() ; i++ )
//      {
//        setCity(i , tempCityList[i]);
//      }
//
//      return;
    }
}

