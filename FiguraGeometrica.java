import java.util.Scanner;

public class FiguraGeometrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero del 1 al 3 para seleccionar la figura");
        System.out.println("""
                Opción 1: "Circulo"
                Opción 2: "Cuadrado"
                Opción 3: "Triangulo"
               """);
        int number = scanner.nextInt();
        switch (number) {
            case 1 -> {
                System.out.println("Ingresa el radio");
                double radio = scanner.nextDouble();
                double areaCirculo = Math.PI * Math.pow(radio, 2);
                System.out.println("El área del círculo es: " + areaCirculo);
            }
            case 2 -> {
            System.out.print("Ingrese el lado del cuadrado: ");
            double lado = scanner.nextDouble();
            double areaCuadrado = Math.pow(lado, 2);
            System.out.println("El área del cuadrado es: " + areaCuadrado);
            }
            case 3 -> {
                System.out.print("Ingrese la base del triángulo: ");
                double base = scanner.nextDouble();
                System.out.print("Ingrese la altura del triángulo: ");
                double altura = scanner.nextDouble();
                double areaTriangulo = (base * altura) / 2;
                System.out.println("El área del triángulo es: " + areaTriangulo);
            }
            default -> System.out.println("Opción no válida. Por favor, ingrese un número del 1 al 3.");
        };

    }
}
