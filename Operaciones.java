import java.sql.SQLOutput;
import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Ingresa un numero: ");
        int a = Scanner.nextInt();
        System.out.println("Ingresa otro numero: ");
        int b = Scanner.nextInt();

        // Suma
        int c = a + b;
        System.out.println("La suma es "+ c);
        // Resta
        int d = a - b;
        System.out.println("La resta es "+ d);
        // Division
        int e = a / b;
        System.out.println("La division es "+ e);
        // Multiplicacion
        int f = a * b;
        System.out.println("La multiplicacion es "+ f);
        // Modulo
        int g = a % b;
        System.out.println("El modulo es "+ g);
    }
}
