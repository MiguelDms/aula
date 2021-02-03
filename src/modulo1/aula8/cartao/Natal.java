package modulo1.aula8.cartao;

public class Natal extends CartaoPresente {

    public Natal(String destinatario) {
        super(destinatario);
    }

    public void showMessage() {

        System.out.println(destinatario + ", feliz dia de Natal");

    }
}
