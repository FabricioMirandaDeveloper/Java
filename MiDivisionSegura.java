import java.util.Scanner;

public class MiDivisionSegura {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numerador = 0;
        int denominador = 0;

        while (true) {
            try {
                numerador = obtenerNumerador();
                break;
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.print("Ingresa el denominador: ");
        denominador = scanner.nextInt();

        double resultado = (double) numerador / denominador;
        System.out.println("El resultado de la división es: " + resultado);
    }

    public static int obtenerNumerador() {
        System.out.print("Ingresa el numerador: ");
        int numerador = scanner.nextInt();

        if (numerador == 0) {
            throw new ArithmeticException("El numerador no puede ser 0. Intenta de nuevo.");
        }

        return numerador;
    }
}

