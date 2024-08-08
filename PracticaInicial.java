import java.util.Scanner;

public class PracticaInicial {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Por favor ingrese un nombre:");
        String nombre = obtenerNombre();
        System.out.println("Por favor ingrese una edad:");
        int edad = obtenerEdad();
        imprimeNombre(nombre);
        imprimeNombreYEdad(nombre,edad);
    }
    public static String obtenerNombre() {
        return sc.nextLine();
    }
    public static int obtenerEdad() {
        return sc.nextInt();
    }
    public static void imprimeNombre(String nombre) {
        System.out.println("Mi nombre es " + nombre);
    }
    public static void imprimeNombreYEdad(String nombre,int edad) {
        System.out.println("Me llamo "+nombre+" y tengo "+edad+" años.");
    }
}
