package org.example.wzorce;

// Interfejs strategii
interface PaymentStrategy {
    void pay(double amount);
}

// Konkretne strategie
class CreditCardPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

class PayPalPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}

// Kontekst używający strategii
class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(double amount) {
        paymentStrategy.pay(amount);
    }
}

// Użycie wzorca Strategy
//public class Main {
//    public static void main(String[] args) {
//        ShoppingCart cart = new ShoppingCart();
//
//        cart.setPaymentStrategy(new CreditCardPayment());
//        cart.checkout(100.0); // "Paid 100.0 using Credit Card."
//
//        cart.setPaymentStrategy(new PayPalPayment());
//        cart.checkout(50.0); // "Paid 50.0 using PayPal."
//    }
}
