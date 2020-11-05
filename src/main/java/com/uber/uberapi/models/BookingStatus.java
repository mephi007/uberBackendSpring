package com.uber.uberapi.models;

import java.nio.channels.AcceptPendingException;

public enum BookingStatus {

    CANCELLED,
    SCHEDULED,
    PENDING,
    CAB_ARRIVED,
    IN_PROGRESS,
    COMPLETED
}
