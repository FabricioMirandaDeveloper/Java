import java.util.Arrays;
import java.util.Collections;

public class OrdenarFormaDescendente {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100) + 1;
        }
        System.out.println("Arreglo inicial: " +Arrays.toString(numbers));
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println(Arrays.toString(numbers));
    }
}