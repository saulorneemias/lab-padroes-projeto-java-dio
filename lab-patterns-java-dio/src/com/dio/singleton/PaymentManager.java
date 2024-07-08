package com.dio.singleton;

import com.dio.strategy.PaymentStrategy;

public class PaymentManager {
    private static PaymentManager instance;

    private PaymentManager() {
        // Construtor privado para evitar instanciamento
    }

    public static synchronized PaymentManager getInstance() {
        if (instance == null) {
            instance = new PaymentManager();
        }
        return instance;
    }

    public void processPayment(PaymentStrategy paymentMethod) {
        paymentMethod.pay();
    }
}
