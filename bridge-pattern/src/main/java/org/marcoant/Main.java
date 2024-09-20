package org.marcoant;

import org.marcoant.plataforms.Facebook;
import org.marcoant.plataforms.IPlataform;
import org.marcoant.plataforms.TwitchTV;
import org.marcoant.plataforms.Youtube;
import org.marcoant.transmissions.AdvancedLive;

public class Main {
  public static void main(String[] args) {
    startLive(new Youtube());
    startLive(new TwitchTV());
    startLive(new Facebook());
  }

  public static void startLive(IPlataform plataform) {
    System.out.println("Transmissão Avançada ... aguarde");
    AdvancedLive advancedLive = new AdvancedLive(plataform);
    advancedLive.broadcasting();
    advancedLive.result();
    advancedLive.comments();
    advancedLive.subtitles();
  }
}