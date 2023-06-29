package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.patient.Patient;

public interface Hospital {
    boolean addPatient(Patient patient);
    void getAllPatients();
    String getPatientByAddress(String address);
    String getPatientNameByWard(int wardNo);
    String getPatientNameByDiseaseName(String diseaseName);
    boolean updatePatientDiseaseByPatientName(String existingName, String updateDisease);
    boolean updatePatientWardNoByPatientId(int existingId, int updateWardNo);
    boolean updatePatientsAgeByPatientId(int updatedAge, int existingPatientId);
    Patient getPatientById(int patientId);
    String getPatientAttenderNameByPatientId(int patientId);
    String getPatientStreetNameById(int patientId);
}
