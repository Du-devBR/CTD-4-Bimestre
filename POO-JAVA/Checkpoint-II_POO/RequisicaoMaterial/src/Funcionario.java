package RequisicaoMaterial.src;

import java.util.ArrayList;

public class Funcionario implements State{
    private String nome;
    private String sobrenome;
    private int id;
    private EnumCargo setor;
    private Endereco endereco;
    private ArrayList<Material> listaMateriais = new ArrayList<Material>();
    public Funcionario(String nome, String sobrenome, int id, EnumCargo setor, Endereco endereco) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.id = id;
        this.setor = setor;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EnumCargo getSetor() {
        return setor;
    }

    public void setSetor(EnumCargo setor) {
        this.setor = setor;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Material> getListaMateriais() {
        return listaMateriais;
    }

    public void setListaMateriais(Material material){
        this.listaMateriais.add(material);
    }

    public String informacosFuncionario(){
        return "" + getNome() + " " + getSobrenome() + "(ID: " + getId() + " SETOR: " + getSetor() + ")";
    }

    public String mostarMateriais(){
        String listaNomeMateriais = "Materiais selecionados \n     ";
        for (Material m : listaMateriais){
            listaNomeMateriais += "* " + m.getNome() + ";\n     ";
        }
        return listaNomeMateriais;
    }


    @Override
    public void pedidoRecebido(Solicitacao solicitacao) {

    }

    @Override
    public void pedidoEmSeparacao(Funcionario funcionario, Solicitacao solicitacao) {

    }

    @Override
    public void pedidoDespachado() {

    }

    @Override
    public void pedidoEntregue(String confimacao) {
        if (confimacao == "sim"){
            System.out.println(getNome() + " ID: " + getId() + ", confirmou produto entregue.");
        } else if (confimacao == "nao") {
            System.out.println("Produto ainda em rota para entrega");
        }
    }
}
