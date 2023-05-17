package com.xworkz.orionmallapp;

public class OrionMall {
    String shopNames[]=new String[4];
    int index;
    public boolean addShop(String shopName){
        boolean isAdded=false;
        if(shopName!=null && index <shopNames.length){
            shopNames[index++]=shopName;
            isAdded=true;
        }
        else
        {
            System.out.println("maximum shopnames is exceed");
        }
        return isAdded;
    }
    public void getShopNames(){
        System.out.println("shopnames are available");
        for(int index=0;index<shopNames.length;index++)
        {
            System.out.println(shopNames[index]);
        }
    }
}
