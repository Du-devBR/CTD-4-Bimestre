package exerciciosExtras;

import java.text.ParseException;


public class MainExerc1 {
    public static void main(String[] args) throws ParseException {
        Exercicio1 pessoa1 = new Exercicio1("Eduardo", 1992, 1.78);
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getDataNascimento());
        System.out.println("Altura: " + pessoa1.getAltura() + "M");
    }
}
