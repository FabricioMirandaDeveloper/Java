import java.util.Scanner;

public class ValidacionContraseña {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una contraseña");
        String password = scanner.next();
        if (password.length() < 8) {
            System.out.println("Contraseña no segura. Debe tener al menos 8 caracteres.");
        } else {
            boolean hasUppercase = false;
            boolean hasLowercase = false;
            boolean hasDigit = false;
            boolean hasSpecialChar = false;

            for (char c : password.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    hasUppercase = true;
                }
                if (Character.isLowerCase(c)) {
                    hasLowercase = true;
                }
                if (Character.isDigit(c)) {
                    hasDigit = true;
                }
                if (!Character.isLetterOrDigit(c)) {
                    hasSpecialChar = true;
                }
            }

            if (hasUppercase && hasLowercase && hasDigit && hasSpecialChar) {
                System.out.println("¡Contraseña segura! Cumple con todos los criterios.");
            } else if (!hasUppercase || !hasLowercase) {
                    System.out.println("Contraseña no segura. Debe contener al menos una letra mayúscula y una letra minúscula.");
            } else if (!hasDigit) {
                    System.out.println("Contraseña no segura. Debe contener al menos un número.");
            } else if (!hasSpecialChar) {
                    System.out.println("Contraseña no segura. Debe contener al menos un carácter especial (por ejemplo, !, @, #, $, etc.).");
            }
        }

    }
}
