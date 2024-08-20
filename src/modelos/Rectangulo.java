package src.modelos;

public class Rectangulo {
    private double ancho;
    private double alto;

    public Rectangulo() {
        this.ancho = 0.0;
        this.alto = 0.0;
    }
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
    public double getAncho(){
        return ancho;
    }
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    public double getAlto() {
        return alto;
    }
    public void setAlto(double alto) {
        this.alto = alto;
    }
    public double area() {
        return this.ancho * this.alto;
    }
    public double perimetro(){
        return 2 * (this.ancho + this.alto);
    }
    public void imprimirDatos() {
        System.out.println("El ancho es: " + this.ancho);
        System.out.println("El alto es: " + this.alto);
        System.out.println("Por lo tanto:");
        System.out.println("El área es: " + this.area());
        System.out.println("El perímetro es: " + this.perimetro());
    }
}