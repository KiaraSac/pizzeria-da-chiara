package kitchen;

public class TomatoSouce extends PizzaDecorator {
	// +1,5 euro
	public TomatoSouce(Pizza p) {
		super(p);
	}

	@Override
	public String getDescription() {
		return super.getDescription() + ", Tomato Souce";
	}
	
	@Override
	public double getPrice() {
		return super.getPrice()+1.5;
	}

}
