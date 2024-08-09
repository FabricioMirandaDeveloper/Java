public class GeneracionDeNumerosAleatorios {
    public static void main(String[] args) {
        System.out.println(numeroAleatorio());
    }
    public static int numeroAleatorio() {
        int number = (int) (Math.random() * 355 + 1);
        return number;
    }
}
