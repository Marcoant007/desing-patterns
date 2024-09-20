package org.marcoant.adapters;

import org.marcoant.mercadopago.MercadoPago;
import org.marcoant.paypal.IPayPalPayments;
import org.marcoant.utils.Token;

public class MercadoPagoAdapter implements IPayPalPayments  {
  private Token token;
  private MercadoPago mercadoPago;

  public MercadoPagoAdapter(MercadoPago mercadoPago) {
    this.mercadoPago = mercadoPago;
    System.out.println("Adaptando o Mercado Pago utilizando os métodos padrões do PayPal");
  }

  @Override
  public Token authToken() {
    return new Token();
  }

  @Override
  public void paypalPayments() {
    this.mercadoPago.sendPayment();
  }

  @Override
  public void paypalReceive() {
    this.mercadoPago.receivePayment();
  }
}
