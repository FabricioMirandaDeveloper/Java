import java.util.Arrays;
import java.util.Scanner;

public class RellenandoUnArregloDeManeraPersonalizada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el tamaño del arreglo");
        int tamanio = sc.nextInt();
        int[] array = new int[tamanio];
        int indice = 0;

        while(indice < tamanio) {
            System.out.println("Con que valor deseas rellenar el array?");
            int value = sc.nextInt();

            while (value == 0) {
                System.out.println("Por favor ingresa un número diferente de 0:");
                value = sc.nextInt();
            }

            System.out.println("Hasta qué índice deseas rellenar (0 a " + (tamanio - 1) + ")?");
            int inputIndice = sc.nextInt();

            if (inputIndice >= 0 && inputIndice < tamanio && inputIndice >= indice) {
                Arrays.fill(array, indice, inputIndice + 1, value);
                indice = inputIndice + 1;
                System.out.println("Arreglo: " + Arrays.toString(array));
            } else {
                System.out.println("Índice fuera del rango o no cumple con las condiciones.");
            }
        }
    }
}
