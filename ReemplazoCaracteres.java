import java.util.Scanner;

public class ReemplazoCaracteres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una frase");
        String frase = scanner.nextLine();
        System.out.println("Ingresa el caracter a reemplazar");
        char a = scanner.next().charAt(0);
        System.out.println("Ingresa el caracter a cambiar");
        char b = scanner.next().charAt(0);
        System.out.println(frase.replace(a,b));
    }
}
