package kitchen;

import java.util.Collection;

public abstract class PizzaDecorator implements Ingredient {

	protected Ingredient ingredient;
	
	public PizzaDecorator(Ingredient i) {
		this.ingredient=i;
	}

	@Override
	public void addI() {
		this.ingredient.addI();
	}
	
	@Override
	public Collection<Ingredient> getIngredientList() {
		return ingredient.getIngredientList();
	}

}
