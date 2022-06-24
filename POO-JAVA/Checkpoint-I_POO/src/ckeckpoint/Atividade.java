package ckeckpoint;

import java.time.LocalDate;
import java.util.Date;

public class Atividade {
    private String tema;
    private String dataEntrega;
    private Professor professor;
    private Aluno aluno;

//    CONSTRUCTOR
    public Atividade(String tema, String dataEntrega, Professor professor, Aluno aluno) {
        this.tema = tema;
        this.dataEntrega = dataEntrega;
        this.professor = professor;
        this.aluno = aluno;

    }

// GETTERS AND SETTERS
    public Aluno getAluno() {
        return aluno;
    }

    public Professor getProfessor() {
        return professor;
    }

    public String getTema() {
        return tema;
    }

    public String getDataEntrega() {
        return dataEntrega;
    }

//Sobreescrita para cadastrar as atividades com todos os dados.
    @Override
    public String toString() {
        if (aluno.realizarAtividade(true)) {
            return
                    "Atividade: " + getTema() + "\n" +
                            "Disciplina: " + getProfessor().getDisciplina() + "\n" +
                            "Professor/a: " + getProfessor().getNome() + " " + getProfessor().getSobrenome() + "\n" +
                            "Aluno: " + getAluno().getNome() + " " + getAluno().getSobrenome() + "\n" +
                            "RA do aluno: " + getAluno().getRa() + "\n" +
                            "Data da atividade: " + getDataEntrega() + "\n"  +
                            "Nota: " + getProfessor().getNotaAtividadeAluno() + "\n" +
                            "Turma: "+ getAluno().getTurma();
        }else {
            return
                    "Atividade: " + getTema() + "\n" +
                            "Disciplina: " + getProfessor().getDisciplina() + "\n" +
                            "Professor/a: " + getProfessor().getNome() + " " + getProfessor().getSobrenome() + "\n" +
                            "Aluno: " + getAluno().getNome() + " " + getAluno().getSobrenome() + "\n" +
                            "RA do aluno: " + getAluno().getRa() + "\n" +
                            "Nota:  Aluno ainda não entregou atividade" + "\n" +
                            "Truma: " + getAluno().getTurma();
        }
    }
}
