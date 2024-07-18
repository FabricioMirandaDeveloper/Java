import java.util.Random;
import java.util.Scanner;

public class GenerandoContraseña {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Ingresa la longitud de la contraseña");
        int longitud = sc.nextInt();

        if (longitud < 3) {
            System.out.println("La longitud de la contraseña debe ser al menos 3 caracteres.");
            return;
        }
        char[] contrasenia = new char[longitud];
        boolean contieneMayuscula;
        boolean contieneMinuscula;
        boolean contieneDigito;
        do {
            contieneMayuscula = false;
            contieneMinuscula = false;
            contieneDigito = false;

            for (int i = 0; i < longitud; i++) {
                char caracter = (char) (random.nextInt(94)+33);
                contrasenia[i] = caracter;
                if(Character.isUpperCase(caracter)) {
                    contieneMayuscula = true;
                }else if (Character.isLowerCase(caracter)) {
                    contieneMinuscula = true;
                } else if (Character.isDigit(caracter)) {
                    contieneDigito = true;
                }
            }
        } while(!contieneMayuscula || !contieneMinuscula || !contieneDigito);

        String contraseniaGenerada = new String(contrasenia);
        System.out.println("La contraseña generada es: " + contraseniaGenerada);
        sc.close();
    }
}
