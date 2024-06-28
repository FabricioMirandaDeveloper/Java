import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        System.out.println("Ingresa un número");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String resultado = (number % 2 == 0) ? "El número es par" : "El número es impar";
        System.out.println(resultado);
        scanner.close();
    }
}
