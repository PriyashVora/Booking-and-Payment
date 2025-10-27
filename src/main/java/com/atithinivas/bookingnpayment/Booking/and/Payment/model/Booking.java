package com.atithinivas.bookingnpayment.Booking.and.Payment.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import java.util.UUID;

@Data
@Entity
@Table(name = "bookings")
public class Booking {

    @Id
    @Column(length = 50)
    private String bookingId;

    @Column(nullable = false, length = 50)
    private String userId;

    @Column(nullable = false, length = 50)
    private String hotelId;

    @Column(nullable = false, length = 50)
    private String roomId;

    @Column(nullable = false)
    private LocalDate checkInDate;

    @Column(nullable = false)
    private LocalDate checkOutDate;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private Status status;

    @Column(length = 50)
    private String paymentId;

    public enum Status {
        PENDING,
        CONFIRMED,
        CANCELLED,
        CHECKED_IN,
        COMPLETED
    }

    @PrePersist
    public void generateId() {
        if (this.bookingId == null) {
            // Generates a random ID like "B" + 8 hex characters
            this.bookingId = "B" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
        }
        if (this.status == null) {
            this.status = Status.PENDING;
        }
    }
}
