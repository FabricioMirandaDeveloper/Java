public class MiPrimerPrograma {
    public static void main(String[] args) {
        String saludo = "Hola Mundo";
        System.out.println(saludo);
        String bienvenida = "Bienvenido a tu curso de Java";
        System.out.println(bienvenida);
        String nombre = "Fabricio";
        System.out.println("Mi nombre es " + nombre);
        System.out.println((String.format("Mi nombre es %s", nombre)));
        int edad = 23;
        System.out.println("Mi edad es " + edad);
        System.out.println(String.format("Mi edad es %d", edad));
        String mensaje = String.format("Mi nombre es %s y tengo %d años",nombre,edad);
        System.out.println(mensaje);
        boolean online = true;
        boolean ofline = false;
        char letra = 'a';
        String dia = "Lunes";
        int numero = 7;
        long numero2 = 1010101;
        float decimal = 11.599f;
        double decimal2 = 15.36;
        System.out.println(String.format("%b %b %c %s %d %d %f %f",online, ofline, letra, dia, numero, numero2, decimal, decimal2));

//        La temperatura media de una ciudad durante el verano (en grados Celsius).
        double temperatura = 20;
//        El precio de un producto en una tienda (en dólares y centavos).
        double dolaresYCentavos = 135.20;
//        El nombre completo de una persona.
        String name = "Fabricio Miranda";
//        La fecha de nacimiento de una persona.
        String nacimiento = "04/09/2025";
//        El número de habitantes de una ciudad.
        long habitantes = 1564984654;
//        La duración de una película (en minutos).
        byte pelicula = 100;
//        Si un artículo está disponible o no en una tienda (true/false).
        boolean disponible = true;
        boolean noDisponible = false;
//        La distancia entre dos ciudades (en kilómetros).
        int distancia = 51156416;
//        El número de teléfono de una persona.
        int numero5 = 980795514;
//        La cantidad de existencias de un producto en una tienda.
        int cantidad = 1580;
        String mensajeBienvenida = "Bienvenido Fabricio";
        byte temperaturaActual = 19;
        boolean datoLogico = true;
        System.out.println(String.format("%s la temperatura es de %d grados la %b pe", mensajeBienvenida, temperaturaActual, datoLogico));
    }
}