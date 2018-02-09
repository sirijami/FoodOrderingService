package FoodOrderingServicePackage.FoodOrderingService.model;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	
	// menuName
	// List<MenuItems>
	private String menuType;
	private long menuId;
//	List<MenuItems> menu_i = new ArrayList<MenuItems>();
	
	public Menu(){
		
	}
    /* Menu Types are : Sides, Entree, Salads, Drinks, Desserts */

	public Menu(String menuType, long menuId) {
		this.menuType = menuType;
		this.menuId = menuId;
	}
	
	public long getMenuId() {
		return menuId;
	}

	public void setMenuId(long menuId) {
		this.menuId = menuId;
	}

	public String getMenuType() {
		return menuType;
	}
	public void setMenuType(String menuType) {
		this.menuType = menuType;
	}
	
	
	
	
	
	
	

}
