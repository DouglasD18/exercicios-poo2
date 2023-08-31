package zoologico.interfaces;

public class Golfinho implements Amamentador, Nadador {

  @Override
  public void movimentar() {
    nadar();
  }
  
}
