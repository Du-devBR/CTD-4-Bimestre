package ExercicioGuiado;

import java.util.Date;

public abstract class Impressora {
    private String modelo;
    private String tipoConexao;
    private Date dataFabricacao;
    private int folhasDisponiveis;
    private Double porcentagemTinta;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoConexao() {
        return tipoConexao;
    }

    public void setTipoConexao(String tipoConexao) {
        this.tipoConexao = tipoConexao;
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public int getFolhasDisponiveis() {
        return folhasDisponiveis;
    }

    public void setFolhasDisponiveis(int folhasDisponiveis) {
        this.folhasDisponiveis = folhasDisponiveis;
    }

    public Double getPorcentagemTinta() {
        return porcentagemTinta;
    }

    public void setPorcentagemTinta(Double porcentagemTinta) {
        this.porcentagemTinta = porcentagemTinta;
    }

    public boolean temPapel(){
        if (folhasDisponiveis >= 1){
            return true;
        }else {
            return false;
        }
    }

    public boolean precisaTinta(){
        if(porcentagemTinta >= 10.0){
            return true;
        }else {
            return false;
        }
    }

    public abstract String imprimir();
}
