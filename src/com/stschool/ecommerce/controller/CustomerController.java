package com.stschool.ecommerce.controller;

import com.stschool.ecommerce.model.Customer;

public class CustomerController {
    public void handleSignUp(Customer customer){
        System.out.println("Handling data of : " + customer.getId());
       // return customer.getFirstname();

    }
}
