package com.example.demo;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;

@SpringBootTest    //Annotation for test class
class CafeManagementApplicationTests {

	@Autowired
	public CustomerRepository customerRepository;
	@Disabled
	@Test
	void testCustomerRegister() {
		Customer customer=new Customer();
		customer.setName("pavitra");
		customer.setEmail("pavitra@gmail.com");
		customer.setAddress("9876543457");
		customer.setAddress("banashankari");
		customer.setPassword("nagaral ");
		assertNotNull(customerRepository.save(customer));
		}
	@Disabled
	@Test
	void testUserGetById() {
		assertNotNull(customerRepository.findById(1));
	}
	
	@Disabled
	@Test
	void testGetAllUsers() {
		List<Customer> customerList = customerRepository.findAll();
		assertEquals(5, customerList.size());
	}
	
	@Test
	void testUserPassword() {
		Customer customer = customerRepository.findById(1).get();
		assertTrue(customer.getPassword().length() >= 8); 
		
	}
	

}
