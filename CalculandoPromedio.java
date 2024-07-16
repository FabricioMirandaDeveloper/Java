import java.util.Arrays;

public class CalculandoPromedio {
    public static void main(String[] args) {
        float[] numeros = new float[20];
        for (int i = 0; i < numeros.length; i++) {
            float random = (float) (Math.random() * 100);
            numeros[i] = random;
        }
        System.out.println(Arrays.toString(numeros));
        float sumaTotal = 0;
        for(float numero : numeros) {
            sumaTotal += numero;
        }
        float promedio = sumaTotal / numeros.length;
        System.out.println("Suma de todos los elementos: " + sumaTotal);
        System.out.println("Promedio de los elementos: " + promedio);

    }
}
