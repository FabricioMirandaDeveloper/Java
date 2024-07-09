import java.util.Scanner;

public class GeneracionAleatoria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero enre 1 y 30");
        int numLimite = scanner.nextInt();
        int random = (int) (Math.random() * numLimite) + 1;
        double raiz = Math.sqrt(random);
        System.out.println("La raiz cuadrada del numero aleatorio "+random+" es "+raiz);
        boolean esPrimo = true;
        if(random <= 1) {
            esPrimo = false;
        }else {
            for (int i = 2; i <= Math.sqrt(random); i++) {
                if (random % i == 0) {
                    esPrimo = false; // Si tiene un divisor distinto de 1 y sí mismo, no es primo
                    break;
                }
            }
            if (esPrimo) {
                System.out.println("El número " + random + " es primo.");
            } else {
                System.out.println("El número " + random + " no es primo.");
            }
        }

    }
}
