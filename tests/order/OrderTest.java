package order;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import kitchen.PizzaBaseFactory;
import kitchen.Pizza;
import kitchen.PizzaBase;
import static org.assertj.core.api.Assertions.assertThat;

public class OrderTest {

	@Test
	public void testAddPizza() {
		Pizza p = new PizzaBaseFactory().create();
		Order o = new Order();
		
		o.addPizza(p);
		
		assertThat(o.getPizzaList()).contains(p);
	}
	
	@Test
	public void testUpdate() {
		Order o = new Order();
		
		o.update("in transit");
		
		assertThat(o.getDeliveryState()).isEqualTo("in transit");
	}

}
