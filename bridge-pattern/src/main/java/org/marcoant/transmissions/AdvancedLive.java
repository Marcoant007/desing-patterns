package org.marcoant.transmissions;

import org.marcoant.plataforms.IPlataform;

public class AdvancedLive extends Live{
  public  AdvancedLive(IPlataform plataform){
    super.plataform = plataform;
  }

  public void subtitles() {
    System.out.println("Legendas ativadas na Transmissão");
  }

  public void comments() {
    System.out.println("Comentário liberados na live");
  }
}
