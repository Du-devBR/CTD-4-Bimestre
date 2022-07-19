package RequisicaoMaterial.src;

public class Material {
    private String nome;
    private String descricao;
    private enumTipo tipo;

    public Material(String nome, String descricao, enumTipo tipo) throws Exception{
        this.nome = nome;
        this.descricao = descricao;
        this.tipo = tipo;
        if (nome == ""){
            throw new Exception("Material não pode ter um nome em branco");
        }
    }

    public void setNome(String nome) throws Exception {
        this.nome = nome;
        if (getNome() == ""){
            throw new Exception("Nome não pode ficar em branco");
        }
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setTipo(enumTipo tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public enumTipo getTipo() {
        return tipo;
    }
}
