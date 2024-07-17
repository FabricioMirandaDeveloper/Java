import java.util.Arrays;

public class ComparandoArreglos {
    public static void main(String[] args) {
        int[] numbers = {1,3,5,7,9};
        int[] numbers2 = {1,3,5,7,9};
        if(Arrays.equals(numbers,numbers2)) {
            System.out.println("Verdadero");
        }else {
            System.out.println("Falso");
        }
    }
}
