import java.util.Arrays;
import java.util.Scanner;

public class CopiandoElementos {
    public static void main(String[] args) {
        int[] numbers = {2,4,6};
        int[] numbers2 = new int[5];
        numbers2[0] = numbers[0];
        numbers2[1] = numbers[1];
        numbers2[2] = numbers[2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa dos numeros");
        System.out.println("Numero 1:");
        numbers2[3] = sc.nextInt();
        System.out.println("Numero 2:");
        numbers2[4] = sc.nextInt();
        System.out.println("Array Nuevo: "+ Arrays.toString(numbers2));
    }
}
