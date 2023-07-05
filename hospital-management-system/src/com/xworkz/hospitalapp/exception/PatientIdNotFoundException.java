package com.xworkz.hospitalapp.exception;

public class PatientIdNotFoundException extends RuntimeException{
    public PatientIdNotFoundException(int patientId){
        System.out.println("patientId not found "+patientId);

    }
}
