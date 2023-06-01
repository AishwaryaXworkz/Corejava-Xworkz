package com.xworkz.doorapp;

public class Door extends Wood{
    @Override
    public int toConstruct(){
        System.out.println("it is also used for furniture");
        return 1500;
    }

}
