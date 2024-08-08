import java.util.Scanner;

public class Tabla2 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ingresa un 3 números");
        int[] numeros = pedirNumero();
        imprimirTablasMultiplicar(numeros);
    }
    public static int[] pedirNumero() {
        int[] numeros = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Por favor, ingresa el número " + (i + 1));
            numeros[i] = sc.nextInt();
        }
        return numeros;
    }
    public static void imprimirTablasMultiplicar(int[] numeros) {
        for (int numero : numeros) {
            System.out.println("Tabla de multiplicar del " + numero + ":");
            imprimirTablaMultiplicar(numero);
            System.out.println();
        }
    }

    public static void imprimirTablaMultiplicar(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}

