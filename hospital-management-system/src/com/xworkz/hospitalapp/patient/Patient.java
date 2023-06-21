package com.xworkz.hospitalapp.patient;

import com.xworkz.hospitalapp.constant.Gender;
import com.xworkz.hospitalapp.constant.GovtId;
import lombok.Data;

@Data

public class Patient {
 private int patientId;
   private String name;
   private int age;
  private long phoneNumber;
  private   boolean isInsuranceAvailable;
   private String attenderName;
  private   String bloodGroup;
   private String diseaseName;
   Gender gender;
   GovtId govtId;
}
