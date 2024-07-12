import java.util.Scanner;

public class EncontrarValorMinimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        System.out.println("Ingresa los numeros");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Numero "+(i+1)+":");
            numeros[i] = scanner.nextInt();
        }
        int minimo = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if(minimo > numeros[i]) {
                minimo = numeros[i];
            }
        }
        System.out.println("Tu valor minimo es "+minimo);
    }
}
