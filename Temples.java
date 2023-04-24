class Temples
{
static String[] godNames={"ganesha","jesus","lakshmi","lord shiva","madesha","lord vishnu","venkateshwara","basaveshwara","mallikarjuna","kedarnath","vaidyanath","ramanathaswamy","ghrushneshwar","mahankal","nageshwara"};
public static void main(String temples[]){
System.out.println("list of godNames are:");
System.out.println("1:"+godNames[0] + "\n"+ "2:"+godNames[1] + "\n"+ "3:"+godNames[2] + "\n"+ "4:"+godNames[3] + "\n"+ "5:"+godNames[4] + "\n"+
                   "6:"+godNames[5] + "\n"+  "7:"+godNames[6] + "\n"+ "8:"+godNames[7] + "\n"+  "9:"+godNames[8] + "\n"+ "10:"+godNames[9] + "\n"+ 
				   "11:"+godNames[10] + "\n"+ "12:"+godNames[11] + "\n"+ "13:"+godNames[12] + "\n"+ "14:"+godNames[13] + "\n"+ "15:"+godNames[14]);
				 System.out.println("list of godNames here:");
				 for(int index=0;index<=godNames.length-1;index++)
				  { 
			  System.out.println(godNames[index]); }					  
				   }
}