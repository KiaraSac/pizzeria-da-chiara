package kitchen;

public class TomatoSouce extends PizzaDecorator {

	public TomatoSouce(Ingredient i) {
		super(i);
	}

	@Override
	public void addI() {
		ingredient.getIngredientList().add(this);
		this.ingredient.addI();
	}

}
