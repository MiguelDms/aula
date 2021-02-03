package modulo1.aula8.cartao;

public class Aniversario extends CartaoPresente {

    private int data;

    public Aniversario(String destinatario, int data) {
        super(destinatario);
        this.data = data;
    }

    public void showMessage() {

        System.out.println(destinatario + ", hoje é " + data + ", feliz aniversário!");

    }


}
