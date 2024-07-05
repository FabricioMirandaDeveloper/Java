import java.util.Scanner;

public class ConcatenarCadenas {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String name = scanner.next();
        System.out.println("Ingresa tu apellido");
        String lastName = scanner.next();
        System.out.println("Tu nombre completo es "+name.concat(" ").concat(lastName));
    }
}
