package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;
import com.example.demo.model.Payment;
import com.example.demo.repository.PaymentRepository;
import com.example.demo.service.CustomerService;
import com.example.demo.service.PaymentService;
@Service
public class PaymentServiceImpl implements PaymentService{
@Autowired
private PaymentRepository paymentRepository;
@Autowired
private CustomerService customerService;


	@Override
	public Payment addPayment( Double totalAmount,int customerId,String message,Payment payment) {
		// TODO Auto-generated method stub
		Customer customer=customerService.getCustomerById(customerId);
		payment.setCustomer(customer);
		payment.setAccountType(message);
		payment.setTotalAmount(totalAmount);
		
		return paymentRepository.save(payment);
	}

	@Override
	public List<Payment> getAllPayments() {
		// TODO Auto-generated method stub
		return paymentRepository.findAll();
	}

	@Override
	public Payment getPaymentById(int paymentId) {
		// TODO Auto-generated method stub
		Optional<Payment> payment = paymentRepository.findById(paymentId);
        return payment.orElse(null);
	}

	@Override
	public String deletePaymentById(int paymentId) {
		// TODO Auto-generated method stub
		 if (paymentRepository.existsById(paymentId)) {
			 paymentRepository.deleteById(paymentId);
	            return "Payment with ID " + paymentId + " deleted successfully";
	        }
	        return "Payment with ID " + paymentId + " not found";
	}

}
