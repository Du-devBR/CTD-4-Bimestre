package RequisicaoMaterial.src;

public class Endereco {
    private String estado;
    private String cidade;
    private String rua;
    private int numero;
    private enumRegiao regiao;

    public Endereco(String estado, String cidade, String rua, int numero, enumRegiao regiao) {
        this.estado = estado;
        this.cidade = cidade;
        this.rua = rua;
        this.numero = numero;
        this.regiao = regiao;
    }

    public String getEstado() {
        return estado;
    }

    public String getCidade() {
        return cidade;
    }

    public String getRua() {
        return rua;
    }

    public int getNumero() {
        return numero;
    }

    public enumRegiao getRegiao() {
        return regiao;
    }

    @Override
    public String toString() {
        return  "\n" +
                "Estado " + estado + "\n" +
                "Cidade " + cidade + "\n" +
                "Rua " + rua + ", " + numero + "\n" +
                "Região " + regiao + "\n" +
                "####################################";
    }
}
