package FoodOrderingServicePackage.FoodOrderingService.resources;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import FoodOrderingServicePackage.FoodOrderingService.model.MenuItems;
import FoodOrderingServicePackage.FoodOrderingService.model.Restaurant;
import FoodOrderingServicePackage.FoodOrderingService.service.MenuItemsService;

//@Path("/resturants/{resturantId}/menu/{menuId}/menuItems")
@Path("/menuItems")
public class MenuItemsResource {
	
	MenuItemsService menuItem_service = new MenuItemsService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<MenuItems> getMenuItems(){
		return menuItem_service.getMenuItems();
	}
	
	@Path("/{menuId}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public MenuItems getItemDetailsByName(@PathParam("menuId") long menuId){
		return menuItem_service.getMenuItem(menuId);
	}
	
	@POST
    public MenuItems addRestaurant(MenuItems item){
    	return menuItem_service.addMenuItem(item);
    }
    
//    @PUT
//    @Path("/{MenuItemName}")
//    public MenuItems updateRestaurant(@PathParam("MenuItemName") long restaurantName, Restaurant restaurant){
//    	restaurant.setRestaurant_name(restaurantName);
//    	return menuItem_service.updateRestaurant(restaurant);
//    }
    
    @DELETE
    @Path("/{MenuItemName}")
    public MenuItems removeMenuItems(@PathParam("MenuItemName") long id){
    	return menuItem_service.removeMenuItem(id);
    }
    

	

}
