package ListaDeInvitados;

import java.util.HashSet;
import java.util.Scanner;

public class RegistroDeInvitados {
    private HashSet<String> listaDeInvitados;

    public RegistroDeInvitados() {
        listaDeInvitados = new HashSet<>();
    }
    private String formatearNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            return nombre;
        }
        return nombre.substring(0, 1).toUpperCase() + nombre.substring(1).toLowerCase();
    }
    public void agregarInvitado(String nombre) {
        nombre = formatearNombre(nombre);
        if(listaDeInvitados.add(nombre)) {
            System.out.println(nombre + " ha sido agregado a la lista.");
        } else {
            System.out.println(nombre + " ya está en la lista.");
        }
    }
    public void eliminarInvitado(String nombre) {
        nombre = formatearNombre(nombre);
        if(listaDeInvitados.remove(nombre)) {
            System.out.println(nombre + " ha sido eliminado de la lista.");
        } else {
            System.out.println(nombre + " no está en la lista.");
        }
    }
    public void mostrarInvitados() {
        if (listaDeInvitados.isEmpty()) {
            System.out.println("La lista de invitados está vacía.");
        } else {
            System.out.println("Invitados: " + listaDeInvitados);
        }
    }
    public void main(String[] args) {
        RegistroDeInvitados registro = new RegistroDeInvitados();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú de Registro de Invitados ---");
            System.out.println("1. Agregar invitado");
            System.out.println("2. Eliminar invitado");
            System.out.println("3. Mostrar invitados");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el nombre del invitado: ");
                    String nombreAgregar = scanner.nextLine();
                    registro.agregarInvitado(nombreAgregar);
                    break;
            case 2:
                System.out.print("Introduce el nombre del invitado a eliminar: ");
                String nombreEliminar = scanner.nextLine();
                registro.eliminarInvitado(nombreEliminar);
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


