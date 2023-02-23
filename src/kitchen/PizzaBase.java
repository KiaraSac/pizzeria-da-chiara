package kitchen;

public class PizzaBase implements Pizza {
	// 4,5 euro
	@Override
	public String getDescription() {
		return "Base Pizza";
	}

	@Override
	public double getPrice() {
		return price;
	}

}
