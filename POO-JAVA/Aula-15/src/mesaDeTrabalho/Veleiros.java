package mesaDeTrabalho;

public class Veleiros  extends Embarcacao{
    private int mastros;
    public Veleiros(int mastros, double precoBase, int dataFabricao, float comprimento, Capitao capitao) {

        super(precoBase, dataFabricao, comprimento, capitao);
        this.mastros = mastros;
    }

    public boolean eGrande(){
        if (mastros >= 4){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String toString() {

        if(getDataFabricao() >= 2020){
            return
                    "Veleiro" + "\n" +
                    "Ano de fabricação: " + getDataFabricao() + "\n" +
                    "Quantidade de mastros: " + mastros + "\n" +
                    "Preço: " + getPrecoBase() + "\n" +
                    "Valor adicional: " + setValorAdicional() + "\n" +
                    "Preco final: " + (getPrecoBase() + getValorAdicional());
        }else {
            return  "Veleiro" + "\n" +
                    "Ano de fabricação: " + getDataFabricao() + "\n" +
                    "Quantidade de mastros: " + mastros + "\n" +
                    "Preço: " + getPrecoBase() + "\n";
        }
    }
}
