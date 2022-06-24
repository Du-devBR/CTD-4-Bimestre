package mesaDeTrabalho;

public class UsuarioJogo {
    private String nome;
    private String nickname;
    private int pontuacao;
    private int nivel;
    private int adicionarBonus;

    public UsuarioJogo(String nome, String nickname){
        this.nome = nome;
        this.nickname = nickname;
        this.pontuacao = 0;
        this.nivel = 0;
        this.adicionarBonus = 0;
    }

    public String getNome(){
        return "Nome: " + this.nome + " " + "\n" + "Nickname: " + this.nickname;
    }

    public void aumentarPontuacao(int valor){

        this.pontuacao += valor;
        System.out.println("Sua pontuacao atual é de: " + this.pontuacao);

    }

    public void subirNivel(){

        if (this.pontuacao >= 2){
            this.nivel += 1;
        }else {
            this.nivel += 0;
        }
        System.out.println("Seu nivel atual é: " + this.nivel);
    }

    public void bonus(int valorBonus){


        if (this.pontuacao >= 2){
            this.pontuacao += valorBonus;
            System.out.println("Você ganhou mais " + valorBonus + " pontos de bonus!!!");
            System.out.println("Sua pontuação final é de " + this.pontuacao);
        }else {
            System.out.println("Não atingiu a meta para ganhar o bonus especial");
        }

    }
}
