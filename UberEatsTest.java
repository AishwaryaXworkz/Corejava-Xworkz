class UberEatsTest
{
public  static void main(String uberEats[])
{
System.out.println("search method started");
String  itemName = "veg momos";
double  priceOfItem = UberEats.searchItem(itemName);
double  priceWithQuantity= UberEats.searchItem(itemName , 3);
System.out.println(" the price of " + itemName + " is " +priceOfItem);
System.out.println(" the price of " + itemName + " with quantity is " +priceWithQuantity);
System.out.println("search method ended");
}
}