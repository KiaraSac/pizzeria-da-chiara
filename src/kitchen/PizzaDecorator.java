package kitchen;

import java.util.Collection;

public class PizzaDecorator implements Pizza {

	protected Pizza pizza;
	
	public PizzaDecorator(Pizza p) {
		this.pizza=p;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription();
	}
	
	
//
//	@Override
//	public abstract void addIngredient();	
//	
//	@Override
//	public Collection<Pizza> getIngredientList() {
//		return ingredient.getIngredientList();
//	}

}
