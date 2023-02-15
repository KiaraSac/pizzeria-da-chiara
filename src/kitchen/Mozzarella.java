package kitchen;

public class Mozzarella extends PizzaDecorator {

	public Mozzarella(Pizza i) {
		super(i);
	}
	
	@Override
	public String getDescription() {
		return super.getDescription()+", Mozzarella";
	}
	
//	@Override
//	public void addIngredient() {
//		ingredient.getIngredientList().add(this);
//		this.ingredient.addIngredient();
//	}
}
