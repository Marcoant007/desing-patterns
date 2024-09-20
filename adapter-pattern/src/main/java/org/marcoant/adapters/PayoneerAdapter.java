package org.marcoant.adapters;

import org.marcoant.payoneer.Payoneer;
import org.marcoant.paypal.IPayPalPayments;
import org.marcoant.utils.Token;

public class PayoneerAdapter implements IPayPalPayments {
  private Token token;
  private Payoneer payoneer;

  public PayoneerAdapter(Payoneer payoneer) {
    this.payoneer = payoneer;
    System.out.println("Adaptando o payonner utilizando os métodos padrões do PayPal");
  }

  @Override
  public Token authToken() {
    return new Token();
  }

  @Override
  public void paypalPayments() {
    this.payoneer.sendPayment();
  }

  @Override
  public void paypalReceive() {
    this.payoneer.receivePayment();
  }
}
