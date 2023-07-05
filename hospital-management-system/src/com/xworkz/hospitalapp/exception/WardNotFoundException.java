package com.xworkz.hospitalapp.exception;

public class WardNotFoundException extends RuntimeException{
    public WardNotFoundException(int wardNo){
        System.out.println(" ward not found " +wardNo);
    }
}
