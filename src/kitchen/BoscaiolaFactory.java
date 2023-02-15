package kitchen;

public class BoscaiolaFactory implements PizzaFactory {

	private Pizza boscaiola;
	
	public BoscaiolaFactory() {
		boscaiola=new Mushrooms(new Mozzarella(new TomatoSouce(new PizzaBase())));
	}

	@Override
	public Pizza createPizza() {
		return boscaiola;
	}

}
