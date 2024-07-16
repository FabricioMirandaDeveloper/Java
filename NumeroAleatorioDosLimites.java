import java.util.Arrays;

public class NumeroAleatorioDosLimites {
    public static void main(String[] args) {
        int[] numbers = new int[6];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * (100 - 50 + 1)) + 50;
        }
        int contador = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                contador++;
            }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("El array tiene "+contador+" numeros pares");
    }
}
