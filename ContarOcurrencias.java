import java.util.Arrays;
import java.util.Scanner;

public class ContarOcurrencias {
    public static void main(String[] args) {
        String frase = "La resiliencia es recuperarse de los contratiempos";
        char[] array = new char[frase.length()];
        for (int i = 0; i < frase.length(); i++) {
                array[i] = frase.charAt(i);
        }
        System.out.println("Array de caracteres inicializado");
        System.out.println(Arrays.toString(array));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el caracter objetivo:");
        char ocurrencia = scanner.next().charAt(0);
        int contador = 0;
        for(char arr : array) {
            if(ocurrencia == arr) {
                contador++;
            }
        }
        if (contador > 0) {
            System.out.println("El carácter '" + ocurrencia + "' aparece " + contador + " veces.");
        } else {
            System.out.println("El carácter '" + ocurrencia + "' no aparece en la frase.");
        }
        scanner.close();
    }
}
