package com.dio.strategy;

public class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay() {
        System.out.println("Pagamento realizado com PayPal: " + email);
    }
}
