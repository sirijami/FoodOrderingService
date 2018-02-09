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
    @Path("/{restaurantName}")
    @Produces(MediaType.APPLICATION_JSON)
    public Restaurant getRestaurant(@PathParam("restaurantName") String restaurantName){
    	return res_service.getRestaurant(restaurantName);
    }
    
    
    @POST
    public Restaurant addRestaurant(Restaurant new_restautant){
    	return res_service.addRestaurant(new_restautant);
    }
    
    @PUT
    @Path("/{restaurantName}")
    public Restaurant updateRestaurant(@PathParam("restaurantName") String restaurantName, Restaurant restaurant){
    	restaurant.setRestaurant_name(restaurantName);
    	return res_service.updateRestaurant(restaurant);
    }
    
    @DELETE
    @Path("/{restaurantName}")
    public Restaurant removeRestaurant(@PathParam("restaurantName") String restaurant){
    	return res_service.removeRestaurant(restaurant);
    }
    


}
