package com.UberApp.services;

import com.UberApp.entities.Payment;
import com.UberApp.entities.Ride;
import com.UberApp.entities.enums.PaymentStatus;

public interface PaymentService {

    void processPayment(Ride ride);

    Payment createNewPayment(Ride ride);

    void updatePaymentStatus(Payment payment, PaymentStatus status);
}
