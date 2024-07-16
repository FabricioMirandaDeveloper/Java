import java.util.Scanner;

public class AdivinandoNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int random = (int) (Math.random() * 20) + 1;
        int number = 0;
        do {
            System.out.println("Adivina el numero entre 1 y 20");
            number = sc.nextInt();
            if(number < random) {
                System.out.println("El numero "+number+" es menor que "+random);
            } else if (number > random) {
                System.out.println("El numero "+number+" es mayor que "+random);
            }else {
                System.out.println("¡Felicidades! Has adivinado el número " + random + ".");
            }
        } while (number != random);
        sc.close();
    }
}
