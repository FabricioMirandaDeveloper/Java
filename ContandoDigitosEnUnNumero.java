import java.util.Scanner;
public class ContandoDigitosEnUnNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int number = sc.nextInt();
        String cadena = String.valueOf(number);
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if(Character.isDigit(cadena.charAt(i))) {
                contador++;
            }
        }
        System.out.println("El numero "+number+" tiene "+contador+" digitos.");
        sc.close();
    }
}
