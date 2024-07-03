import java.util.Scanner;

public class ConversionDeCalificacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una calificacíon numérica del 1 al 5");
        int calification = scanner.nextInt();
        String Finalcalification = switch (calification) {
            case 1 -> "Muy deficiente";
            case 2 -> "Deficiente";
            case 3 -> "Suficiente";
            case 4 -> "Notable";
            case 5 -> "Sobresaliente";
            default -> "Error, debes ingresar una calificacion numérica del 1 al 5";
        };
        System.out.println(Finalcalification);
    }
}
