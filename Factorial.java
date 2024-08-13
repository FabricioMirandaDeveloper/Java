import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int numero = obtenerNumeroDelUsuario();
        int resultado = factorialRecursivo(numero);
        System.out.println("El factorial de "+numero+" es: " + resultado);
    }

    public static int obtenerNumeroDelUsuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();
        scanner.close();
        return numero;
    }

    public static int factorialRecursivo(int numero) {
        if (numero == 0) {
            return 1;
        } else {
            return numero * factorialRecursivo(numero - 1);
        }
    }
}
