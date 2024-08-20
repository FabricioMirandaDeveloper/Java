package src.modelos;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangulo rectangulo = new Rectangulo();
        Triangulo triangulo = new Triangulo();
        Circulo circulo = new Circulo();

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Crear un rectángulo");
            System.out.println("2. Mostrar datos del rectángulo");
            System.out.println("3. Crear un triángulo");
            System.out.println("4. Mostrar datos del triángulo");
            System.out.println("5. Crear un círculo");
            System.out.println("6. Mostrar datos del círculo");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el ancho del rectángulo: ");
                    double ancho = scanner.nextDouble();
                    System.out.print("Ingrese el alto del rectángulo: ");
                    double alto = scanner.nextDouble();

                    rectangulo.setAncho(ancho);
                    rectangulo.setAlto(alto);
                    System.out.println("Rectángulo creado.");
                    break;

                case 2:
                    rectangulo.imprimirDatos();
                    break;

                case 3:
                    System.out.print("Ingrese la base del triángulo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingrese la altura del triángulo: ");
                    double altura = scanner.nextDouble();

                    triangulo.setBase(base);
                    triangulo.setAltura(altura);
                    System.out.println("Triángulo creado.");
                    break;

                case 4:
                    triangulo.imprimirDatos();
                    break;

                case 5:
                    System.out.print("Ingrese el radio del círculo: ");
                    double radio = scanner.nextDouble();

                    circulo.setRadio(radio);
                    System.out.println("Círculo creado.");
                    break;

                case 6:
                    circulo.imprimirDatos();
                    break;

                case 7:
                    System.out.println("Saliendo...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        }
    }
}

