package FoodOrderingServicePackage.FoodOrderingService.database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.local.embedded.DynamoDBEmbedded;
import com.amazonaws.services.dynamodbv2.model.AttributeDefinition;
import com.amazonaws.services.dynamodbv2.model.CreateTableRequest;
import com.amazonaws.services.dynamodbv2.model.CreateTableResult;
import com.amazonaws.services.dynamodbv2.model.KeySchemaElement;
import com.amazonaws.services.dynamodbv2.model.KeyType;
import com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput;
import com.amazonaws.services.dynamodbv2.model.ScalarAttributeType;

import FoodOrderingServicePackage.FoodOrderingService.model.Menu;
import FoodOrderingServicePackage.FoodOrderingService.model.MenuItems;
import FoodOrderingServicePackage.FoodOrderingService.model.Restaurant;

public class DatabaseClass {
	
	private static Map<String,Restaurant> restaurants = new HashMap<String,Restaurant>();
	private static Map<Long,MenuItems> menuItems = new HashMap<Long, MenuItems>();
	private static Map<Long,Menu> menus = new HashMap<Long,Menu>();
	private static AmazonDynamoDB db = DynamoDBEmbedded.create().amazonDynamoDB();

	
	public static Map<String, Restaurant> getRestaurants(){
		return restaurants;
	}
	
	public static Map<Long, MenuItems> getMenuItems(){
		return menuItems;
	}
	
	public static Map<Long, Menu> getMenus(){
		return menus;
	}
	
	private static CreateTableResult createResturants(String tableName, String hashKeyName) {
        List<AttributeDefinition> attributeDefinitions = new ArrayList<AttributeDefinition>();
        attributeDefinitions.add(new AttributeDefinition(hashKeyName, ScalarAttributeType.N));

        List<KeySchemaElement> ks = new ArrayList<KeySchemaElement>();
        ks.add(new KeySchemaElement(hashKeyName, KeyType.HASH));

        ProvisionedThroughput provisionedthroughput = new ProvisionedThroughput(1000L, 1000L);

        CreateTableRequest request =
            new CreateTableRequest()
                .withTableName(tableName)
                .withAttributeDefinitions(attributeDefinitions)
                .withKeySchema(ks)
                .withProvisionedThroughput(provisionedthroughput);

        return db.createTable(request);
	}
}
