class FlipKartTester
{
public static void main(String flipKart[])
 {
System.out.println("Main method started");
String productsName="Mobile";
double price=FlipKart.searchProducts(productsName);
System.out.println(" the price of " + productsName    +   "is"   + price);
System.out.println("Main method ended");
 }
}