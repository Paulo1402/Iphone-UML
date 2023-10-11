import iphone.Iphone;
import iphone.internet_browser.InternetBrowerFeature;
import iphone.music_player.MusicPlayerFeature;
import iphone.telephone.TelephoneFeature;

public class App {
  public static void main(String[] args) {
    Iphone iphone = new Iphone(
      new TelephoneFeature(), 
      new InternetBrowerFeature(), 
      new MusicPlayerFeature()
    );

    iphone.telephoneFeature.call();
    iphone.internetBrowerFeature.addNewTab();
    iphone.musicPlayerFeature.play();
  }
}
