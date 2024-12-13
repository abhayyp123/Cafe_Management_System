package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Payment;
import com.example.demo.service.PaymentService;



@RestController
@RequestMapping("api/CafeData/payments/")
@CrossOrigin(origins = "http://localhost:4200/")
public class PaymentController {
	 @Autowired
	    private PaymentService paymentService;

	    @PostMapping("{totalAmount}/{customerId}/{message}")
	    public ResponseEntity<Payment> addPayment( @PathVariable Double totalAmount, @PathVariable int customerId, @PathVariable String message, @RequestBody Payment payment) {
	        System.out.println(payment);
	        System.out.println(totalAmount+" "+customerId+" "+message);
	    	return new ResponseEntity<>(paymentService.addPayment(totalAmount,customerId,message,payment), HttpStatus.CREATED);
	    }

	    @GetMapping
	    public List<Payment> getAllPayments() {
	        return paymentService.getAllPayments();
	    }

	    @GetMapping("{paymentId}")
	    public ResponseEntity<Payment> getPaymentById(@PathVariable("paymentId") int paymentId) {
	        return new ResponseEntity<>(paymentService.getPaymentById(paymentId), HttpStatus.OK);
	    }

	    @DeleteMapping("{paymentId}")
	    public ResponseEntity<String> deletePaymentById(@PathVariable("paymentId") int paymentId) {
	        return new ResponseEntity<>(paymentService.deletePaymentById(paymentId), HttpStatus.OK);
	    }

}
