package CuentasBancarias;

public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void retirar(double cantidad) throws SaldoInsuficienteException {
        if (cantidad > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente. No puedes retirar " + cantidad + " cuando el saldo es " + saldo);
        }
        saldo -= cantidad;
    }

    public double getSaldo() {
        return saldo;
    }
}

