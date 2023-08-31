package zoologico.interfaces;

public interface Terrestre extends Animal {
  default void andar() {
    System.out.println("Andando");
  }
}
