import java.util.Scanner;

public class CalculoFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un nùmero");
        long number = sc.nextInt();
        int sumaTotal = 1;
        int i = 1;
        do {
            sumaTotal *= i;
            i++;
        }while(i <= number);
        System.out.println("El factorial de " + number + " es " + sumaTotal);
        sc.close();
    }
}
