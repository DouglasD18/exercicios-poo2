import java.util.Scanner;

public class MaiorString {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite a primeira String: ");
    String primeira = scan.nextLine();

    System.out.println("Digite a segunda String: ");
    String segunda = scan.nextLine();

    System.out.println(maior(primeira, segunda));

    scan.close();

  }

  private static String maior(String primeira, String segunda) {
    if (primeira.compareTo (segunda) > 0) {
        return primeira;
    } else {
        return segunda;
    }
  }
}
