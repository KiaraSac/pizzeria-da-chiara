package order;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import delivery.Delivery;
import kitchen.Pizza;

public class Order {
	//OBSERVer
	private String deliveryState;
	private List<Pizza> pizzaList;
	
	public Order() {
		this.pizzaList = new ArrayList<>();
	}
	
	public void addPizza(Pizza p) {
		this.pizzaList.add(p);
	}
	
	List<Pizza> getPizzaList() {
		return this.pizzaList;
	}

	public String getDeliveryState() {
		return deliveryState;
	}

	public void update(String state) {
		deliveryState= state;
	}
 
}
