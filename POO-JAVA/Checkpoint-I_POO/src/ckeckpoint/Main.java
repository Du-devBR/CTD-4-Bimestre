package ckeckpoint;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
//        FORMATADOR PARA DA DE ENTREGA ATIVIDADE
        LocalDate dataAtual = LocalDate.now();
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = dataAtual.format(formatoData);


//        OBJETO PROFESSOR
        Professor professor1 = new Professor("Jośe", "Souza", "01/01/1980", 12345, "POO");
        professor1.setNotaAtividadeAluno(10.0);
        Professor professor2 = new Professor("Camila", "Silva", "01/01/1980", 22345, "Testing");
        professor2.setNotaAtividadeAluno(10.0);

//        OBJETO ALUNO
        Aluno aluno1 = new Aluno("João", "Silva", "01/01/2000", 123456, "A01", false);
        Aluno aluno2 = new Aluno("Maria", "Araujo", "01/01/2000", 124567, "B01", true);

//        OBJETO ATIVIDADE
        Atividade atividadeProf1 = new Atividade("POO com java", dataFormatada, professor1, aluno1);
        Atividade atividadeProf2 = new Atividade("Testing em componentes", dataFormatada, professor2, aluno2);

//        CONDIÇÃO PARA IMPRESSÃO DA ATIVIDADE ALUNO 1 ENTREGUE OU NÃO.
        if (aluno1.realizarAtividade(true)) {
            System.out.println(atividadeProf1.toString());
            System.out.println("####################################");
            System.out.println(atividadeProf2.toString());


        }else {
            System.out.println(atividadeProf1.toString());
            System.out.println("####################################");
            System.out.println(atividadeProf2.toString());
        }
        System.out.println("####################################################");
        if (aluno2.realizarAtividade(true)) {
            System.out.println(atividadeProf1.toString());
            System.out.println("####################################");
            System.out.println(atividadeProf2.toString());

        }else {
            System.out.println(atividadeProf1.toString());
            System.out.println("####################################");
            System.out.println(atividadeProf2.toString());
        }

    }
}

//proxima etapa será trabalhar com arrays para atividade, professores e aluno e trabalhar com a logica integrando esses objetos com base no array.