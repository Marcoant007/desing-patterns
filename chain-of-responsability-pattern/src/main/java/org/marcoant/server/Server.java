package org.marcoant.server;

import java.util.HashMap;
import java.util.Map;
import org.marcoant.middlawares.Middlaware;

public class Server {

  private Map<String, String> users = new HashMap<>();
  private Middlaware middlaware;

  public void setMiddlaware(Middlaware middlaware) {
    this.middlaware = middlaware;
  }

  public boolean login(String email, String password) {
    if(middlaware.check(email, password)){
      System.out.println("Usuário autenticado com sucesso");
      System.out.println("Seja Bem vindo");
    }

    return false;
  }

  public void registerUser(String email, String password) {
      users.put(email, password);
  }

  public boolean hasEmail(String email) {
    return users.containsKey(email);
  }

  public boolean isValidPassword(String email, String password) {
    return users.get(email).equals(password);
  }

}
