import java.util.Scanner;

public class Calificacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número entre 0 y 100");
        double num= scanner.nextDouble(); 
        if(num >= 90 && num <= 100 ) {
            System.out.println("A");
        }else if(num >= 80 && num <= 89) {
            System.out.println("B");
        }else if(num >= 70 && num <= 79 ){
            System.out.println("C");
        }else if(num >= 60 && num <= 69 ){
            System.out.println("D");
        }else if(num >= 0 &&num < 60 ){
            System.out.println("F");
        }else {
            System.out.println("El número ingresado está fuera del rango válido");
        }
    }
}
