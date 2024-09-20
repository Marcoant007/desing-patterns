package org.marcoant.transmissions;

import org.marcoant.plataforms.IPlataform;

public class Live implements ITransmission {
  protected IPlataform plataform;

  public Live() {}

  public  Live(IPlataform plataform) {
    this.plataform = plataform;
  }
  @Override
  public void broadcasting() {
    System.out.println("Iniciando Transmissão");
  }

  @Override
  public void result() {
    System.out.println("Live ao vivo");
  }
}
