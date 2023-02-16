package order;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import delivery.TakeAway;
import kitchen.MargheritaFactory;
import kitchen.Mozzarella;
import kitchen.Pizza;
import kitchen.PizzaBaseGlutenFree;
import kitchen.TomatoSouce;

public class OrderTest {

	@Test
	public void testOrder() {
		
		Order o =new Order();
		
		o.addPizza(new Pizza() {
			
			@Override
			public String getDescription() {
				return "Pizza con le patatine";
			}
		});
		
		
		assertEquals("Pizza con le patatine", o.getPizzaList().get(0).getDescription());
		
		Order p = new Order();
		
	}

}
