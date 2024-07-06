import java.util.Scanner;

public class ComparacionCadenas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa dos palabras");
        System.out.println("Palabra 1");
        String word1 = scanner.next();
        System.out.println("Palabra 2");
        String word2 = scanner.next();
        if (word1.equals(word2)) {
            System.out.println("Son iguales");
        }else {
            System.out.println("No son iguales");
        }
    }
}
