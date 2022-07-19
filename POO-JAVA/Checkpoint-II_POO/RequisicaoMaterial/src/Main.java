package RequisicaoMaterial.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        CRIE UMA NOVA INSTANCIA ENDEREÇO OU DESCOMENTE O CODIGO
//        (A instancia endereco pode ser usada para empresa, funcionario e almoxarifado)
        Endereco endereco1 = new Endereco("SP", "mogi das cruzes", "Dos bobos", 0, enumRegiao.LESTE);

//        CRIE UMA NOVA INSTANCIA EMPRESA OU DESCOMENTE O CODIGO
        Empresa empresa1 = new Empresa("DH", endereco1);

//        IMPRIMA A EMPRESA ADICIONADA
//        System.out.println(empresa1);

        Material material1 = null;
        Material material2 = null;
        Material material3 = null;
        Material material4 = null;
        Material material5 = null;

//        Exception caso o nome do material seja nulo ou em branco
//        TIPO DE MATERIAIS PODEM SER ADICIONADO EM EnumTipo, para testes possui (PLASTICO, PAPEL, FERRO)

        try {
            material1 = new Material("Caneta azul", "caneta azul", enumTipo.PLASTICO);
            material2 = new Material("Barra de ferro", "Aço 1020 - SAE", enumTipo.FERRO);
            material3 = new Material("Folha Sufite", "Pacote com 1000 folhas", enumTipo.PAPEL);
            material4 = new Material("Caixa de papelão", "caixa para embalar", enumTipo.PAPEL);
//            simule uma exeption
//            material5 = new Material("", "caixa para embalar", enumTipo.PAPEL);
        } catch (Exception e) {
            System.out.println(e);
        }

//      CRIE UMA NOVA INSTANCIA ALMOX OU DESCOMENTE O CODIGO
        Almoxarifado almox1 = new Almoxarifado();
//        Almoxarifado almox2 = new Almoxarifado();
//        Adicionar um endereço ao almox

        almox1.setEndereco(endereco1);
//        almox1.setEndereco(endereco1);

//        Adicione materiais ao almox.
        almox1.setMateriais(material1);
        almox1.setMateriais(material2);
        almox1.setMateriais(material3);
        almox1.setMateriais(material4);

//        DESCOMENTE PARA VER A LISTA DOS MATERIAIS AO ALMOX1
//        System.out.println(almox1.listarMateriais());

//        CRIE UMA NOVA INSTANCIA ENDEREÇO OU DESCOMENTE O CODIGO
        Funcionario funcionario1 = new Funcionario("Eduardo", "Ananias", 12345, EnumCargo.COORDENACAO, endereco1);
        //        Adicione outro funcionario
//        Funcionario funcionario2 = new Funcionario("Camila", "Araujo", 12348, EnumCargo.ADMINISTRACAO, endereco1);

//        Funcionario pode adicionar os materiais a sua lista com o ARRAYLIST
//        Comente um dos codigos abaixo e ira aparecer no console que produto pedido não possui no almox e sera enviado para compras.
        funcionario1.setListaMateriais(material1);
        funcionario1.setListaMateriais(material2);
        funcionario1.setListaMateriais(material3);
        funcionario1.setListaMateriais(material4);

//        DESCOMENTE PARA VER A LISTA DOS MATERIAIS SELECIONADOS POR FUNCIONARIO
//        System.out.println(funcionario1.mostarMateriais());

        //        Adicione materiais a outro funcionario
//        funcionario2.setListaMateriais(material3);
//        funcionario2.setListaMateriais(material1);

//        Crie uma solitação e atrele a um funcionario
        Solicitacao solicitacao1 = new Solicitacao(123, 2021, 1, almox1, funcionario1);
//        Solicitacao solicitacao2 = new Solicitacao(223, 2021, 1, almox1, funcionario2);

//        DESCOMENTE PARA VERIFICAR TODOS OS DADOS DE UMA SOLICITAÇÃO
//        System.out.println(solicitacao1.toString());

        System.out.println("#####################################");
        System.out.println("ALMOARIFADO: " + almox1.getEndereco());

//        Metodo em States para verificar se pedido foi recebido
        almox1.setSolicitacao(solicitacao1);
        almox1.pedidoRecebido(solicitacao1);

//        almox1.setSolicitacao(solicitacao2);
//        almox1.pedidoRecebido(solicitacao2);

//        Metodo para colocar o produto em separação
        almox1.pedidoEmSeparacao(funcionario1, solicitacao1);
//        almox1.pedidoEmSeparacao(funcionario2, solicitacao2);

//        Digite "sim" para confirmar a entrega do produto ou "nao" para não confirmar a entrega.
//        Observe a mensagem que vem pelo metodo State
        funcionario1.pedidoEntregue("sim");

    }
}
