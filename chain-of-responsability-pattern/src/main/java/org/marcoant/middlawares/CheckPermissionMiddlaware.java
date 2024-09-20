package org.marcoant.middlawares;

public class CheckPermissionMiddlaware extends Middlaware{

  @Override
  public boolean check(String email, String password) {
    if(email.equals("master@gmail.com.br")){
      System.out.println("Bem vindo Administrador!");
      return true;
    }

    System.out.println("Bem Vindo");
    return checkNext(email, password);
  }
}
