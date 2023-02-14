package kitchen;

import java.util.Collection;

public class DoughGlutenFree implements Ingredient {

	private Collection<Ingredient> ingredientList;

	public DoughGlutenFree(Pizza p) {
		this.ingredientList = p.createIngredientList();
	}

	@Override
	public Collection<Ingredient> getIngredientList() {
		return ingredientList;
	}

	@Override
	public void addI() {
		ingredientList.add(this);
	}
}
