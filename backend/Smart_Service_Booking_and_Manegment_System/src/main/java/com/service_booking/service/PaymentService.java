package com.service_booking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service_booking.entity.Booking;
import com.service_booking.entity.Payment;
import com.service_booking.repository.PaymentRepository;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public Payment makePayment(Booking booking, double amount, String mode) {

        Payment payment = new Payment();
        payment.setBooking(booking);
        payment.setAmount(amount);
        payment.setPaymentMode(mode);
        payment.setPaymentStatus("SUCCESS");

        return paymentRepository.save(payment);
    }
}
