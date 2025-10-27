package com.atithinivas.bookingnpayment.Booking.and.Payment.dto;

import com.atithinivas.bookingnpayment.Booking.and.Payment.model.Booking;
import lombok.Data;
import java.time.LocalDate;


@Data
public class BookingRequestDTO {

    private String userId;
    private String hotelId;
    private String roomId;

    private LocalDate checkInDate;
    private LocalDate checkOutDate;

}