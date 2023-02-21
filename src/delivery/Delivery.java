package delivery;

import java.util.List;

import order.Order;

public interface Delivery {
	//OBSERVable INTERFACE
	
//	String getState();
	List<Order> getOrders();
	
	void removeObserver(Order o);

	void addObserver(Order o);

	void setState(String state);

	
	
}
