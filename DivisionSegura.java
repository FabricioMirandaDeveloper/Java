import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionSegura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa dos números enteros");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int resultado = 0;
        try {
            resultado = num1 / num2;
            System.out.println("El resultado es "+resultado);
        }catch (ArithmeticException e) {
            System.out.println("No puedes realizar una division por cero"+ e.getMessage());
        }
    }
}
