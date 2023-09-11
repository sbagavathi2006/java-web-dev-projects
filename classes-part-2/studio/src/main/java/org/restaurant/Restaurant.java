package org.restaurant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Restaurant {

    public static void main(String[] args) {
        // object created for MenuItem
        MenuItem item = new MenuItem(12.75f , "Biryani" ,"Main" ,true);
        MenuItem item1 = new MenuItem(8.50 ,"Chicken Biryani" ,"Starter", false);
        MenuItem item2 = new MenuItem(12.75f , "Gulabjamun" ,"Dessert" ,true);
//        MenuItem item3 = new MenuItem(10.50 ,"Paratha" ,"Main", true);
        //Constructor created
        ArrayList<MenuItem> Items = new ArrayList<>();
        Menu menu=new Menu(new Date(), Items);
        menu.addItem(item);
        menu.addItem(item1);
        menu.addItem(item2);

        //        menu.addItem(item3);
        menu.removeItem(item);
        menu.printMenu();
        System.out.println("is item and item1 are equal? ");
        System.out.println(item.equals(item1));
    }
}
