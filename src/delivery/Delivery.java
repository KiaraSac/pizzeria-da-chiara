package delivery;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;

import order.Order;

public class Delivery {
	//SUBJECT NEW
	//CONTEXT STRATEGY NEW
	private DeliveryMethod deliveryMethod;
	private List<Order> orders;
	private String state;
	
	public Delivery(DeliveryMethod d) {
		this();
		this.deliveryMethod=d;
		
	}
	
	Delivery (){
		this.orders=new ArrayList<>();
	}
	
	public void deliver() {
		setState(deliveryMethod.deliver());
	}
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		notifyObservers();
	}
	
	List<Order> getOrders() {
		return orders;
	}

	public void addObserver(Order o) {
		orders.add(o);
	}

	public void removeObserver(Order o) {
		orders.remove(o);
	}
	
	private void notifyObservers() {
		orders.forEach(o -> o.update(this.state));
	}

}
