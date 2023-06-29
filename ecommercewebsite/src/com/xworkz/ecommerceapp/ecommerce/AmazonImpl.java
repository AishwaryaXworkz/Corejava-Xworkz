package com.xworkz.ecommerceapp.ecommerce;

import com.xworkz.ecommerceapp.customer.Customer;
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
    public String getCustomerByAddress(String address) {
        String[] str = new String[5];
        for (int i = 0; i < this.customer.length; i++)
            if (this.customer[i].getAddress().equals(address)) {
                System.out.println(this.customer[i]);
            } else {
                System.out.println("address not matched");
            }
        return "str";
    }

    @Override
    public String getCustomerNameByCustomerId(int customerId) {
        System.out.println("invoked");
        for (int i = 0; i < this.customer.length; i++) {
            if (this.customer[i].getCustomerId() == customerId) {
                StringBuilder customerName = new StringBuilder();
                customerName = customerName.append(this.customer[i].getCustomerName());
                System.out.println(customerName);
            }
        }
        return "not found";

    }

    @Override
    public boolean updateCustomerEmailIdByCustomerId(int existingId, String updateEmailId) {
        boolean isUpdated=false;
        for(int i=0;i<customer.length;i++) {
            if (this.customer[i].getCustomerName().equals(existingId)) {
                this.customer[i].setEmail(updateEmailId);
                isUpdated = true;
                System.out.println("EmailId is updated");
                System.out.println(this.customer[i]);
            }
        }
        return isUpdated;

    }



    @Override
    public boolean updateCustomerAddressByCustomerName(String exitingName, String updatedAddress) {
        boolean isUpdated=false;
            for(int i=0;i<customer.length;i++) {
                if (this.customer[i].getCustomerName().equals(exitingName)) {
                    this.customer[i].setAddress(updatedAddress);
                    isUpdated = true;
                    System.out.println("Address is updated");
                    System.out.println(this.customer[i]);
                }
            }
            return isUpdated;


        }

    @Override
    public Customer getCustomerById(int customerId) {
            System.out.println("invoked");
            for (int i = 0; i < this.customer.length; i++) {
                if (this.customer[i].getCustomerId() == customerId) {
                    StringBuilder customer = new StringBuilder();
                    customer= customer.append(this.customer[i].getCustomerName());
                    System.out.println(customer);
                }
            }
            return null;

        }


}