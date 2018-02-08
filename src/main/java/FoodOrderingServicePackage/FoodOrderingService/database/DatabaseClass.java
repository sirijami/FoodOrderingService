package FoodOrderingServicePackage.FoodOrderingService.database;

import java.util.HashMap;
import java.util.Map;

import FoodOrderingServicePackage.FoodOrderingService.model.Restaurant;

public class DatabaseClass {
	
	private static Map<Long,Restaurant> restaurants = new HashMap<Long,Restaurant>();
	
	public static Map<Long, Restaurant> getRestaurants(){
		return restaurants;
	}
	
	

}
