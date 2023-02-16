package order;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import delivery.Delivery;
import kitchen.Pizza;

public class Order {
	//OBSERVer
	//private Delivery delivery; //observer list
	private boolean isDelivered;
	private List<Pizza> pizzaList;
	
	//private String orderState;

	public Order() {
		this.pizzaList = new ArrayList<>();
	}
	
	public void addPizza(Pizza p) {
		this.pizzaList.add(p);
	}
	
	public List<Pizza> getPizzaList() {
		return this.pizzaList;
	}

	public String update(Delivery d) {
		return d.getState();
	}

}
