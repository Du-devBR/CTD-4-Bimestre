package medotosAbstratos;

public class Conta_Corrente extends Conta{
    private Double valorDisponivelSaque;
    private Double valorDepositoCC;

    public Double getValorDepositoCC() {
        return valorDepositoCC;
    }

    public void setValorDepositoCC(Double valorDepositoCC) {
        this.valorDepositoCC = valorDepositoCC;
    }

    private Double valorSacadoCC;

    public Double getValorSacadoCC() {
        return valorSacadoCC;
    }

    public void setValorSacadoCC(Double valorSacadoCC) {
        this.valorSacadoCC = valorSacadoCC;
    }

    public Double getValorDisponivelSaque() {
        return valorDisponivelSaque;
    }

    public void setValorDisponivelSaque(Double valorDisponivelSaque) {
        this.valorDisponivelSaque = valorDisponivelSaque;
    }

    @Override
    public double depositar() {
        return valorDepositoCC + getSaldo();
    }

    @Override
    public double sacar() {
        return valorSacadoCC;
    }

    @Override
    public double mostrarSaldo() {
        return valorDepositoCC - valorSacadoCC;
    }
// aqui precisa de uam variavel para guardar o valor do saldo atualizado.
    @Override
    public String toString() {
        return
                        "Deposito: " + getValorDepositoCC() +"\n" +
                        "Saldo após deposito: " + depositar() + "\n" +
                        "Saque: " + getValorSacadoCC() + "\n" +
                        "Saldo Atual: " + mostrarSaldo();
    }
}
