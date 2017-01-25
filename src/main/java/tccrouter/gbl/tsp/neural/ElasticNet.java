
/*
** This code was written by Kent Paul Dolan.  See accompanying file
** TravellerDoc.html for status for your use.
*/

/*
** class ElasticNet, used to generate  a seed tour for Traveller.
** 
** This code is unlikely at all to resemble the original code, so all
** blame should be placed on KPD for current infelicities.  The original
** author used it to "solve" the ETSP, I'm just using it to get a very,
** very good solution-approximating seed tour for a genetic algorithm.
** 
** The original of this code is due to Alexander Budnik,
** budnik@nf.jinr.ru, and was found posted at URL
** http://nuweb.jinr.dubna.su/~filipova/tsp.html.
** 
** There he describes the algorithm like this (ripped unkindly from his
** HTML original, with all the nice formatting there discarded):
*/

/*
** the Travelling Salesman Problem
** 
** The elastic net is a kind of artificial  neural networks which is
** used for optimization problems.
** 
** Let us demonstrate the elastic net method on a simple example of
** solving a travelling salesman problem. The travelling salesman
** problem is a classical problem in the field of combinatorial
** optimization, concerned with efficient methods for maximizing or
** minimizing a function of many independent variables. 
** 
** Given the positions of N cities, what is the shortest closed tour in
** which each city can be visited once?
** 
** All exact methods known for determining an optimal route require a
** computing effort that increases exponentially with number of cities,
** so in practice exact solutions can be attempted only on problems
** involving a few hundred cities or less. The travelling salesman
** problem belongs to the large class of nondeterministic polynomial
** time complete problems.
** 
** The elastic net method has been applied to the travelling salesman
** problem. The essence of the method is:
** 
** Using an iterative procedure, a circular closed path is gradually
** elongated non-uniformly until it eventually passes sufficiently near
** to all the cities to define a tour.
** 
** A tour can be viewed as a mapping from a circle to the plane so that
** each city in the plane is mapped to by some point on the circle. We
** consider mappings from a circular path of points to the plane in
** which neighboring points on the circle are mapped as close as
** possible on the plane. This is a special case of the general problem
** of best preserving neighborhood relations when mapping between
** different geometrical spaces.
** 
** The algorithm is a procedure for the successive recalculation of the
** positions of a number of points in the plane in which the cities lie.
** The points describe a closed path which is initially a small circle
** centered on the center of the distribution of cities and is gradually
** elongated non-uniformly to pass eventually near all the cities and
** thus define a tour around them.  Each point on the pass moves under
** the influence of two types of force:
** 
** 1. the first moves it towards those cities to which it is nearest;
** 
** 2. the second pulls it towards its neighbors on the path, acting to
** minimize the total path length.
** 
** By this means, each city becomes associated with a particular section
** on the path. The tightness of the association is determined by how
** the force contributed from a city depends on a distance, and the
** nature of this dependence changes as the algorithm progresses.
** Initially all cities have roughly equal influence on each point on
** the path. Subsequently, longer distance become less favored, and each
** city gradually becomes more specific for the points on the path
** closest to it.
** 
** More detailed description of the method you can find in:R.Durbin, D.
** Willshaw, "An Analogue Approach to the Travelling Salesman Problem
** Using an Elastic Net Method", Nature, v.326, n.16, April 1987, p.689.
*/

/*
** Since I don't have access to the original document describing the
** parameters here, and the names used in the original software are
** totally opaque, and since I cannot provide screen real-estate for a
** user to tune these parameters anyway, probably just hard-wiring the
** default values is as good as I can do.  This comment preserved for
** historical interest.
*/

