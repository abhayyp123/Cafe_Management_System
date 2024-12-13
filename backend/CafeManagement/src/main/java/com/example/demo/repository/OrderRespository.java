package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Order;
import java.util.List;

public interface OrderRespository extends JpaRepository<Order, Integer> {

    // Custom query methods for the required fields
    List<Order> findByCustomerCustomerId(int customerId);  // Fetch orders by customerId
}
