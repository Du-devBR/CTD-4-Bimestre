package ExercicioArrayList;

public class Conta implements Comparavel{
    private int numConta;
    private Double saldo;

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public int compareTo(Conta obj) {
        return 0;
    }
}
