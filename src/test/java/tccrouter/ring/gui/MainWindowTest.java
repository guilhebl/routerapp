package tccrouter.ring.gui;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MainWindowTest {

  public static boolean debug = false;
 @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test46"); }

    tccrouter.ring.gui.MainWindow mainWindow0 = tccrouter.ring.gui.MainWindow.getInstance();
    int i1 = mainWindow0.getState();
    mainWindow0.show();
    java.beans.PropertyChangeListener propertyChangeListener3 = null;
    mainWindow0.addPropertyChangeListener(propertyChangeListener3);
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener5 = null;
    mainWindow0.removeHierarchyBoundsListener(hierarchyBoundsListener5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mainWindow0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test47"); }

    tccrouter.ring.gui.MainWindow mainWindow0 = tccrouter.ring.gui.MainWindow.getInstance();
    int i1 = mainWindow0.getState();
    mainWindow0.show();
    java.beans.PropertyChangeListener propertyChangeListener3 = null;
    mainWindow0.addPropertyChangeListener(propertyChangeListener3);
    boolean b5 = mainWindow0.isDoubleBuffered();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mainWindow0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test48"); }

    tccrouter.ring.gui.MainWindow mainWindow0 = tccrouter.ring.gui.MainWindow.getInstance();
    int i1 = mainWindow0.getState();
    java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListener_array2 = mainWindow0.getHierarchyBoundsListeners();
    java.awt.Dimension dimension3 = null;
    mainWindow0.setMinimumSize(dimension3);
    java.awt.Image image7 = mainWindow0.createImage(7, 2);
    java.beans.PropertyChangeListener propertyChangeListener9 = null;
    mainWindow0.removePropertyChangeListener("", propertyChangeListener9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mainWindow0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyBoundsListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(image7);

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test49"); }

    tccrouter.ring.gui.MainWindow mainWindow0 = tccrouter.ring.gui.MainWindow.getInstance();
    int i1 = mainWindow0.getState();
    java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListener_array2 = mainWindow0.getHierarchyBoundsListeners();
    java.awt.Dimension dimension3 = null;
    mainWindow0.setMinimumSize(dimension3);
    java.awt.LayoutManager layoutManager5 = null;
    mainWindow0.setLayout(layoutManager5);
    mainWindow0.hide();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mainWindow0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyBoundsListener_array2);

  }

}