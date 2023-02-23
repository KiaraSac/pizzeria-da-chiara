package kitchen;

public class PizzaBaseGlutenFreeFactory implements PizzaFactory {

	@Override
	public Pizza create() {
		return new PizzaBaseGlutenFree();
	}

}
