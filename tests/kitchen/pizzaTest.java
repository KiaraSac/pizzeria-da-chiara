package kitchen;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

public class pizzaTest {
	
	private Pizza pizza;
	
	@Before
	public void init() {
		pizza = new PizzaMock();
	}

	@Test
	public void testPizzaDecorationMozzarella() {

		Ingredient i= new Mozzarella(new Dough(pizza));
		i.addI();
		
		Iterator<Ingredient> iter = i.getIngredientList().iterator();
		
		assertEquals("Mozzarella",iter.next().getClass().getSimpleName());
		assertEquals("Dough",iter.next().getClass().getSimpleName());
		
		assertFalse(iter.hasNext());
	}
	
	@Test
	public void testPizzaDecorationTomatoSouce() {

		Ingredient i= new TomatoSouce(new Dough(pizza));
		i.addI();
		
		Iterator<Ingredient> iter = i.getIngredientList().iterator();
		
		assertEquals("TomatoSouce",iter.next().getClass().getSimpleName());
		assertEquals("Dough",iter.next().getClass().getSimpleName());
		
		assertFalse(iter.hasNext());
	}
	
	@Test
	public void testPizzaDecorationMushrooms() {

		Ingredient i= new Mushrooms(new DoughGlutenFree(pizza));
		i.addI();
		
		Iterator<Ingredient> iter = i.getIngredientList().iterator();
		
		assertEquals("Mushrooms",iter.next().getClass().getSimpleName());
		assertEquals("DoughGlutenFree",iter.next().getClass().getSimpleName());
		
		assertFalse(iter.hasNext());
	}
	
	@Test
	public void testPizzaDecorationAllTogheter() {

		Ingredient i= new Mozzarella(
						new TomatoSouce(
						new Mushrooms(
						new DoughGlutenFree(pizza))));
		i.addI();
		
		Iterator<Ingredient> iter = i.getIngredientList().iterator();
		
		assertEquals("Mozzarella",iter.next().getClass().getSimpleName());
		assertEquals("TomatoSouce",iter.next().getClass().getSimpleName());
		assertEquals("Mushrooms",iter.next().getClass().getSimpleName());
		assertEquals("DoughGlutenFree",iter.next().getClass().getSimpleName());
		
		assertFalse(iter.hasNext());
	}
	

}
