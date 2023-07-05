package com.xworkz.ecommerceapp.ecommerce;

import com.xworkz.ecommerceapp.customer.Customer;
import com.xworkz.ecommerceapp.exception.EmailNotFoundException;
import lombok.Data;

@Data
public class AmazonImpl implements Ecommerce {
    Customer customer[];
    int index;

    public AmazonImpl(int size) {
        customer = new Customer[size];
    }

    @Override
    public boolean addCustomer(Customer customer) {
        System.out.println("invoked addCustomer method ");
            boolean isAdded = false;
            if (customer != null) {
                System.out.println("Customer check is completed ....proceed to add customer");
                if (customer.getCustomerName() != null && !customer.getCustomerName().isEmpty() && customer.getAddress() != null && !customer.getAddress().isEmpty()) {
                    this.customer[index++] = customer;
                    isAdded = true;
                    System.out.println("customer name is added successfully");
                } else {
                    System.out.println("customer name is exceeded");
                }
            } else {
                System.out.println("there is no customer");
            }
            return isAdded;


    }

    @Override
    public void getAllCustomers() {
        System.out.println("invoked get-all customers");
        System.out.println("list of customers are:");
        for (Customer cust : this.customer) {
            System.out.println(cust);

        }
    }

    @Override
    public Customer getCustomerByAddress(String address) {
        System.out.println("invoking the method");
        Customer c=null;
        for(Customer customer1:customer){
            if(customer1.getAddress().equals(address)){
                System.out.println(c=customer1);
            }

        }
        return c;

    }

    @Override
    public String getCustomerNameByCustomerId(int customerId) {
        System.out.println("invoked");
       String str=null;
        for(Customer cust:customer){
            if(cust.getCustomerId()==(customerId)){
                System.out.println(str=cust.getCustomerName());
            }
        }
        return str;
    }

    @Override
    public boolean updateCustomerEmailIdByCustomerId(int existingId, String updateEmailId) {
        boolean isUpdated=false;
        for(Customer c:customer){
            if(c.getCustomerId()==(existingId)){
                c.setEmail(updateEmailId);
                isUpdated=true;
                System.out.println(c);

            }
            else {
                EmailNotFoundException exception=new EmailNotFoundException(existingId,updateEmailId);
                throw exception;
            }
        }
        return isUpdated;

    }



    @Override
    public boolean updateCustomerAddressByCustomerName(String exitingName, String updatedAddress) {
        boolean isUpdated=false;
           for(Customer c:customer){
               if(c.getCustomerName().equals(exitingName)){
                   c.setAddress(updatedAddress);
                   isUpdated=true;
                   System.out.println(c);
                }
            }
            return isUpdated;


        }

    @Override
    public Customer getCustomerById(int customerId) {
            System.out.println("invoked");
            Customer cust=null;
            for(Customer c:customer){
                if(c.getCustomerId()==(customerId)){
                    System.out.println(cust=c);
                }
            }

            return cust;

        }


}