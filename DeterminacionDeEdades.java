import java.util.Scanner;

public class DeterminacionDeEdades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu edad");
        int age = scanner.nextInt();
        if(age < 18) {
            System.out.println("Eres menor de edad");
        } else if (age <= 64) {
            System.out.println("Eres adulto");
        } else {
            System.out.println("Eres un adulto mayor");
        }
    }
}
