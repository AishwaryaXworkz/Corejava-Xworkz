class FlipCartTest
{
public  static void main(String flipCart[])
{
System.out.println("search method started");
String  productName = "watch";
double  priceOfItem = FlipCart.searchItem(productName);
double  priceWithQuantity = FlipCart.searchItem(productName  ,2);
System.out.println(" the price of " + productName + " is " +priceOfItem);
System.out.println(" the price of " + productName + " with quantity  is " +priceWithQuantity);
System.out.println("search method ended");
}
}