package delivery;

import java.util.ArrayList;
import java.util.List;

import order.Order;

public class TakeAway implements DeliveryMethod {
	// CONCRETE STRATEGY

	private String name;
//	private String state;

	public TakeAway(String n) {
		this.name = n;
	}

//	String getState() {
//		return state;
//	}
	
	@Override
	public String deliver() {
		return "Ritiro sul posto\nNome: " + this.name;
	}

}
