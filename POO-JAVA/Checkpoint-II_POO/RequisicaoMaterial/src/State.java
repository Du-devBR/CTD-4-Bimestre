package RequisicaoMaterial.src;

public interface State {
    public void pedidoRecebido(Solicitacao solicitacao);
    public void pedidoEmSeparacao(Funcionario funcionario, Solicitacao solicitacao);
    public void pedidoDespachado();
    public void pedidoEntregue(String confimacao);
}