/*
**  parameters to pass through html document:
** 
** citynum - integer number of city         (min=2 ,max=300 ,def=10  );
** waynum  - integer number of net points   (min=2 ,max=600 ,def=30  );
** itmax - integer, max number of iteration (min=10,max=6000,def=1500);
** next is now waypointToCityTension
** para - double parameter a of calculation (min=0.,max=1.  ,def=0.2 );
** next is now waypointToWaypointTension
** parb - double parameter b of calculation (min=0.,max=10. ,def=2.  );
** park - double parameter k of calculation (min=0.,max=1.  ,def=.2  );
** parke - double, parameter of conditions to stop calculation
**                                          (min=0.2,max=4.,def=1.  );
*/

package tccrouter.gbl.tsp.neural;

import java.awt.Color;

import tccrouter.gbl.common.entity.ExecutionTrace;
import tccrouter.gbl.common.entity.TSProblemModel;
import tccrouter.gbl.common.util.ColorUtil;
import tccrouter.gbl.common.util.IntPairSortedOnSecondElement;
import tccrouter.gbl.common.util.QuickSortAlgorithm;
import tccrouter.ring.gui.UIFacade;

public class ElasticNet
{

  private ExecutionTrace executionTrace;
  private boolean measureExecution;

  public static final int ITERATION_LIMIT = 1500;  // author's default limit

  private static  final int X_INDEX = 0; 
  private static  final int Y_INDEX = 1; 

  private double  city[][];
  private double  way[][];
  private int     wayNodeList[];
  private int     wayDrawAtLocations[][];

  double widthMin = 0.0D;
  double widthMax = TSProblemModel.getInstance().getWidthMax();
  double heightMin = 0.0D;
  double heightMax = TSProblemModel.getInstance().getHeightMax();

/*
** We cannot, in general, afford to create an array this big; being
** tossed off into virtual memory murders execution speeds.  Instead we
** virtualize the array with class phiVirtualArray, above. We are much
** better off to recompute the values every time, than to fetch them
** already computed from hard disk every time, even thought the
** computation is an onerous exponential.
** 
**  double  phiArr[][];
*/

  phiVirtualArray phiVA = null;


/*
** Tuning constants.
*/
  // POLICY How fast to decrement parameter K
  private final static double TENSION_ADJUSTMENT_DECREMENTER = 0.995D;
  private final static double INITIAL_TENSION_ADJUSTMENT     = 0.2D;
  private final static double WAYPOINT_TO_CITY_TENSION       = 0.2D;
  private final static double WAYPOINT_TO_WAYPOINT_TENSION   = 2.0D;
  private final static double CLOSE_ENOUGH                   = 0.2D;

  double  city_norm[];
  double  waypointToCityTension;
  double  waypointToWaypointTension;
  double  tensionAdjustment;
  double  parameterK_StartingValue;
  double  closeEnough;
  double  cityScaler;
  double  endIt;
  boolean moreIterations = true;
  double  parke;
  int     citynum;
  int     waynum;
  int     wayX    = 0;
  int     wayY    = 1;
  int     waySize = 2;
//  int     itmax;
  double  delta[][] = null;
  int     iterationCount = 0;
  boolean DB = false;

  //--------------------------------------------------

/*
** We pretty much need to replace this, for the reasons noted above; the
** tuning parameters aren't any use to us, and we're passing in a city
** array rather than just specifying the size of one.  The name doesn't
** work very well in Traveller, either, where pretty much everything is
** a "TSP" thingie of some kind or other.
*/
//  public TSP
//  (
//    int cnum,
//    int wnum,
//    int max,
//    double a,
//    double b,
//    double k,
//    double ke
//  )

