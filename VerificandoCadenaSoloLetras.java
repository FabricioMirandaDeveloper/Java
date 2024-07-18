import java.util.Scanner;

public class VerificandoCadenaSoloLetras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa una cadena");
        String cadena = sc.nextLine();
        boolean soloLetras = true;
        for (int i = 0; i < cadena.length(); i++) {
            if (!Character.isLetter(cadena.charAt(i))) {
                soloLetras = false;
                break;
            }
        }
        if (soloLetras) {
            System.out.println("La cadena contiene solo letras.");
        } else {
            System.out.println("La cadena no contiene solo letras.");
        }
        sc.close();
    }
}
