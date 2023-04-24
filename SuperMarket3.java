class SuperMarket3
{
static String[] perfumes ={"tupil","secret","fogg","wild stone","magnet","wow","signature","engage","cobra","me","yardley","axe","jasmine","villain","premium"};
public static void main(String superMarket3[]){
System.out.println("list of perfumes available:");
System.out.println("1:"+perfumes[0] + "\n"+ "2:"+perfumes[1] + "\n"+ "3:"+perfumes[2] + "\n"+ "4:"+perfumes[3] + "\n"+ "5:"+perfumes[4] + "\n"+
                   "6:"+perfumes[5] + "\n"+  "7:"+perfumes[6] + "\n"+ "8:"+perfumes[7] + "\n"+  "9:"+perfumes[8] + "\n"+ "10:"+perfumes[9] + "\n"+ 
				   "11:"+perfumes[10] + "\n"+ "12:"+perfumes[11] + "\n"+ "13:"+perfumes[12] + "\n"+ "14:"+perfumes[13] + "\n"+ "15:"+perfumes[14]);
				 System.out.println("list of perfumes available here:");
				 for(int index=0;index<=perfumes.length-1;index++)
				  { 
			  System.out.println(perfumes[index]); }					  
				   }
}