import java.util.Scanner;

public class TablaDeMultiplicaar {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ingresa un número");
        int numero = pedirNumero();
        imprimirTablaMultiplicar(numero);
    }
    public static int pedirNumero() {
        return sc.nextInt();
    }
    public static void imprimirTablaMultiplicar(int numero)
    {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero+" x "+(i)+" = "+(numero*i));
        }
    }
}
