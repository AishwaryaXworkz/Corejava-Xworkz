package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.exception.DiseaseNotFoundException;
import com.xworkz.hospitalapp.exception.PatientIdNotFoundException;
import com.xworkz.hospitalapp.exception.WardNotFoundException;
import com.xworkz.hospitalapp.patient.Patient;

public class SparshHospitalImpl implements Hospital {
    Patient patient[];
    int index;

    public SparshHospitalImpl(int size) {
        patient = new Patient[size];
    }

    @Override
    public boolean addPatient(Patient patient) {
        System.out.println("invoked addPatient method ");
        boolean isAdded = false;
        if (patient != null) {
            System.out.println("Patient check is completed ....proceed to add patient");
            if (patient.getName() != null && !patient.getName().isEmpty() && patient.getBloodGroup() != null && !patient.getBloodGroup().isEmpty()) {
                this.patient[index++] = patient;
                isAdded = true;
                System.out.println("patient name is added successfully");
            } else {
                System.out.println("Patient name is exceeded");
            }
        } else {
            System.out.println("there is no patient any more");
        }
        return isAdded;
    }

    @Override
    public void getAllPatients() {
        System.out.println("invoked get-all patients");
        System.out.println("list of patients are:");
        for (Patient pat : this.patient) {
            System.out.println(pat);

        }
    }

    @Override
    public Patient getPatientByAddress(String address1) {
        Patient p1 = null;
        for (Patient p : patient) {
            if (p.getAddress().equals(address1)) {
                System.out.println(p1 = p);
            }
        }
        return p1;
    }

    @Override
    public String getPatientNameByWard(int wardNo) {
        System.out.println("invoked method");
        String str = null;
        for (Patient p : patient) {
            if (p.getWardNo() == wardNo) {
                System.out.println(str = p.getName());
            } else {
                WardNotFoundException exception = new WardNotFoundException(wardNo);
                throw exception;
            }
        }
        return str;
    }

    @Override
    public String[] getPatientNameByDiseaseName(String diseaseName) {
        System.out.println("invoked method");

        String[] patientName = new String[2];
        for (Patient pat : patient) {
            if (pat.getDiseaseName().equals(diseaseName)) {
                System.out.println(pat);
            }
            else{
                DiseaseNotFoundException exception=new DiseaseNotFoundException(diseaseName);
                throw exception;
            }
        }
        return patientName;
    }

    @Override
    public boolean updatePatientDiseaseByPatientName(String existingName, String updateDisease) {
        boolean isUpdated = false;
        for (Patient p : patient) {
            if (p.getName().equals(existingName)) {
                p.setDiseaseName(updateDisease);
                isUpdated = true;
                System.out.println("Disease name is updated");
                System.out.println(p);

            }
        }
        return isUpdated;
    }

    @Override
    public boolean updatePatientWardNoByPatientId(int existingId, int updateWardNo) {
        boolean isUpdate = false;
        for (Patient p : patient) {
            if (p.getPatientId() == (existingId)) ;
            {
                p.setWardNo(updateWardNo);
                isUpdate = true;
                System.out.println("ward number is updated");
                System.out.println(p);

            }
        }
        return isUpdate;
    }

    @Override
    public boolean updatePatientsAgeByPatientId(int existingPatientId, int updatedAge) {
        boolean isUpdated = false;
        for (Patient p : patient) {
            if (p.getPatientId() == (existingPatientId)) {
                p.setAge(updatedAge);
                isUpdated = true;
                System.out.println("age is updated");
                System.out.println(p);
            }
        }

        return isUpdated;
    }

    @Override
    public Patient getPatientById(int patientId) {
        System.out.println("invoked getting patient id ");
        /*for (int i = 0; i < this.patient.length; i++) {
            if (this.patient[i].getPatientId() == patient) {
                StringBuilder patientId = new StringBuilder();
                patientId = patientId.append(this.patient[i].getName());
                System.out.println(patientId);
            }
        }
        return null;
    }*/
        Patient pat = null;
        for (Patient p : patient) {
            if (p.getPatientId() == patientId) {
                pat = p;
            } else {
                PatientIdNotFoundException exception = new PatientIdNotFoundException(patientId);
                throw exception;
            }
        }
        return pat;

    }

    @Override
    public String getPatientAttenderNameByPatientId(int patientId) {
        System.out.println("invoked method");
        String str = null;
        for (Patient p : patient) {
            if (p.getPatientId() == (patientId)) ;
            {
                System.out.println(str = p.getAttenderName());
            }
        }
        return str;
    }

    @Override
    public String getPatientStreetNameByPatientId(int existingId) {
        System.out.println("invoking");
        String streetName = null;
        for (Patient p : patient) {
            if (p.getPatientId() == existingId) {
                streetName = p.getAddress1().getCountry().getState().getCity().getArea().getStreets().getStreetsName();
            }
        }
            return streetName;
        }
    }

