package order;

import java.util.Collection;

import delivery.Delivery;
import kitchen.Ingredient;
import recipe.Recipe;

public class Order {
	//OBSERVable
	private Collection<Ingredient> recipeList; //da cambiare con recipe
	private Delivery delivery;
	private int state;
	
	//private String orderState;

	public Order(Collection<Ingredient> recipeList) {
		this.recipeList = recipeList;
	}

	public void addObserver(Delivery d) {
		this.delivery = d;
	}
	
	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		notifyObservers();
	}

	private void notifyObservers() {
		delivery.update(this);
	}
	
	
	
	

}
