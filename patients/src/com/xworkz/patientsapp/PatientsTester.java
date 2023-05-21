package com.xworkz.patientsapp;
import java.util.Scanner;
public class PatientsTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the patientId:");
        int patientId = sc.nextInt();
        System.out.println("Enter the name:");
        String name = sc.next();
        System.out.println("Enter the age:");
        int age = sc.nextInt();
        System.out.println("Enter the phonenumber:");
        long phoneNumber = sc.nextLong();
        System.out.println("Enter the isInsuranceAvailable:");
        boolean isInsuranceAvailable = sc.nextBoolean();
        System.out.println("Enter the attendername:");
        String attenderName = sc.next();
        System.out.println("Enter the bloodgroup:");
        String bloodGroup = sc.next();
        System.out.println("Enter the diseasename:");
        String diseaseName = sc.next();
        Patients patients = new Patients();
        patients.setPatientId(patientId);
        patients.setName(name);
        patients.setAge(age);
        patients.setPhoneNumber(phoneNumber);
        patients.setInsuranceAvailable(isInsuranceAvailable);
        patients.setAttenderName(attenderName);
        patients.setBloodGroup(bloodGroup);
        patients.setDiseaseName(diseaseName);
        System.out.println(patients.getPatientId() + "\n" + patients.getName() + "\n" + patients.getAge() + "\n" + patients.getPhoneNumber() + "\n" + patients.getInsuranceAvailable() + "\n" + patients.getAttenderName() + "\n" + patients.getBloodGroup() + "\n" + patients.getDiseaseName());
    }
}