import java.util.Scanner;

public class EncontrarMaximo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        System.out.println("Ingresa 5 numeros enteros");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingresa el numero "+(i + 1)+":");
            numeros[i] = scanner.nextInt();
        }
        int maximo = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if(numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }
        System.out.println("El valor máximo en el array es: " + maximo);
    }
}
