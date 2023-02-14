package kitchen;

import java.util.Collection;

public class Dough implements Ingredient {

	private Collection<Ingredient> ingredientList;

	public Dough(Pizza p) {
		this.ingredientList = p.createIngredientList();
	}
	
	@Override
	public Collection<Ingredient> getIngredientList() {
		return ingredientList;
	}
	
	@Override
	public void addI() {
		System.out.println("DoughBefore");
		ingredientList.add(this);
		System.out.println("DoughAfter");
	}
	

}
