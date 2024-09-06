package Libreria;

import java.util.Scanner;

public class GestionLibreria {
    public static void main(String[] args) {
        Libreria libreria = new Libreria();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú de Gestión de Librería ---");
            System.out.println("1. Agregar libro");
            System.out.println("2. Eliminar libro");
            System.out.println("3. Mostrar catálogo");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el título del libro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Introduce el autor del libro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Introduce el número de ISBN: ");
                    String isbn = scanner.nextLine();
                    Libro nuevoLibro = new Libro(titulo, autor, isbn);
                    libreria.agregarLibro(nuevoLibro);
                    break;
                case 2:
                    System.out.print("Introduce el número de ISBN del libro a eliminar: ");
                    String isbnEliminar = scanner.nextLine();
                    libreria.eliminarLibro(isbnEliminar);
                    break;
                case 3:
                    libreria.mostrarCatalogo();
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}
