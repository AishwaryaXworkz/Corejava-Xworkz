package com.xworkz.polymorphismapp;

public class ParentTester {
    public static void main(String[] args) {
        Parent parent=new Child();
        double revenue=parent.business();
        System.out.println(revenue);
    }
}
