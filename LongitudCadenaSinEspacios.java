import java.util.Scanner;

public class LongitudCadenaSinEspacios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una cadena de texto");
        String text = scanner.nextLine();
        String textWithoutSpaces = text.replaceAll("\\s","");
        int cantidad = textWithoutSpaces.length();
        System.out.println(textWithoutSpaces+" tiene "+cantidad+" de caracteres");
    }
}
