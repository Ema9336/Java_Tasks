package jd_tasks_11;

//Create a class named LocalRestaurant with a main method:
//	Create a Restaurant object
//	Create an array of servers and chefs with their information set
//	Add the initial servers and chefs to the respective ArrayLists in the Restaurant object
//	Print the whole restaurant's information


import java.util.ArrayList;
import java.util.Arrays;
public class LocalRestaurant {
    public static void main(String[] args) {

        Restaurant restaurant1 = new Restaurant("Petey Bundt","1 Circuit Ave",5);

        Server server1 = new Server("Ema Jovanova",936,50.00,true);
        Server server2 = new Server("Josip Odk",222,50.00,false);

        Server[] servers = {server1, server2};

        Chef chef1 = new Chef("Ratko Mitev", 1209,60,true);
        Chef chef2 = new Chef("Jimmy Alvado",2326,70,false);
        Chef [] chefs = {chef1, chef2};

        restaurant1.hireServer(servers);
        restaurant1.hireChef(chefs);
        System.out.println(Arrays.toString(chefs));
        System.out.println(Arrays.toString(servers));
        System.out.println(restaurant1);
        chef1.washDishes();
        chef1.makeOrder();

    }
}
