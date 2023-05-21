package com.xworkz.cakesapp;
import java.util.Scanner;
public class CakesTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter CakeId:");
        int cakeId=sc.nextInt();
        System.out.println("Enter Cake color:");
        String color= sc.next();
        System.out.println("Enter Cake shape:");
        String shape= sc.next();
        System.out.println("Enter Cake flavour:");
        String flavour= sc.next();
        System.out.println("Enter Cake price:");
        double price= sc.nextDouble();
        Cakes cakes=new Cakes();
        cakes.setCakeId(cakeId);
        cakes.setColor(color);
        cakes.setShape(shape);
        cakes.setFlavour(flavour);
        cakes.setPrice(price);
        System.out.println(cakes.getCakeId()+"\n"+cakes.getColor()+"\n"+cakes.getShape()+"\n"+cakes.getFlavour()+"\n"+cakes.getPrice());
    }
}
