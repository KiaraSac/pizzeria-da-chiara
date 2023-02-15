package order;

import java.util.Collection;

import delivery.Delivery;
import kitchen.Pizza;
import recipe.Recipe;

public class Order {
	//OBSERVable
	private Delivery delivery; //observer list
	private int state;
	private Collection<Pizza> pizzaList;
	
	//private String orderState;

	public Order(Collection<Pizza> pizzaList,Delivery d) {
		this.pizzaList = pizzaList;
		this.addObserver(d);
	}
	
	public Collection<Pizza> getPizzaList() {
		return this.pizzaList;
	}

	private void addObserver(Delivery d) {
		this.delivery = d;
	}
	
	public int getState() {
		return state;
	}

	private void notifyObservers(int state) {
		this.state=state;
		delivery.update(this);
	}	

}
