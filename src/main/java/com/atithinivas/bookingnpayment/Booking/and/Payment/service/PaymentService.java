package com.atithinivas.bookingnpayment.Booking.and.Payment.service;

import com.atithinivas.bookingnpayment.Booking.and.Payment.dto.PaymentRequestDTO;
import com.atithinivas.bookingnpayment.Booking.and.Payment.dto.PaymentResponseDTO;
import com.atithinivas.bookingnpayment.Booking.and.Payment.model.Payment;
import java.util.List;
import java.util.Optional;

public interface PaymentService {
    List<PaymentResponseDTO> getAllPayments();
    Optional<PaymentResponseDTO> getPaymentById(String paymentId);
    List<PaymentResponseDTO> getPaymentsByUserId(String userId);
    List<PaymentResponseDTO> getPaymentsByBookingId(String bookingId);
    PaymentResponseDTO createPayment(PaymentRequestDTO paymentDetails) throws Exception;
    PaymentResponseDTO updatePaymentStatus(String paymentId, Payment.Status status) throws Exception;
    void deletePayment(String paymentId);
}