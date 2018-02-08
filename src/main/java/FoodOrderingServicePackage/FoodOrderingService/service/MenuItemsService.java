package FoodOrderingServicePackage.FoodOrderingService.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import FoodOrderingServicePackage.FoodOrderingService.database.DatabaseClass;
import FoodOrderingServicePackage.FoodOrderingService.model.MenuItems;

public class MenuItemsService {
	
	private Map<Long, MenuItems> menuItems = DatabaseClass.getMenuItems();
	
	public MenuItemsService(){
		menuItems.put(1L, new MenuItems(1, "Biryani", 150, "250 cal", "Indian"));
		menuItems.put(2L, new MenuItems(2, "Fried rice", 100, "150 cal", "Chineese"));
		menuItems.put(3L, new MenuItems(3, "Pan Cakes", 20, "200 cal", "American"));
	}
	
	
	public List<MenuItems> getMenuItems(){
		return new ArrayList<MenuItems>(menuItems.values());
	}
	
	public MenuItems addMenuItem(MenuItems new_menuItem){
		new_menuItem.setId(menuItems.size() + 1);
		menuItems.put(new_menuItem.getId(), new_menuItem);
		return new_menuItem;		
	}
	

}
