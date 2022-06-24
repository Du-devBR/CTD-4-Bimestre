package medotosAbstratos;

public class Cliente {
    private int numeroDoCliente;
    private String nome;
    private String rg;
    private String cpf;
    private Conta conta;
    private String tipoConta;

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public Cliente(int numeroDoCliente, String nome, String rg, String cpf, String tipoConta) {
        this.numeroDoCliente = numeroDoCliente;
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.tipoConta = tipoConta;
    }

    public int getNumeroDoCliente() {
        return numeroDoCliente;
    }

    public void setNumeroDoCliente(int numeroDoCliente) {
        this.numeroDoCliente = numeroDoCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    @Override
    public String toString() {
        return "Numero da conta: " + getNumeroDoCliente() + "\n" +
                "Cliente: " + getNome() + "\n" +
                "RG: " + getRg() + "\n" +
                "CPF: " + getCpf() + "\n" +
                "Tipo da conta: " + getTipoConta();
    }
}
