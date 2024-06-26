public class MiPrimerPrograma {
    public static void main(String[] args) {
        String saludo = "Hola Mundo";
        System.out.println(saludo);
        String nombre = "Fabricio";
        int edad = 23;
        String mensaje = String.format("nombre: %s edad: %d",nombre,edad);
        System.out.println(mensaje);
    }
}