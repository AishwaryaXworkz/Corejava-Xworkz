package com.xworkz.hospitalapp.hospital;

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
    public String getPatientByAddress(String address) {
        for (int i = 0; i < this.patient.length; i++) {
            if (this.patient[i].getAddress().equals(address)) {
                System.out.println(this.patient[i]);
            } else {
                System.out.println("duplicate address");
            }
        }
        return null;
    }

    @Override
    public String getPatientNameByWard(int wardNo) {
        System.out.println("invoked method");
        for (int i = 0; i < this.patient.length; i++) {
            if (this.patient[i].getWardNo() == wardNo) {
                StringBuilder patientName = new StringBuilder();
                patientName = patientName.append(this.patient[i].getName());
                System.out.println(patientName);

            }
        }
        return "not found";
    }

    @Override
    public String getPatientNameByDiseaseName(String diseaseName) {
        System.out.println("invoked method");
        for (int i = 0; i < this.patient.length; i++) {
            if (this.patient[i].getDiseaseName().equals(diseaseName)) {
                StringBuilder patientName = new StringBuilder();
                patientName = patientName.append(this.patient[i].getName());
                System.out.println(patientName);

            }
        }
        return null;
    }

    @Override
    public boolean updatePatientDiseaseByPatientName(String existingName, String updateDisease) {
        boolean isUpdated = false;
        for (int i = 0; i < this.patient.length; i++) {
            if (this.patient[i].getName().equals(existingName)) {
                this.patient[i].setDiseaseName(updateDisease);
                isUpdated = true;
                System.out.println("Disease name is updated");
                System.out.println(this.patient[i]);
            }
        }
        return isUpdated;
    }

    @Override
    public boolean updatePatientWardNoByPatientId(int existingId, int updateWardNo) {
        boolean isUpdate = false;
        for (int i = 0; i < patient.length; i++) {
            if (this.patient[i].getPatientId() == (existingId)) {
                this.patient[i].setWardNo(updateWardNo);
                isUpdate = true;
                System.out.println("ward number is updated");
                System.out.println(this.patient[i]);
            }
        }
        return isUpdate;
    }

    @Override
    public boolean updatePatientsAgeByPatientId(int existingPatientId, int updatedAge) {
        boolean isUpdated = false;
        for (int i = 0; i < patient.length; i++) {
            if (this.patient[i].getPatientId() == (existingPatientId)) {
                this.patient[i].setAge(updatedAge);
                isUpdated = true;
                System.out.println("updated age");
                System.out.println(this.patient[i]);
            }
        }

        return isUpdated;
    }

    @Override
    public Patient getPatientById(int patient) {
        System.out.println("invoked getting patient id ");
        for (int i = 0; i < this.patient.length; i++) {
            if (this.patient[i].getPatientId() == patient) {
                StringBuilder patientId = new StringBuilder();
                patientId = patientId.append(this.patient[i].getName());
                System.out.println(patientId);
            }
        }
        return null;
    }

    @Override
    public String getPatientAttenderNameByPatientId(int patientId) {
        System.out.println("invoked method");
        for (int i = 0; i < this.patient.length; i++) {
            if (this.patient[i].getPatientId() == (patientId)) {
                StringBuilder attenderName = new StringBuilder();
                attenderName = attenderName.append(this.patient[i].getAttenderName());
                System.out.println(attenderName);
            }
        }
        return null;
    }

    @Override
    public String getPatientStreetNameById(int patientId) {
        String streetName = null;
        for (Patient p : this.patient) {
            if (p.getPatientId() == patientId) {
            }
        }
        return null;
    }
}
