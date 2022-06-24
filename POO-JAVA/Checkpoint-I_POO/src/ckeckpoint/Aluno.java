package ckeckpoint;

import java.time.LocalDate;

public class Aluno extends Pessoa {
    private int ra;
    private String turma;
    private Boolean atividadeEntregue;

//    CONSTRUCTOR


    public Aluno(String nome, String sobrenome, String dataNasc, int ra, String turma, Boolean atividadeEntregue) {
        super(nome, sobrenome, dataNasc);
        this.ra = ra;
        this.turma = turma;
        this.atividadeEntregue = atividadeEntregue;
    }
//GETTTERS AND SETTERS

    public int getRa() {
        return ra;
    }

    public String getTurma() {
        return turma;
    }

    public Boolean getAtividadeEntregue() {
        return atividadeEntregue;
    }

    public boolean realizarAtividade(Boolean atividadeEntregue){
        if (getAtividadeEntregue() == true){
            return true;
        }else {
            return false;
        }
    }

    //    Sobreescrita para caso queira imprimir os dados de um aluno em especifico.
    @Override
    public String toString() {
        return "Aluno: " + getNome();
    }
}

