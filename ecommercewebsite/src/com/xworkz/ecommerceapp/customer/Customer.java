package com.xworkz.ecommerceapp.customer;


import com.xworkz.ecommerceapp.constant.Gender;
import com.xworkz.ecommerceapp.constant.PaymentType;
import lombok.Data;

@Data
public class Customer {
   private int customerId;
   private String customerName;
   private String password;
   private String email;
   private long phoneNumber;
   private String address;
   Gender gender;
   PaymentType paymentType;



}
