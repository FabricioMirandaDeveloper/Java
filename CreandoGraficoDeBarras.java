import java.util.Scanner;

public class CreandoGraficoDeBarras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[4];
        for (int i = 0; i < 4; i++) {
            while (true) {
                System.out.println("Ingresa el número " + (i + 1) + " (entre 1 y 20):");
                int num = sc.nextInt();
                if (num >= 1 && num <= 20) {
                    numeros[i] = num;
                    break;
                } else {
                    System.out.println("Número inválido. Por favor, ingresa un número entre 1 y 20.");
                }
            }
        }
        for (int num : numeros) {
            System.out.print(num + " ");
            for (int i = 0; i < num; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
