package medotosAbstratos;

public class Main {
    public static void main(String[] args) {

        Conta_Poupanca poupanca1 = new Conta_Poupanca();
        poupanca1.setValorDepositado(6.0);
        poupanca1.setTaxaDeJuros(2.0);
        poupanca1.setValorSacado(5.0);
        poupanca1.setSaldo(0.0);

        Conta_Corrente corrente1 = new Conta_Corrente();
        corrente1.setValorDepositoCC(100.0);
        corrente1.setSaldo(0.0);
        corrente1.setValorSacadoCC(20.0);

        Cliente cliente = new Cliente(123456, "Eduardo Ananias", "121211211", "42222222222", "corrente");

        if (cliente.getTipoConta() == "poupanca") {
            cliente.setConta(poupanca1);
            System.out.println(cliente.toString() + "\n" + cliente.getConta());
        }else if (cliente.getTipoConta() == "corrente") {
            cliente.setConta(corrente1);
            System.out.println(cliente.toString() + "\n" + cliente.getConta());
        }
    }
}

//feito ate a etapa de escolha de contas, ja é possivel trazer os resultados.
