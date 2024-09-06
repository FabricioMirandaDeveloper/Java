package Libreria;

import java.util.HashSet;

public class Libreria {
    private HashSet<Libro> catalogo;

    public Libreria() {
        catalogo = new HashSet<>();
    }
    public void agregarLibro(Libro libro) {
        if (catalogo.add(libro)) {
            System.out.println("Libro agregado: " + libro);
        } else {
            System.out.println("El libro con ISBN " + libro.getIsbn() + " ya está en el catálogo.");
        }
    }
    public void eliminarLibro(String isbn) {
        Libro libroAEliminar = null;
        for (Libro libro : catalogo) {
            if (libro.getIsbn().equals(isbn)) {
                libroAEliminar = libro;
                break;
            }
        }
        if (libroAEliminar != null && catalogo.remove(libroAEliminar)) {
            System.out.println("Libro eliminado: " + libroAEliminar);
        } else {
            System.out.println("No se encontró ningún libro con ISBN " + isbn);
        }
    }
    public void mostrarCatalogo() {
        if (catalogo.isEmpty()) {
            System.out.println("El catálogo está vacío.");
        } else {
            System.out.println("Catálogo de libros:");
            for (Libro libro : catalogo) {
                System.out.println(libro);
            }
        }
    }
}
