package com.stschool.ecommerce.service;

import com.stschool.ecommerce.model.Customer;
import com.stschool.ecommerce.repository.CustomerRepository;

public class CustomerService {

    public Customer handleSignUp(Customer customer){
        System.out.println("Customer Service : "+ customer);
        CustomerRepository customerRepository=new CustomerRepository();
        return customerRepository.addNewCustomer(customer);
    }
    public void displayCustomerDetails(Customer customer){
        System.out.println("Id : "+customer.getId());
        System.out.println("First Name : "+customer.getFirstName());
        System.out.println("Last Name : "+customer.getLastName());
        System.out.println("Email : "+customer.getEmail());
        System.out.println("Contact Number : "+customer.getContactNumber());

    }
}
