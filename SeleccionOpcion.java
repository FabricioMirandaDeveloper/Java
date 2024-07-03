import java.util.Scanner;

public class SeleccionOpcion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elije una opcion");
        System.out.println("""
                Opción 1: "Guardar"
                Opción 2: "Cargar"
                Opción 3: "Salir"
               """);
        int option = scanner.nextInt();
        String result = switch (option) {
            case 1 -> "Guardar";
            case 2 -> "Cargar";
            case 3 -> "Salir";
            default -> "Opcion invalida";
        };
        System.out.println(result);
    }
}
