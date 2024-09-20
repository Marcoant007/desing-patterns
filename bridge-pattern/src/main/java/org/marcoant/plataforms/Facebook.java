package org.marcoant.plataforms;

public class Facebook implements IPlataform {

  public Facebook() {
    configureRMTP();
    System.out.println("Facebook: Transmissão Iniciada");
  }

  @Override
  public void configureRMTP() {
    authToken();
    System.out.println("Facebook: Conta Autorizada");

  }

  @Override
  public void authToken() {
    System.out.println("Facebook: Autorizando aplicação");
  }
}
