package iphone.telephone;

public class TelephoneFeature implements Telephone{
  @Override
  public void call() {
    System.out.println("Ligando");
  }

  @Override
  public void answer() {
    System.out.println("Atendendo chamada");
  }

  @Override
  public void startVoicemail() {
    System.out.println("Iniciando correio de voz");
  }
}
