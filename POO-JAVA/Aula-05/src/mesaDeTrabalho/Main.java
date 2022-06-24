package mesaDeTrabalho;

public class Main {
    public static void main(String[] args){
        UsuarioJogo usuario1 = new UsuarioJogo("Eduardo", "@dubills");
        System.out.println(usuario1.getNome());
        usuario1.aumentarPontuacao(2);
        usuario1.subirNivel();
        usuario1.bonus(10);
        System.out.println("#########################################################");
        UsuarioJogo usuario2 = new UsuarioJogo("Camila", "@cal");
        System.out.println(usuario2.getNome());
        usuario2.aumentarPontuacao(5);
        usuario2.subirNivel();
        usuario2.bonus(10);
    }
}
