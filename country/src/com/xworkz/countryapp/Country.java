package com.xworkz.countryapp;

public class Country {
  private int countryId;
   private String  countryCode;
   private String countryName;
   private int  noOfStates;
   private double population;
   private String currency;
   private String capital;
   private String  economy;

 public void setCountryId(int countryId) {
  this.countryId = countryId;
 }
 public int getCountryId() {
  return countryId;
 }
 public void setCountryCode(String countryCode) {
  this.countryCode = countryCode;
 }

 public String getCountryCode() {
  return countryCode;
 }
 public void setCountryName(String countryName) {
  this.countryName = countryName;
 }
 public String getCountryName() {
  return countryName;
 }
 public void setNoOfStates(int noOfStates) {
  this.noOfStates = noOfStates;
 }
 public int getNoOfStates() {
  return noOfStates;
 }
 public void setPopulation(double population) {
  this.population = population;
 }
 public double getPopulation() {
  return population;
 }
 public void setCurrency(String currency) {
  this.currency = currency;
 }
 public String getCurrency() {
  return currency;
 }
 public void setCapital(String capital) {
  this.capital = capital;
 }
 public String getCapital() {
  return capital;
 }
 public void setEconomy(String economy) {
  this.economy = economy;
 }
 public String getEconomy() {
  return economy;
 }
}
