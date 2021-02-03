package modulo1.aula8.cartao;

public class Teste {

    public static void main(String[] args) {

        Aniversario data = new Aniversario("Miguel", 01-20-20);
        Natal natal = new Natal("Miguel");
        Namorados namorados = new Namorados("Miguel");


        data.showMessage();
        natal.showMessage();
        namorados.showMessage();
    }
}
