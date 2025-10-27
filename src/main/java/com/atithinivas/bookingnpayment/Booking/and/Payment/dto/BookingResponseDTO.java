package com.atithinivas.bookingnpayment.Booking.and.Payment.dto;

import com.atithinivas.bookingnpayment.Booking.and.Payment.model.Booking;
import lombok.Data;
import java.time.LocalDate;


@Data
public class BookingResponseDTO {

    private String bookingId;
    private String userId;
    private String hotelId;
    private String roomId;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private Booking.Status status;
    private String paymentId;

    public static BookingResponseDTO fromEntity(Booking booking) {
        BookingResponseDTO dto = new BookingResponseDTO();
        dto.setBookingId(booking.getBookingId());
        dto.setUserId(booking.getUserId());
        dto.setHotelId(booking.getHotelId());
        dto.setRoomId(booking.getRoomId());
        dto.setCheckInDate(booking.getCheckInDate());
        dto.setCheckOutDate(booking.getCheckOutDate());
        dto.setStatus(booking.getStatus());
        dto.setPaymentId(booking.getPaymentId());
        return dto;
    }
}
