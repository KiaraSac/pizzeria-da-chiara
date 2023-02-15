package kitchen;

import java.util.ArrayList;
import java.util.Collection;

import order.Order;

public interface PizzaFactory {
	
	//Pizza Factory - CREATOR
	
//	private Order order;
//
//	public Kitchen(Order order) {
//		this.order = order;
//	}
	
	public Pizza createPizza();
	
	
//	//OBSERVABLE
//	private Collection<Order> orderList;
//	
//	public Kitchen() {
//		this.orderList=new ArrayList<>();
//	}
//	
//	public void addOrder(Order o) {
//		this.orderList.add(o);
//	}
//	
//	public void notifyOrder() {
//		orderList.forEach(o -> o.update());
//	}
	

}
