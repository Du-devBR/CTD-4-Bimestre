package exemploBanco;

public class Cliente {
    private int numeroCliente;
    private String nome;
    private double divida;

    public Cliente(int numero, String nome){
        this.numeroCliente = numero;
        this.nome = nome;
        this.divida = 0;
    }

    public String getNome(){
        return this.nome;
    }
    public double getDivida(double valor){
            return this.divida = valor;
    }

    public void setDivida(double valor){
        this.divida = valor;
    }

    public void aumentarDivida(double valor){
        this.divida += valor;
        System.out.println("Sua divida é de " + this.divida);
    }

    public void pagarDivida(double valor){
        if (this.divida <= 0){
            System.out.println("Você não tem divida.");
        }else {
            this.divida -= valor;
            System.out.println("Sua divida é de " + this.divida);
        }
    }
}
