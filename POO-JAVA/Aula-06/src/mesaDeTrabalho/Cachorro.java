package mesaDeTrabalho;
public class Cachorro {
    private String nome;
    private String raca;
    private double peso;
    private int anoNascimento;
    private boolean chip;
    private boolean ferimentos;

    public Cachorro(String nome, String raca, double peso, int anoNascimento, boolean chip, boolean ferimentos){
        this.nome = nome;
        this.raca = raca;
        this.peso = peso;
        this.anoNascimento = anoNascimento;
        this.chip = chip;
        this.ferimentos = ferimentos;
    }

    public String getNome(){
        return "Nome: " + nome;
    }

    public  String getRaca(){
        return "Raça: " + raca;
    }

    public double getPeso(){
        return peso;
    }
    public String getAnoNascimento(){
        return "Ano de nascimento: " + this.anoNascimento;
    }

    private boolean possuiChip(){
        if (this.chip){
            return true;
        }else {
            return false;
        }
    }
    public String mensagemChip(){
        if (possuiChip()){
            return "Possui chip de localização";
        }else {
            return "Chip de localização ainda não instalado";
        }
    }

    private boolean ferimentos(){
        if (this.ferimentos){
            return true;
        }else {
            return false;
        }
    }

    private boolean aptoParaAdocao(){
        if (this.peso >= 5 && this.ferimentos() == false){
            return true;
        }else {
            return false;
        }
    }
    public String mensagemAptoParaAdotar(){
        if (aptoParaAdocao()){
            return "Cachorrinho pronto para adoção";
        }else {
            return "Em breve ele estara em condições para adoção";
        }
    }

}
