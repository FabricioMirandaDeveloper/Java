import java.util.Scanner;

public class ContandoEspaciosBlancoCadena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa una cadena");
        String cadena = sc.nextLine();
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isWhitespace(cadena.charAt(i))) {
                contador++;
            }
        }
        System.out.println("Hay "+contador+" espacios en blanco");
    }
}
