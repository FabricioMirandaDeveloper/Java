import java.util.Scanner;

public class CalculadoraSumaAcumulada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalSuma = 0;
        String respuesta = "";
        do {
            System.out.println("Ingresa un número entero positivo:");
            int numero = sc.nextInt();
            if(numero <= 0) {
                System.out.println("Número no válido. Debes ingresar un número entero positivo.");
                System.out.println("¿Deseas ingresar otro número? (si/no)");
                respuesta = sc.next();
                continue;
            }
            totalSuma += numero;
            System.out.println("¿Deseas ingresar otro número? (si/no)");
            respuesta = sc.next();
        } while (respuesta.equalsIgnoreCase("si"));
        System.out.println("La suma total es "+totalSuma);
    }
}
