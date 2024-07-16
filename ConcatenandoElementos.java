public class ConcatenandoElementos {
    public static void main(String[] args) {
        String[] cadenas = {"a","b","c"};
        StringBuilder nuevaCadena = new StringBuilder();
        for (int i = 0; i < cadenas.length; i++) {
            nuevaCadena.append(cadenas[i]);
            if (i < cadenas.length-1) {
                nuevaCadena.append(" ");
            }
        }
        System.out.println("Cadena concatenada: "+nuevaCadena);
    }
}
