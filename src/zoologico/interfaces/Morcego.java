package zoologico.interfaces;

public class Morcego implements Amamentador, Voador {

  @Override
  public void movimentar() {
    voar();
  }
  
}
