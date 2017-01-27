package tccrouter.user.factories;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BipartiteGraphFactoryTest {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test01"); }

    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory0 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.util.Vector vector1 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector1);
    java.lang.String str3 = bipartiteGraphFactory0.toString();
    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory4 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.util.Vector vector5 = null;
    bipartiteGraphFactory4.setSupportedLayouts(vector5);
    java.util.HashMap hashMap7 = bipartiteGraphFactory4.getNeededProperties();
    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory8 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.util.Vector vector9 = null;
    bipartiteGraphFactory8.setSupportedLayouts(vector9);
    java.util.HashMap hashMap11 = bipartiteGraphFactory8.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph12 = bipartiteGraphFactory4.createGraph(hashMap11);
    tccrouter.diamante.core.graph.Graph graph13 = bipartiteGraphFactory0.createGraph(hashMap11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Bipartite graph"+ "'", str3.equals("Bipartite graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph13);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }

    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory0 = new tccrouter.user.factories.BipartiteGraphFactory();
    int i1 = bipartiteGraphFactory0.getM();
    bipartiteGraphFactory0.setK((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }

    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory0 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.util.Vector vector1 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector1);
    int i3 = bipartiteGraphFactory0.getK();
    java.util.HashMap hashMap4 = bipartiteGraphFactory0.getNeededProperties();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap4);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }

    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory0 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.lang.String str1 = bipartiteGraphFactory0.toString();
    java.util.Vector vector2 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector2);
    java.util.Vector vector4 = bipartiteGraphFactory0.getSupportedLayouts();
    java.lang.String str5 = bipartiteGraphFactory0.toString();
    java.util.HashMap hashMap6 = bipartiteGraphFactory0.getNeededProperties();
    java.util.HashMap hashMap7 = bipartiteGraphFactory0.getNeededProperties();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Bipartite graph"+ "'", str1.equals("Bipartite graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(vector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Bipartite graph"+ "'", str5.equals("Bipartite graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap7);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }

    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory0 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.lang.String str1 = bipartiteGraphFactory0.toString();
    java.util.Vector vector2 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector2);
    java.util.Vector vector4 = bipartiteGraphFactory0.getSupportedLayouts();
    java.lang.String str5 = bipartiteGraphFactory0.toString();
    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory6 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.util.Vector vector7 = null;
    bipartiteGraphFactory6.setSupportedLayouts(vector7);
    int i9 = bipartiteGraphFactory6.getM();
    java.util.HashMap hashMap10 = bipartiteGraphFactory6.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph11 = bipartiteGraphFactory0.createGraph(hashMap10);
    java.util.Vector vector12 = bipartiteGraphFactory0.getSupportedLayouts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Bipartite graph"+ "'", str1.equals("Bipartite graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(vector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Bipartite graph"+ "'", str5.equals("Bipartite graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(vector12);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }

    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory0 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.lang.String str1 = bipartiteGraphFactory0.toString();
    java.util.Vector vector2 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector2);
    int i4 = bipartiteGraphFactory0.getM();
    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory5 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.util.Vector vector6 = null;
    bipartiteGraphFactory5.setSupportedLayouts(vector6);
    int i8 = bipartiteGraphFactory5.getM();
    java.util.HashMap hashMap9 = bipartiteGraphFactory5.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph10 = bipartiteGraphFactory0.createGraph(hashMap9);
    int i11 = bipartiteGraphFactory0.getK();
    int i12 = bipartiteGraphFactory0.getM();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Bipartite graph"+ "'", str1.equals("Bipartite graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }

    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory0 = new tccrouter.user.factories.BipartiteGraphFactory();
    bipartiteGraphFactory0.setM(10);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }

    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory0 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.lang.String str1 = bipartiteGraphFactory0.toString();
    java.util.Vector vector2 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector2);
    int i4 = bipartiteGraphFactory0.getM();
    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory5 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.util.Vector vector6 = null;
    bipartiteGraphFactory5.setSupportedLayouts(vector6);
    int i8 = bipartiteGraphFactory5.getM();
    java.util.HashMap hashMap9 = bipartiteGraphFactory5.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph10 = bipartiteGraphFactory0.createGraph(hashMap9);
    int i11 = bipartiteGraphFactory0.getK();
    java.lang.String str12 = bipartiteGraphFactory0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Bipartite graph"+ "'", str1.equals("Bipartite graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Bipartite graph"+ "'", str12.equals("Bipartite graph"));

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }

    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory0 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.util.Vector vector1 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector1);
    bipartiteGraphFactory0.setK((int)'#');
    int i5 = bipartiteGraphFactory0.getM();
    java.lang.String str6 = bipartiteGraphFactory0.toString();
    java.lang.String str7 = bipartiteGraphFactory0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Bipartite graph"+ "'", str6.equals("Bipartite graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Bipartite graph"+ "'", str7.equals("Bipartite graph"));

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }

    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory0 = new tccrouter.user.factories.BipartiteGraphFactory();
    int i1 = bipartiteGraphFactory0.getM();
    java.util.Vector vector2 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector2);
    java.util.Vector vector4 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector4);
    int i6 = bipartiteGraphFactory0.getK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 3);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }

    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory0 = new tccrouter.user.factories.BipartiteGraphFactory();
    bipartiteGraphFactory0.setK(0);
    bipartiteGraphFactory0.setK((int)'4');

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }

    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory0 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.lang.String str1 = bipartiteGraphFactory0.toString();
    java.util.Vector vector2 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector2);
    int i4 = bipartiteGraphFactory0.getK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Bipartite graph"+ "'", str1.equals("Bipartite graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 3);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }

    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory0 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.util.Vector vector1 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector1);
    int i3 = bipartiteGraphFactory0.getK();
    bipartiteGraphFactory0.setM((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 3);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }

    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory0 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.util.Vector vector1 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector1);
    java.util.HashMap hashMap3 = bipartiteGraphFactory0.getNeededProperties();
    int i4 = bipartiteGraphFactory0.getM();
    java.util.HashMap hashMap5 = bipartiteGraphFactory0.getNeededProperties();
    java.util.Vector vector6 = bipartiteGraphFactory0.getSupportedLayouts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(vector6);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }

    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory0 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.util.Vector vector1 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector1);
    java.util.HashMap hashMap3 = bipartiteGraphFactory0.getNeededProperties();
    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory4 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.util.Vector vector5 = null;
    bipartiteGraphFactory4.setSupportedLayouts(vector5);
    java.util.HashMap hashMap7 = bipartiteGraphFactory4.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph8 = bipartiteGraphFactory0.createGraph(hashMap7);
    int i9 = bipartiteGraphFactory0.getK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }

    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory0 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.util.Vector vector1 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector1);
    int i3 = bipartiteGraphFactory0.getK();
    bipartiteGraphFactory0.setM((int)'4');
    java.util.Vector vector6 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector6);
    bipartiteGraphFactory0.setM((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 3);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }

    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory0 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.util.Vector vector1 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector1);
    int i3 = bipartiteGraphFactory0.getK();
    int i4 = bipartiteGraphFactory0.getM();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 2);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }

    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory0 = new tccrouter.user.factories.BipartiteGraphFactory();
    bipartiteGraphFactory0.setK(0);
    int i3 = bipartiteGraphFactory0.getK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }

    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory0 = new tccrouter.user.factories.BipartiteGraphFactory();
    int i1 = bipartiteGraphFactory0.getM();
    int i2 = bipartiteGraphFactory0.getM();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }

    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory0 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.util.Vector vector1 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector1);
    java.util.HashMap hashMap3 = bipartiteGraphFactory0.getNeededProperties();
    java.util.Vector vector4 = bipartiteGraphFactory0.getSupportedLayouts();
    java.util.Vector vector5 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector5);
    java.util.Vector vector7 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector7);
    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory9 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.lang.String str10 = bipartiteGraphFactory9.toString();
    java.util.Vector vector11 = null;
    bipartiteGraphFactory9.setSupportedLayouts(vector11);
    int i13 = bipartiteGraphFactory9.getM();
    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory14 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.util.Vector vector15 = null;
    bipartiteGraphFactory14.setSupportedLayouts(vector15);
    int i17 = bipartiteGraphFactory14.getM();
    java.util.HashMap hashMap18 = bipartiteGraphFactory14.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph19 = bipartiteGraphFactory9.createGraph(hashMap18);
    bipartiteGraphFactory9.setK((int)(short)10);
    java.util.HashMap hashMap22 = bipartiteGraphFactory9.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph23 = bipartiteGraphFactory0.createGraph(hashMap22);
    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory24 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.util.Vector vector25 = null;
    bipartiteGraphFactory24.setSupportedLayouts(vector25);
    java.util.HashMap hashMap27 = bipartiteGraphFactory24.getNeededProperties();
    java.util.Vector vector28 = bipartiteGraphFactory24.getSupportedLayouts();
    int i29 = bipartiteGraphFactory24.getM();
    java.util.HashMap hashMap30 = bipartiteGraphFactory24.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph31 = bipartiteGraphFactory0.createGraph(hashMap30);
    java.util.Vector vector32 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(vector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Bipartite graph"+ "'", str10.equals("Bipartite graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(vector28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph31);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }

    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory0 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.util.Vector vector1 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector1);
    int i3 = bipartiteGraphFactory0.getK();
    java.util.Vector vector4 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 3);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }

    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory0 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.lang.String str1 = bipartiteGraphFactory0.toString();
    java.util.Vector vector2 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector2);
    java.util.Vector vector4 = bipartiteGraphFactory0.getSupportedLayouts();
    java.util.HashMap hashMap5 = bipartiteGraphFactory0.getNeededProperties();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Bipartite graph"+ "'", str1.equals("Bipartite graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(vector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap5);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test23"); }

    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory0 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.util.Vector vector1 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector1);
    java.util.HashMap hashMap3 = bipartiteGraphFactory0.getNeededProperties();
    java.util.Vector vector4 = bipartiteGraphFactory0.getSupportedLayouts();
    int i5 = bipartiteGraphFactory0.getM();
    bipartiteGraphFactory0.setM((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(vector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test24"); }

    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory0 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.util.Vector vector1 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector1);
    java.util.HashMap hashMap3 = bipartiteGraphFactory0.getNeededProperties();
    java.util.Vector vector4 = bipartiteGraphFactory0.getSupportedLayouts();
    java.util.Vector vector5 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector5);
    java.util.Vector vector7 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector7);
    java.util.HashMap hashMap9 = bipartiteGraphFactory0.getNeededProperties();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(vector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap9);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test25"); }

    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory0 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.lang.String str1 = bipartiteGraphFactory0.toString();
    java.util.Vector vector2 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector2);
    int i4 = bipartiteGraphFactory0.getM();
    bipartiteGraphFactory0.setM(0);
    java.lang.String str7 = bipartiteGraphFactory0.toString();
    java.util.HashMap hashMap8 = bipartiteGraphFactory0.getNeededProperties();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Bipartite graph"+ "'", str1.equals("Bipartite graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Bipartite graph"+ "'", str7.equals("Bipartite graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap8);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test26"); }

    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory0 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.util.Vector vector1 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector1);
    int i3 = bipartiteGraphFactory0.getK();
    bipartiteGraphFactory0.setM((int)'4');
    java.util.Vector vector6 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector6);
    java.util.Vector vector8 = bipartiteGraphFactory0.getSupportedLayouts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(vector8);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test27"); }

    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory0 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.util.Vector vector1 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector1);
    java.util.HashMap hashMap3 = bipartiteGraphFactory0.getNeededProperties();
    int i4 = bipartiteGraphFactory0.getM();
    java.util.HashMap hashMap5 = bipartiteGraphFactory0.getNeededProperties();
    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory6 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.util.Vector vector7 = null;
    bipartiteGraphFactory6.setSupportedLayouts(vector7);
    java.util.HashMap hashMap9 = bipartiteGraphFactory6.getNeededProperties();
    int i10 = bipartiteGraphFactory6.getM();
    java.util.HashMap hashMap11 = bipartiteGraphFactory6.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph12 = bipartiteGraphFactory0.createGraph(hashMap11);
    bipartiteGraphFactory0.setM((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph12);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test28"); }

    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory0 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.util.Vector vector1 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector1);
    java.util.HashMap hashMap3 = bipartiteGraphFactory0.getNeededProperties();
    java.util.Vector vector4 = bipartiteGraphFactory0.getSupportedLayouts();
    java.util.Vector vector5 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector5);
    java.util.Vector vector7 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector7);
    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory9 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.lang.String str10 = bipartiteGraphFactory9.toString();
    java.util.Vector vector11 = null;
    bipartiteGraphFactory9.setSupportedLayouts(vector11);
    int i13 = bipartiteGraphFactory9.getM();
    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory14 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.util.Vector vector15 = null;
    bipartiteGraphFactory14.setSupportedLayouts(vector15);
    int i17 = bipartiteGraphFactory14.getM();
    java.util.HashMap hashMap18 = bipartiteGraphFactory14.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph19 = bipartiteGraphFactory9.createGraph(hashMap18);
    bipartiteGraphFactory9.setK((int)(short)10);
    java.util.HashMap hashMap22 = bipartiteGraphFactory9.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph23 = bipartiteGraphFactory0.createGraph(hashMap22);
    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory24 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.util.Vector vector25 = null;
    bipartiteGraphFactory24.setSupportedLayouts(vector25);
    java.util.HashMap hashMap27 = bipartiteGraphFactory24.getNeededProperties();
    java.util.Vector vector28 = bipartiteGraphFactory24.getSupportedLayouts();
    int i29 = bipartiteGraphFactory24.getM();
    java.util.HashMap hashMap30 = bipartiteGraphFactory24.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph31 = bipartiteGraphFactory0.createGraph(hashMap30);
    int i32 = bipartiteGraphFactory0.getK();
    java.util.HashMap hashMap33 = bipartiteGraphFactory0.getNeededProperties();
    java.util.Vector vector34 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector34);
    bipartiteGraphFactory0.setK(3);
    java.util.Vector vector38 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(vector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Bipartite graph"+ "'", str10.equals("Bipartite graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(vector28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap33);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test29"); }

    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory0 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.util.Vector vector1 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector1);
    java.util.HashMap hashMap3 = bipartiteGraphFactory0.getNeededProperties();
    java.util.Vector vector4 = bipartiteGraphFactory0.getSupportedLayouts();
    java.util.Vector vector5 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector5);
    java.util.Vector vector7 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector7);
    java.util.Vector vector9 = bipartiteGraphFactory0.getSupportedLayouts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(vector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(vector9);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test30"); }

    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory0 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.util.Vector vector1 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector1);
    java.util.HashMap hashMap3 = bipartiteGraphFactory0.getNeededProperties();
    java.util.Vector vector4 = bipartiteGraphFactory0.getSupportedLayouts();
    java.util.Vector vector5 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector5);
    java.util.Vector vector7 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector7);
    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory9 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.lang.String str10 = bipartiteGraphFactory9.toString();
    java.util.Vector vector11 = null;
    bipartiteGraphFactory9.setSupportedLayouts(vector11);
    int i13 = bipartiteGraphFactory9.getM();
    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory14 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.util.Vector vector15 = null;
    bipartiteGraphFactory14.setSupportedLayouts(vector15);
    int i17 = bipartiteGraphFactory14.getM();
    java.util.HashMap hashMap18 = bipartiteGraphFactory14.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph19 = bipartiteGraphFactory9.createGraph(hashMap18);
    bipartiteGraphFactory9.setK((int)(short)10);
    java.util.HashMap hashMap22 = bipartiteGraphFactory9.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph23 = bipartiteGraphFactory0.createGraph(hashMap22);
    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory24 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.util.Vector vector25 = null;
    bipartiteGraphFactory24.setSupportedLayouts(vector25);
    java.util.HashMap hashMap27 = bipartiteGraphFactory24.getNeededProperties();
    java.util.Vector vector28 = bipartiteGraphFactory24.getSupportedLayouts();
    int i29 = bipartiteGraphFactory24.getM();
    java.util.HashMap hashMap30 = bipartiteGraphFactory24.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph31 = bipartiteGraphFactory0.createGraph(hashMap30);
    int i32 = bipartiteGraphFactory0.getK();
    bipartiteGraphFactory0.setK(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(vector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Bipartite graph"+ "'", str10.equals("Bipartite graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(vector28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 3);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test31"); }

    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory0 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.lang.String str1 = bipartiteGraphFactory0.toString();
    int i2 = bipartiteGraphFactory0.getM();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Bipartite graph"+ "'", str1.equals("Bipartite graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test32"); }

    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory0 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.lang.String str1 = bipartiteGraphFactory0.toString();
    java.util.Vector vector2 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector2);
    int i4 = bipartiteGraphFactory0.getM();
    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory5 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.util.Vector vector6 = null;
    bipartiteGraphFactory5.setSupportedLayouts(vector6);
    int i8 = bipartiteGraphFactory5.getM();
    java.util.HashMap hashMap9 = bipartiteGraphFactory5.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph10 = bipartiteGraphFactory0.createGraph(hashMap9);
    java.util.HashMap hashMap11 = bipartiteGraphFactory0.getNeededProperties();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Bipartite graph"+ "'", str1.equals("Bipartite graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap11);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test33"); }

    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory0 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.lang.String str1 = bipartiteGraphFactory0.toString();
    java.util.Vector vector2 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector2);
    int i4 = bipartiteGraphFactory0.getM();
    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory5 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.util.Vector vector6 = null;
    bipartiteGraphFactory5.setSupportedLayouts(vector6);
    int i8 = bipartiteGraphFactory5.getM();
    java.util.HashMap hashMap9 = bipartiteGraphFactory5.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph10 = bipartiteGraphFactory0.createGraph(hashMap9);
    bipartiteGraphFactory0.setK((int)(short)10);
    int i13 = bipartiteGraphFactory0.getK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Bipartite graph"+ "'", str1.equals("Bipartite graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 10);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test34"); }

    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory0 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.util.Vector vector1 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector1);
    int i3 = bipartiteGraphFactory0.getM();
    bipartiteGraphFactory0.setM(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test35"); }

    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory0 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.lang.String str1 = bipartiteGraphFactory0.toString();
    java.util.Vector vector2 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector2);
    java.util.Vector vector4 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector4);
    bipartiteGraphFactory0.setK(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Bipartite graph"+ "'", str1.equals("Bipartite graph"));

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test36"); }

    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory0 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.util.Vector vector1 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector1);
    java.util.HashMap hashMap3 = bipartiteGraphFactory0.getNeededProperties();
    java.util.Vector vector4 = bipartiteGraphFactory0.getSupportedLayouts();
    java.util.Vector vector5 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector5);
    java.util.HashMap hashMap7 = bipartiteGraphFactory0.getNeededProperties();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(vector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap7);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test37"); }

    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory0 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.util.Vector vector1 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector1);
    java.util.HashMap hashMap3 = bipartiteGraphFactory0.getNeededProperties();
    int i4 = bipartiteGraphFactory0.getM();
    java.util.HashMap hashMap5 = bipartiteGraphFactory0.getNeededProperties();
    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory6 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.util.Vector vector7 = null;
    bipartiteGraphFactory6.setSupportedLayouts(vector7);
    java.util.HashMap hashMap9 = bipartiteGraphFactory6.getNeededProperties();
    int i10 = bipartiteGraphFactory6.getM();
    java.util.HashMap hashMap11 = bipartiteGraphFactory6.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph12 = bipartiteGraphFactory0.createGraph(hashMap11);
    int i13 = bipartiteGraphFactory0.getK();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test38"); }

    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory0 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.lang.String str1 = bipartiteGraphFactory0.toString();
    java.util.Vector vector2 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector2);
    int i4 = bipartiteGraphFactory0.getM();
    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory5 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.util.Vector vector6 = null;
    bipartiteGraphFactory5.setSupportedLayouts(vector6);
    int i8 = bipartiteGraphFactory5.getM();
    java.util.HashMap hashMap9 = bipartiteGraphFactory5.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph10 = bipartiteGraphFactory0.createGraph(hashMap9);
    int i11 = bipartiteGraphFactory0.getK();
    java.util.HashMap hashMap12 = bipartiteGraphFactory0.getNeededProperties();
    bipartiteGraphFactory0.setM(3);
    java.util.HashMap hashMap15 = bipartiteGraphFactory0.getNeededProperties();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Bipartite graph"+ "'", str1.equals("Bipartite graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap15);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test39"); }

    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory0 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.util.Vector vector1 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector1);
    java.util.HashMap hashMap3 = bipartiteGraphFactory0.getNeededProperties();
    int i4 = bipartiteGraphFactory0.getM();
    java.util.HashMap hashMap5 = bipartiteGraphFactory0.getNeededProperties();
    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory6 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.util.Vector vector7 = null;
    bipartiteGraphFactory6.setSupportedLayouts(vector7);
    java.util.HashMap hashMap9 = bipartiteGraphFactory6.getNeededProperties();
    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory10 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.util.Vector vector11 = null;
    bipartiteGraphFactory10.setSupportedLayouts(vector11);
    java.util.HashMap hashMap13 = bipartiteGraphFactory10.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph14 = bipartiteGraphFactory6.createGraph(hashMap13);
    tccrouter.diamante.core.graph.Graph graph15 = bipartiteGraphFactory0.createGraph(hashMap13);
    java.util.Vector vector16 = bipartiteGraphFactory0.getSupportedLayouts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(vector16);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test40"); }

    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory0 = new tccrouter.user.factories.BipartiteGraphFactory();
    bipartiteGraphFactory0.setK(0);
    java.util.HashMap hashMap3 = bipartiteGraphFactory0.getNeededProperties();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap3);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test41"); }

    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory0 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.util.Vector vector1 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector1);
    java.util.HashMap hashMap3 = bipartiteGraphFactory0.getNeededProperties();
    java.util.Vector vector4 = bipartiteGraphFactory0.getSupportedLayouts();
    java.util.Vector vector5 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector5);
    java.util.Vector vector7 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector7);
    int i9 = bipartiteGraphFactory0.getM();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(vector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 2);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test42"); }

    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory0 = new tccrouter.user.factories.BipartiteGraphFactory();
    int i1 = bipartiteGraphFactory0.getM();
    java.util.Vector vector2 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector2);
    java.util.Vector vector4 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector4);
    bipartiteGraphFactory0.setM((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test43"); }

    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory0 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.util.Vector vector1 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector1);
    int i3 = bipartiteGraphFactory0.getK();
    bipartiteGraphFactory0.setM((int)'4');
    java.util.Vector vector6 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector6);
    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory8 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.util.Vector vector9 = null;
    bipartiteGraphFactory8.setSupportedLayouts(vector9);
    java.util.HashMap hashMap11 = bipartiteGraphFactory8.getNeededProperties();
    java.util.Vector vector12 = bipartiteGraphFactory8.getSupportedLayouts();
    java.util.Vector vector13 = null;
    bipartiteGraphFactory8.setSupportedLayouts(vector13);
    java.util.Vector vector15 = null;
    bipartiteGraphFactory8.setSupportedLayouts(vector15);
    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory17 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.lang.String str18 = bipartiteGraphFactory17.toString();
    java.util.Vector vector19 = null;
    bipartiteGraphFactory17.setSupportedLayouts(vector19);
    int i21 = bipartiteGraphFactory17.getM();
    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory22 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.util.Vector vector23 = null;
    bipartiteGraphFactory22.setSupportedLayouts(vector23);
    int i25 = bipartiteGraphFactory22.getM();
    java.util.HashMap hashMap26 = bipartiteGraphFactory22.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph27 = bipartiteGraphFactory17.createGraph(hashMap26);
    bipartiteGraphFactory17.setK((int)(short)10);
    java.util.HashMap hashMap30 = bipartiteGraphFactory17.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph31 = bipartiteGraphFactory8.createGraph(hashMap30);
    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory32 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.util.Vector vector33 = null;
    bipartiteGraphFactory32.setSupportedLayouts(vector33);
    java.util.HashMap hashMap35 = bipartiteGraphFactory32.getNeededProperties();
    java.util.Vector vector36 = bipartiteGraphFactory32.getSupportedLayouts();
    int i37 = bipartiteGraphFactory32.getM();
    java.util.HashMap hashMap38 = bipartiteGraphFactory32.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph39 = bipartiteGraphFactory8.createGraph(hashMap38);
    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory40 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.util.Vector vector41 = null;
    bipartiteGraphFactory40.setSupportedLayouts(vector41);
    java.util.HashMap hashMap43 = bipartiteGraphFactory40.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph44 = bipartiteGraphFactory8.createGraph(hashMap43);
    tccrouter.diamante.core.graph.Graph graph45 = bipartiteGraphFactory0.createGraph(hashMap43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Bipartite graph"+ "'", str18.equals("Bipartite graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(vector36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph45);

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test44"); }

    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory0 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.lang.String str1 = bipartiteGraphFactory0.toString();
    java.util.Vector vector2 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector2);
    java.util.Vector vector4 = bipartiteGraphFactory0.getSupportedLayouts();
    java.lang.String str5 = bipartiteGraphFactory0.toString();
    bipartiteGraphFactory0.setK((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Bipartite graph"+ "'", str1.equals("Bipartite graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(vector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Bipartite graph"+ "'", str5.equals("Bipartite graph"));

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test45"); }

    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory0 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.util.Vector vector1 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector1);
    java.util.HashMap hashMap3 = bipartiteGraphFactory0.getNeededProperties();
    java.util.Vector vector4 = bipartiteGraphFactory0.getSupportedLayouts();
    java.util.Vector vector5 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector5);
    java.util.Vector vector7 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector7);
    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory9 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.lang.String str10 = bipartiteGraphFactory9.toString();
    java.util.Vector vector11 = null;
    bipartiteGraphFactory9.setSupportedLayouts(vector11);
    int i13 = bipartiteGraphFactory9.getM();
    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory14 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.util.Vector vector15 = null;
    bipartiteGraphFactory14.setSupportedLayouts(vector15);
    int i17 = bipartiteGraphFactory14.getM();
    java.util.HashMap hashMap18 = bipartiteGraphFactory14.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph19 = bipartiteGraphFactory9.createGraph(hashMap18);
    bipartiteGraphFactory9.setK((int)(short)10);
    java.util.HashMap hashMap22 = bipartiteGraphFactory9.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph23 = bipartiteGraphFactory0.createGraph(hashMap22);
    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory24 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.util.Vector vector25 = null;
    bipartiteGraphFactory24.setSupportedLayouts(vector25);
    java.util.HashMap hashMap27 = bipartiteGraphFactory24.getNeededProperties();
    java.util.Vector vector28 = bipartiteGraphFactory24.getSupportedLayouts();
    int i29 = bipartiteGraphFactory24.getM();
    java.util.HashMap hashMap30 = bipartiteGraphFactory24.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph31 = bipartiteGraphFactory0.createGraph(hashMap30);
    int i32 = bipartiteGraphFactory0.getK();
    java.util.HashMap hashMap33 = bipartiteGraphFactory0.getNeededProperties();
    java.util.Vector vector34 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector34);
    java.util.Vector vector36 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(vector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Bipartite graph"+ "'", str10.equals("Bipartite graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(vector28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap33);

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test46"); }

    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory0 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.lang.String str1 = bipartiteGraphFactory0.toString();
    bipartiteGraphFactory0.setK(100);
    int i4 = bipartiteGraphFactory0.getK();
    bipartiteGraphFactory0.setK(0);
    java.util.HashMap hashMap7 = bipartiteGraphFactory0.getNeededProperties();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Bipartite graph"+ "'", str1.equals("Bipartite graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap7);

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test47"); }

    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory0 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.lang.String str1 = bipartiteGraphFactory0.toString();
    java.util.Vector vector2 = null;
    bipartiteGraphFactory0.setSupportedLayouts(vector2);
    int i4 = bipartiteGraphFactory0.getM();
    tccrouter.user.factories.BipartiteGraphFactory bipartiteGraphFactory5 = new tccrouter.user.factories.BipartiteGraphFactory();
    java.util.Vector vector6 = null;
    bipartiteGraphFactory5.setSupportedLayouts(vector6);
    int i8 = bipartiteGraphFactory5.getM();
    java.util.HashMap hashMap9 = bipartiteGraphFactory5.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph10 = bipartiteGraphFactory0.createGraph(hashMap9);
    int i11 = bipartiteGraphFactory0.getK();
    java.util.HashMap hashMap12 = bipartiteGraphFactory0.getNeededProperties();
    int i13 = bipartiteGraphFactory0.getM();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Bipartite graph"+ "'", str1.equals("Bipartite graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 2);

  }

}