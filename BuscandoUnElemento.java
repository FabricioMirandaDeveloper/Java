import java.util.Scanner;

public class BuscandoUnElemento {
    public static void main(String[] args) {
        int[] numbers = {1,3,5};
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número");
        int num = sc.nextInt();
        if(numbers[0] == num) {
            System.out.println("El numero se encuentra en el array");
        } else if(numbers[1] == num) {
            System.out.println("El numero se encuentra en el array");
        } else if(numbers[2] == num) {
            System.out.println("El numero se encuentra en el array");
        } else {
            System.out.println("El numero no se encuentra en el array");
        }
    }
}
