package com.xworkz.ecommerceapp.ecommerce;

import com.xworkz.ecommerceapp.customer.Customer;

public interface Ecommerce {
    boolean addCustomer(Customer customer);
    void getAllCustomers();
    String getCustomerByAddress(String address);
    String getCustomerNameByCustomerId(int customerId);
    boolean updateCustomerEmailIdByCustomerId(int existingId,String updateEmailId);
    boolean updateCustomerAddressByCustomerName(String existingName,String updatedAddress);
    Customer getCustomerById(int customerId);


}
