package org.marcoant.middlawares;

import org.marcoant.server.Server;

public class CheckUserMiddlaware extends  Middlaware{
  private final Server server;

  public CheckUserMiddlaware(Server server) {
    this.server = server;
  }

  @Override
  public boolean check(String email, String password) {
    if(!server.hasEmail(email)) {
      System.out.println("Email inválido");
      return false;
    }

    if(!server.isValidPassword(email, password)) {
      System.out.println("E-mail ou Senha Inválido");
      return false;
    }

    return  checkNext(email, password);
  }
}
