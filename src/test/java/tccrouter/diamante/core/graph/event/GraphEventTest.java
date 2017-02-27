package tccrouter.diamante.core.graph.event;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@SuppressWarnings("unused")
public class GraphEventTest {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test01"); }

    java.lang.Object obj0 = null;
    // The following exception was thrown during execution in test generation
    try {    
	tccrouter.diamante.core.graph.event.GraphEvent graphEvent1 = new tccrouter.diamante.core.graph.event.GraphEvent(obj0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }

    tccrouter.diamante.core.graph.event.GraphEvent graphEvent1 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)'a');
    java.lang.Object obj2 = graphEvent1.getSource();
    java.lang.String str3 = graphEvent1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj2 + "' != '" + 'a'+ "'", obj2.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=a]"+ "'", str3.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=a]"));

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }

    tccrouter.diamante.core.graph.event.GraphEvent graphEvent1 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)100.0d);
    java.lang.Object obj2 = graphEvent1.getSource();
    java.lang.String str3 = graphEvent1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj2 + "' != '" + 100.0d+ "'", obj2.equals(100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=100.0]"+ "'", str3.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=100.0]"));

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }

    tccrouter.diamante.core.graph.event.GraphEvent graphEvent1 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)(byte)1);
    java.lang.String str2 = graphEvent1.toString();
    java.lang.String str3 = graphEvent1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=1]"+ "'", str2.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=1]"+ "'", str3.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=1]"));

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }

    tccrouter.diamante.core.graph.event.GraphEvent graphEvent1 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)100.0d);
    java.lang.Object obj2 = graphEvent1.getSource();
    java.lang.Object obj3 = graphEvent1.getSource();
    tccrouter.diamante.core.graph.event.GraphEvent graphEvent4 = new tccrouter.diamante.core.graph.event.GraphEvent(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj2 + "' != '" + 100.0d+ "'", obj2.equals(100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0d+ "'", obj3.equals(100.0d));

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }

    tccrouter.diamante.core.graph.event.GraphEvent graphEvent1 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)1L);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }

    tccrouter.diamante.core.graph.event.GraphEvent graphEvent1 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)10L);
    java.lang.Object obj2 = graphEvent1.getSource();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj2 + "' != '" + 10L+ "'", obj2.equals(10L));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }

    tccrouter.diamante.core.graph.event.GraphEvent graphEvent1 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)0);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }

    tccrouter.diamante.core.graph.event.GraphEvent graphEvent1 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)"");
    java.lang.Object obj2 = graphEvent1.getSource();
    java.lang.Object obj3 = graphEvent1.getSource();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj2 + "' != '" + ""+ "'", obj2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj3 + "' != '" + ""+ "'", obj3.equals(""));

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }

    tccrouter.diamante.core.graph.event.GraphEvent graphEvent1 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)100.0d);
    java.lang.String str2 = graphEvent1.toString();
    java.lang.String str3 = graphEvent1.toString();
    java.lang.String str4 = graphEvent1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=100.0]"+ "'", str2.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=100.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=100.0]"+ "'", str3.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=100.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=100.0]"+ "'", str4.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=100.0]"));

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }

    tccrouter.diamante.core.graph.event.GraphEvent graphEvent1 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)(byte)1);
    java.lang.String str2 = graphEvent1.toString();
    java.lang.Object obj3 = graphEvent1.getSource();
    java.lang.String str4 = graphEvent1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=1]"+ "'", str2.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (byte)1+ "'", obj3.equals((byte)1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=1]"+ "'", str4.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=1]"));

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }

    tccrouter.diamante.core.graph.event.GraphEvent graphEvent1 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)'a');
    java.lang.String str2 = graphEvent1.toString();
    tccrouter.diamante.core.graph.event.GraphEvent graphEvent3 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)graphEvent1);
    java.lang.Object obj4 = graphEvent1.getSource();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=a]"+ "'", str2.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=a]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a'+ "'", obj4.equals('a'));

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }

    tccrouter.diamante.core.graph.event.GraphEvent graphEvent1 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)100.0d);
    java.lang.String str2 = graphEvent1.toString();
    java.lang.String str3 = graphEvent1.toString();
    tccrouter.diamante.core.graph.event.GraphEvent graphEvent4 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)graphEvent1);
    tccrouter.diamante.core.graph.event.GraphEvent graphEvent5 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)graphEvent4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=100.0]"+ "'", str2.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=100.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=100.0]"+ "'", str3.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=100.0]"));

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }

    tccrouter.diamante.core.graph.event.GraphEvent graphEvent1 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)100.0d);
    java.lang.String str2 = graphEvent1.toString();
    java.lang.String str3 = graphEvent1.toString();
    tccrouter.diamante.core.graph.event.GraphEvent graphEvent4 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)graphEvent1);
    java.lang.Object obj5 = graphEvent4.getSource();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=100.0]"+ "'", str2.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=100.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=100.0]"+ "'", str3.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=100.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }

    tccrouter.diamante.core.graph.event.GraphEvent graphEvent1 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)0.0f);
    tccrouter.diamante.core.graph.event.GraphEvent graphEvent2 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)0.0f);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }

    tccrouter.diamante.core.graph.event.GraphEvent graphEvent1 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)100.0d);
    java.lang.String str2 = graphEvent1.toString();
    java.lang.String str3 = graphEvent1.toString();
    tccrouter.diamante.core.graph.event.GraphEvent graphEvent4 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)graphEvent1);
    java.lang.String str5 = graphEvent4.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=100.0]"+ "'", str2.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=100.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=100.0]"+ "'", str3.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=100.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=tccrouter.diamante.core.graph.event.GraphEvent[source=100.0]]"+ "'", str5.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=tccrouter.diamante.core.graph.event.GraphEvent[source=100.0]]"));

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }

    tccrouter.diamante.core.graph.event.GraphEvent graphEvent1 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)"");
    java.lang.String str2 = graphEvent1.toString();
    java.lang.Object obj3 = graphEvent1.getSource();
    java.lang.Object obj4 = graphEvent1.getSource();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=]"+ "'", str2.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj3 + "' != '" + ""+ "'", obj3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + ""+ "'", obj4.equals(""));

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }

    tccrouter.diamante.core.graph.event.GraphEvent graphEvent1 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)100.0d);
    java.lang.Object obj2 = graphEvent1.getSource();
    java.lang.Object obj3 = graphEvent1.getSource();
    java.lang.String str4 = graphEvent1.toString();
    tccrouter.diamante.core.graph.event.GraphEvent graphEvent5 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj2 + "' != '" + 100.0d+ "'", obj2.equals(100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0d+ "'", obj3.equals(100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=100.0]"+ "'", str4.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=100.0]"));

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }

    tccrouter.diamante.core.graph.event.GraphEvent graphEvent1 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)10.0f);
    java.lang.String str2 = graphEvent1.toString();
    java.lang.String str3 = graphEvent1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=10.0]"+ "'", str2.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=10.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=10.0]"+ "'", str3.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=10.0]"));

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }

    tccrouter.diamante.core.graph.event.GraphEvent graphEvent1 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)100.0d);
    java.lang.Object obj2 = graphEvent1.getSource();
    tccrouter.diamante.core.graph.event.GraphEvent graphEvent3 = new tccrouter.diamante.core.graph.event.GraphEvent(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj2 + "' != '" + 100.0d+ "'", obj2.equals(100.0d));

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }

    tccrouter.diamante.core.graph.event.GraphEvent graphEvent1 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)10.0f);
    java.lang.String str2 = graphEvent1.toString();
    java.lang.Object obj3 = graphEvent1.getSource();
    tccrouter.diamante.core.graph.event.GraphEvent graphEvent4 = new tccrouter.diamante.core.graph.event.GraphEvent(obj3);
    java.lang.Object obj5 = graphEvent4.getSource();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=10.0]"+ "'", str2.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=10.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 10.0f+ "'", obj3.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 10.0f+ "'", obj5.equals(10.0f));

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }

    tccrouter.diamante.core.graph.event.GraphEvent graphEvent1 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)'a');
    java.lang.String str2 = graphEvent1.toString();
    java.lang.Object obj3 = graphEvent1.getSource();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=a]"+ "'", str2.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=a]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 'a'+ "'", obj3.equals('a'));

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test23"); }

    tccrouter.diamante.core.graph.event.GraphEvent graphEvent1 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)1);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test24"); }

    tccrouter.diamante.core.graph.event.GraphEvent graphEvent1 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)10.0f);
    java.lang.String str2 = graphEvent1.toString();
    tccrouter.diamante.core.graph.event.GraphEvent graphEvent3 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=10.0]"+ "'", str2.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=10.0]"));

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test25"); }

    tccrouter.diamante.core.graph.event.GraphEvent graphEvent1 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)10L);
    java.lang.String str2 = graphEvent1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=10]"+ "'", str2.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=10]"));

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test26"); }

    tccrouter.diamante.core.graph.event.GraphEvent graphEvent1 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)'a');
    tccrouter.diamante.core.graph.event.GraphEvent graphEvent2 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)'a');

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test27"); }

    tccrouter.diamante.core.graph.event.GraphEvent graphEvent1 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)'a');
    java.lang.String str2 = graphEvent1.toString();
    java.lang.String str3 = graphEvent1.toString();
    java.lang.String str4 = graphEvent1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=a]"+ "'", str2.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=a]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=a]"+ "'", str3.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=a]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=a]"+ "'", str4.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=a]"));

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test28"); }

    tccrouter.diamante.core.graph.event.GraphEvent graphEvent1 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)0.0d);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test29"); }

    tccrouter.diamante.core.graph.event.GraphEvent graphEvent1 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)"tccrouter.diamante.core.graph.event.GraphEvent[source=]");
    java.lang.String str2 = graphEvent1.toString();
    java.lang.Object obj3 = graphEvent1.getSource();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=tccrouter.diamante.core.graph.event.GraphEvent[source=]]"+ "'", str2.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=tccrouter.diamante.core.graph.event.GraphEvent[source=]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=]"+ "'", obj3.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=]"));

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test30"); }

    tccrouter.diamante.core.graph.event.GraphEvent graphEvent1 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)100.0d);
    java.lang.String str2 = graphEvent1.toString();
    java.lang.Object obj3 = graphEvent1.getSource();
    java.lang.Object obj4 = graphEvent1.getSource();
    java.lang.String str5 = graphEvent1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=100.0]"+ "'", str2.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=100.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0d+ "'", obj3.equals(100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 100.0d+ "'", obj4.equals(100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=100.0]"+ "'", str5.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=100.0]"));

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test31"); }

    tccrouter.diamante.core.graph.event.GraphEvent graphEvent1 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)'a');
    java.lang.String str2 = graphEvent1.toString();
    tccrouter.diamante.core.graph.event.GraphEvent graphEvent3 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)graphEvent1);
    tccrouter.diamante.core.graph.event.GraphEvent graphEvent4 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)graphEvent3);
    java.lang.Object obj5 = graphEvent3.getSource();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=a]"+ "'", str2.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=a]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test32"); }

    tccrouter.diamante.core.graph.event.GraphEvent graphEvent1 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)10.0f);
    java.lang.String str2 = graphEvent1.toString();
    java.lang.Object obj3 = graphEvent1.getSource();
    java.lang.Object obj4 = graphEvent1.getSource();
    java.lang.Object obj5 = graphEvent1.getSource();
    java.lang.String str6 = graphEvent1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=10.0]"+ "'", str2.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=10.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 10.0f+ "'", obj3.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 10.0f+ "'", obj4.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 10.0f+ "'", obj5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=10.0]"+ "'", str6.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=10.0]"));

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test33"); }

    tccrouter.diamante.core.graph.event.GraphEvent graphEvent1 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)"");
    java.lang.Object obj2 = graphEvent1.getSource();
    java.lang.String str3 = graphEvent1.toString();
    java.lang.Object obj4 = graphEvent1.getSource();
    java.lang.Object obj5 = graphEvent1.getSource();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj2 + "' != '" + ""+ "'", obj2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=]"+ "'", str3.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + ""+ "'", obj4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + ""+ "'", obj5.equals(""));

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test34"); }

    tccrouter.diamante.core.graph.event.GraphEvent graphEvent1 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)(short)100);
    java.lang.String str2 = graphEvent1.toString();
    java.lang.Object obj3 = graphEvent1.getSource();
    java.lang.Object obj4 = graphEvent1.getSource();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=100]"+ "'", str2.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=100]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (short)100+ "'", obj3.equals((short)100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short)100+ "'", obj4.equals((short)100));

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test35"); }

    tccrouter.diamante.core.graph.event.GraphEvent graphEvent1 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)(-1));
    java.lang.Object obj2 = graphEvent1.getSource();
    tccrouter.diamante.core.graph.event.GraphEvent graphEvent3 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)graphEvent1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj2 + "' != '" + (-1)+ "'", obj2.equals((-1)));

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test36"); }

    tccrouter.diamante.core.graph.event.GraphEvent graphEvent1 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)"tccrouter.diamante.core.graph.event.GraphEvent[source=]");
    java.lang.String str2 = graphEvent1.toString();
    java.lang.String str3 = graphEvent1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=tccrouter.diamante.core.graph.event.GraphEvent[source=]]"+ "'", str2.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=tccrouter.diamante.core.graph.event.GraphEvent[source=]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=tccrouter.diamante.core.graph.event.GraphEvent[source=]]"+ "'", str3.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=tccrouter.diamante.core.graph.event.GraphEvent[source=]]"));

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test37"); }

    tccrouter.diamante.core.graph.event.GraphEvent graphEvent1 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)100.0d);
    java.lang.Object obj2 = graphEvent1.getSource();
    java.lang.Object obj3 = graphEvent1.getSource();
    java.lang.Object obj4 = graphEvent1.getSource();
    java.lang.Object obj5 = graphEvent1.getSource();
    java.lang.Object obj6 = graphEvent1.getSource();
    java.lang.String str7 = graphEvent1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj2 + "' != '" + 100.0d+ "'", obj2.equals(100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0d+ "'", obj3.equals(100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 100.0d+ "'", obj4.equals(100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0d+ "'", obj5.equals(100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100.0d+ "'", obj6.equals(100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=100.0]"+ "'", str7.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=100.0]"));

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test38"); }

    tccrouter.diamante.core.graph.event.GraphEvent graphEvent1 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)(byte)-1);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test39"); }

    tccrouter.diamante.core.graph.event.GraphEvent graphEvent1 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)100.0d);
    java.lang.String str2 = graphEvent1.toString();
    java.lang.String str3 = graphEvent1.toString();
    tccrouter.diamante.core.graph.event.GraphEvent graphEvent4 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)graphEvent1);
    java.lang.Object obj5 = graphEvent1.getSource();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=100.0]"+ "'", str2.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=100.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=100.0]"+ "'", str3.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=100.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0d+ "'", obj5.equals(100.0d));

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test40"); }

    tccrouter.diamante.core.graph.event.GraphEvent graphEvent1 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)0.0f);
    java.lang.Object obj2 = graphEvent1.getSource();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj2 + "' != '" + 0.0f+ "'", obj2.equals(0.0f));

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test41"); }

    tccrouter.diamante.core.graph.event.GraphEvent graphEvent1 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)100.0d);
    java.lang.String str2 = graphEvent1.toString();
    java.lang.Object obj3 = graphEvent1.getSource();
    java.lang.String str4 = graphEvent1.toString();
    java.lang.String str5 = graphEvent1.toString();
    tccrouter.diamante.core.graph.event.GraphEvent graphEvent6 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)graphEvent1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=100.0]"+ "'", str2.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=100.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0d+ "'", obj3.equals(100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=100.0]"+ "'", str4.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=100.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=100.0]"+ "'", str5.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=100.0]"));

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test42"); }

    tccrouter.diamante.core.graph.event.GraphEvent graphEvent1 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)"");
    java.lang.String str2 = graphEvent1.toString();
    tccrouter.diamante.core.graph.event.GraphEvent graphEvent3 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)str2);
    tccrouter.diamante.core.graph.event.GraphEvent graphEvent4 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)graphEvent3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=]"+ "'", str2.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=]"));

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test43"); }

    tccrouter.diamante.core.graph.event.GraphEvent graphEvent1 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)"");
    java.lang.Object obj2 = graphEvent1.getSource();
    java.lang.String str3 = graphEvent1.toString();
    java.lang.String str4 = graphEvent1.toString();
    java.lang.String str5 = graphEvent1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj2 + "' != '" + ""+ "'", obj2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=]"+ "'", str3.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=]"+ "'", str4.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=]"+ "'", str5.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=]"));

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test44"); }

    tccrouter.diamante.core.graph.event.GraphEvent graphEvent1 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)'a');
    java.lang.String str2 = graphEvent1.toString();
    tccrouter.diamante.core.graph.event.GraphEvent graphEvent3 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)graphEvent1);
    tccrouter.diamante.core.graph.event.GraphEvent graphEvent4 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)graphEvent1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=a]"+ "'", str2.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=a]"));

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test45"); }

    tccrouter.diamante.core.graph.event.GraphEvent graphEvent1 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)10L);
    tccrouter.diamante.core.graph.event.GraphEvent graphEvent2 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)graphEvent1);
    java.lang.String str3 = graphEvent2.toString();
    java.lang.String str4 = graphEvent2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=tccrouter.diamante.core.graph.event.GraphEvent[source=10]]"+ "'", str3.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=tccrouter.diamante.core.graph.event.GraphEvent[source=10]]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=tccrouter.diamante.core.graph.event.GraphEvent[source=10]]"+ "'", str4.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=tccrouter.diamante.core.graph.event.GraphEvent[source=10]]"));

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test46"); }

    tccrouter.diamante.core.graph.event.GraphEvent graphEvent1 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)0.0f);
    java.lang.String str2 = graphEvent1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=0.0]"+ "'", str2.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=0.0]"));

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test47"); }

    tccrouter.diamante.core.graph.event.GraphEvent graphEvent1 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)(byte)1);
    java.lang.String str2 = graphEvent1.toString();
    java.lang.Object obj3 = graphEvent1.getSource();
    tccrouter.diamante.core.graph.event.GraphEvent graphEvent4 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)graphEvent1);
    java.lang.String str5 = graphEvent1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=1]"+ "'", str2.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (byte)1+ "'", obj3.equals((byte)1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=1]"+ "'", str5.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=1]"));

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test48"); }

    tccrouter.diamante.core.graph.event.GraphEvent graphEvent1 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)'a');
    java.lang.String str2 = graphEvent1.toString();
    tccrouter.diamante.core.graph.event.GraphEvent graphEvent3 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)graphEvent1);
    tccrouter.diamante.core.graph.event.GraphEvent graphEvent4 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)graphEvent3);
    java.lang.String str5 = graphEvent4.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=a]"+ "'", str2.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=a]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=tccrouter.diamante.core.graph.event.GraphEvent[source=tccrouter.diamante.core.graph.event.GraphEvent[source=a]]]"+ "'", str5.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=tccrouter.diamante.core.graph.event.GraphEvent[source=tccrouter.diamante.core.graph.event.GraphEvent[source=a]]]"));

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test49"); }

    tccrouter.diamante.core.graph.event.GraphEvent graphEvent1 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)(byte)1);
    java.lang.Object obj2 = graphEvent1.getSource();
    java.lang.String str3 = graphEvent1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj2 + "' != '" + (byte)1+ "'", obj2.equals((byte)1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "tccrouter.diamante.core.graph.event.GraphEvent[source=1]"+ "'", str3.equals("tccrouter.diamante.core.graph.event.GraphEvent[source=1]"));

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test50"); }

    tccrouter.diamante.core.graph.event.GraphEvent graphEvent1 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)0.0f);
    tccrouter.diamante.core.graph.event.GraphEvent graphEvent2 = new tccrouter.diamante.core.graph.event.GraphEvent((java.lang.Object)graphEvent1);

  }

}