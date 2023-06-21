package com.xworkz.hospitalapp;

import com.xworkz.hospitalapp.constant.Gender;
import com.xworkz.hospitalapp.constant.GovtId;
import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.hospital.SparshHospitalImpl;
import com.xworkz.hospitalapp.patient.Patient;

public class Tester {
    public static void main(String[] args) {
        Hospital hospital=new SparshHospitalImpl();


        Patient patient=new Patient();
        patient.setPatientId(1);
        patient.setName("Ganavi");
        patient.setAge(23);
        patient.setPhoneNumber(9066404341l);
        patient.setInsuranceAvailable(true);
        patient.setAttenderName("savitramma");
        patient.setBloodGroup("ab+ve");
        patient.setDiseaseName("headache");
        patient.setGender(Gender.FEMALE);
        patient.setGovtId(GovtId.DL);
        hospital.addPatient(patient);


        Patient patient1=new Patient();
        patient1.setPatientId(2);
        patient1.setName("Aishu");
        patient1.setAge(22);
        patient1.setPhoneNumber(9740322295l);
        patient1.setInsuranceAvailable(true);
        patient1.setAttenderName("girijamma");
        patient1.setBloodGroup("o+ve");
        patient1.setDiseaseName("cold");
        patient1.setGender(Gender.FEMALE);
        patient1.setGovtId(GovtId.PAN);
        hospital.addPatient(patient1);


        Patient patient2=new Patient();
        patient2.setPatientId(3);
        patient2.setName("Mahadev");
        patient2.setAge(20);
        patient2.setPhoneNumber(9986968578l);
        patient2.setInsuranceAvailable(true);
        patient2.setAttenderName("pavitra");
        patient2.setBloodGroup("b+ve");
        patient2.setDiseaseName("fever");
        patient2.setGender(Gender.MALE);
        patient2.setGovtId(GovtId.AADHAAR);
        hospital.addPatient(patient2);


        Patient patient3=new Patient();
        patient3.setPatientId(4);
        patient3.setName("xyz");
        patient3.setAge(15);
        patient3.setPhoneNumber(123456789l);
        patient3.setInsuranceAvailable(true);
        patient3.setAttenderName("savitha");
        patient3.setBloodGroup("b-ve");
        patient3.setDiseaseName("high fever");
        patient3.setGender(Gender.TRANSGENDER);
        patient3.setGovtId(GovtId.AADHAAR);
        hospital.addPatient(patient3);

        Patient patient4=new Patient();
        patient4.setPatientId(5);
        patient4.setName("sushuu");
        patient4.setAge(28);
        patient4.setPhoneNumber(9499339492l);
        patient4.setInsuranceAvailable(true);
        patient4.setAttenderName("aradhana");
        patient4.setBloodGroup("o+ve");
        patient4.setDiseaseName("high fever");
        patient4.setGender(Gender.FEMALE);
        patient4.setGovtId(GovtId.DL);
        hospital.addPatient(patient4);

        Patient patient5=new Patient();
        patient5.setPatientId(6);
        patient5.setName("santhu");
        patient5.setAge(30);
        patient5.setPhoneNumber(7349466841l);
        patient5.setInsuranceAvailable(true);
        patient5.setAttenderName("suja");
        patient5.setBloodGroup("ab+ve");
        patient5.setDiseaseName("heavy headache");
        patient5.setGender(Gender.MALE);
        patient5.setGovtId(GovtId.PAN);
        hospital.addPatient(patient5);

        Patient patient6=new Patient();
        patient6.setPatientId(7);
        patient6.setName("sahana");
        patient6.setAge(32);
        patient6.setPhoneNumber(47376477737l);
        patient6.setInsuranceAvailable(true);
        patient6.setAttenderName("guruamma");
        patient6.setBloodGroup("ab-ve");
        patient6.setDiseaseName("leg pain");
        patient6.setGender(Gender.FEMALE);
        patient6.setGovtId(GovtId.DL);
        hospital.addPatient(patient6);

        Patient patient7=new Patient();
        patient7.setPatientId(8);
        patient7.setName("sam");
        patient7.setAge(35);
        patient7.setPhoneNumber(5886875664l);
        patient7.setInsuranceAvailable(true);
        patient7.setAttenderName("narsamma");
        patient7.setBloodGroup("o+ve");
        patient7.setDiseaseName("hand pain");
        patient7.setGender(Gender.FEMALE);
        patient7.setGovtId(GovtId.DL);
        hospital.addPatient(patient7);

        Patient patient8=new Patient();
        patient8.setPatientId(9);
        patient8.setName("darshan");
        patient8.setAge(36);
        patient8.setPhoneNumber(747664737633l);
        patient8.setInsuranceAvailable(true);
        patient8.setAttenderName("avallamma");
        patient8.setBloodGroup("ab+ve");
        patient8.setDiseaseName(" low headache");
        patient8.setGender(Gender.FEMALE);
        patient8.setGovtId(GovtId.AADHAAR);
        hospital.addPatient(patient8);

        Patient patient9=new Patient();
        patient9.setPatientId(10);
        patient9.setName("karan");
        patient9.setAge(50);
        patient9.setPhoneNumber(9986968578l);
        patient9.setInsuranceAvailable(true);
        patient9.setAttenderName("gangaamma");
        patient9.setBloodGroup("ab+ve");
        patient9.setDiseaseName("heavy leg pain");
        patient9.setGender(Gender.MALE);
        patient9.setGovtId(GovtId.DL);
        hospital.addPatient(patient9);

        Patient patient10=new Patient();
        patient10.setPatientId(11);
        patient10.setName("Guna");
        patient10.setAge(60);
        patient10.setPhoneNumber(9066404341l);
        patient10.setInsuranceAvailable(true);
        patient10.setAttenderName("savitramma");
        patient10.setBloodGroup("ab+ve");
        patient10.setDiseaseName("headache");
        patient10.setGender(Gender.FEMALE);
        patient10.setGovtId(GovtId.DL);
        hospital.addPatient(patient10);

        Patient patient11=new Patient();
        patient11.setPatientId(12);
        patient11.setName("ABC");
        patient11.setAge(80);
        patient11.setPhoneNumber(9066404341l);
        patient11.setInsuranceAvailable(true);
        patient11.setAttenderName("savitramma");
        patient11.setBloodGroup("ab+ve");
        patient11.setDiseaseName("viral fever");
        patient11.setGender(Gender.LGBT);
        patient11.setGovtId(GovtId.DL);
        hospital.addPatient(patient11);

        Patient patient12=new Patient();
        patient12.setPatientId(13);
        patient12.setName("PQR");
        patient12.setAge(90);
        patient12.setPhoneNumber(9066404341l);
        patient12.setInsuranceAvailable(true);
        patient12.setAttenderName("thungaa");
        patient12.setBloodGroup("b+ve");
        patient12.setDiseaseName("dianguu");
        patient12.setGender(Gender.TRANSGENDER);
        patient12.setGovtId(GovtId.DL);
        hospital.addPatient(patient12);

        Patient patient13=new Patient();
        patient13.setPatientId(14);
        patient13.setName("amya");
        patient13.setAge(25);
        patient13.setPhoneNumber(82480222951l);
        patient13.setInsuranceAvailable(true);
        patient13.setAttenderName("vanitha");
        patient13.setBloodGroup("ab-ve");
        patient13.setDiseaseName("corona");
        patient13.setGender(Gender.FEMALE);
        patient13.setGovtId(GovtId.PAN);
        hospital.addPatient(patient13);

        Patient patient14=new Patient();
        patient14.setPatientId(15);
        patient14.setName("aithi");
        patient14.setAge(34);
        patient14.setPhoneNumber(9740322295l);
        patient14.setInsuranceAvailable(true);
        patient14.setAttenderName("mangaamma");
        patient14.setBloodGroup("o+ve");
        patient14.setDiseaseName("no disease name");
        patient14.setGender(Gender.FEMALE);
        patient14.setGovtId(GovtId.AADHAAR);
        hospital.addPatient(patient14);


        hospital.getAllPatients();



    }
}
