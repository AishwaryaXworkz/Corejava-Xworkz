package com.xworkz.patientsapp;

public class Patients {
    int patientId;
    String name;
    int age;
    long phoneNumber;
    boolean isInsuranceAvailable;
    String attenderName;
    String bloodGroup;
    String diseaseName;

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setInsuranceAvailable(boolean insuranceAvailable) {
        isInsuranceAvailable = insuranceAvailable;
    }

    public boolean getInsuranceAvailable() {
        return isInsuranceAvailable;
    }

    public void setAttenderName(String attenderName) {
        this.attenderName = attenderName;
    }

    public String getAttenderName() {
        return attenderName;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public String getDiseaseName() {
        return diseaseName;
    }
}
