import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número");
        double num= scanner.nextDouble();
        if(num % 5 == 0 && num % 3 == 0) {
            System.out.println("Es divisible por 3 y 5");
        }else if(num % 3 ==0) {
            System.out.println("Es divisible por 3");
        }else if(num % 5 == 0) {
            System.out.println("Es divisible por 5");
        }else {
            System.out.println("No es divisible por ninguno");
        }
        scanner.close();
    }
}


