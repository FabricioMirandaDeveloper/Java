public class SumandoPosicionesPares {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int sumaTotal = 0;
        for (int number : numbers) {
            if(number % 2 == 0) {
                sumaTotal+=number;
            }
        }
        System.out.println("La suma de los numeros pares es: "+sumaTotal);
    }
}
