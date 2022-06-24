public class Main {
    public static void main(String[] args) {

        ContaPoupanca conta1 = new ContaPoupanca();
        ContaCorrente conta2 = new ContaCorrente();
        conta1.setSaldo(100.0);
        conta1.setSaque(10.0);

        conta2.setPorcentagem(2.0);

        conta2.setSaldo(50.0);
        conta2.setSaque(20.0);


//        ContaCorrente conta1 = new ContaCorrente()

        System.out.println(conta1.informarSaldo());
    }
}
