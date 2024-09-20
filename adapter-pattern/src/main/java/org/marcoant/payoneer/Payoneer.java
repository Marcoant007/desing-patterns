package org.marcoant.payoneer;

import org.marcoant.utils.Token;

public class Payoneer implements IPayoneerPayments{
  @Override
  public Token authToken() {
    return  new Token();
  }

  @Override
  public void sendPayment() {
    System.out.println("Enviando pagamentos via Payoneer");
  }

  @Override
  public void receivePayment() {
    System.out.println("Recebendo pagamentos via Payoneer");
  }
}
