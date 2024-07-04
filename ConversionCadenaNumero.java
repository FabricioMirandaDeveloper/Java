import java.util.Scanner;

public class ConversionCadenaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una cadena de caracteres");
        String cadena = scanner.next();
        try {
            int newCadena = Integer.parseInt(cadena);
            System.out.println(newCadena);
        }catch (NumberFormatException e) {
            System.out.println("Ingresa un caracter que represente numeros enteros "+e.getMessage());
        }
    }
}
