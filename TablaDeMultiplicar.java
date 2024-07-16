import java.util.Scanner;

public class TablaDeMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 1;
        while (number != 0) {
            System.out.println("Ingresa un numero");
            number = sc.nextInt();
            for (int i = 0; i <= 12; i++) {
                System.out.println(number+" x "+i+" = "+(number*i));
            }
        }
    }
}
