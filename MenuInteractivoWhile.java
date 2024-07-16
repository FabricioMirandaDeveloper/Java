import java.util.Scanner;

public class MenuInteractivoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int options = 0;
        while (options != 5) {
            System.out.println("""
                Elije una opcion
                1) Comprar producto.
                2) Realizar devolución.
                3) Ver mis pedidos.
                4) Preguntas frecuentes.
                5) Salir.
                """);
            options = sc.nextInt();
            switch (options) {
                case 1:
                    System.out.println("Has elegido 'Comprar producto'.");
                    break;
                case 2:
                    System.out.println("Has elegido 'Realizar devolución'.");
                    break;
                case 3:
                    System.out.println("Has elegido 'Ver mis pedidos'.");
                    break;
                case 4:
                    System.out.println("Has elegido 'Preguntas frecuentes'.");
                    break;
                case 5:
                    System.out.println("Saliendo del menú. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del 1 al 5.");
                    break;
            }
        }
        sc.close();
    }
}
