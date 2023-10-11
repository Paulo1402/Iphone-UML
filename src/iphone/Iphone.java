package iphone;

import iphone.internet_browser.InternetBrower;
import iphone.music_player.MusicPlayer;
import iphone.telephone.Telephone;

public class Iphone {
  public Telephone telephoneFeature;
  public InternetBrower internetBrowerFeature;
  public MusicPlayer musicPlayerFeature;

  public Iphone(Telephone telephoneFeature, InternetBrower internetBrowerFeature, MusicPlayer musicPlayerFeature) {
    this.telephoneFeature = telephoneFeature;
    this.internetBrowerFeature = internetBrowerFeature;
    this.musicPlayerFeature = musicPlayerFeature;
  }
}
