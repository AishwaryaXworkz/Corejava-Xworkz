package com.xworkz.restaurantapp;
import java.util.Scanner;
public class RestaurantTester {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Restaurant restaurant=new Restaurant();
        for(int index=0;index<restaurant.menuNames.length;index++)
        {
            System.out.println("enter the menu names:");
            String itemName=sc.next();
            restaurant.addMenu(itemName);
        }
        restaurant.getMenuNames();
    }
}
