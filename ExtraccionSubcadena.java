import java.util.Scanner;

public class ExtraccionSubcadena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una frase");
        String frase = scanner.nextLine();
        System.out.println("Ingresa dos numeros enteros");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(frase.substring(num1,num2));
    }
}
