import java.util.Scanner;

public class AreaPerimetro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la base");
        double base = scanner.nextDouble();
        System.out.println("Ingresa la altura");
        double altura = scanner.nextDouble();
        double perimetro = (2 * base) + (2 * altura);
        System.out.println("El perimetro es "+perimetro);
        double area = base * altura;
        System.out.println("El área es "+area);
    }
}
