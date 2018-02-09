1.To run the REST API:
-Works on Java EE edition 
-Installed Apache Tomcat server to run API locally.
-Installed Jersey(JAX-RS) libraries and other dependencies using Maven to build REST API in Java.

2. REST Operations and the Resources
GET Operations (Implemented)
To get all restaurants name /restaurants
To get one restaurant detail /restaurants/{restaurant_name}

3. FUTURE GETs That can be implemented
To get available menus in restaurants /restaurants/{restaurant_name}/menus
To get available menu items for a menu /restaurants/{restaurant_name}/menus/menuItems
To get information about the menuItem /restaurants/{restaurant_name}/menus/menuItems/menuItem

4. POST Operations  (Implemented)
To add new restaurants /restaurants
To add new menu details /menu
To add menu Items /menuItems

5. DELETE Operations  (Implemented)
To delete existing restaurants /restaurants
To delete existing menu details /menu
To delete existing Items /menuItems

6. Local Inmemory Db
The current “DatabaseClass” uses in-memory Hash Map. I am working towards creating dynamoDB Local instance. 

PUT Operations  (Intented to implement)
To update restaurant details  /restaurants
To update menu details /menu
To update menuItems  /menuItems

7. To  get dynamoDB locally:
Added dynamoDB Maven repositories to the applictaion’s POM file.
Go to Maven-> update project
It will start building workspace.

8. Why dynamodb?
In my implementation various resources like restaurants, menus, menu items can be linked together. This is by using the Following relationship -> Every resurant has Menus. Every Menu has Menu items. 
I realised that in order to build the restaurants page i did not need to use a relational table though. These items could be stored separately in Maps. Since there was no need for a relational store, I could use a Dynamo Db table to represet a Resturant, a Menu, and a Menu Item. 
Since all the  reads will happen page wise, the hash keys would be - 
For Resturant table - Hash- RestruantId (it could be a long id, or a unique resturant name)
For Menu table - Hash - MenuId (like lunch, dinner, appetizers, drinks). I could additionally build a rangekey that uses a restaurant and Menu together. 
And the Menuitem would be similar to the menu table. 

Since the reads are going to be by key, they would be fast and will scale horizontally 

I was part way implementing the createResturantTable function. But i found myself short on time. I followed the AWSdocumentation to get a DynamoDbLocal version. 





