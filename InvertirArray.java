import java.util.Arrays;

public class InvertirArray {
    public static void main(String[] args) {
        int[] numeros = {34, 15, 88, 2, 5, 76, -4, 56, 0};
        System.out.println("Array Original "+Arrays.toString(numeros));
        invertirArray(numeros);
        System.out.println("Array Invertido "+Arrays.toString(numeros));
    }

    public static void invertirArray(int[] array){
        int inicio = 0;
        int fin = array.length-1;
        while (inicio < fin) {
            int temp = array[inicio];
            array[inicio] = array[fin];
            array[fin] = temp;

            inicio++;
            fin--;
        }
    }
}
