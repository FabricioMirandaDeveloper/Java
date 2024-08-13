import java.util.Scanner;

public class Fibonacci2 {
    public static void main(String[] args) {
        int posicion = obtenerPosicionDelUsuario();
                mostrarResultado(posicion);
    }
    public static int obtenerPosicionDelUsuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la posición en la serie de Fibonacci: ");
        int posicion = scanner.nextInt();
        scanner.close();
        return posicion;
    }
    public static void mostrarResultado(int posicion) {
        if (posicion < 0) {
            System.out.println("La posición debe ser un número entero no negativo.");
        } else {
            int valorFibonacci = obtenerFibonacci(posicion);
            System.out.println("El valor en la posición " + posicion + " de la serie de Fibonacci es: " + valorFibonacci);
        }
    }
    public static int obtenerFibonacci(int posicion) {
        if (posicion == 0) {
            return 0;
        } else if (posicion == 1) {
            return 1;
        } else {
            int a = 0;
            int b = 1;
            int c = 0;
            for (int i = 2; i <= posicion; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return c;
        }
    }
}