  //------------ Constructor -------------------------
  public ElasticNet ()
  {

	  measureExecution = TSProblemModel.getInstance().isExecutionMeasure();
	  if (measureExecution) {
		  executionTrace = ExecutionTrace.getInstance();
	  }
	  
    // a list of cities in a playfield defined elsewhere
    double cityList[][] = TSProblemModel.getInstance().getNodeExactLocations();

    // index of the x coordinate in the second array part
    int cityX = TSProblemModel.CITY_X;

    // index of the y coordinate in the second array part
    int cityY = TSProblemModel.CITY_Y;

//    itmax = maxIterations;
    citynum = cityList.length;
    waynum = 3 * citynum;  // fairly arbitrarily, to allow sufficient flex

    wayDrawAtLocations = new int[waynum][waySize];

    wayNodeList = new int[waynum];

    for ( int i = 0; i < waynum; i++ ) { wayNodeList[i] = i; }

/*
** Use defaults, as discussed above.  The constant values copied here
** could have been propagated directly for use in the calculations, but
** since these variables were originally constructor parameters, we'll
** leave the mixed case variable names for possible reparameterization
** at another implementation effort time.
*/

    waypointToCityTension     = WAYPOINT_TO_CITY_TENSION;
    waypointToWaypointTension = WAYPOINT_TO_WAYPOINT_TENSION;
    tensionAdjustment         = INITIAL_TENSION_ADJUSTMENT;

/*
** This beast is a little spooky, but eventually it is scaled to
** something approximating one pixel diameter in the remote playfield
** for a tuning constant original value of 1.0.
*/

    closeEnough = CLOSE_ENOUGH;

    iterationCount = 0;

/*
** Create arrays sized proportional to the input city list.
*/

    city      = new double[citynum][2];
    way       = new double[waynum][waySize];
    city_norm = new double[citynum];
    delta     = new double[waynum][waySize];

    phiVA     = new phiVirtualArray( citynum, waynum );
//    phiArr    = new double[citynum][waynum]; // as above


/*
** Create a drawing surface on which to display progress.
*/

    cityScaler =  // we will reuse this in our stopping condition
      Math.max
      (
        ( widthMax - widthMin ),
        ( heightMax - heightMin )
      );

    endIt = closeEnough / cityScaler;
    moreIterations = true;

/*
** Scale cities from the input city list to fit this routine's
** expectations of them being in a unit square in the first quadrant,
** copy the results to the local city array.
*/

    for ( int cityIndex = 0; cityIndex < citynum; cityIndex++ )
    {
      city[cityIndex][X_INDEX] =
        ( cityList[cityIndex][cityX] - widthMin ) / cityScaler;
      city[cityIndex][Y_INDEX] =
        ( cityList[cityIndex][cityY] - heightMin ) / cityScaler;
    }

/*
** Fill in the starting waypoints list;
*/

    newpoint();

/*
** Display start state.
*/
    
    UIFacade.getInstance().getWorkspace().drawNodes(
          wayDrawAtLocations,
          waynum,
          wayX,
          wayY,
          ColorUtil.COLOR_WAYPOINT    		
    );    
    UIFacade.getInstance().getWorkspace().repaint();
    
  }
    

  private class phiVirtualArray
  {
    private double phiArray[][] = null;
    private boolean valuesAreStored = false;
    private static final int ARRAY_SIZE_LIMIT = 30000;

    public phiVirtualArray( int cityCount, int waypointCount )
    {
      if ( ( cityCount * waypointCount ) <= ARRAY_SIZE_LIMIT )
      {
        valuesAreStored = true;
        phiArray = new double[cityCount][waypointCount];
      }
      else
      {
        valuesAreStored = false;
      }
    }

    public void putValue(double phiValue, int cityIndex, int waypointIndex)
    {
      if ( valuesAreStored && ( phiArray != null ) )
      {
        phiArray[cityIndex][waypointIndex] = phiValue;
      }
      else {}
    }

    public double getValue( int cityIndex, int waypointIndex )
    {
      if ( valuesAreStored && ( phiArray != null ) )
      {

/*
** Trust the customer to keep track of whether these are useful values
** previously stored in the array.  That isn't the container's
** responsibility.
*/

        return phiArray[cityIndex][waypointIndex];
      }
      else // calculate virtual array contents over again
      {
         double dx = way[waypointIndex][X_INDEX]-city[cityIndex][X_INDEX];
         double dy = way[waypointIndex][Y_INDEX]-city[cityIndex][Y_INDEX];
         double dr = dx*dx + dy*dy;
         return phi(dr);
      }
    }

