package com.xworkz.hospitalapp;

import com.xworkz.hospitalapp.location.*;
import com.xworkz.hospitalapp.constant.Gender;
import com.xworkz.hospitalapp.constant.GovtId;
import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.hospital.SparshHospitalImpl;
import com.xworkz.hospitalapp.patient.Patient;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.println("main is invoked");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the patient details to be added");
        int size = sc.nextInt();
        Hospital hospital = new SparshHospitalImpl(size);

        for (int patientIndex = 0; patientIndex < size; patientIndex++) {
            Patient patient = new Patient();
            System.out.println("enter the patient ID");
            patient.setPatientId(sc.nextInt());
            System.out.println("enter the patient name");
            patient.setName(sc.next());
            System.out.println("enter the patient age");
            patient.setAge(sc.nextInt());
            System.out.println("enter the patient phonenumber");
            patient.setPhoneNumber(sc.nextLong());
            System.out.println("enter the patient isinsurance available");
            patient.setInsuranceAvailable(sc.nextBoolean());
            System.out.println("enter the patient attendername");
            patient.setAttenderName(sc.next());
            System.out.println("enter the patient bloodgroup");
            patient.setBloodGroup(sc.next());
            System.out.println("enter the patient diseasename");
            patient.setDiseaseName(sc.next());
            System.out.println("enter the patient gender");
            patient.setGender(Gender.valueOf(sc.next()));
            System.out.println("enter the patient govtid");
            patient.setGovtId(GovtId.valueOf(sc.next()));
            System.out.println("enter the patient wardnumber");
            patient.setWardNo(sc.nextInt());

            Streets streets = new Streets();
            System.out.println("Enter street name: ");
            streets.setStreetsName(sc.next());

            Area area = new Area();
            System.out.println("Enter area name: ");
            area.setAreaName(sc.next());
            area.setStreets(streets);

            City city = new City();
            System.out.println("Enter city name: ");
            city.setCityName(sc.next());
            city.setArea(area);

            State state = new State();
            System.out.println("Enter state name: ");
            state.setStateName(sc.next());
            state.setCity(city);

            Country country = new Country();
            System.out.println("Enter country name: ");
            country.setCountryName(sc.next());
            country.setState(state);

            Address1 address = new Address1();
            address.setCountry(country);

            patient.setAddress1(address);

            hospital.addPatient(patient);

            String text=null;
            do{
                System.out.println("1.get all patients info");
                System.out.println("2.get patientname by wardnumber");
                System.out.println("3.get patientname by disease name");
                System.out.println("4.get patient updated disease name");
                System.out.println("5.get patientupdated wardno by patientid");
                System.out.println("6.get patient updated age");
                System.out.println("7.get patient id");
                System.out.println("8.get patient attender name");
                System.out.println("9.get street name");
                System.out.println("10.get patient by address");
                int option= sc.nextInt();
                switch (option){
                    case 1:
                        System.out.println("the list of patients are");
                        hospital.getAllPatients();
                        break;

                    case 2:
                        System.out.println("enter the patient wardnumber");
                        hospital.getPatientNameByWard(sc.nextInt());
                        break;

                    case 3:
                        System.out.println("enter the patient disease name");
                        hospital.getPatientNameByDiseaseName(sc.next());
                        break;

                    case 4:
                        System.out.println("enter the patient updated disease name");
                        hospital.updatePatientDiseaseByPatientName(sc.next(), sc.next());
                        break;

                    case 5:
                        System.out.println("enter the patient updated wardno");
                        hospital.updatePatientWardNoByPatientId(sc.nextInt(), sc.nextInt());
                        break;

                    case 6:
                        System.out.println("enter the patient updated age");
                        hospital.updatePatientsAgeByPatientId(sc.nextInt(), sc.nextInt());
                        break;

                    case 7:
                        System.out.println("enter the patient id");
                        hospital.getPatientById(sc.nextInt());
                        break;

                    case 8:
                        System.out.println("enter the patient attender name");
                        hospital.getPatientAttenderNameByPatientId(sc.nextInt());
                        break;

                    case 9:
                        System.out.println("Enter id to find patient street name: ");
                        hospital.getPatientStreetNameById(sc.nextInt());
                        break;

                    case 10:
                        System.out.println("enter the patient ADDRESS");
                         hospital.getPatientByAddress(sc.next());
                         break;


                }
                System.out.println("do you want to continue :y/n");
                text=sc.next();

            }while (text.equals("y"));
            System.out.println("thanks for registering");
        }
        hospital.getAllPatients();
        //System.out.println("enter the patient ADDRESS");
       // hospital.getPatientByAddress(sc.next());

        //System.out.println("enter the patient wardnumber");
        //hospital.getPatientNameByWard(sc.nextInt());

      /*  System.out.println("enter the patient disease name");
        hospital.getPatientNameByDiseaseName(sc.next());

        System.out.println("enter the patient updated disease name");
        hospital.updatePatientDiseaseByPatientName(sc.next(), sc.next());

        System.out.println("enter the patient updated wardno");
        hospital.updatePatientWardNoByPatientId(sc.nextInt(), sc.nextInt());

        System.out.println("enter the patient updated age");
        hospital.updatePatientsAgeByPatientId(sc.nextInt(), sc.nextInt());

        System.out.println("enter the patient id");
        hospital.getPatientById(sc.nextInt());

        System.out.println("enter the patient Id");
        hospital.getPatientAttenderNameByPatientId(sc.nextInt());

        System.out.println("Enter id to find patient street name: ");
        hospital.getPatientStreetNameById(sc.nextInt());

        /*Patient patient=new Patient();
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
        hospital.addPatient(patient);*/
    }
}
