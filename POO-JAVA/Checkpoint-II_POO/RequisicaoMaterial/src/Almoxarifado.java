package RequisicaoMaterial.src;

import java.util.ArrayList;
import java.util.List;

public class Almoxarifado implements State {
    private Endereco endereco;
    private List<Material> materiais = new ArrayList<>();
    private List<Solicitacao> solitacoes = new ArrayList<>();

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Material> getMateriais() {
        return (this.materiais);
    }

    public List<Solicitacao> getSolicitacao() {
        return solitacoes;
    }

    public void setMateriais(Material materiais) {
        this.materiais.add(materiais);
    }

    public void setSolicitacao(Solicitacao solicitacao) {
        this.solitacoes.add(solicitacao);
    }

    public void compareTo(Material material) {}

    public String listaDeSolicitacoes(){
        String solicitacoesDeMateriais = "";
        for (Solicitacao s : solitacoes){
            solicitacoesDeMateriais += s.toString() + "\n";
        }return solicitacoesDeMateriais;
    }

    public String listarMateriais(){
        String estoque = "";
        int i = 1;
        for (Material material : materiais){
            estoque += "Tipo: " + material.getTipo() + "\n" +
                       "Nome: " + material.getNome() + "\n" +
                       "Descrição: " + material.getDescricao() + "\n" +
                       "###############################################" + "\n";
        }
        return estoque;
   }

    @Override
    public void pedidoRecebido(Solicitacao solicitacao) {
        if(listaDeSolicitacoes() == ""){
            System.out.println("Solicitação: " + solicitacao.getNumero() + "Pedido não encontrado!");
            System.out.println("######################################");

        }else {
            System.out.println("Solitação: " + solicitacao.getNumero() + " pedido recebido!");
            System.out.println("######################################");
        }
    }

    @Override
    public void pedidoEmSeparacao(Funcionario funcionario, Solicitacao solicitacao){
        for (Material m : materiais){
            if (funcionario.mostarMateriais().contains(m.getNome())){
                System.out.println("Numero da solicitação: " + solicitacao.getNumero() + "\n" + m.getNome() + ": " + " Pedido em separação");
                pedidoDespachado();
                System.out.println("------------------------------------------");
            }else {
                System.out.println("Numero da solicitação: " + solicitacao.getNumero() + "\n" + m.getNome() + ": " + " Sem material no estoque, encaminhado para compra!");
                System.out.println("-------------------------------------------");
            }
        }

    }

    @Override
    public void pedidoDespachado() {
        System.out.println("Pedido depaschado");
    }

    @Override
    public void pedidoEntregue(String confimacao) {

    }
}


// feito state em separação.