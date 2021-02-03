package modulo1.aula8.cartao;

public abstract class CartaoPresente {

    protected String destinatario;

    public CartaoPresente(String destinatario) {
        this.destinatario = destinatario;
    }

    public abstract void showMessage();
}
