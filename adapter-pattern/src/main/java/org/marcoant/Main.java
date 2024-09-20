package org.marcoant;

import java.util.Scanner;
import org.marcoant.adapters.MercadoPagoAdapter;
import org.marcoant.adapters.PayoneerAdapter;
import org.marcoant.mercadopago.MercadoPago;
import org.marcoant.payoneer.Payoneer;
import org.marcoant.paypal.IPayPalPayments;
import org.marcoant.paypal.PayPal;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Escolha a opção de pagamento:");
    System.out.println("01 - PayPal");
    System.out.println("02 - Payoneer");
    System.out.println("03 - Mercado Pago");
    System.out.print("Digite o número correspondente à opção desejada: ");
    String paymentOption = scanner.nextLine();

    IPayPalPayments paymentProcessor;

    switch (paymentOption) {
      case "01":
        paymentProcessor = new PayPal();
        System.out.println("Você escolheu PayPal.");
        break;
      case "02":
        paymentProcessor = new PayoneerAdapter(new Payoneer());
        System.out.println("Você escolheu Payoneer.");
        break;
      case "03":
        paymentProcessor = new MercadoPagoAdapter(new MercadoPago());
        System.out.println("Você escolheu Mercado Pago.");
        break;
      default:
        System.out.println("Opção inválida. Por favor, escolha entre 01, 02 ou 03.");
        return;
    }

    paymentProcessor.paypalPayments();
    paymentProcessor.paypalReceive();
  }
}