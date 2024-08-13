import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ManipularOraciones {

    private static String oracion = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    crearOBorrarOracion(scanner);
                    break;
                case 2:
                    mostrarCantidadCaracteres();
                    break;
                case 3:
                    mostrarCantidadPalabras();
                    break;
                case 4:
                    mostrarPalabrasOrdenadas();
                    break;
                case 5:
                    mostrarPalabraPorNumero(scanner);
                    break;
                case 6:
                    buscarPalabra(scanner);
                    break;
                case 7:
                    modificarPalabra(scanner);
                    break;
                case 8:
                    agregarContenido(scanner);
                    break;
                case 9:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 9);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\nMenú de opciones:");
        System.out.println("1. Crear oración o Borrar oración");
        System.out.println("2. Cantidad de caracteres de la oración");
        System.out.println("3. Cantidad de palabras de la oración");
        System.out.println("4. Mostrar palabras ordenadas alfabéticamente");
        System.out.println("5. Ingresar un número y devolver la palabra correspondiente");
        System.out.println("6. Buscar palabra dentro de la oración");
        System.out.println("7. Modificar palabra dentro de la oración");
        System.out.println("8. Agregar contenido a la oración");
        System.out.println("9. Salir");
        System.out.print("Elija una opción: ");
    }

    private static void crearOBorrarOracion(Scanner scanner) {
        if (oracion.isEmpty()) {
            System.out.print("Ingrese la nueva oración: ");
            oracion = scanner.nextLine();
            System.out.println("Oración creada.");
        } else {
            oracion = "";
            System.out.println("Oración borrada.");
        }
    }

    private static void mostrarCantidadCaracteres() {
        System.out.println("Cantidad de caracteres: " + oracion.length());
    }

    private static void mostrarCantidadPalabras() {
        String[] palabras = oracion.split("\\s+");
        System.out.println("Cantidad de palabras: " + palabras.length);
    }

    private static void mostrarPalabrasOrdenadas() {
        String[] palabras = oracion.split("\\s+");
        ArrayList<String> listaPalabras = new ArrayList<>();
        Collections.addAll(listaPalabras, palabras);
        Collections.sort(listaPalabras);
        System.out.println("Palabras ordenadas alfabéticamente: " + String.join(" ", listaPalabras));
    }

    private static void mostrarPalabraPorNumero(Scanner scanner) {
        System.out.print("Ingrese el número de la palabra: ");
        int numero = scanner.nextInt();
        scanner.nextLine();  // Consumir la nueva línea

        String[] palabras = oracion.split("\\s+");
        if (numero > 0 && numero <= palabras.length) {
            System.out.println("Palabra en la posición " + numero + ": " + palabras[numero - 1]);
        } else {
            System.out.println("Número inválido. Intente nuevamente.");
        }
    }

    private static void buscarPalabra(Scanner scanner) {
        System.out.print("Ingrese la palabra a buscar: ");
        String palabra = scanner.nextLine();
        String[] palabras = oracion.split("\\s+");
        boolean encontrada = false;

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equalsIgnoreCase(palabra)) {
                System.out.println("Palabra encontrada en la posición: " + (i + 1));
                encontrada = true;
                break;
            }
        }

        if (!encontrada) {
            System.out.println("Palabra no encontrada.");
        }
    }

    private static void modificarPalabra(Scanner scanner) {
        System.out.print("Ingrese la palabra a modificar: ");
        String palabraVieja = scanner.nextLine();
        String[] palabras = oracion.split("\\s+");
        boolean encontrada = false;

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equalsIgnoreCase(palabraVieja)) {
                System.out.print("Ingrese la nueva palabra: ");
                String palabraNueva = scanner.nextLine();
                palabras[i] = palabraNueva;
                oracion = String.join(" ", palabras);
                System.out.println("Oración modificada: " + oracion);
                encontrada = true;
                break;
            }
        }

        if (!encontrada) {
            System.out.println("Palabra no encontrada.");
        }
    }

    private static void agregarContenido(Scanner scanner) {
        System.out.print("Ingrese el contenido a agregar: ");
        String contenido = scanner.nextLine();
        oracion += " " + contenido;
        System.out.println("Contenido agregado. Oración actual: " + oracion);
    }
}
