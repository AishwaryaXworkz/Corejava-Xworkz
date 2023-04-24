class CreditCards
{
static String[] cardNames={"Axis bank ACE credit card","flipkart axis bank credit card","axis bank neo credit card","axis bank my wings credit card","select credit card","vistara signature credit card","my zone credit card","magnus","reserve credit card","atlas credit card","airtel axis bank credit card","spicejet axis bank voyage black credit card","pride platinum credit card","aura credit card","indian oil axis bank credit card"};
public static void main(String creditCards[]){
System.out.println("list of CreditCards are:");
System.out.println("1:"+cardNames[0] + "\n"+ "2:"+cardNames[1] + "\n"+ "3:"+cardNames[2] + "\n"+ "4:"+cardNames[3] + "\n"+ "5:"+cardNames[4] + "\n"+
                   "6:"+cardNames[5] + "\n"+  "7:"+cardNames[6] + "\n"+ "8:"+cardNames[7] + "\n"+  "9:"+cardNames[8] + "\n"+ "10:"+cardNames[9] + "\n"+ 
				   "11:"+cardNames[10] + "\n"+ "12:"+cardNames[11] + "\n"+ "13:"+cardNames[12] + "\n"+ "14:"+cardNames[13] + "\n"+ "15:"+cardNames[14]);
				 System.out.println("list of cardNames here:");
				 for(int index=0;index<=cardNames.length-1;index++)
				  { 
			  System.out.println(cardNames[index]); }					  
				   }
}