package com.xworkz.mobileshopapp;
import java.util.Scanner;
public class MobileShopTester {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        MobileShop mobileshop=new MobileShop();
        for(int index=0;index<mobileshop.mobileShopNames.length;index++)
        {
            System.out.println("enter the mobileshop names:");
            String mobileshopnames= sc.next();
            mobileshop.addShop(mobileshopnames);
        }
        mobileshop.getMobileShopNames();
    }
}
