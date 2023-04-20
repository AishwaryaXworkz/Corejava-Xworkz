class SwiggyTester
{
public static void main(String swiggy[])
 {
System.out.println("Main method started");
String dishesName="Chilli Corn Soup";
double price=Swiggy.searchDishes(dishesName);
System.out.println(" the price of " + dishesName    +   "is"   + price);
System.out.println("Main method ended");
 }
}