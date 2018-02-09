package FoodOrderingServicePackage.FoodOrderingService.database;

import java.awt.MenuItem;
import java.util.HashMap;
import java.util.Map;

import FoodOrderingServicePackage.FoodOrderingService.model.Menu;
import FoodOrderingServicePackage.FoodOrderingService.model.MenuItems;
import FoodOrderingServicePackage.FoodOrderingService.model.Restaurant;

public class DatabaseClass {
	
	private static Map<Long,Restaurant> restaurants = new HashMap<Long,Restaurant>();
	private static Map<Long,MenuItems> menuItems = new HashMap<Long, MenuItems>();
	private static Map<Long,Menu> menus = new HashMap<Long,Menu>();
	
	
	public static Map<Long, Restaurant> getRestaurants(){
		return restaurants;
	}
	
	public static Map<Long, MenuItems> getMenuItems(){
		return menuItems;
	}
	
	public static Map<Long, Menu> getMenus(){
		return menus;
	}
	
	

}
