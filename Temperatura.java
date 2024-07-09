import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una temperatura: ");
        int temperatura = scanner.nextInt();
        System.out.print("Ingresa una unidad de medida (C/F): ");
        char medida = scanner.next().toLowerCase().charAt(0);
        if(medida == 'C') {
            double fahrenheit = (temperatura * 9/5) + 32;
            System.out.println("La temperatura en Fahrenheit es: " + fahrenheit);
        }else if (medida == 'F') {
            double celcius = (temperatura -32) * 5/9;
            System.out.println("La temperatura en Celsius es: " + celcius);
        }else {
            System.out.println("Unidad de medida no reconocida. Ingresa C o F.");
        }
    }
}
