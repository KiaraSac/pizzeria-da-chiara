package delivery;

import java.util.List;

import order.Order;

public class TakeAway implements Delivery {
	//OBSERVER
	private String name;
	private Order order;
	private String state;
	private List<Order> orders;

	
	public TakeAway(String n) {
		this.name=n;
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
