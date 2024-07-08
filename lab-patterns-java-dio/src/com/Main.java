package com;

import com.dio.facade.PaymentFacade;

public class Main {
    public static void main(String[] args) {
        PaymentFacade paymentFacade = new PaymentFacade();

        // Pagamento com cartão de crédito
        paymentFacade.payWithCreditCard("1234-5678-9012-3456");

        // Pagamento com PayPal
        paymentFacade.payWithPayPal("emailpaypal@exemplo.com");

        // Pagamento com boleto
        paymentFacade.payWithBoleto("9876543210");
    }
}
