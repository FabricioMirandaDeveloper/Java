import java.util.*;

public class InvertirArrayInteger {
    public static void main(String[] args) {
        Integer[] numeros = {34, 15, 88, 2, 5, 76, -4, 56, 0};
        System.out.println("Array Original: " + Arrays.toString(numeros));
        List<Integer> listaNumeros = new ArrayList<>(Arrays.asList(numeros));
        Collections.reverse(listaNumeros);
        Integer[] arrayConvertido = listaNumeros.toArray(new Integer[0]);
        System.out.println("Array Invertido "+ Arrays.toString(arrayConvertido));
    }
}
