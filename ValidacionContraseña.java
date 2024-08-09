import java.util.Scanner;

public class ValidacionContraseña {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una contraseña");
        String password = scanner.next();

        if(esSegura(password)) {
            System.out.println("¡Contraseña segura! Cumple con todos los criterios.");
        }else {
            System.out.println("Contraseña no segura.");
            if(!hasCorrectLength(password)) {
                System.out.println("Debe tener al menos 8 caracteres.");
            }
            if(!hasUpperCase(password)){
                System.out.println("Debe contener al menos una letra mayúscula.");
            }
            if(!hasLowerCase(password)){
                System.out.println("Debe contener al menos una letra minúscula.");
            }
            if(!hasDigit(password)) {
                System.out.println("Debe contener al menos un número.");
            }
            if(!hasSpecialChar(password)) {
                System.out.println("Debe contener al menos un carácter especial (por ejemplo, !, @, #, $, etc.).");
            }
        }
    }
    public static boolean esSegura(String password) {
        return hasCorrectLength(password) && hasUpperCase(password) && hasLowerCase(password) && hasDigit(password) && hasSpecialChar(password);
    }
    public static boolean hasCorrectLength(String password) {
        return password.length() >= 8;
    }
    public static boolean hasUpperCase(String password) {
        for (char c: password.toCharArray()) {
            if(Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }
    public static boolean hasLowerCase(String password) {
        for (char c: password.toCharArray()) {
            if(Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }
    public static boolean hasDigit(String password) {
        for (char c : password.toCharArray()) {
            if(Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
    public static boolean hasSpecialChar(String password) {
        for(char c : password.toCharArray()){
            if(!Character.isLetterOrDigit(c)) {
                return true;
            }
        }
        return false;
    }
}