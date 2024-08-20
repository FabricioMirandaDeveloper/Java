package src.modelos;

public class Triangulo {
    private double base;
    private double altura;

    // Constructor sin parámetros
    public Triangulo() {
        this.base = 0.0;
        this.altura = 0.0;
    }

    // Constructor con parámetros
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Métodos getter y setter
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Método para calcular el área
    public double area() {
        return 0.5 * this.base * this.altura;
    }

    // Método para imprimir los datos
    public void imprimirDatos() {
        System.out.println("La base es: " + this.base);
        System.out.println("La altura es: " + this.altura);
        System.out.println("El área es: " + this.area());
    }
}
