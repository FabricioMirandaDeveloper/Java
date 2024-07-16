import java.util.Arrays;
import java.util.Scanner;

public class ContadorParesEImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas series de numeros deseas ingresar?");
        int veces = sc.nextInt();
        int[] numeros = new int[veces];
        int impares = 0;
        int pares = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingresa el numero "+(i+1)+":");
            numeros[i] = sc.nextInt();
            if(numeros[i] % 2 != 0) {
                impares++;
            }else {
                pares++;
            }
        }
        System.out.println(Arrays.toString(numeros)+" tiene "+impares+" numeros impares y tiene "+pares+" numeros pares");
    }
}
