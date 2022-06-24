package ExercicioArrayList;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String name;
    private String sobrenome;
    private int idade;
    private List<Conta>contas = new ArrayList<>();

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(Conta conta) {
        contas.add(conta);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNomeCompleto(){
        return getName() + " " + getSobrenome();
    }
    public boolean ehMaiorIdade(){
        if(getIdade() >= 18){
            return true;
        }else {
            return false;
        }
    }
    public double getSaldoTotal(){
        double soma = 0.0;
        for (Conta conta : contas){
            soma += conta.getSaldo().doubleValue();
        }return soma;
    }

    public String mostrarContas() {
        String contasCliente = "";
        int i = 1;
        for (Conta conta : contas) {
            contasCliente += "       Numero da conta " + (i++) + ": " + conta.getNumConta() + "\n             SALDO(" + conta.getSaldo() + ")\n";
        }
        return contasCliente;

    }

    @Override
    public String toString() {
        return
                "Nome Completo: " + getNomeCompleto() + "\n" +
                "Idade: " + getIdade() + " anos\n" +
                "Contas:\n" + mostrarContas() + "\n" +
                "       Saldo Total: " + getSaldoTotal();
    }
}
