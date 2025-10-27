package com.atithinivas.bookingnpayment.Booking.and.Payment.dto;

import com.atithinivas.bookingnpayment.Booking.and.Payment.model.Payment;
import lombok.Data;


@Data
public class PaymentResponseDTO {

    private String paymentId;
    private String userId;
    private String bookingid;
    private Double amount;
    private Payment.Status status;
    private String paymentMethod;

    public static PaymentResponseDTO fromEntity(Payment payment) {
        PaymentResponseDTO dto = new PaymentResponseDTO();
        dto.setPaymentId(payment.getPaymentId());
        dto.setUserId(payment.getUserId());
        dto.setBookingid(payment.getBookingid());
        dto.setAmount(payment.getAmount());
        dto.setStatus(payment.getStatus());
        dto.setPaymentMethod(payment.getPaymentMethod());
        return dto;
    }
}