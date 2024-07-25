import java.util.Scanner;

public class NumerosPrimosPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de numeros primos que deseas obtener");
        int cantidad = sc.nextInt();
        int numerosEncontrados = 0;
        int numerosActual = 2;

        while (numerosEncontrados < cantidad) {
            if(esPrimo(numerosActual)) {
                System.out.print(numerosActual + " ");
                numerosEncontrados++;
            }
            numerosActual++;
        }
        sc.close();
    }
    public static boolean esPrimo(int numero) {
        if (numero <= 1) return  false;
        if (numero == 2) return true;
        if (numero % 2 == 0) return false;
        for (int i = 3; i * i <= numero; i += 2) {
            if(numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}

