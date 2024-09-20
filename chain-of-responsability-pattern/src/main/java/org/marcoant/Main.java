package org.marcoant;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.marcoant.middlawares.CheckPermissionMiddlaware;
import org.marcoant.middlawares.CheckUserMiddlaware;
import org.marcoant.middlawares.Middlaware;
import org.marcoant.server.Server;

public class Main {
  private static Server server;
  private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

  public static void init() {
    server = new Server();
    server.registerUser("master@gmail.com", "8796451a@#");
    server.registerUser("user@gmail.com", "1234");

    Middlaware middlaware = new CheckUserMiddlaware(server);
    middlaware.linkWith(new CheckPermissionMiddlaware());
    server.setMiddlaware(middlaware);
  }

  public static void main(String[] args) throws IOException {
    init();

    boolean done;

    do {
      System.out.println("\n");
      System.out.println("Digite o e-mail: ");
      String email = reader.readLine();
      System.out.println("Digite a senha: ");
      String password = reader.readLine();
      done = server.login(email, password);
    } while (!done);
  }
}