package mesaDeTrabalho;

public class Iates  extends Embarcacao implements Comparavel{
    private int cabine;
    public Iates(int cabine, double precoBase, int dataFabricao, float comprimento, Capitao capitao) {
        super(precoBase, dataFabricao, comprimento, capitao);
        this.cabine = cabine;
    }

    public int getCabine() {
        return cabine;
    }

    public void setCabine(int cabine) {
        this.cabine = cabine;
    }

    @Override
    public int compareTo(Iates iates) {
        int cabine1 = this.getCabine();
        int cabine2 = iates.getCabine();

        if (cabine1 > cabine2){
            return -1;
        } else if (cabine1 < cabine2) {
            return 1;
        }else {
            return 0;
        }
    }

    @Override
    public String toString() {
        if(getDataFabricao() >= 2020){
            return
                    "Iate" + "\n" +
                    "Ano de fabricação: " + getDataFabricao() + "\n" +
                    "Quantidade de cabines: " + cabine + "\n" +
                    "Preço: " + getPrecoBase() + "\n" +
                    "Valor adicional: " + setValorAdicional() + "\n" +
                    "Preco final: " + (getPrecoBase() + getValorAdicional());
        }else {
            return  "Iate" + "\n" +
                    "Ano de fabricação: " + getDataFabricao() + "\n" +
                    "Quantidade de mastros: " + cabine + "\n" +
                    "Preço: " + getPrecoBase() + "\n";
        }
    }
}
