import java.util.Scanner;

public class Calculadora {
    public static void main (String[] args) {
        System.out.println("Calculadora");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número");
        int number1 = scanner.nextInt();
        System.out.println("Ingresa un otro número");
        int number2 = scanner.nextInt();
        System.out.println("Selecciona la operación:");
        System.out.println("1: Suma");
        System.out.println("2: Resta");
        System.out.println("3: Multiplicación");
        System.out.println("4: División");
        int operacion = scanner.nextInt();
        double resultado = 0;
        switch (operacion) {
            case 1:
                resultado = number1 + number2;
                System.out.println("Resultado de la suma: " + resultado);
                break;
            case 2:
                resultado = number1 - number2;
                System.out.println("Resultado de la resta: " + resultado);
                break;
            case 3:
                resultado = number1 * number2;
                System.out.println("Resultado de la multiplicación: " + resultado);
                break;
            case 4:
                try {
                    resultado = number1 / number2;
                    System.out.println("Resultado de la división: " + resultado);
                } catch (ArithmeticException e) {
                    System.out.println("Error: División por cero no permitida."+e);
                }
                break;
        }
        scanner.close();
    }
}
