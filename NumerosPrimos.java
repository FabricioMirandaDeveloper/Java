import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        do {
        System.out.println("Introduce un número (0 para salir):");
        numero = sc.nextInt();
        if(numero == 0) {
            System.out.println("Programa terminado");
            break;
        }
        if (esPrimo(numero)) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo. Inténtalo de nuevo.");
        }
        }while (true);
        sc.close();
    }
    public static boolean esPrimo(int numero) {
        if(numero <= 1) return false;
        if(numero == 2) return true;
        if(numero % 2 == 0) return false;
        for (int i = 3; i * i <= numero; i += 2) {
            if(numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
