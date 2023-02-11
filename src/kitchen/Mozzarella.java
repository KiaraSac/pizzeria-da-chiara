package kitchen;

import java.util.Collection;

public class Mozzarella extends PizzaDecorator {

	public Mozzarella(Ingredient i) {
		super(i);
	}
	
	@Override
	public void addI() {
		System.out.println("MozzaBefore");
		ingredient.getIngredientList().add(this);
		super.addI();
		System.out.println("MozzaAfter");
	}
}
