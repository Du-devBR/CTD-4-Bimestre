package medotosAbstratos;

public abstract class Conta {
    private Double saldo;

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public abstract double depositar();

    public abstract double sacar();

    public abstract double mostrarSaldo();

}
