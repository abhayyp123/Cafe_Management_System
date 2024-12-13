package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Payment;



public interface PaymentService {
	Payment addPayment( Double totalAmount,int customerId,String message,Payment payment);

    List<Payment> getAllPayments();

    Payment getPaymentById(int payment);

  String deletePaymentById(int payment);
}
