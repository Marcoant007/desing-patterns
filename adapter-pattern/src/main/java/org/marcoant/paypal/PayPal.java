package org.marcoant.paypal;

import org.marcoant.utils.Token;

public class PayPal implements IPayPalPayments {
  private  Token token;
  @Override
  public Token authToken() {
    return new Token();
  }

  @Override
  public void paypalPayments() {
    this.token = authToken();
    System.out.println("Enviando pagamento com PayPal");

  }

  @Override
  public void paypalReceive() {
    System.out.println("Recebendo pagamentos via PayPal");
  }
}
