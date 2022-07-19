package RequisicaoMaterial.src;

public class Empresa {
    private String nome;
    private Endereco endereco;
    private Funcionario funcionario;
    private Almoxarifado almoxarifado;

    public Empresa(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nome='" + nome + '\'' +
                ", endereco=" + endereco.toString() +
                '}';
    }
}
