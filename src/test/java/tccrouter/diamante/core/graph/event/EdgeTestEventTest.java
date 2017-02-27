package tccrouter.diamante.core.graph.event;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@SuppressWarnings("unused")
public class EdgeTestEventTest {

  public static boolean debug = false;

  
  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test01"); }

    java.lang.Object obj0 = null;
    // The following exception was thrown during execution in test generation
    try {
    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent3 = new tccrouter.diamante.core.graph.event.EdgeTestEvent(obj0, 1, (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }

    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent3 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)(-1.0f), (int)'a', (int)'4');
    int i4 = edgeTestEvent3.getN2();
    int i5 = edgeTestEvent3.getN1();
    java.lang.String str6 = edgeTestEvent3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "tccrouter.diamante.core.graph.event.EdgeTestEvent[source=-1.0]"+ "'", str6.equals("tccrouter.diamante.core.graph.event.EdgeTestEvent[source=-1.0]"));

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }

    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent3 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)10.0d, (int)(byte)0, (int)(short)1);
    java.lang.Object obj4 = edgeTestEvent3.getSource();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 10.0d+ "'", obj4.equals(10.0d));

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }

    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent3 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)(-1.0f), (int)'a', (int)'4');
    int i4 = edgeTestEvent3.getN2();
    int i5 = edgeTestEvent3.getN1();
    int i6 = edgeTestEvent3.getN1();
    int i7 = edgeTestEvent3.getN1();
    java.lang.String str8 = edgeTestEvent3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "tccrouter.diamante.core.graph.event.EdgeTestEvent[source=-1.0]"+ "'", str8.equals("tccrouter.diamante.core.graph.event.EdgeTestEvent[source=-1.0]"));

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }

    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent3 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)(-1.0f), (int)'a', (int)'4');
    java.lang.Object obj4 = edgeTestEvent3.getSource();
    java.lang.String str5 = edgeTestEvent3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (-1.0f)+ "'", obj4.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "tccrouter.diamante.core.graph.event.EdgeTestEvent[source=-1.0]"+ "'", str5.equals("tccrouter.diamante.core.graph.event.EdgeTestEvent[source=-1.0]"));

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }

    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent3 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)10.0d, (int)(byte)0, (int)(short)1);
    java.lang.String str4 = edgeTestEvent3.toString();
    int i5 = edgeTestEvent3.getN2();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "tccrouter.diamante.core.graph.event.EdgeTestEvent[source=10.0]"+ "'", str4.equals("tccrouter.diamante.core.graph.event.EdgeTestEvent[source=10.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }

    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent3 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)(-1.0f), (int)'a', (int)'4');
    java.lang.Object obj4 = edgeTestEvent3.getSource();
    java.lang.Object obj5 = edgeTestEvent3.getSource();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (-1.0f)+ "'", obj4.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1.0f)+ "'", obj5.equals((-1.0f)));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }

    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent3 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)'#', (int)' ', 10);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }

    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent3 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)'4', (int)(byte)1, 52);
    java.lang.String str4 = edgeTestEvent3.toString();
    int i5 = edgeTestEvent3.getN2();
    java.lang.String str6 = edgeTestEvent3.toString();
    java.lang.Object obj7 = edgeTestEvent3.getSource();
    java.lang.Object obj8 = edgeTestEvent3.getSource();
    int i9 = edgeTestEvent3.getN1();
    int i10 = edgeTestEvent3.getN1();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"+ "'", str4.equals("tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"+ "'", str6.equals("tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + '4'+ "'", obj7.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '4'+ "'", obj8.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }

    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent3 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)'4', (int)(byte)1, 52);
    java.lang.String str4 = edgeTestEvent3.toString();
    int i5 = edgeTestEvent3.getN2();
    java.lang.String str6 = edgeTestEvent3.toString();
    java.lang.Object obj7 = edgeTestEvent3.getSource();
    java.lang.Object obj8 = edgeTestEvent3.getSource();
    int i9 = edgeTestEvent3.getN2();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"+ "'", str4.equals("tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"+ "'", str6.equals("tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + '4'+ "'", obj7.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '4'+ "'", obj8.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 52);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }

    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent3 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)(short)0, (int)'#', (int)(byte)100);
    java.lang.String str4 = edgeTestEvent3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "tccrouter.diamante.core.graph.event.EdgeTestEvent[source=0]"+ "'", str4.equals("tccrouter.diamante.core.graph.event.EdgeTestEvent[source=0]"));

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }

    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent3 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)100L, (int)(short)0, (int)(byte)1);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }

    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent3 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)'4', (int)(byte)1, 52);
    java.lang.String str4 = edgeTestEvent3.toString();
    int i5 = edgeTestEvent3.getN2();
    java.lang.String str6 = edgeTestEvent3.toString();
    int i7 = edgeTestEvent3.getN1();
    int i8 = edgeTestEvent3.getN2();
    int i9 = edgeTestEvent3.getN1();
    int i10 = edgeTestEvent3.getN2();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"+ "'", str4.equals("tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"+ "'", str6.equals("tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }

    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent3 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)"tccrouter.diamante.core.graph.event.EdgeTestEvent[source=10.0]", (int)(short)0, (int)(byte)-1);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }

    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent3 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)'4', (int)(byte)1, 52);
    java.lang.String str4 = edgeTestEvent3.toString();
    int i5 = edgeTestEvent3.getN2();
    java.lang.String str6 = edgeTestEvent3.toString();
    int i7 = edgeTestEvent3.getN1();
    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent10 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)edgeTestEvent3, 0, (int)(byte)-1);
    java.lang.Object obj11 = edgeTestEvent3.getSource();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"+ "'", str4.equals("tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"+ "'", str6.equals("tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj11 + "' != '" + '4'+ "'", obj11.equals('4'));

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }

    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent3 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)(-1.0f), (int)'a', (int)'4');
    int i4 = edgeTestEvent3.getN2();
    java.lang.Object obj5 = edgeTestEvent3.getSource();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1.0f)+ "'", obj5.equals((-1.0f)));

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }

    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent3 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)'4', (int)(byte)1, 52);
    java.lang.String str4 = edgeTestEvent3.toString();
    int i5 = edgeTestEvent3.getN2();
    java.lang.String str6 = edgeTestEvent3.toString();
    java.lang.String str7 = edgeTestEvent3.toString();
    java.lang.Object obj8 = edgeTestEvent3.getSource();
    int i9 = edgeTestEvent3.getN1();
    int i10 = edgeTestEvent3.getN2();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"+ "'", str4.equals("tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"+ "'", str6.equals("tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"+ "'", str7.equals("tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '4'+ "'", obj8.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }

    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent3 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)10.0d, (int)(byte)0, (int)(short)1);
    int i4 = edgeTestEvent3.getN1();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }

    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent3 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)'4', (int)(byte)1, 52);
    java.lang.String str4 = edgeTestEvent3.toString();
    int i5 = edgeTestEvent3.getN2();
    java.lang.String str6 = edgeTestEvent3.toString();
    java.lang.String str7 = edgeTestEvent3.toString();
    java.lang.Object obj8 = edgeTestEvent3.getSource();
    java.lang.String str9 = edgeTestEvent3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"+ "'", str4.equals("tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"+ "'", str6.equals("tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"+ "'", str7.equals("tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '4'+ "'", obj8.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"+ "'", str9.equals("tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"));

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }

    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent3 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)(byte)1, (int)(short)100, (int)(short)10);
    int i4 = edgeTestEvent3.getN1();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }

    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent3 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)'4', (int)(byte)1, 52);
    java.lang.Object obj4 = edgeTestEvent3.getSource();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + '4'+ "'", obj4.equals('4'));

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }

    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent3 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)(byte)1, (int)(short)100, (int)(short)10);
    java.lang.Object obj4 = edgeTestEvent3.getSource();
    int i5 = edgeTestEvent3.getN1();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (byte)1+ "'", obj4.equals((byte)1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test23"); }

    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent3 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)'4', (int)(byte)1, 52);
    java.lang.String str4 = edgeTestEvent3.toString();
    int i5 = edgeTestEvent3.getN2();
    java.lang.String str6 = edgeTestEvent3.toString();
    int i7 = edgeTestEvent3.getN1();
    int i8 = edgeTestEvent3.getN2();
    java.lang.Object obj9 = edgeTestEvent3.getSource();
    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent12 = new tccrouter.diamante.core.graph.event.EdgeTestEvent(obj9, 0, 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"+ "'", str4.equals("tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"+ "'", str6.equals("tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + '4'+ "'", obj9.equals('4'));

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test24"); }

    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent3 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)'4', (int)(byte)1, 52);
    java.lang.String str4 = edgeTestEvent3.toString();
    int i5 = edgeTestEvent3.getN2();
    java.lang.String str6 = edgeTestEvent3.toString();
    java.lang.Object obj7 = edgeTestEvent3.getSource();
    java.lang.String str8 = edgeTestEvent3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"+ "'", str4.equals("tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"+ "'", str6.equals("tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + '4'+ "'", obj7.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"+ "'", str8.equals("tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"));

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test25"); }

    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent3 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)100L, (int)'#', 10);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test26"); }

    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent3 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)0.0d, 0, (int)(byte)10);
    int i4 = edgeTestEvent3.getN2();
    int i5 = edgeTestEvent3.getN2();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test27"); }

    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent3 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)"tccrouter.diamante.core.graph.event.EdgeTestEvent[source=0]", (int)(byte)100, 52);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test28"); }

    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent3 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)'4', (int)(byte)1, 52);
    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent6 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)edgeTestEvent3, (int)(short)1, (int)(short)10);
    java.lang.String str7 = edgeTestEvent6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "tccrouter.diamante.core.graph.event.EdgeTestEvent[source=tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]]"+ "'", str7.equals("tccrouter.diamante.core.graph.event.EdgeTestEvent[source=tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]]"));

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test29"); }

    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent3 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)'4', (int)(byte)1, 52);
    java.lang.String str4 = edgeTestEvent3.toString();
    java.lang.Object obj5 = edgeTestEvent3.getSource();
    int i6 = edgeTestEvent3.getN1();
    int i7 = edgeTestEvent3.getN1();
    java.lang.String str8 = edgeTestEvent3.toString();
    int i9 = edgeTestEvent3.getN1();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"+ "'", str4.equals("tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + '4'+ "'", obj5.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"+ "'", str8.equals("tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test30"); }

    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent3 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)'4', (int)(byte)1, 52);
    java.lang.String str4 = edgeTestEvent3.toString();
    int i5 = edgeTestEvent3.getN2();
    java.lang.String str6 = edgeTestEvent3.toString();
    java.lang.Object obj7 = edgeTestEvent3.getSource();
    java.lang.Object obj8 = edgeTestEvent3.getSource();
    java.lang.Object obj9 = edgeTestEvent3.getSource();
    java.lang.String str10 = edgeTestEvent3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"+ "'", str4.equals("tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"+ "'", str6.equals("tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + '4'+ "'", obj7.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '4'+ "'", obj8.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + '4'+ "'", obj9.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"+ "'", str10.equals("tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"));

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test31"); }

    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent3 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)100, 0, (int)' ');

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test32"); }

    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent3 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)1.0f, 100, 1);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test33"); }

    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent3 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)false, (int)(byte)1, (int)(byte)10);
    int i4 = edgeTestEvent3.getN1();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test34"); }

    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent3 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)(-1.0f), (int)'a', (int)'4');
    int i4 = edgeTestEvent3.getN2();
    int i5 = edgeTestEvent3.getN1();
    int i6 = edgeTestEvent3.getN1();
    int i7 = edgeTestEvent3.getN1();
    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent10 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)i7, 0, 97);
    int i11 = edgeTestEvent10.getN2();
    java.lang.String str12 = edgeTestEvent10.toString();
    java.lang.Object obj13 = edgeTestEvent10.getSource();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "tccrouter.diamante.core.graph.event.EdgeTestEvent[source=97]"+ "'", str12.equals("tccrouter.diamante.core.graph.event.EdgeTestEvent[source=97]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 97+ "'", obj13.equals(97));

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test35"); }

    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent3 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)(-1.0f), (int)'a', (int)'4');
    java.lang.Object obj4 = edgeTestEvent3.getSource();
    int i5 = edgeTestEvent3.getN2();
    int i6 = edgeTestEvent3.getN2();
    int i7 = edgeTestEvent3.getN1();
    java.lang.Object obj8 = edgeTestEvent3.getSource();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (-1.0f)+ "'", obj4.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (-1.0f)+ "'", obj8.equals((-1.0f)));

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test36"); }

    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent3 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)'4', (int)(byte)1, 52);
    java.lang.String str4 = edgeTestEvent3.toString();
    int i5 = edgeTestEvent3.getN2();
    java.lang.String str6 = edgeTestEvent3.toString();
    java.lang.String str7 = edgeTestEvent3.toString();
    int i8 = edgeTestEvent3.getN2();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"+ "'", str4.equals("tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"+ "'", str6.equals("tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"+ "'", str7.equals("tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test37"); }

    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent3 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)'4', (int)(byte)1, 52);
    java.lang.String str4 = edgeTestEvent3.toString();
    java.lang.Object obj5 = edgeTestEvent3.getSource();
    java.lang.Object obj6 = edgeTestEvent3.getSource();
    java.lang.String str7 = edgeTestEvent3.toString();
    java.lang.String str8 = edgeTestEvent3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"+ "'", str4.equals("tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + '4'+ "'", obj5.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + '4'+ "'", obj6.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"+ "'", str7.equals("tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"+ "'", str8.equals("tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"));

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test38"); }

    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent3 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)(-1.0f), (int)'a', (int)'4');
    int i4 = edgeTestEvent3.getN2();
    int i5 = edgeTestEvent3.getN1();
    int i6 = edgeTestEvent3.getN1();
    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent9 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)edgeTestEvent3, (int)(short)1, (int)(byte)0);
    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent12 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)(byte)0, (int)(short)0, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test39"); }

    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent3 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)'4', (int)(byte)1, 52);
    java.lang.String str4 = edgeTestEvent3.toString();
    int i5 = edgeTestEvent3.getN2();
    java.lang.String str6 = edgeTestEvent3.toString();
    int i7 = edgeTestEvent3.getN1();
    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent10 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)edgeTestEvent3, 0, (int)(byte)-1);
    java.lang.String str11 = edgeTestEvent3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"+ "'", str4.equals("tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"+ "'", str6.equals("tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"+ "'", str11.equals("tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"));

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test40"); }

    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent3 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)'4', (int)(byte)1, 52);
    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent6 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)edgeTestEvent3, 52, 1);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test41"); }

    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent3 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)1L, (int)(byte)100, (int)(byte)-1);
    int i4 = edgeTestEvent3.getN1();
    java.lang.String str5 = edgeTestEvent3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "tccrouter.diamante.core.graph.event.EdgeTestEvent[source=1]"+ "'", str5.equals("tccrouter.diamante.core.graph.event.EdgeTestEvent[source=1]"));

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test42"); }

    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent3 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)(short)1, (int)(byte)100, (int)'a');
    int i4 = edgeTestEvent3.getN1();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test43"); }

    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent3 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)'4', (int)(byte)1, 52);
    java.lang.String str4 = edgeTestEvent3.toString();
    int i5 = edgeTestEvent3.getN2();
    java.lang.String str6 = edgeTestEvent3.toString();
    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent9 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)str6, (int)'#', (int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"+ "'", str4.equals("tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"+ "'", str6.equals("tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"));

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test44"); }

    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent3 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)(-1.0f), (int)'a', (int)'4');
    int i4 = edgeTestEvent3.getN2();
    int i5 = edgeTestEvent3.getN1();
    int i6 = edgeTestEvent3.getN1();
    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent9 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)edgeTestEvent3, (int)(short)1, (int)(byte)0);
    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent12 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)(short)1, 10, (int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test45"); }

    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent3 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)(-1.0f), (int)'a', (int)'4');
    int i4 = edgeTestEvent3.getN2();
    int i5 = edgeTestEvent3.getN1();
    int i6 = edgeTestEvent3.getN1();
    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent9 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)edgeTestEvent3, (int)(short)1, (int)(byte)0);
    java.lang.String str10 = edgeTestEvent3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tccrouter.diamante.core.graph.event.EdgeTestEvent[source=-1.0]"+ "'", str10.equals("tccrouter.diamante.core.graph.event.EdgeTestEvent[source=-1.0]"));

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test46"); }

    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent3 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)'4', (int)(byte)1, 52);
    java.lang.String str4 = edgeTestEvent3.toString();
    int i5 = edgeTestEvent3.getN2();
    java.lang.String str6 = edgeTestEvent3.toString();
    int i7 = edgeTestEvent3.getN1();
    int i8 = edgeTestEvent3.getN2();
    int i9 = edgeTestEvent3.getN1();
    java.lang.Object obj10 = edgeTestEvent3.getSource();
    int i11 = edgeTestEvent3.getN2();
    java.lang.String str12 = edgeTestEvent3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"+ "'", str4.equals("tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"+ "'", str6.equals("tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj10 + "' != '" + '4'+ "'", obj10.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"+ "'", str12.equals("tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"));

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test47"); }

    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent3 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)(-1.0f), (int)'a', (int)'4');
    java.lang.Object obj4 = edgeTestEvent3.getSource();
    int i5 = edgeTestEvent3.getN1();
    int i6 = edgeTestEvent3.getN1();
    int i7 = edgeTestEvent3.getN1();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (-1.0f)+ "'", obj4.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test48"); }

    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent3 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)false, (int)(byte)1, (int)(byte)10);
    java.lang.Object obj4 = edgeTestEvent3.getSource();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + false+ "'", obj4.equals(false));

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test49"); }

    tccrouter.diamante.core.graph.event.EdgeTestEvent edgeTestEvent3 = new tccrouter.diamante.core.graph.event.EdgeTestEvent((java.lang.Object)'4', (int)(byte)1, 52);
    java.lang.String str4 = edgeTestEvent3.toString();
    int i5 = edgeTestEvent3.getN2();
    java.lang.String str6 = edgeTestEvent3.toString();
    int i7 = edgeTestEvent3.getN1();
    java.lang.Object obj8 = edgeTestEvent3.getSource();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"+ "'", str4.equals("tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"+ "'", str6.equals("tccrouter.diamante.core.graph.event.EdgeTestEvent[source=4]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '4'+ "'", obj8.equals('4'));

  }

}