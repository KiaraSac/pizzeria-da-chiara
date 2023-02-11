package kitchen;

import java.util.ArrayList;
import java.util.Collection;

public class PizzaMock implements Pizza {

	@Override
	public Collection<Ingredient> createIngredientList() {
		return new ArrayList<>();
	}

}
