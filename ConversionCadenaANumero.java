import java.util.Scanner;

public class ConversionCadenaANumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Ingresa una cadena que represente un numero entero");
            String cadena = sc.nextLine();
            int numero = Integer.parseInt(cadena);
            System.out.println("El número es: "+numero);
        } catch (NumberFormatException e) {
            System.out.println("Error, debes ingresar una cadena que represente un numero entero: "+ e.getMessage());
        } finally {
            sc.close();
        }

    }
}
