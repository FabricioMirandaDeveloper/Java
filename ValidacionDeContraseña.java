import java.util.Scanner;

public class ValidacionDeContraseña {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = "secreto";
        System.out.println("Ingrese una contraseña");
        String correctPassword = "";
        while (!password.equals(correctPassword)) {
            correctPassword = sc.nextLine();
            if (!password.equals(correctPassword)) {
                System.out.println("La contraseña es incorrecta");
            }else {
                System.out.println("Felicidades la contraseña es correcta");
            }
        }
    }
}
