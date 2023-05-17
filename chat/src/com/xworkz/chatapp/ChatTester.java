package com.xworkz.chatapp;
import java.util.Scanner;
public class ChatTester {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
                Chat chat =new Chat();
        for(int index=0;index<chat.chatNames.length;index++)
        {
            System.out.println("enter the chat names:");
            String chatName=sc.next();
            chat.addChat(chatName);
        }
        chat.getChatNames();
    }
}
