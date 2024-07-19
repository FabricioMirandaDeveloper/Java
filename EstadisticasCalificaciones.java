import java.util.*;

public class EstadisticasCalificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Ingrese la cantidad de calificaciones a generar:");
        int cantitadCalificaciones = sc.nextInt();

        String[] calificaciones = new String[cantitadCalificaciones];
        List<Double> calificacionesNumericas = new ArrayList<>();

        for (int i = 0; i < cantitadCalificaciones; i++) {
            calificaciones[i] = String.format("%.2f",random.nextDouble() * 20);
            calificacionesNumericas.add(Double.parseDouble(calificaciones[i]));
        }
        System.out.println("Calificaciones generadas: " + Arrays.toString(calificaciones));

        List<Double> desaprobado = new ArrayList<>();
        List<Double> aprobado = new ArrayList<>();
        List<Double> excelente = new ArrayList<>();

        for (Double valor : calificacionesNumericas) {
            if(valor < 4) {
                desaprobado.add(valor);
            }else if(valor >= 4 && valor < 10) {
                aprobado.add(valor);
            } else if (valor >= 10) {
                excelente.add(valor);
            }
        }

        double promedioOriginal = calcularPromedio(calificacionesNumericas);
        double promedioDesaprobado = calcularPromedio(desaprobado);
        double promedioAprobado = calcularPromedio(aprobado);
        double promedioExcelente = calcularPromedio(excelente);

        System.out.println("Calificaciones desaprobado (< 4): " + desaprobado);
        System.out.println("Promedio desaprobado: " + String.format("%.2f", promedioDesaprobado));

        System.out.println("Calificaciones aprobado (>= 4 y < 10): " + aprobado);
        System.out.println("Promedio aprobado: " + String.format("%.2f", promedioAprobado));

        System.out.println("Calificaciones excelente (>= 10): " + excelente);
        System.out.println("Promedio excelente: " + String.format("%.2f", promedioExcelente));

        System.out.println("Promedio general: " + String.format("%.2f", promedioOriginal));
        sc.close();
    }

    public static double calcularPromedio(List<Double> lista){
        if(lista.isEmpty()) return 0.0;
        double suma = 0;
        for(Double valor : lista) {
            suma +=valor;
        }
        return  suma / lista.size();
    }
}
