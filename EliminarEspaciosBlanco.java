import java.util.Scanner;

public class EliminarEspaciosBlanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una frase con espacios en blanco al principio y al final");
        String frase = scanner.nextLine();
        System.out.println(frase.trim());
    }
}
