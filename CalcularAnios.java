import java.util.Scanner;

public class CalcularAnios {
    public static void main(String[] args) {
        final int ANIOACTUAL = 2024;
        System.out.println("Ingrese su año de nacimiento");
        Scanner scanner = new Scanner(System.in);
        int anionacimiento = scanner.nextInt();
        int edad = ANIOACTUAL - anionacimiento;
        System.out.println("Tienes "+edad+" años");
        System.out.println(edad >= 18 ? "Eres mayor de edad" : "Eres menor de edad");
    }
}
