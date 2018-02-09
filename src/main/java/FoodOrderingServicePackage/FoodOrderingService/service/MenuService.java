package FoodOrderingServicePackage.FoodOrderingService.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import FoodOrderingServicePackage.FoodOrderingService.database.DatabaseClass;
import FoodOrderingServicePackage.FoodOrderingService.model.Menu;
import FoodOrderingServicePackage.FoodOrderingService.model.MenuItems;

public class MenuService {
	Map<Long, Menu> menus = DatabaseClass.getMenus();
	
	public MenuService(){
		menus.put(1L, new Menu("Sides", 1));
		menus.put(2L, new Menu("Salads", 2));
		menus.put(3L, new Menu("Entree", 3));
		menus.put(4L, new Menu("Dessert", 4));
		menus.put(5L, new Menu("Drinks", 5));		
	}

	public List<Menu> getAllMenus() {
		return new ArrayList<Menu>(menus.values());		
	}
	
	public Menu getMenu(long menuId){
		return menus.get(menuId);
	}
	
	public Menu removeMenu(long menuid){
		return menus.remove(menuid);
	}

	public Menu addMenu(Menu menu) {
		menu.setMenuId(menus.size() + 1);
		menus.put(menu.getMenuId(), menu);
		return menu;
	}

}
