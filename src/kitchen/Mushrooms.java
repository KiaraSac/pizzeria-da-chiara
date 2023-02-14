package kitchen;

public class Mushrooms extends PizzaDecorator {

	public Mushrooms(Ingredient i) {
		super(i);
	}

	@Override
	public void addI() {
		ingredient.getIngredientList().add(this);
		this.ingredient.addI();
	}
}
