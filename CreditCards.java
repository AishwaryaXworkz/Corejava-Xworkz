class CreditCards
{
static String[] cardNames={"Axis bank ACE credit card","flipkart axis bank credit card","axis bank neo credit card","axis bank my wings credit card","select credit card","vistara signature credit card","my zone credit card","magnus","reserve credit card","atlas credit card","airtel axis bank credit card","spicejet axis bank voyage black credit card","pride platinum credit card","aura credit card","indian oil axis bank credit card"};
public static void main(String creditCards[]){
System.out.println("main started");
getCardNames();
System.out.println("main ended");
}
public static void getCardNames()
{
System.out.println("calling getCardNames method ");
System.out.println("list of CardNames:");
for(int i=0;i<cardNames.length;i++)
{
System.out.println(cardNames[i]);
}
System.out.println("end of getCardNames method");
return;
} 
}