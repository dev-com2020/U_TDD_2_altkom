package org.example;

public class PaymentService {
    public boolean processPayment(double amount){
        return validateAmount(amount);
    }

    private boolean validateAmount(double amount) {
        return amount > 0;
    }

}
