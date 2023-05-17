package com.xworkz.restaurantapp;

public class Restaurant {
    String menuNames[]=new String[5];
    int index;
    public boolean addMenu(String itemName){
        boolean isAdded=false;
        if(itemName!=null && index< menuNames.length){
            menuNames[index++]=itemName;
            isAdded=true;
        }
        else {
            System.out.println("maximum menunames is exceed");
        }
        return isAdded;
    }
    public void getMenuNames(){
        System.out.println("menunames are available:");
        for(int index=0;index< menuNames.length;index++)
        {
            System.out.println(menuNames[index]);
        }
    }
}
