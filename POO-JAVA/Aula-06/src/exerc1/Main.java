package exerc1;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Impressora impressora1 = new Impressora();
        impressora1.setModelo("HP");
        impressora1.setTipoConexao("USB");
        impressora1.setDataFabricao(LocalDate.now());
        System.out.println(impressora1.getModelo());
        System.out.println(impressora1.getTipoConexao());
        System.out.println("Data da fabricação: " + impressora1.getDataFabricao());
        impressora1.setFolhasDisponiveis(6);
        System.out.println("Numero de folhas: " + impressora1.numeroDeFolhas());
        System.out.println("Status: " + "\n" + impressora1.imprimir("Lorem Ipsum é simplesmente um texto fictício da " +
                "indústria tipográfica e de impressão. " +
                "Lorem Ipsum tem sido o texto fictício padrão da indústria desde os anos 1500,"));
    }
}
