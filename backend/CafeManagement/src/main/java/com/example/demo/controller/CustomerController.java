package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Customer;

import com.example.demo.service.CustomerService;

@RestController
@RequestMapping("api/CafeData/customers")
@CrossOrigin(origins = "http://localhost:4200/")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {
        return new ResponseEntity<>(customerService.addCustomer(customer), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable("id") int id) {
        Customer customer = customerService.getCustomerById(id);
        if (customer != null) {
            return new ResponseEntity<>(customer, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND); // Customer not found
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteCustomerById(@PathVariable("id") int id) {
        String response = customerService.deleteCustomerById(id);
        if ("Customer deleted successfully".equals(response)) {
            return new ResponseEntity<>(response, HttpStatus.OK);
        }
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND); // Customer not found
    }
    
    @PostMapping("login")
	public ResponseEntity<Customer> loginCustomer(@RequestBody Customer customer) 
	{
    	System.out.println(customer);
		return new ResponseEntity<Customer>(customerService.loginCustomer(customer),HttpStatus.OK);
	}
    
    
    

    @PutMapping("{id}")
    public ResponseEntity<Customer> updateCustomerById(@PathVariable("id") int id, @RequestBody Customer customer) {
        Customer updatedCustomer = customerService.updateCustomerById(id, customer);
        if (updatedCustomer != null) {
            return new ResponseEntity<>(updatedCustomer, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND); // Customer not found
    }
}
