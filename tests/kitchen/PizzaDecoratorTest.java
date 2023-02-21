package kitchen;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class PizzaDecoratorTest {

	private PizzaBase pizza;
	private PizzaBaseGlutenFree pizzaGlutenFree;

	@Before
	public void createPizzaBase() {
		pizza=new PizzaBase();
		pizzaGlutenFree=new PizzaBaseGlutenFree();
	}

	@Test
	public void testMozzarellaGetDescription() {

		Pizza p1 = new Mozzarella(pizza);
		Pizza p2 = new Mozzarella(pizzaGlutenFree);

		assertThat(p1.getDescription()).isEqualTo("Base Pizza, Mozzarella");
		assertThat(p2.getDescription()).isEqualTo("Base Pizza Gluten Free, Mozzarella");
	}
	
	@Test
	public void testTomatoSouceGetDescription() {

		Pizza p1 = new TomatoSouce(pizza);
		Pizza p2 = new TomatoSouce(pizzaGlutenFree);
	
		assertThat(p1.getDescription()).isEqualTo("Base Pizza, Tomato Souce");
		assertThat(p2.getDescription()).isEqualTo("Base Pizza Gluten Free, Tomato Souce");
	}
	
	@Test
	public void testMushroomsGetDescription() {

		Pizza p1 = new Mushrooms(pizza);
		Pizza p2 = new Mushrooms(pizzaGlutenFree);
		
		assertThat(p1.getDescription()).isEqualTo("Base Pizza, Mushrooms");
		assertThat(p2.getDescription()).isEqualTo("Base Pizza Gluten Free, Mushrooms");
	
	}
	
	@Test
	public void testPizzaDecorationAllTogheter() {

		Pizza p = new Mozzarella(
						new TomatoSouce(
						new Mushrooms(
						pizza)));
		
		assertThat(p.getDescription())
				.isEqualTo("Base Pizza, Mushrooms, Tomato Souce, Mozzarella");
		
	}
	

}