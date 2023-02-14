package recipe;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import kitchen.*;

public class RecipeTest {
	
	@Test
	public void testGetDescription() {
		Ingredient ing = new Mozzarella(new TomatoSouce(new Dough(new PizzaMock())));
		ing.addI();
		Recipe r = new Recipe(ing);
		
		assertEquals("Mozzarella, TomatoSouce, Dough", r.getDescription());
	}

}
