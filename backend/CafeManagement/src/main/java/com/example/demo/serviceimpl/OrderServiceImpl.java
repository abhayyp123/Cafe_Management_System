package com.example.demo.serviceimpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;
import com.example.demo.model.MenuItem;
import com.example.demo.model.Order;
import com.example.demo.repository.OrderRespository;
import com.example.demo.service.CustomerService;
import com.example.demo.service.MenuItemService;
import com.example.demo.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRespository orderRespository;
    
    @Autowired
    private CustomerService customerService;
    

    @Autowired
    private MenuItemService menuItemService;
    
    @Override
    public Order addOrder(int custId,int itemId) {
    	Customer customer = customerService.getCustomerById(custId);
    	MenuItem menuItem = menuItemService.getMenuItemById(itemId);
    	Order order =new Order() ;
    	order.setCustomer(customer);
    	order.setMenuItem(menuItem);
    	order.setOrderDate(new Date());
    	order.setPrice(menuItem.getPrice());
    	return orderRespository.save(order);
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRespository.findAll();
    }

    @Override
    public Order getOrderByOrderId(int orderId) {
        return orderRespository.findById(orderId).get();
    }

    @Override
    public Order updateOrderById(int orderId, Order order) {
        Order existingOrder = getOrderByOrderId(orderId);
       
        return orderRespository.save(existingOrder);
    }

    @Override
    public String deleteOrderById(int orderId) {
        Order order = getOrderByOrderId(orderId);
        orderRespository.deleteById(order.getOrderId());
        return "Order deleted successfully";
    }

    
   
}
