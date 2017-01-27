package tccrouter.user.factories;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NullGraphFactoryTest {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test01"); }

    tccrouter.user.factories.NullGraphFactory nullGraphFactory0 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector1 = nullGraphFactory0.getSupportedLayouts();
    java.lang.String str2 = nullGraphFactory0.toString();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory3 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str4 = nullGraphFactory3.toString();
    java.lang.String str5 = nullGraphFactory3.toString();
    java.util.Vector vector6 = nullGraphFactory3.getSupportedLayouts();
    nullGraphFactory0.setSupportedLayouts(vector6);
    java.util.Vector vector8 = nullGraphFactory0.getSupportedLayouts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Null graph"+ "'", str2.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Null graph"+ "'", str4.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Null graph"+ "'", str5.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }

    tccrouter.user.factories.NullGraphFactory nullGraphFactory0 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector1 = nullGraphFactory0.getSupportedLayouts();
    java.util.Vector vector2 = nullGraphFactory0.getSupportedLayouts();
    java.util.HashMap hashMap3 = nullGraphFactory0.getNeededProperties();
    java.lang.String str4 = nullGraphFactory0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Null graph"+ "'", str4.equals("Null graph"));

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }

    tccrouter.user.factories.NullGraphFactory nullGraphFactory0 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str1 = nullGraphFactory0.toString();
    java.lang.String str2 = nullGraphFactory0.toString();
    java.util.Vector vector3 = nullGraphFactory0.getSupportedLayouts();
    java.util.Vector vector4 = nullGraphFactory0.getSupportedLayouts();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory5 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str6 = nullGraphFactory5.toString();
    java.lang.String str7 = nullGraphFactory5.toString();
    java.util.Vector vector8 = nullGraphFactory5.getSupportedLayouts();
    java.util.Vector vector9 = nullGraphFactory5.getSupportedLayouts();
    nullGraphFactory0.setSupportedLayouts(vector9);
    java.util.HashMap hashMap11 = nullGraphFactory0.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory12 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str13 = nullGraphFactory12.toString();
    java.lang.String str14 = nullGraphFactory12.toString();
    java.util.HashMap hashMap15 = nullGraphFactory12.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory16 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector17 = nullGraphFactory16.getSupportedLayouts();
    nullGraphFactory12.setSupportedLayouts(vector17);
    java.util.HashMap hashMap19 = nullGraphFactory12.getNeededProperties();
    java.util.Vector vector20 = nullGraphFactory12.getSupportedLayouts();
    nullGraphFactory0.setSupportedLayouts(vector20);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory22 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector23 = nullGraphFactory22.getSupportedLayouts();
    java.util.Vector vector24 = nullGraphFactory22.getSupportedLayouts();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory25 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector26 = nullGraphFactory25.getSupportedLayouts();
    java.util.HashMap hashMap27 = nullGraphFactory25.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph28 = nullGraphFactory22.createGraph(hashMap27);
    tccrouter.diamante.core.graph.Graph graph29 = nullGraphFactory0.createGraph(hashMap27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Null graph"+ "'", str1.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Null graph"+ "'", str2.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Null graph"+ "'", str6.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Null graph"+ "'", str7.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Null graph"+ "'", str13.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Null graph"+ "'", str14.equals("Null graph"));
    
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

    tccrouter.user.factories.NullGraphFactory nullGraphFactory0 = new tccrouter.user.factories.NullGraphFactory();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory1 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector2 = nullGraphFactory1.getSupportedLayouts();
    nullGraphFactory0.setSupportedLayouts(vector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector2);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }

    tccrouter.user.factories.NullGraphFactory nullGraphFactory0 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str1 = nullGraphFactory0.toString();
    java.lang.String str2 = nullGraphFactory0.toString();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory3 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str4 = nullGraphFactory3.toString();
    java.lang.String str5 = nullGraphFactory3.toString();
    java.util.HashMap hashMap6 = nullGraphFactory3.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory7 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector8 = nullGraphFactory7.getSupportedLayouts();
    nullGraphFactory3.setSupportedLayouts(vector8);
    nullGraphFactory0.setSupportedLayouts(vector8);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory11 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str12 = nullGraphFactory11.toString();
    java.lang.String str13 = nullGraphFactory11.toString();
    java.util.HashMap hashMap14 = nullGraphFactory11.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory15 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector16 = nullGraphFactory15.getSupportedLayouts();
    nullGraphFactory11.setSupportedLayouts(vector16);
    nullGraphFactory0.setSupportedLayouts(vector16);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory19 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str20 = nullGraphFactory19.toString();
    java.lang.String str21 = nullGraphFactory19.toString();
    java.util.HashMap hashMap22 = nullGraphFactory19.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph23 = nullGraphFactory0.createGraph(hashMap22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Null graph"+ "'", str1.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Null graph"+ "'", str2.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Null graph"+ "'", str4.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Null graph"+ "'", str5.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Null graph"+ "'", str12.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Null graph"+ "'", str13.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Null graph"+ "'", str20.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Null graph"+ "'", str21.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph23);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }

    tccrouter.user.factories.NullGraphFactory nullGraphFactory0 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector1 = nullGraphFactory0.getSupportedLayouts();
    java.util.Vector vector2 = nullGraphFactory0.getSupportedLayouts();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory3 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector4 = nullGraphFactory3.getSupportedLayouts();
    java.util.HashMap hashMap5 = nullGraphFactory3.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph6 = nullGraphFactory0.createGraph(hashMap5);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory7 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str8 = nullGraphFactory7.toString();
    java.lang.String str9 = nullGraphFactory7.toString();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory10 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str11 = nullGraphFactory10.toString();
    java.lang.String str12 = nullGraphFactory10.toString();
    java.util.HashMap hashMap13 = nullGraphFactory10.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory14 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector15 = nullGraphFactory14.getSupportedLayouts();
    nullGraphFactory10.setSupportedLayouts(vector15);
    nullGraphFactory7.setSupportedLayouts(vector15);
    nullGraphFactory0.setSupportedLayouts(vector15);
    java.util.HashMap hashMap19 = nullGraphFactory0.getNeededProperties();
    
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
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Null graph"+ "'", str8.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Null graph"+ "'", str9.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Null graph"+ "'", str11.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Null graph"+ "'", str12.equals("Null graph"));
    
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

    tccrouter.user.factories.NullGraphFactory nullGraphFactory0 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str1 = nullGraphFactory0.toString();
    java.lang.String str2 = nullGraphFactory0.toString();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory3 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str4 = nullGraphFactory3.toString();
    java.lang.String str5 = nullGraphFactory3.toString();
    java.util.HashMap hashMap6 = nullGraphFactory3.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory7 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector8 = nullGraphFactory7.getSupportedLayouts();
    nullGraphFactory3.setSupportedLayouts(vector8);
    nullGraphFactory0.setSupportedLayouts(vector8);
    java.util.HashMap hashMap11 = nullGraphFactory0.getNeededProperties();
    java.util.Vector vector12 = nullGraphFactory0.getSupportedLayouts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Null graph"+ "'", str1.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Null graph"+ "'", str2.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Null graph"+ "'", str4.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Null graph"+ "'", str5.equals("Null graph"));
    
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

    tccrouter.user.factories.NullGraphFactory nullGraphFactory0 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str1 = nullGraphFactory0.toString();
    java.lang.String str2 = nullGraphFactory0.toString();
    java.util.Vector vector3 = nullGraphFactory0.getSupportedLayouts();
    java.util.Vector vector4 = nullGraphFactory0.getSupportedLayouts();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory5 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str6 = nullGraphFactory5.toString();
    java.lang.String str7 = nullGraphFactory5.toString();
    java.util.Vector vector8 = nullGraphFactory5.getSupportedLayouts();
    java.util.Vector vector9 = nullGraphFactory5.getSupportedLayouts();
    nullGraphFactory0.setSupportedLayouts(vector9);
    java.util.HashMap hashMap11 = nullGraphFactory0.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory12 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str13 = nullGraphFactory12.toString();
    java.lang.String str14 = nullGraphFactory12.toString();
    java.util.HashMap hashMap15 = nullGraphFactory12.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory16 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector17 = nullGraphFactory16.getSupportedLayouts();
    nullGraphFactory12.setSupportedLayouts(vector17);
    java.util.HashMap hashMap19 = nullGraphFactory12.getNeededProperties();
    java.util.Vector vector20 = nullGraphFactory12.getSupportedLayouts();
    nullGraphFactory0.setSupportedLayouts(vector20);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory22 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector23 = nullGraphFactory22.getSupportedLayouts();
    java.util.HashMap hashMap24 = nullGraphFactory22.getNeededProperties();
    java.lang.String str25 = nullGraphFactory22.toString();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory26 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector27 = nullGraphFactory26.getSupportedLayouts();
    java.lang.String str28 = nullGraphFactory26.toString();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory29 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str30 = nullGraphFactory29.toString();
    java.lang.String str31 = nullGraphFactory29.toString();
    java.util.Vector vector32 = nullGraphFactory29.getSupportedLayouts();
    nullGraphFactory26.setSupportedLayouts(vector32);
    nullGraphFactory22.setSupportedLayouts(vector32);
    nullGraphFactory0.setSupportedLayouts(vector32);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory36 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str37 = nullGraphFactory36.toString();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory38 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector39 = nullGraphFactory38.getSupportedLayouts();
    java.lang.String str40 = nullGraphFactory38.toString();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory41 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str42 = nullGraphFactory41.toString();
    java.lang.String str43 = nullGraphFactory41.toString();
    java.util.Vector vector44 = nullGraphFactory41.getSupportedLayouts();
    nullGraphFactory38.setSupportedLayouts(vector44);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory46 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str47 = nullGraphFactory46.toString();
    java.lang.String str48 = nullGraphFactory46.toString();
    java.util.Vector vector49 = nullGraphFactory46.getSupportedLayouts();
    java.util.Vector vector50 = nullGraphFactory46.getSupportedLayouts();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory51 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str52 = nullGraphFactory51.toString();
    java.lang.String str53 = nullGraphFactory51.toString();
    java.util.Vector vector54 = nullGraphFactory51.getSupportedLayouts();
    java.util.Vector vector55 = nullGraphFactory51.getSupportedLayouts();
    nullGraphFactory46.setSupportedLayouts(vector55);
    java.util.HashMap hashMap57 = nullGraphFactory46.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory58 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str59 = nullGraphFactory58.toString();
    java.lang.String str60 = nullGraphFactory58.toString();
    java.util.HashMap hashMap61 = nullGraphFactory58.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory62 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector63 = nullGraphFactory62.getSupportedLayouts();
    nullGraphFactory58.setSupportedLayouts(vector63);
    java.util.HashMap hashMap65 = nullGraphFactory58.getNeededProperties();
    java.util.Vector vector66 = nullGraphFactory58.getSupportedLayouts();
    nullGraphFactory46.setSupportedLayouts(vector66);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory68 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector69 = nullGraphFactory68.getSupportedLayouts();
    java.util.HashMap hashMap70 = nullGraphFactory68.getNeededProperties();
    java.lang.String str71 = nullGraphFactory68.toString();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory72 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector73 = nullGraphFactory72.getSupportedLayouts();
    java.lang.String str74 = nullGraphFactory72.toString();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory75 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str76 = nullGraphFactory75.toString();
    java.lang.String str77 = nullGraphFactory75.toString();
    java.util.Vector vector78 = nullGraphFactory75.getSupportedLayouts();
    nullGraphFactory72.setSupportedLayouts(vector78);
    nullGraphFactory68.setSupportedLayouts(vector78);
    nullGraphFactory46.setSupportedLayouts(vector78);
    nullGraphFactory38.setSupportedLayouts(vector78);
    nullGraphFactory36.setSupportedLayouts(vector78);
    nullGraphFactory0.setSupportedLayouts(vector78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Null graph"+ "'", str1.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Null graph"+ "'", str2.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Null graph"+ "'", str6.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Null graph"+ "'", str7.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Null graph"+ "'", str13.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Null graph"+ "'", str14.equals("Null graph"));
    
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
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Null graph"+ "'", str25.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "Null graph"+ "'", str28.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "Null graph"+ "'", str30.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "Null graph"+ "'", str31.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "Null graph"+ "'", str37.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "Null graph"+ "'", str40.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "Null graph"+ "'", str42.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "Null graph"+ "'", str43.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "Null graph"+ "'", str47.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "Null graph"+ "'", str48.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "Null graph"+ "'", str52.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "Null graph"+ "'", str53.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + "Null graph"+ "'", str59.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + "Null graph"+ "'", str60.equals("Null graph"));
    
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
    org.junit.Assert.assertTrue("'" + str71 + "' != '" + "Null graph"+ "'", str71.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str74 + "' != '" + "Null graph"+ "'", str74.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str76 + "' != '" + "Null graph"+ "'", str76.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str77 + "' != '" + "Null graph"+ "'", str77.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector78);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }

    tccrouter.user.factories.NullGraphFactory nullGraphFactory0 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str1 = nullGraphFactory0.toString();
    java.lang.String str2 = nullGraphFactory0.toString();
    java.util.Vector vector3 = nullGraphFactory0.getSupportedLayouts();
    java.util.Vector vector4 = nullGraphFactory0.getSupportedLayouts();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory5 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str6 = nullGraphFactory5.toString();
    java.lang.String str7 = nullGraphFactory5.toString();
    java.util.Vector vector8 = nullGraphFactory5.getSupportedLayouts();
    java.util.Vector vector9 = nullGraphFactory5.getSupportedLayouts();
    nullGraphFactory0.setSupportedLayouts(vector9);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory11 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str12 = nullGraphFactory11.toString();
    java.lang.String str13 = nullGraphFactory11.toString();
    java.util.Vector vector14 = nullGraphFactory11.getSupportedLayouts();
    java.util.Vector vector15 = nullGraphFactory11.getSupportedLayouts();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory16 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str17 = nullGraphFactory16.toString();
    java.lang.String str18 = nullGraphFactory16.toString();
    java.util.Vector vector19 = nullGraphFactory16.getSupportedLayouts();
    java.util.Vector vector20 = nullGraphFactory16.getSupportedLayouts();
    nullGraphFactory11.setSupportedLayouts(vector20);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory22 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector23 = nullGraphFactory22.getSupportedLayouts();
    java.util.HashMap hashMap24 = nullGraphFactory22.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph25 = nullGraphFactory11.createGraph(hashMap24);
    tccrouter.diamante.core.graph.Graph graph26 = nullGraphFactory0.createGraph(hashMap24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Null graph"+ "'", str1.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Null graph"+ "'", str2.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Null graph"+ "'", str6.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Null graph"+ "'", str7.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Null graph"+ "'", str12.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Null graph"+ "'", str13.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Null graph"+ "'", str17.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Null graph"+ "'", str18.equals("Null graph"));
    
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

    tccrouter.user.factories.NullGraphFactory nullGraphFactory0 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str1 = nullGraphFactory0.toString();
    java.lang.String str2 = nullGraphFactory0.toString();
    java.util.HashMap hashMap3 = nullGraphFactory0.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory4 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector5 = nullGraphFactory4.getSupportedLayouts();
    java.lang.String str6 = nullGraphFactory4.toString();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory7 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str8 = nullGraphFactory7.toString();
    java.lang.String str9 = nullGraphFactory7.toString();
    java.util.Vector vector10 = nullGraphFactory7.getSupportedLayouts();
    nullGraphFactory4.setSupportedLayouts(vector10);
    nullGraphFactory0.setSupportedLayouts(vector10);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory13 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector14 = nullGraphFactory13.getSupportedLayouts();
    java.util.Vector vector15 = nullGraphFactory13.getSupportedLayouts();
    java.util.HashMap hashMap16 = nullGraphFactory13.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory17 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector18 = nullGraphFactory17.getSupportedLayouts();
    java.lang.String str19 = nullGraphFactory17.toString();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory20 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str21 = nullGraphFactory20.toString();
    java.lang.String str22 = nullGraphFactory20.toString();
    java.util.Vector vector23 = nullGraphFactory20.getSupportedLayouts();
    nullGraphFactory17.setSupportedLayouts(vector23);
    nullGraphFactory13.setSupportedLayouts(vector23);
    nullGraphFactory0.setSupportedLayouts(vector23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Null graph"+ "'", str1.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Null graph"+ "'", str2.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Null graph"+ "'", str6.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Null graph"+ "'", str8.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Null graph"+ "'", str9.equals("Null graph"));
    
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
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Null graph"+ "'", str19.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Null graph"+ "'", str21.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Null graph"+ "'", str22.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector23);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }

    tccrouter.user.factories.NullGraphFactory nullGraphFactory0 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str1 = nullGraphFactory0.toString();
    java.lang.String str2 = nullGraphFactory0.toString();
    java.util.Vector vector3 = nullGraphFactory0.getSupportedLayouts();
    java.util.Vector vector4 = nullGraphFactory0.getSupportedLayouts();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory5 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str6 = nullGraphFactory5.toString();
    java.lang.String str7 = nullGraphFactory5.toString();
    java.util.Vector vector8 = nullGraphFactory5.getSupportedLayouts();
    java.util.Vector vector9 = nullGraphFactory5.getSupportedLayouts();
    nullGraphFactory0.setSupportedLayouts(vector9);
    java.util.HashMap hashMap11 = nullGraphFactory0.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory12 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str13 = nullGraphFactory12.toString();
    java.lang.String str14 = nullGraphFactory12.toString();
    java.util.HashMap hashMap15 = nullGraphFactory12.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory16 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector17 = nullGraphFactory16.getSupportedLayouts();
    nullGraphFactory12.setSupportedLayouts(vector17);
    java.util.HashMap hashMap19 = nullGraphFactory12.getNeededProperties();
    java.util.Vector vector20 = nullGraphFactory12.getSupportedLayouts();
    nullGraphFactory0.setSupportedLayouts(vector20);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory22 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector23 = nullGraphFactory22.getSupportedLayouts();
    java.util.HashMap hashMap24 = nullGraphFactory22.getNeededProperties();
    java.lang.String str25 = nullGraphFactory22.toString();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory26 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector27 = nullGraphFactory26.getSupportedLayouts();
    java.lang.String str28 = nullGraphFactory26.toString();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory29 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str30 = nullGraphFactory29.toString();
    java.lang.String str31 = nullGraphFactory29.toString();
    java.util.Vector vector32 = nullGraphFactory29.getSupportedLayouts();
    nullGraphFactory26.setSupportedLayouts(vector32);
    nullGraphFactory22.setSupportedLayouts(vector32);
    nullGraphFactory0.setSupportedLayouts(vector32);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory36 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector37 = nullGraphFactory36.getSupportedLayouts();
    java.lang.String str38 = nullGraphFactory36.toString();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory39 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str40 = nullGraphFactory39.toString();
    java.lang.String str41 = nullGraphFactory39.toString();
    java.util.Vector vector42 = nullGraphFactory39.getSupportedLayouts();
    nullGraphFactory36.setSupportedLayouts(vector42);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory44 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str45 = nullGraphFactory44.toString();
    java.lang.String str46 = nullGraphFactory44.toString();
    java.util.Vector vector47 = nullGraphFactory44.getSupportedLayouts();
    java.util.Vector vector48 = nullGraphFactory44.getSupportedLayouts();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory49 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str50 = nullGraphFactory49.toString();
    java.lang.String str51 = nullGraphFactory49.toString();
    java.util.Vector vector52 = nullGraphFactory49.getSupportedLayouts();
    java.util.Vector vector53 = nullGraphFactory49.getSupportedLayouts();
    nullGraphFactory44.setSupportedLayouts(vector53);
    java.util.HashMap hashMap55 = nullGraphFactory44.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory56 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str57 = nullGraphFactory56.toString();
    java.lang.String str58 = nullGraphFactory56.toString();
    java.util.HashMap hashMap59 = nullGraphFactory56.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory60 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector61 = nullGraphFactory60.getSupportedLayouts();
    nullGraphFactory56.setSupportedLayouts(vector61);
    java.util.HashMap hashMap63 = nullGraphFactory56.getNeededProperties();
    java.util.Vector vector64 = nullGraphFactory56.getSupportedLayouts();
    nullGraphFactory44.setSupportedLayouts(vector64);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory66 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector67 = nullGraphFactory66.getSupportedLayouts();
    java.util.HashMap hashMap68 = nullGraphFactory66.getNeededProperties();
    java.lang.String str69 = nullGraphFactory66.toString();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory70 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector71 = nullGraphFactory70.getSupportedLayouts();
    java.lang.String str72 = nullGraphFactory70.toString();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory73 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str74 = nullGraphFactory73.toString();
    java.lang.String str75 = nullGraphFactory73.toString();
    java.util.Vector vector76 = nullGraphFactory73.getSupportedLayouts();
    nullGraphFactory70.setSupportedLayouts(vector76);
    nullGraphFactory66.setSupportedLayouts(vector76);
    nullGraphFactory44.setSupportedLayouts(vector76);
    nullGraphFactory36.setSupportedLayouts(vector76);
    nullGraphFactory0.setSupportedLayouts(vector76);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory82 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str83 = nullGraphFactory82.toString();
    java.lang.String str84 = nullGraphFactory82.toString();
    java.util.Vector vector85 = nullGraphFactory82.getSupportedLayouts();
    nullGraphFactory0.setSupportedLayouts(vector85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Null graph"+ "'", str1.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Null graph"+ "'", str2.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Null graph"+ "'", str6.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Null graph"+ "'", str7.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Null graph"+ "'", str13.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Null graph"+ "'", str14.equals("Null graph"));
    
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
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Null graph"+ "'", str25.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "Null graph"+ "'", str28.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "Null graph"+ "'", str30.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "Null graph"+ "'", str31.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "Null graph"+ "'", str38.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "Null graph"+ "'", str40.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "Null graph"+ "'", str41.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "Null graph"+ "'", str45.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "Null graph"+ "'", str46.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "Null graph"+ "'", str50.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "Null graph"+ "'", str51.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str57 + "' != '" + "Null graph"+ "'", str57.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str58 + "' != '" + "Null graph"+ "'", str58.equals("Null graph"));
    
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
    org.junit.Assert.assertTrue("'" + str69 + "' != '" + "Null graph"+ "'", str69.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str72 + "' != '" + "Null graph"+ "'", str72.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str74 + "' != '" + "Null graph"+ "'", str74.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str75 + "' != '" + "Null graph"+ "'", str75.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str83 + "' != '" + "Null graph"+ "'", str83.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str84 + "' != '" + "Null graph"+ "'", str84.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector85);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }

    tccrouter.user.factories.NullGraphFactory nullGraphFactory0 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str1 = nullGraphFactory0.toString();
    java.lang.String str2 = nullGraphFactory0.toString();
    java.util.Vector vector3 = nullGraphFactory0.getSupportedLayouts();
    java.util.Vector vector4 = nullGraphFactory0.getSupportedLayouts();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory5 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str6 = nullGraphFactory5.toString();
    java.lang.String str7 = nullGraphFactory5.toString();
    java.util.Vector vector8 = nullGraphFactory5.getSupportedLayouts();
    java.util.Vector vector9 = nullGraphFactory5.getSupportedLayouts();
    nullGraphFactory0.setSupportedLayouts(vector9);
    java.util.HashMap hashMap11 = nullGraphFactory0.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory12 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str13 = nullGraphFactory12.toString();
    java.lang.String str14 = nullGraphFactory12.toString();
    java.util.HashMap hashMap15 = nullGraphFactory12.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory16 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector17 = nullGraphFactory16.getSupportedLayouts();
    nullGraphFactory12.setSupportedLayouts(vector17);
    java.util.HashMap hashMap19 = nullGraphFactory12.getNeededProperties();
    java.util.Vector vector20 = nullGraphFactory12.getSupportedLayouts();
    nullGraphFactory0.setSupportedLayouts(vector20);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory22 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str23 = nullGraphFactory22.toString();
    java.lang.String str24 = nullGraphFactory22.toString();
    java.util.Vector vector25 = nullGraphFactory22.getSupportedLayouts();
    java.util.Vector vector26 = nullGraphFactory22.getSupportedLayouts();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory27 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str28 = nullGraphFactory27.toString();
    java.lang.String str29 = nullGraphFactory27.toString();
    java.util.Vector vector30 = nullGraphFactory27.getSupportedLayouts();
    java.util.Vector vector31 = nullGraphFactory27.getSupportedLayouts();
    nullGraphFactory22.setSupportedLayouts(vector31);
    nullGraphFactory0.setSupportedLayouts(vector31);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory34 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector35 = nullGraphFactory34.getSupportedLayouts();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory36 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str37 = nullGraphFactory36.toString();
    java.lang.String str38 = nullGraphFactory36.toString();
    java.util.HashMap hashMap39 = nullGraphFactory36.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory40 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector41 = nullGraphFactory40.getSupportedLayouts();
    nullGraphFactory36.setSupportedLayouts(vector41);
    java.util.HashMap hashMap43 = nullGraphFactory36.getNeededProperties();
    java.util.Vector vector44 = nullGraphFactory36.getSupportedLayouts();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory45 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str46 = nullGraphFactory45.toString();
    java.lang.String str47 = nullGraphFactory45.toString();
    java.util.HashMap hashMap48 = nullGraphFactory45.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory49 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector50 = nullGraphFactory49.getSupportedLayouts();
    nullGraphFactory45.setSupportedLayouts(vector50);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory52 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector53 = nullGraphFactory52.getSupportedLayouts();
    java.util.HashMap hashMap54 = nullGraphFactory52.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph55 = nullGraphFactory45.createGraph(hashMap54);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory56 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str57 = nullGraphFactory56.toString();
    java.lang.String str58 = nullGraphFactory56.toString();
    java.util.HashMap hashMap59 = nullGraphFactory56.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory60 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector61 = nullGraphFactory60.getSupportedLayouts();
    nullGraphFactory56.setSupportedLayouts(vector61);
    java.util.HashMap hashMap63 = nullGraphFactory56.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph64 = nullGraphFactory45.createGraph(hashMap63);
    tccrouter.diamante.core.graph.Graph graph65 = nullGraphFactory36.createGraph(hashMap63);
    tccrouter.diamante.core.graph.Graph graph66 = nullGraphFactory34.createGraph(hashMap63);
    tccrouter.diamante.core.graph.Graph graph67 = nullGraphFactory0.createGraph(hashMap63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Null graph"+ "'", str1.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Null graph"+ "'", str2.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Null graph"+ "'", str6.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Null graph"+ "'", str7.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Null graph"+ "'", str13.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Null graph"+ "'", str14.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Null graph"+ "'", str23.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Null graph"+ "'", str24.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "Null graph"+ "'", str28.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "Null graph"+ "'", str29.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "Null graph"+ "'", str37.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "Null graph"+ "'", str38.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "Null graph"+ "'", str46.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "Null graph"+ "'", str47.equals("Null graph"));
    
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
    org.junit.Assert.assertTrue("'" + str57 + "' != '" + "Null graph"+ "'", str57.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str58 + "' != '" + "Null graph"+ "'", str58.equals("Null graph"));
    
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

    tccrouter.user.factories.NullGraphFactory nullGraphFactory0 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector1 = nullGraphFactory0.getSupportedLayouts();
    java.util.HashMap hashMap2 = nullGraphFactory0.getNeededProperties();
    java.lang.String str3 = nullGraphFactory0.toString();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory4 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector5 = nullGraphFactory4.getSupportedLayouts();
    java.lang.String str6 = nullGraphFactory4.toString();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory7 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str8 = nullGraphFactory7.toString();
    java.lang.String str9 = nullGraphFactory7.toString();
    java.util.Vector vector10 = nullGraphFactory7.getSupportedLayouts();
    nullGraphFactory4.setSupportedLayouts(vector10);
    nullGraphFactory0.setSupportedLayouts(vector10);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory13 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str14 = nullGraphFactory13.toString();
    java.lang.String str15 = nullGraphFactory13.toString();
    java.util.Vector vector16 = nullGraphFactory13.getSupportedLayouts();
    java.util.Vector vector17 = nullGraphFactory13.getSupportedLayouts();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory18 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str19 = nullGraphFactory18.toString();
    java.lang.String str20 = nullGraphFactory18.toString();
    java.util.Vector vector21 = nullGraphFactory18.getSupportedLayouts();
    java.util.Vector vector22 = nullGraphFactory18.getSupportedLayouts();
    nullGraphFactory13.setSupportedLayouts(vector22);
    java.util.HashMap hashMap24 = nullGraphFactory13.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory25 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str26 = nullGraphFactory25.toString();
    java.lang.String str27 = nullGraphFactory25.toString();
    java.util.HashMap hashMap28 = nullGraphFactory25.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory29 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector30 = nullGraphFactory29.getSupportedLayouts();
    nullGraphFactory25.setSupportedLayouts(vector30);
    java.util.HashMap hashMap32 = nullGraphFactory25.getNeededProperties();
    java.util.Vector vector33 = nullGraphFactory25.getSupportedLayouts();
    nullGraphFactory13.setSupportedLayouts(vector33);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory35 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector36 = nullGraphFactory35.getSupportedLayouts();
    java.util.HashMap hashMap37 = nullGraphFactory35.getNeededProperties();
    java.lang.String str38 = nullGraphFactory35.toString();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory39 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector40 = nullGraphFactory39.getSupportedLayouts();
    java.lang.String str41 = nullGraphFactory39.toString();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory42 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str43 = nullGraphFactory42.toString();
    java.lang.String str44 = nullGraphFactory42.toString();
    java.util.Vector vector45 = nullGraphFactory42.getSupportedLayouts();
    nullGraphFactory39.setSupportedLayouts(vector45);
    nullGraphFactory35.setSupportedLayouts(vector45);
    nullGraphFactory13.setSupportedLayouts(vector45);
    nullGraphFactory0.setSupportedLayouts(vector45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Null graph"+ "'", str3.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Null graph"+ "'", str6.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Null graph"+ "'", str8.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Null graph"+ "'", str9.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Null graph"+ "'", str14.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Null graph"+ "'", str15.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Null graph"+ "'", str19.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Null graph"+ "'", str20.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Null graph"+ "'", str26.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "Null graph"+ "'", str27.equals("Null graph"));
    
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
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "Null graph"+ "'", str38.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "Null graph"+ "'", str41.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "Null graph"+ "'", str43.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "Null graph"+ "'", str44.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector45);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }

    tccrouter.user.factories.NullGraphFactory nullGraphFactory0 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str1 = nullGraphFactory0.toString();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory2 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector3 = nullGraphFactory2.getSupportedLayouts();
    java.lang.String str4 = nullGraphFactory2.toString();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory5 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str6 = nullGraphFactory5.toString();
    java.lang.String str7 = nullGraphFactory5.toString();
    java.util.Vector vector8 = nullGraphFactory5.getSupportedLayouts();
    nullGraphFactory2.setSupportedLayouts(vector8);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory10 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str11 = nullGraphFactory10.toString();
    java.lang.String str12 = nullGraphFactory10.toString();
    java.util.Vector vector13 = nullGraphFactory10.getSupportedLayouts();
    java.util.Vector vector14 = nullGraphFactory10.getSupportedLayouts();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory15 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str16 = nullGraphFactory15.toString();
    java.lang.String str17 = nullGraphFactory15.toString();
    java.util.Vector vector18 = nullGraphFactory15.getSupportedLayouts();
    java.util.Vector vector19 = nullGraphFactory15.getSupportedLayouts();
    nullGraphFactory10.setSupportedLayouts(vector19);
    java.util.HashMap hashMap21 = nullGraphFactory10.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory22 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str23 = nullGraphFactory22.toString();
    java.lang.String str24 = nullGraphFactory22.toString();
    java.util.HashMap hashMap25 = nullGraphFactory22.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory26 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector27 = nullGraphFactory26.getSupportedLayouts();
    nullGraphFactory22.setSupportedLayouts(vector27);
    java.util.HashMap hashMap29 = nullGraphFactory22.getNeededProperties();
    java.util.Vector vector30 = nullGraphFactory22.getSupportedLayouts();
    nullGraphFactory10.setSupportedLayouts(vector30);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory32 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector33 = nullGraphFactory32.getSupportedLayouts();
    java.util.HashMap hashMap34 = nullGraphFactory32.getNeededProperties();
    java.lang.String str35 = nullGraphFactory32.toString();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory36 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector37 = nullGraphFactory36.getSupportedLayouts();
    java.lang.String str38 = nullGraphFactory36.toString();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory39 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str40 = nullGraphFactory39.toString();
    java.lang.String str41 = nullGraphFactory39.toString();
    java.util.Vector vector42 = nullGraphFactory39.getSupportedLayouts();
    nullGraphFactory36.setSupportedLayouts(vector42);
    nullGraphFactory32.setSupportedLayouts(vector42);
    nullGraphFactory10.setSupportedLayouts(vector42);
    nullGraphFactory2.setSupportedLayouts(vector42);
    nullGraphFactory0.setSupportedLayouts(vector42);
    java.util.HashMap hashMap48 = nullGraphFactory0.getNeededProperties();
    java.util.HashMap hashMap49 = nullGraphFactory0.getNeededProperties();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Null graph"+ "'", str1.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Null graph"+ "'", str4.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Null graph"+ "'", str6.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Null graph"+ "'", str7.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Null graph"+ "'", str11.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Null graph"+ "'", str12.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Null graph"+ "'", str16.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Null graph"+ "'", str17.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Null graph"+ "'", str23.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Null graph"+ "'", str24.equals("Null graph"));
    
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
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "Null graph"+ "'", str35.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "Null graph"+ "'", str38.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "Null graph"+ "'", str40.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "Null graph"+ "'", str41.equals("Null graph"));
    
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

    tccrouter.user.factories.NullGraphFactory nullGraphFactory0 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector1 = nullGraphFactory0.getSupportedLayouts();
    java.util.HashMap hashMap2 = nullGraphFactory0.getNeededProperties();
    java.lang.String str3 = nullGraphFactory0.toString();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory4 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector5 = nullGraphFactory4.getSupportedLayouts();
    java.lang.String str6 = nullGraphFactory4.toString();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory7 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str8 = nullGraphFactory7.toString();
    java.lang.String str9 = nullGraphFactory7.toString();
    java.util.Vector vector10 = nullGraphFactory7.getSupportedLayouts();
    nullGraphFactory4.setSupportedLayouts(vector10);
    nullGraphFactory0.setSupportedLayouts(vector10);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory13 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector14 = nullGraphFactory13.getSupportedLayouts();
    java.util.Vector vector15 = nullGraphFactory13.getSupportedLayouts();
    java.util.HashMap hashMap16 = nullGraphFactory13.getNeededProperties();
    java.util.HashMap hashMap17 = nullGraphFactory13.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph18 = nullGraphFactory0.createGraph(hashMap17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Null graph"+ "'", str3.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Null graph"+ "'", str6.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Null graph"+ "'", str8.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Null graph"+ "'", str9.equals("Null graph"));
    
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

    tccrouter.user.factories.NullGraphFactory nullGraphFactory0 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str1 = nullGraphFactory0.toString();
    java.lang.String str2 = nullGraphFactory0.toString();
    java.util.HashMap hashMap3 = nullGraphFactory0.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory4 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector5 = nullGraphFactory4.getSupportedLayouts();
    nullGraphFactory0.setSupportedLayouts(vector5);
    java.util.HashMap hashMap7 = nullGraphFactory0.getNeededProperties();
    java.util.Vector vector8 = nullGraphFactory0.getSupportedLayouts();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory9 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str10 = nullGraphFactory9.toString();
    java.lang.String str11 = nullGraphFactory9.toString();
    java.util.HashMap hashMap12 = nullGraphFactory9.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory13 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector14 = nullGraphFactory13.getSupportedLayouts();
    nullGraphFactory9.setSupportedLayouts(vector14);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory16 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector17 = nullGraphFactory16.getSupportedLayouts();
    java.util.HashMap hashMap18 = nullGraphFactory16.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph19 = nullGraphFactory9.createGraph(hashMap18);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory20 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str21 = nullGraphFactory20.toString();
    java.lang.String str22 = nullGraphFactory20.toString();
    java.util.HashMap hashMap23 = nullGraphFactory20.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory24 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector25 = nullGraphFactory24.getSupportedLayouts();
    nullGraphFactory20.setSupportedLayouts(vector25);
    java.util.HashMap hashMap27 = nullGraphFactory20.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph28 = nullGraphFactory9.createGraph(hashMap27);
    tccrouter.diamante.core.graph.Graph graph29 = nullGraphFactory0.createGraph(hashMap27);
    java.util.Vector vector30 = nullGraphFactory0.getSupportedLayouts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Null graph"+ "'", str1.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Null graph"+ "'", str2.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Null graph"+ "'", str10.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Null graph"+ "'", str11.equals("Null graph"));
    
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
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Null graph"+ "'", str21.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Null graph"+ "'", str22.equals("Null graph"));
    
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

    tccrouter.user.factories.NullGraphFactory nullGraphFactory0 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str1 = nullGraphFactory0.toString();
    java.lang.String str2 = nullGraphFactory0.toString();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory3 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str4 = nullGraphFactory3.toString();
    java.lang.String str5 = nullGraphFactory3.toString();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory6 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str7 = nullGraphFactory6.toString();
    java.lang.String str8 = nullGraphFactory6.toString();
    java.util.HashMap hashMap9 = nullGraphFactory6.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory10 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector11 = nullGraphFactory10.getSupportedLayouts();
    nullGraphFactory6.setSupportedLayouts(vector11);
    nullGraphFactory3.setSupportedLayouts(vector11);
    nullGraphFactory0.setSupportedLayouts(vector11);
    java.util.HashMap hashMap15 = nullGraphFactory0.getNeededProperties();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Null graph"+ "'", str1.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Null graph"+ "'", str2.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Null graph"+ "'", str4.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Null graph"+ "'", str5.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Null graph"+ "'", str7.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Null graph"+ "'", str8.equals("Null graph"));
    
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

    tccrouter.user.factories.NullGraphFactory nullGraphFactory0 = new tccrouter.user.factories.NullGraphFactory();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory1 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str2 = nullGraphFactory1.toString();
    java.lang.String str3 = nullGraphFactory1.toString();
    java.util.HashMap hashMap4 = nullGraphFactory1.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory5 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector6 = nullGraphFactory5.getSupportedLayouts();
    nullGraphFactory1.setSupportedLayouts(vector6);
    nullGraphFactory0.setSupportedLayouts(vector6);
    java.lang.String str9 = nullGraphFactory0.toString();
    java.util.Vector vector10 = nullGraphFactory0.getSupportedLayouts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Null graph"+ "'", str2.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Null graph"+ "'", str3.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Null graph"+ "'", str9.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }

    tccrouter.user.factories.NullGraphFactory nullGraphFactory0 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str1 = nullGraphFactory0.toString();
    java.lang.String str2 = nullGraphFactory0.toString();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory3 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str4 = nullGraphFactory3.toString();
    java.lang.String str5 = nullGraphFactory3.toString();
    java.util.HashMap hashMap6 = nullGraphFactory3.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory7 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector8 = nullGraphFactory7.getSupportedLayouts();
    nullGraphFactory3.setSupportedLayouts(vector8);
    nullGraphFactory0.setSupportedLayouts(vector8);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory11 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str12 = nullGraphFactory11.toString();
    java.lang.String str13 = nullGraphFactory11.toString();
    java.util.HashMap hashMap14 = nullGraphFactory11.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory15 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector16 = nullGraphFactory15.getSupportedLayouts();
    nullGraphFactory11.setSupportedLayouts(vector16);
    nullGraphFactory0.setSupportedLayouts(vector16);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory19 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector20 = nullGraphFactory19.getSupportedLayouts();
    java.util.Vector vector21 = nullGraphFactory19.getSupportedLayouts();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory22 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector23 = nullGraphFactory22.getSupportedLayouts();
    java.util.HashMap hashMap24 = nullGraphFactory22.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph25 = nullGraphFactory19.createGraph(hashMap24);
    tccrouter.diamante.core.graph.Graph graph26 = nullGraphFactory0.createGraph(hashMap24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Null graph"+ "'", str1.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Null graph"+ "'", str2.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Null graph"+ "'", str4.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Null graph"+ "'", str5.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Null graph"+ "'", str12.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Null graph"+ "'", str13.equals("Null graph"));
    
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

    tccrouter.user.factories.NullGraphFactory nullGraphFactory0 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str1 = nullGraphFactory0.toString();
    java.lang.String str2 = nullGraphFactory0.toString();
    java.util.HashMap hashMap3 = nullGraphFactory0.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory4 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector5 = nullGraphFactory4.getSupportedLayouts();
    java.lang.String str6 = nullGraphFactory4.toString();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory7 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str8 = nullGraphFactory7.toString();
    java.lang.String str9 = nullGraphFactory7.toString();
    java.util.Vector vector10 = nullGraphFactory7.getSupportedLayouts();
    nullGraphFactory4.setSupportedLayouts(vector10);
    nullGraphFactory0.setSupportedLayouts(vector10);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory13 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str14 = nullGraphFactory13.toString();
    java.lang.String str15 = nullGraphFactory13.toString();
    java.util.Vector vector16 = nullGraphFactory13.getSupportedLayouts();
    java.util.Vector vector17 = nullGraphFactory13.getSupportedLayouts();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory18 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str19 = nullGraphFactory18.toString();
    java.lang.String str20 = nullGraphFactory18.toString();
    java.util.Vector vector21 = nullGraphFactory18.getSupportedLayouts();
    java.util.Vector vector22 = nullGraphFactory18.getSupportedLayouts();
    nullGraphFactory13.setSupportedLayouts(vector22);
    java.util.HashMap hashMap24 = nullGraphFactory13.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory25 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str26 = nullGraphFactory25.toString();
    java.lang.String str27 = nullGraphFactory25.toString();
    java.util.HashMap hashMap28 = nullGraphFactory25.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory29 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector30 = nullGraphFactory29.getSupportedLayouts();
    nullGraphFactory25.setSupportedLayouts(vector30);
    java.util.HashMap hashMap32 = nullGraphFactory25.getNeededProperties();
    java.util.Vector vector33 = nullGraphFactory25.getSupportedLayouts();
    nullGraphFactory13.setSupportedLayouts(vector33);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory35 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str36 = nullGraphFactory35.toString();
    java.lang.String str37 = nullGraphFactory35.toString();
    java.util.Vector vector38 = nullGraphFactory35.getSupportedLayouts();
    java.util.Vector vector39 = nullGraphFactory35.getSupportedLayouts();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory40 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str41 = nullGraphFactory40.toString();
    java.lang.String str42 = nullGraphFactory40.toString();
    java.util.Vector vector43 = nullGraphFactory40.getSupportedLayouts();
    java.util.Vector vector44 = nullGraphFactory40.getSupportedLayouts();
    nullGraphFactory35.setSupportedLayouts(vector44);
    nullGraphFactory13.setSupportedLayouts(vector44);
    nullGraphFactory0.setSupportedLayouts(vector44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Null graph"+ "'", str1.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Null graph"+ "'", str2.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Null graph"+ "'", str6.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Null graph"+ "'", str8.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Null graph"+ "'", str9.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Null graph"+ "'", str14.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Null graph"+ "'", str15.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Null graph"+ "'", str19.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Null graph"+ "'", str20.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Null graph"+ "'", str26.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "Null graph"+ "'", str27.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "Null graph"+ "'", str36.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "Null graph"+ "'", str37.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "Null graph"+ "'", str41.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "Null graph"+ "'", str42.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector44);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }

    tccrouter.user.factories.NullGraphFactory nullGraphFactory0 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str1 = nullGraphFactory0.toString();
    java.lang.String str2 = nullGraphFactory0.toString();
    java.util.Vector vector3 = nullGraphFactory0.getSupportedLayouts();
    java.util.Vector vector4 = nullGraphFactory0.getSupportedLayouts();
    java.lang.String str5 = nullGraphFactory0.toString();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory6 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str7 = nullGraphFactory6.toString();
    java.lang.String str8 = nullGraphFactory6.toString();
    java.util.HashMap hashMap9 = nullGraphFactory6.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory10 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector11 = nullGraphFactory10.getSupportedLayouts();
    nullGraphFactory6.setSupportedLayouts(vector11);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory13 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector14 = nullGraphFactory13.getSupportedLayouts();
    java.util.HashMap hashMap15 = nullGraphFactory13.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph16 = nullGraphFactory6.createGraph(hashMap15);
    tccrouter.diamante.core.graph.Graph graph17 = nullGraphFactory0.createGraph(hashMap15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Null graph"+ "'", str1.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Null graph"+ "'", str2.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Null graph"+ "'", str5.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Null graph"+ "'", str7.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Null graph"+ "'", str8.equals("Null graph"));
    
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

    tccrouter.user.factories.NullGraphFactory nullGraphFactory0 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str1 = nullGraphFactory0.toString();
    java.lang.String str2 = nullGraphFactory0.toString();
    java.util.Vector vector3 = nullGraphFactory0.getSupportedLayouts();
    java.util.Vector vector4 = nullGraphFactory0.getSupportedLayouts();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory5 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str6 = nullGraphFactory5.toString();
    java.lang.String str7 = nullGraphFactory5.toString();
    java.util.Vector vector8 = nullGraphFactory5.getSupportedLayouts();
    java.util.Vector vector9 = nullGraphFactory5.getSupportedLayouts();
    nullGraphFactory0.setSupportedLayouts(vector9);
    java.util.HashMap hashMap11 = nullGraphFactory0.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory12 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str13 = nullGraphFactory12.toString();
    java.lang.String str14 = nullGraphFactory12.toString();
    java.util.HashMap hashMap15 = nullGraphFactory12.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory16 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector17 = nullGraphFactory16.getSupportedLayouts();
    nullGraphFactory12.setSupportedLayouts(vector17);
    java.util.HashMap hashMap19 = nullGraphFactory12.getNeededProperties();
    java.util.Vector vector20 = nullGraphFactory12.getSupportedLayouts();
    nullGraphFactory0.setSupportedLayouts(vector20);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory22 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector23 = nullGraphFactory22.getSupportedLayouts();
    java.util.HashMap hashMap24 = nullGraphFactory22.getNeededProperties();
    java.lang.String str25 = nullGraphFactory22.toString();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory26 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector27 = nullGraphFactory26.getSupportedLayouts();
    java.lang.String str28 = nullGraphFactory26.toString();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory29 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str30 = nullGraphFactory29.toString();
    java.lang.String str31 = nullGraphFactory29.toString();
    java.util.Vector vector32 = nullGraphFactory29.getSupportedLayouts();
    nullGraphFactory26.setSupportedLayouts(vector32);
    nullGraphFactory22.setSupportedLayouts(vector32);
    nullGraphFactory0.setSupportedLayouts(vector32);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory36 = new tccrouter.user.factories.NullGraphFactory();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory37 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str38 = nullGraphFactory37.toString();
    java.lang.String str39 = nullGraphFactory37.toString();
    java.util.HashMap hashMap40 = nullGraphFactory37.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory41 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector42 = nullGraphFactory41.getSupportedLayouts();
    nullGraphFactory37.setSupportedLayouts(vector42);
    nullGraphFactory36.setSupportedLayouts(vector42);
    java.lang.String str45 = nullGraphFactory36.toString();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory46 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str47 = nullGraphFactory46.toString();
    java.lang.String str48 = nullGraphFactory46.toString();
    java.util.HashMap hashMap49 = nullGraphFactory46.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory50 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector51 = nullGraphFactory50.getSupportedLayouts();
    nullGraphFactory46.setSupportedLayouts(vector51);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory53 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector54 = nullGraphFactory53.getSupportedLayouts();
    java.util.HashMap hashMap55 = nullGraphFactory53.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph56 = nullGraphFactory46.createGraph(hashMap55);
    tccrouter.diamante.core.graph.Graph graph57 = nullGraphFactory36.createGraph(hashMap55);
    tccrouter.diamante.core.graph.Graph graph58 = nullGraphFactory0.createGraph(hashMap55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Null graph"+ "'", str1.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Null graph"+ "'", str2.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Null graph"+ "'", str6.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Null graph"+ "'", str7.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Null graph"+ "'", str13.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Null graph"+ "'", str14.equals("Null graph"));
    
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
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Null graph"+ "'", str25.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "Null graph"+ "'", str28.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "Null graph"+ "'", str30.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "Null graph"+ "'", str31.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "Null graph"+ "'", str38.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "Null graph"+ "'", str39.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "Null graph"+ "'", str45.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "Null graph"+ "'", str47.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "Null graph"+ "'", str48.equals("Null graph"));
    
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

    tccrouter.user.factories.NullGraphFactory nullGraphFactory0 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str1 = nullGraphFactory0.toString();
    java.lang.String str2 = nullGraphFactory0.toString();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory3 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str4 = nullGraphFactory3.toString();
    java.lang.String str5 = nullGraphFactory3.toString();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory6 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str7 = nullGraphFactory6.toString();
    java.lang.String str8 = nullGraphFactory6.toString();
    java.util.HashMap hashMap9 = nullGraphFactory6.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory10 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector11 = nullGraphFactory10.getSupportedLayouts();
    nullGraphFactory6.setSupportedLayouts(vector11);
    nullGraphFactory3.setSupportedLayouts(vector11);
    nullGraphFactory0.setSupportedLayouts(vector11);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory15 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str16 = nullGraphFactory15.toString();
    java.lang.String str17 = nullGraphFactory15.toString();
    java.util.HashMap hashMap18 = nullGraphFactory15.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory19 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector20 = nullGraphFactory19.getSupportedLayouts();
    nullGraphFactory15.setSupportedLayouts(vector20);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory22 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector23 = nullGraphFactory22.getSupportedLayouts();
    java.util.HashMap hashMap24 = nullGraphFactory22.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph25 = nullGraphFactory15.createGraph(hashMap24);
    java.util.Vector vector26 = nullGraphFactory15.getSupportedLayouts();
    nullGraphFactory0.setSupportedLayouts(vector26);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory28 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str29 = nullGraphFactory28.toString();
    java.lang.String str30 = nullGraphFactory28.toString();
    java.util.HashMap hashMap31 = nullGraphFactory28.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory32 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector33 = nullGraphFactory32.getSupportedLayouts();
    nullGraphFactory28.setSupportedLayouts(vector33);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory35 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector36 = nullGraphFactory35.getSupportedLayouts();
    java.util.HashMap hashMap37 = nullGraphFactory35.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph38 = nullGraphFactory28.createGraph(hashMap37);
    tccrouter.diamante.core.graph.Graph graph39 = nullGraphFactory0.createGraph(hashMap37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Null graph"+ "'", str1.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Null graph"+ "'", str2.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Null graph"+ "'", str4.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Null graph"+ "'", str5.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Null graph"+ "'", str7.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Null graph"+ "'", str8.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Null graph"+ "'", str16.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Null graph"+ "'", str17.equals("Null graph"));
    
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
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "Null graph"+ "'", str29.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "Null graph"+ "'", str30.equals("Null graph"));
    
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

    tccrouter.user.factories.NullGraphFactory nullGraphFactory0 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str1 = nullGraphFactory0.toString();
    java.lang.String str2 = nullGraphFactory0.toString();
    java.util.HashMap hashMap3 = nullGraphFactory0.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory4 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector5 = nullGraphFactory4.getSupportedLayouts();
    nullGraphFactory0.setSupportedLayouts(vector5);
    java.util.Vector vector7 = nullGraphFactory0.getSupportedLayouts();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory8 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector9 = nullGraphFactory8.getSupportedLayouts();
    java.util.Vector vector10 = nullGraphFactory8.getSupportedLayouts();
    nullGraphFactory0.setSupportedLayouts(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Null graph"+ "'", str1.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Null graph"+ "'", str2.equals("Null graph"));
    
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

    tccrouter.user.factories.NullGraphFactory nullGraphFactory0 = new tccrouter.user.factories.NullGraphFactory();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory1 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str2 = nullGraphFactory1.toString();
    java.lang.String str3 = nullGraphFactory1.toString();
    java.util.HashMap hashMap4 = nullGraphFactory1.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory5 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector6 = nullGraphFactory5.getSupportedLayouts();
    nullGraphFactory1.setSupportedLayouts(vector6);
    nullGraphFactory0.setSupportedLayouts(vector6);
    java.lang.String str9 = nullGraphFactory0.toString();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory10 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str11 = nullGraphFactory10.toString();
    java.lang.String str12 = nullGraphFactory10.toString();
    java.util.HashMap hashMap13 = nullGraphFactory10.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory14 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector15 = nullGraphFactory14.getSupportedLayouts();
    nullGraphFactory10.setSupportedLayouts(vector15);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory17 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector18 = nullGraphFactory17.getSupportedLayouts();
    java.util.HashMap hashMap19 = nullGraphFactory17.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph20 = nullGraphFactory10.createGraph(hashMap19);
    tccrouter.diamante.core.graph.Graph graph21 = nullGraphFactory0.createGraph(hashMap19);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory22 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str23 = nullGraphFactory22.toString();
    java.lang.String str24 = nullGraphFactory22.toString();
    java.util.HashMap hashMap25 = nullGraphFactory22.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory26 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector27 = nullGraphFactory26.getSupportedLayouts();
    nullGraphFactory22.setSupportedLayouts(vector27);
    java.util.HashMap hashMap29 = nullGraphFactory22.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory30 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector31 = nullGraphFactory30.getSupportedLayouts();
    java.util.Vector vector32 = nullGraphFactory30.getSupportedLayouts();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory33 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector34 = nullGraphFactory33.getSupportedLayouts();
    java.util.HashMap hashMap35 = nullGraphFactory33.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph36 = nullGraphFactory30.createGraph(hashMap35);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory37 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str38 = nullGraphFactory37.toString();
    java.lang.String str39 = nullGraphFactory37.toString();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory40 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str41 = nullGraphFactory40.toString();
    java.lang.String str42 = nullGraphFactory40.toString();
    java.util.HashMap hashMap43 = nullGraphFactory40.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory44 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector45 = nullGraphFactory44.getSupportedLayouts();
    nullGraphFactory40.setSupportedLayouts(vector45);
    nullGraphFactory37.setSupportedLayouts(vector45);
    nullGraphFactory30.setSupportedLayouts(vector45);
    nullGraphFactory22.setSupportedLayouts(vector45);
    nullGraphFactory0.setSupportedLayouts(vector45);
    java.util.HashMap hashMap51 = nullGraphFactory0.getNeededProperties();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Null graph"+ "'", str2.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Null graph"+ "'", str3.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Null graph"+ "'", str9.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Null graph"+ "'", str11.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Null graph"+ "'", str12.equals("Null graph"));
    
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
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Null graph"+ "'", str23.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Null graph"+ "'", str24.equals("Null graph"));
    
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
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "Null graph"+ "'", str38.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "Null graph"+ "'", str39.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "Null graph"+ "'", str41.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "Null graph"+ "'", str42.equals("Null graph"));
    
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

    tccrouter.user.factories.NullGraphFactory nullGraphFactory0 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str1 = nullGraphFactory0.toString();
    java.lang.String str2 = nullGraphFactory0.toString();
    java.util.HashMap hashMap3 = nullGraphFactory0.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory4 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector5 = nullGraphFactory4.getSupportedLayouts();
    nullGraphFactory0.setSupportedLayouts(vector5);
    java.util.HashMap hashMap7 = nullGraphFactory0.getNeededProperties();
    java.util.Vector vector8 = nullGraphFactory0.getSupportedLayouts();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory9 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str10 = nullGraphFactory9.toString();
    java.lang.String str11 = nullGraphFactory9.toString();
    java.util.HashMap hashMap12 = nullGraphFactory9.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory13 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector14 = nullGraphFactory13.getSupportedLayouts();
    nullGraphFactory9.setSupportedLayouts(vector14);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory16 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector17 = nullGraphFactory16.getSupportedLayouts();
    java.util.HashMap hashMap18 = nullGraphFactory16.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph19 = nullGraphFactory9.createGraph(hashMap18);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory20 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str21 = nullGraphFactory20.toString();
    java.lang.String str22 = nullGraphFactory20.toString();
    java.util.HashMap hashMap23 = nullGraphFactory20.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory24 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector25 = nullGraphFactory24.getSupportedLayouts();
    nullGraphFactory20.setSupportedLayouts(vector25);
    java.util.HashMap hashMap27 = nullGraphFactory20.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph28 = nullGraphFactory9.createGraph(hashMap27);
    tccrouter.diamante.core.graph.Graph graph29 = nullGraphFactory0.createGraph(hashMap27);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory30 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector31 = nullGraphFactory30.getSupportedLayouts();
    java.util.Vector vector32 = nullGraphFactory30.getSupportedLayouts();
    java.util.HashMap hashMap33 = nullGraphFactory30.getNeededProperties();
    java.util.HashMap hashMap34 = nullGraphFactory30.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph35 = nullGraphFactory0.createGraph(hashMap34);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory36 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str37 = nullGraphFactory36.toString();
    java.lang.String str38 = nullGraphFactory36.toString();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory39 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str40 = nullGraphFactory39.toString();
    java.lang.String str41 = nullGraphFactory39.toString();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory42 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str43 = nullGraphFactory42.toString();
    java.lang.String str44 = nullGraphFactory42.toString();
    java.util.HashMap hashMap45 = nullGraphFactory42.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory46 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector47 = nullGraphFactory46.getSupportedLayouts();
    nullGraphFactory42.setSupportedLayouts(vector47);
    nullGraphFactory39.setSupportedLayouts(vector47);
    nullGraphFactory36.setSupportedLayouts(vector47);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory51 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str52 = nullGraphFactory51.toString();
    java.lang.String str53 = nullGraphFactory51.toString();
    java.util.HashMap hashMap54 = nullGraphFactory51.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory55 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector56 = nullGraphFactory55.getSupportedLayouts();
    nullGraphFactory51.setSupportedLayouts(vector56);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory58 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector59 = nullGraphFactory58.getSupportedLayouts();
    java.util.HashMap hashMap60 = nullGraphFactory58.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph61 = nullGraphFactory51.createGraph(hashMap60);
    java.util.Vector vector62 = nullGraphFactory51.getSupportedLayouts();
    nullGraphFactory36.setSupportedLayouts(vector62);
    nullGraphFactory0.setSupportedLayouts(vector62);
    java.lang.String str65 = nullGraphFactory0.toString();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory66 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str67 = nullGraphFactory66.toString();
    java.lang.String str68 = nullGraphFactory66.toString();
    java.util.Vector vector69 = nullGraphFactory66.getSupportedLayouts();
    java.util.Vector vector70 = nullGraphFactory66.getSupportedLayouts();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory71 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str72 = nullGraphFactory71.toString();
    java.lang.String str73 = nullGraphFactory71.toString();
    java.util.Vector vector74 = nullGraphFactory71.getSupportedLayouts();
    java.util.Vector vector75 = nullGraphFactory71.getSupportedLayouts();
    nullGraphFactory66.setSupportedLayouts(vector75);
    java.util.HashMap hashMap77 = nullGraphFactory66.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory78 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str79 = nullGraphFactory78.toString();
    java.lang.String str80 = nullGraphFactory78.toString();
    java.util.HashMap hashMap81 = nullGraphFactory78.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory82 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector83 = nullGraphFactory82.getSupportedLayouts();
    nullGraphFactory78.setSupportedLayouts(vector83);
    java.util.HashMap hashMap85 = nullGraphFactory78.getNeededProperties();
    java.util.Vector vector86 = nullGraphFactory78.getSupportedLayouts();
    nullGraphFactory66.setSupportedLayouts(vector86);
    java.util.Vector vector88 = nullGraphFactory66.getSupportedLayouts();
    nullGraphFactory0.setSupportedLayouts(vector88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Null graph"+ "'", str1.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Null graph"+ "'", str2.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Null graph"+ "'", str10.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Null graph"+ "'", str11.equals("Null graph"));
    
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
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Null graph"+ "'", str21.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Null graph"+ "'", str22.equals("Null graph"));
    
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
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "Null graph"+ "'", str37.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "Null graph"+ "'", str38.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "Null graph"+ "'", str40.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "Null graph"+ "'", str41.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "Null graph"+ "'", str43.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "Null graph"+ "'", str44.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "Null graph"+ "'", str52.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "Null graph"+ "'", str53.equals("Null graph"));
    
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
    org.junit.Assert.assertTrue("'" + str65 + "' != '" + "Null graph"+ "'", str65.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str67 + "' != '" + "Null graph"+ "'", str67.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str68 + "' != '" + "Null graph"+ "'", str68.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str72 + "' != '" + "Null graph"+ "'", str72.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str73 + "' != '" + "Null graph"+ "'", str73.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str79 + "' != '" + "Null graph"+ "'", str79.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str80 + "' != '" + "Null graph"+ "'", str80.equals("Null graph"));
    
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

    tccrouter.user.factories.NullGraphFactory nullGraphFactory0 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str1 = nullGraphFactory0.toString();
    java.lang.String str2 = nullGraphFactory0.toString();
    java.util.HashMap hashMap3 = nullGraphFactory0.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory4 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector5 = nullGraphFactory4.getSupportedLayouts();
    nullGraphFactory0.setSupportedLayouts(vector5);
    java.util.HashMap hashMap7 = nullGraphFactory0.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory8 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector9 = nullGraphFactory8.getSupportedLayouts();
    java.util.Vector vector10 = nullGraphFactory8.getSupportedLayouts();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory11 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector12 = nullGraphFactory11.getSupportedLayouts();
    java.util.HashMap hashMap13 = nullGraphFactory11.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph14 = nullGraphFactory8.createGraph(hashMap13);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory15 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str16 = nullGraphFactory15.toString();
    java.lang.String str17 = nullGraphFactory15.toString();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory18 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str19 = nullGraphFactory18.toString();
    java.lang.String str20 = nullGraphFactory18.toString();
    java.util.HashMap hashMap21 = nullGraphFactory18.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory22 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector23 = nullGraphFactory22.getSupportedLayouts();
    nullGraphFactory18.setSupportedLayouts(vector23);
    nullGraphFactory15.setSupportedLayouts(vector23);
    nullGraphFactory8.setSupportedLayouts(vector23);
    nullGraphFactory0.setSupportedLayouts(vector23);
    java.util.Vector vector28 = nullGraphFactory0.getSupportedLayouts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Null graph"+ "'", str1.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Null graph"+ "'", str2.equals("Null graph"));
    
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
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Null graph"+ "'", str16.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Null graph"+ "'", str17.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Null graph"+ "'", str19.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Null graph"+ "'", str20.equals("Null graph"));
    
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

    tccrouter.user.factories.NullGraphFactory nullGraphFactory0 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str1 = nullGraphFactory0.toString();
    java.lang.String str2 = nullGraphFactory0.toString();
    java.util.HashMap hashMap3 = nullGraphFactory0.getNeededProperties();
    java.lang.String str4 = nullGraphFactory0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Null graph"+ "'", str1.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Null graph"+ "'", str2.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Null graph"+ "'", str4.equals("Null graph"));

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test29"); }

    tccrouter.user.factories.NullGraphFactory nullGraphFactory0 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector1 = nullGraphFactory0.getSupportedLayouts();
    java.util.Vector vector2 = nullGraphFactory0.getSupportedLayouts();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory3 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector4 = nullGraphFactory3.getSupportedLayouts();
    java.util.HashMap hashMap5 = nullGraphFactory3.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph6 = nullGraphFactory0.createGraph(hashMap5);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory7 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str8 = nullGraphFactory7.toString();
    java.lang.String str9 = nullGraphFactory7.toString();
    java.util.Vector vector10 = nullGraphFactory7.getSupportedLayouts();
    java.util.Vector vector11 = nullGraphFactory7.getSupportedLayouts();
    nullGraphFactory0.setSupportedLayouts(vector11);
    
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
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Null graph"+ "'", str8.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Null graph"+ "'", str9.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector11);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test30"); }

    tccrouter.user.factories.NullGraphFactory nullGraphFactory0 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str1 = nullGraphFactory0.toString();
    java.lang.String str2 = nullGraphFactory0.toString();
    java.util.HashMap hashMap3 = nullGraphFactory0.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory4 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector5 = nullGraphFactory4.getSupportedLayouts();
    nullGraphFactory0.setSupportedLayouts(vector5);
    java.util.HashMap hashMap7 = nullGraphFactory0.getNeededProperties();
    java.util.Vector vector8 = nullGraphFactory0.getSupportedLayouts();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory9 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str10 = nullGraphFactory9.toString();
    java.lang.String str11 = nullGraphFactory9.toString();
    java.util.HashMap hashMap12 = nullGraphFactory9.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory13 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector14 = nullGraphFactory13.getSupportedLayouts();
    nullGraphFactory9.setSupportedLayouts(vector14);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory16 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector17 = nullGraphFactory16.getSupportedLayouts();
    java.util.HashMap hashMap18 = nullGraphFactory16.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph19 = nullGraphFactory9.createGraph(hashMap18);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory20 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str21 = nullGraphFactory20.toString();
    java.lang.String str22 = nullGraphFactory20.toString();
    java.util.HashMap hashMap23 = nullGraphFactory20.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory24 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector25 = nullGraphFactory24.getSupportedLayouts();
    nullGraphFactory20.setSupportedLayouts(vector25);
    java.util.HashMap hashMap27 = nullGraphFactory20.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph28 = nullGraphFactory9.createGraph(hashMap27);
    tccrouter.diamante.core.graph.Graph graph29 = nullGraphFactory0.createGraph(hashMap27);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory30 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector31 = nullGraphFactory30.getSupportedLayouts();
    java.util.Vector vector32 = nullGraphFactory30.getSupportedLayouts();
    java.util.HashMap hashMap33 = nullGraphFactory30.getNeededProperties();
    java.util.HashMap hashMap34 = nullGraphFactory30.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph35 = nullGraphFactory0.createGraph(hashMap34);
    java.lang.String str36 = nullGraphFactory0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Null graph"+ "'", str1.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Null graph"+ "'", str2.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Null graph"+ "'", str10.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Null graph"+ "'", str11.equals("Null graph"));
    
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
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Null graph"+ "'", str21.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Null graph"+ "'", str22.equals("Null graph"));
    
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
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "Null graph"+ "'", str36.equals("Null graph"));

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test31"); }

    tccrouter.user.factories.NullGraphFactory nullGraphFactory0 = new tccrouter.user.factories.NullGraphFactory();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory1 = new tccrouter.user.factories.NullGraphFactory();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory2 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str3 = nullGraphFactory2.toString();
    java.lang.String str4 = nullGraphFactory2.toString();
    java.util.HashMap hashMap5 = nullGraphFactory2.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory6 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector7 = nullGraphFactory6.getSupportedLayouts();
    nullGraphFactory2.setSupportedLayouts(vector7);
    nullGraphFactory1.setSupportedLayouts(vector7);
    java.lang.String str10 = nullGraphFactory1.toString();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory11 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str12 = nullGraphFactory11.toString();
    java.lang.String str13 = nullGraphFactory11.toString();
    java.util.HashMap hashMap14 = nullGraphFactory11.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory15 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector16 = nullGraphFactory15.getSupportedLayouts();
    nullGraphFactory11.setSupportedLayouts(vector16);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory18 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector19 = nullGraphFactory18.getSupportedLayouts();
    java.util.HashMap hashMap20 = nullGraphFactory18.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph21 = nullGraphFactory11.createGraph(hashMap20);
    tccrouter.diamante.core.graph.Graph graph22 = nullGraphFactory1.createGraph(hashMap20);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory23 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str24 = nullGraphFactory23.toString();
    java.lang.String str25 = nullGraphFactory23.toString();
    java.util.HashMap hashMap26 = nullGraphFactory23.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory27 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector28 = nullGraphFactory27.getSupportedLayouts();
    nullGraphFactory23.setSupportedLayouts(vector28);
    java.util.HashMap hashMap30 = nullGraphFactory23.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory31 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector32 = nullGraphFactory31.getSupportedLayouts();
    java.util.Vector vector33 = nullGraphFactory31.getSupportedLayouts();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory34 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector35 = nullGraphFactory34.getSupportedLayouts();
    java.util.HashMap hashMap36 = nullGraphFactory34.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph37 = nullGraphFactory31.createGraph(hashMap36);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory38 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str39 = nullGraphFactory38.toString();
    java.lang.String str40 = nullGraphFactory38.toString();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory41 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str42 = nullGraphFactory41.toString();
    java.lang.String str43 = nullGraphFactory41.toString();
    java.util.HashMap hashMap44 = nullGraphFactory41.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory45 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector46 = nullGraphFactory45.getSupportedLayouts();
    nullGraphFactory41.setSupportedLayouts(vector46);
    nullGraphFactory38.setSupportedLayouts(vector46);
    nullGraphFactory31.setSupportedLayouts(vector46);
    nullGraphFactory23.setSupportedLayouts(vector46);
    nullGraphFactory1.setSupportedLayouts(vector46);
    nullGraphFactory0.setSupportedLayouts(vector46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Null graph"+ "'", str3.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Null graph"+ "'", str4.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Null graph"+ "'", str10.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Null graph"+ "'", str12.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Null graph"+ "'", str13.equals("Null graph"));
    
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
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Null graph"+ "'", str24.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Null graph"+ "'", str25.equals("Null graph"));
    
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
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "Null graph"+ "'", str39.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "Null graph"+ "'", str40.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "Null graph"+ "'", str42.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "Null graph"+ "'", str43.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector46);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test32"); }

    tccrouter.user.factories.NullGraphFactory nullGraphFactory0 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str1 = nullGraphFactory0.toString();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory2 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector3 = nullGraphFactory2.getSupportedLayouts();
    java.lang.String str4 = nullGraphFactory2.toString();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory5 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str6 = nullGraphFactory5.toString();
    java.lang.String str7 = nullGraphFactory5.toString();
    java.util.Vector vector8 = nullGraphFactory5.getSupportedLayouts();
    nullGraphFactory2.setSupportedLayouts(vector8);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory10 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str11 = nullGraphFactory10.toString();
    java.lang.String str12 = nullGraphFactory10.toString();
    java.util.Vector vector13 = nullGraphFactory10.getSupportedLayouts();
    java.util.Vector vector14 = nullGraphFactory10.getSupportedLayouts();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory15 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str16 = nullGraphFactory15.toString();
    java.lang.String str17 = nullGraphFactory15.toString();
    java.util.Vector vector18 = nullGraphFactory15.getSupportedLayouts();
    java.util.Vector vector19 = nullGraphFactory15.getSupportedLayouts();
    nullGraphFactory10.setSupportedLayouts(vector19);
    java.util.HashMap hashMap21 = nullGraphFactory10.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory22 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str23 = nullGraphFactory22.toString();
    java.lang.String str24 = nullGraphFactory22.toString();
    java.util.HashMap hashMap25 = nullGraphFactory22.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory26 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector27 = nullGraphFactory26.getSupportedLayouts();
    nullGraphFactory22.setSupportedLayouts(vector27);
    java.util.HashMap hashMap29 = nullGraphFactory22.getNeededProperties();
    java.util.Vector vector30 = nullGraphFactory22.getSupportedLayouts();
    nullGraphFactory10.setSupportedLayouts(vector30);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory32 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector33 = nullGraphFactory32.getSupportedLayouts();
    java.util.HashMap hashMap34 = nullGraphFactory32.getNeededProperties();
    java.lang.String str35 = nullGraphFactory32.toString();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory36 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector37 = nullGraphFactory36.getSupportedLayouts();
    java.lang.String str38 = nullGraphFactory36.toString();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory39 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str40 = nullGraphFactory39.toString();
    java.lang.String str41 = nullGraphFactory39.toString();
    java.util.Vector vector42 = nullGraphFactory39.getSupportedLayouts();
    nullGraphFactory36.setSupportedLayouts(vector42);
    nullGraphFactory32.setSupportedLayouts(vector42);
    nullGraphFactory10.setSupportedLayouts(vector42);
    nullGraphFactory2.setSupportedLayouts(vector42);
    nullGraphFactory0.setSupportedLayouts(vector42);
    java.lang.String str48 = nullGraphFactory0.toString();
    java.util.Vector vector49 = nullGraphFactory0.getSupportedLayouts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Null graph"+ "'", str1.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Null graph"+ "'", str4.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Null graph"+ "'", str6.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Null graph"+ "'", str7.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Null graph"+ "'", str11.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Null graph"+ "'", str12.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Null graph"+ "'", str16.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Null graph"+ "'", str17.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Null graph"+ "'", str23.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Null graph"+ "'", str24.equals("Null graph"));
    
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
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "Null graph"+ "'", str35.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "Null graph"+ "'", str38.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "Null graph"+ "'", str40.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "Null graph"+ "'", str41.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "Null graph"+ "'", str48.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector49);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test33"); }

    tccrouter.user.factories.NullGraphFactory nullGraphFactory0 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str1 = nullGraphFactory0.toString();
    java.util.HashMap hashMap2 = nullGraphFactory0.getNeededProperties();
    java.util.HashMap hashMap3 = nullGraphFactory0.getNeededProperties();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Null graph"+ "'", str1.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap3);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test34"); }

    tccrouter.user.factories.NullGraphFactory nullGraphFactory0 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector1 = nullGraphFactory0.getSupportedLayouts();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory2 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str3 = nullGraphFactory2.toString();
    java.lang.String str4 = nullGraphFactory2.toString();
    java.util.HashMap hashMap5 = nullGraphFactory2.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory6 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector7 = nullGraphFactory6.getSupportedLayouts();
    nullGraphFactory2.setSupportedLayouts(vector7);
    java.util.HashMap hashMap9 = nullGraphFactory2.getNeededProperties();
    java.util.Vector vector10 = nullGraphFactory2.getSupportedLayouts();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory11 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str12 = nullGraphFactory11.toString();
    java.lang.String str13 = nullGraphFactory11.toString();
    java.util.HashMap hashMap14 = nullGraphFactory11.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory15 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector16 = nullGraphFactory15.getSupportedLayouts();
    nullGraphFactory11.setSupportedLayouts(vector16);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory18 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector19 = nullGraphFactory18.getSupportedLayouts();
    java.util.HashMap hashMap20 = nullGraphFactory18.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph21 = nullGraphFactory11.createGraph(hashMap20);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory22 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str23 = nullGraphFactory22.toString();
    java.lang.String str24 = nullGraphFactory22.toString();
    java.util.HashMap hashMap25 = nullGraphFactory22.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory26 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector27 = nullGraphFactory26.getSupportedLayouts();
    nullGraphFactory22.setSupportedLayouts(vector27);
    java.util.HashMap hashMap29 = nullGraphFactory22.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph30 = nullGraphFactory11.createGraph(hashMap29);
    tccrouter.diamante.core.graph.Graph graph31 = nullGraphFactory2.createGraph(hashMap29);
    tccrouter.diamante.core.graph.Graph graph32 = nullGraphFactory0.createGraph(hashMap29);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory33 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str34 = nullGraphFactory33.toString();
    java.lang.String str35 = nullGraphFactory33.toString();
    java.util.HashMap hashMap36 = nullGraphFactory33.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph37 = nullGraphFactory0.createGraph(hashMap36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Null graph"+ "'", str3.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Null graph"+ "'", str4.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Null graph"+ "'", str12.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Null graph"+ "'", str13.equals("Null graph"));
    
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
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Null graph"+ "'", str23.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Null graph"+ "'", str24.equals("Null graph"));
    
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
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "Null graph"+ "'", str34.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "Null graph"+ "'", str35.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graph37);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test35"); }

    tccrouter.user.factories.NullGraphFactory nullGraphFactory0 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str1 = nullGraphFactory0.toString();
    java.lang.String str2 = nullGraphFactory0.toString();
    java.util.Vector vector3 = nullGraphFactory0.getSupportedLayouts();
    java.util.Vector vector4 = nullGraphFactory0.getSupportedLayouts();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory5 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str6 = nullGraphFactory5.toString();
    java.lang.String str7 = nullGraphFactory5.toString();
    java.util.Vector vector8 = nullGraphFactory5.getSupportedLayouts();
    java.util.Vector vector9 = nullGraphFactory5.getSupportedLayouts();
    nullGraphFactory0.setSupportedLayouts(vector9);
    java.util.HashMap hashMap11 = nullGraphFactory0.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory12 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str13 = nullGraphFactory12.toString();
    java.lang.String str14 = nullGraphFactory12.toString();
    java.util.HashMap hashMap15 = nullGraphFactory12.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory16 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector17 = nullGraphFactory16.getSupportedLayouts();
    nullGraphFactory12.setSupportedLayouts(vector17);
    java.util.HashMap hashMap19 = nullGraphFactory12.getNeededProperties();
    java.util.Vector vector20 = nullGraphFactory12.getSupportedLayouts();
    nullGraphFactory0.setSupportedLayouts(vector20);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory22 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector23 = nullGraphFactory22.getSupportedLayouts();
    java.util.HashMap hashMap24 = nullGraphFactory22.getNeededProperties();
    java.lang.String str25 = nullGraphFactory22.toString();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory26 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector27 = nullGraphFactory26.getSupportedLayouts();
    java.lang.String str28 = nullGraphFactory26.toString();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory29 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str30 = nullGraphFactory29.toString();
    java.lang.String str31 = nullGraphFactory29.toString();
    java.util.Vector vector32 = nullGraphFactory29.getSupportedLayouts();
    nullGraphFactory26.setSupportedLayouts(vector32);
    nullGraphFactory22.setSupportedLayouts(vector32);
    nullGraphFactory0.setSupportedLayouts(vector32);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory36 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector37 = nullGraphFactory36.getSupportedLayouts();
    java.lang.String str38 = nullGraphFactory36.toString();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory39 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str40 = nullGraphFactory39.toString();
    java.lang.String str41 = nullGraphFactory39.toString();
    java.util.Vector vector42 = nullGraphFactory39.getSupportedLayouts();
    nullGraphFactory36.setSupportedLayouts(vector42);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory44 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str45 = nullGraphFactory44.toString();
    java.lang.String str46 = nullGraphFactory44.toString();
    java.util.Vector vector47 = nullGraphFactory44.getSupportedLayouts();
    java.util.Vector vector48 = nullGraphFactory44.getSupportedLayouts();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory49 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str50 = nullGraphFactory49.toString();
    java.lang.String str51 = nullGraphFactory49.toString();
    java.util.Vector vector52 = nullGraphFactory49.getSupportedLayouts();
    java.util.Vector vector53 = nullGraphFactory49.getSupportedLayouts();
    nullGraphFactory44.setSupportedLayouts(vector53);
    java.util.HashMap hashMap55 = nullGraphFactory44.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory56 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str57 = nullGraphFactory56.toString();
    java.lang.String str58 = nullGraphFactory56.toString();
    java.util.HashMap hashMap59 = nullGraphFactory56.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory60 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector61 = nullGraphFactory60.getSupportedLayouts();
    nullGraphFactory56.setSupportedLayouts(vector61);
    java.util.HashMap hashMap63 = nullGraphFactory56.getNeededProperties();
    java.util.Vector vector64 = nullGraphFactory56.getSupportedLayouts();
    nullGraphFactory44.setSupportedLayouts(vector64);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory66 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector67 = nullGraphFactory66.getSupportedLayouts();
    java.util.HashMap hashMap68 = nullGraphFactory66.getNeededProperties();
    java.lang.String str69 = nullGraphFactory66.toString();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory70 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector71 = nullGraphFactory70.getSupportedLayouts();
    java.lang.String str72 = nullGraphFactory70.toString();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory73 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str74 = nullGraphFactory73.toString();
    java.lang.String str75 = nullGraphFactory73.toString();
    java.util.Vector vector76 = nullGraphFactory73.getSupportedLayouts();
    nullGraphFactory70.setSupportedLayouts(vector76);
    nullGraphFactory66.setSupportedLayouts(vector76);
    nullGraphFactory44.setSupportedLayouts(vector76);
    nullGraphFactory36.setSupportedLayouts(vector76);
    nullGraphFactory0.setSupportedLayouts(vector76);
    java.util.HashMap hashMap82 = nullGraphFactory0.getNeededProperties();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Null graph"+ "'", str1.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Null graph"+ "'", str2.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Null graph"+ "'", str6.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Null graph"+ "'", str7.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Null graph"+ "'", str13.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Null graph"+ "'", str14.equals("Null graph"));
    
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
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Null graph"+ "'", str25.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "Null graph"+ "'", str28.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "Null graph"+ "'", str30.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "Null graph"+ "'", str31.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "Null graph"+ "'", str38.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "Null graph"+ "'", str40.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "Null graph"+ "'", str41.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "Null graph"+ "'", str45.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "Null graph"+ "'", str46.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "Null graph"+ "'", str50.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "Null graph"+ "'", str51.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str57 + "' != '" + "Null graph"+ "'", str57.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str58 + "' != '" + "Null graph"+ "'", str58.equals("Null graph"));
    
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
    org.junit.Assert.assertTrue("'" + str69 + "' != '" + "Null graph"+ "'", str69.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str72 + "' != '" + "Null graph"+ "'", str72.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str74 + "' != '" + "Null graph"+ "'", str74.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str75 + "' != '" + "Null graph"+ "'", str75.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap82);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test36"); }

    tccrouter.user.factories.NullGraphFactory nullGraphFactory0 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector1 = nullGraphFactory0.getSupportedLayouts();
    java.util.Vector vector2 = nullGraphFactory0.getSupportedLayouts();
    java.util.HashMap hashMap3 = nullGraphFactory0.getNeededProperties();
    java.util.HashMap hashMap4 = nullGraphFactory0.getNeededProperties();
    java.lang.String str5 = nullGraphFactory0.toString();
    java.util.Vector vector6 = nullGraphFactory0.getSupportedLayouts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Null graph"+ "'", str5.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector6);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test37"); }

    tccrouter.user.factories.NullGraphFactory nullGraphFactory0 = new tccrouter.user.factories.NullGraphFactory();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory1 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str2 = nullGraphFactory1.toString();
    java.lang.String str3 = nullGraphFactory1.toString();
    java.util.HashMap hashMap4 = nullGraphFactory1.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory5 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector6 = nullGraphFactory5.getSupportedLayouts();
    nullGraphFactory1.setSupportedLayouts(vector6);
    nullGraphFactory0.setSupportedLayouts(vector6);
    java.lang.String str9 = nullGraphFactory0.toString();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory10 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str11 = nullGraphFactory10.toString();
    java.lang.String str12 = nullGraphFactory10.toString();
    java.util.HashMap hashMap13 = nullGraphFactory10.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory14 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector15 = nullGraphFactory14.getSupportedLayouts();
    nullGraphFactory10.setSupportedLayouts(vector15);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory17 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector18 = nullGraphFactory17.getSupportedLayouts();
    java.util.HashMap hashMap19 = nullGraphFactory17.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph20 = nullGraphFactory10.createGraph(hashMap19);
    tccrouter.diamante.core.graph.Graph graph21 = nullGraphFactory0.createGraph(hashMap19);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory22 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str23 = nullGraphFactory22.toString();
    java.util.HashMap hashMap24 = nullGraphFactory22.getNeededProperties();
    java.util.Vector vector25 = nullGraphFactory22.getSupportedLayouts();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory26 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str27 = nullGraphFactory26.toString();
    java.lang.String str28 = nullGraphFactory26.toString();
    java.util.Vector vector29 = nullGraphFactory26.getSupportedLayouts();
    java.util.Vector vector30 = nullGraphFactory26.getSupportedLayouts();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory31 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str32 = nullGraphFactory31.toString();
    java.lang.String str33 = nullGraphFactory31.toString();
    java.util.Vector vector34 = nullGraphFactory31.getSupportedLayouts();
    java.util.Vector vector35 = nullGraphFactory31.getSupportedLayouts();
    nullGraphFactory26.setSupportedLayouts(vector35);
    nullGraphFactory22.setSupportedLayouts(vector35);
    nullGraphFactory0.setSupportedLayouts(vector35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Null graph"+ "'", str2.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Null graph"+ "'", str3.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Null graph"+ "'", str9.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Null graph"+ "'", str11.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Null graph"+ "'", str12.equals("Null graph"));
    
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
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Null graph"+ "'", str23.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "Null graph"+ "'", str27.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "Null graph"+ "'", str28.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "Null graph"+ "'", str32.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "Null graph"+ "'", str33.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector35);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test38"); }

    tccrouter.user.factories.NullGraphFactory nullGraphFactory0 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str1 = nullGraphFactory0.toString();
    java.lang.String str2 = nullGraphFactory0.toString();
    java.util.Vector vector3 = nullGraphFactory0.getSupportedLayouts();
    java.util.Vector vector4 = nullGraphFactory0.getSupportedLayouts();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory5 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str6 = nullGraphFactory5.toString();
    java.lang.String str7 = nullGraphFactory5.toString();
    java.util.Vector vector8 = nullGraphFactory5.getSupportedLayouts();
    java.util.Vector vector9 = nullGraphFactory5.getSupportedLayouts();
    nullGraphFactory0.setSupportedLayouts(vector9);
    java.util.HashMap hashMap11 = nullGraphFactory0.getNeededProperties();
    java.lang.String str12 = nullGraphFactory0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Null graph"+ "'", str1.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Null graph"+ "'", str2.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Null graph"+ "'", str6.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Null graph"+ "'", str7.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Null graph"+ "'", str12.equals("Null graph"));

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test39"); }

    tccrouter.user.factories.NullGraphFactory nullGraphFactory0 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str1 = nullGraphFactory0.toString();
    java.lang.String str2 = nullGraphFactory0.toString();
    java.util.Vector vector3 = nullGraphFactory0.getSupportedLayouts();
    java.util.Vector vector4 = nullGraphFactory0.getSupportedLayouts();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory5 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str6 = nullGraphFactory5.toString();
    java.lang.String str7 = nullGraphFactory5.toString();
    java.util.Vector vector8 = nullGraphFactory5.getSupportedLayouts();
    java.util.Vector vector9 = nullGraphFactory5.getSupportedLayouts();
    nullGraphFactory0.setSupportedLayouts(vector9);
    java.util.HashMap hashMap11 = nullGraphFactory0.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory12 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str13 = nullGraphFactory12.toString();
    java.lang.String str14 = nullGraphFactory12.toString();
    java.util.HashMap hashMap15 = nullGraphFactory12.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory16 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector17 = nullGraphFactory16.getSupportedLayouts();
    nullGraphFactory12.setSupportedLayouts(vector17);
    tccrouter.user.factories.NullGraphFactory nullGraphFactory19 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector20 = nullGraphFactory19.getSupportedLayouts();
    java.util.HashMap hashMap21 = nullGraphFactory19.getNeededProperties();
    tccrouter.diamante.core.graph.Graph graph22 = nullGraphFactory12.createGraph(hashMap21);
    tccrouter.diamante.core.graph.Graph graph23 = nullGraphFactory0.createGraph(hashMap21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Null graph"+ "'", str1.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Null graph"+ "'", str2.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Null graph"+ "'", str6.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Null graph"+ "'", str7.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Null graph"+ "'", str13.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Null graph"+ "'", str14.equals("Null graph"));
    
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

    tccrouter.user.factories.NullGraphFactory nullGraphFactory0 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str1 = nullGraphFactory0.toString();
    java.lang.String str2 = nullGraphFactory0.toString();
    java.util.HashMap hashMap3 = nullGraphFactory0.getNeededProperties();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory4 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector5 = nullGraphFactory4.getSupportedLayouts();
    java.lang.String str6 = nullGraphFactory4.toString();
    tccrouter.user.factories.NullGraphFactory nullGraphFactory7 = new tccrouter.user.factories.NullGraphFactory();
    java.lang.String str8 = nullGraphFactory7.toString();
    java.lang.String str9 = nullGraphFactory7.toString();
    java.util.Vector vector10 = nullGraphFactory7.getSupportedLayouts();
    nullGraphFactory4.setSupportedLayouts(vector10);
    nullGraphFactory0.setSupportedLayouts(vector10);
    java.util.Vector vector13 = nullGraphFactory0.getSupportedLayouts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Null graph"+ "'", str1.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Null graph"+ "'", str2.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Null graph"+ "'", str6.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Null graph"+ "'", str8.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Null graph"+ "'", str9.equals("Null graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector13);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test41"); }

    tccrouter.user.factories.NullGraphFactory nullGraphFactory0 = new tccrouter.user.factories.NullGraphFactory();
    java.util.Vector vector1 = nullGraphFactory0.getSupportedLayouts();
    java.util.HashMap hashMap2 = nullGraphFactory0.getNeededProperties();
    java.util.Vector vector3 = nullGraphFactory0.getSupportedLayouts();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vector3);

  }

}