    public boolean storingIsUseful()
    {
      return valuesAreStored;
    }

/*
** FIXME This may not be the best packaging; a "phi" calculation method
** isn't really part of a "phi array" container object.
*/

    public double phi(double distance)
    {

/*
** This conditional calculation is a bit strange.  Since we scale cities
** to fit in a unit square, distances should never exceed its diagonal,
** unless the waypoints go wandering off into the weeds.  Better safe
** than sorry I guess, there must be situations in which weed visits
** were seen, or this wouldn't have been written this way.
*/

      return
      ( distance < 70.0D )
      ? Math.exp( ( 0.0D - distance ) / ( 2.0D * tensionAdjustment * tensionAdjustment ) )
      : 0.0D;
    }
  }

  //------------------- Salesman calculation's --------

/*
** This routine expects (notice the calculations in newpoint and
** newcity) that the cities will be distributed across the real number
** range 0 to 1, so we'd better scale our cities as input to that range
** in the constructor.
*/

/*
** Put the initial waypoints evenly spaced around a radius 0.2 circle
** centered in the center of the 1.0 x 1.0 playfield.  Unless our city
** generation routine has been really perverse (which is entirely
** possible), this will be somewhere toward  the middle of the city
** locations.
*/

  private void newpoint()
  {
    double radianDelta = 2.0D * Math.PI / (double) waynum;
    for ( int waypointIndex = 0; waypointIndex < waynum; waypointIndex++)
    {
      way[waypointIndex][X_INDEX] =
        0.5D + ( 0.2D * Math.cos( radianDelta * (double) waypointIndex ) );
      way[waypointIndex][Y_INDEX] =
        0.5D + ( 0.2D * Math.sin( radianDelta * (double) waypointIndex ) );
    }
    createDrawingLocationsForWaypoints();
  }

  private void createDrawingLocationsForWaypoints()
  {
      // Calculate corresponding drawing locations for exact locations
      // set above.
      for (int i = 0; i < waynum; ++i)
      {
          wayDrawAtLocations[i][wayX] =
           (int)Math.round((way[i][wayX]*cityScaler) + widthMin);
          wayDrawAtLocations[i][wayY] =
            (int)Math.round((way[i][wayY]*cityScaler) + heightMin);
      }
  }

/*
** We aren't going to do this for using the original program as a
** seeding tool to which an array of cities is fed already populated.
*/

//  public void newcity()
//  {
//    for(int i=0; i<citynum; i++)
//      {
//        city[i][x] = Math.random();
//        city[i][y] = Math.random();
//      }
//    newpoint();  // I don't want to know why this is inside here.
//  }

  private double fcity( int waypointIndex, int coordinateXorY )
  {
    double result = 0.0D;
    for ( int cityIndex = 0; cityIndex < citynum; cityIndex++ )
      result +=
        (
          city[cityIndex][coordinateXorY]
          -
          way[waypointIndex][coordinateXorY]
        )
        * phiVA.getValue( cityIndex, waypointIndex )
        / city_norm[cityIndex];
    return result;
  }

/*
** This routine has a rather _huge_ side effect of filling in the phi
** array.  Since we've virtualized the phi array, that might or might
** not do any good.  If it won't, we won't do it now.
*/

