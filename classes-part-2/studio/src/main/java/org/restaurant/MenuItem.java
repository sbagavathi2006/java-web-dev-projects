package org.restaurant;

import java.util.Date;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean isNew;
    // constructor for the class MenuItem
    public MenuItem(double p, String d, String c, boolean iN) {
        this.price = p;
        this.description = d;
        this.category = c;
        this.isNew = iN;
    }
    public boolean getIsNew(){ return isNew;}
    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public String getCategory(String category){ return category;}

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    @Override
    public String toString(){
        return "Price: "+price+"\nDescription: "+description+"\nCategory: "+category;
    }

    @Override
    public boolean equals(Object toBeCompared){
    if (toBeCompared == this){
        return true;
    }
    if (toBeCompared == null || toBeCompared.getClass()!=getClass()){
        return false;
    }
        MenuItem menuItem = (MenuItem) toBeCompared;
        //return isNew == menuItem.isNew;
        return Double.compare(menuItem.price, price) == 0 &&
                isNew == menuItem.isNew &&
                description.equals(menuItem.description) &&
                category.equals(menuItem.category);
    }
}

