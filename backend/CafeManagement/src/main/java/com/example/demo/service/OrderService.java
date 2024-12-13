package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Order;

public interface OrderService {

    public Order addOrder(int custid, int itemid);

    public List<Order> getAllOrders();

    public Order getOrderByOrderId(int orderId);

    public Order updateOrderById(int orderId, Order order);

    public String deleteOrderById(int orderId);




   
}
