public class ContaPoupanca extends Conta {

    @Override
    public Double sacar() {
        if(informarSaldo() >= getSaque()){
            return getSaque();
        }else{
            return null;
        }
    }

    @Override
    public Double informarSaldo() {
        return super.informarSaldo();
    }
}
