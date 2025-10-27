
package com.atithinivas.bookingnpayment.Booking.and.Payment.model;

import jakarta.persistence.*;
        import lombok.Data;
import java.util.UUID;

@Data
@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @Column(length = 50)
    private String paymentId;

    @Column(nullable = false, length = 50)
    private String userId;

    @Column(nullable = false, length = 50)
    private String bookingid;

    @Column(nullable = false)
    private Double amount;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private Status status;

    @Column(length = 50)
    private String paymentMethod;

    // Enum for Status
    public enum Status {
        PENDING,
        COMPLETED,
        FAILED,
        REFUNDED
    }

    @PrePersist
    public void generateId() {
        if (this.paymentId == null) {

            this.paymentId = "P" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
        }
        if (this.status == null) {
            this.status = Status.PENDING;
        }
    }
}
