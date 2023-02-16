package delivery;

import order.Order;

public interface Delivery {
	
	//OBSERVable INTERFACE
	void addObserver(Order o);
	void removeObserver(Order o);
	void notifyObservers();
	String getState();
	
}
