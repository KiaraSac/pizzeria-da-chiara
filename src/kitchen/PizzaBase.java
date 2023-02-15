package kitchen;

import java.util.ArrayList;
import java.util.Collection;

public class PizzaBase implements Pizza {

	//Collection<Pizza> ingredientList;

	//impasto base
	
	public PizzaBase() {
//		this.ingredientList = new ArrayList<>();
	}

	@Override
	public String getDescription() {
		return "Base Pizza";
	}
	
//	@Override
//	public Collection<Pizza> getIngredientList() {
//		return ingredientList;
//	}
	
//	@Override
//	public void addIngredient() {
//		ingredientList.add(this);
//	}	

}
