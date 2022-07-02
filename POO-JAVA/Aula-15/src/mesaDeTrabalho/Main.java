package mesaDeTrabalho;

public class Main {
    public static void main(String[] args) {
        Capitao capitao1 = new Capitao("Eduardo", "Ananias", 1234);
        Capitao capitao2 = new Capitao("Pedro", "Pinheiro", 5678);

        Iates iate1 = new Iates(5, 1000.00, 2000, 100.0f, capitao1);
        Iates iate2 = new Iates(5, 250.00, 2022, 50.0f, capitao2);

        Veleiros veleiro1 = new Veleiros(5, 500.00, 2003, 20.2f, capitao1);
        Veleiros veleiro2 = new Veleiros(2, 200.00, 2020, 10.2f, capitao2);

        System.out.println(veleiro1.toString());

        System.out.println(iate1.toString());


    }
}
