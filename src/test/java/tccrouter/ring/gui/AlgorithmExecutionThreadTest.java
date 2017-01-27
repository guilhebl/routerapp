package tccrouter.ring.gui;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AlgorithmExecutionThreadTest {
  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test1"); }

    tccrouter.diamante.core.graph.Graph graph1 = null;
    tccrouter.ring.gui.graphdrawing.GraphWorkspace graphWorkspace2 = null;
    tccrouter.ring.gui.event.AlgorithmObserver algorithmObserver3 = null;
    // The following exception was thrown during execution in test generation
    try {
    tccrouter.ring.gui.AlgorithmExecutionThread algorithmExecutionThread4 = new tccrouter.ring.gui.AlgorithmExecutionThread("", graph1, graphWorkspace2, algorithmObserver3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test2"); }

    tccrouter.diamante.core.graph.Graph graph1 = null;
    tccrouter.ring.gui.graphdrawing.GraphWorkspace graphWorkspace2 = null;
    tccrouter.ring.gui.event.AlgorithmObserver algorithmObserver3 = null;
    // The following exception was thrown during execution in test generation
    try {
    tccrouter.ring.gui.AlgorithmExecutionThread algorithmExecutionThread4 = new tccrouter.ring.gui.AlgorithmExecutionThread("hi!", graph1, graphWorkspace2, algorithmObserver3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

}