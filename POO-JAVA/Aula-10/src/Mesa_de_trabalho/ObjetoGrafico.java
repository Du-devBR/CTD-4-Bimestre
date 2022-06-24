package Mesa_de_trabalho;

public class ObjetoGrafico {
    private int posx;
    private int posy;
    private char direcao;

    public int getPosx() {
        return posx;
    }

    public int getPosy() {
        return posy;
    }

    public char getDirecao() {
        return direcao;
    }

    public ObjetoGrafico(int x, int y, char direcao){
        this.posx = x;
        this.posy = y;
        this.direcao = direcao;
    }

    public void irA(int x, int y, char direcao){

    }


}
