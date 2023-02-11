package kitchen;

import java.util.Collection;

public class TomatoSouce extends PizzaDecorator {

	public TomatoSouce(Ingredient i) {
		super(i);
	}

	@Override
	public void addI() {
		ingredient.getIngredientList().add(this);
		super.addI();
	}

}
