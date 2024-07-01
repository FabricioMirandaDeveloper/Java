import java.util.Scanner;

public class Contraseña {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu contraseña");
        String registredUser = "pancito";
        String loginUser = scanner.next();
        if (loginUser.equals(registredUser)) {
            System.out.println("Acceso Concedido");
        } else {
            System.out.println("Acceso Denegado");
        }
        scanner.close();
    }
}
