package delivery;

import java.util.List;

import order.Order;

public class HomeDelivery implements Delivery {

	private String address;
	private List<Order> orders;
	private String state;
	
	
	public HomeDelivery(String address) {
		this.address=address;
	}

	@Override
	public String getState() {
		return state;
	}

	public void setState(String state) { //no public
		this.state = state;
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


	@Override
	public void notifyObservers() {
		orders.forEach(o -> o.update(this));
	}

	

}
