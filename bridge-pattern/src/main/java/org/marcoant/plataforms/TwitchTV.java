package org.marcoant.plataforms;

public class TwitchTV implements IPlataform {

  public TwitchTV() {
    configureRMTP();
    System.out.println("TwitchTV: Transmissão Iniciada");
  }

  @Override
  public void configureRMTP() {
    authToken();
    System.out.println("TwitchTV: Conta Autorizada");
  }

  @Override
  public void authToken() {
    System.out.println("TwitchTV: Autorizando aplicação");
  }
}
