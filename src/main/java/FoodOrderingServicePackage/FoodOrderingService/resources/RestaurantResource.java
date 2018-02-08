package FoodOrderingServicePackage.FoodOrderingService.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import FoodOrderingServicePackage.FoodOrderingService.model.Restaurant;
import FoodOrderingServicePackage.FoodOrderingService.service.RestaurantService;


@Path("/restaurants")
public class RestaurantResource {
	
    RestaurantService res_service = new RestaurantService();
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Restaurant> getRestaurants(){
    	return res_service.getAllRestaurants();
    }
    
    @GET
    @Path("/{restaurantId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Restaurant test(@PathParam("restaurantId") long restaurantId){
    	return res_service.getRestaurant(restaurantId);
    }
    

    
    


}
