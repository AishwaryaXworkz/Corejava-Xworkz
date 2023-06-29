package com.xworkz.ecommerceapp;

import com.xworkz.ecommerceapp.constant.Gender;
import com.xworkz.ecommerceapp.constant.PaymentType;
import com.xworkz.ecommerceapp.customer.Customer;
import com.xworkz.ecommerceapp.ecommerce.AmazonImpl;
import com.xworkz.ecommerceapp.ecommerce.Ecommerce;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.println("main is invoked");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the customer details to be added");
        int size = sc.nextInt();
        Ecommerce ecommerce = new AmazonImpl(size);

        for (int customerIndex = 0; customerIndex < size; customerIndex++) {
            Customer customer = new Customer();
            System.out.println("enter the customer Id");
            customer.setCustomerId(sc.nextInt());

            System.out.println("enter the customer name");
            customer.setCustomerName(sc.next());

            System.out.println("enter the customer password");
            customer.setPassword(sc.next());

            System.out.println("enter the customer email");
            customer.setEmail(sc.next());

            System.out.println("enter the customer phonenumber");
            customer.setPhoneNumber(sc.nextLong());

            System.out.println("enter the customer address");
            customer.setAddress(sc.next());

            System.out.println("enter the gender");
            customer.setGender(Gender.valueOf(sc.next()));

            System.out.println("enter payment type");
            customer.setPaymentType(PaymentType.valueOf(sc.next()));

            ecommerce.addCustomer(customer);
            String text = null;
            do {
                System.out.println("1.get all customers details");
                System.out.println("2.get customer by address");
                System.out.println("3.get customersname by customer id");
                System.out.println("4.update customer email by customer id");
                System.out.println("5.update customer address by customer name");
                System.out.println("6.get customer by id");
                int option= sc.nextInt();
                switch (option){
                    case 1:
                        System.out.println("the list of customers are");
                        ecommerce.getAllCustomers();
                        break;

                    case 2:
                        System.out.println("get customer by address");
                        ecommerce.getCustomerByAddress(sc.next());
                        break;

                    case 3:
                        System.out.println("get customersname by customer id");
                        ecommerce.getCustomerNameByCustomerId(sc.nextInt());
                        break;

                    case 4:
                        System.out.println("update customer email by customer id");
                        ecommerce.updateCustomerEmailIdByCustomerId(sc.nextInt(), sc.next());
                        break;

                    case 5:
                        System.out.println("update customer address by customer name");
                        ecommerce.updateCustomerAddressByCustomerName(sc.next(), sc.next());
                        break;

                    case 6:
                        System.out.println("get customer by id");
                        ecommerce.getCustomerById(sc.nextInt());
                        break;


                }
                System.out.println("do you want to continue :y/n");
                text=sc.next();

            }while (text.equals("y"));
            System.out.println("thanks for registering");
        }
        ecommerce.getAllCustomers();
        }
    }
