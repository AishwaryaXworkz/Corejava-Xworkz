package com.xworkz.mobileshopapp;

public class MobileShop {
    String mobileShopNames[]=new String[5];
    int index;
    public boolean addShop(String mobileName){
        boolean isAdded=false;
        if(mobileName!=null && index< mobileShopNames.length){
            mobileShopNames[index++]=mobileName;
            isAdded=true;
        }
        else
        {
            System.out.println("maximum mobileshopname is exceed");
        }
        return isAdded;
    }
    public void getMobileShopNames()
    {
        System.out.println("mobilenames are available:");
        for(int index=0;index< mobileShopNames.length;index++)
        {
            System.out.println(mobileShopNames[index]);
        }

    }
}
