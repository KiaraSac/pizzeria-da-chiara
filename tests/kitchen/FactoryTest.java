package kitchen;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactoryTest {

	@Test
	public void testMargheritaFactory() {
		Pizza m=new MargheritaFactory().createPizza();
		
		assertEquals("Base Pizza, Tomato Souce, Mozzarella", m.getDescription());		
	}

	@Test
	public void testBoscaiolaFactory() {
		Pizza b=new BoscaiolaFactory().createPizza();
		
		assertEquals("Base Pizza, Tomato Souce, Mozzarella, Mushrooms", b.getDescription());		
	}
}
