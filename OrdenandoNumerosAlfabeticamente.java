import java.util.Arrays;
import java.util.Scanner;

public class OrdenandoNumerosAlfabeticamente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nombres = new String[4];
        System.out.println("Ingresa 4 nombres");
        for (int i = 0; i < nombres.length; i++) {
        System.out.println("Nombre "+(i+1)+":");
        nombres[i] = sc.next();
        }
        Arrays.sort(nombres);
        System.out.println("nombres = " + Arrays.toString(nombres));
    }
}
