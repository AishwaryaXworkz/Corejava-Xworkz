package com.xworkz.chatapp;
public class Chat {
    String chatNames[]=new String[5];
    int index;
    public  boolean addChat( String chatName) {
        boolean isAdded = false;
        if ( chatName != null && index < chatNames.length){
            chatNames[index++] = chatName;
            isAdded = true;
        }
            else
            {
                System.out.println("maximum chatname is exceed");
            }
            return isAdded;

        }


        public void getChatNames(){
            System.out.println("chatNames are available:");
       for(int index=0;index< chatNames.length;index++)
       {
           System.out.println(chatNames[index]);
       }
    }

}
