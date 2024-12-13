package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PaymentId")
    private int paymentID;

    @ManyToOne
    @JoinColumn(name = "customerId",referencedColumnName="customer_id")  // Foreign key to Customer table
    private Customer customer;  // Customer entity instead of User

//
//    @ManyToOne
//    @JoinColumn(name = "itemId",referencedColumnName="item_id")  // Foreign key to MenuItem table
//    private MenuItem menuItem; 
    // Getters and Setters
    @Column(name = "totalAmount")
    private Double totalAmount;
    
    @Column(name = "accountType")
    private String accountType; 
    
    @Column(name = "cardHodler")
    private String cardHodler;
    
    @Column(name = "cardNumber")
    private String cardNumber;
    
    @Column(name = "expirationDate")
    private String  expirationDate;
    
    @Column(name = "cvv_Number")
    private int cvv;
    
    @Column(name = "phoneNumber")
    private String phoneNumber;
    
	public String getCardHodler() {
		return cardHodler;
	}
	public void setCardHodler(String cardHodler) {
		this.cardHodler = cardHodler;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getPaymentID() {
		return paymentID;
	}
	public void setPaymentID(int paymentID) {
		this.paymentID = paymentID;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
//	public MenuItem getMenuItem() {
//		return menuItem;
//	}
//	public void setMenuItem(MenuItem menuItem) {
//		this.menuItem = menuItem;
//	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	@Override
	public String toString() {
		return "Payment [paymentID=" + paymentID + ", customer=" + customer + ", totalAmount=" + totalAmount
				+ ", accountType=" + accountType + ", cardHodler=" + cardHodler + ", cardNumber=" + cardNumber
				+ ", expirationDate=" + expirationDate + ", cvv=" + cvv + ", phoneNumber=" + phoneNumber + "]";
	}
	
    
}
