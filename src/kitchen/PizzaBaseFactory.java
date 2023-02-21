package kitchen;

public class PizzaBaseFactory implements PizzaFactory {
	//8,50
	@Override
	public Pizza create() {
		return new PizzaBase();
	}

}
