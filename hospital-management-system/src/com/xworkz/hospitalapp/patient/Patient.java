package com.xworkz.hospitalapp.patient;

import com.sun.xml.internal.ws.wsdl.writer.document.http.Address;
import com.xworkz.hospitalapp.constant.Gender;
import com.xworkz.hospitalapp.constant.GovtId;
import com.xworkz.hospitalapp.location.Address1;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Patient {
    private int patientId;
    private String name;
    private int age;
    private long phoneNumber;
    private boolean isInsuranceAvailable;
    private String attenderName;
    private String bloodGroup;
    private String diseaseName;
    private Gender gender;
    private GovtId govtId;
     private String address;
    private int wardNo;
     Address1 address1;
}
