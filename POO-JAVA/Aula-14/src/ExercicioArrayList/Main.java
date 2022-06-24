package ExercicioArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Pessoa cliente1 = new Pessoa();
        cliente1.setName("Eduardo");
        cliente1.setSobrenome("Ananias");
        cliente1.setIdade(29);


        Pessoa cliente2 = new Pessoa();
        cliente2.setName("Camila");
        cliente2.setSobrenome("Ananias");
        cliente2.setIdade(28);


        Conta conta1 = new Conta();
        conta1.setNumConta(14563);
        conta1.setSaldo(100.0);

        Conta conta2 = new Conta();
        conta2.setNumConta(14562);
        conta2.setSaldo(200.0);

        Conta conta3 = new Conta();
        conta3.setNumConta(14523);
        conta3.setSaldo(50.0);

        Conta conta11 = new Conta();
        conta11.setNumConta(14563);
        conta11.setSaldo(100.0);

        Conta conta22 = new Conta();
        conta22.setNumConta(14562);
        conta22.setSaldo(210.0);

        Conta conta33 = new Conta();
        conta33.setNumConta(14523);
        conta33.setSaldo(55.0);


        cliente1.setContas(conta1);
        cliente1.setContas(conta2);
        cliente1.setContas(conta3);

        cliente2.setContas(conta11);
        cliente2.setContas(conta22);
        cliente2.setContas(conta33);
        System.out.println(cliente1.toString());
        System.out.println(cliente2.toString());

    }
}
