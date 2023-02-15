package kitchen;

public class MargheritaFactory implements PizzaFactory {
	
	@Override
	public Pizza createPizza() {
		return  new Mozzarella(new TomatoSouce(new PizzaBase()));
	}

}
