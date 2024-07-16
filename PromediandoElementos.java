import java.util.Scanner;

public class PromediandoElementos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[4];
        System.out.println("Ingresa 4 numeros enteros");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingresa el numero "+(i + 1)+":");
            numeros[i] = scanner.nextInt();
        }
        int sumaTotal = 0;
        for(int numero : numeros) {
            sumaTotal += numero;
        }
        int promedio = sumaTotal / numeros.length;
        System.out.println("El promedio es "+promedio);
        scanner.close();
    }
}
