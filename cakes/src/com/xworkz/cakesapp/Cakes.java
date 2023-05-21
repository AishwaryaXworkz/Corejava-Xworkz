package com.xworkz.cakesapp;

public class Cakes {
   private int cakeId;
    private String color;
    private String shape;
    private String  flavour;
   private double price;

 public void setCakeId(int cakeId) {
  this.cakeId = cakeId;
 }

 public int getCakeId() {
  return cakeId;
 }

 public void setColor(String color) {
  this.color = color;
 }

 public String getColor() {
  return color;
 }

 public void setShape(String shape) {
  this.shape = shape;
 }
 public String getShape() {
  return shape;
 }
 public void setFlavour(String flavour) {
  this.flavour = flavour;
 }
 public String getFlavour() {
  return flavour;
 }
 public void setPrice(double price) {
  this.price = price;
 }
 public double getPrice() {
  return price;
 }
}