  private double dist_max()
  {
    double max = 0.0D;
    for ( int cityIndex = 0; cityIndex < citynum; cityIndex++ )
     {

      double min = Double.MAX_VALUE;

      for(int waypointIndex = 0; waypointIndex < waynum; waypointIndex++)
      {
        double dx = way[waypointIndex][X_INDEX] - city[cityIndex][X_INDEX];
        double dy = way[waypointIndex][Y_INDEX] - city[cityIndex][Y_INDEX];
        double dr = dx*dx + dy*dy;

//        phiArr[i][j] = phi(dr);

/*
** Only do the expensive phi calculaton if it is going to pay off right
** now.  Notice that this calculation is based on distance _squared_,
** which makes this some (obscene) variant of a least squares algorithm
** (the obscentity being the exponenetial damping with time).
*/

        if ( phiVA.storingIsUseful() )
        {
          phiVA.putValue( phiVA.phi(dr), cityIndex, waypointIndex);
        }

        min = Math.min( min, Math.sqrt(dr) );
      }

      max = Math.max(max, min);

    }

    return max;
  }


  //--------- This is the main iteration procedure! -------

/*
** FIXME For seeding purposes, we want to split this into an iteration
** setup method, and an iteraton continuation method, so that we can
** snaffle (presumably inceasingly more fit) seed arrays at various
** stopping points along the iteration.  The best way is to move lots of
** this setup stuff into the constructor.
*/

  public int [] iterate( int iterateHowManyTimes )
  {
    // done in constructor now
    // tensionAdjustment = park_st;
    // newpoint();
    double maximumDistance = 0.0D;

    //---------- Main calculation ----------------
    for ( int iter=0; iter < iterateHowManyTimes; iter++ )
    {
  	  if (measureExecution) {
		  executionTrace.iterationTrace();
	  }
    	
      iterationCount++;     // for outside reporting.
      tensionAdjustment *= TENSION_ADJUSTMENT_DECREMENTER;

/*
** Check whether each city is sufficiently close to some waypoint; as a
** side effect, calculate the inverse exponentially damped weights to
** use to adjust the waypoints, in case the answer is that some city is
** not yet sufficiently close to a waypoint.  I don't find any evidence
** that each city is uniquely matched to a waypoint, which will cause
** some algorithmic issues when using this routine as a seed mechanism.
*/

      maximumDistance = dist_max();

      if ( maximumDistance < endIt )
      {

        if (DB) System.out.println
        (
          "final iteration count / dist_max / endIt / moreIterations: "
          + iterationCount
          + "/"
          + maximumDistance
          + "/"
          + endIt
          + "/"
          + moreIterations
        );
/*
** Signal caller that further calls will be futile.  Notice that nothing
** bad happens if they ignore us, except that they get back the same
** city list with each call after we quit trying.
*/

        moreIterations = false;

/*
** Build and return a city list from which a genome can be built,
** consisting of the cities sorted in waypoint order of the waypoints to
** which each city is closest.
*/

        return spawnNextCityList();

      }

      // -------- Cities normalization -----------

/*
** For each city, sum up the inverse exponentially damped weights of
** waypoint attractions, to use as a normalizing factor.
*/

      for ( int cityIndex = 0; cityIndex < citynum; cityIndex++ )
      {
        city_norm[cityIndex] = 0.0D;

        for ( int waypointIndex = 0; waypointIndex < waynum; waypointIndex++ )
        {
          city_norm[cityIndex] += phiVA.getValue( cityIndex, waypointIndex );
        }

        if ( city_norm[cityIndex] < 1.0e-80D )
        {
          city_norm[cityIndex] = 1.0D;
        }
      }

      // --- Calculate waypoint adjustment deltas ----

      for ( int waypointIndex = 0; waypointIndex < waynum; waypointIndex++ )
      {

        int nextWaypointIndex =
          ( waypointIndex == ( waynum - 1 ) )
          ? 0
          : ( waypointIndex + 1 );

        int previousWaypointIndex =
          ( waypointIndex == 0 )
          ? ( waynum - 1 )
          : ( waypointIndex - 1 );

        for ( int coordinate = X_INDEX; coordinate <= Y_INDEX; coordinate++ )
        {
          delta[waypointIndex][coordinate] =
            (
              (
                waypointToCityTension
                *
                fcity( waypointIndex, coordinate )
              )
              +
              (
                waypointToWaypointTension
                *
                tensionAdjustment
                *
                (
                  way[nextWaypointIndex][coordinate]
                  -
                  ( 2.0D * way[waypointIndex][coordinate] )
                  +
                  way[previousWaypointIndex][coordinate]
                )
              )
            );
        }

      }

      //---------- Adjust waypoints --------------

      for ( int waypoint = 0; waypoint < waynum; waypoint++ )
      {
        for ( int coordinate = X_INDEX; coordinate <= Y_INDEX; coordinate++ )
        {

          if (DB) System.out.println
          (
            "adjusting way["
            + waypoint
            + "]["
            + coordinate
            + "] of "
            + way[waypoint][coordinate]
            + " += delta of "
            + delta[waypoint][coordinate]
          );

          way[waypoint][coordinate] += delta[waypoint][coordinate];
        }

      }

/*
** Display progress.
*/

      createDrawingLocationsForWaypoints();

      UIFacade.getInstance().getWorkspace().drawEdges
      (
        wayNodeList,
        waynum,
        wayDrawAtLocations,
        wayX,
        wayY,
        Color.green,
        true // closed path
      );
      
      UIFacade.getInstance().getWorkspace().drawNodes(
              wayDrawAtLocations,
              waynum,
              wayX,
              wayY,
              ColorUtil.COLOR_WAYPOINT    		
        );    
        UIFacade.getInstance().getWorkspace().repaint();
    }

    
    return spawnNextCityList();

  }

