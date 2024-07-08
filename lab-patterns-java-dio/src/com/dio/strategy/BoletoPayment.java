package com.dio.strategy;

public class BoletoPayment implements PaymentStrategy {
  private String boletoNumber;

  public BoletoPayment(String boletoNumber) {
      this.boletoNumber = boletoNumber;
  }

  @Override
  public void pay() {
      System.out.println("Pagamento realizado com boleto: " + boletoNumber);
  }
}