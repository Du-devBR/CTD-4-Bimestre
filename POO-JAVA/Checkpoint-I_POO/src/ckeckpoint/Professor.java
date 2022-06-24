package ckeckpoint;

import java.time.LocalDate;

public class Professor extends Pessoa {

    private int matricula;
    private String disciplina;
    private Double notaAtividadeAluno;
    private Aluno aluno;

//    CONSTRUCTOR

    public Professor(String nome, String sobrenome, String dataNasc, int matricula, String disciplina) {
        super(nome, sobrenome, dataNasc);
        this.matricula = matricula;
        this.disciplina = disciplina;
    }
//    GETTERS AND SETTERS

    public int getMatricula() {
        return matricula;
    }

    public String getDisciplina() {
        return disciplina;
    }


    public Double getNotaAtividadeAluno() {
        return notaAtividadeAluno;
    }

    public void setNotaAtividadeAluno(Double notaAtividadeAluno) {
        this.notaAtividadeAluno = notaAtividadeAluno;
    }

//    Sobreescrita para caso queira imprimir os dados de um professor em especifico.
    @Override
    public String toString() {
        return "Professor/a: " + getNome() + " " + getSobrenome() + "\n" +
                "Data de nascimento: " + getDataNasc() + "\n" +
                "Matricula: " + getMatricula() + "\n" +
                "Disciplina: " + getDisciplina();
    }
}
