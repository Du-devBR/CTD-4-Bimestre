public class ContaCorrente extends Conta implements GravarImpostos{

    private Double porcentagem;

    public Double getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(Double porcentagem) {
        this.porcentagem = porcentagem;
    }

    @Override
    public Double sacar() {
        if(informarSaldo() >= getSaque()){
            return getSaque();
        }else{
            return null;
        }
    }

    @Override
    public Double imposto() {
        return porcentagem;
    }

    @Override
    public Double informarSaldo() {
        return super.informarSaldo() - imposto();
    }
}
