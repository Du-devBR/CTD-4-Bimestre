package mesaDeTrabalho;

public class Embarcacao {
    private double precoBase;
    private double valorAdicional;
    private int dataFabricao;
    private float comprimento;
    private Capitao capitao;

    public Embarcacao(double precoBase, int dataFabricao, float comprimento, Capitao capitao) {
        this.precoBase = precoBase;
        this.dataFabricao = dataFabricao;
        this.comprimento = comprimento;
        this.capitao = capitao;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public double setValorAdicional() {
        return this.valorAdicional = 200.0;
    }

    public int getDataFabricao() {
        return dataFabricao;
    }

    public void setDataFabricao(int dataFabricao) {
        this.dataFabricao = dataFabricao;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public double calcularAluguel(){
        if (dataFabricao >= 2020){
            return precoBase + setValorAdicional();
        }else {
            return precoBase;
        }
    }

}
