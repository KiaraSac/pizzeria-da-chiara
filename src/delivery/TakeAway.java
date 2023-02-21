package delivery;

import java.util.ArrayList;
import java.util.List;

import order.Order;

public class TakeAway implements Delivery {
	//OBSERVER
	private String name;
	private String state;
	private List<Order> orders;

	public TakeAway(String n) {
		orders=new ArrayList<>();
		this.name=n;
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

	@Override
	public List<Order> getOrders() {
		return orders;
	}

}
