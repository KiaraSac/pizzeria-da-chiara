package kitchen;

public class TomatoSouce extends PizzaDecorator {

	public TomatoSouce(Pizza p) {
		super(p);
	}

	@Override
	public String getDescription() {
		return super.getDescription()+", Tomato Souce";
	}

//	@Override
//	public void addIngredient() {
//		ingredient.getIngredientList().add(this);
//		this.ingredient.addIngredient();
//	}

}
