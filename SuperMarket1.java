class SuperMarket1
{
static String[] chocolates={"Dairy milk","milky bar","hershey's","kisses","snickers","kitkat","dark chocolate","luvit","5 star","perk","shots","moments","hazelnut","almond treat","fabelle"};
public static void main(String superMarket1[]){
System.out.println("list of chocolates available:");
System.out.println("1:"+chocolates[0] + "\n"+ "2:"+chocolates[1] + "\n"+ "3:"+chocolates[2] + "\n"+ "4:"+chocolates[3] + "\n"+ "5:"+chocolates[4] + "\n"+
                   "6:"+chocolates[5] + "\n"+  "7:"+chocolates[6] + "\n"+ "8:"+chocolates[7] + "\n"+  "9:"+chocolates[8] + "\n"+ "10:"+chocolates[9] + "\n"+ 
				   "11:"+chocolates[10] + "\n"+ "12:"+chocolates[11] + "\n"+ "13:"+chocolates[12] + "\n"+ "14:"+chocolates[13] + "\n"+ "15:"+chocolates[14]);
				 System.out.println("list of chocolates available here:");
				 for(int index=0;index<=chocolates.length-1;index++)
				  { 
			  System.out.println(chocolates[index]); }					  
				   }
}