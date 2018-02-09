package FoodOrderingServicePackage.FoodOrderingService.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import FoodOrderingServicePackage.FoodOrderingService.database.DatabaseClass;
import FoodOrderingServicePackage.FoodOrderingService.model.Restaurant;

public class RestaurantService {
	
	private Map<String,Restaurant> restaurants = DatabaseClass.getRestaurants();
	
	public RestaurantService(){
		restaurants.put("Ruchi", new Restaurant(1,"Ruchi", "123 Bellevue way", "Redmond", "WA", "USA", 4,"Indian"));
		restaurants.put("All Day Pho", new Restaurant(2,"All Day Pho", "13 Bellevue way NE", "Bellevue", "WA", "USA", 3,"Vietnameese"));
		restaurants.put("Madras Dosa Corner", new Restaurant(3,"Madras Dosa Corner", "56 Gilman Blvd", "Issaquah", "WA", "USA", 5,"South-Indian"));
	}
	
	public List<Restaurant> getAllRestaurants(){
            return new ArrayList<Restaurant>(restaurants.values());
	}
	
	public Restaurant getRestaurant(String restaurant_name){
		return restaurants.get(restaurant_name);
	}
	
	
	public Restaurant addRestaurant(Restaurant new_restautant){
		new_restautant.setId(restaurants.size() + 1);
		restaurants.put(new_restautant.getRestaurant_name(), new_restautant);
		return new_restautant;	  
	}
	
	public Restaurant updateRestaurant(Restaurant restaurant){
		restaurants.put(restaurant.getRestaurant_name(), restaurant);
		return restaurant;
	}
	
	public Restaurant removeRestaurant(String restaurant_name){
		return restaurants.remove(restaurant_name);
	}
}
