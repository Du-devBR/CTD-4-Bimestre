package exemploBanco;

public class Main {
    public static void main(String[] args){
//        1° Objeto
        Cliente cliente1 = new Cliente(777777, "Eduardo");
        System.out.println(cliente1.getDivida(0));
        System.out.println(cliente1.getNome());
        cliente1.aumentarDivida(0);
        cliente1.pagarDivida(1300.0);

//        2° Objeto
        Cliente cliente2 = new Cliente(111111, "Camila");
        System.out.println(cliente2.getNome());
        cliente2.aumentarDivida(100);
    }
}
