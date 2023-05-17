package com.xworkz.orionmallapp;
import java.util.Scanner;
public class OrionMallTester {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        OrionMall orion=new OrionMall();
        for(int index=0;index<orion.shopNames.length;index++)
        {
            System.out.println("enter the shop names:");
            String shopName=sc.next();
            orion.addShop(shopName);
        }
        orion.getShopNames();
    }
}
