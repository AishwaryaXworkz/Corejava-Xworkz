class SuperMarket
{
static String[] groceries={"grains","bread","oil","fat","dairy","eggs","vegetables","fruits","seeds","nuts","condiments","honey","vinegar","sugar","cheese"};
public static void main(String superMarket[]){
System.out.println("list of items available:");
System.out.println("1:"+groceries[0] + "\n"+ "2:"+groceries[1] + "\n"+ "3:"+groceries[2] + "\n"+ "4:"+groceries[3] + "\n"+ "5:"+groceries[4] + "\n"+
                   "6:"+groceries[5] + "\n"+  "7:"+groceries[6] + "\n"+ "8:"+groceries[7] + "\n"+  "9:"+groceries[8] + "\n"+ "10:"+groceries[9] + "\n"+ 
				   "11:"+groceries[10] + "\n"+ "12:"+groceries[11] + "\n"+ "13:"+groceries[12] + "\n"+ "14:"+groceries[13] + "\n"+ "15:"+groceries[14]);
				 System.out.println("list of items available here:");
				 for(int index=0;index<=groceries.length-1;index++)
				  { 
			  System.out.println(groceries[index]); }					  
				   }
}