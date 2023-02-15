package kitchen;

public class Mushrooms extends PizzaDecorator {

	public Mushrooms(Pizza p) {
		super(p);
	}
	
	@Override
	public String getDescription() {
		return super.getDescription()+", Mushrooms";
	}

//	@Override
//	public void addIngredient() {
//		ingredient.getIngredientList().add(this);
//		this.ingredient.addIngredient();
//	}
}
