package com.example.demo.service;

import java.util.List;
import com.example.demo.model.Customer;


public interface CustomerService {

    public Customer addCustomer(Customer customer);

    public List<Customer> getAllCustomers();

    public Customer getCustomerById(int id);

    public String deleteCustomerById(int id);

    public Customer updateCustomerById(int id, Customer customer);
    
    public Customer loginCustomer(Customer customer);
    
}
