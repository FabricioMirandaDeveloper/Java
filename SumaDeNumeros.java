import java.util.Scanner;

public class SumaDeNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa una cadena que represente un numero");
        String cadena = sc.nextLine();
        System.out.println("Ingresa un numero decimal");
        double decimal = sc.nextDouble();
        System.out.println(cadena);
        System.out.println(decimal);
        double totalSuma = Double.parseDouble(cadena) + decimal;
        System.out.println(totalSuma);
    }
}
