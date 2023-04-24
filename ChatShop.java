class ChatShop
{
static String[] chats={"Pani puri","samosa","Gobi","fried rice","masala","dhahee puri","veg roll","noodles","pizza","burger","french fries","sandwich","momos","pasta","vada pav"};
public static void main(String chatShop[]){
System.out.println("list of chats available:");
System.out.println("1:"+chats[0] + "\n"+ "2:"+chats[1] + "\n"+ "3:"+chats[2] + "\n"+ "4:"+chats[3] + "\n"+ "5:"+chats[4] + "\n"+
                   "6:"+chats[5] + "\n"+  "7:"+chats[6] + "\n"+ "8:"+chats[7] + "\n"+  "9:"+chats[8] + "\n"+ "10:"+chats[9] + "\n"+ 
				   "11:"+chats[10] + "\n"+ "12:"+chats[11] + "\n"+ "13:"+chats[12] + "\n"+ "14:"+chats[13] + "\n"+ "15:"+chats[14]);
				 System.out.println("list of chats available here:");
				 for(int index=0;index<=chats.length-1;index++)
				  { 
			  System.out.println(chats[index]); }					  
				   }
}