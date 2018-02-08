package FoodOrderingServicePackage.FoodOrderingService.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import FoodOrderingServicePackage.FoodOrderingService.database.DatabaseClass;
import FoodOrderingServicePackage.FoodOrderingService.model.Restaurant;

public class RestaurantService {
	
	private Map<Long,Restaurant> restaurants = DatabaseClass.getRestaurants();
	
	public RestaurantService(){
		restaurants.put(1L, new Restaurant(1,"Ruchi", "123 Bellevue way", "Redmond", "WA", "USA", 4,"Indian"));
		restaurants.put(2L, new Restaurant(2,"All Day Pho", "13 Bellevue way NE", "Bellevue", "WA", "USA", 3,"Vietnameese"));
		restaurants.put(3L, new Restaurant(3,"Madras Dosa Corner", "56 Gilman Blvd", "Issaquah", "WA", "USA", 5,"South-Indian"));
	}
	
	public List<Restaurant> getAllRestaurants(){
            return new ArrayList<Restaurant>(restaurants.values());
	}
	
	public Restaurant getRestaurant(long id){
		return restaurants.get(id);
	}
	
	
	public Restaurant addRestaurant(Restaurant new_restautant){
		new_restautant.setId(restaurants.size() + 1);
		restaurants.put(new_restautant.getId(), new_restautant);
		return new_restautant;	  
	}
	
	public Restaurant updateRestaurant(Restaurant restaurant){
		if(restaurant.getId() <= 0){
			return null;
		}
		restaurants.put(restaurant.getId(), restaurant);
		return restaurant;
	}
	
	public Restaurant removeRestaurant(long id){
		return restaurants.remove(id);
	}
}
