package order;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import delivery.DeliveryMethod;
import kitchen.Mozzarella;
import kitchen.Pizza;

public class Order {
	// OBSERVer
	private String deliveryState;
	private List<Pizza> pizzaList;

	public Order() {
		this.pizzaList = new ArrayList<>();
	}

	List<Pizza> getPizzaList() {
		return this.pizzaList;
	}

	public String getDeliveryState() {
		return this.deliveryState;
	}
	
	public void addPizza(Pizza p) {
		this.pizzaList.add(p);
	}

	public void update(String state) {
		this.deliveryState = state;
	}
	
}
