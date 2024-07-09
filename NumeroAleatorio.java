import java.util.Scanner;

public class NumeroAleatorio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa dos números enteros");
        System.out.println("Limite infierior");
        int numinferior = scanner.nextInt();
        System.out.println("Limite superior");
        int numsuperior = scanner.nextInt();
        int random = (int) (Math.random() * (numsuperior - numinferior + 1)) + numinferior;
        System.out.println(random);
        scanner.close();
    }
}
