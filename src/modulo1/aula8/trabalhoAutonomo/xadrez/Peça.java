package modulo1.aula8.trabalhoAutonomo.xadrez;

public abstract class Peça {
    protected int h;
    protected int v;
    protected String[] movimentos;

    public Peça(int h, int v) {
        this.h = h;
        this.v = v;

    }

    public abstract void movimentosPossiveis();
}