  public boolean moreIterationsAreAvailable()
  {
    return moreIterations;
  }


  private int [] spawnNextCityList()
  {

/*
** Create a city list for output.
*/

    int newCityList[] = new int[citynum];

/*
** Create a city and waypoint list for sorting cities in waypoint order.
*/

    IntPairSortedOnSecondElement cawp[] =
      new IntPairSortedOnSecondElement[citynum];

/*
** Initialize with unworkable values, for debugging.
*/

    for ( int cityIndex = 0; cityIndex < citynum; cityIndex++ )
    {
      newCityList[cityIndex] = -1;

      cawp[cityIndex] = new IntPairSortedOnSecondElement( -1, -1 );
    }

/*
** Fill in the array to be sorted with the city index and the index of
** the waypoint closest to that city.
*/

    for ( int cityIndex = 0; cityIndex < citynum; cityIndex++ )
    {

      double bestDistance = Double.MAX_VALUE;

/*
** As noted above, the assignments of waypoint indices to city indices
** is not necessarily unique, so the sort may be sorting on identical
** waypoint indices; we don't care, since this just a good seed tour,
** not the perfect solution tour.
*/

      for ( int waypointIndex = 0; waypointIndex < waynum; waypointIndex++ )
      {

        double dx = way[waypointIndex][X_INDEX]-city[cityIndex][X_INDEX];
        double dy = way[waypointIndex][Y_INDEX]-city[cityIndex][Y_INDEX];
        double dr = Math.sqrt( dx*dx + dy*dy );

        if ( dr < bestDistance )
        {
          bestDistance = dr;
          cawp[cityIndex] =
            new IntPairSortedOnSecondElement( cityIndex, waypointIndex );
        }

      }

    }

/*
** Sort the list just created in waypoint order, which will put the
** cities in the order of the tour which the waypoints have defined due
** to the running of the elastic net algorithm.
*/

    if (DB)
    {
      StringBuffer b = new StringBuffer("");
      b.append("[");
      for ( int i = 0; i < cawp.length; i++ )
      {
        b.append( ( ( i == 0 ) ? "" : "," ) + cawp[i].toString()  );
      }
      b.append("]");

      System.out.println
      (
        "cawp before qsort :"
        + b.toString()
      );
    }

    QuickSortAlgorithm.sort( cawp );

    for ( int cityIndex = 0; cityIndex < citynum; cityIndex++ )
    {
      newCityList[cityIndex] = cawp[cityIndex].getFirst();
    }

    return newCityList;
  }

}
