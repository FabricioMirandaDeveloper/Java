import java.util.Scanner;

public class SerieFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la posicion de un numero en la serie de fibonacci");
        int posicion = sc.nextInt();

        if(posicion < 0 ) {
            System.out.println("Por favor, ingresa una posición válida (mayor o igual a 0).");
        } else if (posicion == 0) {
            System.out.println("El número en la posición 0 de la serie de Fibonacci es 0.");
        } else if (posicion == 1) {
            System.out.println("El número en la posición 1 de la serie de Fibonacci es 1.");
        }else {
            int a = 0;
            int b = 1;
            int fibonacci = 1;
            for (int i = 2; i <= posicion; i++) {
                fibonacci = a + b;
                a = b;
                b = fibonacci;
            }
            System.out.println("El número en la posición " + posicion + " de la serie de Fibonacci es " + fibonacci + ".");
        }
        sc.close();

    }
}
