import java.util.Arrays;
import java.util.Scanner;

public class RellenandoUnArreglo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el tamaño del arreglo");
        int tamanio = sc.nextInt();
        int[] array = new int[tamanio];
        System.out.println("Con que numero quieres llenar el arreglo?");
        int value = sc.nextInt();
        Arrays.fill(array, value);
        System.out.println("Arreglo: "+Arrays.toString(array));
    }
}
