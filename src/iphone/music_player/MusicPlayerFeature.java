package iphone.music_player;

public class MusicPlayerFeature implements MusicPlayer {
  @Override
  public void play() {
    System.out.println("Tocando música");
  }

  @Override
  public void pause() {
    System.out.println("Pausando música");
  }

  @Override
  public void selectSong() {
    System.out.println("Selecionando música");
  }
}
