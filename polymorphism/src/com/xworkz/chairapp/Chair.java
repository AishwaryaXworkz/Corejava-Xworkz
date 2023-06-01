package com.xworkz.chairapp;

public class Chair extends Plastic {
    @Override
    public double toSit(){
        System.out.println("To provide support for the seated persons body and arms");
        return 700.00;
    }
}
