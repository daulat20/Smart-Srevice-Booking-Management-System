package com.service_booking.exeception;

public class ProviderAlreadyExistsException extends RuntimeException {
    public ProviderAlreadyExistsException(String message) {
        super(message);
    }
}

