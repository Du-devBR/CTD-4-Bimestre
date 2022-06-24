package Mesa_de_trabalho;

public class Nave extends ObjetoGrafico{
    private double velocidade;
    private int vida;

    public Nave(int x, int y, char direcao, double velocidade, int vida) {
        super(x, y, direcao);
        this.velocidade = velocidade;
        this.vida = vida;
    }

    public void girar(char direcao){

    };

    public void restaVida(int valor){

    }

    @Override
    public void irA(int x, int y, char direcao) {
        super.irA(x, y, direcao);
    }
}
