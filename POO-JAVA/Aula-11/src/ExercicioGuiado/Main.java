package ExercicioGuiado;

public class Main {
    public static void main(String[] args) {

        ImpressoraEpson impressora1 = new ImpressoraEpson();
        impressora1.setModelo("Epson 3.0");
        impressora1.setFolhasDisponiveis(1);
        impressora1.setPorcentagemTinta(55.0);

        ImpressoraCannon impressora2 = new ImpressoraCannon();
        impressora2.setModelo("Cannon 2.0");
        impressora2.setFolhasDisponiveis(3);
        impressora2.setPorcentagemTinta(100.0);


        System.out.println(impressora1.imprimir());
        System.out.println(impressora2.imprimir());

    }
}
