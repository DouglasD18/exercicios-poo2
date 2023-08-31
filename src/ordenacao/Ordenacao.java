package ordenacao;

import ordenacao.Pessoa;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class Ordenacao {
    public String[] ordenar(String[] array) {
        for (int i = 0; i <= array.length - 1; i++) {
            for (int j = 0; j <= array.length - 2; j++) {
                if ((array[j].compareTo(array[j + 1]) > 0)){
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
    }

    public static void main(String[] args) {
        List<Pessoa> listaPessoas = new ArrayList<>();
        Pessoa vini = new Pessoa("Vini", LocalDate.of(1991, Month.DECEMBER, 15));
        Pessoa jason = new Pessoa("Jason", LocalDate.of(1991, Month.DECEMBER, 15));
        Pessoa amanda = new Pessoa("Amanda", LocalDate.of(1992, Month.APRIL, 12));
        Pessoa zed = new Pessoa("Zed", LocalDate.of(1999, Month.JANUARY, 20));

        listaPessoas.addAll(List.of(zed, vini, jason, amanda));
        System.out.println("Lista de pessoas desordenada %s".formatted(listaPessoas));
        Collections.sort(listaPessoas);
        System.out.println("Lista de pessoas ordenada pela idade e pelo nome %s".formatted(listaPessoas));

        Comparator<Pessoa> comparadorDePessoasPorNome = Comparator.comparing(Pessoa::getNome);
        Collections.sort(listaPessoas, comparadorDePessoasPorNome);
        System.out.println("Lista de pessoas ordenada por nome %s".formatted(listaPessoas));
    }
}
