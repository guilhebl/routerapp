package tccrouter.gbl.ui;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GeneralSettingsTest {
  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test01"); }

    float f0 = java.awt.Component.TOP_ALIGNMENT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f0 == 0.0f);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }

    int i0 = javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 2);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }

    java.awt.Dialog.ModalityType modalityType0 = java.awt.Dialog.DEFAULT_MODALITY_TYPE;
    org.junit.Assert.assertTrue("'" + modalityType0 + "' != '" + java.awt.Dialog.ModalityType.APPLICATION_MODAL + "'", modalityType0.equals(java.awt.Dialog.ModalityType.APPLICATION_MODAL));

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }

    int i0 = javax.swing.WindowConstants.EXIT_ON_CLOSE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 3);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }

    boolean b0 = javax.swing.JDialog.isDefaultLookAndFeelDecorated();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b0 == false);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }

    javax.swing.JDialog.setDefaultLookAndFeelDecorated(false);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }

    int i0 = java.awt.image.ImageObserver.HEIGHT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 2);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }

    int i0 = javax.swing.WindowConstants.HIDE_ON_CLOSE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }

    int i0 = javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 0);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }

    int i0 = java.awt.image.ImageObserver.ALLBITS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 32);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }

    float f0 = java.awt.Component.BOTTOM_ALIGNMENT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f0 == 1.0f);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }

    float f0 = java.awt.Component.CENTER_ALIGNMENT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f0 == 0.5f);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }

    java.awt.Window[] window_array0 = java.awt.Window.getWindows();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(window_array0);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }

    float f0 = java.awt.Component.LEFT_ALIGNMENT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f0 == 0.0f);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }

    int i0 = java.awt.image.ImageObserver.SOMEBITS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 8);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }

    java.awt.Window[] window_array0 = java.awt.Window.getOwnerlessWindows();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(window_array0);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }

    int i0 = java.awt.image.ImageObserver.ERROR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 64);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }

    int i0 = java.awt.image.ImageObserver.WIDTH;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }

    float f0 = java.awt.Component.RIGHT_ALIGNMENT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f0 == 1.0f);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }

    int i0 = java.awt.image.ImageObserver.FRAMEBITS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 16);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }

    int i0 = java.awt.image.ImageObserver.ABORT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 128);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }

    int i0 = java.awt.image.ImageObserver.PROPERTIES;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 4);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test23"); }

    tccrouter.gbl.ui.GeneralSettings generalSettings0 = tccrouter.gbl.ui.GeneralSettings.getInstance();
    java.awt.Container container1 = generalSettings0.getParent();
    int i2 = container1.getWidth();
    container1.transferFocus();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(generalSettings0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test24"); }

    tccrouter.gbl.ui.GeneralSettings generalSettings0 = tccrouter.gbl.ui.GeneralSettings.getInstance();
    java.awt.Container container1 = generalSettings0.getParent();
    java.awt.Window.Type type2 = null;
    // The following exception was thrown during execution in test generation
    try {
    generalSettings0.setType(type2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(generalSettings0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(container1);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test25"); }

    tccrouter.gbl.ui.GeneralSettings generalSettings0 = tccrouter.gbl.ui.GeneralSettings.getInstance();
    // The following exception was thrown during execution in test generation
    try {
    generalSettings0.getLocationOnScreen();
      org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(generalSettings0);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test27"); }

    tccrouter.gbl.ui.GeneralSettings generalSettings0 = tccrouter.gbl.ui.GeneralSettings.getInstance();
    java.awt.Container container1 = generalSettings0.getParent();
    java.beans.PropertyChangeListener propertyChangeListener3 = null;
    generalSettings0.addPropertyChangeListener("", propertyChangeListener3);
    generalSettings0.toBack();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(generalSettings0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(container1);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test29"); }

    tccrouter.gbl.ui.GeneralSettings generalSettings0 = tccrouter.gbl.ui.GeneralSettings.getInstance();
    java.awt.Container container1 = generalSettings0.getParent();
    boolean b2 = generalSettings0.isAlwaysOnTopSupported();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(generalSettings0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test30"); }

    tccrouter.gbl.ui.GeneralSettings generalSettings0 = tccrouter.gbl.ui.GeneralSettings.getInstance();
    java.awt.Container container1 = generalSettings0.getParent();
    java.awt.event.MouseMotionListener mouseMotionListener2 = null;
    container1.addMouseMotionListener(mouseMotionListener2);
    java.awt.Dimension dimension4 = container1.getPreferredSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(generalSettings0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test33"); }

    tccrouter.gbl.ui.GeneralSettings generalSettings0 = tccrouter.gbl.ui.GeneralSettings.getInstance();
    java.awt.Window.Type type1 = generalSettings0.getType();
    tccrouter.gbl.ui.GeneralSettings generalSettings2 = tccrouter.gbl.ui.GeneralSettings.getInstance();
    java.awt.Container container3 = generalSettings2.getParent();
    java.awt.event.MouseMotionListener mouseMotionListener4 = null;
    container3.addMouseMotionListener(mouseMotionListener4);
    java.awt.MenuComponent menuComponent6 = null;
    container3.remove(menuComponent6);
    generalSettings0.setLocationRelativeTo((java.awt.Component)container3);
    java.beans.PropertyChangeListener propertyChangeListener10 = null;
    generalSettings0.addPropertyChangeListener("", propertyChangeListener10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(generalSettings0);
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + java.awt.Window.Type.NORMAL + "'", type1.equals(java.awt.Window.Type.NORMAL));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(generalSettings2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(container3);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test34"); }

    tccrouter.gbl.ui.GeneralSettings generalSettings0 = tccrouter.gbl.ui.GeneralSettings.getInstance();
    java.awt.Window.Type type1 = generalSettings0.getType();
    tccrouter.gbl.ui.GeneralSettings generalSettings2 = tccrouter.gbl.ui.GeneralSettings.getInstance();
    java.awt.Container container3 = generalSettings2.getParent();
    java.awt.event.MouseMotionListener mouseMotionListener4 = null;
    container3.addMouseMotionListener(mouseMotionListener4);
    java.awt.MenuComponent menuComponent6 = null;
    container3.remove(menuComponent6);
    generalSettings0.setLocationRelativeTo((java.awt.Component)container3);
    container3.firePropertyChange("", (byte)10, (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(generalSettings0);
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + java.awt.Window.Type.NORMAL + "'", type1.equals(java.awt.Window.Type.NORMAL));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(generalSettings2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(container3);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test35"); }

    tccrouter.gbl.ui.GeneralSettings generalSettings0 = tccrouter.gbl.ui.GeneralSettings.getInstance();
    java.awt.Container container1 = generalSettings0.getParent();
    java.awt.event.MouseMotionListener mouseMotionListener2 = null;
    container1.addMouseMotionListener(mouseMotionListener2);
    int i4 = container1.getWidth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(generalSettings0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test39"); }

    tccrouter.gbl.ui.GeneralSettings generalSettings0 = tccrouter.gbl.ui.GeneralSettings.getInstance();
    java.awt.Window.Type type1 = generalSettings0.getType();
    generalSettings0.setFocusCycleRoot(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(generalSettings0);
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + java.awt.Window.Type.NORMAL + "'", type1.equals(java.awt.Window.Type.NORMAL));

  }

}