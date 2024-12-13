package com.example.demo.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "User_Order")  // Table name can remain the same unless you want to change it to something like `Orders`
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderId")
    private int orderId;

    @Column(name = "orderDate")
    private Date orderDate;

//    @Column(name = "totalAmount")
//    private double totalAmount;
    @Column(name = "price")
    private Double price;
   
   
    @ManyToOne
    @JoinColumn(name = "customerId",referencedColumnName="customer_id")  // Foreign key to Customer table
    private Customer customer;  // Customer entity instead of User


    @ManyToOne
    @JoinColumn(name = "itemId",referencedColumnName="item_id")  // Foreign key to MenuItem table
    private MenuItem menuItem; 
    // Getters and Setters
    
    public int getOrderId() {
        return orderId;
    }

    public MenuItem getMenuItem() {
		return menuItem;
	}

	public void setMenuItem(MenuItem menuItem) {
		this.menuItem = menuItem;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

//    public double getTotalAmount() {
//        return totalAmount;
//    }
//
//    public void setTotalAmount(double totalAmount) {
//        this.totalAmount = totalAmount;
//    }

   

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    // Method to access the customerId directly from the associated Customer object
    public int getCustomerIdFromOrder() {
        if (this.customer != null) {
            return this.customer.getCustomerId();  // Accessing customerId from Customer object
        }
        return -1;  // If no customer associated, you can return a default value or handle it as needed
    }

    // Method to access the customerId directly from the associated Customer object
    public int getMenuItemIdFromOrder() {
        if (this.menuItem != null) {
            return this.menuItem.getItemId();  // Accessing customerId from MenuItem object
        }
        return -1;  // If no customer associated, you can return a default value or handle it as needed
    }

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderDate=" + orderDate + ", price=" + price + ", customer=" + customer
				+ ", menuItem=" + menuItem + "]";
	}

	

}
