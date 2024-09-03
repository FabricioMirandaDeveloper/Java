import java.util.Scanner;

public class SaludoUsuario {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            String nombre = obtenerNombre();
            System.out.println("Hola, " + nombre + "!");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static String obtenerNombre() {
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        if (nombre.length() < 2) {
            throw new IllegalArgumentException("El nombre debe tener al menos 2 caracteres.");
        }

        return nombre;
    }
}
