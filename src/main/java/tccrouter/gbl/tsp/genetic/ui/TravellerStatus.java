
/*
** This code class was written by Kent Paul Dolan.  Most of its contents
** were removed from Scott Robert Ladd's Traveller.java and
** TravellerWorld.java source files; see those files for Scott's
** copyright rules.  See accompanying file TravellerDoc.html for status
** of the modifications here (an extensive refactoring and rewrite) for
** your use.
*/

package tccrouter.gbl.tsp.genetic.ui;

import java.util.Date;

import tccrouter.diamante.core.util.OutputSender;
import tccrouter.gbl.common.entity.TSProblemModel;
import tccrouter.gbl.tsp.genetic.TravellerWorld;
import tccrouter.gbl.tsp.genetic.tools.PermutationController;
import tccrouter.gbl.tsp.genetic.tools.TaskListener;

public class TravellerStatus
  implements TaskListener
{

/*
** We own our only instance, in a Design Patterns "Solitary" style; we
** hook it here.  Though we would like to be a static class, not to be
** instantiated at all, we must be instantiated, not so much to
** implement TaskListener as to hook ourselves to the task to which we
** listen via addTaskListener(this).
*/

  private static TravellerStatus m_soliton;

/*
** This title is how we display ourselves to the world in our window
** frame title bar.
*/

//  private final static String STATUS_NAME = "Salesman's Trip Report";

/*
** This frame is our outer container, and interacts (behind our back)
** with the ntive window management system to hold a framed, decorated
** window for us.
*/

//  TravellerFrame m_statusFrame   = null;

/*
** This panel goes inside our window frame, and contains our status line
** labels.
*/

//  private EdgedPanel     m_statPanel;

/*
** Here is the place we put our status lines, since we cannot just write
** them on the panel, apparently.
*/

//  private Label []       m_statusLines = null;

/*
** We name status lines using these indices, so we can keep them in an
** array and do nice things without so much pain.  The last line is a
** count, not an index, so keep it last; it is used to size the array
** and limit loops.
*/

  private final static int STATUS_CURRENT_ORIGIN   =  0;
  private final static int STATUS_CURRENT_IMAGE    =  1;
  private final static int STATUS_BRUTE_FORCE      =  2;
  private final static int STATUS_CHANGE_TITLE     =  3;
  private final static int STATUS_CHANGE_COUNTS    =  4;
  private final static int STATUS_LENGTHS_TITLE    =  5;
  private final static int STATUS_LENGTHS_SHORTEST =  6;
  private final static int STATUS_LENGTHS_AVERAGE  =  7;
  private final static int STATUS_LENGTHS_LONGEST  =  8;
  private final static int STATUS_PERMUTATION      =  9;
  private final static int STATUS_GENERATIONS      = 10;
  private final static int STATUS_TIMES            = 11;
  private final static int STATUS_ANNEALING        = 12;
  private final static int STATUS_LINES_COUNT      = 13; // count of above

/*
** KPD I needed to use an initializing string whose image is at least as
** wide as the applet's status viewport, because the label width is
** permanently sized to fit the rendered initializing string, and the
** status display, much bigger now, was getting clipped at both ends.
** Sorry about nuking the applet title in the status bar, Scott, but at
** least it is still visible in the splash panel.
*/

  private final static String STATUS_BAR_SIZER =
    "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";

  private static TravellerWorld m_world;
/*
** Stuff for reporting status and statistics.
*/

/*
** "Let there be time!"  Preferably before we need to use it to seed
** something.  Well, no, "Date()" isn't a clock, it's merely a time of
** day, so we need to instantiate it before _each_ time sampling.  Sigh.
*/

  private static Date       m_tod = null;

  private static String     m_bf = null;  // brute force effort description

  private static int        m_candidatesConsidered = 0;
  private static int        m_candidatesImproved   = 0;
  private static int        m_candidatesAnnealed   = 0;
  private static int        m_candidatesMutated    = 0;

  private static int        m_totalCandidatesConsidered = 0;
  private static int        m_totalCandidatesImproved   = 0;
  private static int        m_totalCandidatesAnnealed   = 0;
  private static int        m_totalCandidatesMutated    = 0;

  private static long       m_generationCurrently;
  private static long       m_generationAtLastImprovement;

  private static long       m_longestPathBestEver;
  private static long       m_longestPathAtLastImprovement;
  private static long       m_longestPathCurrently;
  private static long       m_longestPathAtStart;
  private static long       m_longestPathWorstEver;

  private static double     m_shortestPathAtLastImprovement = -1.0D;
  private static double     m_shortestPathBestEver;  // useful when elitism is off
  private static double     m_shortestPathCurrently; // useful when elitism is off
  private static long       m_shortestPathAtStart;
  private static long       m_shortestPathWorstEver; // useful when elitism is off

  private static long       m_averagePathBestEver;
  private static long       m_averagePathAtLastImprovement;
  private static long       m_averagePathCurrently;
  private static long       m_averagePathAtStart;
  private static long       m_averagePathWorstEver; // needed for annealing

  private static long       m_numberOfImprovementChanges;
  private static long       m_timeAtStop;
  private static long       m_timeAtResume;
  private static long       m_timeAtStart;
  private static long       m_timeCurrently;
  private static long       m_timeAtLastImprovement;
  private static long       m_timeAtConfigurationStart    = 0;
  private static long       m_timeAtConfigurationFinished = -1;

  private static boolean    m_exactSolutionIsKnown        = false;
  private static double     m_exactSolution               = -1.0D;
  private static double     m_circumference               = -1.0D;

/*
** Don't care and do care small double value used here and for general
** use.
** 
** POLICY Comparision of an improvement against LITTLE_FUZZ is how we
** determine that a genome has provided enough improvement to be the new
** best genome.  It is sized with respect to the width of a pixel on the
** route display canvas.
*/

  public static final double LITTLE_FUZZ = 0.0001D;

  private TravellerStatus()
  {
    super();

/*
** KPD FIXME Quite possibly this is superstitious hogwash; figure out
** how to set the size of the labels properly, instead.
*/

//    m_statusFrame   = new TravellerFrame(STATUS_NAME);

/*
    m_statusFrame.setSize
    (
      TravellerFrame.PLAYFIELD_FRAME_WIDTH,
      ( 20 * STATUS_LINES_COUNT )  // FIXME 20 pixels per line of text, maybe
      + ( 2 * TravellerFrame.FRAME_EDGE_THICKNESS ) 
      + TravellerFrame.getTitleBarHeightAllowance()
     // 240
    );
*/

    buildStatusPanel();

//    for ( int i = 0; i < STATUS_LINES_COUNT; i++)
//    {
//      m_statusLines[i].setText(STATUS_BAR_SIZER);
//    }

//    m_statusFrame.invalidate();
//    m_statusFrame.add("Center", m_statPanel);
//    m_statusFrame.pack();
//    m_statusFrame.validate();
//    m_statusFrame.setVisible(true);
  }

  private void buildStatusPanel()
  {

    // create a panel to hold southern items
//    m_statPanel = new EdgedPanel();
//    m_statPanel.setBackground(TravellerColors.BAR_COLOR);
//    m_statPanel.setForeground(TravellerColors.BAR_TEXT);

//    GridBagLayout statLayout = new GridBagLayout();
//    m_statPanel.setLayout(statLayout);

    // create a reusable constraints bag
//    GridBagConstraints statGbc = new GridBagConstraints();
//    statGbc.weightx   = 1.0;
//    statGbc.weighty   = 0.0;
//    statGbc.fill      = GridBagConstraints.HORIZONTAL;
//    statGbc.anchor    = GridBagConstraints.WEST;
//    statGbc.gridwidth = GridBagConstraints.REMAINDER;

    // create a font to avoid default font size
//    Font statusFont = new Font("SansSerif",Font.BOLD,10);

    // create some status bar lines

//    m_statusLines = new Label[STATUS_LINES_COUNT];

//    for ( int i = 0; i < STATUS_LINES_COUNT; i++ )
//    {
//     m_statusLines[i] =  new Label(STATUS_BAR_SIZER,Label.LEFT);
//     m_statusLines[i].setBackground(TravellerColors.BAR_COLOR);
//     m_statusLines[i].setForeground(TravellerColors.BAR_TEXT);
//     m_statusLines[i].setFont(statusFont);
//     Utility.addToBag
//     (
//       m_statPanel,
//       m_statusLines[i],
//       statGbc,
//       statLayout
//     );
//    }

  }

  public static void setCircumference( double circumference )
  {
    m_circumference = circumference;
  }

  public static void setTimeAtConfigurationStart( long timeInSeconds )
  {
    m_timeAtConfigurationStart = timeInSeconds;
  }

  public static void setTimeAtConfigurationFinished( long timeInSeconds )
  {
    m_timeAtConfigurationFinished = timeInSeconds;
  }

/*
** Since "worlds" go away frequently, we need to be rehooked to the
** current one each time it is re-created.
*/

  public static synchronized TravellerStatus getTravellerStatus
  (
    TravellerWorld world
  )
  {
    if ( m_soliton == null ) { m_soliton = new TravellerStatus(); }
    m_world = world;
    return m_soliton;
  }

/*
** Hook us to the world so we can be signaled with cycleComplete().
*/

  public void setup()
  {
    m_world.addTaskListener(this);
  }

  public static void reset()
  {
    m_soliton              = null;
    m_exactSolutionIsKnown = false;
    m_exactSolution        = -1.0D;
    m_circumference        = -1.0D;
  }

  public static void setExactSolutionIsKnown( boolean isItKnown )
  {
    m_exactSolutionIsKnown = isItKnown;
  }

  public static void setExactSolution( double theAnswer )
  {
    m_exactSolution = theAnswer;
  }

  private static void accumulateTotalChangeCounts()
  {
    m_totalCandidatesConsidered += m_candidatesConsidered;
    m_totalCandidatesImproved += m_candidatesImproved;
    m_totalCandidatesAnnealed += m_candidatesAnnealed;
    m_totalCandidatesMutated += m_candidatesMutated;
  }

  private static void clearChangeCounts()
  {
    m_candidatesConsidered = 0;
    m_candidatesImproved = 0;
    m_candidatesAnnealed = 0;
    m_candidatesMutated = 0;
  }

  private static void clearTotalChangeCounts()
  {
    m_totalCandidatesConsidered = 0;
    m_totalCandidatesImproved = 0;
    m_totalCandidatesAnnealed = 0;
    m_totalCandidatesMutated = 0;
  }

/*
** Connections for control buttons to signal status keeping.
*/

  public static void signalReset()
  {
    // back to generation zero
    m_generationCurrently = 0;
    m_generationAtLastImprovement = 0;
  }

  public static void signalNewCities()
  {
    // back to generation zero
    m_generationCurrently = 0;
    m_generationAtLastImprovement = 0;
  }

  public static void signalStart()
  {
    clearChangeCounts();
    clearTotalChangeCounts();
    m_generationCurrently = 0;
    m_generationAtLastImprovement = 0;
    m_tod = new Date();
    m_timeAtStart = m_tod.getTime()/1000;
    m_timeCurrently = m_timeAtStart;
    m_timeAtLastImprovement = m_timeAtStart;
  }

  public static void bumpCandidatesConsidered()
  {
    m_candidatesConsidered++;
  }

  public static void bumpCandidatesImproved()
  {
    m_candidatesImproved++;
  }

  public static void bumpCandidatesAnnealed()
  {
    m_candidatesAnnealed++;
  }

  public static void bumpCandidatesMutated()
  {
    m_candidatesMutated++;
  }

  public static void signalStop()
  {
    m_tod = new Date();
    m_timeAtStop = m_tod.getTime()/1000;
  }

  public static void signalResume()
  {
    m_tod = new Date();
    m_timeAtResume = m_tod.getTime()/1000;
    long stopResumeTimeDelta = m_timeAtResume - m_timeAtStop;
    m_timeCurrently = m_timeAtResume;
    m_timeAtStart += stopResumeTimeDelta;
    m_timeAtLastImprovement += stopResumeTimeDelta;
  }

  // task handlers
  public void cycleCompleted()
  {
    // handle time
    m_tod = new Date();
    m_timeCurrently = m_tod.getTime()/1000;

    // display generation
    //showStatus();

    ++m_generationCurrently;
  }

  public void showStatus(long finalExecutionTime)
  {

    m_shortestPathCurrently = m_world.getShortestPath();
    m_averagePathCurrently = (long)m_world.getAveragePath();
    m_longestPathCurrently = (long)m_world.getLongestPath();
    boolean isDone = false;


/*
** Generation zero is a special setup generation that does no
** improvements or genetic algorithm running.  Handle that setup
** generation's special settings for instrumentation.
*/

    if (m_generationCurrently == 0)
    {
      m_shortestPathAtStart            = (long)m_shortestPathCurrently;
      m_shortestPathAtLastImprovement  =       m_shortestPathCurrently;
      m_shortestPathBestEver           =       m_shortestPathCurrently;
      m_shortestPathWorstEver          = (long)m_shortestPathCurrently;
      m_longestPathAtStart             =       m_longestPathCurrently;
      m_longestPathAtLastImprovement   =       m_longestPathCurrently;
      m_longestPathBestEver            =       m_longestPathCurrently;
      m_longestPathWorstEver           =       m_longestPathCurrently;
      m_averagePathAtStart             =       m_averagePathCurrently;
      m_averagePathBestEver            =       m_averagePathCurrently;
      m_averagePathWorstEver           =       m_averagePathCurrently;
      m_averagePathAtLastImprovement   =       m_averagePathCurrently;
      m_numberOfImprovementChanges     = 0;
//      m_bf                             = bruteForce();
    }

    if (m_exactSolutionIsKnown)
    {
      if
      (
        Math.abs( m_shortestPathCurrently - m_exactSolution )
        <
        LITTLE_FUZZ
      )
      {
        isDone = true;
      }
    }

/*
** Avoid possible false change indications due to roundoff errors
** originating in different orders of evaluation of the path length by
** employing a tiny "fuzz" in the comparision.  If two successive paths
** which happen to be the last two found are really this close, live
** with it.
*/

    if
    (
      // Math.abs  -- probably not
      ( m_shortestPathBestEver - m_shortestPathCurrently )
      >
      LITTLE_FUZZ
    )
    {
      m_shortestPathAtLastImprovement  = m_shortestPathCurrently;
      m_averagePathAtLastImprovement   = m_averagePathCurrently;
      m_longestPathAtLastImprovement   = m_longestPathCurrently;
      m_generationAtLastImprovement    = m_generationCurrently;
      m_timeAtLastImprovement          = m_timeCurrently;
      m_numberOfImprovementChanges    += 1;
    }

    if ( m_shortestPathCurrently > m_shortestPathWorstEver )
    {
      m_shortestPathWorstEver = (long)m_shortestPathCurrently;
    }

    if ( m_shortestPathCurrently < m_shortestPathBestEver )
    {
      m_shortestPathBestEver = m_shortestPathCurrently;
    }

    if ( m_averagePathCurrently < m_averagePathBestEver )
    {
      m_averagePathBestEver = m_averagePathCurrently;
    }

    if ( m_averagePathCurrently > m_averagePathWorstEver )
    {
      m_averagePathWorstEver = m_averagePathCurrently;
    }

    if ( m_longestPathCurrently < m_longestPathBestEver )
    {
      m_longestPathBestEver = m_longestPathCurrently;
    }

    if ( m_longestPathCurrently > m_longestPathWorstEver )
    {
      m_longestPathWorstEver = m_longestPathCurrently;
    }

    StringBuffer status[] = new StringBuffer[STATUS_LINES_COUNT];
    for (int i = 0; i < STATUS_LINES_COUNT; i++)
    {
      status[i] = new StringBuffer();
      if (isDone) { status[i].append( "DONE! "); }
    }

    status[STATUS_CURRENT_ORIGIN]
      .append( "current first best genome by: " )
      .append( m_world.getBestGenomeOriginator() );

    status[STATUS_CURRENT_IMAGE]
      .append( "current first best genome ID: " )
      .append( m_world.getBestGenomeName() )
      .append( "; clones: " )
      .append( m_world.getBestGenomeCloneCount() )
      .append( "; sameFitnesses: " )
      .append( m_world.getSameFitnessCount() )
      ;

    status[STATUS_BRUTE_FORCE]
      .append( m_bf );

    status[STATUS_CHANGE_TITLE]
      .append
      ( "candidates -- improved / annealed / mutated / considered" )
      ;

    accumulateTotalChangeCounts();

    status[STATUS_CHANGE_COUNTS]
      .append( "overall: " )
      .append( m_totalCandidatesImproved )
      .append( " / " )
      .append( m_totalCandidatesAnnealed )
      .append( " / " )
      .append( m_totalCandidatesMutated )
      .append( " / " )
      .append( m_totalCandidatesConsidered )
      .append( ", last generation: " )
      .append( m_candidatesImproved )
      .append( " / " )
      .append( m_candidatesAnnealed )
      .append( " / " )
      .append( m_candidatesMutated )
      .append( " / " )
      .append( m_candidatesConsidered )
      ;

    clearChangeCounts();

    status[STATUS_LENGTHS_TITLE]
      .append( "lengths -- best / at last improvement / currently / " )
      .append( "at start / worst ever; other stuff" );

    status[STATUS_LENGTHS_SHORTEST]
      .append( "shortest: ")
      .append( (long)m_shortestPathBestEver )
      .append( " / " )
      .append( (long)m_shortestPathAtLastImprovement )
      .append( " / " )
      .append( (long)m_shortestPathCurrently )
      .append( " / " )
      .append( m_shortestPathAtStart )
      .append( " / " )
      .append( m_shortestPathWorstEver );

    status[STATUS_LENGTHS_AVERAGE]
      .append( "average: ")
      .append( m_averagePathBestEver )
      .append( " / " )
      .append( m_averagePathAtLastImprovement )
      .append( " / " )
      .append( m_averagePathCurrently )
      .append( " / " )
      .append( m_averagePathAtStart )
      .append( " / " )
      .append( m_averagePathWorstEver )
      .append( "; world edges, x/y: " )
      .append( (long)TSProblemModel.getInstance().getWidthMax() )
      .append( "/" )
      .append( (long)TSProblemModel.getInstance().getHeightMax() );

    status[STATUS_LENGTHS_LONGEST]
      .append( "longest: " )
      .append( m_longestPathBestEver )
      .append( " / " )
      .append( m_longestPathAtLastImprovement )
      .append( " / " )
      .append( m_longestPathCurrently )
      .append( " / " )
      .append( m_longestPathAtStart )
      .append( " / " )
      .append( m_longestPathWorstEver );

    status[STATUS_PERMUTATION]
      .append
      (
        "permute: (limits::whiffs) now/highest::inARow/limitBumpsAt " 
      )
      .append( PermutationController.getPermutationRuntimeInfo() );

    if ( m_exactSolutionIsKnown )
    {
      status[STATUS_LENGTHS_SHORTEST]
        .append( "; solved at: ")
        .append( (long)m_exactSolution );
    }

//    if
//    (
//      CheckBoxControls.getState
//      (
//        CheckBoxControls.CBC_SEED_FROM_MINIMAL_SPANNING_TREE
//      )
//    )
//    {
//      status[STATUS_LENGTHS_SHORTEST]
//        .append( "; MST floor " )
//        .append( (long)MasterSeeder.getFloor() );
//    }

//    if ( CheckBoxControls.getState(CheckBoxControls.CBC_LAYOUT_CIRCULAR) )
//    {
//      status[STATUS_LENGTHS_LONGEST]
//        .append( "; circle circumference: " )
//        .append( (long)m_circumference );
//    }

    status[STATUS_GENERATIONS]
      .append( "generations: at improvement / now " )
      .append( m_generationAtLastImprovement )
      .append( " / " )
      .append( m_generationCurrently )
      .append( "; # of improvements: " )
      .append( m_numberOfImprovementChanges );


//    if
//    (
//      CheckBoxControls.getState
//      (
//        CheckBoxControls.CBC_METAHEURISTIC_ANNEALING
//      )
//    )
//    {
//      status[STATUS_ANNEALING]
//        .append( "annealing: decrementor: " )
//        .append( m_world.getAnnealingDecrementer() ) 
//        .append( " & limit: " )
//        .append( m_world.getAnnealingLimit() );
//    }
//    else
//    {
//      status[STATUS_ANNEALING]
//        .append( "annealing not enabled" );
//    }

    status[STATUS_TIMES]
      .append ( "elapsed seconds: for run: at improvement / now " )
      .append( (m_timeAtLastImprovement - m_timeAtStart) )
      .append( " / " )
      .append( (m_timeCurrently - m_timeAtStart) )
      .append( "; for setup: " )
      .append
      (
        ( m_timeAtConfigurationFinished - m_timeAtConfigurationStart )
      );

//	" Total Candidates considered: " + m_totalCandidatesConsidered +
//	" Total Candidates improved: " + m_totalCandidatesImproved +
//	" Total Candidates improved: " + m_totalCandidatesImproved +
//	    
//      m_statusLines[i].setText( status[i].toString() );

    StringBuffer result = new StringBuffer();
    
    for ( int i = 0; i < STATUS_LINES_COUNT; i++ )
    {
    	result.append(status[i]);
    	result.append('\n');
    }
    
		// Shows a reply message with the status and time of execution
		OutputSender.showMessageDialog(
			"Total execution Time: "+
			finalExecutionTime + " ms\n" +
			result
			,
			"Execution Status",
			OutputSender.INFORMATION_MESSAGE
		);
    	
  }

}
