package org.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;
    // constructor for the class Menu
    public Menu(Date d,ArrayList<MenuItem> i) {
        this.lastUpdated =d;
        this.items = i;
    }
    //MenuItem menuItem = new MenuItem(double P, String Des, String C, boolean IN);
      // create addItem method
    public void addItem(MenuItem item){
        items.add(item);
    }

    public void removeItem(MenuItem item){
        items.remove(item);
    }

    //Check isNew true
    public void newItemCheck(MenuItem item){

        if(item.equals(new MenuItem(0,null,null,true))){
        //if(items.get(2).equals(true)){
            System.out.println("New Item\n");
        }else {
            System.out.println("\n");
        }
    }
    public void printMenu(){
        System.out.println("MENU ITEMS");
        System.out.println("Menu last updated on: "+getLastUpdated()+"\n");
        for (MenuItem i:items ){
            System.out.println(i);
            newItemCheck(i);
        }
    }
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }


}


