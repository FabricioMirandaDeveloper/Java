import java.util.InputMismatchException;
import java.util.Scanner;

public class RestaExcepciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa dos números");

        try {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int resultado = num1 - num2;
            System.out.println("El resultado es "+resultado);
        }catch (InputMismatchException e) {
            System.out.println("Ingresa un numero valido "+e.getMessage());

        }
    }
}
