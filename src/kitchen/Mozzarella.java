package kitchen;

public class Mozzarella extends PizzaDecorator {

	public Mozzarella(Ingredient i) {
		super(i);
	}
	
	@Override
	public void addI() {
		ingredient.getIngredientList().add(this);
		this.ingredient.addI();
	}
}
