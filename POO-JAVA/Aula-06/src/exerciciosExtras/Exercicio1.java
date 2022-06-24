package exerciciosExtras;

import java.time.LocalDate;
public class Exercicio1 {
    private String nome;
    private int dataNascimento;
    private double altura;

    public Exercicio1(String nome, int data, double altura){
        this.nome = nome;
        this.dataNascimento = data;
        this.altura = altura;
    }

    public String getNome(){
        return nome;
    }

    public int getDataNascimento(){
        int idade = LocalDate.now().getYear() - this.dataNascimento;
        return idade;
    }

    public double getAltura(){
        return altura;
    }


}
