package FoodOrderingServicePackage.FoodOrderingService.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import FoodOrderingServicePackage.FoodOrderingService.model.Menu;
import FoodOrderingServicePackage.FoodOrderingService.model.MenuItems;
import FoodOrderingServicePackage.FoodOrderingService.service.MenuService;

@Path("/menu")
public class MenuResource {
	
	MenuService menu_service = new MenuService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Menu> getMenus(){
		return menu_service.getAllMenus();
	}
	
	@Path("/{menuId}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Menu getItemDetailsByName(@PathParam("menuId") long menuId){
		return menu_service.getMenu(menuId);
	}
	


}
