import java.util.Scanner;

public class EsPar {
    public static void main(String[] args) {
        Scanner pepe = new Scanner(System.in);
        Integer numero = null;
        System.out.println("Por favor ingrese un número:");
        do {
            try {
                numero = pepe.nextInt();
            } catch (Exception e) {
                pepe.nextLine();
                System.out.println("No ingresó un número, intente nuevamente:");
            }
        } while (numero == null);
        if (numero % 2 == 0) {
            System.out.println("El "+numero+" es par");
        }
    }
}
