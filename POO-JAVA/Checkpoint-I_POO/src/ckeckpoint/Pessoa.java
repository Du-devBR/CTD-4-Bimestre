package ckeckpoint;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private String dataNasc;

//    CONSTRUCTOR
    public Pessoa(String nome, String sobrenome, String dataNasc) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;
    }
//    GETTERS AND SETTERS


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
