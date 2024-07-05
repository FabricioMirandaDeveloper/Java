import java.util.Scanner;

public class ConversionMayusculaMinuscula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una palabra");
        String word = scanner.nextLine();
        System.out.println("""
                Selecciona la conversion
                1) Mayuscula
                2) Minuscula
                """);
        int option = scanner.nextInt();
        if(option == 1){
            System.out.println(word.toUpperCase());
        }else {
            System.out.println(word.toLowerCase());
        }
    }
}
