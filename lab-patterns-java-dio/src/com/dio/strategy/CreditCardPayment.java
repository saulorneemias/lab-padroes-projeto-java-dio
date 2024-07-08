package com.dio.strategy;

public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay() {
        System.out.println("Pagamento realizado com cartão de crédito: " + cardNumber);
    }
}
