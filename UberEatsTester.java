class UberEatsTester
{
public static void main(String uberEats[])
 {
System.out.println("Main method started");
String ordersName="Ketchup";
double price=UberEats.searchOrders(ordersName);
System.out.println(" the price of " +ordersName    +   "is"   + price);
System.out.println("Main method ended");
 }
}