package order;

import java.util.Arrays;

import org.junit.Test;

import delivery.TakeAway;
import kitchen.MargheritaFactory;
import kitchen.Mozzarella;
import kitchen.PizzaBaseGlutenFree;
import kitchen.TomatoSouce;

public class OrderTest {

	@Test
	public void testOrder() {
		
		Order o =new Order(Arrays.asList(new TomatoSouce(new Mozzarella(new PizzaBaseGlutenFree())))
				, new TakeAway());
		
		Order p = new Order(Arrays.asList(new MargheritaFactory().createPizza()), new TakeAway());
		
	}

}
