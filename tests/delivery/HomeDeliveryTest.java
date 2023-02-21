package delivery;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

import order.Order;

public class HomeDeliveryTest {

	@Test
	public void testAddObserver() {
		Order o =new Order();
		Delivery d = new HomeDelivery("Via Kyoto 33");
		
		d.addObserver(o);
		
		Collection<Order> orders=d.getOrders();
		
		assertThat(orders).contains(o);
		assertThat(orders).hasSize(1);
	}
	
	@Test 
	public void testRemoveObserver() {
		Delivery d = new HomeDelivery("Via Kyoto 33");
		
		Order notToRemove =new Order();
		Order toRemove = new Order();
		
		Collection<Order> orders = d.getOrders();
		
		orders.addAll(Arrays.asList(toRemove,notToRemove));
		
		d.removeObserver(toRemove);
		
		assertThat(orders).contains(notToRemove);
		assertThat(orders).hasSize(1);
	}
	
	 @Test
    public void testSetState() {
        Delivery delivery = new HomeDelivery("Via Kyoto 33");
        Order order1 = new Order();
        Order order2 = new Order();
        
		Collection<Order> orders = delivery.getOrders();

        orders.add(order1);
        orders.add(order2);
        
        delivery.setState("in consegna");
        
        assertThat(orders).allMatch(o->o.getDeliveryState().equals("in consegna"));
	 }

}
