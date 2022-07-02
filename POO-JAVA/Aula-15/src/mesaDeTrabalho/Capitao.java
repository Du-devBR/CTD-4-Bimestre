package mesaDeTrabalho;

public class Capitao {
    private String nome;
    private String apelido;
    private int registroDeNavegacao;

    public Capitao(String nome, String apelido, int registroDeNavegacao) {
        this.nome = nome;
        this.apelido = apelido;
        this.registroDeNavegacao = registroDeNavegacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public int getRegistroDeNavegacao() {
        return registroDeNavegacao;
    }

    public void setRegistroDeNavegacao(int registroDeNavegacao) {
        this.registroDeNavegacao = registroDeNavegacao;
    }
}
