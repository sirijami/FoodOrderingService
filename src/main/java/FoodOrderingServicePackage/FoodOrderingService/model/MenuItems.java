package FoodOrderingServicePackage.FoodOrderingService.model;

import java.util.List;

public class MenuItems {
	private long id;
	private String item_name;
	private long item_price;
	private String calories;
	private String item_cusine;
//	private List<String> ingredients;
	
	
	public MenuItems(){
		
	}

	public MenuItems(long id, String item_name, long item_price, String calories, String cusine
			/*,List<String> ingredients*/) {
		this.id = id;
		this.item_name = item_name;
		this.item_price = item_price;
		this.calories = calories;
		this.item_cusine = cusine;
//		this.ingredients = ingredients;
	}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getItem_cusine() {
		return item_cusine;
	}

	public void setItem_cusine(String item_cusine) {
		this.item_cusine = item_cusine;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public long getItem_price() {
		return item_price;
	}

	public void setItem_price(long item_price) {
		this.item_price = item_price;
	}

	public String getCalories() {
		return calories;
	}

	public void setCalories(String calories) {
		this.calories = calories;
	}

//	public List<String> getIngredients() {
//		return ingredients;
//	}
//
//	public void setIngredients(List<String> ingredients) {
//		this.ingredients = ingredients;
//	}
	
	

}
