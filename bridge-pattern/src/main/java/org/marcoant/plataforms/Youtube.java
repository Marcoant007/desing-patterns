package org.marcoant.plataforms;

public class Youtube implements IPlataform{

  public Youtube() {
    configureRMTP();
    System.out.println("Youtube: Transmissão Iniciada");
  }

  @Override
  public void configureRMTP() {
    authToken();
    System.out.println("Youtube: Conta Autorizada");
  }

  @Override
  public void authToken() {
    System.out.println("Youtube: Autorizando aplicação");
  }
}
