import java.util.Scanner;

public class ValorRedondeado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero decimal");
        double num = scanner.nextDouble();
        num = Math.round(num);
        System.out.println(num);
    }
}
