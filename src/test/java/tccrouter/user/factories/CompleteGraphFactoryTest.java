package tccrouter.user.factories;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CompleteGraphFactoryTest {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test01"); }

    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory0 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector1 = completeGraphFactory0.getSupportedLayouts();
    java.lang.String str2 = completeGraphFactory0.toString();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory3 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str4 = completeGraphFactory3.toString();
    java.lang.String str5 = completeGraphFactory3.toString();
    java.util.Vector vector6 = completeGraphFactory3.getSupportedLayouts();
    completeGraphFactory0.setSupportedLayouts(vector6);
    java.util.Vector vector8 = completeGraphFactory0.getSupportedLayouts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Complete graph"+ "'", str2.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Complete graph"+ "'", str4.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Complete graph"+ "'", str5.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }

    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory0 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector1 = completeGraphFactory0.getSupportedLayouts();
    java.util.Vector vector2 = completeGraphFactory0.getSupportedLayouts();
    java.util.HashMap hashMap3 = completeGraphFactory0.getNeededProperties();
    java.lang.String str4 = completeGraphFactory0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Complete graph"+ "'", str4.equals("Complete graph"));

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }

    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory0 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str1 = completeGraphFactory0.toString();
    java.lang.String str2 = completeGraphFactory0.toString();
    java.util.Vector vector3 = completeGraphFactory0.getSupportedLayouts();
    java.util.Vector vector4 = completeGraphFactory0.getSupportedLayouts();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory5 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str6 = completeGraphFactory5.toString();
    java.lang.String str7 = completeGraphFactory5.toString();
    java.util.Vector vector8 = completeGraphFactory5.getSupportedLayouts();
    java.util.Vector vector9 = completeGraphFactory5.getSupportedLayouts();
    completeGraphFactory0.setSupportedLayouts(vector9);
    java.util.HashMap hashMap11 = completeGraphFactory0.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory12 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str13 = completeGraphFactory12.toString();
    java.lang.String str14 = completeGraphFactory12.toString();
    java.util.HashMap hashMap15 = completeGraphFactory12.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory16 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector17 = completeGraphFactory16.getSupportedLayouts();
    completeGraphFactory12.setSupportedLayouts(vector17);
    java.util.HashMap hashMap19 = completeGraphFactory12.getNeededProperties();
    java.util.Vector vector20 = completeGraphFactory12.getSupportedLayouts();
    completeGraphFactory0.setSupportedLayouts(vector20);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory22 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector23 = completeGraphFactory22.getSupportedLayouts();
    java.util.Vector vector24 = completeGraphFactory22.getSupportedLayouts();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory25 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector26 = completeGraphFactory25.getSupportedLayouts();
    java.util.HashMap hashMap27 = completeGraphFactory25.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph28 = completeGraphFactory22.createGraph(hashMap27);
    tccrouter.diamante.core.graph.Graph graph29 = completeGraphFactory0.createGraph(hashMap27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Complete graph"+ "'", str1.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Complete graph"+ "'", str2.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Complete graph"+ "'", str6.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Complete graph"+ "'", str7.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Complete graph"+ "'", str13.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Complete graph"+ "'", str14.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph29);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }

    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory0 = new tccrouter.user.factories.CompleteGraphFactory();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory1 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector2 = completeGraphFactory1.getSupportedLayouts();
    completeGraphFactory0.setSupportedLayouts(vector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector2);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }

    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory0 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str1 = completeGraphFactory0.toString();
    java.lang.String str2 = completeGraphFactory0.toString();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory3 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str4 = completeGraphFactory3.toString();
    java.lang.String str5 = completeGraphFactory3.toString();
    java.util.HashMap hashMap6 = completeGraphFactory3.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory7 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector8 = completeGraphFactory7.getSupportedLayouts();
    completeGraphFactory3.setSupportedLayouts(vector8);
    completeGraphFactory0.setSupportedLayouts(vector8);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory11 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str12 = completeGraphFactory11.toString();
    java.lang.String str13 = completeGraphFactory11.toString();
    java.util.HashMap hashMap14 = completeGraphFactory11.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory15 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector16 = completeGraphFactory15.getSupportedLayouts();
    completeGraphFactory11.setSupportedLayouts(vector16);
    completeGraphFactory0.setSupportedLayouts(vector16);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory19 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str20 = completeGraphFactory19.toString();
    java.lang.String str21 = completeGraphFactory19.toString();
    java.util.HashMap hashMap22 = completeGraphFactory19.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph23 = completeGraphFactory0.createGraph(hashMap22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Complete graph"+ "'", str1.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Complete graph"+ "'", str2.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Complete graph"+ "'", str4.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Complete graph"+ "'", str5.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Complete graph"+ "'", str12.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Complete graph"+ "'", str13.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Complete graph"+ "'", str20.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Complete graph"+ "'", str21.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph23);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }

    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory0 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector1 = completeGraphFactory0.getSupportedLayouts();
    java.util.Vector vector2 = completeGraphFactory0.getSupportedLayouts();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory3 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector4 = completeGraphFactory3.getSupportedLayouts();
    java.util.HashMap hashMap5 = completeGraphFactory3.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph6 = completeGraphFactory0.createGraph(hashMap5);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory7 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str8 = completeGraphFactory7.toString();
    java.lang.String str9 = completeGraphFactory7.toString();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory10 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str11 = completeGraphFactory10.toString();
    java.lang.String str12 = completeGraphFactory10.toString();
    java.util.HashMap hashMap13 = completeGraphFactory10.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory14 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector15 = completeGraphFactory14.getSupportedLayouts();
    completeGraphFactory10.setSupportedLayouts(vector15);
    completeGraphFactory7.setSupportedLayouts(vector15);
    completeGraphFactory0.setSupportedLayouts(vector15);
    java.util.HashMap hashMap19 = completeGraphFactory0.getNeededProperties();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Complete graph"+ "'", str8.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Complete graph"+ "'", str9.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Complete graph"+ "'", str11.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Complete graph"+ "'", str12.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap19);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }

    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory0 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str1 = completeGraphFactory0.toString();
    java.lang.String str2 = completeGraphFactory0.toString();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory3 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str4 = completeGraphFactory3.toString();
    java.lang.String str5 = completeGraphFactory3.toString();
    java.util.HashMap hashMap6 = completeGraphFactory3.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory7 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector8 = completeGraphFactory7.getSupportedLayouts();
    completeGraphFactory3.setSupportedLayouts(vector8);
    completeGraphFactory0.setSupportedLayouts(vector8);
    java.util.HashMap hashMap11 = completeGraphFactory0.getNeededProperties();
    java.util.Vector vector12 = completeGraphFactory0.getSupportedLayouts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Complete graph"+ "'", str1.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Complete graph"+ "'", str2.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Complete graph"+ "'", str4.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Complete graph"+ "'", str5.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }

    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory0 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str1 = completeGraphFactory0.toString();
    java.lang.String str2 = completeGraphFactory0.toString();
    java.util.Vector vector3 = completeGraphFactory0.getSupportedLayouts();
    java.util.Vector vector4 = completeGraphFactory0.getSupportedLayouts();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory5 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str6 = completeGraphFactory5.toString();
    java.lang.String str7 = completeGraphFactory5.toString();
    java.util.Vector vector8 = completeGraphFactory5.getSupportedLayouts();
    java.util.Vector vector9 = completeGraphFactory5.getSupportedLayouts();
    completeGraphFactory0.setSupportedLayouts(vector9);
    java.util.HashMap hashMap11 = completeGraphFactory0.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory12 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str13 = completeGraphFactory12.toString();
    java.lang.String str14 = completeGraphFactory12.toString();
    java.util.HashMap hashMap15 = completeGraphFactory12.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory16 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector17 = completeGraphFactory16.getSupportedLayouts();
    completeGraphFactory12.setSupportedLayouts(vector17);
    java.util.HashMap hashMap19 = completeGraphFactory12.getNeededProperties();
    java.util.Vector vector20 = completeGraphFactory12.getSupportedLayouts();
    completeGraphFactory0.setSupportedLayouts(vector20);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory22 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector23 = completeGraphFactory22.getSupportedLayouts();
    java.util.HashMap hashMap24 = completeGraphFactory22.getNeededProperties();
    java.lang.String str25 = completeGraphFactory22.toString();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory26 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector27 = completeGraphFactory26.getSupportedLayouts();
    java.lang.String str28 = completeGraphFactory26.toString();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory29 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str30 = completeGraphFactory29.toString();
    java.lang.String str31 = completeGraphFactory29.toString();
    java.util.Vector vector32 = completeGraphFactory29.getSupportedLayouts();
    completeGraphFactory26.setSupportedLayouts(vector32);
    completeGraphFactory22.setSupportedLayouts(vector32);
    completeGraphFactory0.setSupportedLayouts(vector32);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory36 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str37 = completeGraphFactory36.toString();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory38 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector39 = completeGraphFactory38.getSupportedLayouts();
    java.lang.String str40 = completeGraphFactory38.toString();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory41 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str42 = completeGraphFactory41.toString();
    java.lang.String str43 = completeGraphFactory41.toString();
    java.util.Vector vector44 = completeGraphFactory41.getSupportedLayouts();
    completeGraphFactory38.setSupportedLayouts(vector44);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory46 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str47 = completeGraphFactory46.toString();
    java.lang.String str48 = completeGraphFactory46.toString();
    java.util.Vector vector49 = completeGraphFactory46.getSupportedLayouts();
    java.util.Vector vector50 = completeGraphFactory46.getSupportedLayouts();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory51 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str52 = completeGraphFactory51.toString();
    java.lang.String str53 = completeGraphFactory51.toString();
    java.util.Vector vector54 = completeGraphFactory51.getSupportedLayouts();
    java.util.Vector vector55 = completeGraphFactory51.getSupportedLayouts();
    completeGraphFactory46.setSupportedLayouts(vector55);
    java.util.HashMap hashMap57 = completeGraphFactory46.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory58 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str59 = completeGraphFactory58.toString();
    java.lang.String str60 = completeGraphFactory58.toString();
    java.util.HashMap hashMap61 = completeGraphFactory58.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory62 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector63 = completeGraphFactory62.getSupportedLayouts();
    completeGraphFactory58.setSupportedLayouts(vector63);
    java.util.HashMap hashMap65 = completeGraphFactory58.getNeededProperties();
    java.util.Vector vector66 = completeGraphFactory58.getSupportedLayouts();
    completeGraphFactory46.setSupportedLayouts(vector66);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory68 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector69 = completeGraphFactory68.getSupportedLayouts();
    java.util.HashMap hashMap70 = completeGraphFactory68.getNeededProperties();
    java.lang.String str71 = completeGraphFactory68.toString();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory72 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector73 = completeGraphFactory72.getSupportedLayouts();
    java.lang.String str74 = completeGraphFactory72.toString();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory75 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str76 = completeGraphFactory75.toString();
    java.lang.String str77 = completeGraphFactory75.toString();
    java.util.Vector vector78 = completeGraphFactory75.getSupportedLayouts();
    completeGraphFactory72.setSupportedLayouts(vector78);
    completeGraphFactory68.setSupportedLayouts(vector78);
    completeGraphFactory46.setSupportedLayouts(vector78);
    completeGraphFactory38.setSupportedLayouts(vector78);
    completeGraphFactory36.setSupportedLayouts(vector78);
    completeGraphFactory0.setSupportedLayouts(vector78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Complete graph"+ "'", str1.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Complete graph"+ "'", str2.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Complete graph"+ "'", str6.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Complete graph"+ "'", str7.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Complete graph"+ "'", str13.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Complete graph"+ "'", str14.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Complete graph"+ "'", str25.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "Complete graph"+ "'", str28.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "Complete graph"+ "'", str30.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "Complete graph"+ "'", str31.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "Complete graph"+ "'", str37.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "Complete graph"+ "'", str40.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "Complete graph"+ "'", str42.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "Complete graph"+ "'", str43.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "Complete graph"+ "'", str47.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "Complete graph"+ "'", str48.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "Complete graph"+ "'", str52.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "Complete graph"+ "'", str53.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + "Complete graph"+ "'", str59.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + "Complete graph"+ "'", str60.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str71 + "' != '" + "Complete graph"+ "'", str71.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str74 + "' != '" + "Complete graph"+ "'", str74.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str76 + "' != '" + "Complete graph"+ "'", str76.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str77 + "' != '" + "Complete graph"+ "'", str77.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector78);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }

    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory0 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str1 = completeGraphFactory0.toString();
    java.lang.String str2 = completeGraphFactory0.toString();
    java.util.Vector vector3 = completeGraphFactory0.getSupportedLayouts();
    java.util.Vector vector4 = completeGraphFactory0.getSupportedLayouts();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory5 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str6 = completeGraphFactory5.toString();
    java.lang.String str7 = completeGraphFactory5.toString();
    java.util.Vector vector8 = completeGraphFactory5.getSupportedLayouts();
    java.util.Vector vector9 = completeGraphFactory5.getSupportedLayouts();
    completeGraphFactory0.setSupportedLayouts(vector9);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory11 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str12 = completeGraphFactory11.toString();
    java.lang.String str13 = completeGraphFactory11.toString();
    java.util.Vector vector14 = completeGraphFactory11.getSupportedLayouts();
    java.util.Vector vector15 = completeGraphFactory11.getSupportedLayouts();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory16 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str17 = completeGraphFactory16.toString();
    java.lang.String str18 = completeGraphFactory16.toString();
    java.util.Vector vector19 = completeGraphFactory16.getSupportedLayouts();
    java.util.Vector vector20 = completeGraphFactory16.getSupportedLayouts();
    completeGraphFactory11.setSupportedLayouts(vector20);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory22 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector23 = completeGraphFactory22.getSupportedLayouts();
    java.util.HashMap hashMap24 = completeGraphFactory22.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph25 = completeGraphFactory11.createGraph(hashMap24);
    tccrouter.diamante.core.graph.Graph graph26 = completeGraphFactory0.createGraph(hashMap24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Complete graph"+ "'", str1.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Complete graph"+ "'", str2.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Complete graph"+ "'", str6.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Complete graph"+ "'", str7.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Complete graph"+ "'", str12.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Complete graph"+ "'", str13.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Complete graph"+ "'", str17.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Complete graph"+ "'", str18.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph26);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }

    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory0 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str1 = completeGraphFactory0.toString();
    java.lang.String str2 = completeGraphFactory0.toString();
    java.util.HashMap hashMap3 = completeGraphFactory0.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory4 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector5 = completeGraphFactory4.getSupportedLayouts();
    java.lang.String str6 = completeGraphFactory4.toString();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory7 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str8 = completeGraphFactory7.toString();
    java.lang.String str9 = completeGraphFactory7.toString();
    java.util.Vector vector10 = completeGraphFactory7.getSupportedLayouts();
    completeGraphFactory4.setSupportedLayouts(vector10);
    completeGraphFactory0.setSupportedLayouts(vector10);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory13 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector14 = completeGraphFactory13.getSupportedLayouts();
    java.util.Vector vector15 = completeGraphFactory13.getSupportedLayouts();
    java.util.HashMap hashMap16 = completeGraphFactory13.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory17 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector18 = completeGraphFactory17.getSupportedLayouts();
    java.lang.String str19 = completeGraphFactory17.toString();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory20 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str21 = completeGraphFactory20.toString();
    java.lang.String str22 = completeGraphFactory20.toString();
    java.util.Vector vector23 = completeGraphFactory20.getSupportedLayouts();
    completeGraphFactory17.setSupportedLayouts(vector23);
    completeGraphFactory13.setSupportedLayouts(vector23);
    completeGraphFactory0.setSupportedLayouts(vector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Complete graph"+ "'", str1.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Complete graph"+ "'", str2.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Complete graph"+ "'", str6.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Complete graph"+ "'", str8.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Complete graph"+ "'", str9.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Complete graph"+ "'", str19.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Complete graph"+ "'", str21.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Complete graph"+ "'", str22.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector23);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }

    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory0 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str1 = completeGraphFactory0.toString();
    java.lang.String str2 = completeGraphFactory0.toString();
    java.util.Vector vector3 = completeGraphFactory0.getSupportedLayouts();
    java.util.Vector vector4 = completeGraphFactory0.getSupportedLayouts();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory5 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str6 = completeGraphFactory5.toString();
    java.lang.String str7 = completeGraphFactory5.toString();
    java.util.Vector vector8 = completeGraphFactory5.getSupportedLayouts();
    java.util.Vector vector9 = completeGraphFactory5.getSupportedLayouts();
    completeGraphFactory0.setSupportedLayouts(vector9);
    java.util.HashMap hashMap11 = completeGraphFactory0.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory12 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str13 = completeGraphFactory12.toString();
    java.lang.String str14 = completeGraphFactory12.toString();
    java.util.HashMap hashMap15 = completeGraphFactory12.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory16 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector17 = completeGraphFactory16.getSupportedLayouts();
    completeGraphFactory12.setSupportedLayouts(vector17);
    java.util.HashMap hashMap19 = completeGraphFactory12.getNeededProperties();
    java.util.Vector vector20 = completeGraphFactory12.getSupportedLayouts();
    completeGraphFactory0.setSupportedLayouts(vector20);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory22 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector23 = completeGraphFactory22.getSupportedLayouts();
    java.util.HashMap hashMap24 = completeGraphFactory22.getNeededProperties();
    java.lang.String str25 = completeGraphFactory22.toString();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory26 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector27 = completeGraphFactory26.getSupportedLayouts();
    java.lang.String str28 = completeGraphFactory26.toString();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory29 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str30 = completeGraphFactory29.toString();
    java.lang.String str31 = completeGraphFactory29.toString();
    java.util.Vector vector32 = completeGraphFactory29.getSupportedLayouts();
    completeGraphFactory26.setSupportedLayouts(vector32);
    completeGraphFactory22.setSupportedLayouts(vector32);
    completeGraphFactory0.setSupportedLayouts(vector32);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory36 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector37 = completeGraphFactory36.getSupportedLayouts();
    java.lang.String str38 = completeGraphFactory36.toString();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory39 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str40 = completeGraphFactory39.toString();
    java.lang.String str41 = completeGraphFactory39.toString();
    java.util.Vector vector42 = completeGraphFactory39.getSupportedLayouts();
    completeGraphFactory36.setSupportedLayouts(vector42);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory44 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str45 = completeGraphFactory44.toString();
    java.lang.String str46 = completeGraphFactory44.toString();
    java.util.Vector vector47 = completeGraphFactory44.getSupportedLayouts();
    java.util.Vector vector48 = completeGraphFactory44.getSupportedLayouts();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory49 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str50 = completeGraphFactory49.toString();
    java.lang.String str51 = completeGraphFactory49.toString();
    java.util.Vector vector52 = completeGraphFactory49.getSupportedLayouts();
    java.util.Vector vector53 = completeGraphFactory49.getSupportedLayouts();
    completeGraphFactory44.setSupportedLayouts(vector53);
    java.util.HashMap hashMap55 = completeGraphFactory44.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory56 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str57 = completeGraphFactory56.toString();
    java.lang.String str58 = completeGraphFactory56.toString();
    java.util.HashMap hashMap59 = completeGraphFactory56.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory60 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector61 = completeGraphFactory60.getSupportedLayouts();
    completeGraphFactory56.setSupportedLayouts(vector61);
    java.util.HashMap hashMap63 = completeGraphFactory56.getNeededProperties();
    java.util.Vector vector64 = completeGraphFactory56.getSupportedLayouts();
    completeGraphFactory44.setSupportedLayouts(vector64);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory66 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector67 = completeGraphFactory66.getSupportedLayouts();
    java.util.HashMap hashMap68 = completeGraphFactory66.getNeededProperties();
    java.lang.String str69 = completeGraphFactory66.toString();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory70 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector71 = completeGraphFactory70.getSupportedLayouts();
    java.lang.String str72 = completeGraphFactory70.toString();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory73 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str74 = completeGraphFactory73.toString();
    java.lang.String str75 = completeGraphFactory73.toString();
    java.util.Vector vector76 = completeGraphFactory73.getSupportedLayouts();
    completeGraphFactory70.setSupportedLayouts(vector76);
    completeGraphFactory66.setSupportedLayouts(vector76);
    completeGraphFactory44.setSupportedLayouts(vector76);
    completeGraphFactory36.setSupportedLayouts(vector76);
    completeGraphFactory0.setSupportedLayouts(vector76);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory82 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str83 = completeGraphFactory82.toString();
    java.lang.String str84 = completeGraphFactory82.toString();
    java.util.Vector vector85 = completeGraphFactory82.getSupportedLayouts();
    completeGraphFactory0.setSupportedLayouts(vector85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Complete graph"+ "'", str1.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Complete graph"+ "'", str2.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Complete graph"+ "'", str6.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Complete graph"+ "'", str7.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Complete graph"+ "'", str13.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Complete graph"+ "'", str14.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Complete graph"+ "'", str25.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "Complete graph"+ "'", str28.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "Complete graph"+ "'", str30.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "Complete graph"+ "'", str31.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "Complete graph"+ "'", str38.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "Complete graph"+ "'", str40.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "Complete graph"+ "'", str41.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "Complete graph"+ "'", str45.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "Complete graph"+ "'", str46.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "Complete graph"+ "'", str50.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "Complete graph"+ "'", str51.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str57 + "' != '" + "Complete graph"+ "'", str57.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str58 + "' != '" + "Complete graph"+ "'", str58.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str69 + "' != '" + "Complete graph"+ "'", str69.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str72 + "' != '" + "Complete graph"+ "'", str72.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str74 + "' != '" + "Complete graph"+ "'", str74.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str75 + "' != '" + "Complete graph"+ "'", str75.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str83 + "' != '" + "Complete graph"+ "'", str83.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str84 + "' != '" + "Complete graph"+ "'", str84.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector85);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }

    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory0 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str1 = completeGraphFactory0.toString();
    java.lang.String str2 = completeGraphFactory0.toString();
    java.util.Vector vector3 = completeGraphFactory0.getSupportedLayouts();
    java.util.Vector vector4 = completeGraphFactory0.getSupportedLayouts();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory5 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str6 = completeGraphFactory5.toString();
    java.lang.String str7 = completeGraphFactory5.toString();
    java.util.Vector vector8 = completeGraphFactory5.getSupportedLayouts();
    java.util.Vector vector9 = completeGraphFactory5.getSupportedLayouts();
    completeGraphFactory0.setSupportedLayouts(vector9);
    java.util.HashMap hashMap11 = completeGraphFactory0.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory12 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str13 = completeGraphFactory12.toString();
    java.lang.String str14 = completeGraphFactory12.toString();
    java.util.HashMap hashMap15 = completeGraphFactory12.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory16 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector17 = completeGraphFactory16.getSupportedLayouts();
    completeGraphFactory12.setSupportedLayouts(vector17);
    java.util.HashMap hashMap19 = completeGraphFactory12.getNeededProperties();
    java.util.Vector vector20 = completeGraphFactory12.getSupportedLayouts();
    completeGraphFactory0.setSupportedLayouts(vector20);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory22 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str23 = completeGraphFactory22.toString();
    java.lang.String str24 = completeGraphFactory22.toString();
    java.util.Vector vector25 = completeGraphFactory22.getSupportedLayouts();
    java.util.Vector vector26 = completeGraphFactory22.getSupportedLayouts();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory27 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str28 = completeGraphFactory27.toString();
    java.lang.String str29 = completeGraphFactory27.toString();
    java.util.Vector vector30 = completeGraphFactory27.getSupportedLayouts();
    java.util.Vector vector31 = completeGraphFactory27.getSupportedLayouts();
    completeGraphFactory22.setSupportedLayouts(vector31);
    completeGraphFactory0.setSupportedLayouts(vector31);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory34 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector35 = completeGraphFactory34.getSupportedLayouts();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory36 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str37 = completeGraphFactory36.toString();
    java.lang.String str38 = completeGraphFactory36.toString();
    java.util.HashMap hashMap39 = completeGraphFactory36.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory40 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector41 = completeGraphFactory40.getSupportedLayouts();
    completeGraphFactory36.setSupportedLayouts(vector41);
    java.util.HashMap hashMap43 = completeGraphFactory36.getNeededProperties();
    java.util.Vector vector44 = completeGraphFactory36.getSupportedLayouts();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory45 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str46 = completeGraphFactory45.toString();
    java.lang.String str47 = completeGraphFactory45.toString();
    java.util.HashMap hashMap48 = completeGraphFactory45.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory49 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector50 = completeGraphFactory49.getSupportedLayouts();
    completeGraphFactory45.setSupportedLayouts(vector50);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory52 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector53 = completeGraphFactory52.getSupportedLayouts();
    java.util.HashMap hashMap54 = completeGraphFactory52.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph55 = completeGraphFactory45.createGraph(hashMap54);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory56 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str57 = completeGraphFactory56.toString();
    java.lang.String str58 = completeGraphFactory56.toString();
    java.util.HashMap hashMap59 = completeGraphFactory56.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory60 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector61 = completeGraphFactory60.getSupportedLayouts();
    completeGraphFactory56.setSupportedLayouts(vector61);
    java.util.HashMap hashMap63 = completeGraphFactory56.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph64 = completeGraphFactory45.createGraph(hashMap63);
    tccrouter.diamante.core.graph.Graph graph65 = completeGraphFactory36.createGraph(hashMap63);
    tccrouter.diamante.core.graph.Graph graph66 = completeGraphFactory34.createGraph(hashMap63);
    tccrouter.diamante.core.graph.Graph graph67 = completeGraphFactory0.createGraph(hashMap63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Complete graph"+ "'", str1.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Complete graph"+ "'", str2.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Complete graph"+ "'", str6.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Complete graph"+ "'", str7.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Complete graph"+ "'", str13.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Complete graph"+ "'", str14.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Complete graph"+ "'", str23.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Complete graph"+ "'", str24.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "Complete graph"+ "'", str28.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "Complete graph"+ "'", str29.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "Complete graph"+ "'", str37.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "Complete graph"+ "'", str38.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "Complete graph"+ "'", str46.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "Complete graph"+ "'", str47.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str57 + "' != '" + "Complete graph"+ "'", str57.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str58 + "' != '" + "Complete graph"+ "'", str58.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph67);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }

    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory0 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector1 = completeGraphFactory0.getSupportedLayouts();
    java.util.HashMap hashMap2 = completeGraphFactory0.getNeededProperties();
    java.lang.String str3 = completeGraphFactory0.toString();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory4 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector5 = completeGraphFactory4.getSupportedLayouts();
    java.lang.String str6 = completeGraphFactory4.toString();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory7 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str8 = completeGraphFactory7.toString();
    java.lang.String str9 = completeGraphFactory7.toString();
    java.util.Vector vector10 = completeGraphFactory7.getSupportedLayouts();
    completeGraphFactory4.setSupportedLayouts(vector10);
    completeGraphFactory0.setSupportedLayouts(vector10);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory13 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str14 = completeGraphFactory13.toString();
    java.lang.String str15 = completeGraphFactory13.toString();
    java.util.Vector vector16 = completeGraphFactory13.getSupportedLayouts();
    java.util.Vector vector17 = completeGraphFactory13.getSupportedLayouts();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory18 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str19 = completeGraphFactory18.toString();
    java.lang.String str20 = completeGraphFactory18.toString();
    java.util.Vector vector21 = completeGraphFactory18.getSupportedLayouts();
    java.util.Vector vector22 = completeGraphFactory18.getSupportedLayouts();
    completeGraphFactory13.setSupportedLayouts(vector22);
    java.util.HashMap hashMap24 = completeGraphFactory13.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory25 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str26 = completeGraphFactory25.toString();
    java.lang.String str27 = completeGraphFactory25.toString();
    java.util.HashMap hashMap28 = completeGraphFactory25.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory29 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector30 = completeGraphFactory29.getSupportedLayouts();
    completeGraphFactory25.setSupportedLayouts(vector30);
    java.util.HashMap hashMap32 = completeGraphFactory25.getNeededProperties();
    java.util.Vector vector33 = completeGraphFactory25.getSupportedLayouts();
    completeGraphFactory13.setSupportedLayouts(vector33);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory35 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector36 = completeGraphFactory35.getSupportedLayouts();
    java.util.HashMap hashMap37 = completeGraphFactory35.getNeededProperties();
    java.lang.String str38 = completeGraphFactory35.toString();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory39 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector40 = completeGraphFactory39.getSupportedLayouts();
    java.lang.String str41 = completeGraphFactory39.toString();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory42 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str43 = completeGraphFactory42.toString();
    java.lang.String str44 = completeGraphFactory42.toString();
    java.util.Vector vector45 = completeGraphFactory42.getSupportedLayouts();
    completeGraphFactory39.setSupportedLayouts(vector45);
    completeGraphFactory35.setSupportedLayouts(vector45);
    completeGraphFactory13.setSupportedLayouts(vector45);
    completeGraphFactory0.setSupportedLayouts(vector45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Complete graph"+ "'", str3.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Complete graph"+ "'", str6.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Complete graph"+ "'", str8.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Complete graph"+ "'", str9.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Complete graph"+ "'", str14.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Complete graph"+ "'", str15.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Complete graph"+ "'", str19.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Complete graph"+ "'", str20.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Complete graph"+ "'", str26.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "Complete graph"+ "'", str27.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "Complete graph"+ "'", str38.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "Complete graph"+ "'", str41.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "Complete graph"+ "'", str43.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "Complete graph"+ "'", str44.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector45);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }

    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory0 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str1 = completeGraphFactory0.toString();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory2 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector3 = completeGraphFactory2.getSupportedLayouts();
    java.lang.String str4 = completeGraphFactory2.toString();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory5 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str6 = completeGraphFactory5.toString();
    java.lang.String str7 = completeGraphFactory5.toString();
    java.util.Vector vector8 = completeGraphFactory5.getSupportedLayouts();
    completeGraphFactory2.setSupportedLayouts(vector8);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory10 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str11 = completeGraphFactory10.toString();
    java.lang.String str12 = completeGraphFactory10.toString();
    java.util.Vector vector13 = completeGraphFactory10.getSupportedLayouts();
    java.util.Vector vector14 = completeGraphFactory10.getSupportedLayouts();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory15 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str16 = completeGraphFactory15.toString();
    java.lang.String str17 = completeGraphFactory15.toString();
    java.util.Vector vector18 = completeGraphFactory15.getSupportedLayouts();
    java.util.Vector vector19 = completeGraphFactory15.getSupportedLayouts();
    completeGraphFactory10.setSupportedLayouts(vector19);
    java.util.HashMap hashMap21 = completeGraphFactory10.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory22 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str23 = completeGraphFactory22.toString();
    java.lang.String str24 = completeGraphFactory22.toString();
    java.util.HashMap hashMap25 = completeGraphFactory22.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory26 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector27 = completeGraphFactory26.getSupportedLayouts();
    completeGraphFactory22.setSupportedLayouts(vector27);
    java.util.HashMap hashMap29 = completeGraphFactory22.getNeededProperties();
    java.util.Vector vector30 = completeGraphFactory22.getSupportedLayouts();
    completeGraphFactory10.setSupportedLayouts(vector30);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory32 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector33 = completeGraphFactory32.getSupportedLayouts();
    java.util.HashMap hashMap34 = completeGraphFactory32.getNeededProperties();
    java.lang.String str35 = completeGraphFactory32.toString();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory36 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector37 = completeGraphFactory36.getSupportedLayouts();
    java.lang.String str38 = completeGraphFactory36.toString();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory39 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str40 = completeGraphFactory39.toString();
    java.lang.String str41 = completeGraphFactory39.toString();
    java.util.Vector vector42 = completeGraphFactory39.getSupportedLayouts();
    completeGraphFactory36.setSupportedLayouts(vector42);
    completeGraphFactory32.setSupportedLayouts(vector42);
    completeGraphFactory10.setSupportedLayouts(vector42);
    completeGraphFactory2.setSupportedLayouts(vector42);
    completeGraphFactory0.setSupportedLayouts(vector42);
    java.util.HashMap hashMap48 = completeGraphFactory0.getNeededProperties();
    java.util.HashMap hashMap49 = completeGraphFactory0.getNeededProperties();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Complete graph"+ "'", str1.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Complete graph"+ "'", str4.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Complete graph"+ "'", str6.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Complete graph"+ "'", str7.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Complete graph"+ "'", str11.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Complete graph"+ "'", str12.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Complete graph"+ "'", str16.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Complete graph"+ "'", str17.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Complete graph"+ "'", str23.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Complete graph"+ "'", str24.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "Complete graph"+ "'", str35.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "Complete graph"+ "'", str38.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "Complete graph"+ "'", str40.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "Complete graph"+ "'", str41.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap49);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }

    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory0 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector1 = completeGraphFactory0.getSupportedLayouts();
    java.util.HashMap hashMap2 = completeGraphFactory0.getNeededProperties();
    java.lang.String str3 = completeGraphFactory0.toString();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory4 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector5 = completeGraphFactory4.getSupportedLayouts();
    java.lang.String str6 = completeGraphFactory4.toString();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory7 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str8 = completeGraphFactory7.toString();
    java.lang.String str9 = completeGraphFactory7.toString();
    java.util.Vector vector10 = completeGraphFactory7.getSupportedLayouts();
    completeGraphFactory4.setSupportedLayouts(vector10);
    completeGraphFactory0.setSupportedLayouts(vector10);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory13 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector14 = completeGraphFactory13.getSupportedLayouts();
    java.util.Vector vector15 = completeGraphFactory13.getSupportedLayouts();
    java.util.HashMap hashMap16 = completeGraphFactory13.getNeededProperties();
    java.util.HashMap hashMap17 = completeGraphFactory13.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph18 = completeGraphFactory0.createGraph(hashMap17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Complete graph"+ "'", str3.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Complete graph"+ "'", str6.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Complete graph"+ "'", str8.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Complete graph"+ "'", str9.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph18);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }

    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory0 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str1 = completeGraphFactory0.toString();
    java.lang.String str2 = completeGraphFactory0.toString();
    java.util.HashMap hashMap3 = completeGraphFactory0.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory4 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector5 = completeGraphFactory4.getSupportedLayouts();
    completeGraphFactory0.setSupportedLayouts(vector5);
    java.util.HashMap hashMap7 = completeGraphFactory0.getNeededProperties();
    java.util.Vector vector8 = completeGraphFactory0.getSupportedLayouts();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory9 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str10 = completeGraphFactory9.toString();
    java.lang.String str11 = completeGraphFactory9.toString();
    java.util.HashMap hashMap12 = completeGraphFactory9.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory13 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector14 = completeGraphFactory13.getSupportedLayouts();
    completeGraphFactory9.setSupportedLayouts(vector14);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory16 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector17 = completeGraphFactory16.getSupportedLayouts();
    java.util.HashMap hashMap18 = completeGraphFactory16.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph19 = completeGraphFactory9.createGraph(hashMap18);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory20 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str21 = completeGraphFactory20.toString();
    java.lang.String str22 = completeGraphFactory20.toString();
    java.util.HashMap hashMap23 = completeGraphFactory20.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory24 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector25 = completeGraphFactory24.getSupportedLayouts();
    completeGraphFactory20.setSupportedLayouts(vector25);
    java.util.HashMap hashMap27 = completeGraphFactory20.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph28 = completeGraphFactory9.createGraph(hashMap27);
    tccrouter.diamante.core.graph.Graph graph29 = completeGraphFactory0.createGraph(hashMap27);
    java.util.Vector vector30 = completeGraphFactory0.getSupportedLayouts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Complete graph"+ "'", str1.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Complete graph"+ "'", str2.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Complete graph"+ "'", str10.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Complete graph"+ "'", str11.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Complete graph"+ "'", str21.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Complete graph"+ "'", str22.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector30);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }

    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory0 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str1 = completeGraphFactory0.toString();
    java.lang.String str2 = completeGraphFactory0.toString();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory3 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str4 = completeGraphFactory3.toString();
    java.lang.String str5 = completeGraphFactory3.toString();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory6 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str7 = completeGraphFactory6.toString();
    java.lang.String str8 = completeGraphFactory6.toString();
    java.util.HashMap hashMap9 = completeGraphFactory6.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory10 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector11 = completeGraphFactory10.getSupportedLayouts();
    completeGraphFactory6.setSupportedLayouts(vector11);
    completeGraphFactory3.setSupportedLayouts(vector11);
    completeGraphFactory0.setSupportedLayouts(vector11);
    java.util.HashMap hashMap15 = completeGraphFactory0.getNeededProperties();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Complete graph"+ "'", str1.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Complete graph"+ "'", str2.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Complete graph"+ "'", str4.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Complete graph"+ "'", str5.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Complete graph"+ "'", str7.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Complete graph"+ "'", str8.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap15);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }

    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory0 = new tccrouter.user.factories.CompleteGraphFactory();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory1 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str2 = completeGraphFactory1.toString();
    java.lang.String str3 = completeGraphFactory1.toString();
    java.util.HashMap hashMap4 = completeGraphFactory1.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory5 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector6 = completeGraphFactory5.getSupportedLayouts();
    completeGraphFactory1.setSupportedLayouts(vector6);
    completeGraphFactory0.setSupportedLayouts(vector6);
    java.lang.String str9 = completeGraphFactory0.toString();
    java.util.Vector vector10 = completeGraphFactory0.getSupportedLayouts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Complete graph"+ "'", str2.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Complete graph"+ "'", str3.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Complete graph"+ "'", str9.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }

    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory0 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str1 = completeGraphFactory0.toString();
    java.lang.String str2 = completeGraphFactory0.toString();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory3 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str4 = completeGraphFactory3.toString();
    java.lang.String str5 = completeGraphFactory3.toString();
    java.util.HashMap hashMap6 = completeGraphFactory3.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory7 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector8 = completeGraphFactory7.getSupportedLayouts();
    completeGraphFactory3.setSupportedLayouts(vector8);
    completeGraphFactory0.setSupportedLayouts(vector8);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory11 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str12 = completeGraphFactory11.toString();
    java.lang.String str13 = completeGraphFactory11.toString();
    java.util.HashMap hashMap14 = completeGraphFactory11.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory15 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector16 = completeGraphFactory15.getSupportedLayouts();
    completeGraphFactory11.setSupportedLayouts(vector16);
    completeGraphFactory0.setSupportedLayouts(vector16);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory19 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector20 = completeGraphFactory19.getSupportedLayouts();
    java.util.Vector vector21 = completeGraphFactory19.getSupportedLayouts();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory22 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector23 = completeGraphFactory22.getSupportedLayouts();
    java.util.HashMap hashMap24 = completeGraphFactory22.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph25 = completeGraphFactory19.createGraph(hashMap24);
    tccrouter.diamante.core.graph.Graph graph26 = completeGraphFactory0.createGraph(hashMap24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Complete graph"+ "'", str1.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Complete graph"+ "'", str2.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Complete graph"+ "'", str4.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Complete graph"+ "'", str5.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Complete graph"+ "'", str12.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Complete graph"+ "'", str13.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph26);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }

    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory0 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str1 = completeGraphFactory0.toString();
    java.lang.String str2 = completeGraphFactory0.toString();
    java.util.HashMap hashMap3 = completeGraphFactory0.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory4 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector5 = completeGraphFactory4.getSupportedLayouts();
    java.lang.String str6 = completeGraphFactory4.toString();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory7 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str8 = completeGraphFactory7.toString();
    java.lang.String str9 = completeGraphFactory7.toString();
    java.util.Vector vector10 = completeGraphFactory7.getSupportedLayouts();
    completeGraphFactory4.setSupportedLayouts(vector10);
    completeGraphFactory0.setSupportedLayouts(vector10);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory13 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str14 = completeGraphFactory13.toString();
    java.lang.String str15 = completeGraphFactory13.toString();
    java.util.Vector vector16 = completeGraphFactory13.getSupportedLayouts();
    java.util.Vector vector17 = completeGraphFactory13.getSupportedLayouts();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory18 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str19 = completeGraphFactory18.toString();
    java.lang.String str20 = completeGraphFactory18.toString();
    java.util.Vector vector21 = completeGraphFactory18.getSupportedLayouts();
    java.util.Vector vector22 = completeGraphFactory18.getSupportedLayouts();
    completeGraphFactory13.setSupportedLayouts(vector22);
    java.util.HashMap hashMap24 = completeGraphFactory13.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory25 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str26 = completeGraphFactory25.toString();
    java.lang.String str27 = completeGraphFactory25.toString();
    java.util.HashMap hashMap28 = completeGraphFactory25.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory29 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector30 = completeGraphFactory29.getSupportedLayouts();
    completeGraphFactory25.setSupportedLayouts(vector30);
    java.util.HashMap hashMap32 = completeGraphFactory25.getNeededProperties();
    java.util.Vector vector33 = completeGraphFactory25.getSupportedLayouts();
    completeGraphFactory13.setSupportedLayouts(vector33);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory35 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str36 = completeGraphFactory35.toString();
    java.lang.String str37 = completeGraphFactory35.toString();
    java.util.Vector vector38 = completeGraphFactory35.getSupportedLayouts();
    java.util.Vector vector39 = completeGraphFactory35.getSupportedLayouts();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory40 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str41 = completeGraphFactory40.toString();
    java.lang.String str42 = completeGraphFactory40.toString();
    java.util.Vector vector43 = completeGraphFactory40.getSupportedLayouts();
    java.util.Vector vector44 = completeGraphFactory40.getSupportedLayouts();
    completeGraphFactory35.setSupportedLayouts(vector44);
    completeGraphFactory13.setSupportedLayouts(vector44);
    completeGraphFactory0.setSupportedLayouts(vector44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Complete graph"+ "'", str1.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Complete graph"+ "'", str2.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Complete graph"+ "'", str6.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Complete graph"+ "'", str8.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Complete graph"+ "'", str9.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Complete graph"+ "'", str14.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Complete graph"+ "'", str15.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Complete graph"+ "'", str19.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Complete graph"+ "'", str20.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Complete graph"+ "'", str26.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "Complete graph"+ "'", str27.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "Complete graph"+ "'", str36.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "Complete graph"+ "'", str37.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "Complete graph"+ "'", str41.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "Complete graph"+ "'", str42.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector44);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }

    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory0 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str1 = completeGraphFactory0.toString();
    java.lang.String str2 = completeGraphFactory0.toString();
    java.util.Vector vector3 = completeGraphFactory0.getSupportedLayouts();
    java.util.Vector vector4 = completeGraphFactory0.getSupportedLayouts();
    java.lang.String str5 = completeGraphFactory0.toString();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory6 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str7 = completeGraphFactory6.toString();
    java.lang.String str8 = completeGraphFactory6.toString();
    java.util.HashMap hashMap9 = completeGraphFactory6.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory10 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector11 = completeGraphFactory10.getSupportedLayouts();
    completeGraphFactory6.setSupportedLayouts(vector11);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory13 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector14 = completeGraphFactory13.getSupportedLayouts();
    java.util.HashMap hashMap15 = completeGraphFactory13.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph16 = completeGraphFactory6.createGraph(hashMap15);
    tccrouter.diamante.core.graph.Graph graph17 = completeGraphFactory0.createGraph(hashMap15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Complete graph"+ "'", str1.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Complete graph"+ "'", str2.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Complete graph"+ "'", str5.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Complete graph"+ "'", str7.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Complete graph"+ "'", str8.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph17);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }

    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory0 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str1 = completeGraphFactory0.toString();
    java.lang.String str2 = completeGraphFactory0.toString();
    java.util.Vector vector3 = completeGraphFactory0.getSupportedLayouts();
    java.util.Vector vector4 = completeGraphFactory0.getSupportedLayouts();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory5 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str6 = completeGraphFactory5.toString();
    java.lang.String str7 = completeGraphFactory5.toString();
    java.util.Vector vector8 = completeGraphFactory5.getSupportedLayouts();
    java.util.Vector vector9 = completeGraphFactory5.getSupportedLayouts();
    completeGraphFactory0.setSupportedLayouts(vector9);
    java.util.HashMap hashMap11 = completeGraphFactory0.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory12 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str13 = completeGraphFactory12.toString();
    java.lang.String str14 = completeGraphFactory12.toString();
    java.util.HashMap hashMap15 = completeGraphFactory12.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory16 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector17 = completeGraphFactory16.getSupportedLayouts();
    completeGraphFactory12.setSupportedLayouts(vector17);
    java.util.HashMap hashMap19 = completeGraphFactory12.getNeededProperties();
    java.util.Vector vector20 = completeGraphFactory12.getSupportedLayouts();
    completeGraphFactory0.setSupportedLayouts(vector20);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory22 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector23 = completeGraphFactory22.getSupportedLayouts();
    java.util.HashMap hashMap24 = completeGraphFactory22.getNeededProperties();
    java.lang.String str25 = completeGraphFactory22.toString();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory26 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector27 = completeGraphFactory26.getSupportedLayouts();
    java.lang.String str28 = completeGraphFactory26.toString();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory29 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str30 = completeGraphFactory29.toString();
    java.lang.String str31 = completeGraphFactory29.toString();
    java.util.Vector vector32 = completeGraphFactory29.getSupportedLayouts();
    completeGraphFactory26.setSupportedLayouts(vector32);
    completeGraphFactory22.setSupportedLayouts(vector32);
    completeGraphFactory0.setSupportedLayouts(vector32);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory36 = new tccrouter.user.factories.CompleteGraphFactory();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory37 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str38 = completeGraphFactory37.toString();
    java.lang.String str39 = completeGraphFactory37.toString();
    java.util.HashMap hashMap40 = completeGraphFactory37.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory41 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector42 = completeGraphFactory41.getSupportedLayouts();
    completeGraphFactory37.setSupportedLayouts(vector42);
    completeGraphFactory36.setSupportedLayouts(vector42);
    java.lang.String str45 = completeGraphFactory36.toString();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory46 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str47 = completeGraphFactory46.toString();
    java.lang.String str48 = completeGraphFactory46.toString();
    java.util.HashMap hashMap49 = completeGraphFactory46.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory50 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector51 = completeGraphFactory50.getSupportedLayouts();
    completeGraphFactory46.setSupportedLayouts(vector51);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory53 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector54 = completeGraphFactory53.getSupportedLayouts();
    java.util.HashMap hashMap55 = completeGraphFactory53.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph56 = completeGraphFactory46.createGraph(hashMap55);
    tccrouter.diamante.core.graph.Graph graph57 = completeGraphFactory36.createGraph(hashMap55);
    tccrouter.diamante.core.graph.Graph graph58 = completeGraphFactory0.createGraph(hashMap55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Complete graph"+ "'", str1.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Complete graph"+ "'", str2.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Complete graph"+ "'", str6.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Complete graph"+ "'", str7.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Complete graph"+ "'", str13.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Complete graph"+ "'", str14.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Complete graph"+ "'", str25.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "Complete graph"+ "'", str28.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "Complete graph"+ "'", str30.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "Complete graph"+ "'", str31.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "Complete graph"+ "'", str38.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "Complete graph"+ "'", str39.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "Complete graph"+ "'", str45.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "Complete graph"+ "'", str47.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "Complete graph"+ "'", str48.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph58);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test23"); }

    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory0 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str1 = completeGraphFactory0.toString();
    java.lang.String str2 = completeGraphFactory0.toString();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory3 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str4 = completeGraphFactory3.toString();
    java.lang.String str5 = completeGraphFactory3.toString();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory6 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str7 = completeGraphFactory6.toString();
    java.lang.String str8 = completeGraphFactory6.toString();
    java.util.HashMap hashMap9 = completeGraphFactory6.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory10 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector11 = completeGraphFactory10.getSupportedLayouts();
    completeGraphFactory6.setSupportedLayouts(vector11);
    completeGraphFactory3.setSupportedLayouts(vector11);
    completeGraphFactory0.setSupportedLayouts(vector11);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory15 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str16 = completeGraphFactory15.toString();
    java.lang.String str17 = completeGraphFactory15.toString();
    java.util.HashMap hashMap18 = completeGraphFactory15.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory19 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector20 = completeGraphFactory19.getSupportedLayouts();
    completeGraphFactory15.setSupportedLayouts(vector20);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory22 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector23 = completeGraphFactory22.getSupportedLayouts();
    java.util.HashMap hashMap24 = completeGraphFactory22.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph25 = completeGraphFactory15.createGraph(hashMap24);
    java.util.Vector vector26 = completeGraphFactory15.getSupportedLayouts();
    completeGraphFactory0.setSupportedLayouts(vector26);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory28 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str29 = completeGraphFactory28.toString();
    java.lang.String str30 = completeGraphFactory28.toString();
    java.util.HashMap hashMap31 = completeGraphFactory28.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory32 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector33 = completeGraphFactory32.getSupportedLayouts();
    completeGraphFactory28.setSupportedLayouts(vector33);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory35 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector36 = completeGraphFactory35.getSupportedLayouts();
    java.util.HashMap hashMap37 = completeGraphFactory35.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph38 = completeGraphFactory28.createGraph(hashMap37);
    tccrouter.diamante.core.graph.Graph graph39 = completeGraphFactory0.createGraph(hashMap37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Complete graph"+ "'", str1.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Complete graph"+ "'", str2.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Complete graph"+ "'", str4.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Complete graph"+ "'", str5.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Complete graph"+ "'", str7.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Complete graph"+ "'", str8.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Complete graph"+ "'", str16.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Complete graph"+ "'", str17.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "Complete graph"+ "'", str29.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "Complete graph"+ "'", str30.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph39);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test24"); }

    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory0 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str1 = completeGraphFactory0.toString();
    java.lang.String str2 = completeGraphFactory0.toString();
    java.util.HashMap hashMap3 = completeGraphFactory0.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory4 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector5 = completeGraphFactory4.getSupportedLayouts();
    completeGraphFactory0.setSupportedLayouts(vector5);
    java.util.Vector vector7 = completeGraphFactory0.getSupportedLayouts();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory8 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector9 = completeGraphFactory8.getSupportedLayouts();
    java.util.Vector vector10 = completeGraphFactory8.getSupportedLayouts();
    completeGraphFactory0.setSupportedLayouts(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Complete graph"+ "'", str1.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Complete graph"+ "'", str2.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test25"); }

    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory0 = new tccrouter.user.factories.CompleteGraphFactory();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory1 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str2 = completeGraphFactory1.toString();
    java.lang.String str3 = completeGraphFactory1.toString();
    java.util.HashMap hashMap4 = completeGraphFactory1.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory5 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector6 = completeGraphFactory5.getSupportedLayouts();
    completeGraphFactory1.setSupportedLayouts(vector6);
    completeGraphFactory0.setSupportedLayouts(vector6);
    java.lang.String str9 = completeGraphFactory0.toString();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory10 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str11 = completeGraphFactory10.toString();
    java.lang.String str12 = completeGraphFactory10.toString();
    java.util.HashMap hashMap13 = completeGraphFactory10.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory14 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector15 = completeGraphFactory14.getSupportedLayouts();
    completeGraphFactory10.setSupportedLayouts(vector15);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory17 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector18 = completeGraphFactory17.getSupportedLayouts();
    java.util.HashMap hashMap19 = completeGraphFactory17.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph20 = completeGraphFactory10.createGraph(hashMap19);
    tccrouter.diamante.core.graph.Graph graph21 = completeGraphFactory0.createGraph(hashMap19);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory22 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str23 = completeGraphFactory22.toString();
    java.lang.String str24 = completeGraphFactory22.toString();
    java.util.HashMap hashMap25 = completeGraphFactory22.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory26 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector27 = completeGraphFactory26.getSupportedLayouts();
    completeGraphFactory22.setSupportedLayouts(vector27);
    java.util.HashMap hashMap29 = completeGraphFactory22.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory30 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector31 = completeGraphFactory30.getSupportedLayouts();
    java.util.Vector vector32 = completeGraphFactory30.getSupportedLayouts();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory33 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector34 = completeGraphFactory33.getSupportedLayouts();
    java.util.HashMap hashMap35 = completeGraphFactory33.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph36 = completeGraphFactory30.createGraph(hashMap35);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory37 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str38 = completeGraphFactory37.toString();
    java.lang.String str39 = completeGraphFactory37.toString();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory40 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str41 = completeGraphFactory40.toString();
    java.lang.String str42 = completeGraphFactory40.toString();
    java.util.HashMap hashMap43 = completeGraphFactory40.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory44 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector45 = completeGraphFactory44.getSupportedLayouts();
    completeGraphFactory40.setSupportedLayouts(vector45);
    completeGraphFactory37.setSupportedLayouts(vector45);
    completeGraphFactory30.setSupportedLayouts(vector45);
    completeGraphFactory22.setSupportedLayouts(vector45);
    completeGraphFactory0.setSupportedLayouts(vector45);
    java.util.HashMap hashMap51 = completeGraphFactory0.getNeededProperties();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Complete graph"+ "'", str2.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Complete graph"+ "'", str3.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Complete graph"+ "'", str9.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Complete graph"+ "'", str11.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Complete graph"+ "'", str12.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Complete graph"+ "'", str23.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Complete graph"+ "'", str24.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "Complete graph"+ "'", str38.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "Complete graph"+ "'", str39.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "Complete graph"+ "'", str41.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "Complete graph"+ "'", str42.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap51);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test26"); }

    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory0 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str1 = completeGraphFactory0.toString();
    java.lang.String str2 = completeGraphFactory0.toString();
    java.util.HashMap hashMap3 = completeGraphFactory0.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory4 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector5 = completeGraphFactory4.getSupportedLayouts();
    completeGraphFactory0.setSupportedLayouts(vector5);
    java.util.HashMap hashMap7 = completeGraphFactory0.getNeededProperties();
    java.util.Vector vector8 = completeGraphFactory0.getSupportedLayouts();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory9 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str10 = completeGraphFactory9.toString();
    java.lang.String str11 = completeGraphFactory9.toString();
    java.util.HashMap hashMap12 = completeGraphFactory9.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory13 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector14 = completeGraphFactory13.getSupportedLayouts();
    completeGraphFactory9.setSupportedLayouts(vector14);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory16 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector17 = completeGraphFactory16.getSupportedLayouts();
    java.util.HashMap hashMap18 = completeGraphFactory16.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph19 = completeGraphFactory9.createGraph(hashMap18);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory20 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str21 = completeGraphFactory20.toString();
    java.lang.String str22 = completeGraphFactory20.toString();
    java.util.HashMap hashMap23 = completeGraphFactory20.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory24 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector25 = completeGraphFactory24.getSupportedLayouts();
    completeGraphFactory20.setSupportedLayouts(vector25);
    java.util.HashMap hashMap27 = completeGraphFactory20.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph28 = completeGraphFactory9.createGraph(hashMap27);
    tccrouter.diamante.core.graph.Graph graph29 = completeGraphFactory0.createGraph(hashMap27);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory30 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector31 = completeGraphFactory30.getSupportedLayouts();
    java.util.Vector vector32 = completeGraphFactory30.getSupportedLayouts();
    java.util.HashMap hashMap33 = completeGraphFactory30.getNeededProperties();
    java.util.HashMap hashMap34 = completeGraphFactory30.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph35 = completeGraphFactory0.createGraph(hashMap34);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory36 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str37 = completeGraphFactory36.toString();
    java.lang.String str38 = completeGraphFactory36.toString();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory39 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str40 = completeGraphFactory39.toString();
    java.lang.String str41 = completeGraphFactory39.toString();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory42 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str43 = completeGraphFactory42.toString();
    java.lang.String str44 = completeGraphFactory42.toString();
    java.util.HashMap hashMap45 = completeGraphFactory42.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory46 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector47 = completeGraphFactory46.getSupportedLayouts();
    completeGraphFactory42.setSupportedLayouts(vector47);
    completeGraphFactory39.setSupportedLayouts(vector47);
    completeGraphFactory36.setSupportedLayouts(vector47);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory51 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str52 = completeGraphFactory51.toString();
    java.lang.String str53 = completeGraphFactory51.toString();
    java.util.HashMap hashMap54 = completeGraphFactory51.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory55 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector56 = completeGraphFactory55.getSupportedLayouts();
    completeGraphFactory51.setSupportedLayouts(vector56);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory58 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector59 = completeGraphFactory58.getSupportedLayouts();
    java.util.HashMap hashMap60 = completeGraphFactory58.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph61 = completeGraphFactory51.createGraph(hashMap60);
    java.util.Vector vector62 = completeGraphFactory51.getSupportedLayouts();
    completeGraphFactory36.setSupportedLayouts(vector62);
    completeGraphFactory0.setSupportedLayouts(vector62);
    java.lang.String str65 = completeGraphFactory0.toString();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory66 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str67 = completeGraphFactory66.toString();
    java.lang.String str68 = completeGraphFactory66.toString();
    java.util.Vector vector69 = completeGraphFactory66.getSupportedLayouts();
    java.util.Vector vector70 = completeGraphFactory66.getSupportedLayouts();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory71 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str72 = completeGraphFactory71.toString();
    java.lang.String str73 = completeGraphFactory71.toString();
    java.util.Vector vector74 = completeGraphFactory71.getSupportedLayouts();
    java.util.Vector vector75 = completeGraphFactory71.getSupportedLayouts();
    completeGraphFactory66.setSupportedLayouts(vector75);
    java.util.HashMap hashMap77 = completeGraphFactory66.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory78 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str79 = completeGraphFactory78.toString();
    java.lang.String str80 = completeGraphFactory78.toString();
    java.util.HashMap hashMap81 = completeGraphFactory78.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory82 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector83 = completeGraphFactory82.getSupportedLayouts();
    completeGraphFactory78.setSupportedLayouts(vector83);
    java.util.HashMap hashMap85 = completeGraphFactory78.getNeededProperties();
    java.util.Vector vector86 = completeGraphFactory78.getSupportedLayouts();
    completeGraphFactory66.setSupportedLayouts(vector86);
    java.util.Vector vector88 = completeGraphFactory66.getSupportedLayouts();
    completeGraphFactory0.setSupportedLayouts(vector88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Complete graph"+ "'", str1.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Complete graph"+ "'", str2.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Complete graph"+ "'", str10.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Complete graph"+ "'", str11.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Complete graph"+ "'", str21.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Complete graph"+ "'", str22.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "Complete graph"+ "'", str37.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "Complete graph"+ "'", str38.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "Complete graph"+ "'", str40.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "Complete graph"+ "'", str41.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "Complete graph"+ "'", str43.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "Complete graph"+ "'", str44.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "Complete graph"+ "'", str52.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "Complete graph"+ "'", str53.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str65 + "' != '" + "Complete graph"+ "'", str65.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str67 + "' != '" + "Complete graph"+ "'", str67.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str68 + "' != '" + "Complete graph"+ "'", str68.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str72 + "' != '" + "Complete graph"+ "'", str72.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str73 + "' != '" + "Complete graph"+ "'", str73.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str79 + "' != '" + "Complete graph"+ "'", str79.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str80 + "' != '" + "Complete graph"+ "'", str80.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector88);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test27"); }

    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory0 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str1 = completeGraphFactory0.toString();
    java.lang.String str2 = completeGraphFactory0.toString();
    java.util.HashMap hashMap3 = completeGraphFactory0.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory4 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector5 = completeGraphFactory4.getSupportedLayouts();
    completeGraphFactory0.setSupportedLayouts(vector5);
    java.util.HashMap hashMap7 = completeGraphFactory0.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory8 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector9 = completeGraphFactory8.getSupportedLayouts();
    java.util.Vector vector10 = completeGraphFactory8.getSupportedLayouts();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory11 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector12 = completeGraphFactory11.getSupportedLayouts();
    java.util.HashMap hashMap13 = completeGraphFactory11.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph14 = completeGraphFactory8.createGraph(hashMap13);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory15 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str16 = completeGraphFactory15.toString();
    java.lang.String str17 = completeGraphFactory15.toString();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory18 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str19 = completeGraphFactory18.toString();
    java.lang.String str20 = completeGraphFactory18.toString();
    java.util.HashMap hashMap21 = completeGraphFactory18.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory22 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector23 = completeGraphFactory22.getSupportedLayouts();
    completeGraphFactory18.setSupportedLayouts(vector23);
    completeGraphFactory15.setSupportedLayouts(vector23);
    completeGraphFactory8.setSupportedLayouts(vector23);
    completeGraphFactory0.setSupportedLayouts(vector23);
    java.util.Vector vector28 = completeGraphFactory0.getSupportedLayouts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Complete graph"+ "'", str1.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Complete graph"+ "'", str2.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Complete graph"+ "'", str16.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Complete graph"+ "'", str17.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Complete graph"+ "'", str19.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Complete graph"+ "'", str20.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector28);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test28"); }

    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory0 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str1 = completeGraphFactory0.toString();
    java.lang.String str2 = completeGraphFactory0.toString();
    java.util.HashMap hashMap3 = completeGraphFactory0.getNeededProperties();
    java.lang.String str4 = completeGraphFactory0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Complete graph"+ "'", str1.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Complete graph"+ "'", str2.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Complete graph"+ "'", str4.equals("Complete graph"));

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test29"); }

    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory0 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector1 = completeGraphFactory0.getSupportedLayouts();
    java.util.Vector vector2 = completeGraphFactory0.getSupportedLayouts();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory3 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector4 = completeGraphFactory3.getSupportedLayouts();
    java.util.HashMap hashMap5 = completeGraphFactory3.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph6 = completeGraphFactory0.createGraph(hashMap5);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory7 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str8 = completeGraphFactory7.toString();
    java.lang.String str9 = completeGraphFactory7.toString();
    java.util.Vector vector10 = completeGraphFactory7.getSupportedLayouts();
    java.util.Vector vector11 = completeGraphFactory7.getSupportedLayouts();
    completeGraphFactory0.setSupportedLayouts(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Complete graph"+ "'", str8.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Complete graph"+ "'", str9.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test30"); }

    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory0 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str1 = completeGraphFactory0.toString();
    java.lang.String str2 = completeGraphFactory0.toString();
    java.util.HashMap hashMap3 = completeGraphFactory0.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory4 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector5 = completeGraphFactory4.getSupportedLayouts();
    completeGraphFactory0.setSupportedLayouts(vector5);
    java.util.HashMap hashMap7 = completeGraphFactory0.getNeededProperties();
    java.util.Vector vector8 = completeGraphFactory0.getSupportedLayouts();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory9 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str10 = completeGraphFactory9.toString();
    java.lang.String str11 = completeGraphFactory9.toString();
    java.util.HashMap hashMap12 = completeGraphFactory9.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory13 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector14 = completeGraphFactory13.getSupportedLayouts();
    completeGraphFactory9.setSupportedLayouts(vector14);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory16 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector17 = completeGraphFactory16.getSupportedLayouts();
    java.util.HashMap hashMap18 = completeGraphFactory16.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph19 = completeGraphFactory9.createGraph(hashMap18);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory20 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str21 = completeGraphFactory20.toString();
    java.lang.String str22 = completeGraphFactory20.toString();
    java.util.HashMap hashMap23 = completeGraphFactory20.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory24 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector25 = completeGraphFactory24.getSupportedLayouts();
    completeGraphFactory20.setSupportedLayouts(vector25);
    java.util.HashMap hashMap27 = completeGraphFactory20.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph28 = completeGraphFactory9.createGraph(hashMap27);
    tccrouter.diamante.core.graph.Graph graph29 = completeGraphFactory0.createGraph(hashMap27);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory30 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector31 = completeGraphFactory30.getSupportedLayouts();
    java.util.Vector vector32 = completeGraphFactory30.getSupportedLayouts();
    java.util.HashMap hashMap33 = completeGraphFactory30.getNeededProperties();
    java.util.HashMap hashMap34 = completeGraphFactory30.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph35 = completeGraphFactory0.createGraph(hashMap34);
    java.lang.String str36 = completeGraphFactory0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Complete graph"+ "'", str1.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Complete graph"+ "'", str2.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Complete graph"+ "'", str10.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Complete graph"+ "'", str11.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Complete graph"+ "'", str21.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Complete graph"+ "'", str22.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "Complete graph"+ "'", str36.equals("Complete graph"));

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test31"); }

    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory0 = new tccrouter.user.factories.CompleteGraphFactory();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory1 = new tccrouter.user.factories.CompleteGraphFactory();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory2 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str3 = completeGraphFactory2.toString();
    java.lang.String str4 = completeGraphFactory2.toString();
    java.util.HashMap hashMap5 = completeGraphFactory2.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory6 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector7 = completeGraphFactory6.getSupportedLayouts();
    completeGraphFactory2.setSupportedLayouts(vector7);
    completeGraphFactory1.setSupportedLayouts(vector7);
    java.lang.String str10 = completeGraphFactory1.toString();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory11 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str12 = completeGraphFactory11.toString();
    java.lang.String str13 = completeGraphFactory11.toString();
    java.util.HashMap hashMap14 = completeGraphFactory11.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory15 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector16 = completeGraphFactory15.getSupportedLayouts();
    completeGraphFactory11.setSupportedLayouts(vector16);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory18 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector19 = completeGraphFactory18.getSupportedLayouts();
    java.util.HashMap hashMap20 = completeGraphFactory18.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph21 = completeGraphFactory11.createGraph(hashMap20);
    tccrouter.diamante.core.graph.Graph graph22 = completeGraphFactory1.createGraph(hashMap20);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory23 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str24 = completeGraphFactory23.toString();
    java.lang.String str25 = completeGraphFactory23.toString();
    java.util.HashMap hashMap26 = completeGraphFactory23.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory27 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector28 = completeGraphFactory27.getSupportedLayouts();
    completeGraphFactory23.setSupportedLayouts(vector28);
    java.util.HashMap hashMap30 = completeGraphFactory23.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory31 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector32 = completeGraphFactory31.getSupportedLayouts();
    java.util.Vector vector33 = completeGraphFactory31.getSupportedLayouts();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory34 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector35 = completeGraphFactory34.getSupportedLayouts();
    java.util.HashMap hashMap36 = completeGraphFactory34.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph37 = completeGraphFactory31.createGraph(hashMap36);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory38 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str39 = completeGraphFactory38.toString();
    java.lang.String str40 = completeGraphFactory38.toString();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory41 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str42 = completeGraphFactory41.toString();
    java.lang.String str43 = completeGraphFactory41.toString();
    java.util.HashMap hashMap44 = completeGraphFactory41.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory45 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector46 = completeGraphFactory45.getSupportedLayouts();
    completeGraphFactory41.setSupportedLayouts(vector46);
    completeGraphFactory38.setSupportedLayouts(vector46);
    completeGraphFactory31.setSupportedLayouts(vector46);
    completeGraphFactory23.setSupportedLayouts(vector46);
    completeGraphFactory1.setSupportedLayouts(vector46);
    completeGraphFactory0.setSupportedLayouts(vector46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Complete graph"+ "'", str3.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Complete graph"+ "'", str4.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Complete graph"+ "'", str10.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Complete graph"+ "'", str12.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Complete graph"+ "'", str13.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Complete graph"+ "'", str24.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Complete graph"+ "'", str25.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "Complete graph"+ "'", str39.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "Complete graph"+ "'", str40.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "Complete graph"+ "'", str42.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "Complete graph"+ "'", str43.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector46);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test32"); }

    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory0 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str1 = completeGraphFactory0.toString();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory2 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector3 = completeGraphFactory2.getSupportedLayouts();
    java.lang.String str4 = completeGraphFactory2.toString();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory5 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str6 = completeGraphFactory5.toString();
    java.lang.String str7 = completeGraphFactory5.toString();
    java.util.Vector vector8 = completeGraphFactory5.getSupportedLayouts();
    completeGraphFactory2.setSupportedLayouts(vector8);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory10 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str11 = completeGraphFactory10.toString();
    java.lang.String str12 = completeGraphFactory10.toString();
    java.util.Vector vector13 = completeGraphFactory10.getSupportedLayouts();
    java.util.Vector vector14 = completeGraphFactory10.getSupportedLayouts();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory15 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str16 = completeGraphFactory15.toString();
    java.lang.String str17 = completeGraphFactory15.toString();
    java.util.Vector vector18 = completeGraphFactory15.getSupportedLayouts();
    java.util.Vector vector19 = completeGraphFactory15.getSupportedLayouts();
    completeGraphFactory10.setSupportedLayouts(vector19);
    java.util.HashMap hashMap21 = completeGraphFactory10.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory22 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str23 = completeGraphFactory22.toString();
    java.lang.String str24 = completeGraphFactory22.toString();
    java.util.HashMap hashMap25 = completeGraphFactory22.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory26 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector27 = completeGraphFactory26.getSupportedLayouts();
    completeGraphFactory22.setSupportedLayouts(vector27);
    java.util.HashMap hashMap29 = completeGraphFactory22.getNeededProperties();
    java.util.Vector vector30 = completeGraphFactory22.getSupportedLayouts();
    completeGraphFactory10.setSupportedLayouts(vector30);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory32 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector33 = completeGraphFactory32.getSupportedLayouts();
    java.util.HashMap hashMap34 = completeGraphFactory32.getNeededProperties();
    java.lang.String str35 = completeGraphFactory32.toString();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory36 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector37 = completeGraphFactory36.getSupportedLayouts();
    java.lang.String str38 = completeGraphFactory36.toString();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory39 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str40 = completeGraphFactory39.toString();
    java.lang.String str41 = completeGraphFactory39.toString();
    java.util.Vector vector42 = completeGraphFactory39.getSupportedLayouts();
    completeGraphFactory36.setSupportedLayouts(vector42);
    completeGraphFactory32.setSupportedLayouts(vector42);
    completeGraphFactory10.setSupportedLayouts(vector42);
    completeGraphFactory2.setSupportedLayouts(vector42);
    completeGraphFactory0.setSupportedLayouts(vector42);
    java.lang.String str48 = completeGraphFactory0.toString();
    java.util.Vector vector49 = completeGraphFactory0.getSupportedLayouts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Complete graph"+ "'", str1.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Complete graph"+ "'", str4.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Complete graph"+ "'", str6.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Complete graph"+ "'", str7.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Complete graph"+ "'", str11.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Complete graph"+ "'", str12.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Complete graph"+ "'", str16.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Complete graph"+ "'", str17.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Complete graph"+ "'", str23.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Complete graph"+ "'", str24.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "Complete graph"+ "'", str35.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "Complete graph"+ "'", str38.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "Complete graph"+ "'", str40.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "Complete graph"+ "'", str41.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "Complete graph"+ "'", str48.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector49);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test33"); }

    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory0 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str1 = completeGraphFactory0.toString();
    java.util.HashMap hashMap2 = completeGraphFactory0.getNeededProperties();
    java.util.HashMap hashMap3 = completeGraphFactory0.getNeededProperties();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Complete graph"+ "'", str1.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap3);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test34"); }

    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory0 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector1 = completeGraphFactory0.getSupportedLayouts();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory2 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str3 = completeGraphFactory2.toString();
    java.lang.String str4 = completeGraphFactory2.toString();
    java.util.HashMap hashMap5 = completeGraphFactory2.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory6 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector7 = completeGraphFactory6.getSupportedLayouts();
    completeGraphFactory2.setSupportedLayouts(vector7);
    java.util.HashMap hashMap9 = completeGraphFactory2.getNeededProperties();
    java.util.Vector vector10 = completeGraphFactory2.getSupportedLayouts();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory11 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str12 = completeGraphFactory11.toString();
    java.lang.String str13 = completeGraphFactory11.toString();
    java.util.HashMap hashMap14 = completeGraphFactory11.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory15 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector16 = completeGraphFactory15.getSupportedLayouts();
    completeGraphFactory11.setSupportedLayouts(vector16);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory18 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector19 = completeGraphFactory18.getSupportedLayouts();
    java.util.HashMap hashMap20 = completeGraphFactory18.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph21 = completeGraphFactory11.createGraph(hashMap20);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory22 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str23 = completeGraphFactory22.toString();
    java.lang.String str24 = completeGraphFactory22.toString();
    java.util.HashMap hashMap25 = completeGraphFactory22.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory26 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector27 = completeGraphFactory26.getSupportedLayouts();
    completeGraphFactory22.setSupportedLayouts(vector27);
    java.util.HashMap hashMap29 = completeGraphFactory22.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph30 = completeGraphFactory11.createGraph(hashMap29);
    tccrouter.diamante.core.graph.Graph graph31 = completeGraphFactory2.createGraph(hashMap29);
    tccrouter.diamante.core.graph.Graph graph32 = completeGraphFactory0.createGraph(hashMap29);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory33 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str34 = completeGraphFactory33.toString();
    java.lang.String str35 = completeGraphFactory33.toString();
    java.util.HashMap hashMap36 = completeGraphFactory33.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph37 = completeGraphFactory0.createGraph(hashMap36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Complete graph"+ "'", str3.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Complete graph"+ "'", str4.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Complete graph"+ "'", str12.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Complete graph"+ "'", str13.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Complete graph"+ "'", str23.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Complete graph"+ "'", str24.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "Complete graph"+ "'", str34.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "Complete graph"+ "'", str35.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph37);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test35"); }

    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory0 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str1 = completeGraphFactory0.toString();
    java.lang.String str2 = completeGraphFactory0.toString();
    java.util.Vector vector3 = completeGraphFactory0.getSupportedLayouts();
    java.util.Vector vector4 = completeGraphFactory0.getSupportedLayouts();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory5 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str6 = completeGraphFactory5.toString();
    java.lang.String str7 = completeGraphFactory5.toString();
    java.util.Vector vector8 = completeGraphFactory5.getSupportedLayouts();
    java.util.Vector vector9 = completeGraphFactory5.getSupportedLayouts();
    completeGraphFactory0.setSupportedLayouts(vector9);
    java.util.HashMap hashMap11 = completeGraphFactory0.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory12 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str13 = completeGraphFactory12.toString();
    java.lang.String str14 = completeGraphFactory12.toString();
    java.util.HashMap hashMap15 = completeGraphFactory12.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory16 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector17 = completeGraphFactory16.getSupportedLayouts();
    completeGraphFactory12.setSupportedLayouts(vector17);
    java.util.HashMap hashMap19 = completeGraphFactory12.getNeededProperties();
    java.util.Vector vector20 = completeGraphFactory12.getSupportedLayouts();
    completeGraphFactory0.setSupportedLayouts(vector20);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory22 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector23 = completeGraphFactory22.getSupportedLayouts();
    java.util.HashMap hashMap24 = completeGraphFactory22.getNeededProperties();
    java.lang.String str25 = completeGraphFactory22.toString();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory26 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector27 = completeGraphFactory26.getSupportedLayouts();
    java.lang.String str28 = completeGraphFactory26.toString();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory29 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str30 = completeGraphFactory29.toString();
    java.lang.String str31 = completeGraphFactory29.toString();
    java.util.Vector vector32 = completeGraphFactory29.getSupportedLayouts();
    completeGraphFactory26.setSupportedLayouts(vector32);
    completeGraphFactory22.setSupportedLayouts(vector32);
    completeGraphFactory0.setSupportedLayouts(vector32);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory36 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector37 = completeGraphFactory36.getSupportedLayouts();
    java.lang.String str38 = completeGraphFactory36.toString();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory39 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str40 = completeGraphFactory39.toString();
    java.lang.String str41 = completeGraphFactory39.toString();
    java.util.Vector vector42 = completeGraphFactory39.getSupportedLayouts();
    completeGraphFactory36.setSupportedLayouts(vector42);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory44 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str45 = completeGraphFactory44.toString();
    java.lang.String str46 = completeGraphFactory44.toString();
    java.util.Vector vector47 = completeGraphFactory44.getSupportedLayouts();
    java.util.Vector vector48 = completeGraphFactory44.getSupportedLayouts();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory49 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str50 = completeGraphFactory49.toString();
    java.lang.String str51 = completeGraphFactory49.toString();
    java.util.Vector vector52 = completeGraphFactory49.getSupportedLayouts();
    java.util.Vector vector53 = completeGraphFactory49.getSupportedLayouts();
    completeGraphFactory44.setSupportedLayouts(vector53);
    java.util.HashMap hashMap55 = completeGraphFactory44.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory56 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str57 = completeGraphFactory56.toString();
    java.lang.String str58 = completeGraphFactory56.toString();
    java.util.HashMap hashMap59 = completeGraphFactory56.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory60 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector61 = completeGraphFactory60.getSupportedLayouts();
    completeGraphFactory56.setSupportedLayouts(vector61);
    java.util.HashMap hashMap63 = completeGraphFactory56.getNeededProperties();
    java.util.Vector vector64 = completeGraphFactory56.getSupportedLayouts();
    completeGraphFactory44.setSupportedLayouts(vector64);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory66 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector67 = completeGraphFactory66.getSupportedLayouts();
    java.util.HashMap hashMap68 = completeGraphFactory66.getNeededProperties();
    java.lang.String str69 = completeGraphFactory66.toString();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory70 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector71 = completeGraphFactory70.getSupportedLayouts();
    java.lang.String str72 = completeGraphFactory70.toString();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory73 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str74 = completeGraphFactory73.toString();
    java.lang.String str75 = completeGraphFactory73.toString();
    java.util.Vector vector76 = completeGraphFactory73.getSupportedLayouts();
    completeGraphFactory70.setSupportedLayouts(vector76);
    completeGraphFactory66.setSupportedLayouts(vector76);
    completeGraphFactory44.setSupportedLayouts(vector76);
    completeGraphFactory36.setSupportedLayouts(vector76);
    completeGraphFactory0.setSupportedLayouts(vector76);
    java.util.HashMap hashMap82 = completeGraphFactory0.getNeededProperties();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Complete graph"+ "'", str1.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Complete graph"+ "'", str2.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Complete graph"+ "'", str6.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Complete graph"+ "'", str7.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Complete graph"+ "'", str13.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Complete graph"+ "'", str14.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Complete graph"+ "'", str25.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "Complete graph"+ "'", str28.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "Complete graph"+ "'", str30.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "Complete graph"+ "'", str31.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "Complete graph"+ "'", str38.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "Complete graph"+ "'", str40.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "Complete graph"+ "'", str41.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "Complete graph"+ "'", str45.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "Complete graph"+ "'", str46.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "Complete graph"+ "'", str50.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "Complete graph"+ "'", str51.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str57 + "' != '" + "Complete graph"+ "'", str57.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str58 + "' != '" + "Complete graph"+ "'", str58.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str69 + "' != '" + "Complete graph"+ "'", str69.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str72 + "' != '" + "Complete graph"+ "'", str72.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str74 + "' != '" + "Complete graph"+ "'", str74.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str75 + "' != '" + "Complete graph"+ "'", str75.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap82);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test36"); }

    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory0 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector1 = completeGraphFactory0.getSupportedLayouts();
    java.util.Vector vector2 = completeGraphFactory0.getSupportedLayouts();
    java.util.HashMap hashMap3 = completeGraphFactory0.getNeededProperties();
    java.util.HashMap hashMap4 = completeGraphFactory0.getNeededProperties();
    java.lang.String str5 = completeGraphFactory0.toString();
    java.util.Vector vector6 = completeGraphFactory0.getSupportedLayouts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Complete graph"+ "'", str5.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector6);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test37"); }

    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory0 = new tccrouter.user.factories.CompleteGraphFactory();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory1 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str2 = completeGraphFactory1.toString();
    java.lang.String str3 = completeGraphFactory1.toString();
    java.util.HashMap hashMap4 = completeGraphFactory1.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory5 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector6 = completeGraphFactory5.getSupportedLayouts();
    completeGraphFactory1.setSupportedLayouts(vector6);
    completeGraphFactory0.setSupportedLayouts(vector6);
    java.lang.String str9 = completeGraphFactory0.toString();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory10 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str11 = completeGraphFactory10.toString();
    java.lang.String str12 = completeGraphFactory10.toString();
    java.util.HashMap hashMap13 = completeGraphFactory10.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory14 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector15 = completeGraphFactory14.getSupportedLayouts();
    completeGraphFactory10.setSupportedLayouts(vector15);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory17 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector18 = completeGraphFactory17.getSupportedLayouts();
    java.util.HashMap hashMap19 = completeGraphFactory17.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph20 = completeGraphFactory10.createGraph(hashMap19);
    tccrouter.diamante.core.graph.Graph graph21 = completeGraphFactory0.createGraph(hashMap19);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory22 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str23 = completeGraphFactory22.toString();
    java.util.HashMap hashMap24 = completeGraphFactory22.getNeededProperties();
    java.util.Vector vector25 = completeGraphFactory22.getSupportedLayouts();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory26 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str27 = completeGraphFactory26.toString();
    java.lang.String str28 = completeGraphFactory26.toString();
    java.util.Vector vector29 = completeGraphFactory26.getSupportedLayouts();
    java.util.Vector vector30 = completeGraphFactory26.getSupportedLayouts();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory31 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str32 = completeGraphFactory31.toString();
    java.lang.String str33 = completeGraphFactory31.toString();
    java.util.Vector vector34 = completeGraphFactory31.getSupportedLayouts();
    java.util.Vector vector35 = completeGraphFactory31.getSupportedLayouts();
    completeGraphFactory26.setSupportedLayouts(vector35);
    completeGraphFactory22.setSupportedLayouts(vector35);
    completeGraphFactory0.setSupportedLayouts(vector35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Complete graph"+ "'", str2.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Complete graph"+ "'", str3.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Complete graph"+ "'", str9.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Complete graph"+ "'", str11.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Complete graph"+ "'", str12.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Complete graph"+ "'", str23.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "Complete graph"+ "'", str27.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "Complete graph"+ "'", str28.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "Complete graph"+ "'", str32.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "Complete graph"+ "'", str33.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector35);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test38"); }

    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory0 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str1 = completeGraphFactory0.toString();
    java.lang.String str2 = completeGraphFactory0.toString();
    java.util.Vector vector3 = completeGraphFactory0.getSupportedLayouts();
    java.util.Vector vector4 = completeGraphFactory0.getSupportedLayouts();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory5 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str6 = completeGraphFactory5.toString();
    java.lang.String str7 = completeGraphFactory5.toString();
    java.util.Vector vector8 = completeGraphFactory5.getSupportedLayouts();
    java.util.Vector vector9 = completeGraphFactory5.getSupportedLayouts();
    completeGraphFactory0.setSupportedLayouts(vector9);
    java.util.HashMap hashMap11 = completeGraphFactory0.getNeededProperties();
    java.lang.String str12 = completeGraphFactory0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Complete graph"+ "'", str1.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Complete graph"+ "'", str2.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Complete graph"+ "'", str6.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Complete graph"+ "'", str7.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Complete graph"+ "'", str12.equals("Complete graph"));

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test39"); }

    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory0 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str1 = completeGraphFactory0.toString();
    java.lang.String str2 = completeGraphFactory0.toString();
    java.util.Vector vector3 = completeGraphFactory0.getSupportedLayouts();
    java.util.Vector vector4 = completeGraphFactory0.getSupportedLayouts();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory5 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str6 = completeGraphFactory5.toString();
    java.lang.String str7 = completeGraphFactory5.toString();
    java.util.Vector vector8 = completeGraphFactory5.getSupportedLayouts();
    java.util.Vector vector9 = completeGraphFactory5.getSupportedLayouts();
    completeGraphFactory0.setSupportedLayouts(vector9);
    java.util.HashMap hashMap11 = completeGraphFactory0.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory12 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str13 = completeGraphFactory12.toString();
    java.lang.String str14 = completeGraphFactory12.toString();
    java.util.HashMap hashMap15 = completeGraphFactory12.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory16 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector17 = completeGraphFactory16.getSupportedLayouts();
    completeGraphFactory12.setSupportedLayouts(vector17);
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory19 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector20 = completeGraphFactory19.getSupportedLayouts();
    java.util.HashMap hashMap21 = completeGraphFactory19.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph22 = completeGraphFactory12.createGraph(hashMap21);
    tccrouter.diamante.core.graph.Graph graph23 = completeGraphFactory0.createGraph(hashMap21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Complete graph"+ "'", str1.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Complete graph"+ "'", str2.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Complete graph"+ "'", str6.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Complete graph"+ "'", str7.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Complete graph"+ "'", str13.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Complete graph"+ "'", str14.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph23);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test40"); }

    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory0 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str1 = completeGraphFactory0.toString();
    java.lang.String str2 = completeGraphFactory0.toString();
    java.util.HashMap hashMap3 = completeGraphFactory0.getNeededProperties();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory4 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector5 = completeGraphFactory4.getSupportedLayouts();
    java.lang.String str6 = completeGraphFactory4.toString();
    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory7 = new tccrouter.user.factories.CompleteGraphFactory();
    java.lang.String str8 = completeGraphFactory7.toString();
    java.lang.String str9 = completeGraphFactory7.toString();
    java.util.Vector vector10 = completeGraphFactory7.getSupportedLayouts();
    completeGraphFactory4.setSupportedLayouts(vector10);
    completeGraphFactory0.setSupportedLayouts(vector10);
    java.util.Vector vector13 = completeGraphFactory0.getSupportedLayouts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Complete graph"+ "'", str1.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Complete graph"+ "'", str2.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Complete graph"+ "'", str6.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Complete graph"+ "'", str8.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Complete graph"+ "'", str9.equals("Complete graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test41"); }

    tccrouter.user.factories.CompleteGraphFactory completeGraphFactory0 = new tccrouter.user.factories.CompleteGraphFactory();
    java.util.Vector vector1 = completeGraphFactory0.getSupportedLayouts();
    java.util.HashMap hashMap2 = completeGraphFactory0.getNeededProperties();
    java.util.Vector vector3 = completeGraphFactory0.getSupportedLayouts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);

  }

}