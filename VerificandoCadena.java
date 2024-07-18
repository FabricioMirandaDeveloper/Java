import java.util.Scanner;

public class VerificandoCadena {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Ingresa una cadena");
            String cadena = sc.nextLine();
            Double numero = Double.valueOf(cadena);
            System.out.println("El numero es "+numero);
        } catch (NumberFormatException e) {
            System.out.println("La entrada no es un numero valido: "+e.getMessage());
        } finally {
            sc.close();
        }
    }
}
