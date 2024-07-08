package com.dio.facade;

import com.dio.singleton.PaymentManager;
import com.dio.strategy.BoletoPayment;
import com.dio.strategy.CreditCardPayment;
import com.dio.strategy.PayPalPayment;
import com.dio.strategy.PaymentStrategy;

public class PaymentFacade {
    private PaymentManager paymentManager;

    public PaymentFacade() {
        this.paymentManager = PaymentManager.getInstance();
    }

    public void payWithCreditCard(String cardNumber) {
        PaymentStrategy paymentMethod = new CreditCardPayment(cardNumber);
        paymentManager.processPayment(paymentMethod);
    }

    public void payWithPayPal(String email) {
        PaymentStrategy paymentMethod = new PayPalPayment(email);
        paymentManager.processPayment(paymentMethod);
    }

    public void payWithBoleto(String boletoNumber) {
        PaymentStrategy paymentMethod = new BoletoPayment(boletoNumber);
        paymentManager.processPayment(paymentMethod);
    }
}