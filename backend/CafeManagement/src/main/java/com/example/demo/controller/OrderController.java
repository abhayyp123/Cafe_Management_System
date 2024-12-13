package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Order;
import com.example.demo.service.OrderService;

@RestController
@RequestMapping("api/CafeData/Orders/")
@CrossOrigin(origins = "http://localhost:4200/")
public class OrderController {

    @Autowired
    private OrderService orderService;


    @PostMapping("{customerId}/{itemId}")
    public ResponseEntity<Order> addOrder(@PathVariable("customerId") int custId, @PathVariable int itemId, @RequestBody Order order) {
    	System.out.println(custId+" "+itemId);
        return new ResponseEntity<>(orderService.addOrder(custId,itemId), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/{orderId}")
    public ResponseEntity<Order> getOrderByOrderId(@PathVariable int orderId) {
        return new ResponseEntity<>(orderService.getOrderByOrderId(orderId), HttpStatus.OK);
    }

    @PutMapping("/{orderId}")
    public ResponseEntity<Order> updateOrderById(@PathVariable int orderId, @RequestBody Order order) {
        return new ResponseEntity<>(orderService.updateOrderById(orderId, order), HttpStatus.OK);
    }

    @DeleteMapping("/{orderId}")
    public ResponseEntity<String> deleteOrderById(@PathVariable int orderId) {
        return new ResponseEntity<>(orderService.deleteOrderById(orderId), HttpStatus.OK);
    }
}
