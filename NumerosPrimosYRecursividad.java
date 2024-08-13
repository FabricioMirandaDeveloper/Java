import java.util.Scanner;

public class NumerosPrimosYRecursividad {
    public static void main(String[] args) {
        int numero;
        do {
            numero = obtenerNumeroDelUsuario();
            if (numero != 0) {
                if (esPrimo(numero, 2)) {
                    System.out.println("El número " + numero + " es primo.");
                } else {
                    System.out.println("El número " + numero + " no es primo. Intenta con otro número.");
                }
            }
        } while (numero != 0);
        System.out.println("Programa terminado.");
    }

    // Método para solicitar y obtener un número del usuario
    public static int obtenerNumeroDelUsuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número (0 para terminar): ");
        return scanner.nextInt();
    }

    // Método que verifica si un número es primo usando recursividad
    public static boolean esPrimo(int numero, int divisor) {
        if (numero <= 1) return false;
        if (divisor > Math.sqrt(numero)) return true;
        if (numero % divisor == 0) return false;
        return esPrimo(numero, divisor + 1);
    }
}
