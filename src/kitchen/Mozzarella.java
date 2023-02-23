package kitchen;

public class Mozzarella extends PizzaDecorator {
	// +0,5 euro
	
	public Mozzarella(Pizza i) {
		super(i);
	}

	@Override
	public String getDescription() {
		return super.getDescription() + ", Mozzarella";
	}
	
	@Override
	public double getPrice() {
		return super.getPrice()+0.5;
	}
}
