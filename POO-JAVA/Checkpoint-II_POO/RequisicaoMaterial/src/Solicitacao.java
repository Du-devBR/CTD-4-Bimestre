package RequisicaoMaterial.src;

public class Solicitacao {

    private int numero;
    private int data;
    private int quantidade;
    private Almoxarifado almoxarifado;
    private Funcionario funcionario;


    public Solicitacao(int numero, int data, int quantidade, Almoxarifado almoxarifado, Funcionario funcionario) {
        this.numero = numero;
        this.data = data;
        this.quantidade = quantidade;
        this.almoxarifado = almoxarifado;
        this.funcionario = funcionario;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Almoxarifado getAlmoxarifado() {
        return almoxarifado;
    }

    public void setAlmoxarifado(Almoxarifado almoxarifado) {
        this.almoxarifado = almoxarifado;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public String toString(){
        return "Solicitacao: " + numero + "\n" +
                "Data: " + data + "\n" +
                "Funcionario: " + getFuncionario().informacosFuncionario() + "\n" +
                "Materiais Solicitados:\n     " + funcionario.mostarMateriais() + "\n"+
                "######################################## \n";
    }

}



