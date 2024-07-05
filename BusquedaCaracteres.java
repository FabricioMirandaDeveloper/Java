import java.util.Scanner;

public class BusquedaCaracteres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una palabra");
        String palabra = scanner.nextLine();
        System.out.println("Ingresa un caracter");
        char caracter = scanner.next().charAt(0);
        int index = palabra.indexOf(caracter);
        if (index != -1) {
            System.out.println("El carácter '"+caracter+"' se encuentra en la palabra '"+palabra+"'.");
        } else {
            System.out.println("El carácter '"+caracter+"' no se encuentra en la palabra '"+palabra+"'.");
        }
    }
}
