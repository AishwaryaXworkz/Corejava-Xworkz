package com.xworkz.hospitalapp.exception;

public class DiseaseNotFoundException extends RuntimeException {
    public DiseaseNotFoundException(String diseaseName) {
        System.out.println("disease name not found " + diseaseName);
    }
}