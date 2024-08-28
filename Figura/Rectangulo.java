package Figura;

public class Rectangulo extends Figura{
    private double largo, ancho;

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    @Override
    double calcularArea() {
        return largo * ancho;
    }

    @Override
    double calcularPerimetro() {
        return 2 * (largo + ancho);
    }
}
