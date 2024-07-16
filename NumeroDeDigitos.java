import java.util.Scanner;

public class NumeroDeDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int number = sc.nextInt();
        int originalNumber = number;
        int contadorDigitos = 0;
        number = Math.abs(number);
        if (number == 0 ) {
            contadorDigitos = 1;
        }else {
            while (number > 0) {
                number = number / 10;
                contadorDigitos++;
            }
        }
        System.out.println("El numero "+originalNumber+" tiene "+contadorDigitos+" digitos");
    }
}
