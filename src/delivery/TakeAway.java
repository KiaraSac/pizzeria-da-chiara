package delivery;

import order.Order;

public class TakeAway implements Delivery {
	//OBSERVER
	
	private Order order;
	
	public TakeAway(Order o) {
		this.order=o;
		order.addObserver(this);
	}

	@Override
	public void update(Order order) {
		
	}

}
