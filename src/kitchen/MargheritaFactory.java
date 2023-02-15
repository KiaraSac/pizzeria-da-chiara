package kitchen;

public class MargheritaFactory implements PizzaFactory {

	private Pizza margherita;
	
	public MargheritaFactory() {
		margherita = new Mozzarella(new TomatoSouce(new PizzaBase()));
	}

	@Override
	public Pizza createPizza() {
		return margherita;
	}

}
