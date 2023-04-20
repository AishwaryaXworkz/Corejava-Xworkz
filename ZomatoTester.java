class ZomatoTester
{
public static void main(String zomato[])
 {
System.out.println("Main method started");
String itemName="chicken biryani";
double price=Zomato.searchItem(itemName);
System.out.println(" the price of " +  itemName   +   "is"   + price);
System.out.println("Main method ended");
 }
}