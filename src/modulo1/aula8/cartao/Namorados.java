package modulo1.aula8.cartao;

public class Namorados extends CartaoPresente {

    public Namorados(String destinatario) {
        super(destinatario);
    }

    public void showMessage() {

        System.out.println(destinatario + ", feliz dia dos namorados");

    }
}
