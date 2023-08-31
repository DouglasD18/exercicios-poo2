package zoologico.interfaces;

public class Vaca implements Amamentador, Terrestre {

  @Override
  public void movimentar() {
    andar();
  }
  
}
