package org.example.patientmanagement.ExceptionHandling;

public class InsuffiecientFund extends RuntimeException {
    public InsuffiecientFund(String message) {
        super(message);
    }
}
