package tccrouter.gbl.ui;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OpenGraphDialogTest {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test01"); }

    int i0 = java.awt.image.ImageObserver.SOMEBITS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 8);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }

    int i0 = java.awt.image.ImageObserver.HEIGHT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 2);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }

    float f0 = java.awt.Component.RIGHT_ALIGNMENT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f0 == 1.0f);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }

    int i0 = javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 0);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }

    float f0 = java.awt.Component.BOTTOM_ALIGNMENT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f0 == 1.0f);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }

    java.awt.Dialog.ModalityType modalityType0 = java.awt.Dialog.DEFAULT_MODALITY_TYPE;
    org.junit.Assert.assertTrue("'" + modalityType0 + "' != '" + java.awt.Dialog.ModalityType.APPLICATION_MODAL + "'", modalityType0.equals(java.awt.Dialog.ModalityType.APPLICATION_MODAL));

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }

    int i0 = java.awt.image.ImageObserver.ERROR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 64);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }

    java.awt.Window[] window_array0 = java.awt.Window.getOwnerlessWindows();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(window_array0);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }

    int i0 = java.awt.image.ImageObserver.ABORT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 128);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.beans.PropertyChangeListener propertyChangeListener2 = null;
    openGraphDialog0.removePropertyChangeListener("hi!", propertyChangeListener2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener1 = null;
    openGraphDialog0.addMouseMotionListener(mouseMotionListener1);
    java.awt.Rectangle rectangle3 = null;
    // The following exception was thrown during execution in test generation
    try {
    openGraphDialog0.setBounds(rectangle3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog0.firePropertyChange("hi!", (short)10, (short)(byte)10);
    java.awt.ComponentOrientation componentOrientation5 = null;
    // The following exception was thrown during execution in test generation
    try {
    openGraphDialog0.applyComponentOrientation(componentOrientation5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener11 = null;
    openGraphDialog0.removeHierarchyBoundsListener(hierarchyBoundsListener11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }

    float f0 = java.awt.Component.CENTER_ALIGNMENT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f0 == 0.5f);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    java.awt.AWTEvent aWTEvent11 = null;
    // The following exception was thrown during execution in test generation
    try {
    openGraphDialog5.dispatchEvent(aWTEvent11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test23"); }

    int i0 = javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 2);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test27"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    java.awt.event.ComponentListener[] componentListener_array11 = openGraphDialog0.getComponentListeners();
    java.awt.event.MouseMotionListener mouseMotionListener12 = null;
    openGraphDialog0.removeMouseMotionListener(mouseMotionListener12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array11);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test28"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog0.firePropertyChange("hi!", (short)10, (short)(byte)10);
    boolean b5 = openGraphDialog0.isVisible();
    int i8 = openGraphDialog0.getBaseline((int)' ', (int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test30"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog0.firePropertyChange("hi!", (short)10, (short)(byte)10);
    javax.swing.TransferHandler transferHandler5 = null;
    openGraphDialog0.setTransferHandler(transferHandler5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);

  }

}