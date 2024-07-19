import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        do {
        System.out.println("Ingresa un numero");
        numero = sc.nextInt();
        if(numero == 0) {
            System.out.println("Programa temrinado");
            break;
        }
        }while (numero != 0);
    }
}
