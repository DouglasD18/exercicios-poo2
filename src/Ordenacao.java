import java.util.Arrays;

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
}
