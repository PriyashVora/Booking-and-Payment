package com.atithinivas.bookingnpayment.Booking.and.Payment.dto;

import com.atithinivas.bookingnpayment.Booking.and.Payment.model.Payment;
import lombok.Data;


@Data
public class PaymentRequestDTO {

    private String userId;
    private String bookingid;
    private Double amount;
    private String paymentMethod;

}
