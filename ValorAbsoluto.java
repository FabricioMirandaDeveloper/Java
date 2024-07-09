import java.util.Scanner;

public class ValorAbsoluto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero entero");
        int num = scanner.nextInt();
        System.out.println(Math.abs(num));
    }
}
