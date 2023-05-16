package com.xworkz.cakeapp;
class Cake
{
    static String color;
    String shape;
    double price;
    String weight;
    String  flavour;

    public Cake()
    {
        System.out.println("list of cakes available");
    }
    public Cake(String color,String shape,double price,String flavour,String weight){
        System.out.println("Cake features");
        this.color=color;
        this.shape=shape;
        this.price=price;
        this.flavour=flavour;
        this.weight=weight;
    }
}
