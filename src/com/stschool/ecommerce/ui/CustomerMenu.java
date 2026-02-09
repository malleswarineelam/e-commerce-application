package com.stschool.ecommerce.ui;

import com.stschool.ecommerce.model.Customer;

import java.util.Scanner;

public class CustomerMenu {

    public Customer inputCustomerSignUpData(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter id : ");
        String id=sc.next();
        System.out.println("Enter FirstName : ");
        String firstName=sc.next();
        System.out.println("Enter LastName : ");
        String lastName=sc.next();
        System.out.println("Enter Contact Number : ");
        String contactNumber=sc.next();
        System.out.println("Enter E-mail : ");
        String email=sc.next();
        System.out.println("Enter password : ");
        String password=sc.next();


        Customer customer=new Customer();
        customer.setId(id);
        customer.setFirstname(firstName);
        customer.setLastName(lastName);
        customer.setEmail(email);
        customer.setPassword(password);
        customer.setContactNumber(contactNumber);
        sc.close();
        System.out.println("Customer data :"+ customer);
        return customer;
    }

}
