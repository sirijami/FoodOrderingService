package FoodOrderingServicePackage.FoodOrderingService.model;

public class Menu {
	
	private String drinks;
	private String sides;
	private String appetizers;
	private String entree;
	private String salads;
	private String desserts;
	
   
	public Menu(String drinks, String sides, String appetizers, String entree,
			String salads, String desserts) {
		this.drinks = drinks;
		this.sides = sides;
		this.appetizers = appetizers;
		this.entree = entree;
		this.salads = salads;
		this.desserts = desserts;
	}

	public String getDrinks() {
		return drinks;
	}

	public void setDrinks(String drinks) {
		this.drinks = drinks;
	}

	public String getSides() {
		return sides;
	}

	public void setSides(String sides) {
		this.sides = sides;
	}

	public String getAppetizers() {
		return appetizers;
	}

	public void setAppetizers(String appetizers) {
		this.appetizers = appetizers;
	}

	public String getEntree() {
		return entree;
	}

	public void setEntree(String entree) {
		this.entree = entree;
	}

	public String getSalads() {
		return salads;
	}

	public void setSalads(String salads) {
		this.salads = salads;
	}

	public String getDesserts() {
		return desserts;
	}

	public void setDesserts(String desserts) {
		this.desserts = desserts;
	}
	
	

}
