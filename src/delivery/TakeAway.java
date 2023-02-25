package delivery;

import java.util.ArrayList;
import java.util.List;

import order.Order;

public class TakeAway implements DeliveryMethod {
	// CONCRETE STRATEGY
	private String name;

	public TakeAway(String n) {
		this.name = n;
	}

	@Override
	public String deliver() {
		return "Ritiro sul posto\nNome: " + this.name;
	}

}
