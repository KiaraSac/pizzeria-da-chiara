package delivery;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

import order.Order;

public class DeliveryTest {
	
	@Test
	public void testHomeDeliveryStrategy() {		
		Delivery delivery=new Delivery(new HomeDelivery("via Roma 33"));
		
		delivery.deliver();
		
		assertThat(delivery.getState()).isEqualTo("Consegna a domicilio all'indirizzo: via Roma 33");
	}
	
	@Test
	public void testTakeAwayStrategy() {
		Delivery delivery=new Delivery(new TakeAway("Sandro"));
		
		delivery.deliver();
		
		assertThat(delivery.getState()).isEqualTo("Ritiro sul posto\nNome: Sandro");
	}
	
	@Test
	public void testAddObserver() {
		Delivery d = new Delivery();
		Order o = new Order(); 
		
		d.addObserver(o);
		
		Collection<Order> orders=d.getOrders();
		
		assertThat(orders).contains(o);
		assertThat(orders).hasSize(1);		
	}

	@Test
	public void testRemoveObserver() {
		Delivery d = new Delivery();
		Order notToRemove =new Order();
		Order toRemove = new Order();
		
		Collection<Order> orders = d.getOrders();
		
		orders.addAll(Arrays.asList(toRemove,notToRemove));
		
		d.removeObserver(toRemove);
		
		assertThat(orders).contains(notToRemove);
		assertThat(orders).hasSize(1);		
	}
}


