package tccrouter.diamante.core.graph;

import org.junit.Assert;
import org.junit.Test;

import tccrouter.diamante.core.graph.property.ComponentProperties;
import tccrouter.diamante.extension.graph.property.Label;
import tccrouter.diamante.extension.graph.property.Position;

public class GraphComponentTest {

	@Test
	public void testGraphComponentTestConstructor() {
		ComponentProperties cp = new ComponentProperties();
		cp.addProperty(new Label("test"));
		GraphComponent g = new GraphComponent(cp);
		
		Assert.assertTrue(g.getProperties().getAllProperties().firstElement() != null);
	}

	@Test
	public void testPropGet() {
		ComponentProperties cp = new ComponentProperties();
		cp.addProperty(new Label("test"));
		GraphComponent g = new GraphComponent(cp);
		
		Assert.assertTrue(g.getProperties().getPropertyByName("Label") != null);		
	}

	@Test
	public void testPropSet() {
		ComponentProperties cp = new ComponentProperties();
		cp.addProperty(new Label("test"));
		GraphComponent g = new GraphComponent(cp);		
		Assert.assertTrue(g.getProperties().getPropertyByName("Label") != null);

		ComponentProperties cp2 = new ComponentProperties();
		cp2.addProperty(new Position(12.22,34.22));
		g.setProperties(cp2);
		Assert.assertTrue(g.getProperties().getPropertyByName("Position") != null);
		
	}

}


