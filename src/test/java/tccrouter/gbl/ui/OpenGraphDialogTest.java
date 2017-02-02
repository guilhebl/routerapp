package tccrouter.gbl.ui;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OpenGraphDialogTest {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }

    int i0 = java.awt.image.ImageObserver.SOMEBITS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 8);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }

    int i0 = java.awt.image.ImageObserver.HEIGHT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 2);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }

    float f0 = java.awt.Component.RIGHT_ALIGNMENT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f0 == 1.0f);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }

    int i0 = javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 0);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }

    float f0 = java.awt.Component.BOTTOM_ALIGNMENT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f0 == 1.0f);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }

    java.awt.Dialog.ModalityType modalityType0 = java.awt.Dialog.DEFAULT_MODALITY_TYPE;
    org.junit.Assert.assertTrue("'" + modalityType0 + "' != '" + java.awt.Dialog.ModalityType.APPLICATION_MODAL + "'", modalityType0.equals(java.awt.Dialog.ModalityType.APPLICATION_MODAL));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }

    int i0 = java.awt.image.ImageObserver.ERROR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 64);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }

    java.awt.Window[] window_array0 = java.awt.Window.getOwnerlessWindows();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(window_array0);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }

    int i0 = java.awt.image.ImageObserver.ABORT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 128);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }

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
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.util.ResourceBundle resourceBundle1 = null;
    // The following exception was thrown during execution in test generation
    try {
    openGraphDialog0.applyResourceBundle(resourceBundle1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }

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
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }

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
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }

    float f0 = java.awt.Component.CENTER_ALIGNMENT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f0 == 0.5f);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }

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
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }

    int i0 = javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 2);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener1 = null;
    openGraphDialog0.addMouseMotionListener(mouseMotionListener1);
    java.awt.Dimension dimension3 = openGraphDialog0.preferredSize();
    java.awt.event.MouseListener[] mouseListener_array4 = openGraphDialog0.getMouseListeners();
    java.awt.Event event5 = null;
    // The following exception was thrown during execution in test generation
    try {
    openGraphDialog0.deliverEvent(event5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseListener_array4);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener1 = null;
    openGraphDialog0.addMouseMotionListener(mouseMotionListener1);
    java.awt.Dimension dimension3 = openGraphDialog0.preferredSize();
    java.awt.event.MouseListener[] mouseListener_array4 = openGraphDialog0.getMouseListeners();
    java.awt.Event event5 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b6 = openGraphDialog0.postEvent(event5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseListener_array4);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isResizable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener1 = null;
    openGraphDialog0.addMouseMotionListener(mouseMotionListener1);
    java.lang.String str3 = openGraphDialog0.toString();
    java.awt.Dialog.ModalityType modalityType4 = openGraphDialog0.getModalityType();
    openGraphDialog0.repaint((long)'4', (int)(short)100, (int)' ', (int)(byte)1, (int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "tccrouter.gbl.ui.OpenGraphDialog[dialog0,65,24,0str3,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0str3,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"+ "'", str3.equals("tccrouter.gbl.ui.OpenGraphDialog[dialog0,65,24,0str3,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0str3,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"));
    org.junit.Assert.assertTrue("'" + modalityType4 + "' != '" + java.awt.Dialog.ModalityType.MODELESS + "'", modalityType4.equals(java.awt.Dialog.ModalityType.MODELESS));

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener1 = null;
    openGraphDialog0.addMouseMotionListener(mouseMotionListener1);
    openGraphDialog0.requestFocus();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    java.awt.Point point11 = openGraphDialog5.getMousePosition();
    java.awt.Image image12 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog15 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b18 = openGraphDialog15.inside((int)' ', 0);
    java.awt.Component component19 = openGraphDialog15.getGlassPane();
    int i20 = openGraphDialog5.checkImage(image12, (int)(byte)10, 128, (java.awt.image.ImageObserver)openGraphDialog15);
    java.io.PrintStream printStream21 = null;
    // The following exception was thrown during execution in test generation
    try {
    openGraphDialog5.list(printStream21);
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 32);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b3 = openGraphDialog0.inside((int)' ', 0);
    java.lang.String str4 = openGraphDialog0.getTitle();
    java.awt.Graphics graphics5 = null;
    // The following exception was thrown during execution in test generation
    try {
    openGraphDialog0.printAll(graphics5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    javax.swing.JList<java.lang.String> jlist_str2 = null;
    java.lang.String[] str_array8 = new java.lang.String[] { "", "tccrouter.gbl.ui.OpenGraphDialog[dialog0,65,24,0x0,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", "", "", "tccrouter.gbl.ui.OpenGraphDialog[dialog0,65,24,0x0,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" };
    java.lang.String[] str_array14 = new java.lang.String[] { "", "tccrouter.gbl.ui.OpenGraphDialog[dialog0,65,24,0x0,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", "", "", "tccrouter.gbl.ui.OpenGraphDialog[dialog0,65,24,0x0,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" };
    java.lang.String[] str_array20 = new java.lang.String[] { "", "tccrouter.gbl.ui.OpenGraphDialog[dialog0,65,24,0x0,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", "", "", "tccrouter.gbl.ui.OpenGraphDialog[dialog0,65,24,0x0,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" };
    java.lang.String[] str_array26 = new java.lang.String[] { "", "tccrouter.gbl.ui.OpenGraphDialog[dialog0,65,24,0x0,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", "", "", "tccrouter.gbl.ui.OpenGraphDialog[dialog0,65,24,0x0,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" };
    java.lang.String[][] str_array_array27 = new java.lang.String[][] { str_array8, str_array14, str_array20, str_array26 };
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str28 = openGraphDialog0.getListItem(jlist_str2, str_array_array27);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array_array27);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }

    int i0 = java.awt.image.ImageObserver.FRAMEBITS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 16);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }

    java.awt.Window[] window_array0 = java.awt.Window.getWindows();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(window_array0);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener1 = null;
    openGraphDialog0.addMouseMotionListener(mouseMotionListener1);
    java.awt.Dialog.ModalExclusionType modalExclusionType3 = null;
    openGraphDialog0.setModalExclusionType(modalExclusionType3);
    java.awt.Component component7 = openGraphDialog0.findComponentAt(100, (int)' ');
    java.beans.PropertyChangeListener propertyChangeListener9 = null;
    // The following exception was thrown during execution in test generation
    try {
    component7.removePropertyChangeListener("", propertyChangeListener9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component7);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b3 = openGraphDialog0.inside((int)' ', 0);
    java.awt.Component component4 = openGraphDialog0.getGlassPane();
    boolean b5 = openGraphDialog0.getFocusableWindowState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Event event2 = null;
    boolean b5 = openGraphDialog0.mouseExit(event2, 0, (int)(byte)100);
    java.awt.Shape shape6 = openGraphDialog0.getShape();
    javax.swing.JMenuBar jMenuBar7 = null;
    openGraphDialog0.setJMenuBar(jMenuBar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(shape6);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener1 = null;
    openGraphDialog0.addMouseMotionListener(mouseMotionListener1);
    java.lang.String str3 = openGraphDialog0.toString();
    java.awt.Dialog.ModalityType modalityType4 = openGraphDialog0.getModalityType();
    java.awt.event.HierarchyListener hierarchyListener5 = null;
    openGraphDialog0.removeHierarchyListener(hierarchyListener5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "tccrouter.gbl.ui.OpenGraphDialog[dialog0,8,10,128x30,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"+ "'", str3.equals("tccrouter.gbl.ui.OpenGraphDialog[dialog0,8,10,128x30,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"));
    org.junit.Assert.assertTrue("'" + modalityType4 + "' != '" + java.awt.Dialog.ModalityType.MODELESS + "'", modalityType4.equals(java.awt.Dialog.ModalityType.MODELESS));

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Event event2 = null;
    boolean b5 = openGraphDialog0.mouseExit(event2, 0, (int)(byte)100);
    java.awt.Shape shape6 = openGraphDialog0.getShape();
    java.awt.FocusTraversalPolicy focusTraversalPolicy7 = null;
    openGraphDialog0.setFocusTraversalPolicy(focusTraversalPolicy7);
    int i9 = openGraphDialog0.getWidth();
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog10 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener11 = null;
    openGraphDialog10.addMouseMotionListener(mouseMotionListener11);
    java.lang.String str13 = openGraphDialog10.toString();
    java.awt.Dialog.ModalityType modalityType14 = openGraphDialog10.getModalityType();
    openGraphDialog0.setModalityType(modalityType14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(shape6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "tccrouter.gbl.ui.OpenGraphDialog[dialog0,8,10,128x30,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"+ "'", str13.equals("tccrouter.gbl.ui.OpenGraphDialog[dialog0,8,10,128x30,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"));
    org.junit.Assert.assertTrue("'" + modalityType14 + "' != '" + java.awt.Dialog.ModalityType.MODELESS + "'", modalityType14.equals(java.awt.Dialog.ModalityType.MODELESS));

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    boolean b11 = openGraphDialog5.isOpaque();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Event event2 = null;
    boolean b5 = openGraphDialog0.mouseExit(event2, 0, (int)(byte)100);
    java.awt.Shape shape6 = null;
    openGraphDialog0.setShape(shape6);
    java.awt.Font font8 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.awt.FontMetrics fontMetrics9 = openGraphDialog0.getFontMetrics(font8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog0.firePropertyChange("hi!", (short)10, (short)(byte)10);
    javax.swing.TransferHandler transferHandler5 = null;
    openGraphDialog0.setTransferHandler(transferHandler5);
    java.awt.Window.Type type7 = openGraphDialog0.getType();
    // The following exception was thrown during execution in test generation
    try {
    openGraphDialog0.pack();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    org.junit.Assert.assertTrue("'" + type7 + "' != '" + java.awt.Window.Type.NORMAL + "'", type7.equals(java.awt.Window.Type.NORMAL));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b3 = openGraphDialog0.inside((int)' ', 0);
    openGraphDialog0.move(8, (int)(byte)10);
    openGraphDialog0.setBounds(2, (int)(short)-1, (int)(byte)0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    java.awt.Point point11 = openGraphDialog5.getMousePosition();
    javax.swing.JLayeredPane jLayeredPane12 = null;
    // The following exception was thrown during execution in test generation
    try {
    openGraphDialog5.setLayeredPane(jLayeredPane12);
      org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point11);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    java.awt.event.ComponentListener[] componentListener_array11 = openGraphDialog0.getComponentListeners();
    java.awt.Point point12 = openGraphDialog0.location();
    boolean b13 = openGraphDialog0.isFocusableWindow();
    java.awt.event.MouseListener mouseListener14 = null;
    openGraphDialog0.addMouseListener(mouseListener14);
    // The following exception was thrown during execution in test generation
    try {
    openGraphDialog0.remove(64);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog0.firePropertyChange("hi!", (short)10, (short)(byte)10);
    javax.swing.TransferHandler transferHandler5 = null;
    openGraphDialog0.setTransferHandler(transferHandler5);
    java.awt.Window.Type type7 = openGraphDialog0.getType();
    boolean b8 = openGraphDialog0.isFocusTraversalPolicyProvider();
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog10 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b11 = openGraphDialog10.isForegroundSet();
    java.awt.Image image12 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog15 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog15.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i20 = openGraphDialog10.checkImage(image12, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog15);
    java.awt.Point point21 = openGraphDialog15.getMousePosition();
    java.awt.Image image22 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog25 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b28 = openGraphDialog25.inside((int)' ', 0);
    java.awt.Component component29 = openGraphDialog25.getGlassPane();
    int i30 = openGraphDialog15.checkImage(image22, (int)(byte)10, 128, (java.awt.image.ImageObserver)openGraphDialog25);
    // The following exception was thrown during execution in test generation
    try {
    java.awt.Component component31 = openGraphDialog0.add("tccrouter.gbl.ui.OpenGraphDialog[dialog0,65,24,0x0,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", (java.awt.Component)openGraphDialog15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    org.junit.Assert.assertTrue("'" + type7 + "' != '" + java.awt.Window.Type.NORMAL + "'", type7.equals(java.awt.Window.Type.NORMAL));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 32);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    java.awt.event.ComponentListener[] componentListener_array11 = openGraphDialog0.getComponentListeners();
    java.awt.event.HierarchyListener hierarchyListener12 = null;
    openGraphDialog0.addHierarchyListener(hierarchyListener12);
    java.awt.BufferCapabilities bufferCapabilities15 = null;
    // The following exception was thrown during execution in test generation
    try {
    openGraphDialog0.createBufferStrategy((int)'#', bufferCapabilities15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array11);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog11 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener12 = null;
    openGraphDialog11.addMouseMotionListener(mouseMotionListener12);
    java.lang.String str14 = openGraphDialog11.toString();
    int i15 = openGraphDialog0.getComponentZOrder((java.awt.Component)openGraphDialog11);
    java.awt.event.MouseListener mouseListener16 = null;
    openGraphDialog0.addMouseListener(mouseListener16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "tccrouter.gbl.ui.OpenGraphDialog[dialog0,100,150,200x300,invalid,hidden,disabled,layout=java.awt.BorderLayout,MODELESS,title=Open Graph,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"+ "'", str14.equals("tccrouter.gbl.ui.OpenGraphDialog[dialog0,100,150,200x300,invalid,hidden,disabled,layout=java.awt.BorderLayout,MODELESS,title=Open Graph,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog0.firePropertyChange("hi!", (short)10, (short)(byte)10);
    boolean b5 = openGraphDialog0.isVisible();
    int i8 = openGraphDialog0.getBaseline((int)' ', (int)(byte)10);
    openGraphDialog0.setFocusTraversalKeysEnabled(true);
    openGraphDialog0.setSize((int)(short)-1, (int)(short)100);
    java.awt.Font font14 = null;
    openGraphDialog0.setFont(font14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }

    javax.swing.JDialog.setDefaultLookAndFeelDecorated(false);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    java.awt.event.ComponentListener[] componentListener_array11 = openGraphDialog0.getComponentListeners();
    openGraphDialog0.setTitle("hi!");
    java.awt.Toolkit toolkit14 = openGraphDialog0.getToolkit();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit14);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog0.firePropertyChange("hi!", (short)10, (short)(byte)10);
    boolean b5 = openGraphDialog0.isVisible();
    int i8 = openGraphDialog0.getBaseline((int)' ', (int)(byte)10);
    java.awt.event.ComponentListener componentListener9 = null;
    openGraphDialog0.addComponentListener(componentListener9);
    java.awt.Component component13 = openGraphDialog0.findComponentAt((int)(short)10, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component13);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Event event2 = null;
    boolean b5 = openGraphDialog0.mouseExit(event2, 0, (int)(byte)100);
    java.awt.Shape shape6 = openGraphDialog0.getShape();
    java.awt.FocusTraversalPolicy focusTraversalPolicy7 = null;
    openGraphDialog0.setFocusTraversalPolicy(focusTraversalPolicy7);
    int i9 = openGraphDialog0.getWidth();
    boolean b10 = openGraphDialog0.getIgnoreRepaint();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(shape6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog0.firePropertyChange("hi!", (short)10, (short)(byte)10);
    boolean b5 = openGraphDialog0.isVisible();
    java.util.Locale locale6 = null;
    openGraphDialog0.setLocale(locale6);
    javax.accessibility.AccessibleContext accessibleContext8 = openGraphDialog0.getAccessibleContext();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext8);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }

    boolean b0 = javax.swing.JDialog.isDefaultLookAndFeelDecorated();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b0 == false);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog0.firePropertyChange("hi!", (short)10, (short)(byte)10);
    java.awt.LayoutManager layoutManager5 = openGraphDialog0.getLayout();
    java.awt.Event event6 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b7 = openGraphDialog0.handleEvent(event6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(layoutManager5);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener1 = null;
    openGraphDialog0.addMouseMotionListener(mouseMotionListener1);
    java.awt.Font font3 = openGraphDialog0.getFont();
    openGraphDialog0.repaint(0L, 1, (int)(byte)1, (int)(byte)10, 10);
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog10 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog10.firePropertyChange("hi!", (short)10, (short)(byte)10);
    javax.swing.TransferHandler transferHandler15 = null;
    openGraphDialog10.setTransferHandler(transferHandler15);
    java.awt.image.ImageProducer imageProducer17 = null;
    java.awt.Image image18 = openGraphDialog10.createImage(imageProducer17);
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog21 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b22 = openGraphDialog21.isForegroundSet();
    java.awt.Event event23 = null;
    boolean b26 = openGraphDialog21.mouseExit(event23, 0, (int)(byte)100);
    java.awt.Shape shape27 = openGraphDialog21.getShape();
    java.awt.FocusTraversalPolicy focusTraversalPolicy28 = null;
    openGraphDialog21.setFocusTraversalPolicy(focusTraversalPolicy28);
    int i30 = openGraphDialog21.getWidth();
    // The following exception was thrown during execution in test generation
    try {
    boolean b31 = openGraphDialog0.prepareImage(image18, (int)(byte)1, (-1), (java.awt.image.ImageObserver)openGraphDialog21);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(image18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(shape27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }

    int i0 = java.awt.image.ImageObserver.PROPERTIES;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 4);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener1 = null;
    openGraphDialog0.addMouseMotionListener(mouseMotionListener1);
    java.lang.String str3 = openGraphDialog0.toString();
    java.awt.peer.ComponentPeer componentPeer4 = openGraphDialog0.getPeer();
    // The following exception was thrown during execution in test generation
    try {
    java.awt.Dimension dimension5 = openGraphDialog0.getPreferredSize();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "tccrouter.gbl.ui.OpenGraphDialog[dialog0,100,150,0x100,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"+ "'", str3.equals("tccrouter.gbl.ui.OpenGraphDialog[dialog0,100,150,0x100,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentPeer4);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener1 = null;
    openGraphDialog0.addMouseMotionListener(mouseMotionListener1);
    java.lang.String str3 = openGraphDialog0.toString();
    java.awt.peer.ComponentPeer componentPeer4 = openGraphDialog0.getPeer();
    java.io.PrintStream printStream5 = null;
    // The following exception was thrown during execution in test generation
    try {
    openGraphDialog0.list(printStream5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "tccrouter.gbl.ui.OpenGraphDialog[dialog0,100,150,0x100,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"+ "'", str3.equals("tccrouter.gbl.ui.OpenGraphDialog[dialog0,100,150,0x100,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentPeer4);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Event event2 = null;
    boolean b5 = openGraphDialog0.mouseExit(event2, 0, (int)(byte)100);
    java.awt.Shape shape6 = openGraphDialog0.getShape();
    java.awt.FocusTraversalPolicy focusTraversalPolicy7 = null;
    openGraphDialog0.setFocusTraversalPolicy(focusTraversalPolicy7);
    int i9 = openGraphDialog0.getWidth();
    openGraphDialog0.disable();
    java.awt.BufferCapabilities bufferCapabilities12 = null;
    // The following exception was thrown during execution in test generation
    try {
    openGraphDialog0.createBufferStrategy(200, bufferCapabilities12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(shape6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Event event2 = null;
    boolean b5 = openGraphDialog0.mouseExit(event2, 0, (int)(byte)100);
    java.awt.Shape shape6 = openGraphDialog0.getShape();
    java.awt.FocusTraversalPolicy focusTraversalPolicy7 = null;
    openGraphDialog0.setFocusTraversalPolicy(focusTraversalPolicy7);
    int i9 = openGraphDialog0.getWidth();
    openGraphDialog0.disable();
    // The following exception was thrown during execution in test generation
    try {
    openGraphDialog0.show();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(shape6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    java.awt.event.ComponentListener[] componentListener_array11 = openGraphDialog0.getComponentListeners();
    java.awt.event.MouseMotionListener mouseMotionListener12 = null;
    openGraphDialog0.removeMouseMotionListener(mouseMotionListener12);
    // The following exception was thrown during execution in test generation
    try {
    openGraphDialog0.setOpacity((float)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array11);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b3 = openGraphDialog0.inside((int)' ', 0);
    openGraphDialog0.move(8, (int)(byte)10);
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog7 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b10 = openGraphDialog7.inside((int)' ', 0);
    openGraphDialog7.move(8, (int)(byte)10);
    java.util.List<java.awt.Image> list_image14 = openGraphDialog7.getIconImages();
    openGraphDialog0.setIconImages(list_image14);
    javax.swing.JList<java.lang.String> jlist_str16 = null;
    java.lang.String[] str_array18 = new java.lang.String[] { "tccrouter.gbl.ui.OpenGraphDialog[dialog0,8,10,10x100,invalid,hidden,disabled,layout=java.awt.BorderLayout,MODELESS,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" };
    java.lang.String[] str_array20 = new java.lang.String[] { "tccrouter.gbl.ui.OpenGraphDialog[dialog0,8,10,10x100,invalid,hidden,disabled,layout=java.awt.BorderLayout,MODELESS,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" };
    java.lang.String[][] str_array_array21 = new java.lang.String[][] { str_array18, str_array20 };
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str22 = openGraphDialog0.getListItem(jlist_str16, str_array_array21);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_image14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array_array21);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener1 = null;
    openGraphDialog0.addMouseMotionListener(mouseMotionListener1);
    java.awt.Dialog.ModalExclusionType modalExclusionType3 = null;
    openGraphDialog0.setModalExclusionType(modalExclusionType3);
    java.awt.Component component7 = openGraphDialog0.findComponentAt(100, (int)' ');
    openGraphDialog0.firePropertyChange("tccrouter.gbl.ui.OpenGraphDialog[dialog0,100,150,0x100,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", (double)1.0f, (double)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component7);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    java.awt.event.ComponentListener[] componentListener_array11 = openGraphDialog0.getComponentListeners();
    java.awt.event.HierarchyListener hierarchyListener12 = null;
    openGraphDialog0.addHierarchyListener(hierarchyListener12);
    openGraphDialog0.setDefaultCloseOperation((int)(byte)1);
    java.lang.String str16 = openGraphDialog0.toString();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "tccrouter.gbl.ui.OpenGraphDialog[dialog0,8,10,10x100,invalid,hidden,disabled,layout=java.awt.BorderLayout,MODELESS,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"+ "'", str16.equals("tccrouter.gbl.ui.OpenGraphDialog[dialog0,8,10,10x100,invalid,hidden,disabled,layout=java.awt.BorderLayout,MODELESS,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }

    float f0 = java.awt.Component.TOP_ALIGNMENT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f0 == 0.0f);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    java.awt.event.ComponentListener[] componentListener_array11 = openGraphDialog0.getComponentListeners();
    java.awt.event.HierarchyListener hierarchyListener12 = null;
    openGraphDialog0.addHierarchyListener(hierarchyListener12);
    openGraphDialog0.setDefaultCloseOperation((int)(byte)1);
    java.awt.Toolkit toolkit16 = openGraphDialog0.getToolkit();
    java.awt.Event event17 = null;
    boolean b19 = openGraphDialog0.action(event17, (java.lang.Object)100L);
    java.awt.Dimension dimension20 = openGraphDialog0.getMinimumSize();
    java.awt.Event event21 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b22 = openGraphDialog0.handleEvent(event21);
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension20);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog0.firePropertyChange("hi!", (short)10, (short)(byte)10);
    java.awt.LayoutManager layoutManager5 = openGraphDialog0.getLayout();
    java.awt.Point point6 = openGraphDialog0.getMousePosition();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(layoutManager5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point6);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.Dimension dimension1 = null;
    openGraphDialog0.setPreferredSize(dimension1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    java.awt.Point point11 = openGraphDialog5.getMousePosition();
    java.awt.event.InputMethodListener inputMethodListener12 = null;
    openGraphDialog5.removeInputMethodListener(inputMethodListener12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point11);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog0.firePropertyChange("hi!", (short)10, (short)(byte)10);
    boolean b5 = openGraphDialog0.isVisible();
    int i8 = openGraphDialog0.getBaseline((int)' ', (int)(byte)10);
    openGraphDialog0.setFocusTraversalKeysEnabled(true);
    openGraphDialog0.setSize((int)(short)-1, (int)(short)100);
    java.awt.Event event14 = null;
    boolean b17 = openGraphDialog0.mouseMove(event14, (int)'#', 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b3 = openGraphDialog0.inside((int)' ', 0);
    java.awt.Component component4 = openGraphDialog0.getGlassPane();
    java.awt.Component[] component_array5 = openGraphDialog0.getComponents();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component_array5);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b3 = openGraphDialog0.inside((int)' ', 0);
    java.awt.Component component4 = openGraphDialog0.getGlassPane();
    java.awt.Font font5 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.awt.FontMetrics fontMetrics6 = component4.getFontMetrics(font5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component4);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog0.firePropertyChange("hi!", (short)10, (short)(byte)10);
    javax.swing.TransferHandler transferHandler5 = null;
    openGraphDialog0.setTransferHandler(transferHandler5);
    java.awt.event.FocusListener[] focusListener_array7 = openGraphDialog0.getFocusListeners();
    boolean b8 = openGraphDialog0.isAlwaysOnTopSupported();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(focusListener_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    java.awt.event.ComponentListener[] componentListener_array11 = openGraphDialog0.getComponentListeners();
    java.awt.event.HierarchyListener hierarchyListener12 = null;
    openGraphDialog0.addHierarchyListener(hierarchyListener12);
    openGraphDialog0.setDefaultCloseOperation((int)(byte)1);
    java.awt.Toolkit toolkit16 = openGraphDialog0.getToolkit();
    java.awt.Graphics graphics17 = null;
    openGraphDialog0.paintAll(graphics17);
    java.awt.Event event19 = null;
    boolean b21 = openGraphDialog0.keyDown(event19, 128);
    java.awt.event.WindowListener windowListener22 = null;
    openGraphDialog0.removeWindowListener(windowListener22);
    boolean b24 = openGraphDialog0.isAlwaysOnTopSupported();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog11 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener12 = null;
    openGraphDialog11.addMouseMotionListener(mouseMotionListener12);
    java.lang.String str14 = openGraphDialog11.toString();
    int i15 = openGraphDialog0.getComponentZOrder((java.awt.Component)openGraphDialog11);
    boolean b16 = openGraphDialog11.isBackgroundSet();
    int i17 = openGraphDialog11.getComponentCount();
    openGraphDialog11.repaint();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "tccrouter.gbl.ui.OpenGraphDialog[dialog0,8,10,0x100,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"+ "'", str14.equals("tccrouter.gbl.ui.OpenGraphDialog[dialog0,8,10,0x100,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener1 = null;
    openGraphDialog0.addMouseMotionListener(mouseMotionListener1);
    java.lang.String str3 = openGraphDialog0.toString();
    java.awt.event.MouseMotionListener mouseMotionListener4 = null;
    openGraphDialog0.removeMouseMotionListener(mouseMotionListener4);
    java.awt.event.WindowListener[] windowListener_array6 = openGraphDialog0.getWindowListeners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "tccrouter.gbl.ui.OpenGraphDialog[dialog0,8,10,0x100,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"+ "'", str3.equals("tccrouter.gbl.ui.OpenGraphDialog[dialog0,8,10,0x100,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(windowListener_array6);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    java.awt.event.ComponentListener[] componentListener_array11 = openGraphDialog0.getComponentListeners();
    java.awt.Point point12 = openGraphDialog0.location();
    java.awt.event.WindowListener windowListener13 = null;
    openGraphDialog0.removeWindowListener(windowListener13);
    // The following exception was thrown during execution in test generation
    try {
    openGraphDialog0.applyResourceBundle("");
      org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point12);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog0.firePropertyChange("hi!", (short)10, (short)(byte)10);
    boolean b5 = openGraphDialog0.isVisible();
    java.awt.event.MouseWheelListener mouseWheelListener6 = null;
    openGraphDialog0.removeMouseWheelListener(mouseWheelListener6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    java.awt.event.ComponentListener[] componentListener_array11 = openGraphDialog0.getComponentListeners();
    java.awt.event.HierarchyListener hierarchyListener12 = null;
    openGraphDialog0.addHierarchyListener(hierarchyListener12);
    openGraphDialog0.setDefaultCloseOperation((int)(byte)1);
    java.awt.Toolkit toolkit16 = openGraphDialog0.getToolkit();
    java.awt.Event event17 = null;
    boolean b19 = openGraphDialog0.action(event17, (java.lang.Object)100L);
    java.awt.Dimension dimension20 = openGraphDialog0.getMinimumSize();
    java.awt.Graphics graphics21 = null;
    openGraphDialog0.paint(graphics21);
    java.io.PrintStream printStream23 = null;
    // The following exception was thrown during execution in test generation
    try {
    openGraphDialog0.list(printStream23, (int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension20);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    java.awt.event.ComponentListener[] componentListener_array11 = openGraphDialog0.getComponentListeners();
    java.awt.event.HierarchyListener hierarchyListener12 = null;
    openGraphDialog0.addHierarchyListener(hierarchyListener12);
    openGraphDialog0.setDefaultCloseOperation((int)(byte)1);
    openGraphDialog0.buildLoadWindow();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array11);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener1 = null;
    openGraphDialog0.addMouseMotionListener(mouseMotionListener1);
    java.awt.peer.ComponentPeer componentPeer3 = openGraphDialog0.getPeer();
    java.awt.Component component4 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.awt.Component component5 = openGraphDialog0.add(component4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentPeer3);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }

    int i0 = java.awt.image.ImageObserver.ALLBITS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 32);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b3 = openGraphDialog0.inside((int)' ', 0);
    openGraphDialog0.move(8, (int)(byte)10);
    java.util.List<java.awt.Image> list_image7 = openGraphDialog0.getIconImages();
    openGraphDialog0.enableInputMethods(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_image7);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener1 = null;
    openGraphDialog0.addMouseMotionListener(mouseMotionListener1);
    java.lang.String str3 = openGraphDialog0.toString();
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog4 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b5 = openGraphDialog4.isForegroundSet();
    java.awt.Image image6 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog9 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog9.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i14 = openGraphDialog4.checkImage(image6, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog9);
    openGraphDialog0.remove((java.awt.Component)openGraphDialog9);
    openGraphDialog0.firePropertyChange("", 'a', '#');
    java.util.Locale locale20 = openGraphDialog0.getLocale();
    boolean b21 = openGraphDialog0.isFocusTraversalPolicySet();
    // The following exception was thrown during execution in test generation
    try {
    openGraphDialog0.layout();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "tccrouter.gbl.ui.OpenGraphDialog[dialog0,8,10,200x300,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=Open Graph,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"+ "'", str3.equals("tccrouter.gbl.ui.OpenGraphDialog[dialog0,8,10,200x300,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=Open Graph,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b3 = openGraphDialog0.inside((int)' ', 0);
    java.beans.PropertyChangeListener propertyChangeListener4 = null;
    openGraphDialog0.addPropertyChangeListener(propertyChangeListener4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    java.awt.Point point11 = openGraphDialog5.getMousePosition();
    openGraphDialog5.firePropertyChange("tccrouter.gbl.ui.OpenGraphDialog[dialog0,8,10,10x100,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", (long)(byte)100, (long)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point11);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Event event2 = null;
    boolean b5 = openGraphDialog0.mouseExit(event2, 0, (int)(byte)100);
    java.awt.Shape shape6 = null;
    openGraphDialog0.setShape(shape6);
    boolean b8 = openGraphDialog0.isEnabled();
    java.awt.Component component11 = openGraphDialog0.locate(16, (int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component11);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog0.firePropertyChange("hi!", (short)10, (short)(byte)10);
    boolean b5 = openGraphDialog0.isVisible();
    int i8 = openGraphDialog0.getBaseline((int)' ', (int)(byte)10);
    java.awt.event.ComponentListener componentListener9 = null;
    openGraphDialog0.addComponentListener(componentListener9);
    java.awt.Container container11 = openGraphDialog0.getParent();
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog12 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener13 = null;
    openGraphDialog12.addMouseMotionListener(mouseMotionListener13);
    java.awt.Point point15 = openGraphDialog12.location();
    java.awt.Component component16 = openGraphDialog0.findComponentAt(point15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(container11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component16);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener1 = null;
    openGraphDialog0.addMouseMotionListener(mouseMotionListener1);
    java.awt.Font font3 = openGraphDialog0.getFont();
    java.awt.Window window4 = openGraphDialog0.getOwner();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener5 = null;
    openGraphDialog0.addHierarchyBoundsListener(hierarchyBoundsListener5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(window4);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Event event2 = null;
    boolean b5 = openGraphDialog0.mouseExit(event2, 0, (int)(byte)100);
    java.awt.Shape shape6 = null;
    openGraphDialog0.setShape(shape6);
    boolean b8 = openGraphDialog0.isEnabled();
    openGraphDialog0.setBounds(0, 32, (int)(short)0, 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog0.firePropertyChange("hi!", (short)10, (short)(byte)10);
    javax.swing.TransferHandler transferHandler5 = null;
    openGraphDialog0.setTransferHandler(transferHandler5);
    java.awt.Window.Type type7 = openGraphDialog0.getType();
    boolean b8 = openGraphDialog0.isFocusTraversalPolicyProvider();
    // The following exception was thrown during execution in test generation
    try {
    openGraphDialog0.remove(4);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    org.junit.Assert.assertTrue("'" + type7 + "' != '" + java.awt.Window.Type.NORMAL + "'", type7.equals(java.awt.Window.Type.NORMAL));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    java.awt.Point point11 = openGraphDialog5.getMousePosition();
    java.awt.im.InputContext inputContext12 = openGraphDialog5.getInputContext();
    boolean b13 = openGraphDialog5.requestFocusInWindow();
    openGraphDialog5.setLocationByPlatform(true);
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog16 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener17 = null;
    openGraphDialog16.addMouseMotionListener(mouseMotionListener17);
    java.awt.Dialog.ModalExclusionType modalExclusionType19 = null;
    openGraphDialog16.setModalExclusionType(modalExclusionType19);
    openGraphDialog16.firePropertyChange("", (long)'#', (long)16);
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog25 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b26 = openGraphDialog25.isForegroundSet();
    java.awt.Image image27 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog30 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog30.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i35 = openGraphDialog25.checkImage(image27, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog30);
    java.awt.event.ComponentListener[] componentListener_array36 = openGraphDialog25.getComponentListeners();
    java.awt.event.HierarchyListener hierarchyListener37 = null;
    openGraphDialog25.addHierarchyListener(hierarchyListener37);
    openGraphDialog25.setDefaultCloseOperation((int)(byte)1);
    java.awt.Toolkit toolkit41 = openGraphDialog25.getToolkit();
    java.awt.Event event42 = null;
    boolean b44 = openGraphDialog25.action(event42, (java.lang.Object)100L);
    java.awt.Dimension dimension45 = openGraphDialog25.getMinimumSize();
    java.awt.Dimension dimension46 = openGraphDialog16.getSize(dimension45);
    java.awt.Dimension dimension47 = openGraphDialog5.getSize(dimension45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputContext12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension47);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    java.awt.Point point11 = openGraphDialog5.getMousePosition();
    java.awt.Image image12 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog15 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b18 = openGraphDialog15.inside((int)' ', 0);
    java.awt.Component component19 = openGraphDialog15.getGlassPane();
    int i20 = openGraphDialog5.checkImage(image12, (int)(byte)10, 128, (java.awt.image.ImageObserver)openGraphDialog15);
    boolean b21 = openGraphDialog15.isResizable();
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog22 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.beans.PropertyChangeListener propertyChangeListener24 = null;
    openGraphDialog22.removePropertyChangeListener("hi!", propertyChangeListener24);
    int i26 = openGraphDialog22.countComponents();
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog27 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog27.firePropertyChange("hi!", (short)10, (short)(byte)10);
    javax.swing.TransferHandler transferHandler32 = null;
    openGraphDialog27.setTransferHandler(transferHandler32);
    java.awt.image.ImageProducer imageProducer34 = null;
    java.awt.Image image35 = openGraphDialog27.createImage(imageProducer34);
    openGraphDialog22.setIconImage(image35);
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog39 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog39.firePropertyChange("hi!", (short)10, (short)(byte)10);
    javax.swing.TransferHandler transferHandler44 = null;
    openGraphDialog39.setTransferHandler(transferHandler44);
    java.awt.Window.Type type46 = openGraphDialog39.getType();
    boolean b47 = openGraphDialog39.isFocusTraversalPolicyProvider();
    openGraphDialog39.enable();
    // The following exception was thrown during execution in test generation
    try {
    boolean b49 = openGraphDialog15.prepareImage(image35, 1, (int)(short)100, (java.awt.image.ImageObserver)openGraphDialog39);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(image35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog39);
    org.junit.Assert.assertTrue("'" + type46 + "' != '" + java.awt.Window.Type.NORMAL + "'", type46.equals(java.awt.Window.Type.NORMAL));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    java.awt.event.ComponentListener[] componentListener_array11 = openGraphDialog0.getComponentListeners();
    java.awt.event.HierarchyListener hierarchyListener12 = null;
    openGraphDialog0.addHierarchyListener(hierarchyListener12);
    openGraphDialog0.setDefaultCloseOperation((int)(byte)1);
    java.awt.Toolkit toolkit16 = openGraphDialog0.getToolkit();
    java.awt.Graphics graphics17 = null;
    openGraphDialog0.paintAll(graphics17);
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog19 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener20 = null;
    openGraphDialog19.addMouseMotionListener(mouseMotionListener20);
    java.lang.String str22 = openGraphDialog19.toString();
    java.awt.Dialog.ModalityType modalityType23 = openGraphDialog19.getModalityType();
    openGraphDialog0.setModalityType(modalityType23);
    java.lang.String str25 = openGraphDialog0.getName();
    openGraphDialog0.setFocusTraversalPolicyProvider(false);
    java.beans.PropertyChangeListener propertyChangeListener28 = null;
    openGraphDialog0.removePropertyChangeListener(propertyChangeListener28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "tccrouter.gbl.ui.OpenGraphDialog[dialog0,0,32,0x4,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"+ "'", str22.equals("tccrouter.gbl.ui.OpenGraphDialog[dialog0,0,32,0x4,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"));
    org.junit.Assert.assertTrue("'" + modalityType23 + "' != '" + java.awt.Dialog.ModalityType.MODELESS + "'", modalityType23.equals(java.awt.Dialog.ModalityType.MODELESS));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "dialog0"+ "'", str25.equals("dialog0"));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener1 = null;
    openGraphDialog0.addMouseMotionListener(mouseMotionListener1);
    java.awt.Point point3 = openGraphDialog0.location();
    javax.swing.TransferHandler transferHandler4 = openGraphDialog0.getTransferHandler();
    boolean b5 = openGraphDialog0.isForegroundSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferHandler4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    java.awt.event.ComponentListener[] componentListener_array11 = openGraphDialog0.getComponentListeners();
    java.awt.event.HierarchyListener hierarchyListener12 = null;
    openGraphDialog0.addHierarchyListener(hierarchyListener12);
    openGraphDialog0.setDefaultCloseOperation((int)(byte)1);
    java.awt.Toolkit toolkit16 = openGraphDialog0.getToolkit();
    java.awt.Graphics graphics17 = null;
    openGraphDialog0.paintAll(graphics17);
    java.awt.Event event19 = null;
    boolean b21 = openGraphDialog0.keyDown(event19, 128);
    boolean b22 = openGraphDialog0.isFocusCycleRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog0.nextFocus();
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog2 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b3 = openGraphDialog2.isForegroundSet();
    java.awt.Image image4 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog7 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog7.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i12 = openGraphDialog2.checkImage(image4, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog7);
    java.awt.event.ComponentListener[] componentListener_array13 = openGraphDialog2.getComponentListeners();
    java.awt.Point point14 = openGraphDialog2.location();
    boolean b15 = openGraphDialog0.contains(point14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    java.awt.event.ComponentListener[] componentListener_array11 = openGraphDialog0.getComponentListeners();
    java.awt.event.HierarchyListener hierarchyListener12 = null;
    openGraphDialog0.addHierarchyListener(hierarchyListener12);
    openGraphDialog0.setDefaultCloseOperation((int)(byte)1);
    java.awt.Toolkit toolkit16 = openGraphDialog0.getToolkit();
    java.awt.Graphics graphics17 = null;
    openGraphDialog0.paintAll(graphics17);
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog19 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener20 = null;
    openGraphDialog19.addMouseMotionListener(mouseMotionListener20);
    java.lang.String str22 = openGraphDialog19.toString();
    java.awt.Dialog.ModalityType modalityType23 = openGraphDialog19.getModalityType();
    openGraphDialog0.setModalityType(modalityType23);
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog25 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b26 = openGraphDialog25.isForegroundSet();
    java.awt.Event event27 = null;
    boolean b30 = openGraphDialog25.mouseExit(event27, 0, (int)(byte)100);
    java.awt.Shape shape31 = openGraphDialog25.getShape();
    java.awt.FocusTraversalPolicy focusTraversalPolicy32 = null;
    openGraphDialog25.setFocusTraversalPolicy(focusTraversalPolicy32);
    openGraphDialog25.firePropertyChange("tccrouter.gbl.ui.OpenGraphDialog[dialog0,75,62,128x30,invalid,layout=java.awt.BorderLayout,MODELESS,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", (double)0.0f, (double)(-1));
    // The following exception was thrown during execution in test generation
    try {
    java.awt.Component component38 = openGraphDialog0.add((java.awt.Component)openGraphDialog25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "tccrouter.gbl.ui.OpenGraphDialog[dialog0,0,32,0x4,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"+ "'", str22.equals("tccrouter.gbl.ui.OpenGraphDialog[dialog0,0,32,0x4,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"));
    org.junit.Assert.assertTrue("'" + modalityType23 + "' != '" + java.awt.Dialog.ModalityType.MODELESS + "'", modalityType23.equals(java.awt.Dialog.ModalityType.MODELESS));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(shape31);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    float f2 = openGraphDialog0.getAlignmentX();
    java.awt.Event event3 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog4 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b5 = openGraphDialog4.isForegroundSet();
    java.awt.Event event6 = null;
    boolean b9 = openGraphDialog4.mouseExit(event6, 0, (int)(byte)100);
    java.awt.Shape shape10 = openGraphDialog4.getShape();
    java.awt.FocusTraversalPolicy focusTraversalPolicy11 = null;
    openGraphDialog4.setFocusTraversalPolicy(focusTraversalPolicy11);
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog13 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener14 = null;
    openGraphDialog13.addMouseMotionListener(mouseMotionListener14);
    java.awt.Point point16 = openGraphDialog13.location();
    java.awt.Component component17 = openGraphDialog4.getComponentAt(point16);
    boolean b18 = openGraphDialog0.lostFocus(event3, (java.lang.Object)openGraphDialog4);
    java.awt.Dialog.ModalityType modalityType19 = openGraphDialog0.getModalityType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(shape10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    org.junit.Assert.assertTrue("'" + modalityType19 + "' != '" + java.awt.Dialog.ModalityType.MODELESS + "'", modalityType19.equals(java.awt.Dialog.ModalityType.MODELESS));

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b3 = openGraphDialog0.inside((int)' ', 0);
    java.awt.Component component4 = openGraphDialog0.getGlassPane();
    boolean b5 = component4.isCursorSet();
    boolean b6 = component4.isValid();
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog7 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog7.firePropertyChange("hi!", (short)10, (short)(byte)10);
    javax.swing.TransferHandler transferHandler12 = null;
    openGraphDialog7.setTransferHandler(transferHandler12);
    java.awt.image.ImageProducer imageProducer14 = null;
    java.awt.Image image15 = openGraphDialog7.createImage(imageProducer14);
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog16 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b17 = openGraphDialog16.isForegroundSet();
    java.awt.Image image18 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog21 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog21.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i26 = openGraphDialog16.checkImage(image18, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog21);
    java.awt.event.ComponentListener[] componentListener_array27 = openGraphDialog16.getComponentListeners();
    openGraphDialog16.setTitle("hi!");
    java.awt.Font font30 = openGraphDialog16.getFont();
    openGraphDialog7.setFont(font30);
    java.awt.FontMetrics fontMetrics32 = component4.getFontMetrics(font30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(image15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(fontMetrics32);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog0.firePropertyChange("hi!", (short)10, (short)(byte)10);
    boolean b5 = openGraphDialog0.isVisible();
    int i8 = openGraphDialog0.getBaseline((int)' ', (int)(byte)10);
    // The following exception was thrown during execution in test generation
    try {
    openGraphDialog0.createBufferStrategy(200);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener1 = null;
    openGraphDialog0.addMouseMotionListener(mouseMotionListener1);
    java.awt.Dialog.ModalExclusionType modalExclusionType3 = null;
    openGraphDialog0.setModalExclusionType(modalExclusionType3);
    openGraphDialog0.firePropertyChange("", (long)'#', (long)16);
    java.beans.PropertyChangeListener propertyChangeListener10 = null;
    openGraphDialog0.addPropertyChangeListener("tccrouter.gbl.ui.OpenGraphDialog[dialog0,8,10,128x30,invalid,layout=java.awt.BorderLayout,MODELESS,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", propertyChangeListener10);
    java.awt.event.HierarchyListener hierarchyListener12 = null;
    openGraphDialog0.removeHierarchyListener(hierarchyListener12);
    java.awt.BufferCapabilities bufferCapabilities15 = null;
    // The following exception was thrown during execution in test generation
    try {
    openGraphDialog0.createBufferStrategy((int)'#', bufferCapabilities15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    java.awt.event.ComponentListener[] componentListener_array11 = openGraphDialog0.getComponentListeners();
    java.awt.Point point12 = openGraphDialog0.location();
    boolean b13 = openGraphDialog0.isFocusableWindow();
    java.awt.Event event14 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog15 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b16 = openGraphDialog15.isForegroundSet();
    java.awt.Image image17 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog20 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog20.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i25 = openGraphDialog15.checkImage(image17, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog20);
    java.awt.event.ComponentListener[] componentListener_array26 = openGraphDialog15.getComponentListeners();
    openGraphDialog15.setTitle("hi!");
    java.awt.Font font29 = openGraphDialog15.getFont();
    boolean b30 = openGraphDialog0.lostFocus(event14, (java.lang.Object)font29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener1 = null;
    openGraphDialog0.addMouseMotionListener(mouseMotionListener1);
    java.awt.Font font3 = openGraphDialog0.getFont();
    java.awt.Window window4 = openGraphDialog0.getOwner();
    openGraphDialog0.repaint();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(window4);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener1 = null;
    openGraphDialog0.addMouseMotionListener(mouseMotionListener1);
    java.awt.Color color3 = openGraphDialog0.getBackground();
    boolean b4 = openGraphDialog0.isResizable();
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener6 = null;
    openGraphDialog5.addMouseMotionListener(mouseMotionListener6);
    java.awt.Dialog.ModalExclusionType modalExclusionType8 = null;
    openGraphDialog5.setModalExclusionType(modalExclusionType8);
    boolean b10 = openGraphDialog5.isLightweight();
    java.awt.Image image13 = openGraphDialog5.createImage(4, 32);
    boolean b19 = openGraphDialog0.imageUpdate(image13, (int)(short)10, (int)(short)100, (int)(byte)100, (int)(short)100, (int)(short)100);
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog20 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b23 = openGraphDialog20.inside((int)' ', 0);
    openGraphDialog20.move(8, (int)(byte)10);
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog27 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b30 = openGraphDialog27.inside((int)' ', 0);
    openGraphDialog27.move(8, (int)(byte)10);
    java.util.List<java.awt.Image> list_image34 = openGraphDialog27.getIconImages();
    openGraphDialog20.setIconImages(list_image34);
    openGraphDialog0.setIconImages(list_image34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(image13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_image34);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog0.firePropertyChange("hi!", (short)10, (short)(byte)10);
    javax.swing.TransferHandler transferHandler5 = null;
    openGraphDialog0.setTransferHandler(transferHandler5);
    java.awt.Event event7 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog8 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b9 = openGraphDialog8.isForegroundSet();
    java.awt.Image image10 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog13 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog13.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i18 = openGraphDialog8.checkImage(image10, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog13);
    java.awt.event.ComponentListener[] componentListener_array19 = openGraphDialog8.getComponentListeners();
    java.awt.event.HierarchyListener hierarchyListener20 = null;
    openGraphDialog8.addHierarchyListener(hierarchyListener20);
    openGraphDialog8.setDefaultCloseOperation((int)(byte)1);
    java.awt.Toolkit toolkit24 = openGraphDialog8.getToolkit();
    java.awt.Graphics graphics25 = null;
    openGraphDialog8.paintAll(graphics25);
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog27 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener28 = null;
    openGraphDialog27.addMouseMotionListener(mouseMotionListener28);
    java.lang.String str30 = openGraphDialog27.toString();
    java.awt.Dialog.ModalityType modalityType31 = openGraphDialog27.getModalityType();
    openGraphDialog8.setModalityType(modalityType31);
    java.lang.String str33 = openGraphDialog8.getName();
    openGraphDialog8.setFocusTraversalPolicyProvider(false);
    boolean b36 = openGraphDialog0.lostFocus(event7, (java.lang.Object)openGraphDialog8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "tccrouter.gbl.ui.OpenGraphDialog[dialog0,8,10,0x100,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"+ "'", str30.equals("tccrouter.gbl.ui.OpenGraphDialog[dialog0,8,10,0x100,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"));
    org.junit.Assert.assertTrue("'" + modalityType31 + "' != '" + java.awt.Dialog.ModalityType.MODELESS + "'", modalityType31.equals(java.awt.Dialog.ModalityType.MODELESS));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "dialog0"+ "'", str33.equals("dialog0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b3 = openGraphDialog0.inside((int)' ', 0);
    java.awt.Component component4 = openGraphDialog0.getGlassPane();
    java.awt.event.MouseWheelListener[] mouseWheelListener_array5 = component4.getMouseWheelListeners();
    java.awt.dnd.DropTarget dropTarget6 = component4.getDropTarget();
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog7 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b8 = openGraphDialog7.isForegroundSet();
    java.awt.Image image9 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog12 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog12.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i17 = openGraphDialog7.checkImage(image9, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog12);
    java.awt.event.ComponentListener[] componentListener_array18 = openGraphDialog7.getComponentListeners();
    java.awt.event.HierarchyListener hierarchyListener19 = null;
    openGraphDialog7.addHierarchyListener(hierarchyListener19);
    openGraphDialog7.setDefaultCloseOperation((int)(byte)1);
    java.awt.Toolkit toolkit23 = openGraphDialog7.getToolkit();
    java.awt.Event event24 = null;
    boolean b26 = openGraphDialog7.action(event24, (java.lang.Object)100L);
    java.awt.Dimension dimension27 = openGraphDialog7.getMinimumSize();
    component4.setMaximumSize(dimension27);
    java.awt.event.ComponentListener componentListener29 = null;
    component4.addComponentListener(componentListener29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseWheelListener_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(dropTarget6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension27);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener1 = null;
    openGraphDialog0.addMouseMotionListener(mouseMotionListener1);
    java.awt.Color color3 = openGraphDialog0.getBackground();
    openGraphDialog0.repaint(0L, 32, (int)(short)100, (int)(byte)0, 8);
    boolean b10 = openGraphDialog0.isDisplayable();
    openGraphDialog0.repaint((int)'4', 1, (int)(short)-1, (int)(short)-1);
    openGraphDialog0.revalidate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    java.awt.Point point11 = openGraphDialog5.getMousePosition();
    java.awt.im.InputContext inputContext12 = openGraphDialog5.getInputContext();
    java.awt.Dimension dimension13 = openGraphDialog5.minimumSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputContext12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension13);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b3 = openGraphDialog0.inside((int)' ', 0);
    java.lang.String str4 = openGraphDialog0.getTitle();
    java.awt.Graphics graphics5 = openGraphDialog0.getGraphics();
    openGraphDialog0.resize(128, 10);
    // The following exception was thrown during execution in test generation
    try {
    java.awt.Point point9 = openGraphDialog0.getLocationOnScreen();
      org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(graphics5);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    java.awt.event.ComponentListener[] componentListener_array11 = openGraphDialog0.getComponentListeners();
    java.awt.event.HierarchyListener hierarchyListener12 = null;
    openGraphDialog0.addHierarchyListener(hierarchyListener12);
    openGraphDialog0.setDefaultCloseOperation((int)(byte)1);
    java.awt.Toolkit toolkit16 = openGraphDialog0.getToolkit();
    java.awt.Graphics graphics17 = null;
    openGraphDialog0.paintAll(graphics17);
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog19 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener20 = null;
    openGraphDialog19.addMouseMotionListener(mouseMotionListener20);
    java.lang.String str22 = openGraphDialog19.toString();
    java.awt.Dialog.ModalityType modalityType23 = openGraphDialog19.getModalityType();
    openGraphDialog0.setModalityType(modalityType23);
    java.lang.String str25 = openGraphDialog0.getName();
    openGraphDialog0.setTitle("tccrouter.gbl.ui.OpenGraphDialog[dialog0,8,10,0x100,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
    openGraphDialog0.toBack();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "tccrouter.gbl.ui.OpenGraphDialog[dialog0,8,10,128x10,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"+ "'", str22.equals("tccrouter.gbl.ui.OpenGraphDialog[dialog0,8,10,128x10,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"));
    org.junit.Assert.assertTrue("'" + modalityType23 + "' != '" + java.awt.Dialog.ModalityType.MODELESS + "'", modalityType23.equals(java.awt.Dialog.ModalityType.MODELESS));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "dialog0"+ "'", str25.equals("dialog0"));

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener1 = null;
    openGraphDialog0.addMouseMotionListener(mouseMotionListener1);
    java.awt.Point point3 = openGraphDialog0.location();
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog4 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener5 = null;
    openGraphDialog4.addMouseMotionListener(mouseMotionListener5);
    java.awt.Dialog.ModalExclusionType modalExclusionType7 = null;
    openGraphDialog4.setModalExclusionType(modalExclusionType7);
    boolean b9 = openGraphDialog4.isLightweight();
    java.awt.Image image12 = openGraphDialog4.createImage(4, 32);
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog15 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b16 = openGraphDialog15.isForegroundSet();
    java.awt.Image image17 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog20 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog20.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i25 = openGraphDialog15.checkImage(image17, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog20);
    java.awt.event.ComponentListener[] componentListener_array26 = openGraphDialog15.getComponentListeners();
    java.awt.event.HierarchyListener hierarchyListener27 = null;
    openGraphDialog15.addHierarchyListener(hierarchyListener27);
    openGraphDialog15.setDefaultCloseOperation((int)(byte)1);
    java.awt.Toolkit toolkit31 = openGraphDialog15.getToolkit();
    java.awt.Event event32 = null;
    boolean b34 = openGraphDialog15.action(event32, (java.lang.Object)100L);
    java.awt.Dimension dimension35 = openGraphDialog15.getMinimumSize();
    openGraphDialog15.firePropertyChange("tccrouter.gbl.ui.OpenGraphDialog[dialog0,8,10,128x30,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", 'a', 'a');
    boolean b40 = openGraphDialog0.prepareImage(image12, (int)(byte)10, 10, (java.awt.image.ImageObserver)openGraphDialog15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(image12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    java.awt.event.ComponentListener[] componentListener_array11 = openGraphDialog0.getComponentListeners();
    java.awt.event.HierarchyListener hierarchyListener12 = null;
    openGraphDialog0.addHierarchyListener(hierarchyListener12);
    openGraphDialog0.setDefaultCloseOperation((int)(byte)1);
    java.awt.Toolkit toolkit16 = openGraphDialog0.getToolkit();
    int i17 = openGraphDialog0.getHeight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 10);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    java.awt.event.ComponentListener[] componentListener_array11 = openGraphDialog0.getComponentListeners();
    java.awt.Point point12 = openGraphDialog0.location();
    boolean b13 = openGraphDialog0.isFocusableWindow();
    java.awt.event.MouseMotionListener mouseMotionListener14 = null;
    openGraphDialog0.removeMouseMotionListener(mouseMotionListener14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener1 = null;
    openGraphDialog0.addMouseMotionListener(mouseMotionListener1);
    java.awt.Point point3 = openGraphDialog0.location();
    java.awt.Cursor cursor4 = openGraphDialog0.getCursor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cursor4);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog0.firePropertyChange("hi!", (short)10, (short)(byte)10);
    boolean b5 = openGraphDialog0.isVisible();
    int i8 = openGraphDialog0.getBaseline((int)' ', (int)(byte)10);
    java.awt.event.ComponentListener componentListener9 = null;
    openGraphDialog0.addComponentListener(componentListener9);
    java.awt.Component[] component_array11 = openGraphDialog0.getComponents();
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog12 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b13 = openGraphDialog12.isForegroundSet();
    java.awt.Image image14 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog17 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog17.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i22 = openGraphDialog12.checkImage(image14, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog17);
    java.awt.Point point23 = openGraphDialog17.getMousePosition();
    java.awt.Image image24 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog27 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b30 = openGraphDialog27.inside((int)' ', 0);
    java.awt.Component component31 = openGraphDialog27.getGlassPane();
    int i32 = openGraphDialog17.checkImage(image24, (int)(byte)10, 128, (java.awt.image.ImageObserver)openGraphDialog27);
    openGraphDialog27.setResizable(false);
    java.awt.Rectangle rectangle35 = openGraphDialog27.getBounds();
    // The following exception was thrown during execution in test generation
    try {
    openGraphDialog0.setShape((java.awt.Shape)rectangle35);
      org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle35);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog11 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener12 = null;
    openGraphDialog11.addMouseMotionListener(mouseMotionListener12);
    java.lang.String str14 = openGraphDialog11.toString();
    int i15 = openGraphDialog0.getComponentZOrder((java.awt.Component)openGraphDialog11);
    boolean b16 = openGraphDialog11.isBackgroundSet();
    boolean b17 = openGraphDialog11.getIgnoreRepaint();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "tccrouter.gbl.ui.OpenGraphDialog[dialog0,8,10,0x100,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=tccrouter.gbl.ui.OpenGraphDialog[dialog0,8,10,0x100,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true],defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"+ "'", str14.equals("tccrouter.gbl.ui.OpenGraphDialog[dialog0,8,10,0x100,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=tccrouter.gbl.ui.OpenGraphDialog[dialog0,8,10,0x100,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true],defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener1 = null;
    openGraphDialog0.addMouseMotionListener(mouseMotionListener1);
    java.awt.Font font3 = openGraphDialog0.getFont();
    java.awt.Window window4 = openGraphDialog0.getOwner();
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    boolean b10 = openGraphDialog5.isVisible();
    int i13 = openGraphDialog5.getBaseline((int)' ', (int)(byte)10);
    java.awt.event.ComponentListener componentListener14 = null;
    openGraphDialog5.addComponentListener(componentListener14);
    java.awt.event.MouseWheelListener mouseWheelListener16 = null;
    openGraphDialog5.addMouseWheelListener(mouseWheelListener16);
    java.awt.Point point18 = openGraphDialog5.getLocation();
    window4.setLocation(point18);
    window4.firePropertyChange("dialog0", (float)100L, 100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(window4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point18);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    java.awt.event.ComponentListener[] componentListener_array11 = openGraphDialog0.getComponentListeners();
    java.awt.event.MouseMotionListener mouseMotionListener12 = null;
    openGraphDialog0.removeMouseMotionListener(mouseMotionListener12);
    boolean b14 = openGraphDialog0.isPreferredSizeSet();
    java.awt.event.HierarchyListener hierarchyListener15 = null;
    openGraphDialog0.addHierarchyListener(hierarchyListener15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.beans.PropertyChangeListener propertyChangeListener2 = null;
    openGraphDialog0.removePropertyChangeListener("hi!", propertyChangeListener2);
    openGraphDialog0.firePropertyChange("hi!", 'a', ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b3 = openGraphDialog0.inside((int)' ', 0);
    java.lang.String str4 = openGraphDialog0.getTitle();
    java.awt.Graphics graphics5 = openGraphDialog0.getGraphics();
    java.awt.Event event6 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog7 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener8 = null;
    openGraphDialog7.addMouseMotionListener(mouseMotionListener8);
    java.awt.Dialog.ModalExclusionType modalExclusionType10 = null;
    openGraphDialog7.setModalExclusionType(modalExclusionType10);
    openGraphDialog7.firePropertyChange("", (long)'#', (long)16);
    boolean b16 = openGraphDialog0.action(event6, (java.lang.Object)16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "tccrouter.gbl.ui.OpenGraphDialog[dialog0,8,10,0x100,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"+ "'", str4.equals("tccrouter.gbl.ui.OpenGraphDialog[dialog0,8,10,0x100,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(graphics5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    java.awt.event.ComponentListener[] componentListener_array11 = openGraphDialog0.getComponentListeners();
    java.awt.Point point12 = openGraphDialog0.location();
    java.awt.event.KeyListener keyListener13 = null;
    openGraphDialog0.addKeyListener(keyListener13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point12);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener1 = null;
    openGraphDialog0.addMouseMotionListener(mouseMotionListener1);
    java.lang.String str3 = openGraphDialog0.toString();
    java.awt.Dialog.ModalExclusionType modalExclusionType4 = openGraphDialog0.getModalExclusionType();
    java.awt.event.WindowFocusListener windowFocusListener5 = null;
    openGraphDialog0.removeWindowFocusListener(windowFocusListener5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "tccrouter.gbl.ui.OpenGraphDialog[dialog0,8,10,0x100,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=tccrouter.gbl.ui.OpenGraphDialog[dialog0,8,10,0x100,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true],defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"+ "'", str3.equals("tccrouter.gbl.ui.OpenGraphDialog[dialog0,8,10,0x100,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=tccrouter.gbl.ui.OpenGraphDialog[dialog0,8,10,0x100,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true],defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"));
    org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Event event2 = null;
    boolean b5 = openGraphDialog0.mouseExit(event2, 0, (int)(byte)100);
    java.awt.Shape shape6 = openGraphDialog0.getShape();
    java.awt.FocusTraversalPolicy focusTraversalPolicy7 = null;
    openGraphDialog0.setFocusTraversalPolicy(focusTraversalPolicy7);
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog9 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener10 = null;
    openGraphDialog9.addMouseMotionListener(mouseMotionListener10);
    java.awt.Point point12 = openGraphDialog9.location();
    java.awt.Component component13 = openGraphDialog0.getComponentAt(point12);
    // The following exception was thrown during execution in test generation
    try {
    boolean b14 = component13.isVisible();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(shape6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component13);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener1 = null;
    openGraphDialog0.addMouseMotionListener(mouseMotionListener1);
    java.lang.String str3 = openGraphDialog0.toString();
    java.awt.Dialog.ModalExclusionType modalExclusionType4 = openGraphDialog0.getModalExclusionType();
    boolean b5 = openGraphDialog0.isFocusTraversable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "tccrouter.gbl.ui.OpenGraphDialog[dialog0,8,10,0x100,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=tccrouter.gbl.ui.OpenGraphDialog[dialog0,8,10,0x100,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true],defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"+ "'", str3.equals("tccrouter.gbl.ui.OpenGraphDialog[dialog0,8,10,0x100,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=tccrouter.gbl.ui.OpenGraphDialog[dialog0,8,10,0x100,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true],defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"));
    org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    java.awt.event.ComponentListener[] componentListener_array11 = openGraphDialog0.getComponentListeners();
    openGraphDialog0.setTitle("hi!");
    javax.accessibility.AccessibleContext accessibleContext14 = openGraphDialog0.getAccessibleContext();
    java.awt.event.KeyListener keyListener15 = null;
    openGraphDialog0.removeKeyListener(keyListener15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext14);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener1 = null;
    openGraphDialog0.addMouseMotionListener(mouseMotionListener1);
    java.awt.Dialog.ModalExclusionType modalExclusionType3 = null;
    openGraphDialog0.setModalExclusionType(modalExclusionType3);
    openGraphDialog0.firePropertyChange("", (long)'#', (long)16);
    openGraphDialog0.setLocation((int)(byte)1, 8);
    openGraphDialog0.setModal(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog0.firePropertyChange("hi!", (short)10, (short)(byte)10);
    javax.swing.TransferHandler transferHandler5 = null;
    openGraphDialog0.setTransferHandler(transferHandler5);
    java.awt.Graphics graphics7 = null;
    openGraphDialog0.paint(graphics7);
    java.awt.FocusTraversalPolicy focusTraversalPolicy9 = openGraphDialog0.getFocusTraversalPolicy();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(focusTraversalPolicy9);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    java.awt.Point point11 = openGraphDialog5.getMousePosition();
    java.awt.Image image12 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog15 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b18 = openGraphDialog15.inside((int)' ', 0);
    java.awt.Component component19 = openGraphDialog15.getGlassPane();
    int i20 = openGraphDialog5.checkImage(image12, (int)(byte)10, 128, (java.awt.image.ImageObserver)openGraphDialog15);
    openGraphDialog15.setResizable(false);
    java.awt.Rectangle rectangle23 = openGraphDialog15.getBounds();
    boolean b24 = openGraphDialog15.isCursorSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Event event2 = null;
    boolean b5 = openGraphDialog0.mouseExit(event2, 0, (int)(byte)100);
    java.awt.Shape shape6 = null;
    openGraphDialog0.setShape(shape6);
    boolean b8 = openGraphDialog0.isEnabled();
    openGraphDialog0.repaint(1L, (int)(short)1, 0, 4, 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog0.firePropertyChange("hi!", (short)10, (short)(byte)10);
    javax.swing.TransferHandler transferHandler5 = null;
    openGraphDialog0.setTransferHandler(transferHandler5);
    java.awt.Window.Type type7 = openGraphDialog0.getType();
    boolean b8 = openGraphDialog0.isFocusTraversalPolicyProvider();
    openGraphDialog0.enable();
    java.awt.Dimension dimension10 = openGraphDialog0.minimumSize();
    java.awt.Graphics graphics11 = null;
    openGraphDialog0.print(graphics11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    org.junit.Assert.assertTrue("'" + type7 + "' != '" + java.awt.Window.Type.NORMAL + "'", type7.equals(java.awt.Window.Type.NORMAL));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension10);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b3 = openGraphDialog0.inside((int)' ', 0);
    java.awt.Component component4 = openGraphDialog0.getGlassPane();
    openGraphDialog0.setEnabled(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component4);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    java.awt.event.ComponentListener[] componentListener_array11 = openGraphDialog0.getComponentListeners();
    java.awt.Event event12 = null;
    boolean b15 = openGraphDialog0.mouseMove(event12, (int)(byte)10, 10);
    javax.swing.JMenuBar jMenuBar16 = openGraphDialog0.getJMenuBar();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jMenuBar16);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    float f2 = openGraphDialog0.getAlignmentX();
    openGraphDialog0.show(false);
    openGraphDialog0.reshape((int)(byte)-1, 32, (int)'4', (int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.5f);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog0.firePropertyChange("hi!", (short)10, (short)(byte)10);
    boolean b5 = openGraphDialog0.isVisible();
    java.util.Locale locale6 = null;
    openGraphDialog0.setLocale(locale6);
    openGraphDialog0.transferFocusBackward();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener1 = null;
    openGraphDialog0.addMouseMotionListener(mouseMotionListener1);
    java.lang.String str3 = openGraphDialog0.toString();
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog4 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b5 = openGraphDialog4.isForegroundSet();
    java.awt.Image image6 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog9 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog9.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i14 = openGraphDialog4.checkImage(image6, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog9);
    openGraphDialog0.remove((java.awt.Component)openGraphDialog9);
    java.lang.String str16 = openGraphDialog9.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "tccrouter.gbl.ui.OpenGraphDialog[dialog0,-1,32,52x10,invalid,hidden,disabled,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"+ "'", str3.equals("tccrouter.gbl.ui.OpenGraphDialog[dialog0,-1,32,52x10,invalid,hidden,disabled,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "tccrouter.gbl.ui.OpenGraphDialog[dialog0,-1,32,52x10,invalid,hidden,disabled,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"+ "'", str16.equals("tccrouter.gbl.ui.OpenGraphDialog[dialog0,-1,32,52x10,invalid,hidden,disabled,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"));

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    java.awt.event.ComponentListener[] componentListener_array11 = openGraphDialog0.getComponentListeners();
    openGraphDialog0.setTitle("hi!");
    java.awt.Font font14 = openGraphDialog0.getFont();
    boolean b15 = openGraphDialog0.isBackgroundSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    java.awt.event.ComponentListener[] componentListener_array11 = openGraphDialog0.getComponentListeners();
    java.awt.Point point12 = openGraphDialog0.location();
    boolean b13 = openGraphDialog0.isFocusableWindow();
    // The following exception was thrown during execution in test generation
    try {
    openGraphDialog0.createBufferStrategy(10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener1 = null;
    openGraphDialog0.addMouseMotionListener(mouseMotionListener1);
    java.awt.Color color3 = openGraphDialog0.getBackground();
    openGraphDialog0.repaint(0L, 32, (int)(short)100, (int)(byte)0, 8);
    boolean b10 = openGraphDialog0.isDisplayable();
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog11 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b14 = openGraphDialog11.inside((int)' ', 0);
    java.awt.Component component15 = openGraphDialog11.getGlassPane();
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog16 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog16.firePropertyChange("hi!", (short)10, (short)(byte)10);
    boolean b21 = openGraphDialog16.isVisible();
    int i24 = openGraphDialog16.getBaseline((int)' ', (int)(byte)10);
    openGraphDialog16.setFocusTraversalKeysEnabled(true);
    openGraphDialog16.setSize((int)(short)-1, (int)(short)100);
    java.awt.Font font30 = openGraphDialog16.getFont();
    // The following exception was thrown during execution in test generation
    try {
    openGraphDialog0.add((java.awt.Component)openGraphDialog11, (java.lang.Object)font30, (int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font30);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b3 = openGraphDialog0.inside((int)' ', 0);
    java.lang.String str4 = openGraphDialog0.getTitle();
    java.awt.Graphics graphics5 = openGraphDialog0.getGraphics();
    java.awt.event.MouseMotionListener mouseMotionListener6 = null;
    openGraphDialog0.addMouseMotionListener(mouseMotionListener6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(graphics5);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener1 = null;
    openGraphDialog0.addMouseMotionListener(mouseMotionListener1);
    java.awt.Font font3 = openGraphDialog0.getFont();
    openGraphDialog0.repaint(0L, 1, (int)(byte)1, (int)(byte)10, 10);
    java.awt.BufferCapabilities bufferCapabilities11 = null;
    // The following exception was thrown during execution in test generation
    try {
    openGraphDialog0.createBufferStrategy((int)(byte)0, bufferCapabilities11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font3);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    java.awt.event.ComponentListener[] componentListener_array11 = openGraphDialog0.getComponentListeners();
    java.awt.event.HierarchyListener hierarchyListener12 = null;
    openGraphDialog0.addHierarchyListener(hierarchyListener12);
    openGraphDialog0.setDefaultCloseOperation((int)(byte)1);
    java.awt.Toolkit toolkit16 = openGraphDialog0.getToolkit();
    java.awt.Event event17 = null;
    boolean b19 = openGraphDialog0.action(event17, (java.lang.Object)100L);
    javax.swing.JMenuBar jMenuBar20 = null;
    openGraphDialog0.setJMenuBar(jMenuBar20);
    openGraphDialog0.buildSaveWindow();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    float f2 = openGraphDialog0.getAlignmentX();
    openGraphDialog0.show(false);
    boolean b5 = openGraphDialog0.isLightweight();
    java.awt.event.MouseListener mouseListener6 = null;
    openGraphDialog0.removeMouseListener(mouseListener6);
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog8 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b11 = openGraphDialog8.inside((int)' ', 0);
    java.awt.Component component12 = openGraphDialog8.getGlassPane();
    openGraphDialog8.setAlwaysOnTop(false);
    openGraphDialog8.setEnabled(true);
    int i17 = openGraphDialog8.getComponentCount();
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog18 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog18.firePropertyChange("hi!", (short)10, (short)(byte)10);
    java.awt.LayoutManager layoutManager23 = openGraphDialog18.getLayout();
    openGraphDialog8.setLayout(layoutManager23);
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog25 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener26 = null;
    openGraphDialog25.addMouseMotionListener(mouseMotionListener26);
    java.lang.String str28 = openGraphDialog25.toString();
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog29 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b30 = openGraphDialog29.isForegroundSet();
    java.awt.Image image31 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog34 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog34.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i39 = openGraphDialog29.checkImage(image31, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog34);
    openGraphDialog25.remove((java.awt.Component)openGraphDialog34);
    openGraphDialog25.firePropertyChange("", 'a', '#');
    java.util.Locale locale45 = openGraphDialog25.getLocale();
    openGraphDialog8.setLocale(locale45);
    openGraphDialog0.setLocale(locale45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(layoutManager23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "tccrouter.gbl.ui.OpenGraphDialog[dialog0,200,150,400x100,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=Save Graph,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"+ "'", str28.equals("tccrouter.gbl.ui.OpenGraphDialog[dialog0,200,150,400x100,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=Save Graph,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale45);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Event event2 = null;
    boolean b5 = openGraphDialog0.mouseExit(event2, 0, (int)(byte)100);
    java.beans.PropertyChangeListener propertyChangeListener7 = null;
    openGraphDialog0.addPropertyChangeListener("", propertyChangeListener7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b3 = openGraphDialog0.inside((int)' ', 0);
    java.awt.Component component4 = openGraphDialog0.getGlassPane();
    boolean b5 = component4.isCursorSet();
    java.awt.event.HierarchyListener hierarchyListener6 = null;
    component4.removeHierarchyListener(hierarchyListener6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    java.awt.Point point11 = openGraphDialog5.getMousePosition();
    java.awt.Image image12 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog15 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b18 = openGraphDialog15.inside((int)' ', 0);
    java.awt.Component component19 = openGraphDialog15.getGlassPane();
    int i20 = openGraphDialog5.checkImage(image12, (int)(byte)10, 128, (java.awt.image.ImageObserver)openGraphDialog15);
    openGraphDialog15.setResizable(false);
    java.awt.Rectangle rectangle23 = openGraphDialog15.getBounds();
    openGraphDialog15.setTitle("tccrouter.gbl.ui.OpenGraphDialog[dialog0,-1,32,52x10,invalid,hidden,disabled,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle23);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b3 = openGraphDialog0.inside((int)' ', 0);
    java.awt.Component component4 = openGraphDialog0.getGlassPane();
    openGraphDialog0.setAlwaysOnTop(false);
    openGraphDialog0.setEnabled(true);
    int i9 = openGraphDialog0.getComponentCount();
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog10 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog10.firePropertyChange("hi!", (short)10, (short)(byte)10);
    java.awt.LayoutManager layoutManager15 = openGraphDialog10.getLayout();
    openGraphDialog0.setLayout(layoutManager15);
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog17 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener18 = null;
    openGraphDialog17.addMouseMotionListener(mouseMotionListener18);
    java.lang.String str20 = openGraphDialog17.toString();
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog21 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b22 = openGraphDialog21.isForegroundSet();
    java.awt.Image image23 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog26 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog26.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i31 = openGraphDialog21.checkImage(image23, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog26);
    openGraphDialog17.remove((java.awt.Component)openGraphDialog26);
    openGraphDialog17.firePropertyChange("", 'a', '#');
    java.util.Locale locale37 = openGraphDialog17.getLocale();
    openGraphDialog0.setLocale(locale37);
    java.awt.Component.BaselineResizeBehavior baselineResizeBehavior39 = openGraphDialog0.getBaselineResizeBehavior();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(layoutManager15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "tccrouter.gbl.ui.OpenGraphDialog[dialog0,200,150,400x100,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=tccrouter.gbl.ui.OpenGraphDialog[dialog0,-1,32,52x10,invalid,hidden,disabled,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true],defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"+ "'", str20.equals("tccrouter.gbl.ui.OpenGraphDialog[dialog0,200,150,400x100,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=tccrouter.gbl.ui.OpenGraphDialog[dialog0,-1,32,52x10,invalid,hidden,disabled,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true],defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale37);
    org.junit.Assert.assertTrue("'" + baselineResizeBehavior39 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior39.equals(java.awt.Component.BaselineResizeBehavior.OTHER));

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    float f2 = openGraphDialog0.getAlignmentX();
    openGraphDialog0.show(false);
    openGraphDialog0.removeAll();
    int i6 = openGraphDialog0.getWidth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 400);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog0.firePropertyChange("hi!", (short)10, (short)(byte)10);
    javax.swing.TransferHandler transferHandler5 = null;
    openGraphDialog0.setTransferHandler(transferHandler5);
    java.awt.Window.Type type7 = openGraphDialog0.getType();
    openGraphDialog0.firePropertyChange("tccrouter.gbl.ui.OpenGraphDialog[dialog0,1,8,200x300,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", '4', ' ');
    boolean b12 = openGraphDialog0.isOpaque();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    org.junit.Assert.assertTrue("'" + type7 + "' != '" + java.awt.Window.Type.NORMAL + "'", type7.equals(java.awt.Window.Type.NORMAL));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog0.firePropertyChange("hi!", (short)10, (short)(byte)10);
    javax.swing.TransferHandler transferHandler5 = null;
    openGraphDialog0.setTransferHandler(transferHandler5);
    java.awt.Window.Type type7 = openGraphDialog0.getType();
    boolean b8 = openGraphDialog0.isFocusTraversalPolicyProvider();
    openGraphDialog0.enable();
    java.awt.image.BufferStrategy bufferStrategy10 = openGraphDialog0.getBufferStrategy();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    org.junit.Assert.assertTrue("'" + type7 + "' != '" + java.awt.Window.Type.NORMAL + "'", type7.equals(java.awt.Window.Type.NORMAL));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(bufferStrategy10);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    java.awt.event.ComponentListener[] componentListener_array11 = openGraphDialog0.getComponentListeners();
    openGraphDialog0.setTitle("hi!");
    openGraphDialog0.setLocationByPlatform(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array11);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b3 = openGraphDialog0.inside((int)' ', 0);
    boolean b4 = openGraphDialog0.getFocusableWindowState();
    java.awt.event.ContainerListener containerListener5 = null;
    openGraphDialog0.removeContainerListener(containerListener5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    java.awt.event.ComponentListener[] componentListener_array11 = openGraphDialog0.getComponentListeners();
    java.awt.event.HierarchyListener hierarchyListener12 = null;
    openGraphDialog0.addHierarchyListener(hierarchyListener12);
    openGraphDialog0.setDefaultCloseOperation((int)(byte)1);
    java.awt.Toolkit toolkit16 = openGraphDialog0.getToolkit();
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog17 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b20 = openGraphDialog17.inside((int)' ', 0);
    openGraphDialog17.move(8, (int)(byte)10);
    java.util.List<java.awt.Image> list_image24 = openGraphDialog17.getIconImages();
    java.awt.Rectangle rectangle25 = openGraphDialog17.bounds();
    java.awt.Rectangle rectangle26 = openGraphDialog0.getBounds(rectangle25);
    java.awt.Insets insets27 = openGraphDialog0.insets();
    boolean b28 = openGraphDialog0.isMinimumSizeSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_image24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(insets27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.beans.PropertyChangeListener propertyChangeListener2 = null;
    openGraphDialog0.removePropertyChangeListener("hi!", propertyChangeListener2);
    java.awt.event.KeyListener[] keyListener_array4 = openGraphDialog0.getKeyListeners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(keyListener_array4);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog0.firePropertyChange("hi!", (short)10, (short)(byte)10);
    boolean b5 = openGraphDialog0.isVisible();
    int i8 = openGraphDialog0.getBaseline((int)' ', (int)(byte)10);
    openGraphDialog0.setFocusTraversalKeysEnabled(true);
    openGraphDialog0.setSize((int)(short)-1, (int)(short)100);
    openGraphDialog0.firePropertyChange("tccrouter.gbl.ui.OpenGraphDialog[dialog0,1,8,200x300,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", 'a', '#');
    openGraphDialog0.buildLoadWindow();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    openGraphDialog0.setAlwaysOnTop(false);
    java.lang.String str13 = openGraphDialog0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "dialog0"+ "'", str13.equals("dialog0"));

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog0.firePropertyChange("hi!", (short)10, (short)(byte)10);
    boolean b5 = openGraphDialog0.isVisible();
    int i8 = openGraphDialog0.getBaseline((int)' ', (int)(byte)10);
    java.awt.event.ComponentListener componentListener9 = null;
    openGraphDialog0.addComponentListener(componentListener9);
    java.awt.event.MouseWheelListener mouseWheelListener11 = null;
    openGraphDialog0.addMouseWheelListener(mouseWheelListener11);
    java.awt.Point point13 = openGraphDialog0.getLocation();
    java.awt.ComponentOrientation componentOrientation14 = null;
    openGraphDialog0.setComponentOrientation(componentOrientation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point13);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener1 = null;
    openGraphDialog0.addMouseMotionListener(mouseMotionListener1);
    java.awt.Event event3 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog4 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b5 = openGraphDialog4.isForegroundSet();
    java.awt.Image image6 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog9 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog9.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i14 = openGraphDialog4.checkImage(image6, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog9);
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog15 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener16 = null;
    openGraphDialog15.addMouseMotionListener(mouseMotionListener16);
    java.lang.String str18 = openGraphDialog15.toString();
    int i19 = openGraphDialog4.getComponentZOrder((java.awt.Component)openGraphDialog15);
    boolean b20 = openGraphDialog0.gotFocus(event3, (java.lang.Object)openGraphDialog4);
    java.awt.event.MouseListener mouseListener21 = null;
    openGraphDialog0.removeMouseListener(mouseListener21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "tccrouter.gbl.ui.OpenGraphDialog[dialog0,100,150,200x300,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=Open Graph,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"+ "'", str18.equals("tccrouter.gbl.ui.OpenGraphDialog[dialog0,100,150,200x300,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=Open Graph,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test153"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b3 = openGraphDialog0.inside((int)' ', 0);
    java.lang.String str4 = openGraphDialog0.getTitle();
    java.awt.Graphics graphics5 = openGraphDialog0.getGraphics();
    // The following exception was thrown during execution in test generation
    try {
    openGraphDialog0.applyResourceBundle("");
      org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Open Graph"+ "'", str4.equals("Open Graph"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(graphics5);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test154"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog0.firePropertyChange("hi!", (short)10, (short)(byte)10);
    javax.swing.TransferHandler transferHandler5 = null;
    openGraphDialog0.setTransferHandler(transferHandler5);
    java.awt.Window.Type type7 = openGraphDialog0.getType();
    openGraphDialog0.firePropertyChange("tccrouter.gbl.ui.OpenGraphDialog[dialog0,1,8,200x300,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", '4', ' ');
    boolean b12 = openGraphDialog0.isDoubleBuffered();
    openGraphDialog0.repaint(400, (int)' ', 0, (int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    org.junit.Assert.assertTrue("'" + type7 + "' != '" + java.awt.Window.Type.NORMAL + "'", type7.equals(java.awt.Window.Type.NORMAL));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test155"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener1 = null;
    openGraphDialog0.addMouseMotionListener(mouseMotionListener1);
    java.lang.String str3 = openGraphDialog0.toString();
    java.awt.Dialog.ModalExclusionType modalExclusionType4 = openGraphDialog0.getModalExclusionType();
    java.beans.PropertyChangeListener[] propertyChangeListener_array6 = openGraphDialog0.getPropertyChangeListeners("tccrouter.gbl.ui.OpenGraphDialog[dialog0,8,10,10x100,invalid,hidden,disabled,layout=java.awt.BorderLayout,MODELESS,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
    java.awt.Rectangle rectangle7 = openGraphDialog0.getBounds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "tccrouter.gbl.ui.OpenGraphDialog[dialog0,100,150,200x300,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=Open Graph,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"+ "'", str3.equals("tccrouter.gbl.ui.OpenGraphDialog[dialog0,100,150,200x300,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=Open Graph,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"));
    org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle7);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test156"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener1 = null;
    openGraphDialog0.addMouseMotionListener(mouseMotionListener1);
    java.awt.Point point3 = openGraphDialog0.location();
    java.lang.String str4 = openGraphDialog0.getWarningString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test157"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    java.awt.event.ComponentListener[] componentListener_array11 = openGraphDialog0.getComponentListeners();
    java.awt.event.HierarchyListener hierarchyListener12 = null;
    openGraphDialog0.addHierarchyListener(hierarchyListener12);
    javax.swing.JRootPane jRootPane14 = openGraphDialog0.getRootPane();
    java.awt.event.ComponentListener componentListener15 = null;
    jRootPane14.addComponentListener(componentListener15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jRootPane14);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test158"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog0.firePropertyChange("hi!", (short)10, (short)(byte)10);
    boolean b5 = openGraphDialog0.isVisible();
    int i8 = openGraphDialog0.getBaseline((int)' ', (int)(byte)10);
    java.awt.Shape shape9 = openGraphDialog0.getShape();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(shape9);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test159"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    java.awt.event.ComponentListener[] componentListener_array11 = openGraphDialog0.getComponentListeners();
    java.awt.Point point12 = openGraphDialog0.location();
    java.awt.event.WindowListener windowListener13 = null;
    openGraphDialog0.removeWindowListener(windowListener13);
    java.awt.event.ComponentListener[] componentListener_array15 = openGraphDialog0.getComponentListeners();
    java.awt.event.WindowListener windowListener16 = null;
    openGraphDialog0.addWindowListener(windowListener16);
    boolean b18 = openGraphDialog0.isLocationByPlatform();
    openGraphDialog0.setAlwaysOnTop(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test160"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    java.awt.event.ComponentListener[] componentListener_array11 = openGraphDialog0.getComponentListeners();
    java.awt.event.HierarchyListener hierarchyListener12 = null;
    openGraphDialog0.addHierarchyListener(hierarchyListener12);
    openGraphDialog0.setDefaultCloseOperation((int)(byte)1);
    java.awt.Toolkit toolkit16 = openGraphDialog0.getToolkit();
    java.awt.Graphics graphics17 = null;
    openGraphDialog0.paintAll(graphics17);
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog19 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener20 = null;
    openGraphDialog19.addMouseMotionListener(mouseMotionListener20);
    java.lang.String str22 = openGraphDialog19.toString();
    java.awt.Dialog.ModalityType modalityType23 = openGraphDialog19.getModalityType();
    openGraphDialog0.setModalityType(modalityType23);
    java.lang.String str25 = openGraphDialog0.getName();
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog26 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b29 = openGraphDialog26.inside((int)' ', 0);
    java.awt.Component component30 = openGraphDialog26.getGlassPane();
    java.awt.Color color31 = openGraphDialog26.getBackground();
    openGraphDialog0.setForeground(color31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "tccrouter.gbl.ui.OpenGraphDialog[dialog0,100,150,200x300,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=Open Graph,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"+ "'", str22.equals("tccrouter.gbl.ui.OpenGraphDialog[dialog0,100,150,200x300,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=Open Graph,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"));
    org.junit.Assert.assertTrue("'" + modalityType23 + "' != '" + java.awt.Dialog.ModalityType.APPLICATION_MODAL + "'", modalityType23.equals(java.awt.Dialog.ModalityType.APPLICATION_MODAL));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "dialog0"+ "'", str25.equals("dialog0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color31);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test161"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b3 = openGraphDialog0.inside((int)' ', 0);
    java.awt.Component component4 = openGraphDialog0.getGlassPane();
    openGraphDialog0.setAlwaysOnTop(false);
    openGraphDialog0.setEnabled(true);
    java.awt.Graphics graphics9 = null;
    openGraphDialog0.printAll(graphics9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component4);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test162"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener1 = null;
    openGraphDialog0.addMouseMotionListener(mouseMotionListener1);
    java.awt.Font font3 = openGraphDialog0.getFont();
    openGraphDialog0.setEnabled(true);
    java.awt.event.FocusListener focusListener6 = null;
    openGraphDialog0.removeFocusListener(focusListener6);
    java.awt.Rectangle rectangle8 = openGraphDialog0.getBounds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle8);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test163"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    float f2 = openGraphDialog0.getAlignmentX();
    java.awt.Event event3 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog4 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b5 = openGraphDialog4.isForegroundSet();
    java.awt.Event event6 = null;
    boolean b9 = openGraphDialog4.mouseExit(event6, 0, (int)(byte)100);
    java.awt.Shape shape10 = openGraphDialog4.getShape();
    java.awt.FocusTraversalPolicy focusTraversalPolicy11 = null;
    openGraphDialog4.setFocusTraversalPolicy(focusTraversalPolicy11);
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog13 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener14 = null;
    openGraphDialog13.addMouseMotionListener(mouseMotionListener14);
    java.awt.Point point16 = openGraphDialog13.location();
    java.awt.Component component17 = openGraphDialog4.getComponentAt(point16);
    boolean b18 = openGraphDialog0.lostFocus(event3, (java.lang.Object)openGraphDialog4);
    java.awt.Container container19 = openGraphDialog0.getContentPane();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(shape10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(container19);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test164"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    int i11 = openGraphDialog0.getDefaultCloseOperation();
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog12 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b13 = openGraphDialog12.isForegroundSet();
    java.awt.Image image14 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog17 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog17.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i22 = openGraphDialog12.checkImage(image14, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog17);
    java.awt.event.ComponentListener[] componentListener_array23 = openGraphDialog12.getComponentListeners();
    java.awt.event.HierarchyListener hierarchyListener24 = null;
    openGraphDialog12.addHierarchyListener(hierarchyListener24);
    openGraphDialog12.setDefaultCloseOperation((int)(byte)1);
    java.awt.Toolkit toolkit28 = openGraphDialog12.getToolkit();
    java.awt.Graphics graphics29 = null;
    openGraphDialog12.paintAll(graphics29);
    java.awt.Event event31 = null;
    boolean b33 = openGraphDialog12.keyDown(event31, 128);
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog34 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b35 = openGraphDialog34.isForegroundSet();
    java.awt.Image image36 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog39 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog39.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i44 = openGraphDialog34.checkImage(image36, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog39);
    java.awt.event.ComponentListener[] componentListener_array45 = openGraphDialog34.getComponentListeners();
    java.awt.Point point46 = openGraphDialog34.location();
    java.awt.Component component47 = openGraphDialog12.getComponentAt(point46);
    boolean b48 = openGraphDialog0.contains(point46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test165"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog0.firePropertyChange("hi!", (short)10, (short)(byte)10);
    javax.swing.TransferHandler transferHandler5 = null;
    openGraphDialog0.setTransferHandler(transferHandler5);
    java.awt.Dimension dimension7 = openGraphDialog0.getSize();
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog8 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog8.firePropertyChange("hi!", (short)10, (short)(byte)10);
    boolean b13 = openGraphDialog8.isVisible();
    int i16 = openGraphDialog8.getBaseline((int)' ', (int)(byte)10);
    java.awt.event.ComponentListener componentListener17 = null;
    openGraphDialog8.addComponentListener(componentListener17);
    java.awt.event.MouseWheelListener mouseWheelListener19 = null;
    openGraphDialog8.addMouseWheelListener(mouseWheelListener19);
    java.awt.Point point21 = openGraphDialog8.getLocation();
    java.awt.Component component22 = openGraphDialog0.findComponentAt(point21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component22);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test166"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    int i11 = openGraphDialog0.getDefaultCloseOperation();
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog12 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener13 = null;
    openGraphDialog12.addMouseMotionListener(mouseMotionListener13);
    java.awt.Dialog.ModalExclusionType modalExclusionType15 = null;
    openGraphDialog12.setModalExclusionType(modalExclusionType15);
    boolean b17 = openGraphDialog12.isLightweight();
    java.awt.Image image20 = openGraphDialog12.createImage(4, 32);
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog21 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b22 = openGraphDialog21.isForegroundSet();
    java.awt.Image image23 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog26 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog26.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i31 = openGraphDialog21.checkImage(image23, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog26);
    java.awt.event.ComponentListener[] componentListener_array32 = openGraphDialog21.getComponentListeners();
    java.awt.event.HierarchyListener hierarchyListener33 = null;
    openGraphDialog21.addHierarchyListener(hierarchyListener33);
    openGraphDialog21.setDefaultCloseOperation((int)(byte)1);
    java.awt.Toolkit toolkit37 = openGraphDialog21.getToolkit();
    java.awt.Event event38 = null;
    boolean b40 = openGraphDialog21.action(event38, (java.lang.Object)100L);
    javax.swing.JMenuBar jMenuBar41 = null;
    openGraphDialog21.setJMenuBar(jMenuBar41);
    boolean b43 = openGraphDialog0.prepareImage(image20, (java.awt.image.ImageObserver)jMenuBar41);
    java.awt.event.FocusListener[] focusListener_array44 = openGraphDialog0.getFocusListeners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(image20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(focusListener_array44);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test167"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    java.awt.Point point11 = openGraphDialog5.getMousePosition();
    java.awt.im.InputContext inputContext12 = openGraphDialog5.getInputContext();
    boolean b13 = openGraphDialog5.requestFocusInWindow();
    boolean b14 = openGraphDialog5.isFocusable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputContext12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test168"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    java.awt.event.ComponentListener[] componentListener_array11 = openGraphDialog0.getComponentListeners();
    openGraphDialog0.setTitle("hi!");
    javax.accessibility.AccessibleContext accessibleContext14 = openGraphDialog0.getAccessibleContext();
    // The following exception was thrown during execution in test generation
    try {
    openGraphDialog0.transferFocusUpCycle();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext14);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test169"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    java.awt.event.ComponentListener[] componentListener_array11 = openGraphDialog0.getComponentListeners();
    java.awt.event.HierarchyListener hierarchyListener12 = null;
    openGraphDialog0.addHierarchyListener(hierarchyListener12);
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog14 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b15 = openGraphDialog14.isForegroundSet();
    java.awt.Image image16 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog19 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog19.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i24 = openGraphDialog14.checkImage(image16, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog19);
    java.awt.event.ComponentListener[] componentListener_array25 = openGraphDialog14.getComponentListeners();
    openGraphDialog14.setTitle("hi!");
    java.awt.Font font28 = openGraphDialog14.getFont();
    java.awt.FontMetrics fontMetrics29 = openGraphDialog0.getFontMetrics(font28);
    java.awt.event.MouseMotionListener mouseMotionListener30 = null;
    openGraphDialog0.addMouseMotionListener(mouseMotionListener30);
    java.awt.Event event32 = null;
    boolean b35 = openGraphDialog0.mouseDown(event32, (int)(byte)10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(fontMetrics29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test170"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog0.firePropertyChange("hi!", (short)10, (short)(byte)10);
    boolean b5 = openGraphDialog0.isVisible();
    int i8 = openGraphDialog0.getBaseline((int)' ', (int)(byte)10);
    java.awt.event.ComponentListener componentListener9 = null;
    openGraphDialog0.addComponentListener(componentListener9);
    java.awt.Dimension dimension11 = openGraphDialog0.getMinimumSize();
    openGraphDialog0.repaint((long)1, (int)(short)100, 100, 16, (int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension11);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test171"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    boolean b11 = openGraphDialog0.isFocusTraversalPolicyProvider();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test172"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    java.awt.event.MouseWheelListener[] mouseWheelListener_array11 = openGraphDialog5.getMouseWheelListeners();
    boolean b12 = openGraphDialog5.isEnabled();
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog13 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog13.firePropertyChange("hi!", (short)10, (short)(byte)10);
    java.awt.LayoutManager layoutManager18 = openGraphDialog13.getLayout();
    java.awt.Cursor cursor19 = openGraphDialog13.getCursor();
    openGraphDialog5.setCursor(cursor19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseWheelListener_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(layoutManager18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cursor19);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test173"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Event event2 = null;
    boolean b5 = openGraphDialog0.mouseExit(event2, 0, (int)(byte)100);
    java.awt.Shape shape6 = openGraphDialog0.getShape();
    java.awt.Event event7 = null;
    boolean b10 = openGraphDialog0.mouseDown(event7, (int)(byte)0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(shape6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test174"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    java.awt.event.ComponentListener[] componentListener_array11 = openGraphDialog0.getComponentListeners();
    java.awt.event.HierarchyListener hierarchyListener12 = null;
    openGraphDialog0.addHierarchyListener(hierarchyListener12);
    openGraphDialog0.setDefaultCloseOperation((int)(byte)1);
    java.awt.Toolkit toolkit16 = openGraphDialog0.getToolkit();
    java.awt.Graphics graphics17 = null;
    openGraphDialog0.paintAll(graphics17);
    java.awt.Event event19 = null;
    boolean b21 = openGraphDialog0.keyDown(event19, 128);
    openGraphDialog0.repaint((int)'4', 32, 200, (int)(short)-1);
    boolean b27 = openGraphDialog0.isFocusable();
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog29 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b32 = openGraphDialog29.inside((int)' ', 0);
    java.awt.Component component33 = openGraphDialog29.getGlassPane();
    java.awt.event.MouseWheelListener[] mouseWheelListener_array34 = component33.getMouseWheelListeners();
    java.awt.dnd.DropTarget dropTarget35 = component33.getDropTarget();
    // The following exception was thrown during execution in test generation
    try {
    java.awt.Component component36 = openGraphDialog0.add("tccrouter.gbl.ui.OpenGraphDialog[dialog0,65,24,0x0,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", component33);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseWheelListener_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(dropTarget35);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test175"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog0.firePropertyChange("hi!", (short)10, (short)(byte)10);
    javax.swing.TransferHandler transferHandler5 = null;
    openGraphDialog0.setTransferHandler(transferHandler5);
    java.awt.image.ImageProducer imageProducer7 = null;
    java.awt.Image image8 = openGraphDialog0.createImage(imageProducer7);
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener9 = null;
    openGraphDialog0.addHierarchyBoundsListener(hierarchyBoundsListener9);
    java.beans.PropertyChangeListener[] propertyChangeListener_array12 = openGraphDialog0.getPropertyChangeListeners("dialog0");
    openGraphDialog0.firePropertyChange("tccrouter.gbl.ui.OpenGraphDialog[dialog0,1,8,200x300,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", 1.0f, (float)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(image8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array12);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test176"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    java.awt.event.ComponentListener[] componentListener_array11 = openGraphDialog0.getComponentListeners();
    java.awt.event.MouseMotionListener mouseMotionListener12 = null;
    openGraphDialog0.removeMouseMotionListener(mouseMotionListener12);
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog14 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener15 = null;
    openGraphDialog14.addMouseMotionListener(mouseMotionListener15);
    java.awt.Color color17 = openGraphDialog14.getBackground();
    boolean b18 = openGraphDialog14.isResizable();
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog19 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener20 = null;
    openGraphDialog19.addMouseMotionListener(mouseMotionListener20);
    java.awt.Dialog.ModalExclusionType modalExclusionType22 = null;
    openGraphDialog19.setModalExclusionType(modalExclusionType22);
    boolean b24 = openGraphDialog19.isLightweight();
    java.awt.Image image27 = openGraphDialog19.createImage(4, 32);
    boolean b33 = openGraphDialog14.imageUpdate(image27, (int)(short)10, (int)(short)100, (int)(byte)100, (int)(short)100, (int)(short)100);
    boolean b39 = openGraphDialog0.imageUpdate(image27, (int)(byte)-1, 0, (int)'4', 64, 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(image27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test177"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog0.firePropertyChange("hi!", (short)10, (short)(byte)10);
    javax.swing.TransferHandler transferHandler5 = null;
    openGraphDialog0.setTransferHandler(transferHandler5);
    java.awt.Window.Type type7 = openGraphDialog0.getType();
    boolean b8 = openGraphDialog0.isFocusTraversalPolicyProvider();
    openGraphDialog0.enable();
    java.awt.Dimension dimension10 = openGraphDialog0.minimumSize();
    java.awt.Component[] component_array11 = openGraphDialog0.getComponents();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    org.junit.Assert.assertTrue("'" + type7 + "' != '" + java.awt.Window.Type.NORMAL + "'", type7.equals(java.awt.Window.Type.NORMAL));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component_array11);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test178"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Event event2 = null;
    boolean b5 = openGraphDialog0.mouseExit(event2, 0, (int)(byte)100);
    java.awt.Shape shape6 = openGraphDialog0.getShape();
    java.awt.FocusTraversalPolicy focusTraversalPolicy7 = null;
    openGraphDialog0.setFocusTraversalPolicy(focusTraversalPolicy7);
    int i9 = openGraphDialog0.getWidth();
    openGraphDialog0.disable();
    openGraphDialog0.firePropertyChange("tccrouter.gbl.ui.OpenGraphDialog[dialog0,8,10,128x10,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=tccrouter.gbl.ui.OpenGraphDialog[dialog0,8,10,0x100,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true],defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", 1.0f, 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(shape6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 200);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test179"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    java.awt.event.ComponentListener[] componentListener_array11 = openGraphDialog0.getComponentListeners();
    java.awt.Point point12 = openGraphDialog0.location();
    java.awt.event.WindowListener windowListener13 = null;
    openGraphDialog0.removeWindowListener(windowListener13);
    java.awt.event.ComponentListener[] componentListener_array15 = openGraphDialog0.getComponentListeners();
    openGraphDialog0.setName("tccrouter.gbl.ui.OpenGraphDialog[dialog0,65,24,0x0,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array15);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test180"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    java.awt.event.ComponentListener[] componentListener_array11 = openGraphDialog0.getComponentListeners();
    java.awt.event.HierarchyListener hierarchyListener12 = null;
    openGraphDialog0.addHierarchyListener(hierarchyListener12);
    openGraphDialog0.setDefaultCloseOperation((int)(byte)1);
    java.awt.Toolkit toolkit16 = openGraphDialog0.getToolkit();
    java.awt.Graphics graphics17 = null;
    openGraphDialog0.paintAll(graphics17);
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog19 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener20 = null;
    openGraphDialog19.addMouseMotionListener(mouseMotionListener20);
    java.lang.String str22 = openGraphDialog19.toString();
    java.awt.Dialog.ModalityType modalityType23 = openGraphDialog19.getModalityType();
    openGraphDialog0.setModalityType(modalityType23);
    java.awt.event.MouseMotionListener mouseMotionListener25 = null;
    openGraphDialog0.removeMouseMotionListener(mouseMotionListener25);
    boolean b29 = openGraphDialog0.inside((int)(byte)100, 64);
    javax.swing.TransferHandler transferHandler30 = null;
    openGraphDialog0.setTransferHandler(transferHandler30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "tccrouter.gbl.ui.OpenGraphDialog[tccrouter.gbl.ui.OpenGraphDialog[dialog0,65,24,0str22,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0str22,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true],100,150,200x300,invalid,hidden,disabled,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"+ "'", str22.equals("tccrouter.gbl.ui.OpenGraphDialog[tccrouter.gbl.ui.OpenGraphDialog[dialog0,65,24,0str22,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0str22,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true],100,150,200x300,invalid,hidden,disabled,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"));
    org.junit.Assert.assertTrue("'" + modalityType23 + "' != '" + java.awt.Dialog.ModalityType.APPLICATION_MODAL + "'", modalityType23.equals(java.awt.Dialog.ModalityType.APPLICATION_MODAL));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test181"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener1 = null;
    openGraphDialog0.addMouseMotionListener(mouseMotionListener1);
    java.awt.Point point3 = openGraphDialog0.location();
    // The following exception was thrown during execution in test generation
    try {
    openGraphDialog0.transferFocusDownCycle();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point3);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test182"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    java.awt.Point point11 = openGraphDialog5.getMousePosition();
    java.awt.event.HierarchyListener[] hierarchyListener_array12 = openGraphDialog5.getHierarchyListeners();
    openGraphDialog5.toBack();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array12);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test183"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog11 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener12 = null;
    openGraphDialog11.addMouseMotionListener(mouseMotionListener12);
    java.lang.String str14 = openGraphDialog11.toString();
    int i15 = openGraphDialog0.getComponentZOrder((java.awt.Component)openGraphDialog11);
    boolean b16 = openGraphDialog11.isBackgroundSet();
    java.awt.Event event17 = null;
    boolean b19 = openGraphDialog11.keyDown(event17, (int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "tccrouter.gbl.ui.OpenGraphDialog[tccrouter.gbl.ui.OpenGraphDialog[dialog0,65,24,0str14,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0str14,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true],100,150,200x300,invalid,hidden,disabled,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"+ "'", str14.equals("tccrouter.gbl.ui.OpenGraphDialog[tccrouter.gbl.ui.OpenGraphDialog[dialog0,65,24,0str14,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0str14,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true],100,150,200x300,invalid,hidden,disabled,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test184"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    java.awt.event.ComponentListener[] componentListener_array11 = openGraphDialog0.getComponentListeners();
    java.awt.event.HierarchyListener hierarchyListener12 = null;
    openGraphDialog0.addHierarchyListener(hierarchyListener12);
    openGraphDialog0.setDefaultCloseOperation((int)(byte)1);
    java.awt.Toolkit toolkit16 = openGraphDialog0.getToolkit();
    java.awt.Graphics graphics17 = null;
    openGraphDialog0.paintAll(graphics17);
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog19 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener20 = null;
    openGraphDialog19.addMouseMotionListener(mouseMotionListener20);
    java.lang.String str22 = openGraphDialog19.toString();
    java.awt.Dialog.ModalityType modalityType23 = openGraphDialog19.getModalityType();
    openGraphDialog0.setModalityType(modalityType23);
    boolean b25 = openGraphDialog0.isModal();
    openGraphDialog0.disable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "tccrouter.gbl.ui.OpenGraphDialog[tccrouter.gbl.ui.OpenGraphDialog[dialog0,65,24,0str22,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0str22,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true],100,150,200x300,invalid,hidden,disabled,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"+ "'", str22.equals("tccrouter.gbl.ui.OpenGraphDialog[tccrouter.gbl.ui.OpenGraphDialog[dialog0,65,24,0str22,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0str22,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true],100,150,200x300,invalid,hidden,disabled,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"));
    org.junit.Assert.assertTrue("'" + modalityType23 + "' != '" + java.awt.Dialog.ModalityType.APPLICATION_MODAL + "'", modalityType23.equals(java.awt.Dialog.ModalityType.APPLICATION_MODAL));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test185"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b3 = openGraphDialog0.inside((int)' ', 0);
    java.awt.Component component4 = openGraphDialog0.getGlassPane();
    openGraphDialog0.setAlwaysOnTop(false);
    openGraphDialog0.setEnabled(true);
    java.awt.event.ContainerListener[] containerListener_array9 = openGraphDialog0.getContainerListeners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(containerListener_array9);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test186"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener1 = null;
    openGraphDialog0.addMouseMotionListener(mouseMotionListener1);
    java.lang.String str3 = openGraphDialog0.toString();
    java.awt.Dialog.ModalityType modalityType4 = openGraphDialog0.getModalityType();
    java.awt.event.FocusListener focusListener5 = null;
    openGraphDialog0.removeFocusListener(focusListener5);
    java.awt.peer.ComponentPeer componentPeer7 = openGraphDialog0.getPeer();
    float f8 = openGraphDialog0.getOpacity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "tccrouter.gbl.ui.OpenGraphDialog[tccrouter.gbl.ui.OpenGraphDialog[dialog0,65,24,0str3,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0str3,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true],100,150,200x300,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"+ "'", str3.equals("tccrouter.gbl.ui.OpenGraphDialog[tccrouter.gbl.ui.OpenGraphDialog[dialog0,65,24,0str3,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0str3,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true],100,150,200x300,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"));
    org.junit.Assert.assertTrue("'" + modalityType4 + "' != '" + java.awt.Dialog.ModalityType.APPLICATION_MODAL + "'", modalityType4.equals(java.awt.Dialog.ModalityType.APPLICATION_MODAL));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentPeer7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f8 == 1.0f);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test187"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog11 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener12 = null;
    openGraphDialog11.addMouseMotionListener(mouseMotionListener12);
    java.lang.String str14 = openGraphDialog11.toString();
    int i15 = openGraphDialog0.getComponentZOrder((java.awt.Component)openGraphDialog11);
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog16 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener17 = null;
    openGraphDialog16.addMouseMotionListener(mouseMotionListener17);
    java.awt.Color color19 = openGraphDialog16.getBackground();
    boolean b20 = openGraphDialog16.isResizable();
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog21 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener22 = null;
    openGraphDialog21.addMouseMotionListener(mouseMotionListener22);
    java.awt.Dialog.ModalExclusionType modalExclusionType24 = null;
    openGraphDialog21.setModalExclusionType(modalExclusionType24);
    boolean b26 = openGraphDialog21.isLightweight();
    java.awt.Image image29 = openGraphDialog21.createImage(4, 32);
    boolean b35 = openGraphDialog16.imageUpdate(image29, (int)(short)10, (int)(short)100, (int)(byte)100, (int)(short)100, (int)(short)100);
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog38 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener39 = null;
    openGraphDialog38.addMouseMotionListener(mouseMotionListener39);
    java.awt.Dialog.ModalExclusionType modalExclusionType41 = null;
    openGraphDialog38.setModalExclusionType(modalExclusionType41);
    openGraphDialog38.firePropertyChange("", (long)'#', (long)16);
    java.beans.PropertyChangeListener propertyChangeListener48 = null;
    openGraphDialog38.addPropertyChangeListener("tccrouter.gbl.ui.OpenGraphDialog[dialog0,8,10,128x30,invalid,layout=java.awt.BorderLayout,MODELESS,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", propertyChangeListener48);
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog50 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b51 = openGraphDialog50.isForegroundSet();
    java.awt.Image image52 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog55 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog55.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i60 = openGraphDialog50.checkImage(image52, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog55);
    java.awt.Color color61 = openGraphDialog55.getForeground();
    openGraphDialog38.setForeground(color61);
    openGraphDialog38.invalidate();
    java.awt.event.WindowStateListener windowStateListener64 = null;
    openGraphDialog38.removeWindowStateListener(windowStateListener64);
    int i66 = openGraphDialog11.checkImage(image29, (int)(byte)0, (int)(byte)1, (java.awt.image.ImageObserver)openGraphDialog38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "tccrouter.gbl.ui.OpenGraphDialog[tccrouter.gbl.ui.OpenGraphDialog[dialog0,65,24,0str14,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0str14,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true],100,150,200x300,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"+ "'", str14.equals("tccrouter.gbl.ui.OpenGraphDialog[tccrouter.gbl.ui.OpenGraphDialog[dialog0,65,24,0str14,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0str14,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true],100,150,200x300,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(image29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 32);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test188"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b3 = openGraphDialog0.inside((int)' ', 0);
    java.lang.String str4 = openGraphDialog0.getTitle();
    java.awt.Graphics graphics5 = openGraphDialog0.getGraphics();
    openGraphDialog0.resize(128, 10);
    boolean b9 = openGraphDialog0.isBackgroundSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(graphics5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test189"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    float f2 = openGraphDialog0.getAlignmentX();
    openGraphDialog0.show(false);
    openGraphDialog0.removeAll();
    java.awt.event.KeyListener keyListener6 = null;
    openGraphDialog0.removeKeyListener(keyListener6);
    boolean b8 = openGraphDialog0.isDoubleBuffered();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test190"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    java.awt.event.ComponentListener[] componentListener_array11 = openGraphDialog0.getComponentListeners();
    java.awt.event.HierarchyListener hierarchyListener12 = null;
    openGraphDialog0.addHierarchyListener(hierarchyListener12);
    openGraphDialog0.setDefaultCloseOperation((int)(byte)1);
    java.awt.Toolkit toolkit16 = openGraphDialog0.getToolkit();
    java.awt.Graphics graphics17 = null;
    openGraphDialog0.paintAll(graphics17);
    java.awt.Event event19 = null;
    boolean b21 = openGraphDialog0.keyDown(event19, 128);
    openGraphDialog0.show(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test191"); }

    int i0 = java.awt.image.ImageObserver.WIDTH;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test192"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b3 = openGraphDialog0.inside((int)' ', 0);
    java.awt.Component component4 = openGraphDialog0.getGlassPane();
    openGraphDialog0.setAlwaysOnTop(false);
    openGraphDialog0.setEnabled(true);
    java.awt.event.WindowListener windowListener9 = null;
    openGraphDialog0.addWindowListener(windowListener9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component4);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test193"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog0.firePropertyChange("hi!", (short)10, (short)(byte)10);
    boolean b5 = openGraphDialog0.isVisible();
    int i8 = openGraphDialog0.getBaseline((int)' ', (int)(byte)10);
    boolean b9 = openGraphDialog0.isFocusTraversalPolicySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test194"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Event event2 = null;
    boolean b5 = openGraphDialog0.mouseExit(event2, 0, (int)(byte)100);
    java.awt.Shape shape6 = null;
    openGraphDialog0.setShape(shape6);
    boolean b8 = openGraphDialog0.isEnabled();
    openGraphDialog0.disable();
    // The following exception was thrown during execution in test generation
    try {
    java.awt.Dimension dimension10 = openGraphDialog0.preferredSize();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test195"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    float f2 = openGraphDialog0.getAlignmentX();
    openGraphDialog0.show(false);
    openGraphDialog0.removeAll();
    java.awt.event.KeyListener keyListener6 = null;
    openGraphDialog0.removeKeyListener(keyListener6);
    boolean b8 = openGraphDialog0.isPreferredSizeSet();
    java.awt.image.ImageProducer imageProducer9 = null;
    java.awt.Image image10 = openGraphDialog0.createImage(imageProducer9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f2 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(image10);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test196"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    java.awt.event.ComponentListener[] componentListener_array11 = openGraphDialog0.getComponentListeners();
    java.awt.event.HierarchyListener hierarchyListener12 = null;
    openGraphDialog0.addHierarchyListener(hierarchyListener12);
    openGraphDialog0.setDefaultCloseOperation((int)(byte)1);
    java.awt.Toolkit toolkit16 = openGraphDialog0.getToolkit();
    java.awt.Graphics graphics17 = null;
    openGraphDialog0.paintAll(graphics17);
    java.awt.Event event19 = null;
    boolean b21 = openGraphDialog0.keyDown(event19, 128);
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog22 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b23 = openGraphDialog22.isForegroundSet();
    java.awt.Image image24 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog27 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog27.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i32 = openGraphDialog22.checkImage(image24, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog27);
    java.awt.event.ComponentListener[] componentListener_array33 = openGraphDialog22.getComponentListeners();
    java.awt.Point point34 = openGraphDialog22.location();
    java.awt.Component component35 = openGraphDialog0.getComponentAt(point34);
    java.awt.FocusTraversalPolicy focusTraversalPolicy36 = null;
    openGraphDialog0.setFocusTraversalPolicy(focusTraversalPolicy36);
    java.awt.Event event38 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b39 = openGraphDialog0.handleEvent(event38);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component35);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test197"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener1 = null;
    openGraphDialog0.addMouseMotionListener(mouseMotionListener1);
    java.awt.Color color3 = openGraphDialog0.getBackground();
    boolean b4 = openGraphDialog0.isResizable();
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener6 = null;
    openGraphDialog5.addMouseMotionListener(mouseMotionListener6);
    java.awt.Dialog.ModalExclusionType modalExclusionType8 = null;
    openGraphDialog5.setModalExclusionType(modalExclusionType8);
    boolean b10 = openGraphDialog5.isLightweight();
    java.awt.Image image13 = openGraphDialog5.createImage(4, 32);
    boolean b19 = openGraphDialog0.imageUpdate(image13, (int)(short)10, (int)(short)100, (int)(byte)100, (int)(short)100, (int)(short)100);
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog20 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener21 = null;
    openGraphDialog20.addMouseMotionListener(mouseMotionListener21);
    java.awt.Dialog.ModalExclusionType modalExclusionType23 = null;
    openGraphDialog20.setModalExclusionType(modalExclusionType23);
    boolean b25 = openGraphDialog20.isLightweight();
    java.awt.Image image28 = openGraphDialog20.createImage(4, 32);
    boolean b34 = openGraphDialog0.imageUpdate(image28, (int)(byte)-1, 4, (int)(byte)-1, (int)(short)-1, (int)(short)1);
    java.awt.Component component35 = openGraphDialog0.getMostRecentFocusOwner();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(image13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(image28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component35);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test198"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog0.firePropertyChange("hi!", (short)10, (short)(byte)10);
    java.awt.LayoutManager layoutManager5 = openGraphDialog0.getLayout();
    java.awt.Cursor cursor6 = openGraphDialog0.getCursor();
    java.awt.image.ImageProducer imageProducer7 = null;
    java.awt.Image image8 = openGraphDialog0.createImage(imageProducer7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(layoutManager5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cursor6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(image8);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test199"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b3 = openGraphDialog0.inside((int)' ', 0);
    boolean b4 = openGraphDialog0.getFocusableWindowState();
    boolean b5 = openGraphDialog0.isFocusTraversalPolicySet();
    boolean b6 = openGraphDialog0.isFontSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test200"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog0.firePropertyChange("hi!", (short)10, (short)(byte)10);
    javax.swing.TransferHandler transferHandler5 = null;
    openGraphDialog0.setTransferHandler(transferHandler5);
    java.awt.Window.Type type7 = openGraphDialog0.getType();
    boolean b8 = openGraphDialog0.isFocusTraversalPolicyProvider();
    openGraphDialog0.enable();
    boolean b10 = openGraphDialog0.isUndecorated();
    java.awt.MenuComponent menuComponent11 = null;
    openGraphDialog0.remove(menuComponent11);
    openGraphDialog0.setFocusTraversalKeysEnabled(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    org.junit.Assert.assertTrue("'" + type7 + "' != '" + java.awt.Window.Type.NORMAL + "'", type7.equals(java.awt.Window.Type.NORMAL));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test201"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b3 = openGraphDialog0.inside((int)' ', 0);
    java.lang.String str4 = openGraphDialog0.getTitle();
    java.awt.Graphics graphics5 = openGraphDialog0.getGraphics();
    java.awt.Event event6 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog7 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener8 = null;
    openGraphDialog7.addMouseMotionListener(mouseMotionListener8);
    java.lang.String str10 = openGraphDialog7.toString();
    java.awt.Dialog.ModalityType modalityType11 = openGraphDialog7.getModalityType();
    boolean b12 = openGraphDialog0.lostFocus(event6, (java.lang.Object)openGraphDialog7);
    java.awt.Dialog.ModalityType modalityType13 = openGraphDialog7.getModalityType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(graphics5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tccrouter.gbl.ui.OpenGraphDialog[tccrouter.gbl.ui.OpenGraphDialog[dialog0,65,24,0str10,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0str10,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true],100,150,128x10,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"+ "'", str10.equals("tccrouter.gbl.ui.OpenGraphDialog[tccrouter.gbl.ui.OpenGraphDialog[dialog0,65,24,0str10,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0str10,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true],100,150,128x10,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"));
    org.junit.Assert.assertTrue("'" + modalityType11 + "' != '" + java.awt.Dialog.ModalityType.APPLICATION_MODAL + "'", modalityType11.equals(java.awt.Dialog.ModalityType.APPLICATION_MODAL));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    org.junit.Assert.assertTrue("'" + modalityType13 + "' != '" + java.awt.Dialog.ModalityType.APPLICATION_MODAL + "'", modalityType13.equals(java.awt.Dialog.ModalityType.APPLICATION_MODAL));

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test202"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener1 = null;
    openGraphDialog0.addMouseMotionListener(mouseMotionListener1);
    java.awt.Color color3 = openGraphDialog0.getBackground();
    openGraphDialog0.repaint(0L, 32, (int)(short)100, (int)(byte)0, 8);
    boolean b10 = openGraphDialog0.isDisplayable();
    java.awt.peer.ComponentPeer componentPeer11 = openGraphDialog0.getPeer();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentPeer11);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test203"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener1 = null;
    openGraphDialog0.addMouseMotionListener(mouseMotionListener1);
    java.awt.Color color3 = openGraphDialog0.getBackground();
    openGraphDialog0.firePropertyChange("tccrouter.gbl.ui.OpenGraphDialog[dialog0,8,10,128x30,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", (double)400, (double)10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color3);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test204"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b3 = openGraphDialog0.inside((int)' ', 0);
    java.awt.Component component4 = openGraphDialog0.getGlassPane();
    java.awt.Color color5 = openGraphDialog0.getBackground();
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog6 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener7 = null;
    openGraphDialog6.addMouseMotionListener(mouseMotionListener7);
    java.awt.Dialog.ModalExclusionType modalExclusionType9 = null;
    openGraphDialog6.setModalExclusionType(modalExclusionType9);
    openGraphDialog6.firePropertyChange("", (long)'#', (long)16);
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog15 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b16 = openGraphDialog15.isForegroundSet();
    java.awt.Image image17 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog20 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog20.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i25 = openGraphDialog15.checkImage(image17, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog20);
    java.awt.event.ComponentListener[] componentListener_array26 = openGraphDialog15.getComponentListeners();
    java.awt.event.HierarchyListener hierarchyListener27 = null;
    openGraphDialog15.addHierarchyListener(hierarchyListener27);
    openGraphDialog15.setDefaultCloseOperation((int)(byte)1);
    java.awt.Toolkit toolkit31 = openGraphDialog15.getToolkit();
    java.awt.Event event32 = null;
    boolean b34 = openGraphDialog15.action(event32, (java.lang.Object)100L);
    java.awt.Dimension dimension35 = openGraphDialog15.getMinimumSize();
    java.awt.Dimension dimension36 = openGraphDialog6.getSize(dimension35);
    java.awt.Dimension dimension37 = openGraphDialog0.getSize(dimension36);
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog38 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b41 = openGraphDialog38.inside((int)' ', 0);
    java.awt.Component component42 = openGraphDialog38.getGlassPane();
    java.awt.event.MouseWheelListener[] mouseWheelListener_array43 = component42.getMouseWheelListeners();
    java.awt.dnd.DropTarget dropTarget44 = component42.getDropTarget();
    // The following exception was thrown during execution in test generation
    try {
    openGraphDialog0.setComponentZOrder(component42, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(toolkit31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseWheelListener_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(dropTarget44);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test205"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    java.awt.event.MouseMotionListener mouseMotionListener1 = null;
    openGraphDialog0.addMouseMotionListener(mouseMotionListener1);
    java.lang.String str3 = openGraphDialog0.toString();
    java.awt.Dialog.ModalExclusionType modalExclusionType4 = openGraphDialog0.getModalExclusionType();
    float f5 = openGraphDialog0.getOpacity();
    java.awt.Event event6 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b7 = openGraphDialog0.handleEvent(event6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "tccrouter.gbl.ui.OpenGraphDialog[tccrouter.gbl.ui.OpenGraphDialog[dialog0,65,24,0str3,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0str3,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true],100,150,128x10,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"+ "'", str3.equals("tccrouter.gbl.ui.OpenGraphDialog[tccrouter.gbl.ui.OpenGraphDialog[dialog0,65,24,0str3,invalid,hidden,layout=java.awt.BorderLayout,MODELESS,title=,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0str3,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true],100,150,128x10,invalid,hidden,layout=java.awt.BorderLayout,APPLICATION_MODAL,title=hi!,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,128x30,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"));
    org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == 1.0f);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test206"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    int i11 = openGraphDialog0.getDefaultCloseOperation();
    java.awt.event.FocusListener focusListener12 = null;
    openGraphDialog0.removeFocusListener(focusListener12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test207"); }

    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog0 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    boolean b1 = openGraphDialog0.isForegroundSet();
    java.awt.Image image2 = null;
    tccrouter.gbl.ui.OpenGraphDialog openGraphDialog5 = tccrouter.gbl.ui.OpenGraphDialog.getInstance();
    openGraphDialog5.firePropertyChange("hi!", (short)10, (short)(byte)10);
    int i10 = openGraphDialog0.checkImage(image2, 2, (int)(byte)-1, (java.awt.image.ImageObserver)openGraphDialog5);
    java.awt.event.ComponentListener[] componentListener_array11 = openGraphDialog0.getComponentListeners();
    java.awt.event.HierarchyListener hierarchyListener12 = null;
    openGraphDialog0.addHierarchyListener(hierarchyListener12);
    javax.swing.JRootPane jRootPane14 = openGraphDialog0.getRootPane();
    java.awt.Container container15 = openGraphDialog0.getContentPane();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(openGraphDialog5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jRootPane14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(container15);

  }
	
}
