class ObjetoPersona {
    String nombre;
    Integer edad;

    public void imprimirDatos() {
        System.out.println("Tu nombre es " + nombre + " y tienes " + edad + " años.");
    }
}

public class Main {
    public static void main(String[] args) {
        ObjetoPersona persona = new ObjetoPersona();
        persona.nombre = "Fabricio";
        persona.edad = 30;
        persona.imprimirDatos();
    }
}
