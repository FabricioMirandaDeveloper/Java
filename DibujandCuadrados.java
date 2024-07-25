import java.util.Scanner;

public class DibujandCuadrados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el tamaño del cuadrado");
        int tamanio = sc.nextInt();
        for (int i = 0; i < tamanio; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < tamanio - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < tamanio - 2; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        if (tamanio > 1) {
            for (int i = 0; i < tamanio; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
