package delivery;

import java.util.ArrayList;
import java.util.List;

import order.Order;

public class HomeDelivery implements DeliveryMethod {
	// CONCRETE STRATEGY

	private String address;
//	String state; 

	public HomeDelivery(String address) {
		this.address = address;
	}

//	String getState() {
//		return state;
//	}

	@Override
	public String deliver() {
		return "Consegna a domicilio all'indirizzo: " + this.address;

	}

}
