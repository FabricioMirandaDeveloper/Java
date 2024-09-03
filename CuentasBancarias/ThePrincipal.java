package CuentasBancarias;

import java.util.Scanner;

public class ThePrincipal {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(1000);
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Saldo actual: " + cuenta.getSaldo());
            System.out.print("Ingresa el monto a retirar: ");
            double cantidad = scanner.nextDouble();
            cuenta.retirar(cantidad);
            System.out.println("Retiro exitoso. Saldo restante: " + cuenta.getSaldo());
        } catch (SaldoInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

