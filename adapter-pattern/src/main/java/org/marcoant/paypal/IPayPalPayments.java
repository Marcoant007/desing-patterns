package org.marcoant.paypal;

import org.marcoant.utils.Token;

public interface IPayPalPayments {

  Token authToken();
  void paypalPayments();
  void paypalReceive();
}
