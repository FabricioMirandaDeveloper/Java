import java.util.Arrays;
import java.util.Scanner;

public class CopiandoParteDeUnArreglo {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] arregloOriginal = {10,20, 30, 40, 50, 60, 70, 80, 90, 100};
            System.out.println("Arreglo original:");
            for (int i = 0; i < arregloOriginal.length; i++) {
                System.out.println("Índice " + i + ": " + arregloOriginal[i]);
            }
            System.out.println("Ingresa el índice inicial (menor que el índice final):");
            int indiceInicial = sc.nextInt();
            System.out.println("Ingresa el índice final (mayor que el índice inicial y dentro del rango):");
            int indiceFinal = sc.nextInt();

            if (indiceInicial >= indiceFinal || indiceInicial < 0 || indiceFinal >= arregloOriginal.length) {
                System.out.println("Índices inválidos. El índice inicial debe ser menor que el índice final y ambos deben estar dentro del rango del arreglo.");
            } else {
                int[] arregloCopiado = Arrays.copyOfRange(arregloOriginal, indiceInicial, indiceFinal + 1);
                System.out.println("Nuevo Arreglo Copiado: "+Arrays.toString(arregloCopiado));
            }
        }
}
