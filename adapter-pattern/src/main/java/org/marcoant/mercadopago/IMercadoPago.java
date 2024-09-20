package org.marcoant.mercadopago;

import org.marcoant.utils.Token;

public interface IMercadoPago {
  Token authToken();
  void sendPayment();
  void receivePayment();
}
