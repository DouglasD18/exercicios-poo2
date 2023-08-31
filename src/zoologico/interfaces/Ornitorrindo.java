package zoologico.interfaces;

public class Ornitorrindo implements Amamentador, Nadador {

  @Override
  public void movimentar() {
    nadar();
  }
  
}
