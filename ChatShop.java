class ChatShop
{
     static String[] chats={"Pani puri","samosa","Gobi","fried rice","masala","dhahee puri","veg roll","noodles","pizza","burger","french fries","sandwich","momos","pasta","vada pav"};
       public static void main(String chatShop[])
	   {
          System.out.println("main started");
               getChats();
			    
          System.out.println("main ended");
       }

        public static void getChats()
       {
          System.out.println("calling getChats method ");
          System.out.println("list of chats:");
           for(int i=0;i<chats.length;i++)
           {
             System.out.println(chats[i]);
           }
         System.out.println("end of getChats method");
        return;
       } 
}