package kitchen;

public class PizzaDecorator implements Pizza {

	protected Pizza pizza;

	public PizzaDecorator(Pizza p) {
		this.pizza = p;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription();
	}

	@Override
	public double getPrice() {
		return pizza.getPrice();
	}

}
