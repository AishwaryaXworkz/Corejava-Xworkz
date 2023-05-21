package com.xworkz.countryapp;
import java.util.Scanner;
public class CountryTester {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter countryId:");
        int countryId= sc.nextInt();
        System.out.println("Enter countryCode:");
        String countryCode= sc.next();
        System.out.println("Enter countryName:");
        String countryName=sc.next();
        System.out.println("Enter number of states:");
        int  noOfStates= sc.nextInt();
        System.out.println("Enter population:");
        double population= sc.nextDouble();
        System.out.println("Enter currency:");
        String currency= sc.next();
        System.out.println("Enter capital:");
        String capital= sc.next();
        System.out.println("Enter economy:");
        String economy= sc.next();
        Country country=new Country();
        country.setCountryId(countryId);
        country.setCountryCode(countryCode);
        country.setCountryName(countryName);
        country.setNoOfStates(noOfStates);
        country.setPopulation(population);
        country.setCurrency(currency);
        country.setCapital(capital);
        country.setEconomy(economy);
        System.out.println(country.getCountryId()+"\n"+country.getCountryCode()+"\n"+country.getCountryName()+"\n"+country.getNoOfStates()+"\n"+country.getPopulation()+"\n"+country.getCurrency()+"\n"+country.getCapital()+"\n"+country.getEconomy());
    }
}
