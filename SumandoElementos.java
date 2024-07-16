public class SumandoElementos {
    public static void main(String[] args) {
        int[] numeros = {1,3,5,7};
        int totalSuma = 0;
        for (int numero : numeros) {
            totalSuma += numero;
        }
        System.out.println("La suma de los elementos es: " + totalSuma);
    }
}
