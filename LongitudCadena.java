import java.util.Scanner;

public class LongitudCadena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una cadena de texto");
        String text = scanner.next();
        System.out.println("La longitud de "+text+" es "+text.length());
    }
}
