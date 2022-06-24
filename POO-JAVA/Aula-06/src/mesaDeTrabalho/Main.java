package mesaDeTrabalho;

public class Main {
    public static void main(String[] args){
        Cachorro cachorro1 = new Cachorro("Poka", "vira-lata", 5, 2020, true, false);
        System.out.println(cachorro1.getNome());
        System.out.println(cachorro1.getRaca());
        System.out.println("Peso: " + cachorro1.getPeso() + " kilos");
        System.out.println(cachorro1.getAnoNascimento());
        System.out.println(cachorro1.mensagemChip());
        System.out.println(cachorro1.mensagemAptoParaAdotar());
        System.out.println("######################################################################");

        Cachorro cachorro2 = new Cachorro("Ozzy", "labrador", 30, 2013, true, true);
        System.out.println(cachorro2.getNome());
        System.out.println(cachorro2.getRaca());
        System.out.println(cachorro2.getPeso() + " kilos");
        System.out.println(cachorro2.getAnoNascimento());
        System.out.println(cachorro2.mensagemChip());
        System.out.println(cachorro2.mensagemAptoParaAdotar());
        System.out.println("######################################################################");
    }

}
