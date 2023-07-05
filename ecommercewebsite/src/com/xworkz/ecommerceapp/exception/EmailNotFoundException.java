package com.xworkz.ecommerceapp.exception;

public class EmailNotFoundException extends RuntimeException{
    public EmailNotFoundException(int id,String emailId){
        System.out.println(" email not found " + id +"\n" + emailId +"\n");
    }
}
