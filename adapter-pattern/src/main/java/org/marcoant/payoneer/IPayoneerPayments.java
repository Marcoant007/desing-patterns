package org.marcoant.payoneer;

import org.marcoant.utils.Token;

public interface IPayoneerPayments {
  Token authToken();
  void sendPayment();
  void receivePayment();
}
