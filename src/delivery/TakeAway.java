package delivery;

import order.Order;

public class TakeAway implements Delivery {
	//OBSERVER
	
	public TakeAway() {
	}

	@Override
	public void update(Order order) {
		order.getState();
	}

}
