package tccrouter.ring.gui;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MenuTest {
  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test01"); }

    int i0 = java.awt.image.ImageObserver.HEIGHT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 2);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }

    java.util.Locale locale0 = null;
    javax.swing.JComponent.setDefaultLocale(locale0);

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

    int i0 = java.awt.image.ImageObserver.ABORT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 128);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }

    float f0 = java.awt.Component.BOTTOM_ALIGNMENT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f0 == 1.0f);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }

    java.lang.String str0 = javax.swing.JComponent.TOOL_TIP_TEXT_KEY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ToolTipText"+ "'", str0.equals("ToolTipText"));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }

    int i0 = javax.swing.JComponent.UNDEFINED_CONDITION;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == (-1));

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }

    int i0 = java.awt.image.ImageObserver.PROPERTIES;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 4);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }

    tccrouter.ring.gui.Menu menu0 = new tccrouter.ring.gui.Menu();
    // The following exception was thrown during execution in test generation
    try {
    java.awt.Component component2 = menu0.getComponent(1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }

    tccrouter.ring.gui.Menu menu0 = new tccrouter.ring.gui.Menu();
    javax.swing.TransferHandler transferHandler1 = null;
    menu0.setTransferHandler(transferHandler1);
    // The following exception was thrown during execution in test generation
    try {
    menu0.remove(0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }

    tccrouter.ring.gui.Menu menu0 = new tccrouter.ring.gui.Menu();
    menu0.transferFocus();
    java.util.Locale locale2 = null;
    menu0.setLocale(locale2);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }

    tccrouter.ring.gui.Menu menu0 = new tccrouter.ring.gui.Menu();
    java.awt.GraphicsConfiguration graphicsConfiguration1 = menu0.getGraphicsConfiguration();
    java.awt.Insets insets2 = null;
    menu0.setMargin(insets2);
    menu0.setVisible(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(graphicsConfiguration1);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }

    float f0 = java.awt.Component.TOP_ALIGNMENT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f0 == 0.0f);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }

    tccrouter.ring.gui.Menu menu0 = new tccrouter.ring.gui.Menu();
    menu0.move(100, 128);
    boolean b4 = menu0.requestFocusInWindow();
    // The following exception was thrown during execution in test generation
    try {
    menu0.remove(1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }

    tccrouter.ring.gui.Menu menu0 = new tccrouter.ring.gui.Menu();
    javax.swing.TransferHandler transferHandler1 = null;
    menu0.setTransferHandler(transferHandler1);
    java.awt.ComponentOrientation componentOrientation3 = menu0.getComponentOrientation();
    java.awt.event.ContainerListener[] containerListener_array4 = menu0.getContainerListeners();
    menu0.setRequestFocusEnabled(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentOrientation3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(containerListener_array4);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }

    tccrouter.ring.gui.Menu menu0 = new tccrouter.ring.gui.Menu();
    menu0.move(100, 128);
    java.lang.String str4 = menu0.getToolTipText();
    tccrouter.ring.gui.Menu menu5 = new tccrouter.ring.gui.Menu();
    menu5.transferFocus();
    java.awt.Component component7 = menu0.add((java.awt.Component)menu5);
    menu5.setToolTipText("");
    menu5.setIgnoreRepaint(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component7);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }

    tccrouter.ring.gui.Menu menu0 = new tccrouter.ring.gui.Menu();
    menu0.move(100, 128);
    menu0.repaint((long)0, (int)(short)-1, (int)'a', 0, (int)(byte)0);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }

    tccrouter.ring.gui.Menu menu0 = new tccrouter.ring.gui.Menu();
    menu0.move(100, 128);
    boolean b4 = menu0.requestFocusInWindow();
    java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListener_array5 = menu0.getHierarchyBoundsListeners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyBoundsListener_array5);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }

    tccrouter.ring.gui.Menu menu0 = new tccrouter.ring.gui.Menu();
    java.beans.PropertyChangeListener propertyChangeListener2 = null;
    menu0.removePropertyChangeListener("", propertyChangeListener2);
    java.awt.Component[] component_array4 = menu0.getComponents();
    java.awt.event.MouseWheelListener[] mouseWheelListener_array5 = menu0.getMouseWheelListeners();
    boolean b6 = menu0.isShowing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseWheelListener_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }

    tccrouter.ring.gui.Menu menu0 = new tccrouter.ring.gui.Menu();
    javax.swing.TransferHandler transferHandler1 = null;
    menu0.setTransferHandler(transferHandler1);
    java.awt.ComponentOrientation componentOrientation3 = menu0.getComponentOrientation();
    javax.swing.event.AncestorListener ancestorListener4 = null;
    menu0.addAncestorListener(ancestorListener4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentOrientation3);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }

    tccrouter.ring.gui.Menu menu0 = new tccrouter.ring.gui.Menu();
    javax.swing.TransferHandler transferHandler1 = null;
    menu0.setTransferHandler(transferHandler1);
    java.awt.ComponentOrientation componentOrientation3 = menu0.getComponentOrientation();
    menu0.setBounds(2, (int)(byte)-1, 10, 1);
    javax.swing.InputMap inputMap9 = menu0.getInputMap();
    javax.swing.InputVerifier inputVerifier10 = menu0.getInputVerifier();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentOrientation3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputVerifier10);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test23"); }

    tccrouter.ring.gui.Menu menu0 = new tccrouter.ring.gui.Menu();
    javax.swing.TransferHandler transferHandler1 = null;
    menu0.setTransferHandler(transferHandler1);
    java.awt.ComponentOrientation componentOrientation3 = menu0.getComponentOrientation();
    java.awt.event.ContainerListener[] containerListener_array4 = menu0.getContainerListeners();
    javax.swing.Action action5 = null;
    menu0.addMenuItem(action5, "hi!", "", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentOrientation3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(containerListener_array4);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test24"); }

    tccrouter.ring.gui.Menu menu0 = new tccrouter.ring.gui.Menu();
    menu0.move(100, 128);
    java.awt.Graphics graphics4 = null;
    menu0.update(graphics4);
    java.awt.Graphics graphics6 = null;
    menu0.print(graphics6);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test25"); }

    tccrouter.ring.gui.Menu menu0 = new tccrouter.ring.gui.Menu();
    javax.swing.TransferHandler transferHandler1 = null;
    menu0.setTransferHandler(transferHandler1);
    java.awt.ComponentOrientation componentOrientation3 = menu0.getComponentOrientation();
    menu0.setBounds(2, (int)(byte)-1, 10, 1);
    menu0.repaint((int)(short)100, (int)'4', (int)(short)1, (-1));
    boolean b15 = menu0.areFocusTraversalKeysSet((int)(short)0);
    java.awt.event.InputMethodListener inputMethodListener16 = null;
    menu0.addInputMethodListener(inputMethodListener16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentOrientation3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test26"); }

    tccrouter.ring.gui.Menu menu0 = new tccrouter.ring.gui.Menu();
    java.awt.GraphicsConfiguration graphicsConfiguration1 = menu0.getGraphicsConfiguration();
    java.awt.Insets insets2 = null;
    menu0.setMargin(insets2);
    tccrouter.ring.gui.Menu menu4 = new tccrouter.ring.gui.Menu();
    menu4.move(100, 128);
    java.awt.Graphics graphics8 = null;
    menu4.update(graphics8);
    java.awt.Point point10 = menu4.getLocation();
    java.awt.Component component11 = menu0.findComponentAt(point10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(graphicsConfiguration1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component11);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test27"); }

    tccrouter.ring.gui.Menu menu0 = new tccrouter.ring.gui.Menu();
    javax.swing.TransferHandler transferHandler1 = null;
    menu0.setTransferHandler(transferHandler1);
    java.awt.Rectangle rectangle3 = null;
    // The following exception was thrown during execution in test generation
    try {
    menu0.computeVisibleRect(rectangle3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test28"); }

    tccrouter.ring.gui.Menu menu0 = new tccrouter.ring.gui.Menu();
    java.beans.PropertyChangeListener propertyChangeListener2 = null;
    menu0.removePropertyChangeListener("", propertyChangeListener2);
    java.awt.Component[] component_array4 = menu0.getComponents();
    java.awt.Font font5 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.awt.FontMetrics fontMetrics6 = menu0.getFontMetrics(font5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component_array4);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test29"); }

    tccrouter.ring.gui.Menu menu0 = new tccrouter.ring.gui.Menu();
    menu0.move(100, 128);
    java.lang.String str4 = menu0.getToolTipText();
    tccrouter.ring.gui.Menu menu5 = new tccrouter.ring.gui.Menu();
    menu5.transferFocus();
    java.awt.Component component7 = menu0.add((java.awt.Component)menu5);
    java.awt.Container container8 = menu5.getParent();
    java.beans.PropertyChangeListener propertyChangeListener10 = null;
    container8.addPropertyChangeListener("", propertyChangeListener10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(container8);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test30"); }

    tccrouter.ring.gui.Menu menu0 = new tccrouter.ring.gui.Menu();
    menu0.transferFocus();
    boolean b2 = menu0.isFocusable();
    java.awt.event.HierarchyListener[] hierarchyListener_array3 = menu0.getHierarchyListeners();
    java.awt.Dimension dimension4 = null;
    menu0.setPreferredSize(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array3);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test31"); }

    tccrouter.ring.gui.Menu menu0 = new tccrouter.ring.gui.Menu();
    javax.swing.TransferHandler transferHandler1 = null;
    menu0.setTransferHandler(transferHandler1);
    java.awt.ComponentOrientation componentOrientation3 = menu0.getComponentOrientation();
    boolean b4 = menu0.getAutoscrolls();
    javax.swing.ActionMap actionMap5 = null;
    menu0.setActionMap(actionMap5);
    java.awt.event.KeyListener[] keyListener_array7 = menu0.getKeyListeners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentOrientation3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(keyListener_array7);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test32"); }

    tccrouter.ring.gui.Menu menu0 = new tccrouter.ring.gui.Menu();
    java.awt.GraphicsConfiguration graphicsConfiguration1 = menu0.getGraphicsConfiguration();
    boolean b2 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)menu0);
    java.awt.Color color3 = null;
    menu0.setBackground(color3);
    java.beans.VetoableChangeListener vetoableChangeListener5 = null;
    menu0.addVetoableChangeListener(vetoableChangeListener5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(graphicsConfiguration1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test33"); }

    tccrouter.ring.gui.Menu menu0 = new tccrouter.ring.gui.Menu();
    javax.swing.TransferHandler transferHandler1 = null;
    menu0.setTransferHandler(transferHandler1);
    java.awt.ComponentOrientation componentOrientation3 = menu0.getComponentOrientation();
    boolean b4 = menu0.getAutoscrolls();
    java.awt.Insets insets5 = menu0.getMargin();
    java.awt.Font font6 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.awt.FontMetrics fontMetrics7 = menu0.getFontMetrics(font6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentOrientation3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(insets5);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test34"); }

    tccrouter.ring.gui.Menu menu0 = new tccrouter.ring.gui.Menu();
    java.beans.PropertyChangeListener propertyChangeListener2 = null;
    menu0.removePropertyChangeListener("", propertyChangeListener2);
    java.awt.Component[] component_array4 = menu0.getComponents();
    tccrouter.ring.gui.Menu menu5 = new tccrouter.ring.gui.Menu();
    menu5.move(100, 128);
    java.awt.Graphics graphics9 = null;
    menu5.update(graphics9);
    java.awt.Point point11 = menu5.getLocation();
    menu0.setLocation(point11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point11);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test35"); }

    tccrouter.ring.gui.Menu menu0 = new tccrouter.ring.gui.Menu();
    javax.swing.TransferHandler transferHandler1 = null;
    menu0.setTransferHandler(transferHandler1);
    java.awt.ComponentOrientation componentOrientation3 = menu0.getComponentOrientation();
    menu0.setBounds(2, (int)(byte)-1, 10, 1);
    menu0.repaint((int)(short)100, (int)'4', (int)(short)1, (-1));
    java.awt.ImageCapabilities imageCapabilities16 = null;
    java.awt.image.VolatileImage volatileImage17 = menu0.createVolatileImage(2, 0, imageCapabilities16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentOrientation3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(volatileImage17);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test36"); }

    tccrouter.ring.gui.Menu menu0 = new tccrouter.ring.gui.Menu();
    java.beans.PropertyChangeListener propertyChangeListener2 = null;
    menu0.removePropertyChangeListener("", propertyChangeListener2);
    java.awt.Component[] component_array4 = menu0.getComponents();
    java.awt.event.MouseMotionListener[] mouseMotionListener_array5 = menu0.getMouseMotionListeners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseMotionListener_array5);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test37"); }

    tccrouter.ring.gui.Menu menu0 = new tccrouter.ring.gui.Menu();
    java.beans.PropertyChangeListener propertyChangeListener2 = null;
    menu0.removePropertyChangeListener("", propertyChangeListener2);
    java.awt.Component[] component_array4 = menu0.getComponents();
    java.awt.event.MouseWheelListener[] mouseWheelListener_array5 = menu0.getMouseWheelListeners();
    javax.swing.MenuElement[] menuElement_array6 = menu0.getSubElements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseWheelListener_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(menuElement_array6);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test38"); }

    tccrouter.ring.gui.Menu menu0 = new tccrouter.ring.gui.Menu();
    menu0.move(100, 128);
    boolean b4 = menu0.requestFocusInWindow();
    java.awt.Font font5 = null;
    menu0.setFont(font5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test39"); }

    tccrouter.ring.gui.Menu menu0 = new tccrouter.ring.gui.Menu();
    javax.swing.TransferHandler transferHandler1 = null;
    menu0.setTransferHandler(transferHandler1);
    java.awt.ComponentOrientation componentOrientation3 = menu0.getComponentOrientation();
    java.awt.event.ContainerListener[] containerListener_array4 = menu0.getContainerListeners();
    java.awt.Component component6 = menu0.getComponentAtIndex(100);
    menu0.repaint();
    java.awt.Graphics graphics8 = menu0.getGraphics();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentOrientation3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(containerListener_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(graphics8);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test40"); }

    tccrouter.ring.gui.Menu menu0 = new tccrouter.ring.gui.Menu();
    java.awt.GraphicsConfiguration graphicsConfiguration1 = menu0.getGraphicsConfiguration();
    java.awt.Insets insets2 = null;
    menu0.setMargin(insets2);
    // The following exception was thrown during execution in test generation
    try {
    java.awt.Point point4 = menu0.getLocationOnScreen();
      org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(graphicsConfiguration1);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test41"); }

    tccrouter.ring.gui.Menu menu0 = new tccrouter.ring.gui.Menu();
    menu0.move(100, 128);
    boolean b4 = menu0.requestFocusInWindow();
    java.awt.event.MouseMotionListener[] mouseMotionListener_array5 = menu0.getMouseMotionListeners();
    menu0.invalidate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseMotionListener_array5);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test42"); }

    tccrouter.ring.gui.Menu menu0 = new tccrouter.ring.gui.Menu();
    java.awt.GraphicsConfiguration graphicsConfiguration1 = menu0.getGraphicsConfiguration();
    boolean b2 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)menu0);
    javax.swing.JPopupMenu jPopupMenu3 = menu0.getComponentPopupMenu();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(graphicsConfiguration1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jPopupMenu3);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test43"); }

    tccrouter.ring.gui.Menu menu0 = new tccrouter.ring.gui.Menu();
    javax.swing.TransferHandler transferHandler1 = null;
    menu0.setTransferHandler(transferHandler1);
    java.awt.ComponentOrientation componentOrientation3 = menu0.getComponentOrientation();
    java.awt.event.ContainerListener[] containerListener_array4 = menu0.getContainerListeners();
    java.awt.Component component6 = menu0.getComponentAtIndex(100);
    menu0.repaint();
    tccrouter.ring.gui.Menu menu8 = new tccrouter.ring.gui.Menu();
    menu8.transferFocus();
    java.awt.event.MouseWheelListener mouseWheelListener10 = null;
    menu8.addMouseWheelListener(mouseWheelListener10);
    menu0.setSelected((java.awt.Component)menu8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentOrientation3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(containerListener_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component6);

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test44"); }

    tccrouter.ring.gui.Menu menu0 = new tccrouter.ring.gui.Menu();
    menu0.move(100, 128);
    java.lang.String str4 = menu0.getToolTipText();
    java.awt.event.MouseEvent mouseEvent5 = null;
    java.awt.Point point6 = menu0.getToolTipLocation(mouseEvent5);
    boolean b7 = menu0.isLightweight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test45"); }

    tccrouter.ring.gui.Menu menu0 = new tccrouter.ring.gui.Menu();
    menu0.repaint();
    java.beans.VetoableChangeListener[] vetoableChangeListener_array2 = menu0.getVetoableChangeListeners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vetoableChangeListener_array2);

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test46"); }

    tccrouter.ring.gui.Menu menu0 = new tccrouter.ring.gui.Menu();
    menu0.move(100, 128);
    boolean b4 = menu0.requestFocusInWindow();
    java.awt.event.MouseMotionListener[] mouseMotionListener_array5 = menu0.getMouseMotionListeners();
    java.awt.Graphics graphics6 = null;
    menu0.printComponents(graphics6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseMotionListener_array5);

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test47"); }

    tccrouter.ring.gui.Menu menu0 = new tccrouter.ring.gui.Menu();
    java.awt.GraphicsConfiguration graphicsConfiguration1 = menu0.getGraphicsConfiguration();
    java.beans.PropertyChangeListener[] propertyChangeListener_array2 = menu0.getPropertyChangeListeners();
    menu0.firePropertyChange("ToolTipText", (short)0, (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(graphicsConfiguration1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array2);

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test48"); }

    tccrouter.ring.gui.Menu menu0 = new tccrouter.ring.gui.Menu();
    menu0.move(100, 128);
    boolean b4 = menu0.requestFocusInWindow();
    menu0.repaint();
    javax.swing.event.AncestorListener ancestorListener6 = null;
    menu0.addAncestorListener(ancestorListener6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test49"); }

    tccrouter.ring.gui.Menu menu0 = new tccrouter.ring.gui.Menu();
    javax.swing.TransferHandler transferHandler1 = null;
    menu0.setTransferHandler(transferHandler1);
    java.awt.ComponentOrientation componentOrientation3 = menu0.getComponentOrientation();
    boolean b4 = menu0.getAutoscrolls();
    java.awt.Insets insets5 = menu0.getMargin();
    tccrouter.ring.gui.Menu menu6 = new tccrouter.ring.gui.Menu();
    menu6.move(100, 128);
    java.lang.String str10 = menu6.getToolTipText();
    tccrouter.ring.gui.Menu menu11 = new tccrouter.ring.gui.Menu();
    menu11.transferFocus();
    java.awt.Component component13 = menu6.add((java.awt.Component)menu11);
    tccrouter.ring.gui.Menu menu14 = new tccrouter.ring.gui.Menu();
    menu14.transferFocus();
    java.awt.event.MouseWheelListener mouseWheelListener16 = null;
    menu14.addMouseWheelListener(mouseWheelListener16);
    tccrouter.ring.gui.Menu menu18 = new tccrouter.ring.gui.Menu();
    javax.swing.TransferHandler transferHandler19 = null;
    menu18.setTransferHandler(transferHandler19);
    java.awt.ComponentOrientation componentOrientation21 = menu18.getComponentOrientation();
    java.awt.event.ContainerListener[] containerListener_array22 = menu18.getContainerListeners();
    java.awt.Component component24 = menu18.getComponentAtIndex(100);
    menu18.repaint();
    menu11.add((java.awt.Component)menu14, (java.lang.Object)menu18);
    java.awt.Event event27 = null;
    boolean b30 = menu18.mouseDrag(event27, 0, 128);
    java.awt.Rectangle rectangle31 = menu18.bounds();
    menu0.setBounds(rectangle31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentOrientation3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(insets5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentOrientation21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(containerListener_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle31);

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test50"); }

    tccrouter.ring.gui.Menu menu0 = new tccrouter.ring.gui.Menu();
    menu0.transferFocus();
    boolean b2 = menu0.isFocusable();
    java.awt.event.HierarchyListener[] hierarchyListener_array3 = menu0.getHierarchyListeners();
    java.awt.event.ComponentListener[] componentListener_array4 = menu0.getComponentListeners();
    java.awt.Graphics graphics5 = menu0.getGraphics();
    java.awt.event.ComponentListener[] componentListener_array6 = menu0.getComponentListeners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(graphics5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array6);

  }

  @Test
  public void test51() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test51"); }

    tccrouter.ring.gui.Menu menu0 = new tccrouter.ring.gui.Menu();
    javax.swing.TransferHandler transferHandler1 = null;
    menu0.setTransferHandler(transferHandler1);
    java.awt.ComponentOrientation componentOrientation3 = menu0.getComponentOrientation();
    menu0.setBounds(2, (int)(byte)-1, 10, 1);
    boolean b9 = menu0.isDoubleBuffered();
    menu0.doLayout();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentOrientation3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test52() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test52"); }

    tccrouter.ring.gui.Menu menu0 = new tccrouter.ring.gui.Menu();
    javax.swing.TransferHandler transferHandler1 = null;
    menu0.setTransferHandler(transferHandler1);
    java.awt.ComponentOrientation componentOrientation3 = menu0.getComponentOrientation();
    menu0.setBounds(2, (int)(byte)-1, 10, 1);
    menu0.repaint((int)(short)100, (int)'4', (int)(short)1, (-1));
    menu0.grabFocus();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentOrientation3);

  }

  @Test
  public void test53() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test53"); }

    tccrouter.ring.gui.Menu menu0 = new tccrouter.ring.gui.Menu();
    java.beans.PropertyChangeListener propertyChangeListener2 = null;
    menu0.removePropertyChangeListener("", propertyChangeListener2);
    java.awt.Component[] component_array4 = menu0.getComponents();
    java.awt.event.MouseWheelListener[] mouseWheelListener_array5 = menu0.getMouseWheelListeners();
    java.awt.event.ComponentListener componentListener6 = null;
    menu0.removeComponentListener(componentListener6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseWheelListener_array5);

  }

  @Test
  public void test54() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test54"); }

    tccrouter.ring.gui.Menu menu0 = new tccrouter.ring.gui.Menu();
    javax.swing.TransferHandler transferHandler1 = null;
    menu0.setTransferHandler(transferHandler1);
    menu0.setAlignmentY(0.5f);

  }

  @Test
  public void test55() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test55"); }

    tccrouter.ring.gui.Menu menu0 = new tccrouter.ring.gui.Menu();
    javax.swing.TransferHandler transferHandler1 = null;
    menu0.setTransferHandler(transferHandler1);
    java.awt.im.InputContext inputContext3 = menu0.getInputContext();
    menu0.resize((int)(byte)100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputContext3);

  }

  @Test
  public void test56() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test56"); }

    tccrouter.ring.gui.Menu menu0 = new tccrouter.ring.gui.Menu();
    java.awt.GraphicsConfiguration graphicsConfiguration1 = menu0.getGraphicsConfiguration();
    java.awt.image.VolatileImage volatileImage4 = menu0.createVolatileImage(0, 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(graphicsConfiguration1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(volatileImage4);

  }

}