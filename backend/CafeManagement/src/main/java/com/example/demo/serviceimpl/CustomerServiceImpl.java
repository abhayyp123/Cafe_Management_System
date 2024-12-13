package com.example.demo.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getCustomerById(int id) {
        return customerRepository.findById(id).orElse(null); // Use Optional to handle not found
    }

    @Override
    public String deleteCustomerById(int id) {
        Customer customer = getCustomerById(id);
        if (customer != null) {
            customerRepository.deleteById(id);
            return "Customer deleted successfully";
        }
        return "Customer not found";
    }

    @Override
    public Customer updateCustomerById(int id, Customer customer) {
        Customer existingCustomer = getCustomerById(id);
        if (existingCustomer != null) {
            existingCustomer.setName(customer.getName());
            existingCustomer.setEmail(customer.getEmail());
            existingCustomer.setPhoneNumber(customer.getPhoneNumber());
            existingCustomer.setAddress(customer.getAddress());
           
            existingCustomer.setPassword(customer.getPassword());
            return customerRepository.save(existingCustomer);
        }
        return null; // or throw an exception if customer is not found
    }

	@Override
	public Customer loginCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.findByNameAndPassword(customer.getName(),customer.getPassword());
	}
}
