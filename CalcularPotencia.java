import java.util.Scanner;

public class CalcularPotencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
            Ingresa dos numeros enteros
            1)Ingresa una base
            """);
        int num1 = scanner.nextInt();
        System.out.println("Ingresa un exponente");
        int num2 = scanner.nextInt();
        System.out.println(Math.pow(num1,num2));
    }
}
