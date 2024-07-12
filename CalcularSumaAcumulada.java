public class CalcularSumaAcumulada {
    public static void main(String[] args) {
        int[] numbers = {1,3,5,7,9};
        int sumaTotal = 0;
        for (int i = 0; i < numbers.length; i++) {
            sumaTotal += numbers[i];
            numbers[i] = sumaTotal;
        }
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
