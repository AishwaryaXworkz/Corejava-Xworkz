package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.patient.Patient;

public class SparshHospitalImpl implements Hospital {

    Patient patient[] = new Patient[15];
    int index;

    @Override
    public boolean addPatient(Patient patient) {
        System.out.println("invoked addPatient method ");
        boolean isAdded = false;
        if (patient != null) {
            System.out.println("Patient check is completed ....proceed to add patient");
            if (patient.getName()!=null && !patient.getName().isEmpty() && patient.getBloodGroup()!= null && !patient.getBloodGroup().isEmpty())
            {
                this.patient[index] = patient;
            index++;
            isAdded=true;
            System.out.println("patient name is added successfully");
        } else {
        System.out.println("Patient name is exceeded");
        }
    }
        else{
    System.out.println("there is no patient any more");
    }
        return isAdded;
}
    @Override
    public void getAllPatients() {
    System.out.println("invoked getall patients");
    System.out.println("list of patients are:");
    for(Patient pat:this.patient){
        System.out.println(pat);
    }
    }
}

