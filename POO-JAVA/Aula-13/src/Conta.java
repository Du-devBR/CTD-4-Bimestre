public abstract class Conta {

    private Double saldo;
    private Double saque;

    public Double getSaque() {
        return saque;
    }

    public void setSaque(Double saque) {
        this.saque = saque;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public abstract Double sacar();

    public Double informarSaldo(){
        return saldo - getSaque();
    }
}
