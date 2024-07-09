import java.util.Scanner;

public class CalcularRaizCuadrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero positivo");
        int num = scanner.nextInt();
        if(num <= 0) {
            System.out.println("Debes ingresar un numero positivo");
        }else {
        System.out.println(Math.sqrt(num));
        }
    }
}
