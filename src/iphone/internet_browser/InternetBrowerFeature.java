package iphone.internet_browser;

public class InternetBrowerFeature implements InternetBrower{
  @Override
  public void showPage() {
    System.out.println("Mostrando página");
  }

  @Override
  public void addNewTab() {
    System.out.println("Adicionando nova página");
  }

  @Override
  public void refreshTab() {
    System.out.println("Atualizando página");
  }
}
