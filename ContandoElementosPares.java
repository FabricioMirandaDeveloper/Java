import java.util.Arrays;

public class ContandoElementosPares {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            int random = (int) (Math.random() * 100);
            numeros[i] = random;
        }
        System.out.println(Arrays.toString(numeros));
        int numerosPares = 0;
        for (int numero : numeros) {
            if(numero % 2 == 0) {
                numerosPares++;
            }
        }
        System.out.println("El total de numeros pares es: "+numerosPares);
    }
}
