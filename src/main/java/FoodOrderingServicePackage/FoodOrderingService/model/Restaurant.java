package FoodOrderingServicePackage.FoodOrderingService.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Restaurant {
	private long id;
	private String restaurant_name;
	private String street;
	private String city;
	private String state;
	private String country;
	private float overall_rating;
	private String cusine_category;
	// List<Menus>
	public Restaurant(){
		
	}
	
	public Restaurant(long id, String name, String street, String city, String state, String country, float rating, String category){
		this.id = id;
		this.restaurant_name = name;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.overall_rating = rating;
		this.cusine_category = category;
	}
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRestaurant_name() {
		return restaurant_name;
	}

	public void setRestaurant_name(String restaurant_name) {
		this.restaurant_name = restaurant_name;
	}


	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public float getOverall_rating() {
		return overall_rating;
	}

	public void setOverall_rating(float overall_rating) {
		this.overall_rating = overall_rating;
	}

	public String getCusine_category() {
		return cusine_category;
	}

	public void setCusine_category(String cusine_category) {
		this.cusine_category = cusine_category;
	}

}
