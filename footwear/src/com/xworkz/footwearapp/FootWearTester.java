package com.xworkz.footwearapp;
import java.util.Scanner;
public class FootWearTester {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the footwearid:");
        int footWearId=sc.nextInt();
        System.out.println("enter the brandname:");
        String brandName=sc.next();
        System.out.println("enter the footwear Size:");
        int size=sc.nextInt();
        System.out.println("enter the footwear type:");
        String type= sc.next();
        System.out.println("enter the footwear price:");
        String price=sc.next();
        System.out.println("enter the footwear materialType:");
        String materialType=sc.next();
        FootWear footwear=new FootWear();
        footwear.setFootWearId(footWearId);
        footwear.setBrandName(brandName);
        footwear.setSize(size);
        footwear.setType(type);
        footwear.setPrice(price);
        footwear.setMaterialType(materialType);
        System.out.println(footwear.getFootWearId()+"\n"+footwear.getBrandName()+"\n"+footwear.getSize()+"\n"+footwear.getType()+"\n"+footwear.getPrice()+"\n"+footwear.getMaterialType());
    }

}
