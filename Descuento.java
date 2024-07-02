import java.util.Scanner;

public class Descuento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el precio del producto");
        double productPrice = scanner.nextDouble();
        double discount = 0.10;
        double newPrice;
        if(productPrice >= 100) {
            newPrice = productPrice - (productPrice * discount);
            System.out.println("El nuevo precio es "+ newPrice);
        }else {
            System.out.println("El precio es "+ productPrice);
        }
    }
}
