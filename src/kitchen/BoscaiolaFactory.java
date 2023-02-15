package kitchen;

public class BoscaiolaFactory implements PizzaFactory {

	@Override
	public Pizza createPizza() {
		return new Mushrooms(new Mozzarella(new TomatoSouce(new PizzaBase())));
	}

}
