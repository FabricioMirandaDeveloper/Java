import java.util.Scanner;

public class OperadoresDeComparacion {
    public static void main(String[] args) {
        System.out.println("Ingresa un numero entero");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println("Ingresa un segundo numero entero");
        int num2 = scanner.nextInt();
        Boolean comparacion = num1 > num2;
        System.out.println("El numero "+ num1 +" es mayor a "+ num2 +" ? = "+ comparacion);
        System.out.println(num1 == num2 ? "Son iguales" : "Son distintos");
        System.out.println(num1 % 2 == 0 ? "El numero "+ num1 +" es divisible por 2" : "El numero "+ num1 +" no es divisible por 2");
        System.out.println("Ingresa un tercer numero entero");
        int num3 = scanner.nextInt();
        System.out.println("Ingresa un cuarto numero entero");
        int num4 = scanner.nextInt();
        String mayor1 = (num1 > num2) ? "mayor" : "no mayor";
        String mayor3 = (num3 > num4) ? "mayor" : "no mayor";
        System.out.println("El número 1 es " + mayor1 + " que el número 2 y el número 3 es " + mayor3 + " que el número 4.");
    }
}
