package tccrouter.ring.gui;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NavigationViewTest {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test01"); }

    int i0 = java.awt.image.ImageObserver.ABORT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 128);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }

    int i0 = java.awt.image.ImageObserver.WIDTH;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

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

    float f0 = java.awt.Component.CENTER_ALIGNMENT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f0 == 0.5f);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }

    int i0 = javax.swing.JComponent.WHEN_IN_FOCUSED_WINDOW;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 2);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }

    java.lang.String str0 = javax.swing.JComponent.TOOL_TIP_TEXT_KEY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ToolTipText"+ "'", str0.equals("ToolTipText"));

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }

    int i0 = javax.swing.JComponent.UNDEFINED_CONDITION;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == (-1));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }

    int i0 = java.awt.image.ImageObserver.FRAMEBITS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 16);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }

    int i0 = javax.swing.JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }

    float f0 = java.awt.Component.TOP_ALIGNMENT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f0 == 0.0f);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }

    float f0 = java.awt.Component.LEFT_ALIGNMENT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f0 == 0.0f);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }

    java.awt.Component component0 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b1 = javax.swing.JComponent.isLightweightComponent(component0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }

    float f0 = java.awt.Component.BOTTOM_ALIGNMENT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f0 == 1.0f);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }

    tccrouter.ring.gui.NavigationView navigationView0 = new tccrouter.ring.gui.NavigationView();
    boolean b1 = navigationView0.isVisible();
    java.awt.event.ContainerListener[] containerListener_array2 = navigationView0.getContainerListeners();
    java.awt.Point point3 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.awt.Component component4 = navigationView0.getComponentAt(point3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(containerListener_array2);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }

    tccrouter.ring.gui.NavigationView navigationView0 = new tccrouter.ring.gui.NavigationView();
    boolean b1 = navigationView0.isVisible();
    java.awt.event.ContainerListener[] containerListener_array2 = navigationView0.getContainerListeners();
    navigationView0.setVisible(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(containerListener_array2);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }

    tccrouter.ring.gui.NavigationView navigationView0 = new tccrouter.ring.gui.NavigationView();
    boolean b1 = navigationView0.isVisible();
    java.awt.Insets insets2 = null;
    java.awt.Insets insets3 = navigationView0.getInsets(insets2);
    java.awt.Rectangle rectangle4 = navigationView0.getBounds();
    java.beans.VetoableChangeListener vetoableChangeListener5 = null;
    navigationView0.addVetoableChangeListener(vetoableChangeListener5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(insets3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle4);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }

    tccrouter.ring.gui.NavigationView navigationView0 = new tccrouter.ring.gui.NavigationView();
    navigationView0.transferFocus();
    navigationView0.revalidate();

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }

    tccrouter.ring.gui.NavigationView navigationView0 = new tccrouter.ring.gui.NavigationView();
    navigationView0.transferFocus();
    javax.swing.ActionMap actionMap2 = null;
    navigationView0.setActionMap(actionMap2);
    java.awt.Dimension dimension4 = navigationView0.size();
    java.awt.Point point5 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b6 = navigationView0.contains(point5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }

    tccrouter.ring.gui.NavigationView navigationView0 = new tccrouter.ring.gui.NavigationView();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = navigationView0.getBounds(rectangle1);
    java.awt.Graphics graphics3 = null;
    navigationView0.update(graphics3);
    java.awt.Event event5 = null;
    boolean b8 = navigationView0.mouseDrag(event5, 16, (int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }

    tccrouter.ring.gui.NavigationView navigationView0 = new tccrouter.ring.gui.NavigationView();
    navigationView0.transferFocus();
    javax.swing.ActionMap actionMap2 = null;
    navigationView0.setActionMap(actionMap2);
    java.awt.Point point4 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b5 = navigationView0.contains(point4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }

    tccrouter.ring.gui.NavigationView navigationView0 = new tccrouter.ring.gui.NavigationView();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = navigationView0.getBounds(rectangle1);
    navigationView0.setAlignmentY(0.0f);
    java.awt.Point point6 = navigationView0.getMousePosition(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point6);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }

    tccrouter.ring.gui.NavigationView navigationView0 = new tccrouter.ring.gui.NavigationView();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = navigationView0.getBounds(rectangle1);
    navigationView0.resetKeyboardActions();
    java.awt.Event event4 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b5 = navigationView0.handleEvent(event4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test23"); }

    tccrouter.ring.gui.NavigationView navigationView0 = new tccrouter.ring.gui.NavigationView();
    navigationView0.transferFocus();
    java.awt.Toolkit toolkit2 = navigationView0.getToolkit();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit2);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test24"); }

    tccrouter.ring.gui.NavigationView navigationView0 = new tccrouter.ring.gui.NavigationView();
    boolean b1 = navigationView0.isBackgroundSet();
    boolean b2 = navigationView0.isValidateRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test25"); }

    int i0 = java.awt.image.ImageObserver.SOMEBITS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 8);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test26"); }

    tccrouter.ring.gui.NavigationView navigationView0 = new tccrouter.ring.gui.NavigationView();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = navigationView0.getBounds(rectangle1);
    java.awt.event.HierarchyListener hierarchyListener3 = null;
    navigationView0.addHierarchyListener(hierarchyListener3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test27"); }

    tccrouter.ring.gui.NavigationView navigationView0 = new tccrouter.ring.gui.NavigationView();
    boolean b1 = navigationView0.isVisible();
    java.awt.Point point2 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.awt.Component component3 = navigationView0.getComponentAt(point2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test28"); }

    tccrouter.ring.gui.NavigationView navigationView0 = new tccrouter.ring.gui.NavigationView();
    boolean b1 = navigationView0.isVisible();
    java.awt.Insets insets2 = null;
    java.awt.Insets insets3 = navigationView0.getInsets(insets2);
    java.awt.Rectangle rectangle4 = navigationView0.getBounds();
    boolean b5 = navigationView0.isForegroundSet();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener6 = null;
    navigationView0.addHierarchyBoundsListener(hierarchyBoundsListener6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(insets3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test29"); }

    tccrouter.ring.gui.NavigationView navigationView0 = new tccrouter.ring.gui.NavigationView();
    java.awt.Rectangle rectangle1 = null;
    java.awt.Rectangle rectangle2 = navigationView0.getBounds(rectangle1);
    java.awt.Graphics graphics3 = null;
    navigationView0.update(graphics3);
    navigationView0.setDoubleBuffered(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test30"); }

    tccrouter.ring.gui.NavigationView navigationView0 = new tccrouter.ring.gui.NavigationView();
    boolean b1 = navigationView0.isVisible();
    java.awt.event.ContainerListener[] containerListener_array2 = navigationView0.getContainerListeners();
    java.awt.image.VolatileImage volatileImage5 = navigationView0.createVolatileImage((int)(short)0, (int)(byte)10);
    javax.swing.InputVerifier inputVerifier6 = null;
    navigationView0.setInputVerifier(inputVerifier6);
    navigationView0.firePropertyChange("ToolTipText", (double)(short)10, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(containerListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(volatileImage5);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test31"); }

    tccrouter.ring.gui.NavigationView navigationView0 = new tccrouter.ring.gui.NavigationView();
    java.beans.PropertyChangeListener propertyChangeListener1 = null;
    navigationView0.removePropertyChangeListener(propertyChangeListener1);
    navigationView0.reshape((int)'a', 128, 100, (int)'#');

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test32"); }

    tccrouter.ring.gui.NavigationView navigationView0 = new tccrouter.ring.gui.NavigationView();
    boolean b1 = navigationView0.isVisible();
    navigationView0.hide();
    navigationView0.disable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test33"); }

    tccrouter.ring.gui.NavigationView navigationView0 = new tccrouter.ring.gui.NavigationView();
    navigationView0.transferFocus();
    java.awt.Component component3 = navigationView0.getComponent((int)(short)0);
    java.awt.event.ComponentListener componentListener4 = null;
    navigationView0.removeComponentListener(componentListener4);
    navigationView0.setRequestFocusEnabled(false);
    java.awt.ComponentOrientation componentOrientation8 = null;
    // The following exception was thrown during execution in test generation
    try {
    navigationView0.applyComponentOrientation(componentOrientation8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component3);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test34"); }

    tccrouter.ring.gui.NavigationView navigationView0 = new tccrouter.ring.gui.NavigationView();
    boolean b1 = navigationView0.isVisible();
    java.awt.event.ContainerListener[] containerListener_array2 = navigationView0.getContainerListeners();
    java.awt.image.VolatileImage volatileImage5 = navigationView0.createVolatileImage((int)(short)0, (int)(byte)10);
    javax.swing.InputVerifier inputVerifier6 = null;
    navigationView0.setInputVerifier(inputVerifier6);
    navigationView0.grabFocus();
    java.awt.LayoutManager layoutManager9 = null;
    navigationView0.setLayout(layoutManager9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(containerListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(volatileImage5);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test35"); }

    tccrouter.ring.gui.NavigationView navigationView0 = new tccrouter.ring.gui.NavigationView();
    boolean b1 = navigationView0.isVisible();
    java.awt.Insets insets2 = null;
    java.awt.Insets insets3 = navigationView0.getInsets(insets2);
    java.awt.Rectangle rectangle4 = navigationView0.getBounds();
    int i5 = navigationView0.countComponents();
    navigationView0.setLocation((int)'a', 10);
    java.awt.Color color9 = navigationView0.getForeground();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(insets3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color9);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test36"); }

    tccrouter.ring.gui.NavigationView navigationView0 = new tccrouter.ring.gui.NavigationView();
    navigationView0.transferFocus();
    java.beans.PropertyChangeListener propertyChangeListener2 = null;
    navigationView0.removePropertyChangeListener(propertyChangeListener2);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test37"); }

    tccrouter.ring.gui.NavigationView navigationView0 = new tccrouter.ring.gui.NavigationView();
    boolean b1 = navigationView0.isVisible();
    navigationView0.hide();
    boolean b3 = navigationView0.requestFocusInWindow();
    int i4 = navigationView0.getY();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test38"); }

    tccrouter.ring.gui.NavigationView navigationView0 = new tccrouter.ring.gui.NavigationView();
    navigationView0.transferFocus();
    java.awt.Component component3 = navigationView0.getComponent((int)(short)0);
    java.awt.event.ComponentListener componentListener4 = null;
    navigationView0.removeComponentListener(componentListener4);
    navigationView0.setRequestFocusEnabled(false);
    java.awt.Rectangle rectangle8 = navigationView0.getVisibleRect();
    boolean b11 = navigationView0.contains(0, (int)' ');
    java.lang.Object obj13 = navigationView0.getClientProperty((java.lang.Object)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test39"); }

    tccrouter.ring.gui.NavigationView navigationView0 = new tccrouter.ring.gui.NavigationView();
    navigationView0.transferFocus();
    java.awt.Component component3 = navigationView0.getComponent((int)(short)0);
    java.awt.event.ComponentListener componentListener4 = null;
    navigationView0.removeComponentListener(componentListener4);
    navigationView0.setRequestFocusEnabled(false);
    java.awt.Rectangle rectangle8 = navigationView0.getVisibleRect();
    boolean b11 = navigationView0.contains(0, (int)' ');
    java.awt.Event event12 = null;
    boolean b15 = navigationView0.mouseMove(event12, (int)(short)-1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test40"); }

    tccrouter.ring.gui.NavigationView navigationView0 = new tccrouter.ring.gui.NavigationView();
    boolean b1 = navigationView0.isVisible();
    java.awt.event.ContainerListener[] containerListener_array2 = navigationView0.getContainerListeners();
    java.awt.image.VolatileImage volatileImage5 = navigationView0.createVolatileImage((int)(short)0, (int)(byte)10);
    javax.swing.InputVerifier inputVerifier6 = null;
    navigationView0.setInputVerifier(inputVerifier6);
    navigationView0.grabFocus();
    boolean b9 = navigationView0.getIgnoreRepaint();
    int i10 = navigationView0.getX();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(containerListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(volatileImage5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test41"); }

    tccrouter.ring.gui.NavigationView navigationView0 = new tccrouter.ring.gui.NavigationView();
    boolean b1 = navigationView0.isVisible();
    java.awt.Insets insets2 = null;
    java.awt.Insets insets3 = navigationView0.getInsets(insets2);
    java.awt.Rectangle rectangle4 = navigationView0.getBounds();
    int i5 = navigationView0.countComponents();
    navigationView0.setLocation((int)'a', 10);
    navigationView0.disable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(insets3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test42"); }

    tccrouter.ring.gui.NavigationView navigationView0 = new tccrouter.ring.gui.NavigationView();
    navigationView0.transferFocus();
    java.awt.Component component3 = navigationView0.getComponent((int)(short)0);
    java.awt.event.ComponentListener componentListener4 = null;
    navigationView0.removeComponentListener(componentListener4);
    java.awt.dnd.DropTarget dropTarget6 = navigationView0.getDropTarget();
    java.awt.Dimension dimension7 = navigationView0.size();
    tccrouter.ring.gui.NavigationView navigationView8 = new tccrouter.ring.gui.NavigationView();
    navigationView8.transferFocus();
    java.awt.Component component11 = navigationView8.getComponent((int)(short)0);
    java.awt.event.ComponentListener componentListener12 = null;
    navigationView8.removeComponentListener(componentListener12);
    navigationView8.setRequestFocusEnabled(false);
    java.awt.Rectangle rectangle16 = navigationView8.getVisibleRect();
    tccrouter.ring.gui.NavigationView navigationView17 = new tccrouter.ring.gui.NavigationView();
    java.awt.Rectangle rectangle18 = null;
    java.awt.Rectangle rectangle19 = navigationView17.getBounds(rectangle18);
    navigationView8.paintImmediately(rectangle19);
    navigationView0.paintImmediately(rectangle19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(dropTarget6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle19);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test43"); }

    tccrouter.ring.gui.NavigationView navigationView0 = new tccrouter.ring.gui.NavigationView();
    boolean b1 = navigationView0.isVisible();
    java.awt.event.ContainerListener[] containerListener_array2 = navigationView0.getContainerListeners();
    java.awt.image.VolatileImage volatileImage5 = navigationView0.createVolatileImage((int)(short)0, (int)(byte)10);
    javax.swing.InputVerifier inputVerifier6 = null;
    navigationView0.setInputVerifier(inputVerifier6);
    tccrouter.ring.gui.NavigationView navigationView8 = new tccrouter.ring.gui.NavigationView();
    navigationView8.transferFocus();
    java.awt.Component component11 = navigationView8.getComponent((int)(short)0);
    java.awt.event.ComponentListener componentListener12 = null;
    navigationView8.removeComponentListener(componentListener12);
    java.awt.dnd.DropTarget dropTarget14 = navigationView8.getDropTarget();
    java.awt.event.ContainerListener containerListener15 = null;
    navigationView8.removeContainerListener(containerListener15);
    java.awt.event.KeyListener keyListener17 = null;
    navigationView8.addKeyListener(keyListener17);
    java.awt.Point point19 = null;
    java.awt.Point point20 = navigationView8.getLocation(point19);
    java.awt.Component component21 = navigationView0.getComponentAt(point20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(containerListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(volatileImage5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(dropTarget14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component21);

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test44"); }

    tccrouter.ring.gui.NavigationView navigationView0 = new tccrouter.ring.gui.NavigationView();
    boolean b1 = navigationView0.isVisible();
    navigationView0.hide();
    boolean b3 = navigationView0.requestFocusInWindow();
    boolean b4 = navigationView0.isPaintingForPrint();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test45"); }

    tccrouter.ring.gui.NavigationView navigationView0 = new tccrouter.ring.gui.NavigationView();
    boolean b1 = navigationView0.isVisible();
    java.awt.event.ContainerListener[] containerListener_array2 = navigationView0.getContainerListeners();
    javax.swing.KeyStroke[] keyStroke_array3 = navigationView0.getRegisteredKeyStrokes();
    java.awt.Dimension dimension4 = navigationView0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(containerListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(keyStroke_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test46"); }

    tccrouter.ring.gui.NavigationView navigationView0 = new tccrouter.ring.gui.NavigationView();
    boolean b1 = navigationView0.isVisible();
    java.awt.Insets insets2 = null;
    java.awt.Insets insets3 = navigationView0.getInsets(insets2);
    java.awt.event.MouseMotionListener mouseMotionListener4 = null;
    navigationView0.addMouseMotionListener(mouseMotionListener4);
    java.awt.event.MouseMotionListener mouseMotionListener6 = null;
    navigationView0.addMouseMotionListener(mouseMotionListener6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(insets3);

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test47"); }

    tccrouter.ring.gui.NavigationView navigationView0 = new tccrouter.ring.gui.NavigationView();
    boolean b1 = navigationView0.isVisible();
    java.awt.event.ContainerListener[] containerListener_array2 = navigationView0.getContainerListeners();
    java.awt.image.VolatileImage volatileImage5 = navigationView0.createVolatileImage((int)(short)0, (int)(byte)10);
    javax.swing.InputVerifier inputVerifier6 = null;
    navigationView0.setInputVerifier(inputVerifier6);
    java.awt.event.MouseWheelListener mouseWheelListener8 = null;
    navigationView0.removeMouseWheelListener(mouseWheelListener8);
    javax.accessibility.AccessibleContext accessibleContext10 = navigationView0.getAccessibleContext();
    boolean b11 = navigationView0.isMaximumSizeSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(containerListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(volatileImage5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test48"); }

    tccrouter.ring.gui.NavigationView navigationView0 = new tccrouter.ring.gui.NavigationView();
    navigationView0.transferFocus();
    java.awt.Component component3 = navigationView0.getComponent((int)(short)0);
    java.awt.event.ComponentListener componentListener4 = null;
    navigationView0.removeComponentListener(componentListener4);
    java.awt.dnd.DropTarget dropTarget6 = navigationView0.getDropTarget();
    java.awt.event.ContainerListener containerListener7 = null;
    navigationView0.removeContainerListener(containerListener7);
    java.awt.event.KeyListener keyListener9 = null;
    navigationView0.addKeyListener(keyListener9);
    boolean b11 = navigationView0.isForegroundSet();
    tccrouter.ring.gui.NavigationView navigationView12 = new tccrouter.ring.gui.NavigationView();
    navigationView12.transferFocus();
    javax.swing.ActionMap actionMap14 = null;
    navigationView12.setActionMap(actionMap14);
    java.awt.Dimension dimension16 = navigationView12.size();
    navigationView0.setSize(dimension16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(dropTarget6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension16);

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test49"); }

    tccrouter.ring.gui.NavigationView navigationView0 = new tccrouter.ring.gui.NavigationView();
    boolean b1 = navigationView0.isVisible();
    java.awt.Insets insets2 = null;
    java.awt.Insets insets3 = navigationView0.getInsets(insets2);
    tccrouter.ring.gui.NavigationView navigationView4 = new tccrouter.ring.gui.NavigationView();
    navigationView4.transferFocus();
    java.awt.Component component7 = navigationView4.getComponent((int)(short)0);
    java.awt.event.ComponentListener componentListener8 = null;
    navigationView4.removeComponentListener(componentListener8);
    java.awt.dnd.DropTarget dropTarget10 = navigationView4.getDropTarget();
    java.awt.event.ContainerListener containerListener11 = null;
    navigationView4.removeContainerListener(containerListener11);
    java.awt.event.KeyListener keyListener13 = null;
    navigationView4.addKeyListener(keyListener13);
    java.awt.Point point15 = null;
    java.awt.Point point16 = navigationView4.getLocation(point15);
    // The following exception was thrown during execution in test generation
    try {
    java.awt.Component component17 = navigationView0.getComponentAt(point15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(insets3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(dropTarget10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point16);

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test50"); }

    tccrouter.ring.gui.NavigationView navigationView0 = new tccrouter.ring.gui.NavigationView();
    navigationView0.transferFocus();
    boolean b2 = navigationView0.isEnabled();
    tccrouter.ring.gui.NavigationView navigationView3 = new tccrouter.ring.gui.NavigationView();
    boolean b4 = navigationView3.isVisible();
    java.awt.Insets insets5 = null;
    java.awt.Insets insets6 = navigationView3.getInsets(insets5);
    java.awt.Rectangle rectangle7 = navigationView3.getBounds();
    int i8 = navigationView3.countComponents();
    java.util.Locale locale9 = javax.swing.JComponent.getDefaultLocale();
    javax.swing.JComponent.setDefaultLocale(locale9);
    navigationView3.setLocale(locale9);
    navigationView3.show(true);
    java.awt.image.ImageProducer imageProducer14 = null;
    java.awt.Image image15 = navigationView3.createImage(imageProducer14);
    boolean b21 = navigationView0.imageUpdate(image15, (int)'4', (int)(short)100, 0, 10, 16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(insets6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(image15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test51() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test51"); }

    tccrouter.ring.gui.NavigationView navigationView0 = new tccrouter.ring.gui.NavigationView();
    boolean b1 = navigationView0.isBackgroundSet();
    java.awt.Insets insets2 = null;
    java.awt.Insets insets3 = navigationView0.getInsets(insets2);
    java.awt.Color color4 = navigationView0.getForeground();
    boolean b5 = navigationView0.requestDefaultFocus();
    java.awt.Insets insets6 = navigationView0.getInsets();
    java.awt.Font font7 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.awt.FontMetrics fontMetrics8 = navigationView0.getFontMetrics(font7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(insets3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(insets6);

  }

}