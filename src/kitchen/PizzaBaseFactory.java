package kitchen;

public class PizzaBaseFactory implements PizzaFactory {
	@Override
	public Pizza create() {
		return new PizzaBase();
	}

}
