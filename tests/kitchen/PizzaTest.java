package kitchen;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

public class PizzaTest {

	@Test
	public void testPizzaDecorationMozzarella() {

		Pizza p = new Mozzarella(new PizzaBase());
		assertEquals("Base Pizza, Mozzarella", p.getDescription());
	}
	
//	@Test
//	public void testPizzaDecorationTomatoSouce() {
//
//		Pizza i= new TomatoSouce(new PizzaBase());
//		i.addIngredient();
//				
//		Iterator<Pizza> iter = i.getIngredientList().iterator();
//		
//		assertEquals("TomatoSouce",iter.next().getClass().getSimpleName());
//		assertEquals("Dough",iter.next().getClass().getSimpleName());
//		
//		assertFalse(iter.hasNext());
//	}
//	
//	@Test
//	public void testPizzaDecorationMushrooms() {
//
//		Pizza i= new Mushrooms(new PizzaBaseGlutenFree(pizza));
//		i.addIngredient();
//		
//		Iterator<Pizza> iter = i.getIngredientList().iterator();
//		
//		assertEquals("Mushrooms",iter.next().getClass().getSimpleName());
//		assertEquals("DoughGlutenFree",iter.next().getClass().getSimpleName());
//		
//		assertFalse(iter.hasNext());
//	}
//	
//	@Test
//	public void testPizzaDecorationAllTogheter() {
//
//		Pizza i= new Mozzarella(
//						new TomatoSouce(
//						new Mushrooms(
//						new PizzaBaseGlutenFree(pizza))));
//		i.addIngredient();
//		
//		Iterator<Pizza> iter = i.getIngredientList().iterator();
//		
//		assertEquals("Mozzarella",iter.next().getClass().getSimpleName());
//		assertEquals("TomatoSouce",iter.next().getClass().getSimpleName());
//		assertEquals("Mushrooms",iter.next().getClass().getSimpleName());
//		assertEquals("DoughGlutenFree",iter.next().getClass().getSimpleName());
//		
//		assertFalse(iter.hasNext());
//	}
//	

}
