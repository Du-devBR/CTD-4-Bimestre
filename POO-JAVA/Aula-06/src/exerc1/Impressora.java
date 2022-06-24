package exerc1;

import java.time.LocalDate;

public class Impressora {
    private String modelo;
    private String tipoConexao;
    private LocalDate dataFabricao;
    private int folhasDisponiveis = 0 ;


    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getModelo(){
        return "Modelo: " + this.modelo;
    }

    public void setTipoConexao(String tipoConexao){
        this.tipoConexao = tipoConexao;
    }

    public String getTipoConexao(){
        return "Tipo de conexão: " + this.tipoConexao;
    }

    public void setDataFabricao(LocalDate dataFabricao){
        this.dataFabricao = dataFabricao;
    }

    public LocalDate getDataFabricao(){
        return this.dataFabricao;
    }

    public void setFolhasDisponiveis(int folhasDisponiveis){
        this.folhasDisponiveis = folhasDisponiveis;
    }

    private boolean temPapel(){
        if (this.folhasDisponiveis >= 1){
            return true;
        }else {
            return false;
        }
    }

    public int numeroDeFolhas(){
       return this.folhasDisponiveis = folhasDisponiveis;
    }

    public String imprimir(String texto){
        if (this.temPapel() == true){
            return texto;
        }
        return "Impressora sem papel";

    }
}

