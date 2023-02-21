package kitchen;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class FactoryTest {

	@Test
	public void testPizzaBaseGlutenFreeFactory() {
		
		Pizza p =new PizzaBaseGlutenFreeFactory().create();
		
		assertThat(p.getDescription()).isEqualTo("Base Pizza Gluten Free");
	}

	@Test
	public void testPizzaBaseFactory() {
		Pizza p = new PizzaBaseFactory().create();

		assertThat(p.getDescription()).isEqualTo("Base Pizza");
	}
	
	@Test
	public void testFactoryIsNotTheSameObject() {
		PizzaBaseFactory factory= new PizzaBaseFactory();

		Pizza p1= factory.create();
		Pizza p2= factory.create();
		
		assertThat(p1).isNotSameAs(p2);
	} 
}
