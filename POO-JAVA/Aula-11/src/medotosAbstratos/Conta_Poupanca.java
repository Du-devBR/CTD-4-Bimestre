package medotosAbstratos;

public class Conta_Poupanca extends Conta {
    private Double taxaDeJuros;
    private Double valorDepositado;
    public Double getValorSacado() {
        return valorSacado;
    }

    public void setValorSacado(Double valorSacado) {
        this.valorSacado = valorSacado;
    }

    private Double valorSacado;

    public Double getTaxaDeJuros() {
        return taxaDeJuros;
    }

    public void setTaxaDeJuros(Double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }

    public Double getValorDepositado() {
        return valorDepositado;
    }

    public void setValorDepositado(Double valorDepositado) {
        this.valorDepositado = valorDepositado;
    }

    public Double saldoContaPoupanca(){
        return depositar() + getSaldo();
    }

    @Override
    public double depositar() {
        return ((valorDepositado * taxaDeJuros)/100) + valorDepositado;
    }

    @Override
    public double sacar() {
        return valorSacado;
    }

    @Override
    public double mostrarSaldo() {
        return saldoContaPoupanca() - sacar();
    }

    @Override
    public String toString() {
        return
                "Deposito: " + getValorDepositado() + " com taxa de juros de " + getTaxaDeJuros() + "\n" +
                "Saldo após deposito: " + depositar() + "\n" +
                "Saque: " + getValorSacado() + "\n" +
                "Saldo Atual: " + mostrarSaldo();
    }
}
