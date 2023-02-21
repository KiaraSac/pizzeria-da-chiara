package delivery;

import java.util.ArrayList;
import java.util.List;

import order.Order;

public class HomeDelivery implements Delivery {

	private String address;
	private List<Order> orders;
	private String state; //potrebbe essere ENUM???
	
	public HomeDelivery(String address) {
		orders=new ArrayList<>();
		this.address=address;
	}
	
	@Override
	public List<Order> getOrders() {
		return orders;
	}

//	@Override
//	public String getState() {
//		return state;
//	}

	@Override
	public void setState(String state) { //no public
		this.state = state;
		notifyObservers();
	}

	@Override
	public void addObserver(Order o) {
		if(!orders.contains(o))
			orders.add(o);
	}

	@Override
	public void removeObserver(Order o) {
		orders.remove(o);
	}

	
	private void notifyObservers() {
		orders.forEach(o -> o.update(this.state));
	}

}
