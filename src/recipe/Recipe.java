package recipe;

import java.util.Iterator;
import java.util.stream.Collectors;

import kitchen.Ingredient;

public class Recipe {

	private Ingredient ingredients;
	
	public Recipe(Ingredient i) {
		this.ingredients=i;
	}
	
	public String getDescription() {
		return ingredients.getIngredientList().stream()
				.map(i -> i.getClass().getSimpleName())
				.collect(Collectors.joining(", "));
	}
	
	public void getPrice() {
		
	}

}
