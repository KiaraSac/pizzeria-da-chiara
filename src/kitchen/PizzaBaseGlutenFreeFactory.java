package kitchen;

public class PizzaBaseGlutenFreeFactory implements PizzaFactory {
	//6,5 euro
	
	@Override
	public Pizza create() {
		return new PizzaBaseGlutenFree();
	}

}
