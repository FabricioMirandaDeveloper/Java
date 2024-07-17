import java.util.Arrays;
import java.util.Scanner;

public class BusquedaBinaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100) + 1;
        }
        System.out.println("Arreglo inicial: " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Arreglo ordenado: "+ Arrays.toString(numbers));
        System.out.println("Ingresa el numero a buscar");
        int key = sc.nextInt();
        int index = Arrays.binarySearch(numbers, key);
        System.out.println(index);
        if (index >= 0) {
            System.out.println("El elemento " + key + " se encuentra en el índice: " + index);
        } else {
            System.out.println("El elemento " + key + " no se encuentra en el array. Índice: " + index);
        }
    }
}
