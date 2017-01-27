package tccrouter.diamante.core.graph;


import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EdgeTest {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge(1, (int)'#', componentProperties2);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties4 = edge3.getProperties();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties4);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge((int)(short)1, 52, componentProperties2);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge((int)(short)-1, (int)(byte)100, componentProperties2);
    edge3.setV1((int)(byte)1);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge((int)(byte)-1, (int)'4', componentProperties2);
    int i4 = edge3.getV2();
    int i5 = edge3.getV2();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 52);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge(100, (int)(byte)1, componentProperties2);
    int i4 = edge3.getV1();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties5 = null;
    edge3.setProperties(componentProperties5);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties7 = null;
    edge3.setProperties(componentProperties7);
    int i9 = edge3.getV2();
    edge3.setV1(1);
    edge3.setV2(1);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties14 = edge3.getProperties();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties15 = null;
    edge3.setProperties(componentProperties15);
    edge3.setV1((int)'4');
    edge3.setV1((int)(byte)1);
    edge3.setV1((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties14);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge((int)' ', (int)(short)10, componentProperties2);
    int i4 = edge3.getV1();
    edge3.setV1(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge((int)' ', (int)(byte)1, componentProperties2);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties4 = edge3.getProperties();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties5 = edge3.getProperties();
    int i6 = edge3.getV1();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties7 = edge3.getProperties();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties7);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge((int)' ', (int)(short)-1, componentProperties2);
    int i4 = edge3.getV1();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge(100, (int)(byte)1, componentProperties2);
    int i4 = edge3.getV1();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties5 = null;
    edge3.setProperties(componentProperties5);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties7 = null;
    edge3.setProperties(componentProperties7);
    int i9 = edge3.getV2();
    edge3.setV1(1);
    edge3.setV2((int)(short)0);
    int i14 = edge3.getV2();
    edge3.setV2((int)(byte)100);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties17 = null;
    edge3.setProperties(componentProperties17);
    edge3.setV2(0);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties21 = edge3.getProperties();
    int i22 = edge3.getV2();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge((int)(short)0, (int)(short)1, componentProperties2);
    int i4 = edge3.getV1();
    int i5 = edge3.getV1();
    edge3.setV1(52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge(100, (int)(byte)1, componentProperties2);
    int i4 = edge3.getV1();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties5 = null;
    edge3.setProperties(componentProperties5);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties7 = null;
    edge3.setProperties(componentProperties7);
    int i9 = edge3.getV2();
    edge3.setV1(1);
    edge3.setV2(1);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties14 = edge3.getProperties();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties15 = null;
    edge3.setProperties(componentProperties15);
    int i17 = edge3.getV1();
    int i18 = edge3.getV2();
    int i19 = edge3.getV1();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties20 = null;
    edge3.setProperties(componentProperties20);
    edge3.setV1((int)' ');
    edge3.setV2(97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge((int)(short)1, (int)(byte)-1, componentProperties2);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties4 = edge3.getProperties();
    int i5 = edge3.getV1();
    int i6 = edge3.getV1();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties7 = null;
    edge3.setProperties(componentProperties7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge(32, (int)(short)0, componentProperties2);
    edge3.setV2(97);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties6 = edge3.getProperties();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties7 = null;
    edge3.setProperties(componentProperties7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties6);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge(32, (int)(short)0, componentProperties2);
    edge3.setV2(97);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties6 = null;
    edge3.setProperties(componentProperties6);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge((int)(short)100, (int)(short)0, componentProperties2);
    int i4 = edge3.getV2();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties5 = null;
    edge3.setProperties(componentProperties5);
    int i7 = edge3.getV2();
    edge3.setV1(0);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties10 = null;
    edge3.setProperties(componentProperties10);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties12 = null;
    edge3.setProperties(componentProperties12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge(100, (int)(byte)1, componentProperties2);
    int i4 = edge3.getV1();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties5 = null;
    edge3.setProperties(componentProperties5);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties7 = null;
    edge3.setProperties(componentProperties7);
    int i9 = edge3.getV2();
    edge3.setV1(1);
    edge3.setV2(1);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties14 = edge3.getProperties();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties15 = null;
    edge3.setProperties(componentProperties15);
    edge3.setV1((int)'4');
    edge3.setV1((int)(byte)1);
    int i21 = edge3.getV1();
    int i22 = edge3.getV2();
    edge3.setV1((int)(byte)-1);
    int i25 = edge3.getV2();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge((int)(short)-1, (int)'4', componentProperties2);
    edge3.setV2((int)(short)1);
    edge3.setV1((int)(short)100);
    edge3.setV2(100);
    edge3.setV1(0);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge(100, (int)(byte)1, componentProperties2);
    int i4 = edge3.getV1();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties5 = null;
    edge3.setProperties(componentProperties5);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties7 = null;
    edge3.setProperties(componentProperties7);
    int i9 = edge3.getV2();
    int i10 = edge3.getV1();
    int i11 = edge3.getV1();
    edge3.setV2((int)' ');
    int i14 = edge3.getV1();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties15 = null;
    edge3.setProperties(componentProperties15);
    edge3.setV2((int)(byte)0);
    int i19 = edge3.getV2();
    edge3.setV1((int)'a');
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties22 = null;
    edge3.setProperties(componentProperties22);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties24 = edge3.getProperties();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties24);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge(100, (int)(byte)1, componentProperties2);
    int i4 = edge3.getV1();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties5 = null;
    edge3.setProperties(componentProperties5);
    edge3.setV2((int)(byte)100);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties9 = null;
    edge3.setProperties(componentProperties9);
    edge3.setV2((-1));
    int i13 = edge3.getV1();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties14 = null;
    edge3.setProperties(componentProperties14);
    int i16 = edge3.getV2();
    edge3.setV1((int)(byte)-1);
    int i19 = edge3.getV1();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-1));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge(1, (int)(short)100, componentProperties2);
    edge3.setV1((int)(byte)0);
    edge3.setV2((int)(byte)100);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge(100, (int)(byte)1, componentProperties2);
    int i4 = edge3.getV1();
    edge3.setV1((int)(short)-1);
    edge3.setV1(0);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties9 = null;
    edge3.setProperties(componentProperties9);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties11 = null;
    edge3.setProperties(componentProperties11);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties13 = null;
    edge3.setProperties(componentProperties13);
    edge3.setV1((int)(byte)-1);
    edge3.setV2(0);
    int i19 = edge3.getV2();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties20 = null;
    edge3.setProperties(componentProperties20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge((int)(short)-1, (int)(byte)10, componentProperties2);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties4 = edge3.getProperties();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties4);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge((int)' ', (int)(byte)1, componentProperties2);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties4 = edge3.getProperties();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties5 = edge3.getProperties();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties6 = null;
    edge3.setProperties(componentProperties6);
    edge3.setV2(1);
    edge3.setV2((int)'a');
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties12 = edge3.getProperties();
    edge3.setV2((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties12);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge((int)'a', (int)(byte)0, componentProperties2);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge(100, (int)(byte)1, componentProperties2);
    int i4 = edge3.getV1();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties5 = null;
    edge3.setProperties(componentProperties5);
    edge3.setV2((int)(byte)100);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties9 = edge3.getProperties();
    int i10 = edge3.getV1();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties11 = null;
    edge3.setProperties(componentProperties11);
    edge3.setV2(100);
    edge3.setV1(10);
    int i17 = edge3.getV1();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 10);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge(100, (int)(byte)1, componentProperties2);
    edge3.setV1((int)(byte)10);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties6 = edge3.getProperties();
    int i7 = edge3.getV1();
    int i8 = edge3.getV1();
    int i9 = edge3.getV1();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge(100, (int)(byte)1, componentProperties2);
    int i4 = edge3.getV1();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties5 = null;
    edge3.setProperties(componentProperties5);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties7 = null;
    edge3.setProperties(componentProperties7);
    int i9 = edge3.getV2();
    edge3.setV1(1);
    edge3.setV2(1);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties14 = edge3.getProperties();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties15 = null;
    edge3.setProperties(componentProperties15);
    int i17 = edge3.getV1();
    int i18 = edge3.getV1();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties19 = edge3.getProperties();
    edge3.setV2((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties19);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge((int)(byte)10, (int)(short)10, componentProperties2);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties4 = null;
    edge3.setProperties(componentProperties4);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties6 = null;
    edge3.setProperties(componentProperties6);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge(0, (int)(short)1, componentProperties2);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties4 = edge3.getProperties();
    edge3.setV1(52);
    int i7 = edge3.getV1();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties8 = edge3.getProperties();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties8);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge((int)(short)100, (int)(byte)-1, componentProperties2);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties4 = edge3.getProperties();
    int i5 = edge3.getV1();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge(100, (int)(byte)1, componentProperties2);
    int i4 = edge3.getV1();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties5 = null;
    edge3.setProperties(componentProperties5);
    edge3.setV2((int)(byte)-1);
    edge3.setV1((int)(byte)100);
    edge3.setV1((int)(byte)1);
    edge3.setV1(52);
    edge3.setV1((int)(short)0);
    edge3.setV1(32);
    int i19 = edge3.getV1();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 32);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge(0, (int)' ', componentProperties2);
    edge3.setV1((int)(short)1);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties6 = edge3.getProperties();
    int i7 = edge3.getV1();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge((int)(byte)100, 100, componentProperties2);
    int i4 = edge3.getV1();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge(100, (int)(byte)1, componentProperties2);
    int i4 = edge3.getV1();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties5 = null;
    edge3.setProperties(componentProperties5);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties7 = null;
    edge3.setProperties(componentProperties7);
    int i9 = edge3.getV2();
    edge3.setV1(1);
    edge3.setV2(1);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties14 = edge3.getProperties();
    edge3.setV2(10);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties17 = edge3.getProperties();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties18 = null;
    edge3.setProperties(componentProperties18);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties20 = edge3.getProperties();
    int i21 = edge3.getV1();
    int i22 = edge3.getV1();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties23 = null;
    edge3.setProperties(componentProperties23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge(100, (int)(byte)1, componentProperties2);
    int i4 = edge3.getV1();
    edge3.setV1((int)(short)-1);
    edge3.setV1(0);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties9 = null;
    edge3.setProperties(componentProperties9);
    int i11 = edge3.getV2();
    edge3.setV1((int)' ');
    edge3.setV1(52);
    edge3.setV1((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge((int)(byte)100, (int)(byte)1, componentProperties2);
    edge3.setV1((int)(short)100);
    edge3.setV1((int)(byte)100);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge(100, (int)(byte)1, componentProperties2);
    int i4 = edge3.getV1();
    edge3.setV1((int)(byte)10);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties7 = null;
    edge3.setProperties(componentProperties7);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties9 = edge3.getProperties();
    edge3.setV1(0);
    edge3.setV1(0);
    edge3.setV2((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties9);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge(100, (int)(byte)100, componentProperties2);
    int i4 = edge3.getV2();
    edge3.setV2(35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge(100, (int)(byte)1, componentProperties2);
    int i4 = edge3.getV1();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties5 = null;
    edge3.setProperties(componentProperties5);
    edge3.setV2((int)(byte)100);
    int i9 = edge3.getV2();
    edge3.setV2((int)'a');
    int i12 = edge3.getV1();
    edge3.setV1(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge(97, (int)(byte)0, componentProperties2);
    int i4 = edge3.getV1();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties5 = null;
    edge3.setProperties(componentProperties5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge((int)(short)10, (int)(byte)10, componentProperties2);
    int i4 = edge3.getV2();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties5 = null;
    edge3.setProperties(componentProperties5);
    int i7 = edge3.getV2();
    int i8 = edge3.getV1();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge(100, (int)(byte)0, componentProperties2);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties4 = null;
    edge3.setProperties(componentProperties4);
    int i6 = edge3.getV2();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties7 = null;
    edge3.setProperties(componentProperties7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge(100, (int)(byte)1, componentProperties2);
    int i4 = edge3.getV1();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties5 = null;
    edge3.setProperties(componentProperties5);
    edge3.setV2((int)(byte)100);
    edge3.setV2(32);
    int i11 = edge3.getV1();
    int i12 = edge3.getV2();
    edge3.setV1((int)'#');
    int i15 = edge3.getV1();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties16 = null;
    edge3.setProperties(componentProperties16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 35);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge((int)' ', (int)(byte)1, componentProperties2);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties4 = edge3.getProperties();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties5 = edge3.getProperties();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties6 = null;
    edge3.setProperties(componentProperties6);
    edge3.setV2((int)(byte)1);
    edge3.setV2(32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties5);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge((int)(short)-1, 0, componentProperties2);
    int i4 = edge3.getV1();
    edge3.setV2((int)(byte)1);
    edge3.setV2(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge(100, (int)(byte)1, componentProperties2);
    int i4 = edge3.getV1();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties5 = null;
    edge3.setProperties(componentProperties5);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties7 = null;
    edge3.setProperties(componentProperties7);
    int i9 = edge3.getV2();
    int i10 = edge3.getV2();
    int i11 = edge3.getV1();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties12 = null;
    edge3.setProperties(componentProperties12);
    int i14 = edge3.getV2();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge(100, (int)(byte)1, componentProperties2);
    int i4 = edge3.getV1();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties5 = null;
    edge3.setProperties(componentProperties5);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties7 = null;
    edge3.setProperties(componentProperties7);
    int i9 = edge3.getV2();
    edge3.setV1(1);
    edge3.setV2(1);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties14 = edge3.getProperties();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties15 = null;
    edge3.setProperties(componentProperties15);
    int i17 = edge3.getV1();
    edge3.setV2(52);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties20 = null;
    edge3.setProperties(componentProperties20);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties22 = null;
    edge3.setProperties(componentProperties22);
    int i24 = edge3.getV2();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 52);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge(100, (int)(byte)1, componentProperties2);
    int i4 = edge3.getV1();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties5 = null;
    edge3.setProperties(componentProperties5);
    edge3.setV2((int)(byte)-1);
    edge3.setV1((int)(byte)100);
    edge3.setV1((int)(byte)1);
    edge3.setV1(52);
    edge3.setV1((int)' ');
    int i17 = edge3.getV2();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties18 = edge3.getProperties();
    int i19 = edge3.getV2();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties20 = null;
    edge3.setProperties(componentProperties20);
    int i22 = edge3.getV1();
    edge3.setV2((int)(short)100);
    edge3.setV2((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 32);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge((int)(byte)-1, (int)'4', componentProperties2);
    int i4 = edge3.getV2();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties5 = null;
    edge3.setProperties(componentProperties5);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties7 = edge3.getProperties();
    edge3.setV2(0);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties10 = edge3.getProperties();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties11 = null;
    edge3.setProperties(componentProperties11);
    int i13 = edge3.getV2();
    edge3.setV2(32);
    int i16 = edge3.getV1();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge((int)'4', 52, componentProperties2);
    edge3.setV2((int)(byte)1);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge(100, (int)(byte)1, componentProperties2);
    int i4 = edge3.getV1();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties5 = null;
    edge3.setProperties(componentProperties5);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties7 = null;
    edge3.setProperties(componentProperties7);
    int i9 = edge3.getV2();
    edge3.setV1(1);
    edge3.setV2(1);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties14 = edge3.getProperties();
    edge3.setV2(10);
    int i17 = edge3.getV2();
    int i18 = edge3.getV1();
    edge3.setV1((int)(short)-1);
    edge3.setV2(10);
    int i23 = edge3.getV1();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == (-1));

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge(100, (int)(byte)1, componentProperties2);
    int i4 = edge3.getV1();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties5 = null;
    edge3.setProperties(componentProperties5);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties7 = null;
    edge3.setProperties(componentProperties7);
    int i9 = edge3.getV2();
    edge3.setV1(1);
    edge3.setV2((int)(short)0);
    int i14 = edge3.getV2();
    edge3.setV2((int)(byte)100);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties17 = null;
    edge3.setProperties(componentProperties17);
    edge3.setV2(0);
    edge3.setV2((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge(100, (int)(byte)1, componentProperties2);
    int i4 = edge3.getV1();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties5 = null;
    edge3.setProperties(componentProperties5);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties7 = null;
    edge3.setProperties(componentProperties7);
    int i9 = edge3.getV2();
    edge3.setV1(1);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties12 = null;
    edge3.setProperties(componentProperties12);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties14 = edge3.getProperties();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties15 = null;
    edge3.setProperties(componentProperties15);
    int i17 = edge3.getV1();
    edge3.setV1((int)(byte)0);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties20 = edge3.getProperties();
    edge3.setV1(10);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties23 = null;
    edge3.setProperties(componentProperties23);
    int i25 = edge3.getV2();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge(100, (int)(byte)1, componentProperties2);
    int i4 = edge3.getV1();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties5 = null;
    edge3.setProperties(componentProperties5);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties7 = null;
    edge3.setProperties(componentProperties7);
    int i9 = edge3.getV2();
    edge3.setV1(1);
    edge3.setV2(1);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties14 = edge3.getProperties();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties15 = null;
    edge3.setProperties(componentProperties15);
    int i17 = edge3.getV1();
    int i18 = edge3.getV2();
    int i19 = edge3.getV1();
    int i20 = edge3.getV2();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties21 = null;
    edge3.setProperties(componentProperties21);
    edge3.setV1((-1));
    edge3.setV2((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge((int)(short)10, (int)(byte)10, componentProperties2);
    edge3.setV2((int)' ');
    int i6 = edge3.getV1();
    int i7 = edge3.getV2();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 32);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge(100, (int)(byte)1, componentProperties2);
    int i4 = edge3.getV1();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties5 = null;
    edge3.setProperties(componentProperties5);
    edge3.setV2((int)(byte)100);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties9 = null;
    edge3.setProperties(componentProperties9);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties11 = edge3.getProperties();
    int i12 = edge3.getV1();
    edge3.setV2((int)(byte)1);
    edge3.setV1((int)(short)0);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties17 = edge3.getProperties();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties18 = null;
    edge3.setProperties(componentProperties18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties17);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge(100, (int)(byte)1, componentProperties2);
    int i4 = edge3.getV1();
    edge3.setV1((int)(byte)10);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties7 = null;
    edge3.setProperties(componentProperties7);
    edge3.setV2(97);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties11 = edge3.getProperties();
    edge3.setV1(52);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties14 = null;
    edge3.setProperties(componentProperties14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties11);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge((int)(short)100, (int)(byte)10, componentProperties2);
    edge3.setV1((int)(byte)10);
    int i6 = edge3.getV2();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties7 = edge3.getProperties();
    int i8 = edge3.getV2();
    edge3.setV1((int)'4');
    edge3.setV2((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge(100, (int)(byte)1, componentProperties2);
    int i4 = edge3.getV1();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties5 = null;
    edge3.setProperties(componentProperties5);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties7 = null;
    edge3.setProperties(componentProperties7);
    int i9 = edge3.getV2();
    edge3.setV1(1);
    edge3.setV2(1);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties14 = edge3.getProperties();
    edge3.setV2(10);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties17 = edge3.getProperties();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties18 = null;
    edge3.setProperties(componentProperties18);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties20 = edge3.getProperties();
    int i21 = edge3.getV1();
    int i22 = edge3.getV1();
    int i23 = edge3.getV1();
    int i24 = edge3.getV2();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties25 = null;
    edge3.setProperties(componentProperties25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 10);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge(100, (int)(byte)1, componentProperties2);
    int i4 = edge3.getV1();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties5 = null;
    edge3.setProperties(componentProperties5);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties7 = null;
    edge3.setProperties(componentProperties7);
    int i9 = edge3.getV2();
    int i10 = edge3.getV1();
    int i11 = edge3.getV1();
    edge3.setV2((int)' ');
    int i14 = edge3.getV1();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties15 = null;
    edge3.setProperties(componentProperties15);
    edge3.setV2((int)(byte)0);
    edge3.setV2(0);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties21 = edge3.getProperties();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties21);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge((int)(byte)-1, (int)'4', componentProperties2);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties4 = null;
    edge3.setProperties(componentProperties4);
    edge3.setV2(1);
    edge3.setV1((int)'a');
    edge3.setV1((int)(short)100);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties12 = null;
    edge3.setProperties(componentProperties12);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge(100, (int)(byte)1, componentProperties2);
    int i4 = edge3.getV1();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties5 = null;
    edge3.setProperties(componentProperties5);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties7 = null;
    edge3.setProperties(componentProperties7);
    int i9 = edge3.getV2();
    edge3.setV1(1);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties12 = edge3.getProperties();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties13 = null;
    edge3.setProperties(componentProperties13);
    int i15 = edge3.getV1();
    int i16 = edge3.getV2();
    int i17 = edge3.getV1();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties18 = edge3.getProperties();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties18);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge((int)(short)100, (int)(short)0, componentProperties2);
    int i4 = edge3.getV1();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties5 = null;
    edge3.setProperties(componentProperties5);
    int i7 = edge3.getV2();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge(100, (int)(byte)1, componentProperties2);
    int i4 = edge3.getV1();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties5 = null;
    edge3.setProperties(componentProperties5);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties7 = null;
    edge3.setProperties(componentProperties7);
    int i9 = edge3.getV2();
    int i10 = edge3.getV1();
    edge3.setV2((int)(byte)10);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties13 = null;
    edge3.setProperties(componentProperties13);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties15 = edge3.getProperties();
    edge3.setV2(32);
    edge3.setV2(0);
    edge3.setV2((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties15);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge((int)(short)-1, (int)'4', componentProperties2);
    edge3.setV2((int)(short)1);
    edge3.setV1((int)(short)100);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties8 = edge3.getProperties();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties9 = edge3.getProperties();
    int i10 = edge3.getV1();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge((int)(byte)-1, (int)'4', componentProperties2);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties4 = null;
    edge3.setProperties(componentProperties4);
    edge3.setV2(1);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties8 = edge3.getProperties();
    edge3.setV1(52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties8);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge((int)(byte)100, (int)'4', componentProperties2);
    edge3.setV2((int)'4');
    edge3.setV1((int)(short)100);
    edge3.setV1((int)'4');
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties10 = null;
    edge3.setProperties(componentProperties10);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge(97, 10, componentProperties2);
    edge3.setV2(35);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge((int)(short)1, (int)(byte)-1, componentProperties2);
    int i4 = edge3.getV1();
    int i5 = edge3.getV2();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties6 = edge3.getProperties();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties7 = null;
    edge3.setProperties(componentProperties7);
    int i9 = edge3.getV1();
    edge3.setV2((int)(byte)100);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties12 = null;
    edge3.setProperties(componentProperties12);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties14 = edge3.getProperties();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties14);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge((int)(short)100, (int)(short)100, componentProperties2);
    edge3.setV1((int)' ');
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties6 = null;
    edge3.setProperties(componentProperties6);
    edge3.setV1((int)(byte)10);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge(100, (int)(byte)1, componentProperties2);
    int i4 = edge3.getV1();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties5 = null;
    edge3.setProperties(componentProperties5);
    edge3.setV2((int)(byte)-1);
    edge3.setV1((int)(byte)100);
    edge3.setV1((int)(short)100);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties13 = edge3.getProperties();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties13);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge(0, (int)(short)1, componentProperties2);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties4 = null;
    edge3.setProperties(componentProperties4);
    int i6 = edge3.getV2();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties7 = edge3.getProperties();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties8 = null;
    edge3.setProperties(componentProperties8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties7);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge((int)'#', (int)(byte)1, componentProperties2);
    edge3.setV2((int)(byte)10);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge((int)'#', 0, componentProperties2);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties4 = null;
    edge3.setProperties(componentProperties4);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties6 = edge3.getProperties();
    edge3.setV1(35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties6);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge(0, (-1), componentProperties2);
    edge3.setV1((int)(byte)-1);
    edge3.setV2((int)(byte)100);
    edge3.setV2((int)(byte)0);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties10 = null;
    edge3.setProperties(componentProperties10);
    int i12 = edge3.getV2();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties13 = edge3.getProperties();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties13);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge(100, (int)(byte)1, componentProperties2);
    int i4 = edge3.getV1();
    edge3.setV1((int)(byte)10);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties7 = null;
    edge3.setProperties(componentProperties7);
    int i9 = edge3.getV2();
    int i10 = edge3.getV2();
    edge3.setV1((int)(short)100);
    int i13 = edge3.getV1();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge((int)(short)0, (int)(byte)100, componentProperties2);
    int i4 = edge3.getV2();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties5 = null;
    edge3.setProperties(componentProperties5);
    int i7 = edge3.getV2();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties8 = edge3.getProperties();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties8);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge((int)(short)100, (int)(short)0, componentProperties2);
    int i4 = edge3.getV2();
    edge3.setV2(35);
    int i7 = edge3.getV1();
    int i8 = edge3.getV2();
    edge3.setV2(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 35);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge(97, (int)'#', componentProperties2);
    int i4 = edge3.getV2();
    int i5 = edge3.getV2();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 35);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge((int)(short)0, (int)(byte)100, componentProperties2);
    edge3.setV1((int)(byte)-1);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties6 = null;
    edge3.setProperties(componentProperties6);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge(10, (int)'a', componentProperties2);
    edge3.setV1((int)(short)-1);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties6 = edge3.getProperties();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties6);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge((int)(short)1, (int)(short)-1, componentProperties2);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties4 = null;
    edge3.setProperties(componentProperties4);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge(0, (int)(short)100, componentProperties2);
    int i4 = edge3.getV2();
    int i5 = edge3.getV2();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties6 = edge3.getProperties();
    int i7 = edge3.getV2();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge((int)(short)1, (int)(byte)-1, componentProperties2);
    int i4 = edge3.getV1();
    int i5 = edge3.getV1();
    edge3.setV1((int)(short)-1);
    edge3.setV1((int)(byte)1);
    int i10 = edge3.getV1();
    int i11 = edge3.getV2();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge(0, (-1), componentProperties2);
    edge3.setV1((int)(byte)-1);
    edge3.setV2((int)(byte)100);
    edge3.setV2((int)(byte)0);
    int i10 = edge3.getV2();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge((int)(byte)10, 52, componentProperties2);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge((int)(short)1, (int)(byte)-1, componentProperties2);
    int i4 = edge3.getV1();
    int i5 = edge3.getV1();
    edge3.setV1((int)(short)-1);
    edge3.setV1((int)(byte)1);
    edge3.setV2((int)(byte)-1);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties12 = null;
    edge3.setProperties(componentProperties12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge((int)(short)0, (int)(short)-1, componentProperties2);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties4 = null;
    edge3.setProperties(componentProperties4);
    int i6 = edge3.getV1();
    edge3.setV1((int)'#');
    int i9 = edge3.getV2();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge(100, (int)(byte)1, componentProperties2);
    int i4 = edge3.getV1();
    edge3.setV1(0);
    edge3.setV2((-1));
    int i9 = edge3.getV2();
    int i10 = edge3.getV1();
    edge3.setV1((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge((int)(short)1, (int)(byte)-1, componentProperties2);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties4 = edge3.getProperties();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties5 = null;
    edge3.setProperties(componentProperties5);
    edge3.setV1(1);
    edge3.setV2((int)(short)0);
    edge3.setV2(10);
    int i13 = edge3.getV1();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties14 = edge3.getProperties();
    int i15 = edge3.getV1();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge(100, (int)(byte)1, componentProperties2);
    int i4 = edge3.getV1();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties5 = null;
    edge3.setProperties(componentProperties5);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties7 = null;
    edge3.setProperties(componentProperties7);
    int i9 = edge3.getV2();
    edge3.setV1(1);
    edge3.setV2(1);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties14 = edge3.getProperties();
    edge3.setV1((int)(short)-1);
    edge3.setV1((int)(short)-1);
    int i19 = edge3.getV2();
    edge3.setV1((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge(100, (int)(byte)1, componentProperties2);
    int i4 = edge3.getV1();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties5 = null;
    edge3.setProperties(componentProperties5);
    int i7 = edge3.getV1();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties8 = edge3.getProperties();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties9 = null;
    edge3.setProperties(componentProperties9);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties11 = edge3.getProperties();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties11);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge(100, (int)(byte)1, componentProperties2);
    int i4 = edge3.getV1();
    edge3.setV1((int)(short)-1);
    edge3.setV1(0);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties9 = null;
    edge3.setProperties(componentProperties9);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties11 = edge3.getProperties();
    int i12 = edge3.getV2();
    edge3.setV1(32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge((int)(short)0, (int)(byte)100, componentProperties2);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties4 = null;
    edge3.setProperties(componentProperties4);
    int i6 = edge3.getV2();
    int i7 = edge3.getV2();
    edge3.setV2((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge((int)(short)1, (int)'#', componentProperties2);
    edge3.setV1((int)(byte)100);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge((-1), (int)(short)100, componentProperties2);
    edge3.setV2((int)(byte)-1);
    edge3.setV1((int)(short)1);
    int i8 = edge3.getV2();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge(100, (int)(byte)1, componentProperties2);
    int i4 = edge3.getV1();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties5 = null;
    edge3.setProperties(componentProperties5);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties7 = null;
    edge3.setProperties(componentProperties7);
    int i9 = edge3.getV2();
    edge3.setV1(1);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties12 = null;
    edge3.setProperties(componentProperties12);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties14 = edge3.getProperties();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties15 = null;
    edge3.setProperties(componentProperties15);
    int i17 = edge3.getV1();
    int i18 = edge3.getV2();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties19 = edge3.getProperties();
    edge3.setV1((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties19);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge(100, (int)(byte)1, componentProperties2);
    int i4 = edge3.getV1();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties5 = null;
    edge3.setProperties(componentProperties5);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties7 = null;
    edge3.setProperties(componentProperties7);
    int i9 = edge3.getV2();
    int i10 = edge3.getV1();
    edge3.setV2((int)(byte)10);
    edge3.setV2(100);
    int i15 = edge3.getV1();
    edge3.setV1((int)(short)-1);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties18 = edge3.getProperties();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties19 = edge3.getProperties();
    edge3.setV1((int)(byte)0);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties22 = null;
    edge3.setProperties(componentProperties22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties19);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge((int)(short)-1, (int)'4', componentProperties2);
    edge3.setV2((int)(short)1);
    edge3.setV1((int)(short)100);
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties8 = edge3.getProperties();
    edge3.setV1((int)(byte)10);
    int i11 = edge3.getV2();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }

    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties2 = null;
    tccrouter.diamante.core.graph.Edge edge3 = new tccrouter.diamante.core.graph.Edge(10, 1, componentProperties2);
    int i4 = edge3.getV1();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties5 = edge3.getProperties();
    tccrouter.diamante.core.graph.property.ComponentProperties componentProperties6 = edge3.getProperties();
    edge3.setV1(100);
    int i9 = edge3.getV2();
    int i10 = edge3.getV2();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentProperties6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }


}