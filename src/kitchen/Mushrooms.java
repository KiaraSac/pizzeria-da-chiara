package kitchen;

public class Mushrooms extends PizzaDecorator {
	// +2
	public Mushrooms(Pizza p) {
		super(p);
	}

	@Override
	public String getDescription() {
		return super.getDescription() + ", Mushrooms";
	}

	@Override
	public double getPrice() {
		return super.getPrice() + 2;
	}
}
