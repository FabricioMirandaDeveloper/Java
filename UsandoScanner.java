import java.util.Scanner;

public class UsandoScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String nombre = scanner.next();
        System.out.println("Ingresa tu edad");
        int edad = scanner.nextInt();
        System.out.println(String.format("Tu nombre es %s y tienes %d años",nombre, edad));
        scanner.close();
    }
}
