package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
    // Custom query methods can be added here if needed
	public Customer findByNameAndPassword(String name, String password);
}
