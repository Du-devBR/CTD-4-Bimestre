package ExercicioGuiado;

public class ImpressoraCannon extends Impressora{
    @Override
    public String imprimir() {
        if (temPapel() == true && precisaTinta() == true){
            return "imprimindo da impressora Epson... \n" +
                    "Modelo: " + getModelo();
        } else if (temPapel() == false && precisaTinta() == true) {
            return "Impressora" + getModelo() + " sem papel";
        } else if (temPapel() == true && precisaTinta() == false) {
            return "Impressora " + getModelo() + " com baixo nivel de tinta!!!";
        }else {
            return "Impressora " + getModelo() + " está sem papel e com baixo nivel de tinta!!!";
        }
    }
}
